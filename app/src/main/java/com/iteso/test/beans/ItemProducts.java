package com.iteso.test.beans;

public class ItemProducts {
    private int image;
    private String title, store, location, phone, description;

    public ItemProducts() {
        this.image = 0;
        this.title = "";
        this.store = "";
        this.location = "";
        this.phone = "";
        this.description = "";
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getStore() {
        return store;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ItemProducts{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", store='" + store + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
