# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.add_hidden_offers_request import AddHiddenOffersRequest
from ympa_python_fastapi_server.models.add_offers_to_archive_request import AddOffersToArchiveRequest
from ympa_python_fastapi_server.models.add_offers_to_archive_response import AddOffersToArchiveResponse
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.calculate_tariffs_request import CalculateTariffsRequest
from ympa_python_fastapi_server.models.calculate_tariffs_response import CalculateTariffsResponse
from ympa_python_fastapi_server.models.confirm_prices_request import ConfirmPricesRequest
from ympa_python_fastapi_server.models.create_chat_request import CreateChatRequest
from ympa_python_fastapi_server.models.create_chat_response import CreateChatResponse
from ympa_python_fastapi_server.models.currency_type import CurrencyType
from ympa_python_fastapi_server.models.delete_campaign_offers_request import DeleteCampaignOffersRequest
from ympa_python_fastapi_server.models.delete_campaign_offers_response import DeleteCampaignOffersResponse
from ympa_python_fastapi_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest
from ympa_python_fastapi_server.models.delete_hidden_offers_request import DeleteHiddenOffersRequest
from ympa_python_fastapi_server.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest
from ympa_python_fastapi_server.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse
from ympa_python_fastapi_server.models.delete_offers_request import DeleteOffersRequest
from ympa_python_fastapi_server.models.delete_offers_response import DeleteOffersResponse
from ympa_python_fastapi_server.models.delete_promo_offers_request import DeletePromoOffersRequest
from ympa_python_fastapi_server.models.delete_promo_offers_response import DeletePromoOffersResponse
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse
from ympa_python_fastapi_server.models.feed_index_logs_status_type import FeedIndexLogsStatusType
from ympa_python_fastapi_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest
from ympa_python_fastapi_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest
from ympa_python_fastapi_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest
from ympa_python_fastapi_server.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest
from ympa_python_fastapi_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest
from ympa_python_fastapi_server.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest
from ympa_python_fastapi_server.models.generate_prices_report_request import GeneratePricesReportRequest
from ympa_python_fastapi_server.models.generate_report_response import GenerateReportResponse
from ympa_python_fastapi_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest
from ympa_python_fastapi_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest
from ympa_python_fastapi_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest
from ympa_python_fastapi_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest
from ympa_python_fastapi_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest
from ympa_python_fastapi_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest
from ympa_python_fastapi_server.models.get_all_offers_response import GetAllOffersResponse
from ympa_python_fastapi_server.models.get_bids_info_request import GetBidsInfoRequest
from ympa_python_fastapi_server.models.get_bids_info_response import GetBidsInfoResponse
from ympa_python_fastapi_server.models.get_bids_recommendations_request import GetBidsRecommendationsRequest
from ympa_python_fastapi_server.models.get_bids_recommendations_response import GetBidsRecommendationsResponse
from ympa_python_fastapi_server.models.get_business_buyer_info_response import GetBusinessBuyerInfoResponse
from ympa_python_fastapi_server.models.get_business_documents_info_response import GetBusinessDocumentsInfoResponse
from ympa_python_fastapi_server.models.get_business_settings_response import GetBusinessSettingsResponse
from ympa_python_fastapi_server.models.get_campaign_logins_response import GetCampaignLoginsResponse
from ympa_python_fastapi_server.models.get_campaign_offers_request import GetCampaignOffersRequest
from ympa_python_fastapi_server.models.get_campaign_offers_response import GetCampaignOffersResponse
from ympa_python_fastapi_server.models.get_campaign_region_response import GetCampaignRegionResponse
from ympa_python_fastapi_server.models.get_campaign_response import GetCampaignResponse
from ympa_python_fastapi_server.models.get_campaign_settings_response import GetCampaignSettingsResponse
from ympa_python_fastapi_server.models.get_campaigns_response import GetCampaignsResponse
from ympa_python_fastapi_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest
from ympa_python_fastapi_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse
from ympa_python_fastapi_server.models.get_categories_request import GetCategoriesRequest
from ympa_python_fastapi_server.models.get_categories_response import GetCategoriesResponse
from ympa_python_fastapi_server.models.get_category_content_parameters_response import GetCategoryContentParametersResponse
from ympa_python_fastapi_server.models.get_chat_history_request import GetChatHistoryRequest
from ympa_python_fastapi_server.models.get_chat_history_response import GetChatHistoryResponse
from ympa_python_fastapi_server.models.get_chats_request import GetChatsRequest
from ympa_python_fastapi_server.models.get_chats_response import GetChatsResponse
from ympa_python_fastapi_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse
from ympa_python_fastapi_server.models.get_feed_response import GetFeedResponse
from ympa_python_fastapi_server.models.get_feedback_list_response import GetFeedbackListResponse
from ympa_python_fastapi_server.models.get_feeds_response import GetFeedsResponse
from ympa_python_fastapi_server.models.get_fulfillment_warehouses_response import GetFulfillmentWarehousesResponse
from ympa_python_fastapi_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest
from ympa_python_fastapi_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse
from ympa_python_fastapi_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest
from ympa_python_fastapi_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse
from ympa_python_fastapi_server.models.get_goods_stats_request import GetGoodsStatsRequest
from ympa_python_fastapi_server.models.get_goods_stats_response import GetGoodsStatsResponse
from ympa_python_fastapi_server.models.get_hidden_offers_response import GetHiddenOffersResponse
from ympa_python_fastapi_server.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest
from ympa_python_fastapi_server.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse
from ympa_python_fastapi_server.models.get_offer_mapping_entries_response import GetOfferMappingEntriesResponse
from ympa_python_fastapi_server.models.get_offer_mappings_request import GetOfferMappingsRequest
from ympa_python_fastapi_server.models.get_offer_mappings_response import GetOfferMappingsResponse
from ympa_python_fastapi_server.models.get_offer_recommendations_request import GetOfferRecommendationsRequest
from ympa_python_fastapi_server.models.get_offer_recommendations_response import GetOfferRecommendationsResponse
from ympa_python_fastapi_server.models.get_offers_response import GetOffersResponse
from ympa_python_fastapi_server.models.get_order_response import GetOrderResponse
from ympa_python_fastapi_server.models.get_orders_response import GetOrdersResponse
from ympa_python_fastapi_server.models.get_orders_stats_request import GetOrdersStatsRequest
from ympa_python_fastapi_server.models.get_orders_stats_response import GetOrdersStatsResponse
from ympa_python_fastapi_server.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest
from ympa_python_fastapi_server.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse
from ympa_python_fastapi_server.models.get_prices_response import GetPricesResponse
from ympa_python_fastapi_server.models.get_promo_offers_request import GetPromoOffersRequest
from ympa_python_fastapi_server.models.get_promo_offers_response import GetPromoOffersResponse
from ympa_python_fastapi_server.models.get_promos_request import GetPromosRequest
from ympa_python_fastapi_server.models.get_promos_response import GetPromosResponse
from ympa_python_fastapi_server.models.get_quality_rating_request import GetQualityRatingRequest
from ympa_python_fastapi_server.models.get_quality_rating_response import GetQualityRatingResponse
from ympa_python_fastapi_server.models.get_quarantine_offers_request import GetQuarantineOffersRequest
from ympa_python_fastapi_server.models.get_quarantine_offers_response import GetQuarantineOffersResponse
from ympa_python_fastapi_server.models.get_region_with_children_response import GetRegionWithChildrenResponse
from ympa_python_fastapi_server.models.get_regions_response import GetRegionsResponse
from ympa_python_fastapi_server.models.get_report_info_response import GetReportInfoResponse
from ympa_python_fastapi_server.models.get_return_response import GetReturnResponse
from ympa_python_fastapi_server.models.get_returns_response import GetReturnsResponse
from ympa_python_fastapi_server.models.get_suggested_offer_mapping_entries_request import GetSuggestedOfferMappingEntriesRequest
from ympa_python_fastapi_server.models.get_suggested_offer_mapping_entries_response import GetSuggestedOfferMappingEntriesResponse
from ympa_python_fastapi_server.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest
from ympa_python_fastapi_server.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse
from ympa_python_fastapi_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest
from ympa_python_fastapi_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse
from ympa_python_fastapi_server.models.offer_availability_status_type import OfferAvailabilityStatusType
from ympa_python_fastapi_server.models.offer_mapping_kind_type import OfferMappingKindType
from ympa_python_fastapi_server.models.offer_processing_status_type import OfferProcessingStatusType
from ympa_python_fastapi_server.models.order_buyer_type import OrderBuyerType
from ympa_python_fastapi_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType
from ympa_python_fastapi_server.models.order_status_type import OrderStatusType
from ympa_python_fastapi_server.models.order_substatus_type import OrderSubstatusType
from ympa_python_fastapi_server.models.put_sku_bids_request import PutSkuBidsRequest
from ympa_python_fastapi_server.models.refund_status_type import RefundStatusType
from ympa_python_fastapi_server.models.report_format_type import ReportFormatType
from ympa_python_fastapi_server.models.return_type import ReturnType
from ympa_python_fastapi_server.models.send_message_to_chat_request import SendMessageToChatRequest
from ympa_python_fastapi_server.models.set_feed_params_request import SetFeedParamsRequest
from ympa_python_fastapi_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest
from ympa_python_fastapi_server.models.suggest_prices_request import SuggestPricesRequest
from ympa_python_fastapi_server.models.suggest_prices_response import SuggestPricesResponse
from ympa_python_fastapi_server.models.update_business_prices_request import UpdateBusinessPricesRequest
from ympa_python_fastapi_server.models.update_campaign_offers_request import UpdateCampaignOffersRequest
from ympa_python_fastapi_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest
from ympa_python_fastapi_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse
from ympa_python_fastapi_server.models.update_offer_content_request import UpdateOfferContentRequest
from ympa_python_fastapi_server.models.update_offer_content_response import UpdateOfferContentResponse
from ympa_python_fastapi_server.models.update_offer_mapping_entry_request import UpdateOfferMappingEntryRequest
from ympa_python_fastapi_server.models.update_offer_mappings_request import UpdateOfferMappingsRequest
from ympa_python_fastapi_server.models.update_offer_mappings_response import UpdateOfferMappingsResponse
from ympa_python_fastapi_server.models.update_prices_request import UpdatePricesRequest
from ympa_python_fastapi_server.models.update_promo_offers_request import UpdatePromoOffersRequest
from ympa_python_fastapi_server.models.update_promo_offers_response import UpdatePromoOffersResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseFbyApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseFbyApi.subclasses = BaseFbyApi.subclasses + (cls,)
    async def add_hidden_offers(
        self,
        campaignId: int,
        add_hidden_offers_request: AddHiddenOffersRequest,
    ) -> EmptyApiResponse:
        """Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def add_offers_to_archive(
        self,
        businessId: int,
        add_offers_to_archive_request: AddOffersToArchiveRequest,
    ) -> AddOffersToArchiveResponse:
        """Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
        ...


    async def calculate_tariffs(
        self,
        calculate_tariffs_request: CalculateTariffsRequest,
    ) -> CalculateTariffsResponse:
        """Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
        ...


    async def confirm_business_prices(
        self,
        businessId: int,
        confirm_prices_request: ConfirmPricesRequest,
    ) -> EmptyApiResponse:
        """Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
        ...


    async def confirm_campaign_prices(
        self,
        campaignId: int,
        confirm_prices_request: ConfirmPricesRequest,
    ) -> EmptyApiResponse:
        """Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def create_chat(
        self,
        businessId: int,
        create_chat_request: CreateChatRequest,
    ) -> CreateChatResponse:
        """Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def delete_campaign_offers(
        self,
        campaignId: int,
        delete_campaign_offers_request: DeleteCampaignOffersRequest,
    ) -> DeleteCampaignOffersResponse:
        """Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def delete_goods_feedback_comment(
        self,
        businessId: int,
        delete_goods_feedback_comment_request: DeleteGoodsFeedbackCommentRequest,
    ) -> EmptyApiResponse:
        """Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def delete_hidden_offers(
        self,
        campaignId: int,
        delete_hidden_offers_request: DeleteHiddenOffersRequest,
    ) -> EmptyApiResponse:
        """Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def delete_offers(
        self,
        businessId: int,
        delete_offers_request: DeleteOffersRequest,
    ) -> DeleteOffersResponse:
        """Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
        ...


    async def delete_offers_from_archive(
        self,
        businessId: int,
        delete_offers_from_archive_request: DeleteOffersFromArchiveRequest,
    ) -> DeleteOffersFromArchiveResponse:
        """Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
        ...


    async def delete_promo_offers(
        self,
        businessId: int,
        delete_promo_offers_request: DeletePromoOffersRequest,
    ) -> DeletePromoOffersResponse:
        """Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def generate_boost_consolidated_report(
        self,
        generate_boost_consolidated_request: GenerateBoostConsolidatedRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_competitors_position_report(
        self,
        generate_competitors_position_report_request: GenerateCompetitorsPositionReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| """
        ...


    async def generate_goods_feedback_report(
        self,
        generate_goods_feedback_request: GenerateGoodsFeedbackRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_goods_movement_report(
        self,
        generate_goods_movement_report_request: GenerateGoodsMovementReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_goods_realization_report(
        self,
        generate_goods_realization_report_request: GenerateGoodsRealizationReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_goods_turnover_report(
        self,
        generate_goods_turnover_request: GenerateGoodsTurnoverRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_prices_report(
        self,
        generate_prices_report_request: GeneratePricesReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_shelfs_statistics_report(
        self,
        generate_shelfs_statistics_request: GenerateShelfsStatisticsRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_shows_sales_report(
        self,
        generate_shows_sales_report_request: GenerateShowsSalesReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| """
        ...


    async def generate_stocks_on_warehouses_report(
        self,
        generate_stocks_on_warehouses_report_request: GenerateStocksOnWarehousesReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_united_marketplace_services_report(
        self,
        generate_united_marketplace_services_report_request: GenerateUnitedMarketplaceServicesReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_united_netting_report(
        self,
        generate_united_netting_report_request: GenerateUnitedNettingReportRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def generate_united_orders_report(
        self,
        generate_united_orders_request: GenerateUnitedOrdersRequest,
        format: ,
    ) -> GenerateReportResponse:
        """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def get_all_offers(
        self,
        campaignId: int,
        feed_id: int,
        chunk: int,
    ) -> GetAllOffersResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) """
        ...


    async def get_bids_info_for_business(
        self,
        businessId: int,
        page_token: str,
        limit: int,
        get_bids_info_request: GetBidsInfoRequest,
    ) -> GetBidsInfoResponse:
        """Возвращает значения ставок для заданных товаров.  {% note warning \&quot;\&quot; %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| """
        ...


    async def get_bids_recommendations(
        self,
        businessId: int,
        get_bids_recommendations_request: GetBidsRecommendationsRequest,
    ) -> GetBidsRecommendationsResponse:
        """Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| """
        ...


    async def get_business_quarantine_offers(
        self,
        businessId: int,
        get_quarantine_offers_request: GetQuarantineOffersRequest,
        page_token: str,
        limit: int,
    ) -> GetQuarantineOffersResponse:
        """Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
        ...


    async def get_business_settings(
        self,
        businessId: int,
    ) -> GetBusinessSettingsResponse:
        """Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaign(
        self,
        campaignId: int,
    ) -> GetCampaignResponse:
        """Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaign_logins(
        self,
        campaignId: int,
    ) -> GetCampaignLoginsResponse:
        """Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaign_offers(
        self,
        campaignId: int,
        get_campaign_offers_request: GetCampaignOffersRequest,
        page_token: str,
        limit: int,
    ) -> GetCampaignOffersResponse:
        """Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def get_campaign_quarantine_offers(
        self,
        campaignId: int,
        get_quarantine_offers_request: GetQuarantineOffersRequest,
        page_token: str,
        limit: int,
    ) -> GetQuarantineOffersResponse:
        """Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def get_campaign_region(
        self,
        campaignId: int,
    ) -> GetCampaignRegionResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| """
        ...


    async def get_campaign_settings(
        self,
        campaignId: int,
    ) -> GetCampaignSettingsResponse:
        """Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaigns(
        self,
        page: int,
        page_size: int,
    ) -> GetCampaignsResponse:
        """Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_campaigns_by_login(
        self,
        login: str,
        page: int,
        page_size: int,
    ) -> GetCampaignsResponse:
        """Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def get_categories_max_sale_quantum(
        self,
        get_categories_max_sale_quantum_request: GetCategoriesMaxSaleQuantumRequest,
    ) -> GetCategoriesMaxSaleQuantumResponse:
        """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def get_categories_tree(
        self,
        get_categories_request: GetCategoriesRequest,
    ) -> GetCategoriesResponse:
        """Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def get_category_content_parameters(
        self,
        categoryId: int,
    ) -> GetCategoryContentParametersResponse:
        """Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| """
        ...


    async def get_chat_history(
        self,
        businessId: int,
        chat_id: int,
        get_chat_history_request: GetChatHistoryRequest,
        page_token: str,
        limit: int,
    ) -> GetChatHistoryResponse:
        """Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def get_chats(
        self,
        businessId: int,
        get_chats_request: GetChatsRequest,
        page_token: str,
        limit: int,
    ) -> GetChatsResponse:
        """Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def get_feed(
        self,
        campaignId: int,
        feedId: int,
    ) -> GetFeedResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_feed_index_logs(
        self,
        campaignId: int,
        feedId: int,
        limit: int,
        published_time_from: str,
        published_time_to: str,
        status: ,
    ) -> GetFeedIndexLogsResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def get_feedback_and_comment_updates(
        self,
        campaignId: int,
        page_token: str,
        limit: int,
        from_date: str,
    ) -> GetFeedbackListResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| """
        ...


    async def get_feeds(
        self,
        campaignId: int,
    ) -> GetFeedsResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_fulfillment_warehouses(
        self,
    ) -> GetFulfillmentWarehousesResponse:
        """Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
        ...


    async def get_goods_feedback_comments(
        self,
        businessId: int,
        get_goods_feedback_comments_request: GetGoodsFeedbackCommentsRequest,
        page_token: str,
        limit: int,
    ) -> GetGoodsFeedbackCommentsResponse:
        """Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def get_goods_feedbacks(
        self,
        businessId: int,
        page_token: str,
        limit: int,
        get_goods_feedback_request: GetGoodsFeedbackRequest,
    ) -> GetGoodsFeedbackResponse:
        """Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def get_goods_stats(
        self,
        campaignId: int,
        get_goods_stats_request: GetGoodsStatsRequest,
    ) -> GetGoodsStatsResponse:
        """Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def get_hidden_offers(
        self,
        campaignId: int,
        offer_id: List[str],
        page_token: str,
        limit: int,
        offset: int,
        page: int,
        page_size: int,
    ) -> GetHiddenOffersResponse:
        """Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
        ...


    async def get_offer_cards_content_status(
        self,
        businessId: int,
        page_token: str,
        limit: int,
        get_offer_cards_content_status_request: GetOfferCardsContentStatusRequest,
    ) -> GetOfferCardsContentStatusResponse:
        """Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| """
        ...


    async def get_offer_mapping_entries(
        self,
        campaignId: int,
        offer_id: List[str],
        shop_sku: List[str],
        mapping_kind: ,
        status: List[OfferProcessingStatusType],
        availability: List[OfferAvailabilityStatusType],
        category_id: List[int],
        vendor: List[str],
        page_token: str,
        limit: int,
    ) -> GetOfferMappingEntriesResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) """
        ...


    async def get_offer_mappings(
        self,
        businessId: int,
        page_token: str,
        limit: int,
        get_offer_mappings_request: GetOfferMappingsRequest,
    ) -> GetOfferMappingsResponse:
        """Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| """
        ...


    async def get_offer_recommendations(
        self,
        businessId: int,
        get_offer_recommendations_request: GetOfferRecommendationsRequest,
        page_token: str,
        limit: int,
    ) -> GetOfferRecommendationsResponse:
        """Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
        ...


    async def get_offers(
        self,
        campaignId: int,
        query: str,
        feed_id: int,
        shop_category_id: str,
        currency: ,
        matched: bool,
        page: int,
        page_size: int,
    ) -> GetOffersResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) """
        ...


    async def get_order(
        self,
        campaignId: int,
        orderId: int,
    ) -> GetOrderResponse:
        """Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
        ...


    async def get_order_business_buyer_info(
        self,
        campaignId: int,
        orderId: int,
    ) -> GetBusinessBuyerInfoResponse:
        """Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| """
        ...


    async def get_order_business_documents_info(
        self,
        campaignId: int,
        orderId: int,
    ) -> GetBusinessDocumentsInfoResponse:
        """Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| """
        ...


    async def get_orders(
        self,
        campaignId: int,
        order_ids: List[int],
        status: list[OrderStatusType],
        substatus: list[OrderSubstatusType],
        from_date: str,
        to_date: str,
        supplier_shipment_date_from: str,
        supplier_shipment_date_to: str,
        updated_at_from: str,
        updated_at_to: str,
        dispatch_type: ,
        fake: bool,
        has_cis: bool,
        only_waiting_for_cancellation_approve: bool,
        only_estimated_delivery: bool,
        buyer_type: ,
        page: int,
        page_size: int,
        page_token: str,
        limit: int,
    ) -> GetOrdersResponse:
        """Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
        ...


    async def get_orders_stats(
        self,
        campaignId: int,
        page_token: str,
        limit: int,
        get_orders_stats_request: GetOrdersStatsRequest,
    ) -> GetOrdersStatsResponse:
        """Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
        ...


    async def get_prices(
        self,
        campaignId: int,
        page_token: str,
        limit: int,
        archived: bool,
    ) -> GetPricesResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| """
        ...


    async def get_prices_by_offer_ids(
        self,
        campaignId: int,
        page_token: str,
        limit: int,
        get_prices_by_offer_ids_request: GetPricesByOfferIdsRequest,
    ) -> GetPricesByOfferIdsResponse:
        """Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) """
        ...


    async def get_promo_offers(
        self,
        businessId: int,
        get_promo_offers_request: GetPromoOffersRequest,
        page_token: str,
        limit: int,
    ) -> GetPromoOffersResponse:
        """Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def get_promos(
        self,
        businessId: int,
        get_promos_request: GetPromosRequest,
    ) -> GetPromosResponse:
        """Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def get_quality_ratings(
        self,
        businessId: int,
        get_quality_rating_request: GetQualityRatingRequest,
    ) -> GetQualityRatingResponse:
        """Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...


    async def get_report_info(
        self,
        reportId: str,
    ) -> GetReportInfoResponse:
        """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
        ...


    async def get_return(
        self,
        campaignId: int,
        orderId: int,
        returnId: int,
    ) -> GetReturnResponse:
        """Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...


    async def get_return_photo(
        self,
        campaignId: int,
        orderId: int,
        returnId: int,
        itemId: int,
        imageHash: str,
    ) -> file:
        """Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...


    async def get_returns(
        self,
        campaignId: int,
        page_token: str,
        limit: int,
        order_ids: List[int],
        statuses: List[RefundStatusType],
        type: ,
        from_date: str,
        to_date: str,
        from_date2: str,
        to_date2: str,
    ) -> GetReturnsResponse:
        """Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
        ...


    async def get_stocks(
        self,
        campaignId: int,
        page_token: str,
        limit: int,
        get_warehouse_stocks_request: GetWarehouseStocksRequest,
    ) -> GetWarehouseStocksResponse:
        """Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) """
        ...


    async def get_suggested_offer_mapping_entries(
        self,
        campaignId: int,
        get_suggested_offer_mapping_entries_request: GetSuggestedOfferMappingEntriesRequest,
    ) -> GetSuggestedOfferMappingEntriesResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| """
        ...


    async def get_suggested_offer_mappings(
        self,
        businessId: int,
        get_suggested_offer_mappings_request: GetSuggestedOfferMappingsRequest,
    ) -> GetSuggestedOfferMappingsResponse:
        """Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| """
        ...


    async def get_suggested_prices(
        self,
        campaignId: int,
        suggest_prices_request: SuggestPricesRequest,
    ) -> SuggestPricesResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| """
        ...


    async def put_bids_for_business(
        self,
        businessId: int,
        put_sku_bids_request: PutSkuBidsRequest,
    ) -> EmptyApiResponse:
        """Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \&quot;Как в кабинете выглядит кампания, созданная через API\&quot; %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| """
        ...


    async def put_bids_for_campaign(
        self,
        campaignId: int,
        put_sku_bids_request: PutSkuBidsRequest,
    ) -> EmptyApiResponse:
        """Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| """
        ...


    async def refresh_feed(
        self,
        campaignId: int,
        feedId: int,
    ) -> EmptyApiResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| """
        ...


    async def search_region_children(
        self,
        regionId: int,
        page: int,
        page_size: int,
    ) -> GetRegionWithChildrenResponse:
        """Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| """
        ...


    async def search_regions_by_id(
        self,
        regionId: int,
    ) -> GetRegionsResponse:
        """Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| """
        ...


    async def search_regions_by_name(
        self,
        name: str,
        page_token: str,
        limit: int,
    ) -> GetRegionsResponse:
        """Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| """
        ...


    async def send_file_to_chat(
        self,
        businessId: int,
        chat_id: int,
        file: str,
    ) -> EmptyApiResponse:
        """Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def send_message_to_chat(
        self,
        businessId: int,
        chat_id: int,
        send_message_to_chat_request: SendMessageToChatRequest,
    ) -> EmptyApiResponse:
        """Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
        ...


    async def set_feed_params(
        self,
        campaignId: int,
        feedId: int,
        set_feed_params_request: SetFeedParamsRequest,
    ) -> EmptyApiResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| """
        ...


    async def skip_goods_feedbacks_reaction(
        self,
        businessId: int,
        skip_goods_feedback_reaction_request: SkipGoodsFeedbackReactionRequest,
    ) -> EmptyApiResponse:
        """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def update_business_prices(
        self,
        businessId: int,
        update_business_prices_request: UpdateBusinessPricesRequest,
    ) -> EmptyApiResponse:
        """Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
        ...


    async def update_campaign_offers(
        self,
        campaignId: int,
        update_campaign_offers_request: UpdateCampaignOffersRequest,
    ) -> EmptyApiResponse:
        """Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def update_goods_feedback_comment(
        self,
        businessId: int,
        update_goods_feedback_comment_request: UpdateGoodsFeedbackCommentRequest,
    ) -> UpdateGoodsFeedbackCommentResponse:
        """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
        ...


    async def update_offer_content(
        self,
        businessId: int,
        update_offer_content_request: UpdateOfferContentRequest,
    ) -> UpdateOfferContentResponse:
        """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def update_offer_mapping_entries(
        self,
        campaignId: int,
        update_offer_mapping_entry_request: UpdateOfferMappingEntryRequest,
    ) -> EmptyApiResponse:
        """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| """
        ...


    async def update_offer_mappings(
        self,
        businessId: int,
        update_offer_mappings_request: UpdateOfferMappingsRequest,
    ) -> UpdateOfferMappingsResponse:
        """Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
        ...


    async def update_prices(
        self,
        campaignId: int,
        update_prices_request: UpdatePricesRequest,
    ) -> EmptyApiResponse:
        """Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...


    async def update_promo_offers(
        self,
        businessId: int,
        update_promo_offers_request: UpdatePromoOffersRequest,
    ) -> UpdatePromoOffersResponse:
        """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
        ...
