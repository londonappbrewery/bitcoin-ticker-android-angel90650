package com.londonappbrewery.bitcointicker;
import org.json.JSONException;
import org.json.JSONObject;

import static com.loopj.android.http.AsyncHttpClient.log;

/**
 * Created by Castro on 09/09/2017.
 */

public class BitcoinModel {
    private int bPrice;

    public static BitcoinModel fromJson(JSONObject jsonObject){
        BitcoinModel bitcoinData = new BitcoinModel();
        try{
            log.d("Bitcoin", "bprice:" + jsonObject.getJSONObject("changes").getJSONObject("price").getInt("year"));
            bitcoinData.bPrice = jsonObject.getJSONObject("changes").getJSONObject("price").getInt("year");
            log.d("Bitcoin", "bprice:" + jsonObject.getJSONObject("changes").getJSONObject("price").getInt("year"));
            return bitcoinData;
        } catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public int getbPrice() {
        return (bPrice);
    }
}

