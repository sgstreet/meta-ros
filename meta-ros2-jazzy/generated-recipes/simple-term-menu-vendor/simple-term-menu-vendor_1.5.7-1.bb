# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "A Python package which creates simple interactive menus on the command line."
AUTHOR = "rkreinin <rkreinin@clearpathrobotics.com>"
ROS_AUTHOR = "Ingo Meyer <i.meyer@fz-juelich.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "simple_term_menu_vendor"
ROS_BPN = "simple_term_menu_vendor"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/simple_term_menu_vendor-release/archive/release/jazzy/simple_term_menu_vendor/1.5.7-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/simple_term_menu_vendor"
SRC_URI = "git://github.com/clearpath-gbp/simple_term_menu_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "6ab8fbe31338a72360563ee2b2f44ba1512e745d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
