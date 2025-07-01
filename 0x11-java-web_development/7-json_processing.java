// File: 7-json_processing.java
// Description: Parsing and generating JSON using Jackson

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

class Person {
    public String name;
    public int age;
}

public class JsonProcessingExample {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Convert Java Object to JSON
        Person person = new Person();
        person.name = "John";
        person.age = 30;
        String json = mapper.writeValueAsString(person);
        System.out.println("Serialized JSON: " + json);

        // Convert JSON to Java Object
        String jsonInput = "{\"name\":\"Alice\",\"age\":25}";
        Person parsedPerson = mapper.readValue(jsonInput, Person.class);
        System.out.println("Deserialized Name: " + parsedPerson.name);
    }
}
