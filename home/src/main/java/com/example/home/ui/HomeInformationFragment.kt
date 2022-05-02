package com.example.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.home.data.response.HomeInformationModel
import com.example.home.databinding.InformationHomeFragmentBinding
import com.example.home.ui.adapter.HomeInformationAdapter
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class HomeInformationFragment : Fragment() {
    private lateinit var binding: InformationHomeFragmentBinding
    private val informationViewModel: HomeInformationViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = InformationHomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObserver()
        informationViewModel.getHomeInformation()
    }

    private fun setupObserver() {
        informationViewModel.homeInformationModel.observe(viewLifecycleOwner) {
            setupAdapter(it)
        }
    }

    private fun setupAdapter(list: List<HomeInformationModel>) {
        binding.rvList.adapter = HomeInformationAdapter(list)
    }
}
