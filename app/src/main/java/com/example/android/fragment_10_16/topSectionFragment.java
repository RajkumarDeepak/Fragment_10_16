package com.example.android.fragment_10_16;

/**
 * Created by Raushan on 10/16/2016.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;


public class topSectionFragment extends Fragment {

    private static EditText topTextInput;
    private  static EditText bottomTextInput;
    TopSectionListner activityCommander;

    public interface TopSectionListner{
        public void createMeme(String top, String bottom);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try{

            activityCommander =(TopSectionListner)activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.top_section_layout, container,false);

        topTextInput = (EditText)view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText)view.findViewById(R.id.bottomTextInput);
        final Button button = (Button)view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View V){
                        buttonClicked(V);
                    }
                }
        );

        return view;
    }
    public void buttonClicked(View view){
        activityCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());

    }
}
