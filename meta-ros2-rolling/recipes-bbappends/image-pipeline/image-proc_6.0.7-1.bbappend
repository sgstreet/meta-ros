# Copyright (c) 2024 Wind River Systems, Inc.

inherit ${@bb.utils.contains("MACHINE_FEATURES", "cuda", "cuda", "", d)}

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://new-api-for-opencv-aruco.patch"

LICENSE = "BSD-3-Clause"
