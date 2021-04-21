package school.cactus.viewmodellivedatasample2

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val counter = MutableLiveData<Int>()

    val counterString: LiveData<String> = Transformations.map(counter) {
        it.toString()
    }

    init {
        counter.value = 0
    }

    fun onClickMeButtonClick() {
        counter.value = counter.value!! + 1
    }
}