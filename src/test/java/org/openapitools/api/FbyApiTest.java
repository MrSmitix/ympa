package org.openapitools.api;

import org.openapitools.model.AddHiddenOffersRequest;
import org.openapitools.model.AddOffersToArchiveRequest;
import org.openapitools.model.AddOffersToArchiveResponse;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.CalculateTariffsRequest;
import org.openapitools.model.CalculateTariffsResponse;
import org.openapitools.model.ConfirmPricesRequest;
import org.openapitools.model.CreateChatRequest;
import org.openapitools.model.CreateChatResponse;
import org.openapitools.model.CurrencyType;
import org.openapitools.model.DeleteCampaignOffersRequest;
import org.openapitools.model.DeleteCampaignOffersResponse;
import org.openapitools.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.model.DeleteHiddenOffersRequest;
import org.openapitools.model.DeleteOffersFromArchiveRequest;
import org.openapitools.model.DeleteOffersFromArchiveResponse;
import org.openapitools.model.DeleteOffersRequest;
import org.openapitools.model.DeleteOffersResponse;
import org.openapitools.model.DeletePromoOffersRequest;
import org.openapitools.model.DeletePromoOffersResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.FeedIndexLogsStatusType;
import java.io.File;
import org.openapitools.model.GenerateBoostConsolidatedRequest;
import org.openapitools.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.model.GenerateGoodsFeedbackRequest;
import org.openapitools.model.GenerateGoodsMovementReportRequest;
import org.openapitools.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.model.GenerateGoodsTurnoverRequest;
import org.openapitools.model.GeneratePricesReportRequest;
import org.openapitools.model.GenerateReportResponse;
import org.openapitools.model.GenerateShelfsStatisticsRequest;
import org.openapitools.model.GenerateShowsSalesReportRequest;
import org.openapitools.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.model.GenerateUnitedNettingReportRequest;
import org.openapitools.model.GenerateUnitedOrdersRequest;
import org.openapitools.model.GetAllOffersResponse;
import org.openapitools.model.GetBidsInfoRequest;
import org.openapitools.model.GetBidsInfoResponse;
import org.openapitools.model.GetBidsRecommendationsRequest;
import org.openapitools.model.GetBidsRecommendationsResponse;
import org.openapitools.model.GetBusinessBuyerInfoResponse;
import org.openapitools.model.GetBusinessDocumentsInfoResponse;
import org.openapitools.model.GetBusinessSettingsResponse;
import org.openapitools.model.GetCampaignLoginsResponse;
import org.openapitools.model.GetCampaignOffersRequest;
import org.openapitools.model.GetCampaignOffersResponse;
import org.openapitools.model.GetCampaignRegionResponse;
import org.openapitools.model.GetCampaignResponse;
import org.openapitools.model.GetCampaignSettingsResponse;
import org.openapitools.model.GetCampaignsResponse;
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.model.GetCategoriesRequest;
import org.openapitools.model.GetCategoriesResponse;
import org.openapitools.model.GetCategoryContentParametersResponse;
import org.openapitools.model.GetChatHistoryRequest;
import org.openapitools.model.GetChatHistoryResponse;
import org.openapitools.model.GetChatsRequest;
import org.openapitools.model.GetChatsResponse;
import org.openapitools.model.GetFeedIndexLogsResponse;
import org.openapitools.model.GetFeedResponse;
import org.openapitools.model.GetFeedbackListResponse;
import org.openapitools.model.GetFeedsResponse;
import org.openapitools.model.GetFulfillmentWarehousesResponse;
import org.openapitools.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.model.GetGoodsFeedbackRequest;
import org.openapitools.model.GetGoodsFeedbackResponse;
import org.openapitools.model.GetGoodsStatsRequest;
import org.openapitools.model.GetGoodsStatsResponse;
import org.openapitools.model.GetHiddenOffersResponse;
import org.openapitools.model.GetOfferCardsContentStatusRequest;
import org.openapitools.model.GetOfferCardsContentStatusResponse;
import org.openapitools.model.GetOfferMappingEntriesResponse;
import org.openapitools.model.GetOfferMappingsRequest;
import org.openapitools.model.GetOfferMappingsResponse;
import org.openapitools.model.GetOfferRecommendationsRequest;
import org.openapitools.model.GetOfferRecommendationsResponse;
import org.openapitools.model.GetOffersResponse;
import org.openapitools.model.GetOrderResponse;
import org.openapitools.model.GetOrdersResponse;
import org.openapitools.model.GetOrdersStatsRequest;
import org.openapitools.model.GetOrdersStatsResponse;
import org.openapitools.model.GetPricesByOfferIdsRequest;
import org.openapitools.model.GetPricesByOfferIdsResponse;
import org.openapitools.model.GetPricesResponse;
import org.openapitools.model.GetPromoOffersRequest;
import org.openapitools.model.GetPromoOffersResponse;
import org.openapitools.model.GetPromosRequest;
import org.openapitools.model.GetPromosResponse;
import org.openapitools.model.GetQualityRatingRequest;
import org.openapitools.model.GetQualityRatingResponse;
import org.openapitools.model.GetQuarantineOffersRequest;
import org.openapitools.model.GetQuarantineOffersResponse;
import org.openapitools.model.GetRegionWithChildrenResponse;
import org.openapitools.model.GetRegionsResponse;
import org.openapitools.model.GetReportInfoResponse;
import org.openapitools.model.GetReturnResponse;
import org.openapitools.model.GetReturnsResponse;
import org.openapitools.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.model.GetWarehouseStocksRequest;
import org.openapitools.model.GetWarehouseStocksResponse;
import java.time.LocalDate;
import org.openapitools.model.OfferAvailabilityStatusType;
import org.openapitools.model.OfferMappingKindType;
import org.openapitools.model.OfferProcessingStatusType;
import java.time.OffsetDateTime;
import org.openapitools.model.OrderBuyerType;
import org.openapitools.model.OrderDeliveryDispatchType;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.PutSkuBidsRequest;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReportFormatType;
import org.openapitools.model.ReturnType;
import org.openapitools.model.SendMessageToChatRequest;
import java.util.Set;
import org.openapitools.model.SetFeedParamsRequest;
import org.openapitools.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.model.SuggestPricesRequest;
import org.openapitools.model.SuggestPricesResponse;
import org.openapitools.model.UpdateBusinessPricesRequest;
import org.openapitools.model.UpdateCampaignOffersRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentResponse;
import org.openapitools.model.UpdateOfferContentRequest;
import org.openapitools.model.UpdateOfferContentResponse;
import org.openapitools.model.UpdateOfferMappingEntryRequest;
import org.openapitools.model.UpdateOfferMappingsRequest;
import org.openapitools.model.UpdateOfferMappingsResponse;
import org.openapitools.model.UpdatePricesRequest;
import org.openapitools.model.UpdatePromoOffersRequest;
import org.openapitools.model.UpdatePromoOffersResponse;
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
 * API tests for FbyApi
 */
@MicronautTest
public class FbyApiTest {

    @Inject
    FbyApi api;

    
    /**
     * Скрытие товаров и настройки скрытия
     *
     * Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void addHiddenOffersTest() {
        // given
        Long campaignId = 56L;
        AddHiddenOffersRequest addHiddenOffersRequest = new AddHiddenOffersRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.addHiddenOffers(campaignId, addHiddenOffersRequest).block();

        // then
        // TODO implement the addHiddenOffersTest()
    }

    
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
     * Калькулятор стоимости услуг
     *
     * Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void calculateTariffsTest() {
        // given
        CalculateTariffsRequest calculateTariffsRequest = new CalculateTariffsRequest(null, Arrays.asList());

        // when
        CalculateTariffsResponse body = api.calculateTariffs(calculateTariffsRequest).block();

        // then
        // TODO implement the calculateTariffsTest()
    }

    
    /**
     * Удаление товара из карантина по цене в кабинете
     *
     * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void confirmBusinessPricesTest() {
        // given
        Long businessId = 56L;
        ConfirmPricesRequest confirmPricesRequest = new ConfirmPricesRequest(Arrays.asList("example"));

        // when
        EmptyApiResponse body = api.confirmBusinessPrices(businessId, confirmPricesRequest).block();

        // then
        // TODO implement the confirmBusinessPricesTest()
    }

    
    /**
     * Удаление товара из карантина по цене в магазине
     *
     * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void confirmCampaignPricesTest() {
        // given
        Long campaignId = 56L;
        ConfirmPricesRequest confirmPricesRequest = new ConfirmPricesRequest(Arrays.asList("example"));

        // when
        EmptyApiResponse body = api.confirmCampaignPrices(campaignId, confirmPricesRequest).block();

        // then
        // TODO implement the confirmCampaignPricesTest()
    }

    
    /**
     * Создание нового чата с покупателем
     *
     * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void createChatTest() {
        // given
        Long businessId = 56L;
        CreateChatRequest createChatRequest = new CreateChatRequest(56L);

        // when
        CreateChatResponse body = api.createChat(businessId, createChatRequest).block();

        // then
        // TODO implement the createChatTest()
    }

    
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
     * Удаление комментария к отзыву
     *
     * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteGoodsFeedbackCommentTest() {
        // given
        Long businessId = 56L;
        DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest = new DeleteGoodsFeedbackCommentRequest(56L);

        // when
        EmptyApiResponse body = api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest).block();

        // then
        // TODO implement the deleteGoodsFeedbackCommentTest()
    }

    
    /**
     * Возобновление показа товаров
     *
     * Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteHiddenOffersTest() {
        // given
        Long campaignId = 56L;
        DeleteHiddenOffersRequest deleteHiddenOffersRequest = new DeleteHiddenOffersRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest).block();

        // then
        // TODO implement the deleteHiddenOffersTest()
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
     * Удаление товаров из акции
     *
     * Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deletePromoOffersTest() {
        // given
        Long businessId = 56L;
        DeletePromoOffersRequest deletePromoOffersRequest = new DeletePromoOffersRequest("example");

        // when
        DeletePromoOffersResponse body = api.deletePromoOffers(businessId, deletePromoOffersRequest).block();

        // then
        // TODO implement the deletePromoOffersTest()
    }

    
    /**
     * Отчет по бусту продаж
     *
     * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateBoostConsolidatedReportTest() {
        // given
        GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = new GenerateBoostConsolidatedRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, _format).block();

        // then
        // TODO implement the generateBoostConsolidatedReportTest()
    }

    
    /**
     * Отчет «Конкурентная позиция»
     *
     * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateCompetitorsPositionReportTest() {
        // given
        GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = new GenerateCompetitorsPositionReportRequest(56L, 56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, _format).block();

        // then
        // TODO implement the generateCompetitorsPositionReportTest()
    }

    
    /**
     * Отчет по отзывам о товарах
     *
     * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateGoodsFeedbackReportTest() {
        // given
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = new GenerateGoodsFeedbackRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, _format).block();

        // then
        // TODO implement the generateGoodsFeedbackReportTest()
    }

    
    /**
     * Отчет по движению товаров
     *
     * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateGoodsMovementReportTest() {
        // given
        GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = new GenerateGoodsMovementReportRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateGoodsMovementReport(generateGoodsMovementReportRequest, _format).block();

        // then
        // TODO implement the generateGoodsMovementReportTest()
    }

    
    /**
     * Отчет по реализации
     *
     * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateGoodsRealizationReportTest() {
        // given
        GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = new GenerateGoodsRealizationReportRequest(56L, 56, 56);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, _format).block();

        // then
        // TODO implement the generateGoodsRealizationReportTest()
    }

    
    /**
     * Отчет по оборачиваемости
     *
     * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateGoodsTurnoverReportTest() {
        // given
        GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = new GenerateGoodsTurnoverRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, _format).block();

        // then
        // TODO implement the generateGoodsTurnoverReportTest()
    }

    
    /**
     * Отчет «Цены на рынке»
     *
     * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generatePricesReportTest() {
        // given
        GeneratePricesReportRequest generatePricesReportRequest = new GeneratePricesReportRequest();
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generatePricesReport(generatePricesReportRequest, _format).block();

        // then
        // TODO implement the generatePricesReportTest()
    }

    
    /**
     * Отчет по полкам
     *
     * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateShelfsStatisticsReportTest() {
        // given
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = new GenerateShelfsStatisticsRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3), org.openapitools.model.ShelfsStatisticsAttributionType.fromValue("CLICKS"));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, _format).block();

        // then
        // TODO implement the generateShelfsStatisticsReportTest()
    }

    
    /**
     * Отчет «Аналитика продаж»
     *
     * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateShowsSalesReportTest() {
        // given
        GenerateShowsSalesReportRequest generateShowsSalesReportRequest = new GenerateShowsSalesReportRequest(LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3), org.openapitools.model.ShowsSalesGroupingType.fromValue("CATEGORIES"));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateShowsSalesReport(generateShowsSalesReportRequest, _format).block();

        // then
        // TODO implement the generateShowsSalesReportTest()
    }

    
    /**
     * Отчет по остаткам на складах
     *
     * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateStocksOnWarehousesReportTest() {
        // given
        GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = new GenerateStocksOnWarehousesReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, _format).block();

        // then
        // TODO implement the generateStocksOnWarehousesReportTest()
    }

    
    /**
     * Отчет по стоимости услуг
     *
     * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateUnitedMarketplaceServicesReportTest() {
        // given
        GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = new GenerateUnitedMarketplaceServicesReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, _format).block();

        // then
        // TODO implement the generateUnitedMarketplaceServicesReportTest()
    }

    
    /**
     * Отчет по платежам
     *
     * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateUnitedNettingReportTest() {
        // given
        GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = new GenerateUnitedNettingReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateUnitedNettingReport(generateUnitedNettingReportRequest, _format).block();

        // then
        // TODO implement the generateUnitedNettingReportTest()
    }

    
    /**
     * Отчет по заказам
     *
     * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateUnitedOrdersReportTest() {
        // given
        GenerateUnitedOrdersRequest generateUnitedOrdersRequest = new GenerateUnitedOrdersRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateUnitedOrdersReport(generateUnitedOrdersRequest, _format).block();

        // then
        // TODO implement the generateUnitedOrdersReportTest()
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
     * Информация об установленных ставках
     *
     * Возвращает значения ставок для заданных товаров.  {% note warning \&quot;\&quot; %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getBidsInfoForBusinessTest() {
        // given
        Long businessId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetBidsInfoRequest getBidsInfoRequest = new GetBidsInfoRequest();

        // when
        GetBidsInfoResponse body = api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest).block();

        // then
        // TODO implement the getBidsInfoForBusinessTest()
    }

    
    /**
     * Рекомендованные ставки для заданных товаров
     *
     * Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getBidsRecommendationsTest() {
        // given
        Long businessId = 56L;
        GetBidsRecommendationsRequest getBidsRecommendationsRequest = new GetBidsRecommendationsRequest(Arrays.asList("example"));

        // when
        GetBidsRecommendationsResponse body = api.getBidsRecommendations(businessId, getBidsRecommendationsRequest).block();

        // then
        // TODO implement the getBidsRecommendationsTest()
    }

    
    /**
     * Список товаров, находящихся в карантине по цене в кабинете
     *
     * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getBusinessQuarantineOffersTest() {
        // given
        Long businessId = 56L;
        GetQuarantineOffersRequest getQuarantineOffersRequest = new GetQuarantineOffersRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetQuarantineOffersResponse body = api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit).block();

        // then
        // TODO implement the getBusinessQuarantineOffersTest()
    }

    
    /**
     * Настройки кабинета
     *
     * Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getBusinessSettingsTest() {
        // given
        Long businessId = 56L;

        // when
        GetBusinessSettingsResponse body = api.getBusinessSettings(businessId).block();

        // then
        // TODO implement the getBusinessSettingsTest()
    }

    
    /**
     * Информация о магазине
     *
     * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignResponse body = api.getCampaign(campaignId).block();

        // then
        // TODO implement the getCampaignTest()
    }

    
    /**
     * Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignLoginsTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignLoginsResponse body = api.getCampaignLogins(campaignId).block();

        // then
        // TODO implement the getCampaignLoginsTest()
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
     * Список товаров, находящихся в карантине по цене в магазине
     *
     * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignQuarantineOffersTest() {
        // given
        Long campaignId = 56L;
        GetQuarantineOffersRequest getQuarantineOffersRequest = new GetQuarantineOffersRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetQuarantineOffersResponse body = api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit).block();

        // then
        // TODO implement the getCampaignQuarantineOffersTest()
    }

    
    /**
     * Регион магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignRegionTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignRegionResponse body = api.getCampaignRegion(campaignId).block();

        // then
        // TODO implement the getCampaignRegionTest()
    }

    
    /**
     * Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignSettingsTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignSettingsResponse body = api.getCampaignSettings(campaignId).block();

        // then
        // TODO implement the getCampaignSettingsTest()
    }

    
    /**
     * Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignsTest() {
        // given
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetCampaignsResponse body = api.getCampaigns(page, pageSize).block();

        // then
        // TODO implement the getCampaignsTest()
    }

    
    /**
     * Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignsByLoginTest() {
        // given
        String login = "example";
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetCampaignsResponse body = api.getCampaignsByLogin(login, page, pageSize).block();

        // then
        // TODO implement the getCampaignsByLoginTest()
    }

    
    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCategoriesMaxSaleQuantumTest() {
        // given
        GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = new GetCategoriesMaxSaleQuantumRequest(new HashSet<>());

        // when
        GetCategoriesMaxSaleQuantumResponse body = api.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest).block();

        // then
        // TODO implement the getCategoriesMaxSaleQuantumTest()
    }

    
    /**
     * Дерево категорий
     *
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCategoriesTreeTest() {
        // given
        GetCategoriesRequest getCategoriesRequest = new GetCategoriesRequest();

        // when
        GetCategoriesResponse body = api.getCategoriesTree(getCategoriesRequest).block();

        // then
        // TODO implement the getCategoriesTreeTest()
    }

    
    /**
     * Списки характеристик товаров по категориям
     *
     * Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCategoryContentParametersTest() {
        // given
        Long categoryId = 56L;

        // when
        GetCategoryContentParametersResponse body = api.getCategoryContentParameters(categoryId).block();

        // then
        // TODO implement the getCategoryContentParametersTest()
    }

    
    /**
     * Получение истории сообщений в чате
     *
     * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getChatHistoryTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        GetChatHistoryRequest getChatHistoryRequest = new GetChatHistoryRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetChatHistoryResponse body = api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit).block();

        // then
        // TODO implement the getChatHistoryTest()
    }

    
    /**
     * Получение доступных чатов
     *
     * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getChatsTest() {
        // given
        Long businessId = 56L;
        GetChatsRequest getChatsRequest = new GetChatsRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetChatsResponse body = api.getChats(businessId, getChatsRequest, pageToken, limit).block();

        // then
        // TODO implement the getChatsTest()
    }

    
    /**
     * Информация о прайс-листе
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFeedTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;

        // when
        GetFeedResponse body = api.getFeed(campaignId, feedId).block();

        // then
        // TODO implement the getFeedTest()
    }

    
    /**
     * Отчет по индексации прайс-листа
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFeedIndexLogsTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;
        Integer limit = 20;
        OffsetDateTime publishedTimeFrom = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime publishedTimeTo = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        FeedIndexLogsStatusType status = FeedIndexLogsStatusType.fromValue("ERROR");

        // when
        GetFeedIndexLogsResponse body = api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status).block();

        // then
        // TODO implement the getFeedIndexLogsTest()
    }

    
    /**
     * Новые и обновленные отзывы о магазине
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFeedbackAndCommentUpdatesTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        LocalDate fromDate = LocalDate.of(2001, 2, 3);

        // when
        GetFeedbackListResponse body = api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate).block();

        // then
        // TODO implement the getFeedbackAndCommentUpdatesTest()
    }

    
    /**
     * Список прайс-листов магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFeedsTest() {
        // given
        Long campaignId = 56L;

        // when
        GetFeedsResponse body = api.getFeeds(campaignId).block();

        // then
        // TODO implement the getFeedsTest()
    }

    
    /**
     * Идентификаторы складов Маркета (FBY)
     *
     * Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFulfillmentWarehousesTest() {
        // given

        // when
        GetFulfillmentWarehousesResponse body = api.getFulfillmentWarehouses().block();

        // then
        // TODO implement the getFulfillmentWarehousesTest()
    }

    
    /**
     * Получение комментариев к отзыву
     *
     * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getGoodsFeedbackCommentsTest() {
        // given
        Long businessId = 56L;
        GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = new GetGoodsFeedbackCommentsRequest(56L);
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetGoodsFeedbackCommentsResponse body = api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit).block();

        // then
        // TODO implement the getGoodsFeedbackCommentsTest()
    }

    
    /**
     * Получение отзывов о товарах продавца
     *
     * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getGoodsFeedbacksTest() {
        // given
        Long businessId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetGoodsFeedbackRequest getGoodsFeedbackRequest = new GetGoodsFeedbackRequest();

        // when
        GetGoodsFeedbackResponse body = api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest).block();

        // then
        // TODO implement the getGoodsFeedbacksTest()
    }

    
    /**
     * Отчет по товарам
     *
     * Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getGoodsStatsTest() {
        // given
        Long campaignId = 56L;
        GetGoodsStatsRequest getGoodsStatsRequest = new GetGoodsStatsRequest(new HashSet<>());

        // when
        GetGoodsStatsResponse body = api.getGoodsStats(campaignId, getGoodsStatsRequest).block();

        // then
        // TODO implement the getGoodsStatsTest()
    }

    
    /**
     * Информация о скрытых вами товарах
     *
     * Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getHiddenOffersTest() {
        // given
        Long campaignId = 56L;
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId = Arrays.asList("example");
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        Integer offset = 56;
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetHiddenOffersResponse body = api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize).block();

        // then
        // TODO implement the getHiddenOffersTest()
    }

    
    /**
     * Получение информации о заполненности карточек магазина
     *
     * Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOfferCardsContentStatusTest() {
        // given
        Long businessId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = new GetOfferCardsContentStatusRequest();

        // when
        GetOfferCardsContentStatusResponse body = api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest).block();

        // then
        // TODO implement the getOfferCardsContentStatusTest()
    }

    
    /**
     * Список товаров в каталоге
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOfferMappingEntriesTest() {
        // given
        Long campaignId = 56L;
        List<String> offerId = Arrays.asList("example");
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSku = Arrays.asList("example");
        OfferMappingKindType mappingKind = OfferMappingKindType.fromValue("ACTIVE");
        List<OfferProcessingStatusType> status = Arrays.asList();
        List<OfferAvailabilityStatusType> availability = Arrays.asList();
        List<Integer> categoryId = Arrays.asList();
        List<String> vendor = Arrays.asList("example");
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetOfferMappingEntriesResponse body = api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit).block();

        // then
        // TODO implement the getOfferMappingEntriesTest()
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
     * Информация об одном заказе
     *
     * Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrderTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetOrderResponse body = api.getOrder(campaignId, orderId).block();

        // then
        // TODO implement the getOrderTest()
    }

    
    /**
     * Информация о покупателе — юридическом лице
     *
     * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrderBusinessBuyerInfoTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetBusinessBuyerInfoResponse body = api.getOrderBusinessBuyerInfo(campaignId, orderId).block();

        // then
        // TODO implement the getOrderBusinessBuyerInfoTest()
    }

    
    /**
     * Информация о документах
     *
     * Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrderBusinessDocumentsInfoTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetBusinessDocumentsInfoResponse body = api.getOrderBusinessDocumentsInfo(campaignId, orderId).block();

        // then
        // TODO implement the getOrderBusinessDocumentsInfoTest()
    }

    
    /**
     * Информация о нескольких заказах
     *
     * Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrdersTest() {
        // given
        Long campaignId = 56L;
        List<Long> orderIds = Arrays.asList();
        Set<OrderStatusType> status = new HashSet<>();
        Set<OrderSubstatusType> substatus = new HashSet<>();
        LocalDate fromDate = LocalDate.of(2001, 2, 3);
        LocalDate toDate = LocalDate.of(2001, 2, 3);
        LocalDate supplierShipmentDateFrom = LocalDate.of(2001, 2, 3);
        LocalDate supplierShipmentDateTo = LocalDate.of(2001, 2, 3);
        OffsetDateTime updatedAtFrom = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime updatedAtTo = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OrderDeliveryDispatchType dispatchType = OrderDeliveryDispatchType.fromValue("UNKNOWN");
        Boolean fake = false;
        Boolean hasCis = false;
        Boolean onlyWaitingForCancellationApprove = false;
        Boolean onlyEstimatedDelivery = false;
        OrderBuyerType buyerType = OrderBuyerType.fromValue("PERSON");
        Integer page = 1;
        Integer pageSize = 56;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetOrdersResponse body = api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit).block();

        // then
        // TODO implement the getOrdersTest()
    }

    
    /**
     * Детальная информация по заказам
     *
     * Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrdersStatsTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetOrdersStatsRequest getOrdersStatsRequest = new GetOrdersStatsRequest();

        // when
        GetOrdersStatsResponse body = api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest).block();

        // then
        // TODO implement the getOrdersStatsTest()
    }

    
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
     * Получение списка товаров, которые участвуют или могут участвовать в акции
     *
     * Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPromoOffersTest() {
        // given
        Long businessId = 56L;
        GetPromoOffersRequest getPromoOffersRequest = new GetPromoOffersRequest("example");
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetPromoOffersResponse body = api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit).block();

        // then
        // TODO implement the getPromoOffersTest()
    }

    
    /**
     * Получение списка акций
     *
     * Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPromosTest() {
        // given
        Long businessId = 56L;
        GetPromosRequest getPromosRequest = new GetPromosRequest();

        // when
        GetPromosResponse body = api.getPromos(businessId, getPromosRequest).block();

        // then
        // TODO implement the getPromosTest()
    }

    
    /**
     * Индекс качества магазинов
     *
     * Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getQualityRatingsTest() {
        // given
        Long businessId = 56L;
        GetQualityRatingRequest getQualityRatingRequest = new GetQualityRatingRequest(new HashSet<>());

        // when
        GetQualityRatingResponse body = api.getQualityRatings(businessId, getQualityRatingRequest).block();

        // then
        // TODO implement the getQualityRatingsTest()
    }

    
    /**
     * Получение заданного отчета
     *
     * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReportInfoTest() {
        // given
        String reportId = "example";

        // when
        GetReportInfoResponse body = api.getReportInfo(reportId).block();

        // then
        // TODO implement the getReportInfoTest()
    }

    
    /**
     * Информация о невыкупе или возврате
     *
     * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReturnTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;

        // when
        GetReturnResponse body = api.getReturn(campaignId, orderId, returnId).block();

        // then
        // TODO implement the getReturnTest()
    }

    
    /**
     * Получение фотографии возврата
     *
     * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReturnPhotoTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;
        Long itemId = 56L;
        String imageHash = "example";

        // when
        File body = api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash).block();

        // then
        // TODO implement the getReturnPhotoTest()
    }

    
    /**
     * Список невыкупов и возвратов
     *
     * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReturnsTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        List<Long> orderIds = Arrays.asList();
        List<RefundStatusType> statuses = Arrays.asList();
        ReturnType type = ReturnType.fromValue("UNREDEEMED");
        LocalDate fromDate = LocalDate.of(2001, 2, 3);
        LocalDate toDate = LocalDate.of(2001, 2, 3);
        LocalDate fromDate2 = LocalDate.of(2001, 2, 3);
        LocalDate toDate2 = LocalDate.of(2001, 2, 3);

        // when
        GetReturnsResponse body = api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2).block();

        // then
        // TODO implement the getReturnsTest()
    }

    
    /**
     * Информация об остатках и оборачиваемости
     *
     * Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
     */
    @Test
    @Disabled("Not Implemented")
    public void getStocksTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetWarehouseStocksRequest getWarehouseStocksRequest = new GetWarehouseStocksRequest();

        // when
        GetWarehouseStocksResponse body = api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest).block();

        // then
        // TODO implement the getStocksTest()
    }

    
    /**
     * Рекомендованные карточки для товаров
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getSuggestedOfferMappingEntriesTest() {
        // given
        Long campaignId = 56L;
        GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest = new GetSuggestedOfferMappingEntriesRequest(Arrays.asList());

        // when
        GetSuggestedOfferMappingEntriesResponse body = api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest).block();

        // then
        // TODO implement the getSuggestedOfferMappingEntriesTest()
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
     * Включение буста продаж и установка ставок
     *
     * Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \&quot;Как в кабинете выглядит кампания, созданная через API\&quot; %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void putBidsForBusinessTest() {
        // given
        Long businessId = 56L;
        PutSkuBidsRequest putSkuBidsRequest = new PutSkuBidsRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.putBidsForBusiness(businessId, putSkuBidsRequest).block();

        // then
        // TODO implement the putBidsForBusinessTest()
    }

    
    /**
     * Включение буста продаж и установка ставок для магазина
     *
     * Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void putBidsForCampaignTest() {
        // given
        Long campaignId = 56L;
        PutSkuBidsRequest putSkuBidsRequest = new PutSkuBidsRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.putBidsForCampaign(campaignId, putSkuBidsRequest).block();

        // then
        // TODO implement the putBidsForCampaignTest()
    }

    
    /**
     * Сообщить, что прайс-лист обновился
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void refreshFeedTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;

        // when
        EmptyApiResponse body = api.refreshFeed(campaignId, feedId).block();

        // then
        // TODO implement the refreshFeedTest()
    }

    
    /**
     * Информация о дочерних регионах
     *
     * Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void searchRegionChildrenTest() {
        // given
        Long regionId = 56L;
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetRegionWithChildrenResponse body = api.searchRegionChildren(regionId, page, pageSize).block();

        // then
        // TODO implement the searchRegionChildrenTest()
    }

    
    /**
     * Информация о регионе
     *
     * Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void searchRegionsByIdTest() {
        // given
        Long regionId = 56L;

        // when
        GetRegionsResponse body = api.searchRegionsById(regionId).block();

        // then
        // TODO implement the searchRegionsByIdTest()
    }

    
    /**
     * Поиск регионов по их имени
     *
     * Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void searchRegionsByNameTest() {
        // given
        String name = "example";
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetRegionsResponse body = api.searchRegionsByName(name, pageToken, limit).block();

        // then
        // TODO implement the searchRegionsByNameTest()
    }

    
    /**
     * Отправка файла в чат
     *
     * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void sendFileToChatTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        File _file = null;

        // when
        EmptyApiResponse body = api.sendFileToChat(businessId, chatId, _file).block();

        // then
        // TODO implement the sendFileToChatTest()
    }

    
    /**
     * Отправка сообщения в чат
     *
     * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void sendMessageToChatTest() {
        // given
        Long businessId = 56L;
        Long chatId = 56L;
        SendMessageToChatRequest sendMessageToChatRequest = new SendMessageToChatRequest("example");

        // when
        EmptyApiResponse body = api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest).block();

        // then
        // TODO implement the sendMessageToChatTest()
    }

    
    /**
     * Изменение параметров прайс-листа
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void setFeedParamsTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;
        SetFeedParamsRequest setFeedParamsRequest = new SetFeedParamsRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.setFeedParams(campaignId, feedId, setFeedParamsRequest).block();

        // then
        // TODO implement the setFeedParamsTest()
    }

    
    /**
     * Отказ от ответа на отзывы
     *
     * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void skipGoodsFeedbacksReactionTest() {
        // given
        Long businessId = 56L;
        SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = new SkipGoodsFeedbackReactionRequest(new HashSet<>());

        // when
        EmptyApiResponse body = api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest).block();

        // then
        // TODO implement the skipGoodsFeedbacksReactionTest()
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

    
    /**
     * Добавление нового или изменение созданного комментария
     *
     * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateGoodsFeedbackCommentTest() {
        // given
        Long businessId = 56L;
        UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest = new UpdateGoodsFeedbackCommentRequest(56L, null);

        // when
        UpdateGoodsFeedbackCommentResponse body = api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest).block();

        // then
        // TODO implement the updateGoodsFeedbackCommentTest()
    }

    
    /**
     * Редактирование категорийных характеристик товара
     *
     * Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateOfferContentTest() {
        // given
        Long businessId = 56L;
        UpdateOfferContentRequest updateOfferContentRequest = new UpdateOfferContentRequest(Arrays.asList());

        // when
        UpdateOfferContentResponse body = api.updateOfferContent(businessId, updateOfferContentRequest).block();

        // then
        // TODO implement the updateOfferContentTest()
    }

    
    /**
     * Добавление и редактирование товаров в каталоге
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateOfferMappingEntriesTest() {
        // given
        Long campaignId = 56L;
        UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = new UpdateOfferMappingEntryRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest).block();

        // then
        // TODO implement the updateOfferMappingEntriesTest()
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

    
    /**
     * Добавление товаров в акцию или изменение их цен
     *
     * Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updatePromoOffersTest() {
        // given
        Long businessId = 56L;
        UpdatePromoOffersRequest updatePromoOffersRequest = new UpdatePromoOffersRequest("example", Arrays.asList());

        // when
        UpdatePromoOffersResponse body = api.updatePromoOffers(businessId, updatePromoOffersRequest).block();

        // then
        // TODO implement the updatePromoOffersTest()
    }

    
}
