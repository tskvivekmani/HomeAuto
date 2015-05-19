/*
 *This is the adapter used for GridView 

public class MyAdapter extends BaseAdapter {
 
       private Context mContext;
 
       public MyAdapter(Context c) {
           mContext = c;
       }
 
       @Override
       public int getCount() {
           return mThumbIds.length;
       }
 
       @Override
       public Object getItem(int arg0) {
           return mThumbIds[arg0];
       }
 
       @Override
       public long getItemId(int arg0) {
           return arg0;
       }
 
       @Override
       public View getView(int position, View convertView, ViewGroup parent) {
 
           View grid;
 
           if(convertView==null){
               grid = new View(mContext);
               LayoutInflater inflater=getLayoutInflater();
               grid=inflater.inflate(R.layout.grid, parent, false);
           }else{
               grid = (View)convertView;
           }
 
           ImageView imageView = (ImageView)grid.findViewById(R.id.image);
           imageView.setImageResource(mThumbIds[position]);
 
           return grid;
       }
 
   }
