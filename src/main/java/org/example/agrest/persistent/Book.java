package org.example.agrest.persistent;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

public class Book extends CayenneDataObject {

//    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> AUTHOR = Property.create("author", String.class);
    public static final Property<String> TITLE = Property.create("title", String.class);
    public static final Property<Category> CATEGORY = Property.create("category", Category.class);

//    public void setAuthor(String author) {
//        writeProperty("author", author);
//    }
//    public String getAuthor() {
//        return (String)readProperty("author");
//    }
//
//    public void setTitle(String title) {
//        writeProperty("title", title);
//    }
//    public String getTitle() {
//        return (String)readProperty("title");
//    }
//
//    public void setCategory(Category category) {
//        setToOneTarget("category", category, true);
//    }
//
//    public Category getCategory() {
//        return (Category)readProperty("category");
//    }

}
