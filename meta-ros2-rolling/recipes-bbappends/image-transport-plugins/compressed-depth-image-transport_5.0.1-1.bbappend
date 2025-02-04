LICENSE = "BSD-3-Clause"
inherit ${@bb.utils.contains("MACHINE_FEATURES", "cuda", "cuda", "", d)}
