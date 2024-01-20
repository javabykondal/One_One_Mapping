package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Transaction tx=null;
          try
          {
              Configuration cs =new Configuration();
              Properties ps=new Properties();
              ps.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
              ps.put(Environment.URL,"jdbc:mysql://localhost:3306/ hibernate");
              ps.put(Environment.USER,"root");
              ps.put(Environment.PASS,"kondalu309");
              ps.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
              ps.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
              ps.put(Environment.SHOW_SQL,"true");
              ps.put(Environment.HBM2DDL_AUTO,"update");
              cs.setProperties(ps);

              cs.addAnnotatedClass(Cust.class);
              cs.addAnnotatedClass(Address.class);


              StandardServiceRegistryBuilder sr=new StandardServiceRegistryBuilder();
              ServiceRegistry sm=sr.applySettings(cs.getProperties()).build();
              SessionFactory sessionFactory= cs.buildSessionFactory(sm);
              Session session=sessionFactory.openSession();
              tx=session.beginTransaction();

//              Cust c=session.load(Cust.class,1);
//              System.out.println(c);
//
//              Address adm=c.getAddress();
//              System.out.println(adm);
//              Cust cm=session.load(Cust.class,1);
//              session.delete(cm);


//              Cust cust=session.load(Cust.class,1);
//              Address address=session.load(Address.class,1);
//              cust.setAddress(address);

//              Cust stu2=new Cust("hiiiik",78999999,"hmmm");
//              session.save(stu2);
////
//              Address ad=new Address("hy",53445,"tsmd");
//              session.save(ad);
//              stu2.setAddress(ad);
////              Cust c= session.load(Cust.class,5);
////              c.setAddress(ad);

              tx.commit();
              session.close();

          }
          catch (Exception ex)
          {
              tx.rollback();
              ex.printStackTrace();

          }
    }
}