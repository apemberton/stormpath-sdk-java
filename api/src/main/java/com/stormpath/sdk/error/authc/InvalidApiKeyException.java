/*
 * Copyright 2014 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.error.authc;

import com.stormpath.sdk.error.StormpathError;
import com.stormpath.sdk.resource.ResourceException;

/**
 *  A sub-class of {@link ResourceException} representing an attempt to login using an malformed credentials.
 *
 * @since 1.0.RC
 */
public class InvalidApiKeyException extends ResourceException {

    public InvalidApiKeyException(StormpathError stormpathError) {
        super(stormpathError);
    }
}
