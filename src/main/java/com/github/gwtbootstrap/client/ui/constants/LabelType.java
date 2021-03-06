/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.client.ui.constants;

import com.github.gwtbootstrap.client.ui.base.Style;

//@formatter:off
/**
* Type of the Label.
* 
* @since 2.0.4.0
* 
* @author Dominik Mayer
* 
* @see <a href="http://getbootstrap.com/2.3.2/components.html#labels-badges">Bootstrap documentation</a>
* 
*/
//@formatter:on
public enum LabelType implements Style {

	DEFAULT(""),

	SUCCESS("label-success"),

	WARNING("label-warning"),

	IMPORTANT("label-important"),

	INFO("label-info"),

	INVERSE("label-inverse");

	private String className;

	private LabelType(String className) {
		this.className = className;
	}

	public String get() {
		return className;
	}
}
