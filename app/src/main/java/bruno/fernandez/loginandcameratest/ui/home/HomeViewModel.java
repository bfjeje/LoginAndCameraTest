package bruno.fernandez.loginandcameratest.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Clique no ícone abaixo para tirar uma nova foto.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}