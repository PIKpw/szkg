package pl.edu.pw.elka.pik.model.db;

import java.io.Serializable;

/**
 * Created by mastah on 2015-05-26.
 */
public class Category implements Serializable {
    private int id = 0;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
