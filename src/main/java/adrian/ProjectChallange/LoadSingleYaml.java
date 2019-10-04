package adrian.ProjectChallange;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;


public class LoadSingleYaml {
    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream in = LoadSingleYaml.class.getResourceAsStream("/firstYaml.yaml")) {
            Object obj = yaml.load(in);
            System.out.println("Loaded object type:" + obj.getClass());
            System.out.println(obj);
        }
    }
}