package com.example.demo.resources.UTIL;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {
    public  static String decodeParam(String text){
        try {
            return URLDecoder.decode(text,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }

    }
}
