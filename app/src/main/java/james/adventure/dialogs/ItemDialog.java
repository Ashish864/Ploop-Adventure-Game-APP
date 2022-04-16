package james.adventure.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import james.adventure.R;
import james.adventure.data.items.ItemData;
import james.adventure.views.TileView;

public class ItemDialog extends AlertDialog {

    private ItemData item;

    public ItemDialog(Context context, ItemData item) {
        super(context);
        this.item = item;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_item);

        ((TileView) findViewById(R.id.tile)).setTile(item.getTile());

        TextView title = findViewById(R.id.title);
        title.setText(item.getName());

        TextView description = findViewById(R.id.description);
        description.setText(item.getDescription());
    }
}
