import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Comparator;

public class Main
{
    private static Examples examples;

    public static void main(String[] args)
    {
        JSONGetter jsonGetter = new JSONGetter();
        JSONGetter.url = "https://api.upcdatabase.org/product/0111222333446?apikey=098f6bc22621d_demo_4de4e8326b4f6";
        jsonGetter.run();

        System.out.println("Waiting for data...");
        String jsonString = jsonGetter.jsonIn;
        System.out.println(jsonString);

        // Считываем json
        Object obj = null;
        try
        {
            obj = new JSONParser().parse(jsonString);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        System.out.println();

        JSONArray jsonArray = (JSONArray) obj;
        System.out.println(jsonArray.toJSONString());
        System.out.println();

        Metadata rates = new Metadata();

        for (Object jsonObject : jsonArray)
        {
            JSONObject current = (JSONObject) jsonObject;
            String addedTime = (String) current.get("addedTime");
            String modifiedTime = (String) current.get("modifiedTime");
            String title = (String) current.get("title");
            String alias = (String) current.get("alias");
            String description = (String) current.get("description");
            String brand = (String) current.get("brand");
            String manufacturer = (String) current.get("manufacturer");
            String mpn = (String) current.get("mpn");
            String msrp = (String) current.get("msrp");
            String aSIN = (String) current.get("aSIN");
            String category = (String) current.get("category");
            String metadata = (String) current.get("metadata");
            String stores = (String) current.get("stores");
            String barcode = (String) current.get("barcode");
            String success = (String) current.get("success");
            String timestamp = (String) current.get("timestamp");
            String images = (String) current.get("images");

            Example example = new Example(addedTime,modifiedTime,title,alias,description,brand,manufacturer,mpn,msrp, aSIN,category,metadata,stores,barcode,success,timestamp,images);
            examples.add(example);
        }

        System.out.println("Imported data after parsing:\n" + examples);
        System.out.println(examples);

        examples.getExamples().sort(Examples.byNameAsc);
        System.out.println("After sorting by name ascending:\n" + examples);
        examples.getExamples().sort(Examples.byNameDesc);
        System.out.println("After sorting by name descending:\n" + examples);

        examples.getExamples().sort(Examples.byValueAsc);
        System.out.println("After sorting by Buy value ascending:\n" + examples);
        examples.getExamples().sort(Examples.byValueDesc);
        System.out.println("After sorting by Buy value descending:\n" + examples);
    }
}
