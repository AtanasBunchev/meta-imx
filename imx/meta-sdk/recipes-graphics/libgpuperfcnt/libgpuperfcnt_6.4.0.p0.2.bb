DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI[arm-fb.md5sum] = "614605ad9a88f441bd03d72a609918c1"
SRC_URI[arm-fb.sha256sum] = "292cf20ed89d6daa561993379afe1a467b37c89dd7c83605d06a2cf08edd1e6b"

SRC_URI[arm-wayland.md5sum] = "b8c872bc17d64c1d58e13e1c57aa1608"
SRC_URI[arm-wayland.sha256sum] = "38169d3956fe1fb2e60422f7bd110bd7c0c184a394cca4c136b2606ff2f644dd"

SRC_URI[arm-x11.md5sum] = "9b37302b2bd8cf4d7d8256187d7bf6e2"
SRC_URI[arm-x11.sha256sum] = "5d492c57e49545b050a0b6623b5b3381b0545b188efd9553e4fd76658e87878e"

SRC_URI[aarch64-fb.md5sum] = "aedc9d95878b80661e46511983d0ed6e"
SRC_URI[aarch64-fb.sha256sum] = "ad19e7f36e52f3c476f067582d47f60a120f7dc16bd15150c6a7cdbf33521f32"

SRC_URI[aarch64-wayland.md5sum] = "bb2f297526315eff99e0744346411b12"
SRC_URI[aarch64-wayland.sha256sum] = "b5fe0adcbc5199c86129f138b529bbf0df8da970fa94dd204f39e683def2c22a"

SRC_URI[aarch64-x11.md5sum] = "da3d29f2506373d02d2b056d32c327dd"
SRC_URI[aarch64-x11.sha256sum] = "f9f5d87d09d4843b24fde525c043f29b87577d425231765363e6dfda6d99e8fb"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
