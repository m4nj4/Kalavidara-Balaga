package com.example.kalavidarabalaga.data

import com.example.kalavidarabalaga.R

object DataProvider {

    // Art Forms
    val artForms = listOf(
        "Dollu Kunitha",
        "Pooja Kunitha",
        "Goravara Kunitha",
        "Veeragase",
        "Yakshagana",
        "Kamsale"
    )

    // Districts
    val districts = listOf(
        "Bangalore",
        "Mysore",
        "Hassan",
        "Tumkur",
        "Mandya",
        "Shimoga",
        "Bangalore Rural",
        "Ramanagara",
        "Kolar",
        "Chitradurga",
        "Davangere"
    )

    val troupes = listOf(
        Troupe(
            id = "1",
            name = "Shri Dollu Kunitha Sangha",
            leadContact = "Ramesh",
            phone = "9880001111",
            artForm = "Dollu Kunitha",
            district = "Bangalore Rural",
            serviceArea = "All over Karnataka",
            equipmentList = "10 Drums, 5 Cymbals, Traditional Costumes",
            memberCount = 12,
            yearsActive = 15,
            imageResId = R.drawable.placeholder_image // We will add this later
        ),
        Troupe(
            id = "2",
            name = "Mysore Pooja Kunitha Troupe",
            leadContact = "Suresh",
            phone = "9880002222",
            artForm = "Pooja Kunitha",
            district = "Mysore",
            serviceArea = "Mysore & Mandya",
            equipmentList = "Pooja Kunitha Structures, Traditional Instruments",
            memberCount = 8,
            yearsActive = 10,
            imageResId = R.drawable.placeholder_image
        ),
        Troupe(
            id = "3",
            name = "Hassan Goravara Seva",
            leadContact = "Mahesh",
            phone = "9880003333",
            artForm = "Goravara Kunitha",
            district = "Hassan",
            serviceArea = "Hassan, Chikmagalur",
            equipmentList = "Bearskin Caps, Flutes, Damaru",
            memberCount = 6,
            yearsActive = 20,
            imageResId = R.drawable.placeholder_image
        ),
        Troupe(
            id = "4",
            name = "Tumkur Veeragase Group",
            leadContact = "Kumar",
            phone = "9880004444",
            artForm = "Veeragase",
            district = "Tumkur",
            serviceArea = "Tumkur & Bangalore",
            equipmentList = "Swords, Shields, Traditional Attire, Percussion",
            memberCount = 10,
            yearsActive = 12,
            imageResId = R.drawable.placeholder_image
        ),
        Troupe(
            id = "5",
            name = "Mandya Yaksha Kala",
            leadContact = "Prasad",
            phone = "9880005555",
            artForm = "Yakshagana",
            district = "Mandya",
            serviceArea = "South Karnataka",
            equipmentList = "Elaborate Costumes, Chande, Maddale",
            memberCount = 15,
            yearsActive = 25,
            imageResId = R.drawable.placeholder_image
        ),
        Troupe(
            id = "6",
            name = "Shimoga Kamsale Troupe",
            leadContact = "Ganesh",
            phone = "9880006666",
            artForm = "Kamsale",
            district = "Shimoga",
            serviceArea = "Shimoga, Davangere",
            equipmentList = "Kamsale (Brass Cymbals), Uniforms",
            memberCount = 8,
            yearsActive = 8,
            imageResId = R.drawable.placeholder_image
        ),
        Troupe(
            id = "7",
            name = "Ramanagara Folk Arts",
            leadContact = "Lokesh",
            phone = "9880007777",
            artForm = "Dollu Kunitha",
            district = "Ramanagara",
            serviceArea = "Ramanagara & Bangalore",
            equipmentList = "8 Drums, Sound System",
            memberCount = 10,
            yearsActive = 5,
            imageResId = R.drawable.placeholder_image
        ),
        Troupe(
            id = "8",
            name = "Kolar Pooja Sangha",
            leadContact = "Venkatesh",
            phone = "9880008888",
            artForm = "Pooja Kunitha",
            district = "Kolar",
            serviceArea = "Kolar, Chikkaballapur",
            equipmentList = "Bamboo Structures, Decorations",
            memberCount = 7,
            yearsActive = 18,
            imageResId = R.drawable.placeholder_image
        ),
        Troupe(
            id = "9",
            name = "Chitradurga Veeragase",
            leadContact = "Anand",
            phone = "9880009999",
            artForm = "Veeragase",
            district = "Chitradurga",
            serviceArea = "Central Karnataka",
            equipmentList = "Traditional Weaponry Props, Percussion",
            memberCount = 12,
            yearsActive = 22,
            imageResId = R.drawable.placeholder_image
        ),
        Troupe(
            id = "10",
            name = "Davangere Yakshagana",
            leadContact = "Shivaram",
            phone = "9880000000",
            artForm = "Yakshagana",
            district = "Davangere",
            serviceArea = "Davangere, Harihara",
            equipmentList = "Costumes, Makeup Kits, Instruments",
            memberCount = 18,
            yearsActive = 30,
            imageResId = R.drawable.placeholder_image
        )
    )
}
