package james.adventure.data.tiles;

import android.content.Context;

import james.adventure.data.PositionData;
import james.adventure.utils.TileUtils;

public class TreeTileData extends TileData {

    public TreeTileData(Context context, PositionData position) {
        super(context, TileUtils.TILE_TREE, position);
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

    @Override
    public int getMaxLight() {
        return 1;
    }
}
