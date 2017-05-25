package com.example.miguel.cookiemaker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Miguel on 23/05/2017.
 */

public class ListadoRecetasAdapter extends BaseAdapter {

    private List<Receta> mReceta;
    private LayoutInflater mInflater;

    public ListadoRecetasAdapter(Context context, List<Receta> recetas) {
        mReceta = recetas;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mReceta.size();
    }

    @Override
    public Object getItem(int i) {
        return mReceta.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewholder;
        if (view==null){
            view=mInflater.inflate(R.layout.lista_recetas,viewGroup,false);
            viewholder=new ViewHolder();
            viewholder.nombreReceta=(TextView) view.findViewById(R.id.nombreReceta);
            viewholder.nombreUsuario=(TextView) view.findViewById(R.id.nombreUsuario);

            view.setTag(viewholder);
        }else{
            viewholder=(ViewHolder) view.getTag();
        }

        Receta receta=mReceta.get(i);
            viewholder.nombreReceta.setText(receta.getNombre());
            viewholder.nombreUsuario.setText(receta.getUsuario());

        return view;
    }

    class ViewHolder{
        TextView nombreReceta;
        TextView nombreUsuario;

    }
}
