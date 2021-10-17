package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import model.Book;
import model.BookFactury;
import model.InterfaceBookDataAcess;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
private EditText edtText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         spinner = findViewById(R.id.spinner);
         //Bind data source (i want to fill data in spinner in firs)
        //so i will make it in this (onCreate)
        populateSpinner();
        edtText = findViewById(R.id.edtText);
    }

    private void populateSpinner() {
        BookFactury factury = new BookFactury();
        InterfaceBookDataAcess objBook = factury.getModel();

        String[] cats = objBook.getCategories();

        ArrayAdapter<String>  adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter);//to fill data in spinner
    }


    public void btnGetBooksOnClick(View view) {
        BookFactury factury = new BookFactury();
        InterfaceBookDataAcess objBook = factury.getModel();
        String item = "";
        item = spinner.getSelectedItem().toString();
        List<Book> books= objBook.getBooks(item);
        String str = "";
        for (Book b : books){
            str+=b.getTitle() + "\n";


        }
        edtText.setText(str);
    }
}