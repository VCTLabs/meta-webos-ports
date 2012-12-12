SUMMARY = "webOS ports first use application"
SECTION = "webos/apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit webos_public_repo
inherit webos_arch_indep
inherit enyojs_application

PV = "0.1.0+gitr${SRCPV}"
PR = "r0"

SRCREV = "99f0a66cb7a559208a28ef52a0c6abb8bb399a50"
SRC_URI = "git://github.com/webOS-ports/${PN};protocol=git"
S = "${WORKDIR}/git"
