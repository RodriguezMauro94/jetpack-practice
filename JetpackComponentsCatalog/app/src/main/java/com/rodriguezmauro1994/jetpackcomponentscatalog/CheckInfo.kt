package com.rodriguezmauro1994.jetpackcomponentscatalog

data class CheckInfo(val title: String, var selected: Boolean = false, var onCheckedChange: (Boolean) -> Unit)