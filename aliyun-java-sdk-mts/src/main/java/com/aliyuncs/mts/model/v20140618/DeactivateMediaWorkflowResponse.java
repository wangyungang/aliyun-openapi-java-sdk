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
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.DeactivateMediaWorkflowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeactivateMediaWorkflowResponse extends AcsResponse {

	private String requestId;

	private MediaWorkflow mediaWorkflow;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaWorkflow getMediaWorkflow() {
		return this.mediaWorkflow;
	}

	public void setMediaWorkflow(MediaWorkflow mediaWorkflow) {
		this.mediaWorkflow = mediaWorkflow;
	}

	public static class MediaWorkflow {

		private String mediaWorkflowId;

		private String name;

		private String topology;

		private String state;

		private String creationTime;

		public String getMediaWorkflowId() {
			return this.mediaWorkflowId;
		}

		public void setMediaWorkflowId(String mediaWorkflowId) {
			this.mediaWorkflowId = mediaWorkflowId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTopology() {
			return this.topology;
		}

		public void setTopology(String topology) {
			this.topology = topology;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public DeactivateMediaWorkflowResponse getInstance(UnmarshallerContext context) {
		return	DeactivateMediaWorkflowResponseUnmarshaller.unmarshall(this, context);
	}
}
