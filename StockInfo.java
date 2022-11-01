
import com.google.gson.annotations.SerializedName;


public class StockInfo {

    @SerializedName("Meta Data")
    StockInfo metaData;

    @SerializedName("Time Series (5min)")
    Object timeSeries;

    @SerializedName("3. Last Refreshed")
    Object last;
    

    public StockInfo getM() { return metaData; }
    // public Object getT() { return timeSeries; }
    public Object getL() { return last; }

}
