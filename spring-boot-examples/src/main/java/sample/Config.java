package sample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.List;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@ConfigurationProperties
public class Config {

    @NestedConfigurationProperty
    private K1 k1 = new K1();

    public K1 getK1() {
        return k1;
    }

    public void setK1(K1 k1) {
        this.k1 = k1;
    }

    public static class K1 {

        private String string;
        private List<Integer> array;

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public List<Integer> getArray() {
            return array;
        }

        public void setArray(List<Integer> array) {
            this.array = array;
        }
    }
}
