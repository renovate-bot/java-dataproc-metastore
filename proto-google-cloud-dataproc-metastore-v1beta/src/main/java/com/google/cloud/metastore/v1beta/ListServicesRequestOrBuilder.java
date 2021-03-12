/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore.proto

package com.google.cloud.metastore.v1beta;

public interface ListServicesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.ListServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the location of metastore services to
   * list, in the following form:
   * `projects/{project_number}/locations/{location_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the location of metastore services to
   * list, in the following form:
   * `projects/{project_number}/locations/{location_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of services to return. The response may contain less
   * than the maximum number. If unspecified, no more than 500 services are
   * returned. The maximum value is 1000; values above 1000 are changed to 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous [DataprocMetastore.ListServices][google.cloud.metastore.v1beta.DataprocMetastore.ListServices]
   * call. Provide this token to retrieve the subsequent page.
   * To retrieve the first page, supply an empty page token.
   * When paginating, other parameters provided to
   * [DataprocMetastore.ListServices][google.cloud.metastore.v1beta.DataprocMetastore.ListServices] must match the call that provided the
   * page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous [DataprocMetastore.ListServices][google.cloud.metastore.v1beta.DataprocMetastore.ListServices]
   * call. Provide this token to retrieve the subsequent page.
   * To retrieve the first page, supply an empty page token.
   * When paginating, other parameters provided to
   * [DataprocMetastore.ListServices][google.cloud.metastore.v1beta.DataprocMetastore.ListServices] must match the call that provided the
   * page token.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The filter to apply to list results.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. The filter to apply to list results.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specify the ordering of results as described in [Sorting
   * Order](https://cloud.google.com/apis/design/design_patterns#sorting_order).
   * If not specified, the results will be sorted in the default order.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. Specify the ordering of results as described in [Sorting
   * Order](https://cloud.google.com/apis/design/design_patterns#sorting_order).
   * If not specified, the results will be sorted in the default order.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
