package james.adventure.utils;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import james.adventure.R;
import james.adventure.data.PositionData;
import james.adventure.data.items.KeyItemData;
import james.adventure.data.quests.QuantityQuestData;
import james.adventure.data.quests.QuestData;

public class QuestUtils {

    public static List<QuestData> getQuests(Context context) {

        return new ArrayList<>(Arrays.asList(
                new QuantityQuestData(context, context.getString(R.string.quest_title_apples),
                        context.getString(R.string.quest_desc_apples),
                        context.getString(R.string.quest_complete_apples),
                        ItemUtils.KEY_ITEM_APPLE, 10),

                new QuantityQuestData(context, context.getString(R.string.quest_title_more_apples),
                        context.getString(R.string.quest_desc_more_apples),
                        context.getString(R.string.quest_complete_more_apples),
                        ItemUtils.KEY_ITEM_APPLE, 15),

                new QuantityQuestData(context, context.getString(R.string.quest_title_pumpkins),
                        context.getString(R.string.quest_desc_pumpkins),
                        context.getString(R.string.quest_complete_pumpkins),
                        ItemUtils.KEY_ITEM_PUMPKIN, 4)
                        .setReward(new KeyItemData(context, (PositionData) null))
        ));
    }

}
