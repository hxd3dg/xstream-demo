package com.example.demo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;

/**
 * @Author Mr.Y z
 * @Date 2020/12/3 19:48
 * @ClassName XmlUtil
 */
public class XmlUtil {

    /**
     * java 转换成xml
     *
     * @Title: toXml
     * @Description: TODO
     * @param obj
     *            对象实例
     * @return String xml字符串
     */
    public static String toXml(Object obj) {
        XStream xstream = new XStream(new DomDriver("utf-8", new XmlFriendlyReplacer("-_", "_")));
        // 如果没有这句，xml中的根元素会是<包.类名>；或者说：注解根本就没生效，所以的元素名就是类的属性
        xstream.processAnnotations(obj.getClass()); // 通过注解方式的，一定要有这句话
        return xstream.toXML(obj);
    }

    /*
     * 将传入xml文本转换成Java对象
     *
     * @Title: toBean
     *
     * @Description: TODO
     *
     * @param xmlStr
     *
     * @param cls xml对应的class类
     *
     * @return T xml对应的class类的实例对象
     *
     * 调用的方法实例：PersonBean person=XmlUtil.toBean(xmlStr, PersonBean.class);
     */
    public static <T> T toBean(String xmlStr, Class<T> cls) {
        // 注意：不是new Xstream(); 否则报错：java.lang.NoClassDefFoundError:
        // org/xmlpull/v1/XmlPullParserFactory
        // XStream xstream=new XStream(new DomDriver());
        XStream xstream = new XStream(new DomDriver("utf-8", new XmlFriendlyReplacer("-_", "_")));
        xstream.processAnnotations(cls);
        T obj = (T) xstream.fromXML(xmlStr);
        return obj;
    }
}
