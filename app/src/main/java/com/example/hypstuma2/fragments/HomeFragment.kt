package com.example.hypstuma2.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.hypstuma2.R


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList= ArrayList<SlideModel>()

        imageList.add(SlideModel("https://hypstuma.com/wp-content/uploads/slider/cache/80b36a7b0df6bc99758961471bcbdc6a/Want-6.jpg"))
        imageList.add(SlideModel("https://hypstuma.com/wp-content/uploads/slider/cache/0d534db04c1d7a595d9bc0149c7c38ae/TRAINING-9.jpg"))
        imageList.add(SlideModel("https://hypstuma.com/wp-content/uploads/slider/cache/1d886522a681e050ba54bcfbbd481ee5/Website-slider-images.jpg"))
        imageList.add(SlideModel("https://hypstuma.com/wp-content/uploads/slider/cache/d17faf0ca79d6560d6252fc7aa7a68d2/TRAINING-8.jpg"))

        val imageSlider= view.findViewById<ImageSlider>(R.id.slide)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}