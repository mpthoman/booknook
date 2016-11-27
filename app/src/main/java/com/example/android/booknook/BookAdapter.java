package com.example.android.booknook;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static android.R.attr.author;

/**
 * An {@link BookAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link Book} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books is the list of books, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    /**
     * Returns a list item view that displays information about a book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title_text_view);
        String titleSetText = titleSetText(currentBook.getTitle());
        // Display the title of the current book in that TextView
        titleView.setText(titleSetText);

        // Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author_text_view);
        String authorSetText = authorSetText(currentBook.getAuthor());
        // Display the author of the current book in that TextView
        authorView.setText(authorSetText);

        // Find the ImageView with view ID preview
        TextView urlView = (TextView) listItemView.findViewById(R.id.preview_view);
        String urlSetText = urlSetText(currentBook.getUrl());
        // Display the preview of the current book in that TextView
        urlView.setText(urlSetText);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    private String titleSetText(String title) {
        return title;
    }

    private String authorSetText(String author) {
        return author;
    }

    private String urlSetText(String url) {
        return url;
    }

}