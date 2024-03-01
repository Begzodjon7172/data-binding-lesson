package uz.bnabiyev.m1lesson71databinding.models

import androidx.databinding.ObservableField

data class Employee(
    var id: Int,
    var name: ObservableField<String>,
    var address: String,
    var salary: Double,
    var avatarUrl: String
)
