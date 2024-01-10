package com.example.notes.ui.draws

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.notes.databinding.FragmentDrawsBinding

class DrawsFragment : Fragment() {

    private var _binding: FragmentDrawsBinding? = null
    private val binding get() = _binding!!
    private val drawsViewModel by viewModels<DrawsViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentDrawsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}