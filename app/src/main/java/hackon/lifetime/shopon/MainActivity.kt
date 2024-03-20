package hackon.lifetime.shopon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.models.Product

// Creating a list of Product objects
val products = mutableListOf(
    Product(
        1, "Wooden Chair", "4,900", R.drawable.wooden_chair,
        "FREE delivery by Wed, 10 Aug",
        "Acacia Wood and Natural Cane Weaving",
        4.5f, "1,210",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fchair.glb?alt=media&token=5fda46b2-c550-49d0-95b1-e5b78e48f407"
    ),
    Product(
        2, "Canteen Table", "4,500", R.drawable.table,
        "FREE delivery by Thu, 11 Aug",
        "Crafted of Oak wood legs, the sleek veneer top showcases a rick woodgrain finish.",
        4f, "895",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2FcanteenTable.glb?alt=media&token=163cac1b-6dd0-4969-9d23-0370a2ef11ba"
    ),
    Product(
        3, "Pedestal Fan", "3,200", R.drawable.pedestal_fan,
        "FREE delivery by Mon, 8 Aug",
        "Pedestal Fan Wind Storm 18 inch features a powerful energy efficient heavy duty motor, telescopic height adjustment and three-speed control.",
        3.5f, "4,752",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fcoolerfan.glb?alt=media&token=b111539e-0fb0-4461-bf5c-382a71961fd6"
    ),
    Product(
        4, "Mobile Tripod", "500", R.drawable.tripod_image,
        "FREE delivery by Wed, 10 Aug",
        "360 degree rotation, easy to carry, easy to use and Good Stability and has powerful absorption and deformation functions suitable for mobile phone up to 6 inches.",
        4f, "14,396",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2FTripod.glb?alt=media&token=18fcd0e8-3f4a-424e-ae8a-7236b798bcc2"
    ),
    Product(
        5, "Office Chair", "11,880", R.drawable.office_chair,
        "FREE delivery by Tue, 9 Aug",
        "Chair with lumbar support and pneumatic gas lift for height adjustment and 360 degree swivel.",
        4.5f, "257",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Foffice_chair.glb?alt=media&token=e74163eb-4d9c-45ea-83f7-a5ca24944c68"
    ),
    Product(
        6, "Bar Chair", "5,500", R.drawable.bar_chair,
        "FREE delivery by Wed, 10 Aug",
        "Stable And Sturdy Bar chair - With a built-in 360 degree swivel. High density foam upholstered in leatherette.",
        4f, "1,664",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fbar_chair.glb?alt=media&token=16e6477c-f7c7-4df7-80eb-149daa3d78d9"
    ),
    Product(
        7, "Park Bench", "12,500", R.drawable.park_bench_photo,
        "FREE delivery by Fri, 12 Aug",
        "The large garden bench seat pad offers the perfect mix of appearance and functionality",
        3.5f, "578",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fpark_bench.glb?alt=media&token=7b173df1-c4cf-413c-aef7-74e27d15d87b"
    ),
    Product(
        8, "Microwave Oven", "15,000", R.drawable.oven_photo,
        "FREE delivery by Thu, 11 Aug",
        "GRILL, BAKE & TOAST - Use the oven for baking cakes, pizzas and pastas, grilling vegetables, roasting potatoes, chicken, paneer or simply toasting bread.",
        4.5f, "734",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Foven.glb?alt=media&token=184d949c-cfd5-4ba1-8be9-c728f46dc864"
    ),
    Product(
        9, "Cartoon TV", "20,000", R.drawable.cartoon_tv,
        "FREE delivery by Thu, 12 Sep",
        "In a whimsical cartoon living room, a vibrant and playful Cartoon TV takes center stage, adorned with a friendly face on the screen.",
        4.9f, "787",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fcartoon_tv.glb?alt=media&token=176eeae6-ef4d-4069-86fa-62d15bf75b57"
    ),
    Product(
        10, "Table Lamp", "5,000", R.drawable.table_lamp__free,
        "FREE delivery by Thu, 12 Sep",
        "A Table Lamp is a portable lighting fixture designed to be placed on a table or similar surface, usually consisting of a base, a stand, and a shade, providing both functional and decorative illumination.",
        4.9f, "790",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Ftable_lamp__free.glb?alt=media&token=085d7b2e-5fd6-441e-9e0e-2e70cd77876c"
    ),
    Product(
        11, "Outdoor Wall Lamp", "11,000", R.drawable.outdoor_wall_lamp,
        "FREE delivery by Thu, 12 Sep",
        "In an outdoor setting, an elegant Outdoor Wall Lamp graces the exterior wall, casting a warm and inviting glow. Its sleek design seamlessly blends with the architectural elements, providing both functional illumination and aesthetic appeal to the outdoor space.",
        4.1f, "791",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Foutdoor_wall_lamp_free.glb?alt=media&token=748e0c2c-2602-40ba-92f4-a26d6e9525c5"
    ),
    Product(
        12, "SciFi Desk", "7,000", R.drawable.scifi_desk,
        "FREE delivery by Thu, 12 Sep",
        "Simple scifi style desk with a light strip going through the middle. Handy background prop for any of your scifi environments.",
        4.0f, "792",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fscifi_desk.glb?alt=media&token=6259db26-96bd-4222-96ec-951265271707"
    ),
    Product(
        13, "Ornate Mirror", "9,000", R.drawable.mirror,
        "FREE delivery by Thu, 12 Sep",
        "An ornate mirror typically refers to a mirror that is intricately designed with decorative elements, often featuring elaborate frames or detailing. These mirrors are known for their elegant and decorative appearance, adding a touch of sophistication and style to the space where they are placed.",
        4.4f, "795",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fornate_mirror.glb?alt=media&token=5551c62c-37ea-46bc-8b4f-9597619dd024"
    ),
    Product(
        14, "Dresser", "9,000", R.drawable.accent_chest_free,
        "FREE delivery by Thu, 12 Sep",
        "A dresser is a type of furniture piece designed for storing clothing and personal items. It typically consists of multiple drawers arranged vertically or horizontally. Dressers come in various styles, sizes, and materials, allowing them to fit into different room designs.",
        4.4f, "755",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Faccent_chest_free.glb?alt=media&token=f758a00f-9448-45f0-816b-486845fb6594"
    ),
    Product(
        15, "Ottoman", "10,000", R.drawable.ottoman,
        "FREE delivery by Thu, 03 May",
        "An ottoman is a versatile piece of furniture that can serve various functions in a home. It is typically a padded seat or bench without arms or a backrest, often used as a footrest, extra seating, or even as a coffee table when a tray is placed on top.",
        4.4f, "255",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2FOttoman.glb?alt=media&token=74c61ea8-4509-44a4-ba1a-ed8e5307a7e5"
    ),
    Product(
        16, "Washing Machine", "30,000", R.drawable.washing_machine,
        "FREE delivery by Mon, 23 May",
        "A washing machine is a household appliance designed to clean laundry, such as clothing, towels, and sheets. It automates the process of washing clothes, making it more convenient and efficient than traditional handwashing.",
        4.7f, "455",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fwashing_machine.glb?alt=media&token=eba0284b-863c-440e-bdab-6693cca72e40"
    ),
    Product(
        17, "Desk Fan", "80,000", R.drawable.desk_fan,
        "FREE delivery by Mon, 23 May",
        "A desk fan is a compact and portable fan designed to sit on a desk, table, or any flat surface to provide localized air circulation.",
        4.8f, "405",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fdesk_fan.glb?alt=media&token=aa8266be-f049-4a8a-b4b1-86778d8aec64"
    ),
    Product(
        18, "Simple Screen", "60,000", R.drawable.screen,
        "FREE delivery by Mon, 23 May",
        "A simple TV screen typically refers to the display component of a television set without additional features or embellishments.",
        4.6f, "415",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fsimple_screen.glb?alt=media&token=6b3488b1-8a21-4498-bf1f-c1afaa4a597e"
    ),
    Product(
        19, "Bed", "60,000", R.drawable.bed_asset,
        "FREE delivery by Mon, 26 May",
        "A bed is a piece of furniture designed primarily for sleeping or resting. Beds come in various styles, sizes, and materials.",
        4.9f, "495",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fbed_asset.glb?alt=media&token=39add0a3-d76d-4bf1-aa4d-3bf10922b779"
    ),
    Product(
        20, "Shelf", "10,000", R.drawable.unique_shelf,
        "FREE delivery by Mon, 28 May",
        "A unique, custom-designed shelf crafted from reclaimed wood, featuring a minimalist yet rustic aesthetic with multiple floating tiers, finished in a natural wood tone, ideal for displaying decorative items and providing functional storage.",
        4.2f, "485",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Funique_shelf.glb?alt=media&token=33eb810d-0c22-4481-8554-b53dd30d92b8"
    ),
    Product(
        21, "Table and Chair set", "20,000", R.drawable.table_chair,
        "FREE delivery by Mon, 17 Nov",
        "In a cozy dining area, a stylish Table and Chair Set takes center stage. The well-crafted table, surrounded by matching chairs, forms a harmonious ensemble. The smooth surfaces and elegant lines of the furniture create a welcoming atmosphere, perfect for shared meals, conversations, and gatherings.",
        4.2f, "485",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Ftable_and_chair_set.glb?alt=media&token=37328190-ffb8-4da9-8369-5c4519e8316b"
    ),
    Product(
        22, "Modern Sofa", "25,000", R.drawable.modern_sofa,
        "FREE delivery by Mon, 28 Nov",
        "In a contemporary living space, a sleek and chic Modern Sofa commands attention. Its clean lines, minimalist design, and premium upholstery define a sophisticated centerpiece.",
        4.2f, "485",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fmodern__sofa.glb?alt=media&token=2aa1e2db-7b75-4ead-a125-d55410fc7708"
    ),
    Product(
        23, "Luxury Sofa", "30,000", R.drawable.sofa,
        "FREE delivery by Mon, 17 Nov",
        "In an elegantly appointed living room, a Beautiful Sofa graces the space with its exquisite design and tasteful aesthetics. Adorned in luxurious upholstery and showcasing refined details, this sofa becomes a focal point, adding a touch of sophistication to the room.",
        4.2f, "485",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fsofa.glb?alt=media&token=cc2a3f13-37fe-4abf-987b-afc553e3446b"
    ),
    Product(
        24, "Antique Phone", "5,000", R.drawable.phone,
        "FREE delivery by Mon, 17 Nov",
        "An Antique Phone Model serves as a charming nod to the past, offering a vintage touch to any setting. With its classic rotary dial, ornate design, and nostalgic aesthetics, this model captures the essence of retro communication.",
        4.2f, "485",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fantique_phone.glb?alt=media&token=7713fae3-914d-4beb-8510-36d85ed5b510"
    ),
    Product(
        25, "Cooler or Fridge", "20,000", R.drawable.cooler,
        "FREE delivery by Mon, 17 Nov",
        "A Wine Cooler or Wine Fridge is a specialized appliance designed to store and chill wine bottles at optimal temperatures. It provides a controlled environment to preserve the flavor and quality of wines.",
        4.9f, "885",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fwine_coolerfridge.glb?alt=media&token=e71fb59e-20a7-4ff8-a264-57b0abec6419"
    ),
    Product(
        26, "Fridge", "25,000", R.drawable.fridge,
        "FREE delivery by Mon, 17 Nov",
        "A fridge, short for refrigerator, is a household appliance designed to cool and preserve food and beverages. It consists of a thermally insulated compartment and a refrigeration system that removes heat from the contents of the fridge to maintain a lower temperature.",
        4.9f, "895",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Ffridge.glb?alt=media&token=a4354a7c-bfba-4884-87eb-55fa0a39b87e"
    ),
    Product(
        27, "Old Sewing Machine", "10,000", R.drawable.sewing_machine,
        "FREE delivery by Mon, 17 Nov",
        "An old sewing machine typically refers to a vintage or antique sewing machine that was manufactured in the past and may have historical or collector's value.",
        4.9f, "895",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fold_sewing_machine.glb?alt=media&token=218753f7-b989-480d-b8ca-37f0c086cc0b"
    ),
    Product(
        28, "Coffee Machine", "4,000", R.drawable.coffee_machine,
        "FREE delivery by Mon, 19 Nov",
        "A coffee machine is a device designed to brew and prepare coffee.",
        4.2f, "645",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fcoffee_machine.glb?alt=media&token=66cd98d4-7f46-4276-88b0-34490065c522"
    ),
    Product(
        29, "Armchair", "2,000", R.drawable.arm_chair,
        "FREE delivery by Mon, 19 Nov",
        "An armchair is a type of chair characterized by its armrests and a comfortable design, providing a place for a person to sit and relax.",
        4.6f, "625",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Farmchair.glb?alt=media&token=7826246f-163a-4fb3-84c8-46d595d73970"
    ),
    Product(
        30, "Grinder", "3,000", R.drawable.blender,
        "FREE delivery by Mon, 19 Nov",
        "Mixer grinders usually consist of a motor-driven base unit, a mixing jar, and grinding jars with different blades for various functions. They are versatile appliances used for tasks such as making smoothies, grinding spices, blending liquids, and more.",
        4.8f, "695",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fblender.glb?alt=media&token=898263b6-400c-4d0a-a811-e2d1d2d387d2"
    ),
    Product(
        31, "Owl Ornament Statue", "2,000", R.drawable.owl,
        "FREE delivery by Mon, 19 Nov",
        "An Owl Ornament Statue is likely a decorative item designed in the shape of an owl and intended for display or ornamental purposes.",
        4.0f, "295",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fowl_ornament_statue.glb?alt=media&token=0ba81f9d-ae02-45ff-b6af-4cd22a4ba28c"
    ),
    Product(
        32, "Gramophone", "5,000", R.drawable.gramophone,
        "FREE delivery by Mon, 23 Nov",
        "A gramophone, also known as a phonograph, is an early sound-reproducing device that played recorded audio through a horn-shaped speaker.",
        4.6f, "695",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fgramophone.glb?alt=media&token=0bbe6c2b-849d-424f-a473-3cdfb36004f1"
    ),
    Product(
        33, "Wardrobe", "30,000", R.drawable.wardrobe,
        "FREE delivery by Mon, 19 Nov",
        "Discover sleek storage with our Modern Wardrobe. Crafted for contemporary living, it blends style with functionality. High-quality wood, adjustable storage, and polished finishes make it perfect for any room.",
        4.9f, "785",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fwardrobe.glb?alt=media&token=439df4ad-f513-49c8-a58d-8e3224dcf2f8"
    ),
    Product(
        34, "Bucket", "20,000", R.drawable.bucket,
        "FREE delivery by Mon, 21 Nov",
        "A bucket is a common container with an open top and a handle, typically used for carrying or holding liquids, sand, or other materials.",
        4.3f, "815",
        "https://firebasestorage.googleapis.com/v0/b/ar-furniture-app-98c29.appspot.com/o/Items%20Images%2Fbucket.glb?alt=media&token=548954f1-69e0-4898-be90-44716542388d"
    ),

    )

// MainActivity class, extending AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Setting the default night mode to not use night mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        // Calling the superclass's onCreate method
        super.onCreate(savedInstanceState)
        // Setting the content view of the activity to the specified layout
        setContentView(R.layout.activity_main)
    }
}
