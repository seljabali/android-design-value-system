package com.seljabali.designvaluesystem.ui.textsizes.appcompat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.seljabali.designvaluesystem.R
import com.seljabali.designvaluesystem.ui.BaseFragment
import com.seljabali.designvaluesystem.ui.textsizes.TextStyles
import com.seljabali.designvaluesystem.ui.textsizes.TextStylesAdapter
import kotlinx.android.synthetic.main.fragment_app_compat_text_sizes.*

class AppCompatTextSizesFragment : BaseFragment() {

    companion object {
        val TAG: String = AppCompatTextSizesFragment::class.java.simpleName
        fun newInstance() = AppCompatTextSizesFragment()
    }

    lateinit var textStylesAdapter: TextStylesAdapter

    override fun getToolbarTitle(): String = getString(R.string.app_compat_text_sizes)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_app_compat_text_sizes, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textStylesAdapter = TextStylesAdapter()
        textStylesAdapter.setTextStyles(AppCompatTextAppearances.values() as Array<TextStyles>)
        textSizesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            adapter = textStylesAdapter
        }
    }

}