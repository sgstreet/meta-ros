# Copyright (c) 2020 LG Electronics, Inc.

LICENSE = "BSD-3-Clause"

inherit ${@bb.utils.contains("MACHINE_FEATURES", "cuda", "cuda", "", d)}

ROS_BUILDTOOL_DEPENDS += " \
    eigen3-cmake-module \
"
