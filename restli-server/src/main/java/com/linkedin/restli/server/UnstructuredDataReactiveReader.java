/*
   Copyright (c) 2018 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.linkedin.restli.server;

import com.linkedin.data.ByteString;
import com.linkedin.entitystream.EntityStream;

/**
 * This is used for reading a binary unstructured data reactive service request. An instance of this class should be
 * provided to developer by Rest.li as part of the UnstructuredData-based resource interface.
 * UnstructuredDataReactiveReader provides getter for request headers and an {@link EntityStream} for reading the
 * unstructured data content.
 */

public class UnstructuredDataReactiveReader {
  private EntityStream<ByteString> _entityStream;
  private String  _contentType;

  public UnstructuredDataReactiveReader(EntityStream<ByteString> entityStream, String contentType)
  {
    _entityStream = entityStream;
    _contentType = contentType;
  }

  /**
   * Get the MIME content-type of the unstructured data.
   */
  public String getContentType()
  {
    return _contentType;
  }

  /**
   * Return the underlying EntityStream for reading unstructured data content.
   */
  public EntityStream<ByteString> getEntityStream()
  {
    return _entityStream;
  }
}
