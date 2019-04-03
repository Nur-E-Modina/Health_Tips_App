package com.tj.myspinner;
import java.util.ArrayList;
import java.util.List;

public class Health_details {
    List<String> gettype(String spinner) {
        List<String> type = new ArrayList<String>();
        if (spinner.equals("High_Blood_Pressure")) {
            type.add("Five foods which reduce High Blood Pressure :\n1.Berries\n2.Red beets\n3.Skim milk & yogurt\n4.Oatmeal\n5.Bananas");
        }
            if (spinner.equals("High_Cholesterol")) {
                type.add("Five foods which reduce High_Cholesterol:\n 1.Oats\n2.Barley & Other whole grains\n3.Beans\n4.Egg plants & okra\n5.Nuts ");
            }
        if (spinner.equals("Heart_Attack")) {
            type.add("Five foods which reduce Heart_Attack:\n1.Salmon fish\n2.Oatmeal\n3.Blueberries\n4.Dark Chocolate\n5.Potatoes");
        }
        if (spinner.equals("Diabetes")) {
            type.add("Five foods which reduce Diabetes:\n1.Fatty Fish\n2.Leafy Greens\n3.Cinnamon\n4.Eggs\n5.Nuts");
        }

        return type;

    }

}