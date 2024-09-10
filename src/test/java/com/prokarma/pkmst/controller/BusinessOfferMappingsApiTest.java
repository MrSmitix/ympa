/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.AddOffersToArchiveRequest;
import com.prokarma.pkmst.model.AddOffersToArchiveResponse;
import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiLockedErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.DeleteOffersFromArchiveRequest;
import com.prokarma.pkmst.model.DeleteOffersFromArchiveResponse;
import com.prokarma.pkmst.model.DeleteOffersRequest;
import com.prokarma.pkmst.model.DeleteOffersResponse;
import com.prokarma.pkmst.model.GetOfferMappingsRequest;
import com.prokarma.pkmst.model.GetOfferMappingsResponse;
import com.prokarma.pkmst.model.GetSuggestedOfferMappingsRequest;
import com.prokarma.pkmst.model.GetSuggestedOfferMappingsResponse;
import com.prokarma.pkmst.model.UpdateOfferMappingsRequest;
import com.prokarma.pkmst.model.UpdateOfferMappingsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for BusinessOfferMappingsApi
 */
@Ignore
public class BusinessOfferMappingsApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final BusinessOfferMappingsApi api = new BusinessOfferMappingsApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Добавление товаров в архив
     *
     * Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addOffersToArchiveTest() throws Exception {
        Long businessId = null;
        AddOffersToArchiveRequest addOffersToArchiveRequest = null;
    ResponseEntity<AddOffersToArchiveResponse> response = api.addOffersToArchive(businessId, addOffersToArchiveRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Удаление товаров из каталога
     *
     * Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOffersTest() throws Exception {
        Long businessId = null;
        DeleteOffersRequest deleteOffersRequest = null;
    ResponseEntity<DeleteOffersResponse> response = api.deleteOffers(businessId, deleteOffersRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Удаление товаров из архива
     *
     * Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOffersFromArchiveTest() throws Exception {
        Long businessId = null;
        DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest = null;
    ResponseEntity<DeleteOffersFromArchiveResponse> response = api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Информация о товарах в каталоге
     *
     * Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOfferMappingsTest() throws Exception {
        Long businessId = null;
        String pageToken = null;
        Integer limit = null;
        GetOfferMappingsRequest getOfferMappingsRequest = null;
    ResponseEntity<GetOfferMappingsResponse> response = api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Просмотр карточек на Маркете, которые подходят вашим товарам
     *
     * Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSuggestedOfferMappingsTest() throws Exception {
        Long businessId = null;
        GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = null;
    ResponseEntity<GetSuggestedOfferMappingsResponse> response = api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Добавление товаров в каталог и изменение информации о них
     *
     * Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateOfferMappingsTest() throws Exception {
        Long businessId = null;
        UpdateOfferMappingsRequest updateOfferMappingsRequest = null;
    ResponseEntity<UpdateOfferMappingsResponse> response = api.updateOfferMappings(businessId, updateOfferMappingsRequest , accept);

        // TODO: test validations
    }
    
}