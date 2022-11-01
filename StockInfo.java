import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StockInfo {
    @JsonProperty("Meta Data")
    private String metaData;
    @JsonProperty("Time Series (5min)")
    private String timeSeries;

    public String getM() { return metaData; }
    public String getT() { return timeSeries; }
}
