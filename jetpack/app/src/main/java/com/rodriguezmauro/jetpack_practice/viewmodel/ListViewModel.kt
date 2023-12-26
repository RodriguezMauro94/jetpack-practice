package com.rodriguezmauro.jetpack_practice.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rodriguezmauro.jetpack_practice.model.DogBreed

class ListViewModel: ViewModel() {
    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed("1", "Corgi", "15 years", "breedGroup", "bredFor", "temperament", "")
        val dog2 = DogBreed("1", "Labrador", "10 years", "breedGroup", "bredFor", "temperament", "")
        val dog3 = DogBreed("1", "Rottweiler", "20 years", "breedGroup", "bredFor", "temperament", "")
        val dogList = arrayListOf(dog1, dog2,  dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }
}