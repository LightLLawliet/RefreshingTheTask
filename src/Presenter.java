


public abstract class Presenter<V extends View> {

    protected V view;

    public void updateUi(V view) {
        this.view = view;
    }

    public void stopUi() {
        view = null;
    }
}


