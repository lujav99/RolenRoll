package code.with.cal.cardviewrecyclerviewtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import code.with.cal.cardviewrecyclerviewtutorial.databinding.ActivityMainBinding

class ListadoDePjs : AppCompatActivity(), BookClickListener
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(ListaPj, mainActivity)
        }
    }
    override fun onClick(book: Book)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(pj-ID, book.id)
        startActivity(intent)
    }

    private fun publicarPersonaje()
    {

    }


}