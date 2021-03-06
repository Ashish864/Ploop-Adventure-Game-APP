package james.adventure.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import james.adventure.R;
import james.adventure.data.PositionData;
import james.adventure.utils.StaticUtils;

public class MapTileAdapter extends RecyclerView.Adapter<MapTileAdapter.ViewHolder> {

    private Typeface typeface;
    private PositionData data;
    private int lengthX, lengthY;

    public MapTileAdapter(Context context, PositionData data, int lengthX, int lengthY) {
        this.data = data;
        this.lengthX = lengthX;
        this.lengthY = lengthY;
        typeface = StaticUtils.getTypeface(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_map_tile, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        View selected = holder.v.findViewById(R.id.selected);
        if (position / lengthX == data.getSceneY() && position % lengthX == data.getSceneX())
            selected.setVisibility(View.VISIBLE);
        else selected.setVisibility(View.INVISIBLE);

        TextView textView = holder.v.findViewById(R.id.number);
        textView.setTypeface(typeface);
        textView.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        return lengthX * lengthY;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public View v;

        public ViewHolder(View itemView) {
            super(itemView);
            v = itemView;
        }
    }
}
