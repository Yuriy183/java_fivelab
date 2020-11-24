import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Example {

    public static Object byNameDesc;
    public static Object byNameAsc;
    public static Object byValueAsc;
    public static Object byValueDesc;
    private String addedTime;
    private String modifiedTime;
    private String title;
    private String alias;
    private String description;
    private String brand;
    private String manufacturer;
    private String mpn;
    private String msrp;
    private String aSIN;
    private String category;
    private Metadata metadata;
    private Object stores;
    private String barcode;
    private boolean success;
    private int timestamp;
    private Object images;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param modifiedTime
     * @param metadata
     * @param images
     * @param stores
     * @param description
     * @param mpn
     * @param title
     * @param manufacturer
     * @param success
     * @param msrp
     * @param addedTime
     * @param alias
     * @param aSIN
     * @param category
     * @param brand
     * @param barcode
     * @param timestamp
     */
    public Example(String addedTime, String modifiedTime, String title, String alias, String description, String brand, String manufacturer, String mpn, String msrp, String aSIN, String category, Metadata metadata, Object stores, String barcode, boolean success, int timestamp, Object images) {
        super();
        this.addedTime = addedTime;
        this.modifiedTime = modifiedTime;
        this.title = title;
        this.alias = alias;
        this.description = description;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.mpn = mpn;
        this.msrp = msrp;
        this.aSIN = aSIN;
        this.category = category;
        this.metadata = metadata;
        this.stores = stores;
        this.barcode = barcode;
        this.success = success;
        this.timestamp = timestamp;
        this.images = images;
    }

    public Example(String addedTime, String modifiedTime, String title, String alias, String description, String brand, String manufacturer, String mpn, String msrp, String aSIN, String category, String metadata, String stores, String barcode, String success, String timestamp, String images) {
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getMsrp() {
        return msrp;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public String getASIN() {
        return aSIN;
    }

    public void setASIN(String aSIN) {
        this.aSIN = aSIN;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Object getStores() {
        return stores;
    }

    public void setStores(Object stores) {
        this.stores = stores;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("addedTime", addedTime).append("modifiedTime", modifiedTime).append("title", title).append("alias", alias).append("description", description).append("brand", brand).append("manufacturer", manufacturer).append("mpn", mpn).append("msrp", msrp).append("aSIN", aSIN).append("category", category).append("metadata", metadata).append("stores", stores).append("barcode", barcode).append("success", success).append("timestamp", timestamp).append("images", images).append("additionalProperties", additionalProperties).toString();
    }

}