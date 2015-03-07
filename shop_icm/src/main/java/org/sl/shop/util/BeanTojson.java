package org.sl.shop.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by godoway on 2015/3/7.
 */
public class BeanTojson {

    public static String beanToJson(Object obj) {
        // 这里异常都未进行处理，而且流的关闭也不规范。开发中请勿这样写，如果发生异常流关闭不了
        ObjectMapper mapper = CommonUtil.getMapperInstance(false);
        JsonGenerator gen;
        String json = "json is null";
        try {
            StringWriter writer = new StringWriter();
            gen = new JsonFactory().createGenerator(writer);
            mapper.writeValue(gen, obj);
            gen.close();
            json = writer.toString();
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
        }
        return json;
    }
}
