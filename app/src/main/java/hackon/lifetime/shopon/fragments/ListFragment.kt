package hackon.lifetime.shopon.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.adapters.ProductAdapter
import hackon.lifetime.shopon.products


class ListFragment : Fragment() {

    // Overrides the onCreateView method to inflate the layout for this fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_list, container, false)

    // Overrides the onViewCreated method, called after onCreateView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Finds the RecyclerView in the inflated layout and assigns it to productList
        val productList = view.findViewById<RecyclerView>(R.id.product_list).apply {

            // Sets the LinearLayoutManager for the RecyclerView
            layoutManager = LinearLayoutManager(activity)

            // Sets up the ProductAdapter for the RecyclerView
            adapter = ProductAdapter {

                // Defines a lambda executed when an item is clicked, navigating to a detail screen
                findNavController().navigate(ListFragmentDirections.actionHomeToDetail(it.id))
            }
            // Informs the RecyclerView that its size is fixed
            setHasFixedSize(true)
        }
        // Submits the list of products to the adapter
        (productList.adapter as ProductAdapter).submitList(products)
    }
}
