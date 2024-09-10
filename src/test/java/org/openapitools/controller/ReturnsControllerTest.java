package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetReturnResponse;
import org.openapitools.model.GetReturnsResponse;
import java.time.LocalDate;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReturnType;
import org.openapitools.model.SetReturnDecisionRequest;
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
 * API tests for ReturnsController
 */
@MicronautTest
public class ReturnsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ReturnsController controller;

    /**
     * This test is used to validate the implementation of getReturn() method
     *
     * The method should: Информация о невыкупе или возврате
     *
     * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getReturnMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;

        // when
        GetReturnResponse result = controller.getReturn(campaignId, orderId, returnId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}' to the features of getReturn() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getReturnClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
            put("returnId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@22f1d27e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetReturnResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getReturnApplication() method
     *
     * The method should: Получение заявления на возврат
     *
     * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getReturnApplicationMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;

        // when
        CompletedFileUpload result = controller.getReturnApplication(campaignId, orderId, returnId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application' to the features of getReturnApplication() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getReturnApplicationClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
            put("returnId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@232a935")
            .accept("[Ljava.lang.String;@232a935");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getReturnPhoto() method
     *
     * The method should: Получение фотографии возврата
     *
     * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getReturnPhotoMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;
        Long itemId = 56L;
        String imageHash = "example";

        // when
        CompletedFileUpload result = controller.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}' to the features of getReturnPhoto() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getReturnPhotoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
            put("returnId", 56L);
            put("itemId", 56L);
            put("imageHash", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1414800e")
            .accept("[Ljava.lang.String;@1414800e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getReturns() method
     *
     * The method should: Список невыкупов и возвратов
     *
     * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getReturnsMethodTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        List<Long> orderIds = Arrays.asList();
        List<RefundStatusType> statuses = Arrays.asList();
        ReturnType type = ReturnType.fromValue("UNREDEEMED");
        LocalDate fromDate = LocalDate.of(2001, 2, 3);
        LocalDate toDate = LocalDate.of(2001, 2, 3);
        LocalDate fromDate2 = LocalDate.of(2001, 2, 3);
        LocalDate toDate2 = LocalDate.of(2001, 2, 3);

        // when
        GetReturnsResponse result = controller.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/returns' to the features of getReturns() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getReturnsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/returns").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2a3f74fd");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("orderIds", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("statuses", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("type", String.valueOf(ReturnType.fromValue("UNREDEEMED"))) // The query parameter format should be 
            .add("fromDate", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("toDate", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("from_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("to_date", String.valueOf(LocalDate.of(2001, 2, 3))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetReturnsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of setReturnDecision() method
     *
     * The method should: Принятие или изменение решения по возврату
     *
     * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void setReturnDecisionMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;
        SetReturnDecisionRequest setReturnDecisionRequest = new SetReturnDecisionRequest(56L, org.openapitools.model.ReturnRequestDecisionType.fromValue("REFUND_MONEY"));

        // when
        EmptyApiResponse result = controller.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision' to the features of setReturnDecision() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void setReturnDecisionClientApiTest() throws IOException {
        // given
        SetReturnDecisionRequest body = new SetReturnDecisionRequest(56L, org.openapitools.model.ReturnRequestDecisionType.fromValue("REFUND_MONEY"));
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
            put("returnId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@67131e6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of submitReturnDecision() method
     *
     * The method should: Подтверждение решения по возврату
     *
     * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void submitReturnDecisionMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;

        // when
        EmptyApiResponse result = controller.submitReturnDecision(campaignId, orderId, returnId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit' to the features of submitReturnDecision() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void submitReturnDecisionClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
            put("returnId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@111d4b1c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
