package com.rodriguezmauro.jetpack_practice.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rodriguezmauro.jetpack_practice.model.DogBreed

class DetailViewModel: ViewModel() {
    val dogBreed = MutableLiveData<DogBreed>()

    fun fetch() {
        val dogBreedMock = DogBreed("1", "Corgi", "15 years", "breedGroup", "bredFor", "temperament", "")

        dogBreed.value = dogBreedMock
    }
}