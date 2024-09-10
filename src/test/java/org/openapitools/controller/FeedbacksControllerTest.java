package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetFeedbackListResponse;
import java.time.LocalDate;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for FeedbacksController
 */
@MicronautTest
public class FeedbacksControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    FeedbacksController controller;

    /**
     * This test is used to validate the implementation of getFeedbackAndCommentUpdates() method
     *
     * The method should: Новые и обновленные отзывы о магазине
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getFeedbackAndCommentUpdatesMethodTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        LocalDate fromDate = LocalDate.of(2001, 2, 3);

        // when
        GetFeedbackListResponse result = controller.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/feedback/updates' to the features of getFeedbackAndCommentUpdates() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getFeedbackAndCommentUpdatesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/feedback/updates").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@361c008");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("from_date", String.valueOf(LocalDate.of(2001, 2, 3))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetFeedbackListResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
