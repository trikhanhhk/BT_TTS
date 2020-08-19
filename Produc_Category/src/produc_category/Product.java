/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produc_category;

/**
 *
 * @author TK
 */
public class Product implements Comparable<Product>{
    private String name, category_tag;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory_tag() {
        return category_tag;
    }

    public void setCategory_tag(String category_tag) {
        this.category_tag = category_tag;
    }

    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.name);
    }
    
}
