/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.contacts.list;

import android.content.Context;
import android.util.AttributeSet;

/**
 * A ContactTileSquare displays the contact's picture overlayed with their name
 * in a perfect square.
 */
public class ContactTileSquareView extends ContactTileView {
    private final static String TAG = ContactTileSquareView.class.getSimpleName();

    public ContactTileSquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // Getting how much space is currently available and telling our
        // Children to split it.
        int width = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        int childMeasureSpec = MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY);
        measureChildren(childMeasureSpec, childMeasureSpec);
        setMeasuredDimension(width, width);
    }
}
