package com.example.encyclopedia.models

import com.example.encyclopedia.R


data class Item(
    var id:Int =0,
    var name:String ="",
    var textP1:String="",
    var textP2:String="",
    var photo:Int =0,
    var shortDesc :String=""
){

}
var item1= Item(0,name = "Hyacinth",textP1 = "Hyacinthus is a small genus of " +
        "bulbous, spring-blooming perennials. They are fragrant flowering plants " +
        "in the family Asparagaceae, subfamily Scilloideae and are commonly called h" +
        "yacinths. The genus is native to the area of the eastern Mediterranean from " +
        "the north of Bulgaria through to the northern part of Palestine.",
    shortDesc = "Perennial herbs that lack",
    textP2 = "Hyacinthus grows from bulbs, each producing around " +
            "four to six linear leaves and one to three spikes or racemes of " +
            "flowers. In the wild species, the flowers are widely spaced " +
            "with as few as two per raceme in typically six to eight in H. orientalis " +
            "which grows to a height of 15–20 cm (6–8 in). Cultivars of H. " +
            "orientalis have much denser flower spikes and are generally more robust.",
    photo = R.drawable.hycinth
)
var item2= Item(0,name = "Lilium",textP1 = "Lilium is a genus of herbaceous " +
        "flowering plants growing from bulbs, all with large prominent flowers. " +
        "They are the true lilies. Lilies are a group of flowering plants which " +
        "are important in culture and literature in much of the world. " +
        "Most species are native to the temperate northern hemisphere, " +
        "though their range extends into the northern subtropics. " +
        "Many other plants have lily in their common names, " +
        "but do not belong to the same genus and are therefore not true lilies.",
    shortDesc = "Herbaceous flowering plant",
    textP2 = "Lilies are tall perennials ranging in height from 2–6 ft (60–180 cm). " +
            "They form naked or tunicless scaly underground bulbs which are their organs " +
            "of perennation. In some North American species the base of the bulb develops" +
            " into rhizomes, on which numerous small bulbs are found. Some species develop" +
            " stolons. Most bulbs are buried deep in the ground, but a few species form bulbs" +
            " near the soil surface. Many species form stem-roots. With these, the bulb grows" +
            " naturally at some depth in the soil, and each year the new stem puts out adventitious" +
            " roots above the bulb as it emerges from the soil. These roots are in addition " +
            "to the basal roots that develop at the base of the bulb.",
    photo = R.drawable.lilly
)
var item3= Item(0,
    name = "Rose",
    textP1 = "A rose is a woody perennial flowering plant of the " +
            "genus Rosa, in the family Rosaceae, or the flower it " +
            "bears. There are over three hundred species and tens " +
            "of thousands of cultivars. They form a group of plants " +
            "that can be erect shrubs, climbing, or trailing, with " +
            "stems that are often armed with sharp prickles." +
            "[citation needed] Their flowers vary in size and " +
            " shape and are usually large and showy, in colours " +
            "ranging from white through yellows and reds. Most " +
            "species are native to Asia, with smaller numbers " +
            "native to Europe, North America, and northwestern Africa.",
    shortDesc = "Perennial herbs that lack",
    textP2 = "Species, cultivars and hybrids are all widely " +
            "grown for their beauty and often are fragrant. " +
            "Roses have acquired cultural significance " +
            "in many societies. Rose plants range in size " +
            "from compact, miniature roses, to climbers " +
            "that can reach seven meters in height." +
            " Different species hybridize" +
            " easily, and this has been used in the development " +
            "of the wide range of garden roses.",
    photo = R.drawable.rose
)