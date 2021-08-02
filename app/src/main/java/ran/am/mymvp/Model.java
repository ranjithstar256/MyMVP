package ran.am.mymvp;

import android.os.Handler;

import java.util.ArrayList;
import java.util.Random;

public class Model implements Contract.Model{
    ArrayList  arrayList;
    @Override
    public void getNextCourse(OnfinishedListener onfinishedListener) {
        arrayList= new ArrayList();

        arrayList.add("sc");
        arrayList.add("msc");
        arrayList.add("nsc");
        arrayList.add("sdc");
        arrayList.add("ac");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onfinishedListener.onFinished(arrayList.get(0)+"");
            }
        },1000);
    }

}
