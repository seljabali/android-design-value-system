package com.seljabali.designvaluesystem.ui.spacings.verticalspacings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_vertical_spacings.*

class VerticalSpacingsFragment : BaseFragment() {

    companion object {
        val TAG: String = VerticalSpacingsFragment::class.java.simpleName
        fun newInstance() = VerticalSpacingsFragment()
    }

    lateinit var verticalSpacingsAdapter: VerticalSpacingsAdapter

    override fun getToolbarTitle(): String = getString(R.string.vertical_spacings)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(
        R.layout.fragment_vertical_spacings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        verticalSpacingsAdapter = VerticalSpacingsAdapter()
        verticalSpacingsAdapter.setVerticalSpacings(VerticalSpacings.values())
        verticalSpacingsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL))
            adapter = verticalSpacingsAdapter
        }
    }

}