# Copyright (c) 2024 Wind River Systems, Inc.

LICENSE = "Apache-2.0"

inherit ${@bb.utils.contains("MACHINE_FEATURES", "cuda", "cuda", "", d)}
