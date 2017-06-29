package iacademia.zonaldesk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Home_grid extends AppCompatActivity {

    GridView gridView;
    String [] values={
            "Plumbing",
            "Bricks",
            "Carpenter",
            "Furniture Repair",
            "Electricians",
            "Carpet Cleaners",
            "Driver Service",
            "Painters",
            "Pest Control",
            "Towing Service",
            "Nanny",
            "Editor(Photo,Video)",
            "Air Conditioner(Service)",
            "Tailor",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_grid);

        gridView = (GridView)findViewById(R.id.gridview);

        GridAdapter gridAdapter = new GridAdapter(this,values);

        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(getApplicationContext(), Queryform.class);
                startActivity(i);
            }
        });
    }
}
