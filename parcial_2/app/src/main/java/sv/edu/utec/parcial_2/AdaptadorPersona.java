package sv.edu.utec.parcial_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
public class AdaptadorPersona extends ArrayAdapter<participante> {
    private Context mContext;
    private int mResource;
    public AdaptadorPersona(@NonNull Context context, int resource, @NonNull ArrayList<participante> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent, false);
        ImageView imageView = convertView.findViewById(R.id.img);
        TextView tnombre = convertView.findViewById(R.id.tnombre);
        TextView tcargo = convertView.findViewById(R.id.tcargo);
        TextView tcompany = convertView.findViewById(R.id.tcompany);
        imageView.setImageResource(getItem(position).getImagen());
        tnombre.setText(getItem(position).getNombre());
        tcargo.setText(getItem(position).getCargo());
        tcompany.setText(getItem(position).getCompany());
        return convertView;
    }
}
