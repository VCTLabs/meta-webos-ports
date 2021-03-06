SUMMARY = "Preware is a webOS on-device homebrew installer."
SECTION = "webos/apps"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb723b61539feef013de476e68b5c50a"

inherit webos_public_repo
inherit webos_arch_indep
inherit webos_enyojs_application

PV = "2.0.2+gitr${SRCPV}"

SRCREV = "8c832c1495bfab1293d1c458aacdfe898adeb178"
SRC_URI = "git://github.com/webOS-ports/preware;protocol=git;branch=master"
S = "${WORKDIR}/git"
