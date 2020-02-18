package de.codereddev.tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_start.view.*

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_start, container, false)

        rootView.button_next.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, TabsFragment())
                ?.addToBackStack(null)?.commit()
        }

        return rootView
    }
}