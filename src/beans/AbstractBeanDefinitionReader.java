package beans;

import beans.io.ResourceLoader;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    //用来存放beanDefinition
    private Map<String,BeanDefinition> registry = new ConcurrentHashMap<>();
    //资源加载器(在该类初始化的时候使用)
    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
