package ran.am.mymvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import ran.am.mymvp.databinding.ActivityMain2Binding;


public class MainActivity2 extends AppCompatActivity implements Contract.View {

    Contract.Presenter  presenter;
    ActivityMain2Binding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b= DataBindingUtil.setContentView(this,R.layout.activity_main2);
        presenter= new Presenter(this,new Model());

        b.button.setOnClickListener(view ->
                presenter.ButtonClick());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.OnDestroy();
    }

    @Override
    public void showProgress() {
        b.progressBar.setVisibility(View.VISIBLE);
        b.textView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        b.progressBar.setVisibility(View.GONE);
        b.textView.setVisibility(View.VISIBLE);
    }

    @Override
    public void setString(String s) {
        b.textView.setText(s);
    }
}