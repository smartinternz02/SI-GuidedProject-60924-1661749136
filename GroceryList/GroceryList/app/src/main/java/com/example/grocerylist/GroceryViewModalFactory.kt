package com.example.grocerylist

import androidx.lifecycle.ViewModel


class GroceryViewModalFactory (private val repository: GroceryRepository) : ViewModelProvider.NewInstanceFactory() {

    fun <T: ViewModel> create(modelClass: Class<T>):T{
        return GroceryViewModal(repository) as T
    }
}

object ViewModelProvider {
    open class NewInstanceFactory {

    }

}
