package com.piasy.model;

/**
 * Created by Piasy{github.com/Piasy} on 15/8/9.
 *
 * Mock data provider for test.
 */
public final class MockProvider {

    private MockProvider() {
        // no instance
    }

    /**
     * Provide {@link com.github.piasy.common.android.utils.net.GithubAPIError} json string.
     *
     * @return {@link com.github.piasy.common.android.utils.net.GithubAPIError} json string.
     */
    public static String provideGithubAPIErrorStr() {
        return "{\"message\":\"Validation Failed\",\"errors\":[{\"resource\":\"Issue\"," +
                "\"field\":\"title\",\"code\":\"missing_field\"}]}";
    }

    /**
     * Provide full {@link com.github.piasy.model.entities.GithubUser} json string.
     *
     * @return full {@link com.github.piasy.model.entities.GithubUser} json string.
     */
    public static String provideGithubUserStr() {
        return "{\"login\":\"Piasy\",\"id\":3098704,\"avatar_url\":\"https://avatars" +
                ".githubusercontent.com/u/3098704?v=3\",\"gravatar_id\":\"\"," +
                "\"url\":\"https://api.github.com/users/Piasy\",\"html_url\":\"https://github" +
                ".com/Piasy\",\"followers_url\":\"https://api.github.com/users/Piasy/followers\"," +
                "\"following_url\":\"https://api.github.com/users/Piasy/following{/other_user}\"," +
                "\"gists_url\":\"https://api.github.com/users/Piasy/gists{/gist_id}\"," +
                "\"starred_url\":\"https://api.github.com/users/Piasy/starred{/owner}{/repo}\"," +
                "\"subscriptions_url\":\"https://api.github.com/users/Piasy/subscriptions\"," +
                "\"organizations_url\":\"https://api.github.com/users/Piasy/orgs\"," +
                "\"repos_url\":\"https://api.github.com/users/Piasy/repos\"," +
                "\"events_url\":\"https://api.github.com/users/Piasy/events{/privacy}\"," +
                "\"received_events_url\":\"https://api.github.com/users/Piasy/received_events\"," +
                "\"type\":\"User\",\"site_admin\":false,\"name\":\"Xu Jianlin\"," +
                "\"company\":\"YOLO\",\"blog\":\"http://piasy.github.io/\"," +
                "\"location\":\"Beijing, China\",\"email\":\"xz4215@gmail.com\"," +
                "\"hireable\":true,\"bio\":null,\"public_repos\":21,\"public_gists\":3," +
                "\"followers\":3,\"following\":25,\"created_at\":\"2012-12-21T14:23:30Z\"," +
                "\"updated_at\":\"2015-07-23T07:27:29Z\"}";
    }

    /**
     * Provide simplified {@link com.github.piasy.model.entities.GithubUser} json string.
     *
     * @return simplified {@link com.github.piasy.model.entities.GithubUser} json string.
     */
    public static String provideSimplifiedGithubUserStr() {
        return "{\"login\":\"Piasy\",\"id\":3098704,\"avatar_url\":\"https://avatars" +
                ".githubusercontent.com/u/3098704?v=3\",\"type\":\"User\"," +
                "\"email\":\"xz4215@gmail.com\",\"followers\":3,\"following\":25," +
                "\"created_at\":\"2012-12-21T14:23:30Z\"}";
    }
}
