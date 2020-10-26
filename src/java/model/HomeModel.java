/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ThangCoi
 */
public class HomeModel {
    private int id;
    private String title;
    private String description;
    private String type;
    private String image;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getImage() {
        return image;
    }

    public HomeModel(int id, String title, String description, String type, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.image = image;
    }

    public HomeModel() {
    }
    
    
}
