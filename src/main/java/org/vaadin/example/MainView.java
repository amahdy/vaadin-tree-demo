package org.vaadin.example;

import java.util.ArrayList;
import java.util.Collections;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin", shortName = "Project Base", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    public MainView() {
        /**
         * Generate random data
         */
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Person> p2 = new ArrayList<>();
        for(int i=1; i<11; i++) {
          Person person = new Person();
          person.setFirst("Person " + i);
          person.setId(i);
          persons.add(person);
        }
        for(int i=1; i<11; i++) {
          Person person = new Person();
          person.setFirst("Sub " + i);
          person.setId(i);
          p2.add(person);
        }

        /**
         * Add generated data to tree, with one subitems under "Person 5"
         */
        Tree<Person> tree = new Tree<>(Person::getFirst);
        tree.setItems(persons, p -> {
          if(p.getFirst().equals("Person 5")) {
            return p2;
          }else {
            return Collections.emptyList();
          }
        });
    
        add(tree);
    }
}
