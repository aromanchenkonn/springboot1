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
                        , "stackoverflow"
                        , "https://www.google.com"
                        , "#1 name"
                        , "#1 link"));
    }
    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
