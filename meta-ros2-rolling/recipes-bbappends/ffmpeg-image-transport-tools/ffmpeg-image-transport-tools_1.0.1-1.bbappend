inherit pkgconfig
inherit ${@bb.utils.contains("MACHINE_FEATURES", "cuda", "cuda", "", d)}

