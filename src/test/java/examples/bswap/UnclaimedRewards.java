package examples.bswap;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public class UnclaimedRewards {
    private static final Logger logger = LoggerFactory.getLogger(UnclaimedRewards.class);
    public static void main(String[] args) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().unclaimedRewards(parameters);
        logger.info(result);
    }
}
