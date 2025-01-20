# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Turtlebot4 Gazebo Toolbox"
AUTHOR = "rkreinin <rkreinin@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot4_simulator"
ROS_BPN = "turtlebot4_gz_toolbox"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-action \
    rcutils \
    ros-gz-interfaces \
    sensor-msgs \
    std-msgs \
    turtlebot4-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-action \
    rcutils \
    ros-gz-interfaces \
    sensor-msgs \
    std-msgs \
    turtlebot4-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-action \
    rcutils \
    ros-gz-interfaces \
    sensor-msgs \
    std-msgs \
    turtlebot4-msgs \
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

# matches with: https://github.com/ros2-gbp/turtlebot4_simulator-release/archive/release/jazzy/turtlebot4_gz_toolbox/2.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/turtlebot4_gz_toolbox"
SRC_URI = "git://github.com/ros2-gbp/turtlebot4_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "e0981ccd502ceb8982347b9912b90c8fcce47d16"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
