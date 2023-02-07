public class Solution {
    public static void main(String[] args) {
        ScreenOneFragment screenOneFragment = new ScreenOneFragment(new ScreenOnePresenter());
        screenOneFragment.onResume(new ScreenOneView());
    }
}