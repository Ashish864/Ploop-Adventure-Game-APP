package james.adventure.data.tiles;

import android.content.Context;

import james.adventure.R;
import james.adventure.data.PositionData;
import james.adventure.utils.TileUtils;

public class CheckpointTileData extends TileData {

    public CheckpointTileData(Context context, PositionData position) {
        super(context, TileUtils.TILE_CHECKPOINT, position);
    }

    @Override
    public void onTouch() {
        getMonochrome().makeDialog(
                getContext().getString(R.string.action_checkpoint),
                getContext().getString(R.string.msg_save),
                getContext().getString(R.string.action_save),
                (dialog, which) -> {
                    savePosition();
                    dialog.dismiss();
                },
                getContext().getString(R.string.action_cancel),
                (dialog, which) -> dialog.dismiss()
        );
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
