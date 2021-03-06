/*
 * Copyright (C) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.dataflow.sdk.util;

import com.google.cloud.dataflow.sdk.transforms.windowing.BoundedWindow;
import com.google.cloud.dataflow.sdk.values.PCollectionView;

/**
 * A {@link SideInputReader} that allows callers to check to see if a {@link PCollectionView} has
 * had its contents set in a window.
 */
public interface ReadyCheckingSideInputReader extends SideInputReader {
  /**
   * Returns true if the {@link PCollectionView} is ready in the provided {@link BoundedWindow}.
   */
  boolean isReady(PCollectionView<?> view, BoundedWindow window);
}

