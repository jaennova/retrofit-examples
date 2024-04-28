package com.jaennova.retrofit_examples.mainmenu

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.retrofit_examples.databinding.ItemMenuBinding

class MenuViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemMenuBinding.bind(view)
    fun bind(menuItem: MenuItem) {
        binding.tvAppName.text = menuItem.appName
        binding.tvAppDescription.text = menuItem.description
        binding.ivAppIcon.setImageResource(menuItem.icon)
        view.setOnClickListener {
            navigateToApp(menuItem)
        }
    }

    private fun navigateToApp(menuItem: MenuItem) {
        when (menuItem.appName) {
        }
    }

    private fun openActivity(activityClass: Class<*>) {
        val intent = Intent(binding.ivAppIcon.context, activityClass)
        binding.ivAppIcon.context.startActivity(intent)
    }
}