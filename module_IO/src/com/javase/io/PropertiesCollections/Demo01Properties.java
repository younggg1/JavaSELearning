package com.javase.io.PropertiesCollections;

import java.util.Properties;
import java.util.Set;
/*使用场景:配合配置文件使用
注意:
将来我们不能将很多的硬数据放到源码中,比如用户名和密码这些数据,
因为将来我们有可能换用户名或者密码,如果一换,我们就需要去源码中修改,
将来我们的类和类之间都有联系,有可能牵一发动全身,所以我们需要将这些数据提取出来,
放到文件中,改的时候直接去文件中改,源码不需要改动*/
public class Demo01Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username","root");
        properties.setProperty("password","1234");

        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(properties.getProperty(key));
        }
    }
}
