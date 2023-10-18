/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Date;
import java.util.List;
import ma.project.entite.Produit;
import ma.project.service.ProduitService;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {
        Date date = new Date();
        ProduitService ps = new ProduitService();
         Produit pr = new Produit(88, "redmi", "F89DF9AEJZ3R8", "casa", date, 7000);
         ps.create(pr);
//         Date date =new Date("yyyy-MM-dd");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String da = sdf.format(date);
//        ProduitService ps = new ProduitService();
//        Produit pr0 = new Produit(88, "infinx", "373S8HS82", "rabat", date, 2590);
//        Produit pr0 = new Produit(0, "infinx", "373S8HS82", "rabat", date, 2590);
//        Produit pr1 = new Produit(1, "sumsung", "FNFNF8724RR3J", "london", date, 3745);
//        Produit pr2 = new Produit(2, "hwawei", "F89E89REJZ3J", "paris", date, 6354);
//        Produit pr3 = new Produit(3, "appelLe", "FJDJ5ADJO4589", "fes", date, 5000);
//        Produit pr4 = new Produit(4, "redmi", "F89DF9AEJZ3R8", "casa", date, 7355);
//        ps.create(pr0);
//        ps.create(pr1);
//        ps.create(pr2);
//        ps.create(pr3);
//        ps.create(pr4);
          List<Produit> list;
          list=ps.findAll();
         for (Object p : list) {
            System.out.println(p + "/n");
        }
         for (Produit p : list) {
             if(p.getPrix()>100)
            System.out.println("les produit au moins de 100DH:"+p + "/n");
        }
//        Produit pr3 = ps.findById(3);
//        Produit pr2 = ps.findById(2);
//       Produit pr1 = ps.findById(1);
//       System.out.println(pr2);
//         ps.delete(pr3);
//        int i;
//       i =(int) pr1.getPrix();
//        System.out.println(i);
//        pr1.setPrix(90) ;
//        ps.update(pr1);
//         i =(int) pr1.getPrix();
//        System.out.println(i);
//        ps.update(pr1);    
          for(Produit p : ps.findBetweenDate(new Date("2021/01/01"), new Date("2023/01/01"))){
            System.out.println(p.getReference());
        }
    }
}
