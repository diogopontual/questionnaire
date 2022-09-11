package br.com.knowlr.questionnaire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import br.com.knowlr.questionnaire.databinding.FragmentFillsListBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FillsListFragment : Fragment() {

private var _binding: FragmentFillsListBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


      _binding = FragmentFillsListBinding.inflate(inflater, container, false)
      return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val fills = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor"
        )

        // access the listView from xml file
        var mListView = view.findViewById<ListView>(R.id.fillslist)
        arrayAdapter = ArrayAdapter(view.context, android.R.layout.simple_list_item_1, fills)
        mListView.adapter = arrayAdapter

    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}