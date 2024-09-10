package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeletePromoOffersRequest;
import org.openapitools.model.DeletePromoOffersResponse;
import org.openapitools.model.GetPromoOffersRequest;
import org.openapitools.model.GetPromoOffersResponse;
import org.openapitools.model.GetPromosRequest;
import org.openapitools.model.GetPromosResponse;
import org.openapitools.model.UpdatePromoOffersRequest;
import org.openapitools.model.UpdatePromoOffersResponse;
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
 * API tests for PromosController
 */
@MicronautTest
public class PromosControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    PromosController controller;

    /**
     * This test is used to validate the implementation of deletePromoOffers() method
     *
     * The method should: Удаление товаров из акции
     *
     * Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deletePromoOffersMethodTest() {
        // given
        Long businessId = 56L;
        DeletePromoOffersRequest deletePromoOffersRequest = new DeletePromoOffersRequest("example");

        // when
        DeletePromoOffersResponse result = controller.deletePromoOffers(businessId, deletePromoOffersRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/promos/offers/delete' to the features of deletePromoOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deletePromoOffersClientApiTest() throws IOException {
        // given
        DeletePromoOffersRequest body = new DeletePromoOffersRequest("example");
        String uri = UriTemplate.of("/businesses/{businessId}/promos/offers/delete").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@bc86ac");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeletePromoOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getPromoOffers() method
     *
     * The method should: Получение списка товаров, которые участвуют или могут участвовать в акции
     *
     * Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getPromoOffersMethodTest() {
        // given
        Long businessId = 56L;
        GetPromoOffersRequest getPromoOffersRequest = new GetPromoOffersRequest("example");
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetPromoOffersResponse result = controller.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/promos/offers' to the features of getPromoOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getPromoOffersClientApiTest() throws IOException {
        // given
        GetPromoOffersRequest body = new GetPromoOffersRequest("example");
        String uri = UriTemplate.of("/businesses/{businessId}/promos/offers").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@ea34dee");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetPromoOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getPromos() method
     *
     * The method should: Получение списка акций
     *
     * Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getPromosMethodTest() {
        // given
        Long businessId = 56L;
        GetPromosRequest getPromosRequest = new GetPromosRequest();

        // when
        GetPromosResponse result = controller.getPromos(businessId, getPromosRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/promos' to the features of getPromos() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getPromosClientApiTest() throws IOException {
        // given
        GetPromosRequest body = new GetPromosRequest();
        String uri = UriTemplate.of("/businesses/{businessId}/promos").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4e5b0a90");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetPromosResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updatePromoOffers() method
     *
     * The method should: Добавление товаров в акцию или изменение их цен
     *
     * Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updatePromoOffersMethodTest() {
        // given
        Long businessId = 56L;
        UpdatePromoOffersRequest updatePromoOffersRequest = new UpdatePromoOffersRequest("example", Arrays.asList());

        // when
        UpdatePromoOffersResponse result = controller.updatePromoOffers(businessId, updatePromoOffersRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/promos/offers/update' to the features of updatePromoOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updatePromoOffersClientApiTest() throws IOException {
        // given
        UpdatePromoOffersRequest body = new UpdatePromoOffersRequest("example", Arrays.asList());
        String uri = UriTemplate.of("/businesses/{businessId}/promos/offers/update").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3b764ae5");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdatePromoOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
