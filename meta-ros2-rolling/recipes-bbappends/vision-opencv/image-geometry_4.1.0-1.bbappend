# Copyright (c) 2022-2023 Wind River Systems, Inc.

inherit ${@bb.utils.contains("MACHINE_FEATURES", "cuda", "cuda", "", d)}

ROS_BUILD_DEPENDS += " \
    service-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    python3-numpy-native \
"

LICENSE = "BSD-3-Clause"
