/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package code.name.monkey.retromusic.extensions

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import code.name.monkey.appthemehelper.ThemeStore
import code.name.monkey.appthemehelper.util.ATHUtil
import code.name.monkey.appthemehelper.util.ColorUtil
import code.name.monkey.retromusic.R

fun Int.ripAlpha(): Int {
    return ColorUtil.stripAlpha(this)
}

fun Context.accentColor(): Int {
    return ThemeStore.accentColor(this)
}

fun View.accentColor(): Int {
    return ThemeStore.accentColor(context)
}

fun Fragment.accentColor(): Int {
    return ThemeStore.accentColor(requireContext())
}

fun Context.surfaceColor(): Int {
    return ATHUtil.resolveColor(this, R.attr.colorSurface, Color.WHITE)
}

fun View.surfaceColor(): Int {
    return ATHUtil.resolveColor(context, R.attr.colorSurface, Color.WHITE)
}

fun Fragment.surfaceColor(): Int {
    return ATHUtil.resolveColor(requireContext(), R.attr.colorSurface, Color.WHITE)
}

fun Toolbar.backgroundTintList() {
    val surfaceColor = ATHUtil.resolveColor(context, R.attr.colorSurface, Color.BLACK)
    val colorStateList = ColorStateList.valueOf(surfaceColor)
    backgroundTintList = colorStateList
}

fun Context.textColorSecondary(): Int {
    return ATHUtil.resolveColor(this, android.R.attr.textColorSecondary)
}

fun Fragment.textColorSecondary(): Int {
    return ATHUtil.resolveColor(requireContext(), android.R.attr.textColorSecondary)
}

fun Context.colorControlNormal(): Int {
    return ATHUtil.resolveColor(this, android.R.attr.colorControlNormal)
}

fun View.colorControlNormal(): Int {
    return ATHUtil.resolveColor(context, android.R.attr.colorControlNormal)
}

fun Context.textColorPrimary(): Int {
    return ATHUtil.resolveColor(this, android.R.attr.textColorPrimary)
}

fun View.textColorPrimary(): Int {
    return ATHUtil.resolveColor(context, android.R.attr.textColorPrimary)
}

fun Fragment.textColorPrimary(): Int {
    return ATHUtil.resolveColor(requireContext(), android.R.attr.textColorPrimary)
}