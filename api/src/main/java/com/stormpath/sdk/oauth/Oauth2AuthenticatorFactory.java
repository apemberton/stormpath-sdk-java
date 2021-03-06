/*
 * Copyright 2015 Stormpath, Inc.
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
package com.stormpath.sdk.oauth;

import com.stormpath.sdk.application.Application;

/**
 * Interface to be implemented as a factory for {@code Oauth2Authenticator}s.
 *
 * @param <T> a concrete {@link Oauth2Authenticator} that this factory will create.
 *
 * @see com.stormpath.sdk.oauth.PasswordGrantAuthenticatorFactory
 * @see com.stormpath.sdk.oauth.RefreshGrantAuthenticatorFactory
 * @see com.stormpath.sdk.oauth.JwtAuthenticatorFactory
 *
 * @since 1.0.RC7
 */
public interface Oauth2AuthenticatorFactory<T extends Oauth2Authenticator> {

    /**
     * Defines the {@link Application} that will be used to operate with the Oauth2 Authenticator tha this factory will create.
     *
     * @param application the application that will internally be used by the {@link Oauth2Authenticator}
     * @return the concrete {@link Oauth2Authenticator} that this factory will create.
     */
    public T forApplication(Application application);

}
