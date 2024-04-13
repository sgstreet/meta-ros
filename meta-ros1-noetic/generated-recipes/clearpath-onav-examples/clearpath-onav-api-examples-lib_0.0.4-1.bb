# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Examples library to show how to use CPR OutdoorNav API"
AUTHOR = "Jason Higgins <jhiggins@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=1fcc2f243daac9b962ca04b90988c4f3"

ROS_CN = "clearpath_onav_examples"
ROS_BPN = "clearpath_onav_api_examples_lib"

ROS_BUILD_DEPENDS = " \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    clearpath-msgs \
    geometry-msgs \
    nav-msgs \
    python3-pyproj \
    rospy \
    sensor-msgs \
    std-msgs \
    wireless-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/clearpath_onav_examples-release/archive/release/noetic/clearpath_onav_api_examples_lib/0.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/clearpath_onav_api_examples_lib"
SRC_URI = "git://github.com/clearpath-gbp/clearpath_onav_examples-release;${ROS_BRANCH};protocol=https"
SRCREV = "2fc969061c004870cee7e2d553f2440c41f3dc12"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
