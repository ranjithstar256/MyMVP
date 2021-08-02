package ran.am.mymvp;

public interface Contract {

    interface View {
        void showProgress();
        void hideProgress();
        void setString(String s);
    }

    interface Model{
        interface OnfinishedListener{
            void onFinished(String st);
        }
        void getNextCourse(Contract.Model.OnfinishedListener onfinishedListener);
    }

    interface Presenter {
        void ButtonClick();
        void OnDestroy();
    }
}
