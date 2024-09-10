package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.DeleteCampaignOffersRequest;
import org.openapitools.model.DeleteCampaignOffersResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetAllOffersResponse;
import org.openapitools.model.GetCampaignOffersRequest;
import org.openapitools.model.GetCampaignOffersResponse;
import org.openapitools.model.GetOfferRecommendationsRequest;
import org.openapitools.model.GetOfferRecommendationsResponse;
import org.openapitools.model.GetOffersResponse;
import org.openapitools.model.UpdateCampaignOffersRequest;
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
 * API tests for OffersApi
 */
@MicronautTest
public class OffersApiTest {

    @Inject
    OffersApi api;

    
    /**
     * Удаление товаров из ассортимента магазина
     *
     * Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteCampaignOffersTest() {
        // given
        Long campaignId = 56L;
        DeleteCampaignOffersRequest deleteCampaignOffersRequest = new DeleteCampaignOffersRequest(Arrays.asList("example"));

        // when
        DeleteCampaignOffersResponse body = api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest).block();

        // then
        // TODO implement the deleteCampaignOffersTest()
    }

    
    /**
     * Все предложения магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
     */
    @Test
    @Disabled("Not Implemented")
    public void getAllOffersTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;
        Integer chunk = 56;

        // when
        GetAllOffersResponse body = api.getAllOffers(campaignId, feedId, chunk).block();

        // then
        // TODO implement the getAllOffersTest()
    }

    
    /**
     * Информация о товарах, которые размещены в заданном магазине
     *
     * Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignOffersTest() {
        // given
        Long campaignId = 56L;
        GetCampaignOffersRequest getCampaignOffersRequest = new GetCampaignOffersRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetCampaignOffersResponse body = api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit).block();

        // then
        // TODO implement the getCampaignOffersTest()
    }

    
    /**
     * Рекомендации Маркета, касающиеся цен
     *
     * Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOfferRecommendationsTest() {
        // given
        Long businessId = 56L;
        GetOfferRecommendationsRequest getOfferRecommendationsRequest = new GetOfferRecommendationsRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetOfferRecommendationsResponse body = api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit).block();

        // then
        // TODO implement the getOfferRecommendationsTest()
    }

    
    /**
     * Предложения магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOffersTest() {
        // given
        Long campaignId = 56L;
        String query = "example";
        Long feedId = 56L;
        String shopCategoryId = "example";
        CurrencyType currency = CurrencyType.fromValue("RUR");
        Boolean matched = false;
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetOffersResponse body = api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize).block();

        // then
        // TODO implement the getOffersTest()
    }

    
    /**
     * Изменение условий продажи товаров в магазине
     *
     * Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateCampaignOffersTest() {
        // given
        Long campaignId = 56L;
        UpdateCampaignOffersRequest updateCampaignOffersRequest = new UpdateCampaignOffersRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.updateCampaignOffers(campaignId, updateCampaignOffersRequest).block();

        // then
        // TODO implement the updateCampaignOffersTest()
    }

    
}
