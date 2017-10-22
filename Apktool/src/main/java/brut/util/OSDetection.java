/**
 *  Copyright 2014 Ryszard Wiśniewski <brut.alll@gmail.com>
 *  Copyright 2013 Connor Tumbleson <connor.tumbleson@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package brut.util;

import android.os.Build;

public class OSDetection {
    private static String CPU_TYPE = Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;

    public static boolean isX86() {
        return CPU_TYPE.contains("86");
    }

    public static boolean isArm() {
        return CPU_TYPE.contains("arm");
    }

    public static String returnCPUType() {
        return CPU_TYPE;
    }
}
