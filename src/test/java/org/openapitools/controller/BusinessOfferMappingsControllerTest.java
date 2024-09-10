package org.openapitools.controller;

import org.openapitools.model.AddOffersToArchiveRequest;
import org.openapitools.model.AddOffersToArchiveResponse;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeleteOffersFromArchiveRequest;
import org.openapitools.model.DeleteOffersFromArchiveResponse;
import org.openapitools.model.DeleteOffersRequest;
import org.openapitools.model.DeleteOffersResponse;
import org.openapitools.model.GetOfferMappingsRequest;
import org.openapitools.model.GetOfferMappingsResponse;
import org.openapitools.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.model.UpdateOfferMappingsRequest;
import org.openapitools.model.UpdateOfferMappingsResponse;
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
 * API tests for BusinessOfferMappingsController
 */
@MicronautTest
public class BusinessOfferMappingsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    BusinessOfferMappingsController controller;

    /**
     * This test is used to validate the implementation of addOffersToArchive() method
     *
     * The method should: Добавление товаров в архив
     *
     * Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void addOffersToArchiveMethodTest() {
        // given
        Long businessId = 56L;
        AddOffersToArchiveRequest addOffersToArchiveRequest = new AddOffersToArchiveRequest(Arrays.asList("example"));

        // when
        AddOffersToArchiveResponse result = controller.addOffersToArchive(businessId, addOffersToArchiveRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/offer-mappings/archive' to the features of addOffersToArchive() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void addOffersToArchiveClientApiTest() throws IOException {
        // given
        AddOffersToArchiveRequest body = new AddOffersToArchiveRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{businessId}/offer-mappings/archive").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@26415f0b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AddOffersToArchiveResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteOffers() method
     *
     * The method should: Удаление товаров из каталога
     *
     * Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteOffersMethodTest() {
        // given
        Long businessId = 56L;
        DeleteOffersRequest deleteOffersRequest = new DeleteOffersRequest(Arrays.asList("example"));

        // when
        DeleteOffersResponse result = controller.deleteOffers(businessId, deleteOffersRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/offer-mappings/delete' to the features of deleteOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteOffersClientApiTest() throws IOException {
        // given
        DeleteOffersRequest body = new DeleteOffersRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{businessId}/offer-mappings/delete").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@77652fc6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteOffersFromArchive() method
     *
     * The method should: Удаление товаров из архива
     *
     * Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteOffersFromArchiveMethodTest() {
        // given
        Long businessId = 56L;
        DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest = new DeleteOffersFromArchiveRequest(Arrays.asList("example"));

        // when
        DeleteOffersFromArchiveResponse result = controller.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/offer-mappings/unarchive' to the features of deleteOffersFromArchive() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteOffersFromArchiveClientApiTest() throws IOException {
        // given
        DeleteOffersFromArchiveRequest body = new DeleteOffersFromArchiveRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{businessId}/offer-mappings/unarchive").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4924c27e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteOffersFromArchiveResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getOfferMappings() method
     *
     * The method should: Информация о товарах в каталоге
     *
     * Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getOfferMappingsMethodTest() {
        // given
        Long businessId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetOfferMappingsRequest getOfferMappingsRequest = new GetOfferMappingsRequest();

        // when
        GetOfferMappingsResponse result = controller.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/offer-mappings' to the features of getOfferMappings() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getOfferMappingsClientApiTest() throws IOException {
        // given
        GetOfferMappingsRequest body = new GetOfferMappingsRequest();
        String uri = UriTemplate.of("/businesses/{businessId}/offer-mappings").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@57916acc");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetOfferMappingsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getSuggestedOfferMappings() method
     *
     * The method should: Просмотр карточек на Маркете, которые подходят вашим товарам
     *
     * Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getSuggestedOfferMappingsMethodTest() {
        // given
        Long businessId = 56L;
        GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = new GetSuggestedOfferMappingsRequest();

        // when
        GetSuggestedOfferMappingsResponse result = controller.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/offer-mappings/suggestions' to the features of getSuggestedOfferMappings() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getSuggestedOfferMappingsClientApiTest() throws IOException {
        // given
        GetSuggestedOfferMappingsRequest body = new GetSuggestedOfferMappingsRequest();
        String uri = UriTemplate.of("/businesses/{businessId}/offer-mappings/suggestions").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@9d464e7");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetSuggestedOfferMappingsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateOfferMappings() method
     *
     * The method should: Добавление товаров в каталог и изменение информации о них
     *
     * Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOfferMappingsMethodTest() {
        // given
        Long businessId = 56L;
        UpdateOfferMappingsRequest updateOfferMappingsRequest = new UpdateOfferMappingsRequest(Arrays.asList());

        // when
        UpdateOfferMappingsResponse result = controller.updateOfferMappings(businessId, updateOfferMappingsRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/offer-mappings/update' to the features of updateOfferMappings() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOfferMappingsClientApiTest() throws IOException {
        // given
        UpdateOfferMappingsRequest body = new UpdateOfferMappingsRequest(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{businessId}/offer-mappings/update").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@660c6091");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateOfferMappingsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
