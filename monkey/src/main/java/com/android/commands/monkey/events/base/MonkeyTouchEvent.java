/*
 * Copyright (C) 2010 The Android Open Source Project
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

package com.android.commands.monkey.events.base;

import android.view.InputDevice;

import com.android.commands.monkey.events.MonkeyEvent;
import com.android.commands.monkey.events.base.MonkeyMotionEvent;

/**
 * monkey touch event
 */
public class MonkeyTouchEvent extends MonkeyMotionEvent {
    public MonkeyTouchEvent(int action) {
        super(MonkeyEvent.EVENT_TYPE_TOUCH, InputDevice.SOURCE_TOUCHSCREEN, action);
    }

    @Override
    protected String getTypeLabel() {
        return "Touch";
    }
}