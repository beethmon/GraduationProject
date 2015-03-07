package org.sl.shop.service;

import java.util.Date;
import java.util.List;

import org.sl.shop.mapper.SalesOrderItemMapper;
import org.sl.shop.mapper.SalesOrderMapper;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.SalesOrder;
import org.sl.shop.model.SalesOrderItem;
import org.sl.shop.util.BeanTojson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SalesOrderService {
    @Autowired
    private SalesOrderMapper salesOrderMapper;
    @Autowired
    private SalesOrderItemMapper salesOrderItemMapper;
    @Autowired
    private CommodityService commodityService;

    @Transactional(readOnly = true)
    public List<SalesOrder> getSalesOrder(SalesOrder salesOrder) {
        return salesOrderMapper.getSalesOrder(salesOrder);
    }

    @Transactional(readOnly = true)
    public List<SalesOrder> getSalesOrderAll(SalesOrder salesOrder) {
        return salesOrderMapper.getSalesOrderAll(salesOrder);
    }

    @Transactional
    public void addSalesOrder(SalesOrder salesOrder) {
        //获取当前时间
        Date date = new Date();
        //设置销售时间
        salesOrder.setPoDate(date);
        salesOrderMapper.addSalesOrder(salesOrder);
        //插入成功后会返回自增长id到对象内
        int soid = salesOrder.getSoid();
        List<SalesOrderItem> list = salesOrder.getItems();
        //处理详细单行
        if (null != list) {
            double soSum = 0;
            for (SalesOrderItem item : list) {
                //设置关联与日期
                item.setSoid(soid);
                item.setSoiDate(date);
                //获取信息 检查是否完整
                Commodity commodity = item.getComm();
                //假如为空 跳出 虽然不可能
                if(null==commodity)
                    break;
                //获取信息 检查是否完整
                double unitPrice = item.getUnitPrice();
                double num = item.getNum();
                double sum = item.getSum();
                //假如传过来的对象缺乏参数则去获取并设置
                if(unitPrice <= 0){
                    //假如传过来的对象缺乏参数则去获取并设置
                    if(commodity.getSales_price()<=0)
                        commodity = commodityService.getCommodity(commodity).get(0);
                    if(null==commodity)
                        break;
                    unitPrice = commodity.getSales_price();
                    item.setUnitPrice(unitPrice);
                }
                //计算总额
                if(sum <= 0){
                    sum = num*unitPrice;
                    item.setSum(sum);
                }
                soSum+=sum;
                salesOrderItemMapper.addSalesOrderItem(item);
                System.out.println(BeanTojson.beanToJson(item));
            }
            salesOrder.setSum(soSum);
            salesOrderMapper.updateSalesOrder(salesOrder);
        }
    }

    @Transactional
    public void updateSalesOrder(SalesOrder salesOrder) {
        salesOrderMapper.updateSalesOrder(salesOrder);
        List<SalesOrderItem> list = salesOrder.getItems();
        if (null != list) {
            for (SalesOrderItem item : list) {
                salesOrderItemMapper.updateSalesOrderItem(item);
            }
        }
    }

    @Transactional
    public boolean deleteSalesOrder(SalesOrder salesOrder) {
        List<SalesOrderItem> list = salesOrder.getItems();
        if (list != null && list.size() > 0) {
            for (SalesOrderItem item : list) {
                salesOrderItemMapper.deleteSalesOrderItem(item);
            }
        }
        salesOrderMapper.deleteSalesOrder(salesOrder);
        return true;
    }
}
