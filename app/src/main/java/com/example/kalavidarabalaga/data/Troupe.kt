package com.example.kalavidarabalaga.data

import java.io.Serializable

data class Troupe(
    val id: String,
    val name: String,
    val leadContact: String,
    val phone: String,
    val artForm: String,
    val district: String,
    val serviceArea: String,
    val equipmentList: String,
    val memberCount: Int,
    val yearsActive: Int,
    val imageResId: Int // Placeholder for the group photo
) : Serializable
