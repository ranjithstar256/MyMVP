package ran.am.mymvp;

public class Presenter implements Contract.Presenter, Contract.Model.OnfinishedListener {

    Contract.View mainview;

    Contract.Model model;

    public Presenter(Contract.View mainview, Contract.Model model) {
        this.mainview = mainview;
        this.model = model;
    }

    @Override
    public void ButtonClick() {
        if (mainview!=null){
            mainview.showProgress();
        }
        model.getNextCourse(this);
    }

    @Override
    public void OnDestroy() {
            mainview=null;
    }

    @Override
    public void onFinished(String st) {
            if (mainview!=null){
                mainview.setString(st);
                mainview.hideProgress();
            }
    }
}
