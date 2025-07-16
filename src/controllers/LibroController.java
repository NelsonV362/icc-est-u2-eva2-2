package controllers;

import java.util.*;

import models.Book;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparador = Comparator
                .comparing(Book::getTitulo, Comparator.reverseOrder())
                .thenComparing(Book::getAnio);
        Map<Book, Book> mapa = new TreeMap<>(comparador);
        for (Book libro : libros) {
            mapa.putIfAbsent(libro, libro); 
        }
        return mapa;}}
