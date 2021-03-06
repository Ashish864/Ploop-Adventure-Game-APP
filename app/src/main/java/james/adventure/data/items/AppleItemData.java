package james.adventure.data.items;

import android.content.Context;

import james.adventure.R;
import james.adventure.data.PositionData;
import james.adventure.utils.ItemUtils;
import james.adventure.utils.TileUtils;

public class AppleItemData extends ItemData {

    public AppleItemData(Context context, boolean hasPickedUp, boolean isHolding) {
        super(context, TileUtils.TILE_APPLE, hasPickedUp, isHolding);
    }

    public AppleItemData(Context context, PositionData position) {
        super(context, TileUtils.TILE_APPLE, position);
    }

    @Override
    public String getName() {
        return getContext().getString(R.string.item_apple);
    }

    @Override
    public String getDescription() {
        return getContext().getString(R.string.item_apple_desc);
    }

    @Override
    String getId() {
        return ItemUtils.KEY_ITEM_APPLE;
    }

    @Override
    public String getKey() {
        return ItemUtils.KEY_ITEM_APPLE;
    }

    @Override
    public int getVolume() {
        return 5;
    }

    @Override
    boolean hasConstantPosition() {
        return false;
    }

    @Override
    public void onUse() {
    }
}
