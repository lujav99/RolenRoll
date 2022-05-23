package code.with.cal.cardviewrecyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import code.with.cal.cardviewrecyclerviewtutorial.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pjID = intent.getIntExtra(pj-ID, -1)
        val pj = pjFromID(pjID)
        if(pj != null)
        {
            binding.nombre.text = pj.nombre
            binding.raza.text = pj.raza
            binding.clase.text = pj.clase
        }
    }

    private fun pjFromID(pjID: Int): Personaje?
    {
        for(pj in listaPj)
        {
            if(pj.id == pjID)
                return pj
        }
        return null
    }
}