package com.pk.navgraphxmljetpack

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgument
import androidx.navigation.fragment.findNavController

class Fragment2 : Fragment() {
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?,
	): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_2, container, false)
	}
	
	override fun onResume() {
		super.onResume()
	}
}