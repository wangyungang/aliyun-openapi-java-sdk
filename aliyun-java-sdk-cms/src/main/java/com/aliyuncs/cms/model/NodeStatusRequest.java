/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class NodeStatusRequest extends RpcAcsRequest<NodeStatusResponse> {

	public NodeStatusRequest() {
		super("Cms", "2016-03-18", "NodeStatus");
	}

	private String instanceId;

	public String getInstanceId() {
		return this.instanceId;
	}

	/**
	 * 
	 * @param instanceId
	 *            ECS实例ID,必填
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	@Override
	public Class<NodeStatusResponse> getResponseClass() {
		return NodeStatusResponse.class;
	}

}
