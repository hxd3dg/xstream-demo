package com.example.demo;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author Mr.Y z
 * @Date 2020/12/3 14:19
 * @ClassName Test
 */
public class Test {
    public static void main(String[] args) {
        String str="<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<response>\n" +
                "\n" +
                "    <flag>success</flag>\n" +
                "\n" +
                "    <code>0</code>\n" +
                "\n" +
                "    <message>旺店通WMS返回：订单流水查询成功</message>\n" +
                "\n" +
                "    <orderProcess>\n" +
                "\n" +
                "        <orderCode>ckd_test_y_3</orderCode>\n" +
                "\n" +
                "        <orderType>1</orderType>\n" +
                "\n" +
                "        <warehouseCode>warehouse_qhl</warehouseCode>\n" +
                "\n" +
                "        <processes>\n" +
                "\n" +
                "            <process>\n" +
                "\n" +
                "                <processStatus>DELIVERED</processStatus>\n" +
                "\n" +
                "                <operatorName>qhl</operatorName>\n" +
                "\n" +
                "                <operateTime>2018-03-29 15:19:15</operateTime>\n" +
                "\n" +
                "            </process>\n" +
                "            <process>\n" +
                "\n" +
                "                <processStatus>DELIVERED1</processStatus>\n" +
                "\n" +
                "                <operatorName></operatorName>\n" +//无值
                "\n" +
                //"                <operateTime>2018-03-29 15:19:15</operateTime>\n" +//无标签
                "\n" +
                "            </process>\n" +
                "\n" +
                "        </processes>\n" +
                "\n" +
                "    </orderProcess>\n" +
                "\n" +
                "</response>";

        Response response = XmlUtil.toBean(str, Response.class);
        String s = XmlUtil.toXml(response);
        System.out.println(JSONObject.toJSONString(response));
        System.out.println(s);

    }
}
