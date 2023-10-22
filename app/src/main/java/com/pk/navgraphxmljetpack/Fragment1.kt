package com.pk.navgraphxmljetpack

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
	
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		binding.composeView.setContent {
			Column(horizontalAlignment = CenterHorizontally) {
				Text(
					text = "This view is developed using the compose view...",
					style = MaterialTheme.typography.titleLarge, color = Color.Red
				)
				Spacer(modifier = Modifier.height(20.dp))
				ThisIsTextComposeView {
					val intent = Intent(activity, Fragment2::class.java)
					startActivity(intent)
				}
			}
		}
	}
}

@Composable
fun ThisIsTextComposeView(test: () -> Unit) {
	Card(
		modifier = Modifier
			.height(150.dp)
			.width(150.dp)
			.clickable { test() },
		elevation = CardDefaults.cardElevation(10.dp),
	) {
		Image(
			imageVector = Icons.Default.Person,
			contentDescription = "This is test person.",
			modifier = Modifier.fillMaxSize()
		)
	}
}