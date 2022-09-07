package com.example.hypstuma2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class ContactUsFragment : Fragment() {

    private lateinit var fb : ImageView
    private lateinit var insta : ImageView
    private lateinit var ln :ImageView
    private lateinit var yt : ImageView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contact_us,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fb=view.findViewById(R.id.fb)
        insta=view.findViewById(R.id.insta)
        ln=view.findViewById(R.id.linkedin)
        yt=view.findViewById(R.id.yt)

        fb.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                gotoUrl("https://www.facebook.com/HYPSTUMA/")
            }
        })

        insta.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                gotoUrl("https://www.instagram.com/hypstuma/")
            }
        })

        ln.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                gotoUrl("https://www.linkedin.com/company/hypstuma%C2%AE/")
            }
        })

        yt.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                gotoUrl("https://www.youtube.com/channel/UC8dcdiUMrktrMxFq00GL5SA")
            }
        })
    }

    private fun gotoUrl(s: String) {
        val uri= Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW,uri))
    }

}