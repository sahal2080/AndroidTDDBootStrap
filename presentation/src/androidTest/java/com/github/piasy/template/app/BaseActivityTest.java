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

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import com.github.piasy.common.android.utils.AndroidUtilsModule;
import com.github.piasy.model.rest.github.MockGithubAPIModule;
import com.github.piasy.template.app.di.AppModule;

/**
 * Created by Piasy{github.com/Piasy} on 15/9/26.
 */
@SuppressWarnings("PMD.AbstractClassWithoutAbstractMethod")
public abstract class BaseActivityTest {
    /**
     * set mock app component.
     *
     * @return MockAppComponent
     */
    protected MockAppComponent setMockAppComponent() {
        final Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        final TemplateApp app =
                (TemplateApp) instrumentation.getTargetContext().getApplicationContext();
        final MockAppComponent component = DaggerMockAppComponent.builder()
                .appModule(new AppModule(app))
                .androidUtilsModule(new AndroidUtilsModule(app))
                .githubAPIModule(new MockGithubAPIModule())
                .build();
        app.setComponent(component);
        return component;
    }
}
