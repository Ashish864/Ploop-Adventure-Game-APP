package james.adventure.data.tiles;

import android.content.Context;

import james.adventure.data.PositionData;

public class FloorTileData extends TileData {

    public FloorTileData(Context context, int[][] tile, PositionData position) {
        super(context, tile, position);
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
