package com.example.subbu.bottomsheets

import android.annotation.SuppressLint
import android.app.Dialog
import android.support.design.widget.BottomSheetDialogFragment
import android.view.View

/**
 * Created by saravanan on 10-Sep-17.
 */
 class BottomsheetDialog : BottomSheetDialogFragment(){
    @SuppressLint("RestrictedApi")
    override fun setupDialog(dialog: Dialog?, style: Int) {
        super.setupDialog(dialog, style)
       var contentview: View =View.inflate(context,R.layout.bottomsheet,null)
        dialog?.setContentView(contentview)
    }
}