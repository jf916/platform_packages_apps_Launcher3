/*
 * Copyright (C) 2024 The Android Open Source Project
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

package com.android.launcher3.taskbar.bubbles.stashing

import com.android.launcher3.DeviceProfile
import com.android.launcher3.taskbar.TaskbarActivityContext
import com.android.launcher3.taskbar.bubbles.stashing.BubbleStashController.TaskbarHotseatDimensionsProvider

/**
 * Implementation of the [TaskbarHotseatDimensionsProvider] that take sizes from the
 * [DeviceProfile].
 */
class DeviceProfileDimensionsProviderAdapter(
    private val taskbarActivityContext: TaskbarActivityContext
) : TaskbarHotseatDimensionsProvider {
    override fun getTaskbarBottomSpace(): Int = deviceProfile().taskbarBottomMargin

    override fun getTaskbarHeight(): Int = deviceProfile().taskbarHeight

    override fun getHotseatBottomSpace(): Int = deviceProfile().hotseatBarBottomSpacePx

    override fun getHotseatHeight(): Int = deviceProfile().hotseatCellHeightPx

    private fun deviceProfile(): DeviceProfile = taskbarActivityContext.deviceProfile
}