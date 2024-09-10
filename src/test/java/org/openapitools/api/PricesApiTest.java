package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetPricesByOfferIdsRequest;
import org.openapitools.model.GetPricesByOfferIdsResponse;
import org.openapitools.model.GetPricesResponse;
import org.openapitools.model.SuggestPricesRequest;
import org.openapitools.model.SuggestPricesResponse;
import org.openapitools.model.UpdateBusinessPricesRequest;
import org.openapitools.model.UpdatePricesRequest;
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
 * API tests for PricesApi
 */
@MicronautTest
public class PricesApiTest {

    @Inject
    PricesApi api;

    
    /**
     * Список цен
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPricesTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        Boolean archived = false;

        // when
        GetPricesResponse body = api.getPrices(campaignId, pageToken, limit, archived).block();

        // then
        // TODO implement the getPricesTest()
    }

    
    /**
     * Просмотр цен на указанные товары в магазине
     *
     * Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPricesByOfferIdsTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetPricesByOfferIdsRequest getPricesByOfferIdsRequest = new GetPricesByOfferIdsRequest();

        // when
        GetPricesByOfferIdsResponse body = api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest).block();

        // then
        // TODO implement the getPricesByOfferIdsTest()
    }

    
    /**
     * Цены для продвижения товаров
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getSuggestedPricesTest() {
        // given
        Long campaignId = 56L;
        SuggestPricesRequest suggestPricesRequest = new SuggestPricesRequest(Arrays.asList());

        // when
        SuggestPricesResponse body = api.getSuggestedPrices(campaignId, suggestPricesRequest).block();

        // then
        // TODO implement the getSuggestedPricesTest()
    }

    
    /**
     * Установка цен на товары во всех магазинах
     *
     * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateBusinessPricesTest() {
        // given
        Long businessId = 56L;
        UpdateBusinessPricesRequest updateBusinessPricesRequest = new UpdateBusinessPricesRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.updateBusinessPrices(businessId, updateBusinessPricesRequest).block();

        // then
        // TODO implement the updateBusinessPricesTest()
    }

    
    /**
     * Установка цен на товары в конкретном магазине
     *
     * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updatePricesTest() {
        // given
        Long campaignId = 56L;
        UpdatePricesRequest updatePricesRequest = new UpdatePricesRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.updatePrices(campaignId, updatePricesRequest).block();

        // then
        // TODO implement the updatePricesTest()
    }

    
}
