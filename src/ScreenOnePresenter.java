

public class ScreenOnePresenter extends Presenter<ScreenOneView> {

    @Override
    public void updateUi(ScreenOneView view) {
        super.updateUi(view);
        super.view.goToScreenTwo();
    }
}
