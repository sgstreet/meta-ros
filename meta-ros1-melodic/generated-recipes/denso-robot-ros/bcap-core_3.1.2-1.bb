# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The bcap core package includes libraries for communicating ORiN via b-CAP (Binary - Controller Access Protocol) protocol."
AUTHOR = "DENSO WAVE INCORPORATED <fa-support@denso-wave.com>"
ROS_AUTHOR = "DENSO WAVE INCORPORATED <fa-support@denso-wave.com>"
HOMEPAGE = "http://ros.org/wiki/bcap_core"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "denso_robot_ros"
ROS_BPN = "bcap_core"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DENSORobot/denso_robot_ros-release/archive/release/melodic/bcap_core/3.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/bcap_core"
SRC_URI = "git://github.com/DENSORobot/denso_robot_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "b4942c36831ac74fb39a02fc8b74b235f8212580"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
