# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "A package which extends 'ros_base' and includes simulation packages."
AUTHOR = "Louise Poubel <louise@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "variants"
ROS_BPN = "simulation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ros-ign-bridge} \
    ${ROS_UNRESOLVED_DEP-ros-ign-gazebo} \
    ${ROS_UNRESOLVED_DEP-ros-ign-image} \
    ${ROS_UNRESOLVED_DEP-ros-ign-interfaces} \
    ros-base \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/variants-release/archive/release/rolling/simulation/0.10.0-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/simulation"
SRC_URI = "git://github.com/ros2-gbp/variants-release;${ROS_BRANCH};protocol=https"
SRCREV = "342143a07b9f8e8b8f8fe84148ab2c793b1af7c7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}