package com.example.android.booknook;

/**
 * {@link Book} represents book data (author, title, image, and preview link of a book).
 * It contains resource IDs for the author, title, image, and preview link for each book.
 */
public class Book {

    /** String resource ID for the title of a book */
    private String mTitle;

    /** String resource ID for the author of a book */
    private String mAuthor;

    /** String resource ID for the preview link of a book */
    private String mUrl;

    /**
     * Create a new Book object.
     *
     * @param title is the string value for the title of a book
     * @param author is the string resource ID for the author of a book
     * @param url is the string resource ID for the preview link of a book
     */
    public Book(String title, String author, String url) {
        mTitle = title;
        mAuthor = author;
        mUrl = url;
    }

    /**
     * Gets and returns the string resource ID for the title of a book.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Gets and returns the string resource ID for the author of a book.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Gets and returns the string resource ID for the preview link of a book.
     */
    public String getUrl() {
        return mUrl;
    }

}
