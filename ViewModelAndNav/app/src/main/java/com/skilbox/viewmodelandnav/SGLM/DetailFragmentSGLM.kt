package com.skilbox.viewmodelandnav.SGLM

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navGraphViewModels
import com.bumptech.glide.Glide
import com.skilbox.viewmodelandnav.R
import kotlinx.android.synthetic.main.car_class_a.view.*
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragmentSGLM : Fragment(R.layout.fragment_detail) {
    private val args:DetailFragmentSGLMArgs by navArgs()




    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        car_text_view.text = "Element ID = "+args.carId.toString()
        detail_car_brend.text = "Car Brend = " + args.carBrend
        detail_car_name.text = "Car Name = " + args.carName
        detail_car_engine_capacity.text = "Engine capacity = " + args.carEngineCapacity

        Glide.with(requireContext())
            .load(args.carImage)
            .placeholder(R.drawable.load_imege)
            .into(detail_car_image)
            .view


    }

}