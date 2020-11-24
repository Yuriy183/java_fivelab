import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Metadata {

    private String age;
    private String msrp;
    private String size;
    private String unit;
    private String color;
    private String gender;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Metadata() {
    }

    /**
     *
     * @param unit
     * @param size
     * @param color
     * @param gender
     * @param msrp
     * @param age
     */
    public Metadata(String age, String msrp, String size, String unit, String color, String gender) {
        super();
        this.age = age;
        this.msrp = msrp;
        this.size = size;
        this.unit = unit;
        this.color = color;
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMsrp() {
        return msrp;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("age", age).append("msrp", msrp).append("size", size).append("unit", unit).append("color", color).append("gender", gender).append("additionalProperties", additionalProperties).toString();
    }
}
