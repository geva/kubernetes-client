/*-
 * ===============LICENSE_START=======================================================
 * Acumos
 * ===================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property & Tech Mahindra. All rights reserved.
 * ===================================================================================
 * This Acumos software file is distributed by AT&T and Tech Mahindra
 * under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * This file is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ===============LICENSE_END=========================================================
 */
package com.dockerKube.parsebean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation of Operation Signature list of a Node. IMPORTANT: This itself
 * is NOT an Arraylist.
 */

public class MapInputs implements Serializable {
	
	private static final long serialVersionUID = 619387367199699393L;
	
	@JsonProperty("input_field")
	private InputField inputField = null;
    

    public MapInputs(InputField inputField) {
		super();
		this.inputField = inputField;
	}
    public MapInputs(){
    	super();
    }

	public InputField getInputField() {
		return inputField;
	}


	public void setInputField(InputField inputField) {
		this.inputField = inputField;
	}


	@Override
    public String toString()
    {
        return "ClassPojo [inputField = "+inputField+"]";
    }
}