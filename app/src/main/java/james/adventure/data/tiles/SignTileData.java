package james.adventure.data.tiles;

import android.content.Context;

import james.adventure.data.PositionData;
import james.adventure.utils.MapUtils;
import james.adventure.utils.TileUtils;

public class SignTileData extends TileData {

    public SignTileData(Context context, PositionData position) {
        super(context, TileUtils.TILE_SIGN, position);
    }

    @Override
    public void onTouch() {
        getMonochrome().makeToast(MapUtils.getMessage(getContext(), getPosition()));
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
    public int getLight() {
        return 1;
    }
}
