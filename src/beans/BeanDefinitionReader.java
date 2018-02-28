package beans;

/**
 * 从配置文件中读取beanDefinition
 */
public interface BeanDefinitionReader {
    /**
     * 根据配置文件的路径读取
     * @param location
     */
    void loadBeanDefinition(String location) throws Exception;
}
