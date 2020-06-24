package xsupermu.android.qibla.qibla

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import xsupermu.android.qibla.R
import xsupermu.android.qibla.databinding.FragmentQiblaBinding

class QiblaFragment : Fragment() {

	private lateinit var QiblaViewModel: QiblaViewModel
	private lateinit var Binding: FragmentQiblaBinding

	override fun onCreateView(
			inflater: LayoutInflater, container: ViewGroup?,
			savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_qibla, container, false)
	}

}