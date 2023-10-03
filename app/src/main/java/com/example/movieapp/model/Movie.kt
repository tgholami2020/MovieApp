package com.example.movieapp.model

data class Movie(
    val id:String,
    val title:String,
    val year:String,
    val genre:String,
    val director:String,
    val actors:String,
    val plot: String,
    val poster:String,
    val images: List<String>,
    val rating:String


)
fun getMovies(): List<Movie>{
    return listOf(
    Movie(
        "1",
        "Avator",
        "1988",
        "",
        "director 1",
        "actor 1",
        "this is plot number 1" ,
        "poster 1",
        listOf("https://th.bing.com/th/id/OIG.CO2sHWK_IEYIwzXsC2hX",
            "https://st.depositphotos.com/1359043/2279/i/450/depositphotos_22795776-stock-photo-violet-butterfly-isolated-on-white.jpg",
            "https://static.vecteezy.com/system/resources/previews/010/938/844/non_2x/tropical-purple-butterfly-illustration-beautiful-butterfly-vector.jpg",
            "https://www.shutterstock.com/image-vector/big-collection-colorful-butterflies-vector-250nw-257889296.jpg"),
        "rate is A"
    ),
        Movie(
            "2",
            "Bat Man",
            "1976",
            "",
            "director 2",
            "actor 2",
            "this is plot number 2",
            "poster 2",
            listOf("https://helpx.adobe.com/content/dam/help/en/photoshop/using/convert-color-image-black-white/jcr_content/main-pars/before_and_after/image-before/Landscape-Color.jpg",
                "https://st2.depositphotos.com/1017908/11189/i/450/depositphotos_111897950-stock-photo-magic-landscape-of-view-on.jpg",
                "https://www.shutterstock.com/shutterstock/photos/1514686616/display_1500/stock-photo-colorful-japanese-maple-acer-palmatum-leaves-during-momiji-season-at-kinkakuji-garden-kyoto-1514686616.jpg",
                "https://st4.depositphotos.com/1875497/23709/i/450/depositphotos_237092702-stock-photo-beautiful-red-green-maple-leaf.jpg"),
            "rate is C"
        ),
        Movie(
            "3",
            "Titnic",
            "2021",
            "",
            "director 3",
            "actor 3",
            "this is plot number 3",
            "poster 3",
            listOf("https://imgv3.fotor.com/images/cover-photo-image/a-beautiful-girl-with-gray-hair-and-lucxy-neckless-generated-by-Fotor-AI.jpg",
                "https://img.freepik.com/premium-photo/woman-with-blue-eyes-purple-blue-hair_693504-77.jpg",
                "https://img.freepik.com/premium-photo/woman-with-white-hair-silver-crown-her-head_911201-1822.jpg",
                "https://img.freepik.com/photos-premium/there-is-cartoon-anime-fantasy-fairytale-castle-in-the-forest-with-tall-pointed-roof_917506-261956.jpg"),
            "rate is D"
        ),
        Movie(
            "4",
            "Life",
            "1919",
            "",
            "director 4",
            "actor 4",
            "this is plot number 4",
            "poster 4",
            listOf("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg",
                "https://img.freepik.com/photos-premium/arbre-se-decoupe-ciel-au-coucher-du-soleil_921063-76.jpg",
                "https://c8.alamy.com/zoomsfr/9/c331c0b5d69f4cf497a97884fd35757e/2c5hc24.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvnZVHdfdXz5axWgtli0dB5d--VtwH_iSOMUIPx4IhWb2GuPo6cpAX-sYyNUjyq1pNPiA&usqp=CAU"),
            "rate is A"
        ),
        Movie(
            "5",
            "Loocy",
            "1989",
            "",
            "director 5",
            "actor 5",
            "this is plot number 5",
            "poster number 5",
            listOf("https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?cs=srgb&dl=pexels-anjana-c-674010.jpg&fm=jpg",
                "https://img.freepik.com/photos-premium/il-y-chat-noir-grands-yeux-assis-surface-violette-ai-generative_955925-29950.jpg",
                "https://images.pexels.com/photos/11900629/pexels-photo-11900629.jpeg?cs=srgb&dl=pexels-kiril-georgiev-11900629.jpg&fm=jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxAWQvIf1Qnn_a1Vx0wRMI1jkBvdi9F7OQYqMgEMrZFqL8cFXgaMYnVpSIXvXJezOThAc&usqp=CAU"),
            "rate is B"
        ),
        Movie(
            "6",
            "Soul",
            "2001",
            "",
            "director 6",
            "actor 6",
            "this is plot number 6",
            "poser 6",
            listOf("https://cdn.pixabay.com/photo/2019/12/16/13/11/glory-4699320_1280.jpg",
                "https://c4.wallpaperflare.com/wallpaper/882/639/735/girl-wings-dress-wallpaper-preview.jpg",
                "https://i.pinimg.com/474x/cb/66/9a/cb669afc4db074434f104d680fd36176.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBmY-FIT-9bd_tqD_yEevUCsDej72Mb1zniVy69UoYoEMOkA2_LnzXywc6M5ZMMRTsKtQ&usqp=CAU"),
            "rate is C"
        ),
        Movie(
            "7",
            "Mountain",
            "2011",
            "",
            "director 7",
            "actor 7",
            "this is plot number 7",
            "poster 7",
            listOf("https://image-processor-storage.s3.us-west-2.amazonaws.com/images/3cf61c1011912a2173ea4dfa260f1108/halo-of-neon-ring-illuminated-in-the-stunning-landscape-of-yosemite.jpg"
                ,"https://media.gettyimages.com/id/1337498140/fr/photo/femme-en-for%C3%AAt-marchant-vers-un-objet-myst%C3%A9rieux.jpg?s=612x612&w=gi&k=20&c=4tSHqTee_u-r5YR2wRmBqBL88ifa_WVl_M_xHPp81gk=",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtcymtKk34UTe7tctOdkBgrR2cSY7uwHU8u5-_8AhV3bUJShqm5Zd2XNrBLTuJFXb-0m0&usqp=CAU"),
            "rate is B"
        ),
        Movie(
            "8",
            "Trees",
            "2014",
            "",
            "director 8",
            "actor 7",
            "this is plot number 8",
            "poster 8",
            listOf("https://img.freepik.com/photos-premium/arbre-vert-isole-fond-blanc_887999-326.jpg",
                "https://img.freepik.com/photos-premium/arbre-forme-coeur-fond-blanc-ia-generative_97167-14363.jpg",
                "https://img.freepik.com/photos-premium/3d-illustration-icone-arbre_951562-4811.jpg"),
            "rate is A"
        ),

)
}
