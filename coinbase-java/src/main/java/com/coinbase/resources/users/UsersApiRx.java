/*
 * Copyright 2018 Coinbase, Inc.
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

package com.coinbase.resources.users;

import com.coinbase.ApiConstants;
import com.coinbase.CoinbaseResponse;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Rx API interface for getting user info.
 *
 * @see UserResource
 */
public interface UsersApiRx {

    @GET(ApiConstants.USER)
    Single<CoinbaseResponse<AuthUser>> getCurrentUser();

    @GET(ApiConstants.USERS + "/{userId}")
    Single<CoinbaseResponse<User>> getUser(@Path("userId") String userId);

    @PUT(ApiConstants.USER)
    Single<CoinbaseResponse<AuthUser>> updateUser(@Body UpdateUserRequest request);

    @GET(ApiConstants.USER_AUTH_INFO)
    Single<CoinbaseResponse<AuthInfo>> getAuthInfo();
}
