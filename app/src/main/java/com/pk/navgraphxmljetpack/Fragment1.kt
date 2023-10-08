package com.pk.navgraphxmljetpack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pk.navgraphxmljetpack.databinding.Fragment1Binding

class Fragment1 : Fragment() {
	private lateinit var binding: Fragment1Binding
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?,
	): View {
		// Inflate the layout for this fragment
		binding = Fragment1Binding.inflate(inflater, container, false)
		return binding.root
	}
	
	override fun onResume() {
		super.onResume()
		val action = Fragment1Directions.actionFragment1ToFragment2()
	}
}