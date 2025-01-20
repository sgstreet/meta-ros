# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "RTAB-Map's rviz plugins."
AUTHOR = "Mathieu Labbe <matlabbe@gmail.com>"
ROS_AUTHOR = "Mathieu Labbe"
HOMEPAGE = "https://github.com/introlab/rtabmap_ros/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtabmap_ros"
ROS_BPN = "rtabmap_rviz_plugins"

ROS_BUILD_DEPENDS = " \
    pcl-conversions \
    pluginlib \
    rclcpp \
    rtabmap-conversions \
    rtabmap-msgs \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
    sensor-msgs \
    std-msgs \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    pcl-conversions \
    pluginlib \
    rclcpp \
    rtabmap-conversions \
    rtabmap-msgs \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
    sensor-msgs \
    std-msgs \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pcl-conversions \
    pluginlib \
    rclcpp \
    rtabmap-conversions \
    rtabmap-msgs \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
    sensor-msgs \
    std-msgs \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/introlab/rtabmap_ros-release/archive/release/jazzy/rtabmap_rviz_plugins/0.21.9-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/rtabmap_rviz_plugins"
SRC_URI = "git://github.com/introlab/rtabmap_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "591be4beecc6b0fff4030dfc9cc2e397046b3af5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
