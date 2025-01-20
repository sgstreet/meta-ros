# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Msgs of (Yet Another State MachINe)"
AUTHOR = "Miguel Ángel González Santamarta <mgons@unileon.es>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=f7455b89fc1cd18dbf3c0518d5d21928"

ROS_CN = "yasmin"
ROS_BPN = "yasmin_msgs"

ROS_BUILD_DEPENDS = " \
    rosidl-default-generators \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rosidl-default-generators \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-generators \
"

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

# matches with: https://github.com/ros2-gbp/yasmin-release/archive/release/jazzy/yasmin_msgs/3.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/yasmin_msgs"
SRC_URI = "git://github.com/ros2-gbp/yasmin-release;${ROS_BRANCH};protocol=https"
SRCREV = "f84e31ef1304312665661854407091b59749fc06"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
