package org.zx.tools.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;

public class XmlUtil {

    /**返回xml节点的值 dom4j处理方法
     *  String root = ".//xml//database[@id='"+dbServer+"']/";
     *  String name = "username"
     * @param  document
     * @param root
     * @param name
     * @return
     */
    public static String getNodeValue(Document document,String root,String name){

        Node node = document.selectSingleNode(root +name );
        if(node != null)
        return node.getText();
        else
             return "";
    }

    /**
     * 根据节点取属性.//xml//table[@id='hr_emp_category']//column[@id='code']
     * @param document
     * @param root
     * @param name
     * @return
     */
    public static String getNodePValue(Document document,String root,String name){
        Node node = document.selectSingleNode(root  );
        if(node != null){
            Element e =(Element)node;
            return e.attribute(name).getText();
        }
        else return ""
       ;
    }
}
