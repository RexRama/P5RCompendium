package com.ramarai.p5rcompendium

import android.content.Intent

import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.ramarai.p5rcompendium.databinding.ActivityDetailBinding


@Suppress("DEPRECATION")
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var shareButton: Button

    companion object {
        const val EXTRA_PERSONA = "key_persona"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        detailView()
        shareButton = binding.actionShare
        shareButton.setOnClickListener{
            val persona = intent.getParcelableExtra<Persona>(EXTRA_PERSONA) ?: return@setOnClickListener
            val personaUserTextView = binding.tvDetailUser
            val personaUser = personaUserTextView.text.toString()

            val shareText = """
                ${persona.personaName}
                ${persona.personaDescription}
                Persona User: $personaUser
                """.trimIndent()

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareText)
            startActivity(Intent.createChooser(shareIntent, "Share"))
        }


    }
    private fun detailView(){
        val dataPersona = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(EXTRA_PERSONA, Persona::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_PERSONA)
        }
        Glide.with(this)
            .load(dataPersona?.personaPicture)
            .into(binding.imgItemPhoto)
        binding.tvDetailName.text = dataPersona?.personaName
        binding.tvDetailDescription.text = dataPersona?.personaDescription
        when (dataPersona?.personaName) {
            "Arsene" , "Satanael" , "Raoul" -> {
                with(resources) {
                    binding.tvDetailUser.text = getStringArray(R.array.user_array)[0]
                    binding.tvDetailArcana.text = getStringArray(R.array.arcana_array)[0]
                    binding.tvDetailOverview.text = getString(R.string.joker)
                }
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[0])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[0])
                    .into(binding.imgItemArcana)

            }
            "Zorro" , "Diego" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[1]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[1]
                binding.tvDetailOverview.text = getString(R.string.mona)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[1])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[1])
                    .into(binding.imgItemArcana)
            }
            "Captain Kidd", "William" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[2]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[2]
                binding.tvDetailOverview.text = getString(R.string.skull)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[2])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[2])
                    .into(binding.imgItemArcana)
            }
            "Carmen", "Célestine" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[3]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[3]
                binding.tvDetailOverview.text = getString(R.string.panther)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[3])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[3])
                    .into(binding.imgItemArcana)
            }
            "Goemon", "Gorokichi" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[4]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[4]
                binding.tvDetailOverview.text = getString(R.string.fox)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[4])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[4])
                    .into(binding.imgItemArcana)
            }
            "Johanna", "Agnes" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[5]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[5]
                binding.tvDetailOverview.text = getString(R.string.queen)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[5])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[5])
                    .into(binding.imgItemArcana)
            }
            "Necronomicon", "Al Aziz" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[6]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[6]
                binding.tvDetailOverview.text = getString(R.string.oracle)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[6])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[6])
                    .into(binding.imgItemArcana)
            }
            "Milady", "Lucy" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[7]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[7]
                binding.tvDetailOverview.text = getString(R.string.noir)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[7])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[7])
                    .into(binding.imgItemArcana)
            }
            "Robin Hood", "Loki" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[8]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[8]
                binding.tvDetailOverview.text = getString(R.string.crow)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[8])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[8])
                    .into(binding.imgItemArcana)
            }
            "Cendrillon" -> {
                binding.tvDetailUser.text = resources.getStringArray(R.array.user_array)[9]
                binding.tvDetailArcana.text = resources.getStringArray(R.array.arcana_array)[9]
                binding.tvDetailOverview.text = getString(R.string.violet)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.userPicture)[9])
                    .into(binding.imgItemUser)
                Glide.with(this)
                    .load(resources.getStringArray(R.array.arcana_img)[9])
                    .into(binding.imgItemArcana)
            }

        }
    }
}