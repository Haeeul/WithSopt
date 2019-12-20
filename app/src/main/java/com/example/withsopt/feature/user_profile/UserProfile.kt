package com.example.withsopt.feature.user_profile


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.withsopt.R

/**
 * A simple [Fragment] subclass.
 */
class UserProfile : Fragment() {
    var UserId = "dafault"
    var Username = "default"
    var UserDescription = "default"

    private lateinit var txtProfileId: TextView
    private lateinit var txtProfileName: TextView
    private lateinit var txtProfileDes: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_user_profile, container, false)

        txtProfileId = view.findViewById(R.id.profile_id)
        txtProfileName = view.findViewById(R.id.profile_name)
        txtProfileDes = view.findViewById(R.id.profile_description)

        txtProfileId.text = UserId
        txtProfileName.text = Username
        txtProfileDes.text = UserDescription

        return view
    }


}
