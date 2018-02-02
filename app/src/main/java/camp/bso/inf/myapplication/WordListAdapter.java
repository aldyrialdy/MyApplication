package camp.bso.inf.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by aldyrialdy on 31/01/18.
 */

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
//    private final LinkedList<String> mWordListHome;
//    private final LinkedList<String> mWordListAway;

    Context mContext;
    TeamListOpenHelper mDB;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context, TeamListOpenHelper db) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mDB = db;
//        this.mWordListHome = wordList1;
//        this.mWordListAway = wordList2;
    }

    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.item_team, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
            ItemTeam current = mDB.query(position);
            holder.wordItemView1.setText(current.getTeamHome());
            holder.wordItemView2.setText(current.getTeamAway());

//        String mCurrent1 = mWordListHome.get(position);
//        String mCurrent2 = mWordListAway.get(position);
//        holder.wordItemView1.setText(mCurrent1);
//        holder.wordItemView2.setText(mCurrent2);
    }

    @Override
    public int getItemCount() {
        return (int) mDB.count();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView wordItemView1;
        public final TextView wordItemView2;

        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView1 = (TextView) itemView.findViewById(R.id.word1);
            wordItemView2 = (TextView) itemView.findViewById(R.id.word2);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
//            //	Get	the	position	of	the	item	that	was	clicked.
//            int mPosition = getLayoutPosition();
//
//            //	Use	that	to	access	the	affected	item	in	mWordList.
//            String element = mWordListHome.get(mPosition);
//
//            //	Change	the	word	in	the	mWordList.
//            mWordListHome.set(mPosition, "Clicked!	" + element);
//
//            //	Notify	the	adapter,	that	the	data	has	changed	so	it	can
//            //	update	the	RecyclerView	to	display	the	data.
//            mAdapter.notifyDataSetChanged();
        }
    }

}
