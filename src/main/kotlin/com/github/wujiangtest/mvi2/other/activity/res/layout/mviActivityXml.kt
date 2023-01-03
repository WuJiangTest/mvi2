package com.github.wujiangtest.mvi2.other.activity.res.layout

import com.github.wujiangtest.mvi2.other.PathConst

fun mviActivityXml(
    packageName: String,
    activityClass: String,
    layoutName: String
) = """
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android">
    <data>
        <variable
            name="vm"
            type="${packageName}.${
    PathConst.transferPagePackage(
    layoutName.replace(
        "activity_", ""
    )
)}.${activityClass}ViewModel" />
    </data>
    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">



    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
"""