package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.GetModelsOffersResponse;
import org.openapitools.model.GetModelsRequest;
import org.openapitools.model.GetModelsResponse;
import org.openapitools.model.SearchModelsResponse;
import org.openapitools.model.SortOrderType;
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
 * API tests for ModelsController
 */
@MicronautTest
public class ModelsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ModelsController controller;

    /**
     * This test is used to validate the implementation of getModel() method
     *
     * The method should: Информация об одной модели
     *
     * Возвращает информацию о модели товара.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getModelMethodTest() {
        // given
        Long modelId = 56L;
        Long regionId = 56L;
        CurrencyType currency = CurrencyType.fromValue("RUR");

        // when
        GetModelsResponse result = controller.getModel(modelId, regionId, currency).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models/{modelId}' to the features of getModel() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getModelClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models/{modelId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("modelId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4b894754");
        request.getParameters()
            .add("regionId", String.valueOf(56L)) // The query parameter format should be 
            .add("currency", String.valueOf(CurrencyType.fromValue("RUR"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetModelsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getModelOffers() method
     *
     * The method should: Список предложений для одной модели
     *
     * Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getModelOffersMethodTest() {
        // given
        Long modelId = 56L;
        Long regionId = 56L;
        CurrencyType currency = CurrencyType.fromValue("RUR");
        SortOrderType orderByPrice = SortOrderType.fromValue("ASC");
        Integer count = 10;
        Integer page = 1;

        // when
        GetModelsOffersResponse result = controller.getModelOffers(modelId, regionId, currency, orderByPrice, count, page).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models/{modelId}/offers' to the features of getModelOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getModelOffersClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models/{modelId}/offers").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("modelId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6087daa3");
        request.getParameters()
            .add("regionId", String.valueOf(56L)) // The query parameter format should be 
            .add("currency", String.valueOf(CurrencyType.fromValue("RUR"))) // The query parameter format should be 
            .add("orderByPrice", String.valueOf(SortOrderType.fromValue("ASC"))) // The query parameter format should be 
            .add("count", String.valueOf(10)) // The query parameter format should be 
            .add("page", String.valueOf(1)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetModelsOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getModels() method
     *
     * The method should: Информация о нескольких моделях
     *
     * Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getModelsMethodTest() {
        // given
        Long regionId = 56L;
        GetModelsRequest getModelsRequest = new GetModelsRequest(Arrays.asList());
        CurrencyType currency = CurrencyType.fromValue("RUR");

        // when
        GetModelsResponse result = controller.getModels(regionId, getModelsRequest, currency).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models' to the features of getModels() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getModelsClientApiTest() throws IOException {
        // given
        GetModelsRequest body = new GetModelsRequest(Arrays.asList());
        String uri = UriTemplate.of("/models").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@524af1ab");
        request.getParameters()
            .add("regionId", String.valueOf(56L)) // The query parameter format should be 
            .add("currency", String.valueOf(CurrencyType.fromValue("RUR"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetModelsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getModelsOffers() method
     *
     * The method should: Список предложений для нескольких моделей
     *
     * Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getModelsOffersMethodTest() {
        // given
        Long regionId = 56L;
        GetModelsRequest getModelsRequest = new GetModelsRequest(Arrays.asList());
        CurrencyType currency = CurrencyType.fromValue("RUR");
        SortOrderType orderByPrice = SortOrderType.fromValue("ASC");

        // when
        GetModelsOffersResponse result = controller.getModelsOffers(regionId, getModelsRequest, currency, orderByPrice).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models/offers' to the features of getModelsOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getModelsOffersClientApiTest() throws IOException {
        // given
        GetModelsRequest body = new GetModelsRequest(Arrays.asList());
        String uri = UriTemplate.of("/models/offers").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2afac2f7");
        request.getParameters()
            .add("regionId", String.valueOf(56L)) // The query parameter format should be 
            .add("currency", String.valueOf(CurrencyType.fromValue("RUR"))) // The query parameter format should be 
            .add("orderByPrice", String.valueOf(SortOrderType.fromValue("ASC"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetModelsOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of searchModels() method
     *
     * The method should: Поиск модели товара
     *
     * Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void searchModelsMethodTest() {
        // given
        String query = "example";
        Long regionId = 56L;
        CurrencyType currency = CurrencyType.fromValue("RUR");
        Integer page = 1;
        Integer pageSize = 56;

        // when
        SearchModelsResponse result = controller.searchModels(query, regionId, currency, page, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/models' to the features of searchModels() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void searchModelsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/models").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2b48931b");
        request.getParameters()
            .add("query", "example") // The query parameter format should be 
            .add("regionId", String.valueOf(56L)) // The query parameter format should be 
            .add("currency", String.valueOf(CurrencyType.fromValue("RUR"))) // The query parameter format should be 
            .add("page", String.valueOf(1)) // The query parameter format should be 
            .add("pageSize", String.valueOf(56)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SearchModelsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
