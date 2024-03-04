package com.ramarai.p5rcompendium

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Persona(
    val personaName: String,
    val personaPicture: String,
    val personaDescription: String,
) : Parcelable

val personaByUsers: Map<String, List<Persona>> = mapOf(
    "Ren Amamiya" to listOf(
        Persona("Arsene", "https://static.wikia.nocookie.net/megamitensei/images/1/19/Arsene.png", "A being based off the main character of Maurice Leblanc's novels, Arsène Lupin. He appears everywhere and is a master of disguise. He is known to help law-abiding citizens."),
        Persona("Satanael", "https://static.wikia.nocookie.net/megamitensei/images/c/c8/Satanael_Render.png", "An archangel who is said to be the form of Satan before he fell from Heaven. The second son of God, he rebelled against Him for freedom and bestowed free will and chaos upon humanity."),
        Persona("Raoul","https://static.wikia.nocookie.net/megamitensei/images/b/b0/Raoul_Render.png", "Another alias of Maurice Leblanc's hero, Arsène Lupin. Infamous as a phantom thief, he was also known to be a man of many friends, lovers, and treasured allies."
        )
    ),
    "Morgana" to listOf(
        Persona("Zorro","https://static.wikia.nocookie.net/megamitensei/images/f/fd/S06_chara8igscs.png", "A masked swordsman of justice who fought in California against corrupt officials during the era of Spanish rule. He always left his \"Z\" mark with his rapier wherever he appeared."),
        Persona("Diego","https://static.wikia.nocookie.net/megamitensei/images/6/68/Diego.png", "The true name of California's masked swordsman of justice, who fought corrupt officials during the era of Spanish rule. Despite being marked as a thief, he fought for the weak as a true gentleman.")
    ),
    "Ryuji Sakamoto" to listOf(
        Persona("Captain Kidd","https://static.wikia.nocookie.net/megamitensei/images/f/f7/S06_chara46lsx7.png", "A 17th century privateer who eventually became a world-renowned pirate. At his execution, he declared he had a hidden treasure, leaving behind many legends."),
        Persona("William","https://static.wikia.nocookie.net/megamitensei/images/4/40/P5RWilliam.png", "The other name of Captain Kidd, world-renowned pirate. For years after his death, songs and legends of his life inspired many to chase rumors of his buried treasure across the seas.")
    ),
    "Ann Takamaki" to listOf(
        Persona("Carmen","https://static.wikia.nocookie.net/megamitensei/images/a/a6/S06_chara69jsyf.png", "A gypsy thief from the novel by Merimee, which became famous through the opera by Bizet. She is a femme fatale who is beautiful but very capricious."),
        Persona("Célestine","https://static.wikia.nocookie.net/megamitensei/images/b/b8/P5RCelestine.png", "A beautiful actress who performed as Carmen in the opera named for the role. So tempestuous and outspoken was she that it's said the main role was rewritten to better suit her." )
    ),
    "Yusuke Kitagawa" to listOf(
        Persona("Goemon","https://static.wikia.nocookie.net/megamitensei/images/2/2a/P5-Goemon.png", "Ishikawa Goemon was a thief who stole from the rich and gave to the poor in Japan during the Azuchi-Momoyama period. The kabuki scene of him sitting on the gate of Nanzen-ji is famous."),
        Persona("Gorokichi","https://static.wikia.nocookie.net/megamitensei/images/4/46/P5RGorokichi.png", "Childhood nickname of Goemon Ishikawa. During his youth, he was raised among the Iga-ryu ninjas before he set off on his own to become a rogue ninja.")
    ),
    "Makoto Niijima" to listOf(
        Persona("Johanna","https://static.wikia.nocookie.net/megamitensei/images/2/21/P5_Johanna.png", "The mysterious female pope of the Middle Ages. She posed as a man and eventually made it all the way up to pope due to her unrivaled intellect. Her existence shook the history of the Catholic church."),
        Persona("Agnes","https://static.wikia.nocookie.net/megamitensei/images/f/f5/AgnesP5R.png", "Another name of Johanna, the female pope of the middle ages. Posing as a man, her wits and ability helped her climb the ranks. Her story shook the Catholic Church to its core.")
    ),
    "Futaba Sakura" to listOf(
        Persona("Necronomicon","https://static.wikia.nocookie.net/megamitensei/images/1/1e/P5_Necronomicon.png", "The grimoire which contains vital information of the Cthulhu mythos by Lovecraft. Its original name is Al Azif. It is said the book itself is alive."),
        Persona("Al Aziz","https://static.wikia.nocookie.net/megamitensei/images/f/f2/Al_Azif.png", "The original name of the Necronomicon, a tome of the Cthulhu Mythos's mysteries. Said to have been authored by Abdul Alhazred, a poet and devotee of Cthulhu known as the 'mad Arab.")
    ),
    "Haru Okumura" to listOf(
        Persona("Milady","https://static.wikia.nocookie.net/megamitensei/images/4/40/P5milady.png", "The beautiful woman that appears in Dumas' \"Three Musketeers\". Branded with a fleur-de-lis symbol, she used many aliases to control nobility and get her vengeance."),
        Persona("Lucy","https://static.wikia.nocookie.net/megamitensei/images/c/ce/LucyP5R.png", "The Countess of Carlisle, and the historical basis for Alexandre Dumas's femme fatale, Milady de Winter. Known for her beauty and cunning, she was a courtier much favored by the Queen.")
    ),
    "Goro Akechi" to listOf(
        Persona("Robin Hood","https://static.wikia.nocookie.net/megamitensei/images/a/a8/Robin_Hood_P5R.png", "A noble thief that made waves in England during the Middle Ages. He is an expert archer and leader of the Merry Men, outlaws of justice who made Sherwood Forest their home."),
        Persona("Loki","https://static.wikia.nocookie.net/megamitensei/images/2/2c/Loki_Artwork.png", "A malignant god of Norse mythology. Not always driven by malice, but impulsive and devious. He had an uneasy peace with Odin and the gods, but his part in Baldr's death drove them to finally punish him.")
    ),
    "Sumira Yoshizawa" to listOf(
        Persona("Cendrillon", "https://static.wikia.nocookie.net/megamitensei/images/1/1d/P5RCendrillon.png", "The French name of the titular heroine of Cinderella, an oft-retold tale of great renown in which a mistreated waif gains luxury, beauty, and a single night's dance with a prince through the power of magic."),
    )

)

data class imgUser(val name: String, val imageResId: Int){

}