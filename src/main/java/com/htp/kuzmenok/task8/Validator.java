package com.htp.kuzmenok.task8;

public class Validator {

    Validator () {}



    public static Boolean userCheck (User u) {
        int passLength = 8;
       try {
           if (!u.getEmail().contains("@")) throw new CustomEmailException("CustomEmailException");
           if (u.getLogin().isEmpty()) throw new CustomLoginException("CustomLoginException");
           if (String.valueOf(u.getPassword()).length() > passLength ) throw new CustomPasswordException("CustomPasswordException");
           System.out.println("Registration approved");
       } catch (CustomEmailException e) {
           System.out.println("Email has to contain '@'-symbol\nTry again");
       } catch (CustomLoginException e) {
           System.out.println("Login should consist of one character at list\nTry again");
       } catch (CustomPasswordException e) {
           System.out.println("Password can't be bigger than '8' symbols\nTry again");
       }


   return true;
    }





}


