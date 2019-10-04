package adrian.ProjectChallange;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;


public class LoadManyYaml {
    public static void main(String[] args) throws IOException {
        loadFromFile("/manyPersonsYaml.yaml");
    }

    private static void loadFromFile(String path) throws IOException {
        System.out.printf("-- loading from %s --%n", path);
        Yaml yaml = new Yaml();
        try (InputStream in = LoadManyYaml.class.getResourceAsStream(path)) {
            Iterable<Object> itr = yaml.loadAll(in);
            System.out.println("-- iterating loaded Iterable --");
            for (Object o : itr) {
                System.out.println("element type: " + o.getClass());
                System.out.println(o);
            }
        }
    }

    private static void splitMethod() {
        // First i need to load file to object
        // Second to Map
        // Then just split it to seperate Strings and look for endPoint (RegEx)
    }

    private static void convertToJson() {
        // jsonString = {
        //  "name" : "Ronaldo",
        //  "sport" : "soccer",    -- Some random Json File
        // }

        //endpoint: /api/user/\\d+
        //firstName: "Adrian"  -- My firstYaml
        //lastName: "Romanski"
        //age: 25

    }
}
