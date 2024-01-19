# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The depthai_descriptions package"
AUTHOR = "Sachin Guruswamy <sachin@luxonis.com>"
ROS_AUTHOR = "Adam Serafin"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "depthai-ros"
ROS_BPN = "depthai_descriptions"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    robot-state-publisher \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/luxonis/depthai-ros-release/archive/release/humble/depthai_descriptions/2.9.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/depthai_descriptions"
SRC_URI = "git://github.com/luxonis/depthai-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "3f33f92593b00215e907f0dd2a2416f7f2c1f906"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}