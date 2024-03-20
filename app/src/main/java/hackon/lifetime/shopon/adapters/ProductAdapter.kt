package hackon.lifetime.shopon.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.models.Product


class ProductAdapter(private val listener: (Product) -> Unit) :
    ListAdapter<Product, ProductAdapter.ViewHolder>(DiffCallback()) {

    // onCreateViewHolder is responsible for creating ViewHolders
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemLayout)
    }

    // onBindViewHolder is responsible for binding data to ViewHolders
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    // ViewHolder represents the individual items in the RecyclerView
    inner class ViewHolder(containerView: View) :
        RecyclerView.ViewHolder(containerView) {

        // This block is executed when a ViewHolder is created
        init {
            itemView.setOnClickListener {
                // When an item is clicked, invoke the listener function
                listener.invoke(getItem(absoluteAdapterPosition))
            }
        }

        // Views inside the ViewHolder
        private val productImage: ImageView = containerView.findViewById(R.id.product_image)
        private val productName: TextView = containerView.findViewById(R.id.product_name)
        private val productPrice: TextView = containerView.findViewById(R.id.product_price)
        private val productDelivery: TextView = containerView.findViewById(R.id.product_delivery)
        private val rating4: ImageView = containerView.findViewById(R.id.rating4)
        private val rating5: ImageView = containerView.findViewById(R.id.rating5)
        private val productRatingCount: TextView = containerView.findViewById(R.id.rating_count)

        // Bind data to the ViewHolder
        fun bind(countryData: Product) {
            with(countryData) {
                productImage.setImageResource(imageId)
                productName.text = name
                productPrice.text = price
                productDelivery.text = delivery
                if (rating <= 4) rating5.setImageResource(R.drawable.ic_baseline_star_outline_24)
                if (rating < 4) rating4.setImageResource(R.drawable.ic_baseline_star_half_24)
                productRatingCount.text = ratingCount
            }
        }
    }
}

// DiffCallback is used to calculate the difference between old and new lists
class DiffCallback : DiffUtil.ItemCallback<Product>() {
    // Check if items are the same
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.imageId == newItem.imageId
    }

    // Check if item contents are the same
    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }
}