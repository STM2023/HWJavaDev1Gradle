package goitpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Myname
{
    public static void main( String[] args )     {


        System.out.println( "test Gradle :" );

        Human student = new Human();
        student.name = "Tetiana";
        student.lastname="Stadnik";

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println( " "+new Gson().toJson(student));

    }
}