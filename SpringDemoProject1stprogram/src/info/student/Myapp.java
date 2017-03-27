package info.student;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Myapp {

	public static void main(String[] args)
	{
// org.springframework.beans.factory.BeanFactory is an interface.wecannot create object directly
		//so we are taking help of implementation class and creating the object.defaultlistbeanfactory is implementatn
		//class.so we created beanfactorycontainer.
		//
		DefaultListableBeanFactory container=new DefaultListableBeanFactory();
		//it will create an empty object..
		System.out.println(container);
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(container);
		//it will create an empty object.
		System.out.println(reader);
		
		
		reader.loadBeanDefinitions("springBean.xml");
		/*loading the xml file from classpath,file availbele it is read or not availble it will throws an 
		exception 
		Exception in thread "main" org.springframework.beans.factory.BeanDefinitionStoreException:
		 IOException parsing XML document from class path resource [spring.xml]; 
		nested exception is java.io.FileNotFoundException: 
		class path resource [spring.xml] cannot be opened because it does not exist
		
		*/

		System.out.println(container);
		Object object= container.getBean("Person");
		/*
		 * whenever we call getbean(),container will create the get bean person object,
		 * 
		 * container will create only one object,when the object is created for only onetime 
		 * is called singleton.the spring maintain defaultly singleton design pattern.
		 * 
		 * 
		 */
		
		
	
		Person person=(Person)object;
		person.display();
	}

}
