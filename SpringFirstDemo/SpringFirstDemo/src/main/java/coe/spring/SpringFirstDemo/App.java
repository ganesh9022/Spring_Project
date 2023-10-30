package coe.spring.SpringFirstDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "First Demo programming spring!" );
        
        ApplicationContext context =
        		new ClassPathXmlApplicationContext("Config.xml");
        Employee stud=(Employee) context.getBean("e1");
        System.out.println(stud);
    }
}
