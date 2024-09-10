package org.openapitools.controller;

import org.openapitools.model.AddHiddenOffersRequest;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeleteHiddenOffersRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetHiddenOffersResponse;
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
 * API tests for HiddenOffersController
 */
@MicronautTest
public class HiddenOffersControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    HiddenOffersController controller;

    /**
     * This test is used to validate the implementation of addHiddenOffers() method
     *
     * The method should: Скрытие товаров и настройки скрытия
     *
     * Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void addHiddenOffersMethodTest() {
        // given
        Long campaignId = 56L;
        AddHiddenOffersRequest addHiddenOffersRequest = new AddHiddenOffersRequest(Arrays.asList());

        // when
        EmptyApiResponse result = controller.addHiddenOffers(campaignId, addHiddenOffersRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/hidden-offers' to the features of addHiddenOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void addHiddenOffersClientApiTest() throws IOException {
        // given
        AddHiddenOffersRequest body = new AddHiddenOffersRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/hidden-offers").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4c57b0e7");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteHiddenOffers() method
     *
     * The method should: Возобновление показа товаров
     *
     * Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteHiddenOffersMethodTest() {
        // given
        Long campaignId = 56L;
        DeleteHiddenOffersRequest deleteHiddenOffersRequest = new DeleteHiddenOffersRequest(Arrays.asList());

        // when
        EmptyApiResponse result = controller.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/hidden-offers/delete' to the features of deleteHiddenOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteHiddenOffersClientApiTest() throws IOException {
        // given
        DeleteHiddenOffersRequest body = new DeleteHiddenOffersRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/hidden-offers/delete").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@258fe58c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getHiddenOffers() method
     *
     * The method should: Информация о скрытых вами товарах
     *
     * Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getHiddenOffersMethodTest() {
        // given
        Long campaignId = 56L;
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId = Arrays.asList("example");
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        Integer offset = 56;
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetHiddenOffersResponse result = controller.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/hidden-offers' to the features of getHiddenOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getHiddenOffersClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/hidden-offers").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@64f8ef03");
        request.getParameters()
            .add("offer_id", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("page", String.valueOf(1)) // The query parameter format should be 
            .add("pageSize", String.valueOf(56)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetHiddenOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
