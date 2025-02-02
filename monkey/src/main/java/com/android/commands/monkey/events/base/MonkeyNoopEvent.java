/*
 * Copyright (c) 2020 Bytedance Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.commands.monkey.events.base;

import android.app.IActivityManager;
import android.view.IWindowManager;

import com.android.commands.monkey.events.MonkeyEvent;
import com.android.commands.monkey.utils.Logger;

/**
 * monkey noop event (don't do anything).
 */
public class MonkeyNoopEvent extends MonkeyEvent {

    public MonkeyNoopEvent() {
        super(MonkeyEvent.EVENT_TYPE_NOOP);
    }

    @Override
    public int injectEvent(IWindowManager iwm, IActivityManager iam, int verbose) {
        // No real work to do
        if (verbose > 1) {
            Logger.println("NOOP");
        }
        return MonkeyEvent.INJECT_SUCCESS;
    }
}
