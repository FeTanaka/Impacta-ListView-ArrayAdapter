package br.com.impacta.listviewarrayadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import br.com.impacta.listviewarrayadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val AndroidVersionList = mutableListOf<String>(
        "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
        "Honycomb", "Ice cream sandwich", "Jelly Bean",
        "Kitkat", "Lollipop", "Marshmallow", "Nougat",
        "Oreo", "Pie", "11", "12", "13"
    )

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val adapter = ArrayAdapter<String>(this, R.layout.layout_simples, AndroidVersionList)
        val adapter = ArrayAdapter<String>(this, R.layout.layout_complicado, R.id.textView, AndroidVersionList)
        binding.listView.adapter = adapter
    }
}