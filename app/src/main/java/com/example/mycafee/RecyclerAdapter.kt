package com.example.mycafee

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
// This is an Adapter that Creates The data to Put in Our Recycler View.
class RecyclerAdapter(var context: Context) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    // Array of Food titles    
    private val titles = arrayOf("cheese", "burger","beef","rice","ugali","chapati","chicken","pork","githeri","pizza")
    // Array of Food Details  
    private val details = arrayOf(
        "Spicy Thai Basil Chicken: A vibrant stir-fry featuring tender chicken pieces sautéed with fragrant Thai basil, fresh chilies, and colorful bell peppers, all tossed in a savory garlic soy sauce. Served over jasmine rice, this dish offers a perfect balance of heat and aromatic flavor.",
        "Classic Margherita Pizza: A delightful thin-crust pizza topped with rich tomato sauce, fresh mozzarella, and fragrant basil leaves. Baked to perfection, the crust is crispy, and the cheese melts beautifully, offering a simple yet delicious experience that celebrates the essence of Italian cuisine.",
        "Creamy Garlic Tuscan Shrimp: Juicy shrimp cooked in a luscious garlic cream sauce with sun-dried tomatoes and spinach. This dish is a comforting blend of flavors served over a bed of fettuccine, making it a perfect choice for seafood lovers seeking a taste of Tuscany.",
        "Vegetarian Quinoa Salad: A refreshing mix of fluffy quinoa, diced cucumbers, cherry tomatoes, bell peppers, and red onions, all tossed in a zesty lemon vinaigrette. This salad is packed with nutrients, offering a colorful and satisfying meal that’s both light and filling.",
        "Slow-Cooked Beef Bourguignon: A rich and hearty French stew made with tender beef chunks simmered in red wine, onions, mushrooms, and herbs. This comforting dish is served with crusty bread, perfect for soaking up the velvety sauce and warming your soul on a chilly day.", "Butternut Squash Risotto: Creamy Arborio rice cooked slowly with roasted butternut squash, Parmesan cheese, and fresh sage. This dish offers a beautiful autumn flavor profile, combining sweetness with the richness of the cheese, creating a comforting and elegant meal.", "BBQ Pulled Pork Sandwiches: Slow-cooked, tender pulled pork smothered in smoky barbecue sauce, served on a toasted bun with crunchy coleslaw. This hearty sandwich is bursting with flavor and perfect for gatherings, offering a satisfying balance of sweet and tangy notes.", "Mediterranean Stuffed Bell Peppers: Bell peppers filled with a savory mixture of ground lamb, couscous, tomatoes, olives, and feta cheese, then baked until tender. This dish is a colorful and nutritious option that brings the vibrant flavors of the Mediterranean to your table.", "Decadent Chocolate Lava Cake: A rich, molten chocolate cake with a gooey center, served warm with a scoop of vanilla ice cream. This indulgent dessert is perfect for chocolate lovers, offering a luxurious combination of textures and flavors that melt in your mouth.", "Coconut Mango Sticky Rice: A traditional Thai dessert made with sweet sticky rice cooked in creamy coconut milk and served with fresh mango slices. This dish provides a delightful contrast of flavors, combining the richness of coconut with the bright sweetness of ripe mango.")
    // Array of Food costs
    private val cost = arrayOf("800","600","500","900","700","400","800","900","700","700")

    // Array of Food images  
    private val images = intArrayOf(
        R.drawable.f1,
        R.drawable.f2,
        R.drawable.f3,
        R.drawable.f4,
        R.drawable.f5,
        R.drawable.f6,
        R.drawable.f7,
        R.drawable.f8,
        R.drawable.f9,
        R.drawable.f10,

    )

    // Access the Single item XML Layout
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.singleitem, viewGroup, false)
        return ViewHolder(v)
    }
    
    //View Holder that does find Views in single item XML, 1 ImageView, 3 TextView    
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemCost: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_tittle)
            itemDetail =  itemView.findViewById(R.id.item_desc)
            itemCost = itemView.findViewById(R.id.item_cost)
        }
    }

    //Set Items from Arrays and Put/Bind them in respectives Views

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        // Set the image resource
        viewHolder.itemImage.setImageResource(images[i]) // Ensure itemImage is properly initialized
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemCost.text = cost[i]

        // Set click listener to handle item click
        viewHolder.itemView.setOnClickListener {
            // Navigate to the next page or perform any action
        }
    }


    // Get how many items the array have, All arrays must have equal sizes
    override fun getItemCount(): Int {
        return titles.size
    }
}