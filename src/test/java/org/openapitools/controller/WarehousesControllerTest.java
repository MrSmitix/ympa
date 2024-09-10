package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetFulfillmentWarehousesResponse;
import org.openapitools.model.GetWarehousesResponse;
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
 * API tests for WarehousesController
 */
@MicronautTest
public class WarehousesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    WarehousesController controller;

    /**
     * This test is used to validate the implementation of getFulfillmentWarehouses() method
     *
     * The method should: Идентификаторы складов Маркета (FBY)
     *
     * Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getFulfillmentWarehousesMethodTest() {
        // given

        // when
        GetFulfillmentWarehousesResponse result = controller.getFulfillmentWarehouses().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/warehouses' to the features of getFulfillmentWarehouses() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getFulfillmentWarehousesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/warehouses").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@41f5e6ee");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetFulfillmentWarehousesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getWarehouses() method
     *
     * The method should: Список складов и групп складов
     *
     * Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getWarehousesMethodTest() {
        // given
        Long businessId = 56L;

        // when
        GetWarehousesResponse result = controller.getWarehouses(businessId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/warehouses' to the features of getWarehouses() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getWarehousesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{businessId}/warehouses").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@30c9ab3f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetWarehousesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
