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
public class ServiceModel {
    private int id;
    private String title;
    private String content;
    private String type;
    private String image;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ServiceModel(int id, String title, String content, String type, String image) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.image = image;
    }

    public ServiceModel() {
    }
    
    
}
