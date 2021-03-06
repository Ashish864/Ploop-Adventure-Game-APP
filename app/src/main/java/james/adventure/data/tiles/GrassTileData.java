package james.adventure.data.tiles;

import android.content.Context;

import james.adventure.data.PositionData;
import james.adventure.utils.TileUtils;

public class GrassTileData extends TileData {

    public GrassTileData(Context context, int thickness, PositionData position) {
        super(context, TileUtils.getRandomGrass(1, thickness), position);
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
        return true;
    }
}
