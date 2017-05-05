package hello;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by han on 5/3/17.
 */

@Transactional
public class CustomerDaoImpl {

    @PersistenceContext
    private EntityManager em;
//
//    public void test() {
//        prepareData();
//        //List l = em.createQuery("SELECT d, m FROM Customer d, CreditCard m WHERE d = m.customer").getResultList();
//        List<Customer> l = em.createQuery("SELECT d FROM Customer d").getResultList();
//        for(Customer p : l) {
//            //printResult(p);
//            System.out.println(p);
//        }
//    }

//    private static void printResult(Object result) {
//        if (result == null) {
//            System.out.print("NULL");
//        } else if (result instanceof Object[]) {
//            Object[] row = (Object[]) result;
//            System.out.print("[");
//            for (int i = 0; i < row.length; i++) {
//                printResult(row[i]);
//            }
//            System.out.print("]");
//        } else if (result instanceof Long || result instanceof Double
//                || result instanceof String) {
//            System.out.print(result.getClass().getName() + ": " + result);
//        } else {
//            System.out.print(result);
//        }
//        System.out.println();
//    }

//    private void prepareData() {
//        //Customer d = new Customer("aaa@gmail.com","Chloe", "O'Brian","1 ave");
//        Customer d = new Customer();
//        d.setUemail("aaa@gmail.com");
//        d.setCname("XXX");
//        d.setPassword("123");
//        d.setAddress("adddddd");
//        em.persist(d);
//    }

//    public static void main(String[] args) {
//        CustomerDaoImpl a = new CustomerDaoImpl();
//
//        a.test();
//    }
}
