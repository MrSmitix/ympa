import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from ympa_python_flask_server.models.add_hidden_offers_request import AddHiddenOffersRequest  # noqa: E501
from ympa_python_flask_server.models.add_offers_to_archive_request import AddOffersToArchiveRequest  # noqa: E501
from ympa_python_flask_server.models.add_offers_to_archive_response import AddOffersToArchiveResponse  # noqa: E501
from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.calculate_tariffs_request import CalculateTariffsRequest  # noqa: E501
from ympa_python_flask_server.models.calculate_tariffs_response import CalculateTariffsResponse  # noqa: E501
from ympa_python_flask_server.models.confirm_prices_request import ConfirmPricesRequest  # noqa: E501
from ympa_python_flask_server.models.create_chat_request import CreateChatRequest  # noqa: E501
from ympa_python_flask_server.models.create_chat_response import CreateChatResponse  # noqa: E501
from ympa_python_flask_server.models.currency_type import CurrencyType  # noqa: E501
from ympa_python_flask_server.models.delete_campaign_offers_request import DeleteCampaignOffersRequest  # noqa: E501
from ympa_python_flask_server.models.delete_campaign_offers_response import DeleteCampaignOffersResponse  # noqa: E501
from ympa_python_flask_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest  # noqa: E501
from ympa_python_flask_server.models.delete_hidden_offers_request import DeleteHiddenOffersRequest  # noqa: E501
from ympa_python_flask_server.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest  # noqa: E501
from ympa_python_flask_server.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse  # noqa: E501
from ympa_python_flask_server.models.delete_offers_request import DeleteOffersRequest  # noqa: E501
from ympa_python_flask_server.models.delete_offers_response import DeleteOffersResponse  # noqa: E501
from ympa_python_flask_server.models.delete_promo_offers_request import DeletePromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.delete_promo_offers_response import DeletePromoOffersResponse  # noqa: E501
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.feed_index_logs_status_type import FeedIndexLogsStatusType  # noqa: E501
from ympa_python_flask_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest  # noqa: E501
from ympa_python_flask_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest  # noqa: E501
from ympa_python_flask_server.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest  # noqa: E501
from ympa_python_flask_server.models.generate_prices_report_request import GeneratePricesReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_report_response import GenerateReportResponse  # noqa: E501
from ympa_python_flask_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest  # noqa: E501
from ympa_python_flask_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest  # noqa: E501
from ympa_python_flask_server.models.get_all_offers_response import GetAllOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_bids_info_request import GetBidsInfoRequest  # noqa: E501
from ympa_python_flask_server.models.get_bids_info_response import GetBidsInfoResponse  # noqa: E501
from ympa_python_flask_server.models.get_bids_recommendations_request import GetBidsRecommendationsRequest  # noqa: E501
from ympa_python_flask_server.models.get_bids_recommendations_response import GetBidsRecommendationsResponse  # noqa: E501
from ympa_python_flask_server.models.get_business_buyer_info_response import GetBusinessBuyerInfoResponse  # noqa: E501
from ympa_python_flask_server.models.get_business_documents_info_response import GetBusinessDocumentsInfoResponse  # noqa: E501
from ympa_python_flask_server.models.get_business_settings_response import GetBusinessSettingsResponse  # noqa: E501
from ympa_python_flask_server.models.get_campaign_logins_response import GetCampaignLoginsResponse  # noqa: E501
from ympa_python_flask_server.models.get_campaign_offers_request import GetCampaignOffersRequest  # noqa: E501
from ympa_python_flask_server.models.get_campaign_offers_response import GetCampaignOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_campaign_region_response import GetCampaignRegionResponse  # noqa: E501
from ympa_python_flask_server.models.get_campaign_response import GetCampaignResponse  # noqa: E501
from ympa_python_flask_server.models.get_campaign_settings_response import GetCampaignSettingsResponse  # noqa: E501
from ympa_python_flask_server.models.get_campaigns_response import GetCampaignsResponse  # noqa: E501
from ympa_python_flask_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest  # noqa: E501
from ympa_python_flask_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse  # noqa: E501
from ympa_python_flask_server.models.get_categories_request import GetCategoriesRequest  # noqa: E501
from ympa_python_flask_server.models.get_categories_response import GetCategoriesResponse  # noqa: E501
from ympa_python_flask_server.models.get_category_content_parameters_response import GetCategoryContentParametersResponse  # noqa: E501
from ympa_python_flask_server.models.get_chat_history_request import GetChatHistoryRequest  # noqa: E501
from ympa_python_flask_server.models.get_chat_history_response import GetChatHistoryResponse  # noqa: E501
from ympa_python_flask_server.models.get_chats_request import GetChatsRequest  # noqa: E501
from ympa_python_flask_server.models.get_chats_response import GetChatsResponse  # noqa: E501
from ympa_python_flask_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse  # noqa: E501
from ympa_python_flask_server.models.get_feed_response import GetFeedResponse  # noqa: E501
from ympa_python_flask_server.models.get_feedback_list_response import GetFeedbackListResponse  # noqa: E501
from ympa_python_flask_server.models.get_feeds_response import GetFeedsResponse  # noqa: E501
from ympa_python_flask_server.models.get_fulfillment_warehouses_response import GetFulfillmentWarehousesResponse  # noqa: E501
from ympa_python_flask_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest  # noqa: E501
from ympa_python_flask_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse  # noqa: E501
from ympa_python_flask_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest  # noqa: E501
from ympa_python_flask_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse  # noqa: E501
from ympa_python_flask_server.models.get_goods_stats_request import GetGoodsStatsRequest  # noqa: E501
from ympa_python_flask_server.models.get_goods_stats_response import GetGoodsStatsResponse  # noqa: E501
from ympa_python_flask_server.models.get_hidden_offers_response import GetHiddenOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest  # noqa: E501
from ympa_python_flask_server.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse  # noqa: E501
from ympa_python_flask_server.models.get_offer_mapping_entries_response import GetOfferMappingEntriesResponse  # noqa: E501
from ympa_python_flask_server.models.get_offer_mappings_request import GetOfferMappingsRequest  # noqa: E501
from ympa_python_flask_server.models.get_offer_mappings_response import GetOfferMappingsResponse  # noqa: E501
from ympa_python_flask_server.models.get_offer_recommendations_request import GetOfferRecommendationsRequest  # noqa: E501
from ympa_python_flask_server.models.get_offer_recommendations_response import GetOfferRecommendationsResponse  # noqa: E501
from ympa_python_flask_server.models.get_offers_response import GetOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_order_response import GetOrderResponse  # noqa: E501
from ympa_python_flask_server.models.get_orders_response import GetOrdersResponse  # noqa: E501
from ympa_python_flask_server.models.get_orders_stats_request import GetOrdersStatsRequest  # noqa: E501
from ympa_python_flask_server.models.get_orders_stats_response import GetOrdersStatsResponse  # noqa: E501
from ympa_python_flask_server.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest  # noqa: E501
from ympa_python_flask_server.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse  # noqa: E501
from ympa_python_flask_server.models.get_prices_response import GetPricesResponse  # noqa: E501
from ympa_python_flask_server.models.get_promo_offers_request import GetPromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.get_promo_offers_response import GetPromoOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_promos_request import GetPromosRequest  # noqa: E501
from ympa_python_flask_server.models.get_promos_response import GetPromosResponse  # noqa: E501
from ympa_python_flask_server.models.get_quality_rating_request import GetQualityRatingRequest  # noqa: E501
from ympa_python_flask_server.models.get_quality_rating_response import GetQualityRatingResponse  # noqa: E501
from ympa_python_flask_server.models.get_quarantine_offers_request import GetQuarantineOffersRequest  # noqa: E501
from ympa_python_flask_server.models.get_quarantine_offers_response import GetQuarantineOffersResponse  # noqa: E501
from ympa_python_flask_server.models.get_region_with_children_response import GetRegionWithChildrenResponse  # noqa: E501
from ympa_python_flask_server.models.get_regions_response import GetRegionsResponse  # noqa: E501
from ympa_python_flask_server.models.get_report_info_response import GetReportInfoResponse  # noqa: E501
from ympa_python_flask_server.models.get_return_response import GetReturnResponse  # noqa: E501
from ympa_python_flask_server.models.get_returns_response import GetReturnsResponse  # noqa: E501
from ympa_python_flask_server.models.get_suggested_offer_mapping_entries_request import GetSuggestedOfferMappingEntriesRequest  # noqa: E501
from ympa_python_flask_server.models.get_suggested_offer_mapping_entries_response import GetSuggestedOfferMappingEntriesResponse  # noqa: E501
from ympa_python_flask_server.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest  # noqa: E501
from ympa_python_flask_server.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse  # noqa: E501
from ympa_python_flask_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest  # noqa: E501
from ympa_python_flask_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse  # noqa: E501
from ympa_python_flask_server.models.offer_availability_status_type import OfferAvailabilityStatusType  # noqa: E501
from ympa_python_flask_server.models.offer_mapping_kind_type import OfferMappingKindType  # noqa: E501
from ympa_python_flask_server.models.offer_processing_status_type import OfferProcessingStatusType  # noqa: E501
from ympa_python_flask_server.models.order_buyer_type import OrderBuyerType  # noqa: E501
from ympa_python_flask_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType  # noqa: E501
from ympa_python_flask_server.models.order_status_type import OrderStatusType  # noqa: E501
from ympa_python_flask_server.models.order_substatus_type import OrderSubstatusType  # noqa: E501
from ympa_python_flask_server.models.put_sku_bids_request import PutSkuBidsRequest  # noqa: E501
from ympa_python_flask_server.models.refund_status_type import RefundStatusType  # noqa: E501
from ympa_python_flask_server.models.report_format_type import ReportFormatType  # noqa: E501
from ympa_python_flask_server.models.return_type import ReturnType  # noqa: E501
from ympa_python_flask_server.models.send_message_to_chat_request import SendMessageToChatRequest  # noqa: E501
from ympa_python_flask_server.models.set_feed_params_request import SetFeedParamsRequest  # noqa: E501
from ympa_python_flask_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest  # noqa: E501
from ympa_python_flask_server.models.suggest_prices_request import SuggestPricesRequest  # noqa: E501
from ympa_python_flask_server.models.suggest_prices_response import SuggestPricesResponse  # noqa: E501
from ympa_python_flask_server.models.update_business_prices_request import UpdateBusinessPricesRequest  # noqa: E501
from ympa_python_flask_server.models.update_campaign_offers_request import UpdateCampaignOffersRequest  # noqa: E501
from ympa_python_flask_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest  # noqa: E501
from ympa_python_flask_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse  # noqa: E501
from ympa_python_flask_server.models.update_offer_content_request import UpdateOfferContentRequest  # noqa: E501
from ympa_python_flask_server.models.update_offer_content_response import UpdateOfferContentResponse  # noqa: E501
from ympa_python_flask_server.models.update_offer_mapping_entry_request import UpdateOfferMappingEntryRequest  # noqa: E501
from ympa_python_flask_server.models.update_offer_mappings_request import UpdateOfferMappingsRequest  # noqa: E501
from ympa_python_flask_server.models.update_offer_mappings_response import UpdateOfferMappingsResponse  # noqa: E501
from ympa_python_flask_server.models.update_prices_request import UpdatePricesRequest  # noqa: E501
from ympa_python_flask_server.models.update_promo_offers_request import UpdatePromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.update_promo_offers_response import UpdatePromoOffersResponse  # noqa: E501
from ympa_python_flask_server import util


def add_hidden_offers(campaign_id, add_hidden_offers_request):  # noqa: E501
    """Скрытие товаров и настройки скрытия

    Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param add_hidden_offers_request: Запрос на скрытие оферов.
    :type add_hidden_offers_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_hidden_offers_request = AddHiddenOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_offers_to_archive(business_id, add_offers_to_archive_request):  # noqa: E501
    """Добавление товаров в архив

    Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param add_offers_to_archive_request: 
    :type add_offers_to_archive_request: dict | bytes

    :rtype: Union[AddOffersToArchiveResponse, Tuple[AddOffersToArchiveResponse, int], Tuple[AddOffersToArchiveResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_offers_to_archive_request = AddOffersToArchiveRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def calculate_tariffs(calculate_tariffs_request):  # noqa: E501
    """Калькулятор стоимости услуг

    Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-|  # noqa: E501

    :param calculate_tariffs_request: 
    :type calculate_tariffs_request: dict | bytes

    :rtype: Union[CalculateTariffsResponse, Tuple[CalculateTariffsResponse, int], Tuple[CalculateTariffsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        calculate_tariffs_request = CalculateTariffsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def confirm_business_prices(business_id, confirm_prices_request):  # noqa: E501
    """Удаление товара из карантина по цене в кабинете

    Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param confirm_prices_request: 
    :type confirm_prices_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        confirm_prices_request = ConfirmPricesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def confirm_campaign_prices(campaign_id, confirm_prices_request):  # noqa: E501
    """Удаление товара из карантина по цене в магазине

    Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param confirm_prices_request: 
    :type confirm_prices_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        confirm_prices_request = ConfirmPricesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_chat(business_id, create_chat_request):  # noqa: E501
    """Создание нового чата с покупателем

    Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param create_chat_request: description
    :type create_chat_request: dict | bytes

    :rtype: Union[CreateChatResponse, Tuple[CreateChatResponse, int], Tuple[CreateChatResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_chat_request = CreateChatRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_campaign_offers(campaign_id, delete_campaign_offers_request):  # noqa: E501
    """Удаление товаров из ассортимента магазина

    Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param delete_campaign_offers_request: 
    :type delete_campaign_offers_request: dict | bytes

    :rtype: Union[DeleteCampaignOffersResponse, Tuple[DeleteCampaignOffersResponse, int], Tuple[DeleteCampaignOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_campaign_offers_request = DeleteCampaignOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request):  # noqa: E501
    """Удаление комментария к отзыву

    Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param delete_goods_feedback_comment_request: 
    :type delete_goods_feedback_comment_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_goods_feedback_comment_request = DeleteGoodsFeedbackCommentRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_hidden_offers(campaign_id, delete_hidden_offers_request):  # noqa: E501
    """Возобновление показа товаров

    Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param delete_hidden_offers_request: Запрос на возобновление показа оферов.
    :type delete_hidden_offers_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_hidden_offers_request = DeleteHiddenOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_offers(business_id, delete_offers_request):  # noqa: E501
    """Удаление товаров из каталога

    Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param delete_offers_request: 
    :type delete_offers_request: dict | bytes

    :rtype: Union[DeleteOffersResponse, Tuple[DeleteOffersResponse, int], Tuple[DeleteOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_offers_request = DeleteOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_offers_from_archive(business_id, delete_offers_from_archive_request):  # noqa: E501
    """Удаление товаров из архива

    Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param delete_offers_from_archive_request: 
    :type delete_offers_from_archive_request: dict | bytes

    :rtype: Union[DeleteOffersFromArchiveResponse, Tuple[DeleteOffersFromArchiveResponse, int], Tuple[DeleteOffersFromArchiveResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_offers_from_archive_request = DeleteOffersFromArchiveRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_promo_offers(business_id, delete_promo_offers_request):  # noqa: E501
    """Удаление товаров из акции

    Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param delete_promo_offers_request: 
    :type delete_promo_offers_request: dict | bytes

    :rtype: Union[DeletePromoOffersResponse, Tuple[DeletePromoOffersResponse, int], Tuple[DeletePromoOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        delete_promo_offers_request = DeletePromoOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_boost_consolidated_report(generate_boost_consolidated_request, format=None):  # noqa: E501
    """Отчет по бусту продаж

    Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_boost_consolidated_request: 
    :type generate_boost_consolidated_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_boost_consolidated_request = GenerateBoostConsolidatedRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_competitors_position_report(generate_competitors_position_report_request, format=None):  # noqa: E501
    """Отчет «Конкурентная позиция»

    Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-|  # noqa: E501

    :param generate_competitors_position_report_request: 
    :type generate_competitors_position_report_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_competitors_position_report_request = GenerateCompetitorsPositionReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_goods_feedback_report(generate_goods_feedback_request, format=None):  # noqa: E501
    """Отчет по отзывам о товарах

    Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_goods_feedback_request: 
    :type generate_goods_feedback_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_goods_feedback_request = GenerateGoodsFeedbackRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_goods_movement_report(generate_goods_movement_report_request, format=None):  # noqa: E501
    """Отчет по движению товаров

    Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_goods_movement_report_request: 
    :type generate_goods_movement_report_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_goods_movement_report_request = GenerateGoodsMovementReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_goods_realization_report(generate_goods_realization_report_request, format=None):  # noqa: E501
    """Отчет по реализации

    Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_goods_realization_report_request: 
    :type generate_goods_realization_report_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_goods_realization_report_request = GenerateGoodsRealizationReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_goods_turnover_report(generate_goods_turnover_request, format=None):  # noqa: E501
    """Отчет по оборачиваемости

    Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_goods_turnover_request: 
    :type generate_goods_turnover_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_goods_turnover_request = GenerateGoodsTurnoverRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_prices_report(generate_prices_report_request, format=None):  # noqa: E501
    """Отчет «Цены на рынке»

    Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_prices_report_request: 
    :type generate_prices_report_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_prices_report_request = GeneratePricesReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_shelfs_statistics_report(generate_shelfs_statistics_request, format=None):  # noqa: E501
    """Отчет по полкам

    Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_shelfs_statistics_request: 
    :type generate_shelfs_statistics_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_shelfs_statistics_request = GenerateShelfsStatisticsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_shows_sales_report(generate_shows_sales_report_request, format=None):  # noqa: E501
    """Отчет «Аналитика продаж»

    Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-|  # noqa: E501

    :param generate_shows_sales_report_request: 
    :type generate_shows_sales_report_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_shows_sales_report_request = GenerateShowsSalesReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, format=None):  # noqa: E501
    """Отчет по остаткам на складах

    Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_stocks_on_warehouses_report_request: 
    :type generate_stocks_on_warehouses_report_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_stocks_on_warehouses_report_request = GenerateStocksOnWarehousesReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, format=None):  # noqa: E501
    """Отчет по стоимости услуг

    Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_united_marketplace_services_report_request: 
    :type generate_united_marketplace_services_report_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_united_marketplace_services_report_request = GenerateUnitedMarketplaceServicesReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_united_netting_report(generate_united_netting_report_request, format=None):  # noqa: E501
    """Отчет по платежам

    Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_united_netting_report_request: 
    :type generate_united_netting_report_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_united_netting_report_request = GenerateUnitedNettingReportRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def generate_united_orders_report(generate_united_orders_request, format=None):  # noqa: E501
    """Отчет по заказам

    Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param generate_united_orders_request: 
    :type generate_united_orders_request: dict | bytes
    :param format: Формат отчета.
    :type format: dict | bytes

    :rtype: Union[GenerateReportResponse, Tuple[GenerateReportResponse, int], Tuple[GenerateReportResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        generate_united_orders_request = GenerateUnitedOrdersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ReportFormatType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_all_offers(campaign_id, feed_id=None, chunk=None):  # noqa: E501
    """Все предложения магазина

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25)  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param feed_id: Идентификатор прайс-листа.
    :type feed_id: int
    :param chunk: Номер сегмента с результатами.  Значение по умолчанию: &#x60;0&#x60;.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#x60;chunk&#x3D;0&#x60; и т. д.  {% endnote %} 
    :type chunk: int

    :rtype: Union[GetAllOffersResponse, Tuple[GetAllOffersResponse, int], Tuple[GetAllOffersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_bids_info_for_business(business_id, page_token=None, limit=None, get_bids_info_request=None):  # noqa: E501
    """Информация об установленных ставках

    Возвращает значения ставок для заданных товаров.  {% note warning \&quot;\&quot; %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_bids_info_request: description
    :type get_bids_info_request: dict | bytes

    :rtype: Union[GetBidsInfoResponse, Tuple[GetBidsInfoResponse, int], Tuple[GetBidsInfoResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_bids_info_request = GetBidsInfoRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_bids_recommendations(business_id, get_bids_recommendations_request):  # noqa: E501
    """Рекомендованные ставки для заданных товаров

    Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_bids_recommendations_request: description.
    :type get_bids_recommendations_request: dict | bytes

    :rtype: Union[GetBidsRecommendationsResponse, Tuple[GetBidsRecommendationsResponse, int], Tuple[GetBidsRecommendationsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_bids_recommendations_request = GetBidsRecommendationsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_business_quarantine_offers(business_id, get_quarantine_offers_request, page_token=None, limit=None):  # noqa: E501
    """Список товаров, находящихся в карантине по цене в кабинете

    Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_quarantine_offers_request: 
    :type get_quarantine_offers_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetQuarantineOffersResponse, Tuple[GetQuarantineOffersResponse, int], Tuple[GetQuarantineOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_quarantine_offers_request = GetQuarantineOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_business_settings(business_id):  # noqa: E501
    """Настройки кабинета

    Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int

    :rtype: Union[GetBusinessSettingsResponse, Tuple[GetBusinessSettingsResponse, int], Tuple[GetBusinessSettingsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaign(campaign_id):  # noqa: E501
    """Информация о магазине

    Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int

    :rtype: Union[GetCampaignResponse, Tuple[GetCampaignResponse, int], Tuple[GetCampaignResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaign_logins(campaign_id):  # noqa: E501
    """Логины, связанные с магазином

    Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int

    :rtype: Union[GetCampaignLoginsResponse, Tuple[GetCampaignLoginsResponse, int], Tuple[GetCampaignLoginsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaign_offers(campaign_id, get_campaign_offers_request, page_token=None, limit=None):  # noqa: E501
    """Информация о товарах, которые размещены в заданном магазине

    Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param get_campaign_offers_request: 
    :type get_campaign_offers_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetCampaignOffersResponse, Tuple[GetCampaignOffersResponse, int], Tuple[GetCampaignOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_campaign_offers_request = GetCampaignOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_campaign_quarantine_offers(campaign_id, get_quarantine_offers_request, page_token=None, limit=None):  # noqa: E501
    """Список товаров, находящихся в карантине по цене в магазине

    Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param get_quarantine_offers_request: 
    :type get_quarantine_offers_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetQuarantineOffersResponse, Tuple[GetQuarantineOffersResponse, int], Tuple[GetQuarantineOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_quarantine_offers_request = GetQuarantineOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_campaign_region(campaign_id):  # noqa: E501
    """Регион магазина

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int

    :rtype: Union[GetCampaignRegionResponse, Tuple[GetCampaignRegionResponse, int], Tuple[GetCampaignRegionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaign_settings(campaign_id):  # noqa: E501
    """Настройки магазина

    Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int

    :rtype: Union[GetCampaignSettingsResponse, Tuple[GetCampaignSettingsResponse, int], Tuple[GetCampaignSettingsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaigns(page=None, page_size=None):  # noqa: E501
    """Список магазинов пользователя

    Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param page: Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page: int
    :param page_size: Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page_size: int

    :rtype: Union[GetCampaignsResponse, Tuple[GetCampaignsResponse, int], Tuple[GetCampaignsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_campaigns_by_login(login, page=None, page_size=None):  # noqa: E501
    """Магазины, доступные логину

    Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param login: Логин пользователя.
    :type login: str
    :param page: Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page: int
    :param page_size: Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page_size: int

    :rtype: Union[GetCampaignsResponse, Tuple[GetCampaignsResponse, int], Tuple[GetCampaignsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_categories_max_sale_quantum(get_categories_max_sale_quantum_request):  # noqa: E501
    """Лимит на установку кванта продажи и минимального количества товаров в заказе

    Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param get_categories_max_sale_quantum_request: 
    :type get_categories_max_sale_quantum_request: dict | bytes

    :rtype: Union[GetCategoriesMaxSaleQuantumResponse, Tuple[GetCategoriesMaxSaleQuantumResponse, int], Tuple[GetCategoriesMaxSaleQuantumResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_categories_max_sale_quantum_request = GetCategoriesMaxSaleQuantumRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_categories_tree(get_categories_request=None):  # noqa: E501
    """Дерево категорий

    Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param get_categories_request: 
    :type get_categories_request: dict | bytes

    :rtype: Union[GetCategoriesResponse, Tuple[GetCategoriesResponse, int], Tuple[GetCategoriesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_categories_request = GetCategoriesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_category_content_parameters(category_id):  # noqa: E501
    """Списки характеристик товаров по категориям

    Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-|  # noqa: E501

    :param category_id: Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    :type category_id: int

    :rtype: Union[GetCategoryContentParametersResponse, Tuple[GetCategoryContentParametersResponse, int], Tuple[GetCategoryContentParametersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_chat_history(business_id, chat_id, get_chat_history_request, page_token=None, limit=None):  # noqa: E501
    """Получение истории сообщений в чате

    Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param get_chat_history_request: description
    :type get_chat_history_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetChatHistoryResponse, Tuple[GetChatHistoryResponse, int], Tuple[GetChatHistoryResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_chat_history_request = GetChatHistoryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_chats(business_id, get_chats_request, page_token=None, limit=None):  # noqa: E501
    """Получение доступных чатов

    Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_chats_request: description
    :type get_chats_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetChatsResponse, Tuple[GetChatsResponse, int], Tuple[GetChatsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_chats_request = GetChatsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_feed(campaign_id, feed_id):  # noqa: E501
    """Информация о прайс-листе

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param feed_id: Идентификатор прайс-листа.
    :type feed_id: int

    :rtype: Union[GetFeedResponse, Tuple[GetFeedResponse, int], Tuple[GetFeedResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_feed_index_logs(campaign_id, feed_id, limit=None, published_time_from=None, published_time_to=None, status=None):  # noqa: E501
    """Отчет по индексации прайс-листа

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param feed_id: Идентификатор прайс-листа.
    :type feed_id: int
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param published_time_from: Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса. 
    :type published_time_from: str
    :param published_time_to: Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %} 
    :type published_time_to: str
    :param status: Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. 
    :type status: dict | bytes

    :rtype: Union[GetFeedIndexLogsResponse, Tuple[GetFeedIndexLogsResponse, int], Tuple[GetFeedIndexLogsResponse, int, Dict[str, str]]
    """
    published_time_from = util.deserialize_datetime(published_time_from)
    published_time_to = util.deserialize_datetime(published_time_to)
    if connexion.request.is_json:
        status =  FeedIndexLogsStatusType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_feedback_and_comment_updates(campaign_id, page_token=None, limit=None, from_date=None):  # noqa: E501
    """Новые и обновленные отзывы о магазине

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param from_date: Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
    :type from_date: str

    :rtype: Union[GetFeedbackListResponse, Tuple[GetFeedbackListResponse, int], Tuple[GetFeedbackListResponse, int, Dict[str, str]]
    """
    from_date = util.deserialize_date(from_date)
    return 'do some magic!'


def get_feeds(campaign_id):  # noqa: E501
    """Список прайс-листов магазина

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int

    :rtype: Union[GetFeedsResponse, Tuple[GetFeedsResponse, int], Tuple[GetFeedsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_fulfillment_warehouses():  # noqa: E501
    """Идентификаторы складов Маркета (FBY)

    Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-|  # noqa: E501


    :rtype: Union[GetFulfillmentWarehousesResponse, Tuple[GetFulfillmentWarehousesResponse, int], Tuple[GetFulfillmentWarehousesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, page_token=None, limit=None):  # noqa: E501
    """Получение комментариев к отзыву

    Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_goods_feedback_comments_request: 
    :type get_goods_feedback_comments_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetGoodsFeedbackCommentsResponse, Tuple[GetGoodsFeedbackCommentsResponse, int], Tuple[GetGoodsFeedbackCommentsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_goods_feedback_comments_request = GetGoodsFeedbackCommentsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_goods_feedbacks(business_id, page_token=None, limit=None, get_goods_feedback_request=None):  # noqa: E501
    """Получение отзывов о товарах продавца

    Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_goods_feedback_request: 
    :type get_goods_feedback_request: dict | bytes

    :rtype: Union[GetGoodsFeedbackResponse, Tuple[GetGoodsFeedbackResponse, int], Tuple[GetGoodsFeedbackResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_goods_feedback_request = GetGoodsFeedbackRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_goods_stats(campaign_id, get_goods_stats_request):  # noqa: E501
    """Отчет по товарам

    Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param get_goods_stats_request: 
    :type get_goods_stats_request: dict | bytes

    :rtype: Union[GetGoodsStatsResponse, Tuple[GetGoodsStatsResponse, int], Tuple[GetGoodsStatsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_goods_stats_request = GetGoodsStatsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_hidden_offers(campaign_id, offer_id=None, page_token=None, limit=None, offset=None, page=None, page_size=None):  # noqa: E501
    """Информация о скрытых вами товарах

    Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param offer_id: Идентификатор скрытого предложения. 
    :type offer_id: List[str]
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param offset: Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;. 
    :type offset: int
    :param page: Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page: int
    :param page_size: Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page_size: int

    :rtype: Union[GetHiddenOffersResponse, Tuple[GetHiddenOffersResponse, int], Tuple[GetHiddenOffersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_offer_cards_content_status(business_id, page_token=None, limit=None, get_offer_cards_content_status_request=None):  # noqa: E501
    """Получение информации о заполненности карточек магазина

    Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_offer_cards_content_status_request: 
    :type get_offer_cards_content_status_request: dict | bytes

    :rtype: Union[GetOfferCardsContentStatusResponse, Tuple[GetOfferCardsContentStatusResponse, int], Tuple[GetOfferCardsContentStatusResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_offer_cards_content_status_request = GetOfferCardsContentStatusRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_offer_mapping_entries(campaign_id, offer_id=None, shop_sku=None, mapping_kind=None, status=None, availability=None, category_id=None, vendor=None, page_token=None, limit=None):  # noqa: E501
    """Список товаров в каталоге

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25)  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param offer_id: Идентификатор товара в каталоге.
    :type offer_id: List[str]
    :param shop_sku: Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. 
    :type shop_sku: List[str]
    :param mapping_kind: Тип маппинга.
    :type mapping_kind: dict | bytes
    :param status: Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. 
    :type status: list | bytes
    :param availability: Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. 
    :type availability: list | bytes
    :param category_id: Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. 
    :type category_id: List[int]
    :param vendor: Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. 
    :type vendor: List[str]
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetOfferMappingEntriesResponse, Tuple[GetOfferMappingEntriesResponse, int], Tuple[GetOfferMappingEntriesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        mapping_kind =  OfferMappingKindType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        status = [OfferProcessingStatusType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        availability = [OfferAvailabilityStatusType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_offer_mappings(business_id, page_token=None, limit=None, get_offer_mappings_request=None):  # noqa: E501
    """Информация о товарах в каталоге

    Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_offer_mappings_request: 
    :type get_offer_mappings_request: dict | bytes

    :rtype: Union[GetOfferMappingsResponse, Tuple[GetOfferMappingsResponse, int], Tuple[GetOfferMappingsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_offer_mappings_request = GetOfferMappingsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_offer_recommendations(business_id, get_offer_recommendations_request, page_token=None, limit=None):  # noqa: E501
    """Рекомендации Маркета, касающиеся цен

    Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_offer_recommendations_request: 
    :type get_offer_recommendations_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetOfferRecommendationsResponse, Tuple[GetOfferRecommendationsResponse, int], Tuple[GetOfferRecommendationsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_offer_recommendations_request = GetOfferRecommendationsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_offers(campaign_id, query=None, feed_id=None, shop_category_id=None, currency=None, matched=None, page=None, page_size=None):  # noqa: E501
    """Предложения магазина

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25)  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param query: Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете. 
    :type query: str
    :param feed_id: Идентификатор прайс-листа.
    :type feed_id: int
    :param shop_category_id: Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
    :type shop_category_id: str
    :param currency: Валюта, в которой указана цена предложения.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна. 
    :type currency: dict | bytes
    :param matched: Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * &#x60;0 / FALSE / NO&#x60; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * &#x60;1 / TRUE / YES&#x60; — поиск выполняется среди предложений, соотнесенных с карточками моделей). 
    :type matched: bool
    :param page: Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page: int
    :param page_size: Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page_size: int

    :rtype: Union[GetOffersResponse, Tuple[GetOffersResponse, int], Tuple[GetOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        currency =  CurrencyType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_order(campaign_id, order_id):  # noqa: E501
    """Информация об одном заказе

    Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int

    :rtype: Union[GetOrderResponse, Tuple[GetOrderResponse, int], Tuple[GetOrderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_order_business_buyer_info(campaign_id, order_id):  # noqa: E501
    """Информация о покупателе — юридическом лице

    Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int

    :rtype: Union[GetBusinessBuyerInfoResponse, Tuple[GetBusinessBuyerInfoResponse, int], Tuple[GetBusinessBuyerInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_order_business_documents_info(campaign_id, order_id):  # noqa: E501
    """Информация о документах

    Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int

    :rtype: Union[GetBusinessDocumentsInfoResponse, Tuple[GetBusinessDocumentsInfoResponse, int], Tuple[GetBusinessDocumentsInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_orders(campaign_id, order_ids=None, status=None, substatus=None, from_date=None, to_date=None, supplier_shipment_date_from=None, supplier_shipment_date_to=None, updated_at_from=None, updated_at_to=None, dispatch_type=None, fake=None, has_cis=None, only_waiting_for_cancellation_approve=None, only_estimated_delivery=None, buyer_type=None, page=None, page_size=None, page_token=None, limit=None):  # noqa: E501
    """Информация о нескольких заказах

    Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_ids: Фильтрация заказов по идентификаторам. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым. 
    :type order_ids: List[int]
    :param status: Статус заказа:  * &#x60;CANCELLED&#x60; — заказ отменен.  * &#x60;DELIVERED&#x60; — заказ получен покупателем.  * &#x60;DELIVERY&#x60; — заказ передан в службу доставки.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — заказ находится в обработке.  * &#x60;UNPAID&#x60; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
    :type status: list | bytes
    :param substatus: Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  Возможные значения для заказа в статусе &#x60;PROCESSING&#x60;:  * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать. * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке. * &#x60;SHIPPED&#x60; — заказ передан службе доставки.  Возможные значения для заказа в статусе &#x60;CANCELLED&#x60;:  * &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60; — служба доставки не смогла доставить заказ.  * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.  * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.  * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * &#x60;RESERVATION_FAILED&#x60; — Маркет не может продолжить дальнейшую обработку заказа.  * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.  * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.  * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.  * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.  * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.  * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.  * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * &#x60;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#x60; — покупатель хочет получить заказ в другой день. * &#x60;CANCELLED_COURIER_NOT_FOUND&#x60; — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
    :type substatus: list | bytes
    :param from_date: Начальная дата для фильтрации заказов по дате оформления.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;toDate&#x60;) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты. 
    :type from_date: str
    :param to_date: Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;fromDate&#x60;) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата. 
    :type to_date: str
    :param supplier_shipment_date_from: Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;supplierShipmentDateTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. 
    :type supplier_shipment_date_from: str
    :param supplier_shipment_date_to: Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;supplierShipmentDateFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. 
    :type supplier_shipment_date_to: str
    :param updated_at_from: Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной и конечной датой (параметр &#x60;updatedAtTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. 
    :type updated_at_from: str
    :param updated_at_to: Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной (параметр &#x60;updatedAtFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. 
    :type updated_at_to: str
    :param dispatch_type: Способ отгрузки
    :type dispatch_type: dict | bytes
    :param fake: Фильтрация заказов по типам:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
    :type fake: bool
    :param has_cis: Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да.  * &#x60;false&#x60; — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
    :type has_cis: bool
    :param only_waiting_for_cancellation_approve: **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение &#x60;true&#x60; возвращаются только заказы, которые находятся в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60; и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation). 
    :type only_waiting_for_cancellation_approve: bool
    :param only_estimated_delivery: Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * &#x60;true&#x60; — возвращаются только заказы с неподтвержденной датой доставки. * &#x60;false&#x60; — фильтрация не применяется. 
    :type only_estimated_delivery: bool
    :param buyer_type: Фильтрация заказов по типу покупателя. 
    :type buyer_type: dict | bytes
    :param page: Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page: int
    :param page_size: Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page_size: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetOrdersResponse, Tuple[GetOrdersResponse, int], Tuple[GetOrdersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        status = [OrderStatusType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        substatus = [OrderSubstatusType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    from_date = util.deserialize_date(from_date)
    to_date = util.deserialize_date(to_date)
    supplier_shipment_date_from = util.deserialize_date(supplier_shipment_date_from)
    supplier_shipment_date_to = util.deserialize_date(supplier_shipment_date_to)
    updated_at_from = util.deserialize_datetime(updated_at_from)
    updated_at_to = util.deserialize_datetime(updated_at_to)
    if connexion.request.is_json:
        dispatch_type =  OrderDeliveryDispatchType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        buyer_type =  OrderBuyerType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_orders_stats(campaign_id, page_token=None, limit=None, get_orders_stats_request=None):  # noqa: E501
    """Детальная информация по заказам

    Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_orders_stats_request: 
    :type get_orders_stats_request: dict | bytes

    :rtype: Union[GetOrdersStatsResponse, Tuple[GetOrdersStatsResponse, int], Tuple[GetOrdersStatsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_orders_stats_request = GetOrdersStatsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_prices(campaign_id, page_token=None, limit=None, archived=None):  # noqa: E501
    """Список цен

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param archived: Фильтр по нахождению в архиве.
    :type archived: bool

    :rtype: Union[GetPricesResponse, Tuple[GetPricesResponse, int], Tuple[GetPricesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_prices_by_offer_ids(campaign_id, page_token=None, limit=None, get_prices_by_offer_ids_request=None):  # noqa: E501
    """Просмотр цен на указанные товары в магазине

    Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25)  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_prices_by_offer_ids_request: 
    :type get_prices_by_offer_ids_request: dict | bytes

    :rtype: Union[GetPricesByOfferIdsResponse, Tuple[GetPricesByOfferIdsResponse, int], Tuple[GetPricesByOfferIdsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_prices_by_offer_ids_request = GetPricesByOfferIdsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_promo_offers(business_id, get_promo_offers_request, page_token=None, limit=None):  # noqa: E501
    """Получение списка товаров, которые участвуют или могут участвовать в акции

    Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_promo_offers_request: 
    :type get_promo_offers_request: dict | bytes
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetPromoOffersResponse, Tuple[GetPromoOffersResponse, int], Tuple[GetPromoOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_promo_offers_request = GetPromoOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_promos(business_id, get_promos_request=None):  # noqa: E501
    """Получение списка акций

    Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_promos_request: 
    :type get_promos_request: dict | bytes

    :rtype: Union[GetPromosResponse, Tuple[GetPromosResponse, int], Tuple[GetPromosResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_promos_request = GetPromosRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_quality_ratings(business_id, get_quality_rating_request):  # noqa: E501
    """Индекс качества магазинов

    Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_quality_rating_request: 
    :type get_quality_rating_request: dict | bytes

    :rtype: Union[GetQualityRatingResponse, Tuple[GetQualityRatingResponse, int], Tuple[GetQualityRatingResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_quality_rating_request = GetQualityRatingRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_report_info(report_id):  # noqa: E501
    """Получение заданного отчета

    Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-|  # noqa: E501

    :param report_id: Идентификатор отчета, который вы получили после запуска генерации. 
    :type report_id: str

    :rtype: Union[GetReportInfoResponse, Tuple[GetReportInfoResponse, int], Tuple[GetReportInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_return(campaign_id, order_id, return_id):  # noqa: E501
    """Информация о невыкупе или возврате

    Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param return_id: Идентификатор возврата.
    :type return_id: int

    :rtype: Union[GetReturnResponse, Tuple[GetReturnResponse, int], Tuple[GetReturnResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_return_photo(campaign_id, order_id, return_id, item_id, image_hash):  # noqa: E501
    """Получение фотографии возврата

    Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param order_id: Идентификатор заказа.
    :type order_id: int
    :param return_id: Идентификатор возврата.
    :type return_id: int
    :param item_id: Идентификатор товара в возврате.
    :type item_id: int
    :param image_hash: Хеш ссылки изображения для загрузки.
    :type image_hash: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_returns(campaign_id, page_token=None, limit=None, order_ids=None, statuses=None, type=None, from_date=None, to_date=None, from_date2=None, to_date2=None):  # noqa: E501
    """Список невыкупов и возвратов

    Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param order_ids: Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
    :type order_ids: List[int]
    :param statuses: Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
    :type statuses: list | bytes
    :param type: Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
    :type type: dict | bytes
    :param from_date: Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. 
    :type from_date: str
    :param to_date: Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. 
    :type to_date: str
    :param from_date2: {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
    :type from_date2: str
    :param to_date2: {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
    :type to_date2: str

    :rtype: Union[GetReturnsResponse, Tuple[GetReturnsResponse, int], Tuple[GetReturnsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        statuses = [RefundStatusType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        type =  ReturnType.from_dict(connexion.request.get_json())  # noqa: E501
    from_date = util.deserialize_date(from_date)
    to_date = util.deserialize_date(to_date)
    from_date2 = util.deserialize_date(from_date2)
    to_date2 = util.deserialize_date(to_date2)
    return 'do some magic!'


def get_stocks(campaign_id, page_token=None, limit=None, get_warehouse_stocks_request=None):  # noqa: E501
    """Информация об остатках и оборачиваемости

    Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.)  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_warehouse_stocks_request: 
    :type get_warehouse_stocks_request: dict | bytes

    :rtype: Union[GetWarehouseStocksResponse, Tuple[GetWarehouseStocksResponse, int], Tuple[GetWarehouseStocksResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_warehouse_stocks_request = GetWarehouseStocksRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_suggested_offer_mapping_entries(campaign_id, get_suggested_offer_mapping_entries_request):  # noqa: E501
    """Рекомендованные карточки для товаров

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param get_suggested_offer_mapping_entries_request: 
    :type get_suggested_offer_mapping_entries_request: dict | bytes

    :rtype: Union[GetSuggestedOfferMappingEntriesResponse, Tuple[GetSuggestedOfferMappingEntriesResponse, int], Tuple[GetSuggestedOfferMappingEntriesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_suggested_offer_mapping_entries_request = GetSuggestedOfferMappingEntriesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_suggested_offer_mappings(business_id, get_suggested_offer_mappings_request=None):  # noqa: E501
    """Просмотр карточек на Маркете, которые подходят вашим товарам

    Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_suggested_offer_mappings_request: 
    :type get_suggested_offer_mappings_request: dict | bytes

    :rtype: Union[GetSuggestedOfferMappingsResponse, Tuple[GetSuggestedOfferMappingsResponse, int], Tuple[GetSuggestedOfferMappingsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_suggested_offer_mappings_request = GetSuggestedOfferMappingsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_suggested_prices(campaign_id, suggest_prices_request):  # noqa: E501
    """Цены для продвижения товаров

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param suggest_prices_request: 
    :type suggest_prices_request: dict | bytes

    :rtype: Union[SuggestPricesResponse, Tuple[SuggestPricesResponse, int], Tuple[SuggestPricesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        suggest_prices_request = SuggestPricesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_bids_for_business(business_id, put_sku_bids_request):  # noqa: E501
    """Включение буста продаж и установка ставок

    Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \&quot;Как в кабинете выглядит кампания, созданная через API\&quot; %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param put_sku_bids_request: description
    :type put_sku_bids_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_sku_bids_request = PutSkuBidsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_bids_for_campaign(campaign_id, put_sku_bids_request):  # noqa: E501
    """Включение буста продаж и установка ставок для магазина

    Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param put_sku_bids_request: description
    :type put_sku_bids_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_sku_bids_request = PutSkuBidsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def refresh_feed(campaign_id, feed_id):  # noqa: E501
    """Сообщить, что прайс-лист обновился

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param feed_id: Идентификатор прайс-листа.
    :type feed_id: int

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_region_children(region_id, page=None, page_size=None):  # noqa: E501
    """Информация о дочерних регионах

    Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-|  # noqa: E501

    :param region_id: Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
    :type region_id: int
    :param page: Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page: int
    :param page_size: Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. 
    :type page_size: int

    :rtype: Union[GetRegionWithChildrenResponse, Tuple[GetRegionWithChildrenResponse, int], Tuple[GetRegionWithChildrenResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_regions_by_id(region_id):  # noqa: E501
    """Информация о регионе

    Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-|  # noqa: E501

    :param region_id: Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
    :type region_id: int

    :rtype: Union[GetRegionsResponse, Tuple[GetRegionsResponse, int], Tuple[GetRegionsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_regions_by_name(name, page_token=None, limit=None):  # noqa: E501
    """Поиск регионов по их имени

    Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-|  # noqa: E501

    :param name: Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;. 
    :type name: str
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int

    :rtype: Union[GetRegionsResponse, Tuple[GetRegionsResponse, int], Tuple[GetRegionsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_file_to_chat(business_id, chat_id, file):  # noqa: E501
    """Отправка файла в чат

    Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param file: Содержимое файла. Максимальный размер файла — 5 Мбайт.
    :type file: str

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_message_to_chat(business_id, chat_id, send_message_to_chat_request):  # noqa: E501
    """Отправка сообщения в чат

    Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param chat_id: Идентификатор чата.
    :type chat_id: int
    :param send_message_to_chat_request: description
    :type send_message_to_chat_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        send_message_to_chat_request = SendMessageToChatRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_feed_params(campaign_id, feed_id, set_feed_params_request):  # noqa: E501
    """Изменение параметров прайс-листа

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param feed_id: Идентификатор прайс-листа.
    :type feed_id: int
    :param set_feed_params_request: 
    :type set_feed_params_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_feed_params_request = SetFeedParamsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request):  # noqa: E501
    """Отказ от ответа на отзывы

    Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param skip_goods_feedback_reaction_request: 
    :type skip_goods_feedback_reaction_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        skip_goods_feedback_reaction_request = SkipGoodsFeedbackReactionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_business_prices(business_id, update_business_prices_request):  # noqa: E501
    """Установка цен на товары во всех магазинах

    Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param update_business_prices_request: 
    :type update_business_prices_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_business_prices_request = UpdateBusinessPricesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_campaign_offers(campaign_id, update_campaign_offers_request):  # noqa: E501
    """Изменение условий продажи товаров в магазине

    Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param update_campaign_offers_request: 
    :type update_campaign_offers_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_campaign_offers_request = UpdateCampaignOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_goods_feedback_comment(business_id, update_goods_feedback_comment_request):  # noqa: E501
    """Добавление нового или изменение созданного комментария

    Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param update_goods_feedback_comment_request: 
    :type update_goods_feedback_comment_request: dict | bytes

    :rtype: Union[UpdateGoodsFeedbackCommentResponse, Tuple[UpdateGoodsFeedbackCommentResponse, int], Tuple[UpdateGoodsFeedbackCommentResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_goods_feedback_comment_request = UpdateGoodsFeedbackCommentRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_offer_content(business_id, update_offer_content_request):  # noqa: E501
    """Редактирование категорийных характеристик товара

    Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param update_offer_content_request: 
    :type update_offer_content_request: dict | bytes

    :rtype: Union[UpdateOfferContentResponse, Tuple[UpdateOfferContentResponse, int], Tuple[UpdateOfferContentResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_offer_content_request = UpdateOfferContentRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_offer_mapping_entries(campaign_id, update_offer_mapping_entry_request):  # noqa: E501
    """Добавление и редактирование товаров в каталоге

    {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param update_offer_mapping_entry_request: 
    :type update_offer_mapping_entry_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_offer_mapping_entry_request = UpdateOfferMappingEntryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_offer_mappings(business_id, update_offer_mappings_request):  # noqa: E501
    """Добавление товаров в каталог и изменение информации о них

    Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param update_offer_mappings_request: 
    :type update_offer_mappings_request: dict | bytes

    :rtype: Union[UpdateOfferMappingsResponse, Tuple[UpdateOfferMappingsResponse, int], Tuple[UpdateOfferMappingsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_offer_mappings_request = UpdateOfferMappingsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_prices(campaign_id, update_prices_request):  # noqa: E501
    """Установка цен на товары в конкретном магазине

    Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param update_prices_request: 
    :type update_prices_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_prices_request = UpdatePricesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_promo_offers(business_id, update_promo_offers_request):  # noqa: E501
    """Добавление товаров в акцию или изменение их цен

    Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param update_promo_offers_request: 
    :type update_promo_offers_request: dict | bytes

    :rtype: Union[UpdatePromoOffersResponse, Tuple[UpdatePromoOffersResponse, int], Tuple[UpdatePromoOffersResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_promo_offers_request = UpdatePromoOffersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'