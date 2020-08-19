/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produc_category;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TK
 */
public class Produc_Category {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Category> cateList = new ArrayList<>();
        ArrayList<Product> productList = new ArrayList<>();
        addCategory(cateList);
        addProduct(productList);
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        name = sc.nextLine();
        Search(productList, name);
        
        
        
    }
    static void addCategory(ArrayList<Category> cateList){ //them category
        Category cate1 = new Category();
        cate1.setName("May Tinh");
        cate1.setTag("mt");
        cateList.add(cate1);
        
        Category cate2 = new Category();
        cate2.setName("Dien Lanh");
        cate2.setTag("dl");
        cateList.add(cate2);        
    }
    static void addProduct(ArrayList<Product> productList){ //them product
        Product product1 = new Product();
        product1.setName("May tinh xach tay A");
        product1.setCategory_tag("mt");
        productList.add(product1);
        
        Product product2 = new Product();
        product2.setName("Laptop X");
        product2.setCategory_tag("mt");
        productList.add(product2);
        
        Product product3 = new Product();
        product3.setName("PC 2");
        product3.setCategory_tag("mt");
        productList.add(product1);
        
        Product product4 = new Product();
        product4.setName("Ultrabook ez");
        product4.setCategory_tag("mt");
        productList.add(product4);
        
        Product product5 = new Product();
        product5.setName("Tu lanh e");
        product5.setCategory_tag("dl");
        productList.add(product5);
        
        Product product6 = new Product();
        product6.setName("Dieu hoa nhiet do B");
        product6.setCategory_tag("dl");
        productList.add(product6);
    }
    
    static void Search(ArrayList<Product> productList, String tag){
        boolean check = false;
        System.out.println("Output: ");
        for(int i=0; i<productList.size(); i++){
            if(tag.equals(productList.get(i).getCategory_tag())){
                System.out.println(productList.get(i).getName());
                check = true;
            }
        }
        if(check!=true){
            System.out.println("No data");
        }
    }
}
