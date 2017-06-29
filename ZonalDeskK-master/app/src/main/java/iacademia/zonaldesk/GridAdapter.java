package iacademia.zonaldesk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import iacademia.zonaldesk.R;

/**
 * Created by sahil on 27/6/17.
 */

public class GridAdapter extends BaseAdapter {
    Context context;
    private final String[] values;
    View view;
    LayoutInflater layoutInflater;

    public GridAdapter (Context context,String[] values)
    {
        this.context=context;
        this.values=values;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null)
        {

            view=new View(context);
            view=layoutInflater.inflate(R.layout.single_item,null);

        }
        /*else
        {
            view=convertView;
        }*/

       // int z=R.drawable.button+position;
        ImageView imageView=(ImageView) view.findViewById(R.id.imageView);
        TextView textView=(TextView)view.findViewById(R.id.text);
        imageView.setImageResource(R.drawable.button);
        //imageView.setBackground(R.drawable.button);
        textView.setText(values[position]);
        return view;
    }
}
