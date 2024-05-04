# Copyright (c) 2020 LG Electronics, Inc.
# Copyright (c) 2022 Wind River Systems, Inc.

LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=14;md5=0f8b314dbd405ad7dfa6ed255e6c178c"

FILES:${PN}-dev += "${datadir}/orocos_kdl/cmake/*.cmake"

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://0001-use-system-pykdl.patch"

DEPENDS += "python3-pykdl"

inherit ros_insane_dev_so
inherit python3-dir

export PYTHON_DIR
