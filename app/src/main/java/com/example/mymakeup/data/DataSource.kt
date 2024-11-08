package com.example.mymakeup.data

import com.example.mymakeup.R
import com.example.mymakeup.model.Permit

class DataSource {

    fun loadPermits(): List<Permit> {
        return listOf(
            Permit(
                name = "Lipstick",
                brand = "Brand A",
                shade = "Red",
                price = 10.99,
                description = "Long-lasting lipstick with a matte finish.",
                imageResId = R.drawable.lipstick // Set image resource ID
            ),
            Permit(
                name = "Mascara",
                brand = "Brand B",
                shade = "Black",
                price = 15.50,
                description = "Waterproof mascara for volumizing.",
                imageResId = R.drawable.mascara
            ),
            Permit(
                name = "Foundation",
                brand = "Brand C",
                shade = "Natural",
                price = 20.75,
                description = "Liquid foundation for a flawless look.",
                imageResId = R.drawable.foundation
            ),
            Permit(
                name = "Blush",
                brand = "Brand D",
                shade = "Pink",
                price = 12.40,
                description = "Natural blush for a subtle glow.",
                imageResId = R.drawable.blush
            )
        )
    }
}
