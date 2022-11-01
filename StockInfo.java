import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StockInfo {
    // @JsonProperty("Meta Data")
    // private String metaData;
    // @JsonProperty("Time Series (5min)")
    // private String timeSeries;

    @SerializedName("Meta Data")
    public String metaData;

    @SerializedName("Time Series (5min)")
    public String timeSeries;

    public String getM() { return metaData; }
    public String getT() { return timeSeries; }
}
