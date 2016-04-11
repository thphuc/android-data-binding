package com.yeahio.androiddatabinding.presenter;

import com.yeahio.androiddatabinding.databinding.ActivityMainBinding;
import com.yeahio.androiddatabinding.model.User;
import com.yeahio.androiddatabinding.view.IMainActivityView;
import com.yeahio.androiddatabinding.view.MainActivity;

/**
 * @author phuc.tran
 */
public class MainActivityPresenter implements IMainActivityPresenter {

    private IMainActivityView mainActivityView;

    public MainActivityPresenter() {
        mainActivityView = new MainActivity();
    }

    @Override
    public void bindUserData(ActivityMainBinding binding) {
        User user = new User("Test", "User");
        //user.setAdult(true);
        user.setAge((short) 17);
        binding.setUser(user);
    }
}
