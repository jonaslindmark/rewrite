/*
 * Copyright 2020 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite;

import org.openrewrite.internal.lang.Nullable;

public interface SourceGenerator<S extends SourceFile> {
    /**
     * @return The source to generate. If an existing source file exists at the same destination,
     * it can be returned instead here to implement an "upsert" type of behavior in code generation. If
     * {@code null}, don't generate at all.
     */
    @Nullable
    S getGenerated();
}
