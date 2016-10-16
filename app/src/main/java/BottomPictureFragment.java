/**
 * Created by Raushan on 10/16/2016.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.fragment_10_16.R;

public class BottomPictureFragment extends Fragment{
    private static TextView topTextMeme;
    private static TextView bottomTextMeme;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragment, container,false);
        topTextMeme =(TextView)view.findViewById(R.id.topTextInput);
        bottomTextMeme = (TextView)view.findViewById(R.id.bottomTextInput);

        return view;
    }
    public void setTopTextMeme( String top, String bottom){
        topTextMeme.setText(top);
        bottomTextMeme.setText(bottom);

    }

}
