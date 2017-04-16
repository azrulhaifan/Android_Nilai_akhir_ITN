package id.web.datakampus.nilaiakhiritn;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPerhitungan extends Fragment implements View.OnClickListener {

    EditText et_np1,et_np2, et_np3, et_np4, et_cp1, et_cp2, et_hasil;

    Button bt_hitung;

    Double np1, np2, np3, np4, cp1, cp2, npa, na;

    public FragmentPerhitungan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_perhitungan, container, false);

        et_np1 = (EditText) rootView.findViewById(R.id.txt_np1);
        et_np2 = (EditText) rootView.findViewById(R.id.txt_np2);
        et_np3 = (EditText) rootView.findViewById(R.id.txt_np3);
        et_np4 = (EditText) rootView.findViewById(R.id.txt_np4);
        et_cp1 = (EditText) rootView.findViewById(R.id.txt_cp1);
        et_cp2 = (EditText) rootView.findViewById(R.id.txt_cp2);
        et_hasil = (EditText) rootView.findViewById(R.id.txt_hasil);
        bt_hitung = (Button) rootView.findViewById(R.id.bt_hitung);

        bt_hitung.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onClick(View v) {

    }
}
