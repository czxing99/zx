package com.ax.freemarker;

import freemarker.template.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexOfMethod implements TemplateMethodModel {

    public TemplateModel exec(List args) throws TemplateModelException {
        if (args.size() != 2) {
            throw new TemplateModelException("Wrong arguments");
        }
        System.out.println( args.get(1));
        System.out.println(args.get(0));
       /*return new SimpleNumber(
                ((String) args.get(1)).indexOf((String) args.get(0)));*/
       SimpleHash s = new SimpleHash();
        Map m = new HashMap<String,String>();
        m.put("a",args.get(1).toString()+"我们"+args.get(0).toString());
        s.put("m1",m);
       return s;
    }
}