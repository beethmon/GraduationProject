package org.sl.shop.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.net.SocketServer;
import org.sl.shop.model.Commodity;
import org.sl.shop.model.Refund;
import org.sl.shop.model.Supplier;
import org.sl.shop.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/json")
public class JsonController extends BaseController {

    @Autowired public CommodityService commodityService;
    @Autowired public SupplierService supplierService;
    @Autowired public PurchaseOrderService purchaseOrderService;
    @Autowired public PurchaseOrderItemService purchaseOrderItemService;
    @Autowired public SalesOrderService salesOrderService;
    @Autowired public SalesOrderItemService salesOrderItemService;
    @Autowired public RefundService refundService;
    @Autowired public StockService stockService;
    @Autowired public StaffService staffService;

    @RequestMapping(value = "/commodity-{page}-{pagesize}", produces = "application/json")
    @ResponseBody
    public Map<String, Object> getCommodity(@PathVariable("page") int page,
                                            @PathVariable("pagesize") int pagesize,
                                            Commodity commodity) {
        PageHelper.startPage(page, pagesize);
        Page<Commodity> p = (Page<Commodity>) commodityService.getCommodity(commodity);
        return generationJsonMap(p);
    }

    @RequestMapping(value = "/supplier-{page}-{pagesize}", produces = "application/json")
    @ResponseBody
    public Map<String, Object> getSupplier(@PathVariable("page") int page,
                                            @PathVariable("pagesize") int pagesize,
                                            Supplier supplier) {
        PageHelper.startPage(page, pagesize);
        Page<Supplier> p = (Page<Supplier>)supplierService.getSupplier(supplier);
        return generationJsonMap(p);
    }

    @RequestMapping(value = "/supplierall-{page}-{pagesize}", produces = "application/json")
    @ResponseBody
    public Map<String, Object> getSupplierAll(@PathVariable("page") int page,
                                           @PathVariable("pagesize") int pagesize,
                                           Supplier supplier) {
        PageHelper.startPage(page, pagesize);
        Page<Supplier> p = (Page<Supplier>)supplierService.getSupplierAll(supplier);
        return generationJsonMap(p);
    }

}
