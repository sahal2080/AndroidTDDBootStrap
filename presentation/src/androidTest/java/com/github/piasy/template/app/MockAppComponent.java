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

package com.github.piasy.template.app;

import com.github.piasy.common.android.jsr310.JSR310Module;
import com.github.piasy.common.android.provider.ProviderModule;
import com.github.piasy.common.android.utils.AndroidUtilsModule;
import com.github.piasy.common.utils.UtilsModule;
import com.github.piasy.model.dao.di.DAOModule;
import com.github.piasy.model.db.di.DBModule;
import com.github.piasy.model.rest.github.GithubAPIModule;
import com.github.piasy.template.app.di.AppComponent;
import com.github.piasy.template.app.di.AppModule;
import com.github.piasy.template.features.splash.SplashActivityTest;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by Piasy{github.com/Piasy} on 15/9/26.
 *
 * Mock appComponent to inject dependencies into test cases.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,

                ProviderModule.class, DBModule.class, GithubAPIModule.class, DAOModule.class,

                JSR310Module.class, AndroidUtilsModule.class, UtilsModule.class
        })
public interface MockAppComponent extends AppComponent {
    /**
     * Inject dependency into test cases.
     *
     * @param activityTest SplashActivityTest
     */
    void inject(SplashActivityTest activityTest);
}
