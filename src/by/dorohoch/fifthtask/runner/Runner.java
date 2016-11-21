package by.dorohoch.fifthtask.runner;

import by.dorohoch.fifthtask.parsing.GemsDOMBuilder;
import by.dorohoch.fifthtask.parsing.GemsSAXBuilder;
import by.dorohoch.fifthtask.parsing.GemsStAXBuilder;

/**
 * Created by User on 18.11.2016.
 */
public class Runner {

    final static String DATA_XML="data/gems.xml";

    public static void main(String[] args) {
        GemsSAXBuilder saxBuilder = new GemsSAXBuilder();
        saxBuilder.buildSetGems(DATA_XML);
        System.out.println(saxBuilder.getGems());
        GemsDOMBuilder domBuilder = new GemsDOMBuilder();
        domBuilder.buildSetGems(DATA_XML);
        System.out.println(domBuilder.getGems());
        GemsStAXBuilder staxBuilder = new GemsStAXBuilder();
        staxBuilder.buildSetGems(DATA_XML);
        System.out.println(staxBuilder.getGems());
    }
}
