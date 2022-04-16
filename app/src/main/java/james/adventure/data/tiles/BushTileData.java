package james.adventure.data.tiles;

import android.content.Context;

import james.adventure.data.PositionData;
import james.adventure.utils.TileUtils;

public class BushTileData extends TileData {

    public BushTileData(Context context, PositionData position) {
        super(context, TileUtils.TILE_BUSH, position);
    }

    @Override
    public void onTouch() {
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
