package me.alpho320.fabulous.exchange;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;

public class PAPI extends PlaceholderExpansion {

    @Override
    public String getAuthor() {
        return "Alpho320#9202";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getIdentifier(){
        return "borsa"; 
    }

    @Override
    public String onRequest(OfflinePlayer player, String identifier) {

        // %borsa_durum%
        if(identifier.equals("durum")){
            try {
                return Main.getInstance().usd;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return "6.40";
    }

}
