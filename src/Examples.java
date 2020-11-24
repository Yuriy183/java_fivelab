import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Examples {
    public static Comparator<? super Example> byValueDesc;
    public static Comparator<? super Example> byValueAsc;
    public static Comparator<? super Example> byNameDesc;
    public static Comparator<? super Example> byNameAsc;

    public ArrayList<Example> getExamples() {
        return examples;
    }

    public Examples(ArrayList<Example> examples) {
        this.examples = examples;
    }

    public void setRates(ArrayList<Example> examples) {
        this.examples = examples;
    }

    private ArrayList<Example> examples;

    public Examples() {
        examples = new ArrayList<>();
    }

    public void add(Example examples) {
        this.examples.add(examples);
    }

    @Override
    public String toString() {
        String result = "Films (" + (new Date()).toLocaleString() + ") " + System.lineSeparator();
        for (Example c : examples) {
            result += c + System.lineSeparator();
        }
        return result;
    }


}