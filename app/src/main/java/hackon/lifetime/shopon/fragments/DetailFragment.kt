package hackon.lifetime.shopon.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import hackon.lifetime.shopon.databinding.FragmentDetailBinding
import hackon.lifetime.shopon.models.Product
import hackon.lifetime.shopon.products


class DetailFragment : Fragment() {

    // Declares a binding variable for ViewBinding
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    // Overrides the onCreateView method to inflate the layout for this fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Sets the app's night mode to no night mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        // Inflates the layout using ViewBinding
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    // Overrides the onViewCreated method, called after onCreateView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Initializes the product variable
        var product: Product? = null

        // Checks if arguments were passed to the fragment
        arguments?.let { it ->
            // Retrieves arguments using Safe Args
            val args = DetailFragmentArgs.fromBundle(it)
            // Finds the product corresponding to the passed argument ID
            product = products.find { args.id == it.id }
        }

        // If a valid product is found, populates the UI with its details
        product?.let {
            with(it) {
                // Sets various UI elements using ViewBinding
                binding.productName.text = name
                binding.productPrice.text = price
                binding.productFullDescription.text = longDescription
                binding.productImage.setImageResource(imageId)

                // Configures a button to open Google's Scene Viewer for AR
                binding.virtual.setOnClickListener {
                    val sceneViewerIntent = Intent(Intent.ACTION_VIEW)
                    val intentUri =
                        Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon()
                            .appendQueryParameter("file", modelURL)
                            .appendQueryParameter("mode", "ar_only")
                            .appendQueryParameter("resizable", "true")
                            .appendQueryParameter("title", "$name - ₹$price")
                            .build()
                    sceneViewerIntent.data = intentUri
                    sceneViewerIntent.setPackage("com.google.ar.core")
                    startActivity(sceneViewerIntent)
                }

                // Configures a button to show a toast for adding to cart
                binding.addToCart.setOnClickListener {
                    Toast.makeText(context, "Product added to cart!", Toast.LENGTH_SHORT).show()
                }

                // Configures a button to show a toast for the buy now action
                binding.buyNow.setOnClickListener {
                    Toast.makeText(
                        context,
                        "Thank-you for ordering this product!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}
