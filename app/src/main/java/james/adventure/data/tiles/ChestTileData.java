package james.adventure.data.tiles;

import android.content.Context;

import james.adventure.data.PositionData;
import james.adventure.utils.TileUtils;

public class ChestTileData extends TileData {

    public ChestTileData(Context context, PositionData position) {
        super(context, TileUtils.TILE_CHEST, position);
    }

    @Override
    public void onTouch() {
        getMonochrome().onOpenChest();
        setTile(TileUtils.TILE_CHEST_OPEN);
    }

    @Override
    public void onCloseChest() {
        setTile(TileUtils.TILE_CHEST);
    }

    @Override
    public void onEnter() {
    }

    @Override
    public void onExit() {
    }

    @Override
    public boolean canEnter() {
        return false;
    }
}
