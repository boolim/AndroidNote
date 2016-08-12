package com.example.boolim.helloandroid.MainScreen;

/**
 * Created by boolim on 11/08/16.
 */
public class Note {
    private String title, message;
    private long noteId, dateCreatedMilli;
    private Category category;

    public enum Category {PERSONAL, TECHNICAL, QUOTE, FINANCE}

    public Note(String title, String message, Category category) {
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = 0;
        this.dateCreatedMilli = 0;
    }

    public Note(String title, String message, Category category, long noteId, long dateCreatedMilli) {
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = noteId;
        this.dateCreatedMilli = dateCreatedMilli;
    }
    public long getId()
    {
        return noteId;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Category getCategory() {
        return category;
    }

    public long getNoteId() {
        return noteId;
    }

    public long getDateCreatedMilli() {
        return dateCreatedMilli;
    }

    public String getBigTitle() {
        return categoryText(this.category);
    }

    public static String categoryText(Category cat) {
        switch (cat) {
            case PERSONAL:
                return "P";
            case TECHNICAL:
                return "T";
            case FINANCE:
                return "F";
            case QUOTE:
                return "Q";
        }

        return "N";
    }

}
