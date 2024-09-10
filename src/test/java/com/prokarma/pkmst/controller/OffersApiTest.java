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
import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiLockedErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.CurrencyType;
import com.prokarma.pkmst.model.DeleteCampaignOffersRequest;
import com.prokarma.pkmst.model.DeleteCampaignOffersResponse;
import com.prokarma.pkmst.model.EmptyApiResponse;
import com.prokarma.pkmst.model.GetAllOffersResponse;
import com.prokarma.pkmst.model.GetCampaignOffersRequest;
import com.prokarma.pkmst.model.GetCampaignOffersResponse;
import com.prokarma.pkmst.model.GetOfferRecommendationsRequest;
import com.prokarma.pkmst.model.GetOfferRecommendationsResponse;
import com.prokarma.pkmst.model.GetOffersResponse;
import com.prokarma.pkmst.model.UpdateCampaignOffersRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for OffersApi
 */
@Ignore
public class OffersApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final OffersApi api = new OffersApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Удаление товаров из ассортимента магазина
     *
     * Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteCampaignOffersTest() throws Exception {
        Long campaignId = null;
        DeleteCampaignOffersRequest deleteCampaignOffersRequest = null;
    ResponseEntity<DeleteCampaignOffersResponse> response = api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Все предложения магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllOffersTest() throws Exception {
        Long campaignId = null;
        Long feedId = null;
        Integer chunk = null;
    ResponseEntity<GetAllOffersResponse> response = api.getAllOffers(campaignId, feedId, chunk , accept);

        // TODO: test validations
    }
    
    /**
     * Информация о товарах, которые размещены в заданном магазине
     *
     * Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCampaignOffersTest() throws Exception {
        Long campaignId = null;
        GetCampaignOffersRequest getCampaignOffersRequest = null;
        String pageToken = null;
        Integer limit = null;
    ResponseEntity<GetCampaignOffersResponse> response = api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit , accept);

        // TODO: test validations
    }
    
    /**
     * Рекомендации Маркета, касающиеся цен
     *
     * Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOfferRecommendationsTest() throws Exception {
        Long businessId = null;
        GetOfferRecommendationsRequest getOfferRecommendationsRequest = null;
        String pageToken = null;
        Integer limit = null;
    ResponseEntity<GetOfferRecommendationsResponse> response = api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit , accept);

        // TODO: test validations
    }
    
    /**
     * Предложения магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOffersTest() throws Exception {
        Long campaignId = null;
        String query = null;
        Long feedId = null;
        String shopCategoryId = null;
        CurrencyType currency = null;
        Boolean matched = null;
        Integer page = null;
        Integer pageSize = null;
    ResponseEntity<GetOffersResponse> response = api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize , accept);

        // TODO: test validations
    }
    
    /**
     * Изменение условий продажи товаров в магазине
     *
     * Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCampaignOffersTest() throws Exception {
        Long campaignId = null;
        UpdateCampaignOffersRequest updateCampaignOffersRequest = null;
    ResponseEntity<EmptyApiResponse> response = api.updateCampaignOffers(campaignId, updateCampaignOffersRequest , accept);

        // TODO: test validations
    }
    
}