package de.springboot.service;

import de.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static {
        items.add(
                new StackoverflowWebsite(
                        "https://www.santouka.co.jp/wp/wp-content/themes/santouka/img/home/icon-mark.png"
                        , "#1"
                        , "http://www.google.com"
                        , "google"
                        , "google home page"));

        items.add(
                new StackoverflowWebsite(
                        "https://www.santouka.co.jp/wp/wp-content/themes/santouka/img/home/icon-mark.png"
                        , "#2"
                        , "http://www.yandex.ru"
                        , "yandex"
                        , "yandex home page"));

        items.add(
                new StackoverflowWebsite(
                        "https://www.santouka.co.jp/wp/wp-content/themes/santouka/img/home/icon-mark.png"
                        , "#3"
                        , "http://www.mail.ru"
                        , "mail.ru"
                        , "mail.ru home page"));

        items.add(
                new StackoverflowWebsite(
                        "https://www.santouka.co.jp/wp/wp-content/themes/santouka/img/home/icon-mark.png"
                        , "#4"
                        , "https://www.sputnik.ru/"
                        , "sputnik"
                        , "sputnik home page"));

        items.add(
                new StackoverflowWebsite(
                        "https://www.santouka.co.jp/wp/wp-content/themes/santouka/img/home/icon-mark.png"
                        , "#5"
                        , "https://www.rambler.ru/"
                        , "rambler"
                        , "rambler home page"));

    }
    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
