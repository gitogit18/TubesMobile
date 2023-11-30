package com.example.tubes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val itemTitles = arrayOf(
        // Demo Text :
        "Health Articles are Beneficial to Read","Health Articles are Beneficial to Read","Health Articles are Beneficial to Read","Health Articles are Beneficial to Read","Health Articles are Beneficial to Read",
        "Health Articles are Beneficial to Read","Health Articles are Beneficial to Read","Health Articles are Beneficial to Read","Health Articles are Beneficial to Read","Health Articles are Beneficial to Read",
        "Health Articles are Beneficial to Read","Health Articles are Beneficial to Read","Health Articles are Beneficial to Read","Health Articles are Beneficial to Read"
    )


    private val itemDetails = arrayOf(
        // Demo Text :
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge.",
        "Health articles are beneficial for humans like us to read because it develops our brain to extend our knowledge."
    )

    private val itemImages = arrayOf(
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
        R.drawable.tomatohealth,
    )



    inner class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){

        var image : ImageView
        var textTitle : TextView
        var textDes : TextView

        init {
            image = itemView.findViewById(R.id.item_image1)
            textTitle = itemView.findViewById(R.id.item_title)
            textDes = itemView.findViewById(R.id.item_details1)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_health_article,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles [position]
            holder.textDes.text = itemDetails [position]
            holder.image.setImageResource(itemImages[position])

            holder.itemView.setOnClickListener { v: View ->

                Toast.makeText(v.context, "Clicked on the item" , Toast.LENGTH_SHORT).show()

            }
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }
}