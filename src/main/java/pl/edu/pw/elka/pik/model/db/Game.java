package pl.edu.pw.elka.pik.model.db;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Mikolaj on 2015-04-07.
 */
public class Game implements Serializable{

    private int id;
    private String username;
    private String name;
    private String description;
    private Set<Category> categories;
    private boolean wishList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public boolean isWishList() {
        return wishList;
    }

    public void setWishList(boolean wishList) {
        this.wishList = wishList;
    }
}
