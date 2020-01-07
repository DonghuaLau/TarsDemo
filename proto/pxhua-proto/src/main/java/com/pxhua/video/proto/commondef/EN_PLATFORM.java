// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.pxhua.video.proto.commondef;

public enum EN_PLATFORM {

	PLAT_NONE(0),
	PLAT_WIN(1),
	PLAT_ANDROID(2),
	PLAT_MAC(3),
	PLAT_IOS(4),
	PLAT_IPAD(5);

	private final int value;

	private EN_PLATFORM(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.name() + ":" + this.value;
	}

	public static EN_PLATFORM convert(int value) {
		for(EN_PLATFORM v : values()) {
			if(v.value() == value) {
				return v;
			}
		}
		return null;
	}
}
