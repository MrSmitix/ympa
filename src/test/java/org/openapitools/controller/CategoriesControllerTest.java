package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.model.GetCategoriesRequest;
import org.openapitools.model.GetCategoriesResponse;
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
 * API tests for CategoriesController
 */
@MicronautTest
public class CategoriesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CategoriesController controller;

    /**
     * This test is used to validate the implementation of getCategoriesMaxSaleQuantum() method
     *
     * The method should: Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCategoriesMaxSaleQuantumMethodTest() {
        // given
        GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = new GetCategoriesMaxSaleQuantumRequest(new HashSet<>());

        // when
        GetCategoriesMaxSaleQuantumResponse result = controller.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/categories/max-sale-quantum' to the features of getCategoriesMaxSaleQuantum() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCategoriesMaxSaleQuantumClientApiTest() throws IOException {
        // given
        GetCategoriesMaxSaleQuantumRequest body = new GetCategoriesMaxSaleQuantumRequest(new HashSet<>());
        String uri = UriTemplate.of("/categories/max-sale-quantum").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@20b42094");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetCategoriesMaxSaleQuantumResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getCategoriesTree() method
     *
     * The method should: Дерево категорий
     *
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCategoriesTreeMethodTest() {
        // given
        GetCategoriesRequest getCategoriesRequest = new GetCategoriesRequest();

        // when
        GetCategoriesResponse result = controller.getCategoriesTree(getCategoriesRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/categories/tree' to the features of getCategoriesTree() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCategoriesTreeClientApiTest() throws IOException {
        // given
        GetCategoriesRequest body = new GetCategoriesRequest();
        String uri = UriTemplate.of("/categories/tree").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@569d8002");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetCategoriesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
