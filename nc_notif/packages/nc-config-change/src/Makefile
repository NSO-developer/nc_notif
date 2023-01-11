all: fxs
.PHONY: all

# Include standard NCS examples build definitions and rules
include $(NCS_DIR)/src/ncs/build/include.ncs.mk

SRC = $(wildcard yang/*.yang)
DIRS = ../load-dir java/src/$(JDIR)/$(NS)
FXS = $(SRC:yang/%.yang=../load-dir/%.fxs)

NCSCPATH   = $(foreach dir, $(filter %/, $(wildcard ../../*/)), --yangpath $(dir)src/ncsc-out/modules/yang --yangpath $(dir)src)
YANGERPATH = $(foreach dir, $(filter %/, $(wildcard ../../*/)), --yangpath $(dir)src/ncsc-out/modules/yang --yangpath $(dir)src)

fxs: $(DIRS) $(FXS)

$(DIRS):
	mkdir -p $@

../load-dir/%.fxs: yang/%.yang
	$(NCSC)  `ls $*-ann.yang  > /dev/null 2>&1 && echo "-a $*-ann.yang"` \
             $(NCSCPATH) -c -o $@ $<

clean:
	rm -rf $(DIRS)
.PHONY: clean
