package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.model.GetGoodsFeedbackRequest;
import org.openapitools.model.GetGoodsFeedbackResponse;
import org.openapitools.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentResponse;
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
 * API tests for GoodsFeedbackController
 */
@MicronautTest
public class GoodsFeedbackControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    GoodsFeedbackController controller;

    /**
     * This test is used to validate the implementation of deleteGoodsFeedbackComment() method
     *
     * The method should: Удаление комментария к отзыву
     *
     * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteGoodsFeedbackCommentMethodTest() {
        // given
        Long businessId = 56L;
        DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest = new DeleteGoodsFeedbackCommentRequest(56L);

        // when
        EmptyApiResponse result = controller.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/goods-feedback/comments/delete' to the features of deleteGoodsFeedbackComment() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteGoodsFeedbackCommentClientApiTest() throws IOException {
        // given
        DeleteGoodsFeedbackCommentRequest body = new DeleteGoodsFeedbackCommentRequest(56L);
        String uri = UriTemplate.of("/businesses/{businessId}/goods-feedback/comments/delete").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@5ad755c5");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getGoodsFeedbackComments() method
     *
     * The method should: Получение комментариев к отзыву
     *
     * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getGoodsFeedbackCommentsMethodTest() {
        // given
        Long businessId = 56L;
        GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = new GetGoodsFeedbackCommentsRequest(56L);
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetGoodsFeedbackCommentsResponse result = controller.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/goods-feedback/comments' to the features of getGoodsFeedbackComments() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getGoodsFeedbackCommentsClientApiTest() throws IOException {
        // given
        GetGoodsFeedbackCommentsRequest body = new GetGoodsFeedbackCommentsRequest(56L);
        String uri = UriTemplate.of("/businesses/{businessId}/goods-feedback/comments").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4a57cec1");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetGoodsFeedbackCommentsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getGoodsFeedbacks() method
     *
     * The method should: Получение отзывов о товарах продавца
     *
     * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getGoodsFeedbacksMethodTest() {
        // given
        Long businessId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetGoodsFeedbackRequest getGoodsFeedbackRequest = new GetGoodsFeedbackRequest();

        // when
        GetGoodsFeedbackResponse result = controller.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/goods-feedback' to the features of getGoodsFeedbacks() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getGoodsFeedbacksClientApiTest() throws IOException {
        // given
        GetGoodsFeedbackRequest body = new GetGoodsFeedbackRequest();
        String uri = UriTemplate.of("/businesses/{businessId}/goods-feedback").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2cd9bff2");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetGoodsFeedbackResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of skipGoodsFeedbacksReaction() method
     *
     * The method should: Отказ от ответа на отзывы
     *
     * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void skipGoodsFeedbacksReactionMethodTest() {
        // given
        Long businessId = 56L;
        SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = new SkipGoodsFeedbackReactionRequest(new HashSet<>());

        // when
        EmptyApiResponse result = controller.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/goods-feedback/skip-reaction' to the features of skipGoodsFeedbacksReaction() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void skipGoodsFeedbacksReactionClientApiTest() throws IOException {
        // given
        SkipGoodsFeedbackReactionRequest body = new SkipGoodsFeedbackReactionRequest(new HashSet<>());
        String uri = UriTemplate.of("/businesses/{businessId}/goods-feedback/skip-reaction").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4c40aed1");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateGoodsFeedbackComment() method
     *
     * The method should: Добавление нового или изменение созданного комментария
     *
     * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateGoodsFeedbackCommentMethodTest() {
        // given
        Long businessId = 56L;
        UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest = new UpdateGoodsFeedbackCommentRequest(56L, null);

        // when
        UpdateGoodsFeedbackCommentResponse result = controller.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/goods-feedback/comments/update' to the features of updateGoodsFeedbackComment() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateGoodsFeedbackCommentClientApiTest() throws IOException {
        // given
        UpdateGoodsFeedbackCommentRequest body = new UpdateGoodsFeedbackCommentRequest(56L, null);
        String uri = UriTemplate.of("/businesses/{businessId}/goods-feedback/comments/update").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@bca34d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateGoodsFeedbackCommentResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
