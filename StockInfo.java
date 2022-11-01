import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class StockInfo {
    // @JsonProperty("Meta Data")
    // private String metaData;
    // @JsonProperty("Time Series (5min)")
    // private String timeSeries;

    @SerializedName("Meta Data")
    StockInfo metaData;

    @SerializedName("Time Series (5min)")
    StockInfo timeSeries;

    @SerializedName("3. Last Refreshed")
    String last;
    

    public StockInfo getM() { return metaData; }
    // public String getT() { return timeSeries; }
    public String getL() { return last; }

}
