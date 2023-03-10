//
// Copyright 2018 LINE Corporation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

#pragma once

#ifdef BUILD_DEBUG

#include<android/log.h>

#define LOGV(...) __android_log_print(ANDROID_LOG_VERBOSE, "apng-drawable", __VA_ARGS__)
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG  , "apng-drawable", __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO   , "apng-drawable", __VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN   , "apng-drawable", __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR  , "apng-drawable", __VA_ARGS__)

#else

#define LOGV(...)
#define LOGD(...)
#define LOGI(...)
#define LOGW(...)
#define LOGE(...)

#endif