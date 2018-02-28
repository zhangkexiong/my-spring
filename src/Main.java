import beans.BeanDefinition;
import beans.factory.AbstractBeanFactory;
import beans.factory.AutowireCableBeanFactory;
import beans.io.ResourceLoader;
import beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception{
        //初始化 bean 容器
        AbstractBeanFactory beanFactory = new AutowireCableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinition("tinyioc.xml");

        //装配定义的beanDefinition
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();

    }
}
