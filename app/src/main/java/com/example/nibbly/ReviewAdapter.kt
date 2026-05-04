package com.example.nibbly

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.nibbly.databinding.ItemReviewBinding

// Display the item number (e.g., HACK 1, HACK 2)
class ReviewAdapter(private val questions: List<HackQuestion>) :
    RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {

    // Show if the answer is a FACT or a MYTH
    class ViewHolder(val binding: ItemReviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val q = questions[position]
        "HACK ${position + 1}".also { holder.binding.protocolText.text = it }

        // Dynamically set the background color of the chip based on the answer
        holder.binding.answerChip.text = if (q.answer) "FACT" else "MYTH"
        holder.binding.answerChip.setBackgroundColor(
            ContextCompat.getColor(
                holder.itemView.context,
                if (q.answer) android.R.color.holo_green_light else android.R.color.holo_red_light
            )
        )

        // Bind the text data to the views
        holder.binding.statementText.text = q.statement
        holder.binding.explanationText.text = q.explanation
    }

    // Returns the total number of items in the list
    override fun getItemCount() = questions.size
}
