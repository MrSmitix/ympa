package org.openapitools.api;

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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for BusinessOfferMappingsApi
 */
@MicronautTest
public class BusinessOfferMappingsApiTest {

    @Inject
    BusinessOfferMappingsApi api;

    
    /**
     * Добавление товаров в архив
     *
     * Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void addOffersToArchiveTest() {
        // given
        Long businessId = 56L;
        AddOffersToArchiveRequest addOffersToArchiveRequest = new AddOffersToArchiveRequest(Arrays.asList("example"));

        // when
        AddOffersToArchiveResponse body = api.addOffersToArchive(businessId, addOffersToArchiveRequest).block();

        // then
        // TODO implement the addOffersToArchiveTest()
    }

    
    /**
     * Удаление товаров из каталога
     *
     * Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteOffersTest() {
        // given
        Long businessId = 56L;
        DeleteOffersRequest deleteOffersRequest = new DeleteOffersRequest(Arrays.asList("example"));

        // when
        DeleteOffersResponse body = api.deleteOffers(businessId, deleteOffersRequest).block();

        // then
        // TODO implement the deleteOffersTest()
    }

    
    /**
     * Удаление товаров из архива
     *
     * Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteOffersFromArchiveTest() {
        // given
        Long businessId = 56L;
        DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest = new DeleteOffersFromArchiveRequest(Arrays.asList("example"));

        // when
        DeleteOffersFromArchiveResponse body = api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest).block();

        // then
        // TODO implement the deleteOffersFromArchiveTest()
    }

    
    /**
     * Информация о товарах в каталоге
     *
     * Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOfferMappingsTest() {
        // given
        Long businessId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetOfferMappingsRequest getOfferMappingsRequest = new GetOfferMappingsRequest();

        // when
        GetOfferMappingsResponse body = api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest).block();

        // then
        // TODO implement the getOfferMappingsTest()
    }

    
    /**
     * Просмотр карточек на Маркете, которые подходят вашим товарам
     *
     * Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getSuggestedOfferMappingsTest() {
        // given
        Long businessId = 56L;
        GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = new GetSuggestedOfferMappingsRequest();

        // when
        GetSuggestedOfferMappingsResponse body = api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest).block();

        // then
        // TODO implement the getSuggestedOfferMappingsTest()
    }

    
    /**
     * Добавление товаров в каталог и изменение информации о них
     *
     * Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateOfferMappingsTest() {
        // given
        Long businessId = 56L;
        UpdateOfferMappingsRequest updateOfferMappingsRequest = new UpdateOfferMappingsRequest(Arrays.asList());

        // when
        UpdateOfferMappingsResponse body = api.updateOfferMappings(businessId, updateOfferMappingsRequest).block();

        // then
        // TODO implement the updateOfferMappingsTest()
    }

    
}
