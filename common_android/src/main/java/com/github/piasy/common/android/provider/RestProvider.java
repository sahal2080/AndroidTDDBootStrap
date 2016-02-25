/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Piasy
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.piasy.common.android.provider;

import com.github.piasy.common.Constants;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Piasy{github.com/Piasy} on 15/7/23.
 *
 * A singleton provider providing {@link Retrofit}.
 */
final class RestProvider {

    private RestProvider() {
        // singleton
    }

    /**
     * Provide the {@link Retrofit} singleton instance.
     *
     * @return the singleton {@link Retrofit}.
     */
    static Retrofit provideRetrofit() {
        return RestAdapterHolder.sRetrofit;
    }

    private static class RestAdapterHolder {
        // lazy instantiate
        private static volatile Retrofit sRetrofit =
                new Retrofit.Builder().baseUrl(Constants.GITHUB_SERVER_ENDPOINT)
                        .client(HttpClientProvider.provideHttpClient())
                        .addConverterFactory(
                                GsonConverterFactory.create(GsonProvider.provideGson()))
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .build();
    }
}
