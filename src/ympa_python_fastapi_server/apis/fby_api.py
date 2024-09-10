# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.fby_api_base import BaseFbyApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from ympa_python_fastapi_server.models.extra_models import TokenModel  # noqa: F401
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

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/campaigns/{campaignId}/hidden-offers",
    responses={
        200: {"model": EmptyApiResponse, "description": "Настройки скрытия получены и скоро вступят в силу."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["hidden-offers","fby","fbs","dbs","express"],
    summary="Скрытие товаров и настройки скрытия",
    response_model_by_alias=True,
)
async def add_hidden_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    add_hidden_offers_request: AddHiddenOffersRequest = Body(None, description="Запрос на скрытие оферов."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().add_hidden_offers(campaignId, add_hidden_offers_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/archive",
    responses={
        200: {"model": AddOffersToArchiveResponse, "description": "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Добавление товаров в архив",
    response_model_by_alias=True,
)
async def add_offers_to_archive(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    add_offers_to_archive_request: AddOffersToArchiveRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> AddOffersToArchiveResponse:
    """Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().add_offers_to_archive(businessId, add_offers_to_archive_request)


@router.post(
    "/tariffs/calculate",
    responses={
        200: {"model": CalculateTariffsResponse, "description": "Стоимость услуг."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["tariffs","fbs","fby","dbs","express"],
    summary="Калькулятор стоимости услуг",
    response_model_by_alias=True,
)
async def calculate_tariffs(
    calculate_tariffs_request: CalculateTariffsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> CalculateTariffsResponse:
    """Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().calculate_tariffs(calculate_tariffs_request)


@router.post(
    "/businesses/{businessId}/price-quarantine/confirm",
    responses={
        200: {"model": EmptyApiResponse, "description": "Ответ 200 обозначает, что цены подтверждены."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["price-quarantine","dbs","fby","fbs","express"],
    summary="Удаление товара из карантина по цене в кабинете",
    response_model_by_alias=True,
)
async def confirm_business_prices(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    confirm_prices_request: ConfirmPricesRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().confirm_business_prices(businessId, confirm_prices_request)


@router.post(
    "/campaigns/{campaignId}/price-quarantine/confirm",
    responses={
        200: {"model": EmptyApiResponse, "description": "Ответ 200 обозначает, что цены подтверждены."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["price-quarantine","dbs","fby","fbs","express"],
    summary="Удаление товара из карантина по цене в магазине",
    response_model_by_alias=True,
)
async def confirm_campaign_prices(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    confirm_prices_request: ConfirmPricesRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().confirm_campaign_prices(campaignId, confirm_prices_request)


@router.post(
    "/businesses/{businessId}/chats/new",
    responses={
        200: {"model": CreateChatResponse, "description": "Все получилось: чат создан. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Создание нового чата с покупателем",
    response_model_by_alias=True,
)
async def create_chat(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    create_chat_request: CreateChatRequest = Body(None, description="description"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> CreateChatResponse:
    """Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().create_chat(businessId, create_chat_request)


@router.post(
    "/campaigns/{campaignId}/offers/delete",
    responses={
        200: {"model": DeleteCampaignOffersResponse, "description": "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offers","dbs","fby","fbs","express"],
    summary="Удаление товаров из ассортимента магазина",
    response_model_by_alias=True,
)
async def delete_campaign_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_campaign_offers_request: DeleteCampaignOffersRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> DeleteCampaignOffersResponse:
    """Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().delete_campaign_offers(campaignId, delete_campaign_offers_request)


@router.post(
    "/businesses/{businessId}/goods-feedback/comments/delete",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Удаление комментария к отзыву",
    response_model_by_alias=True,
)
async def delete_goods_feedback_comment(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_goods_feedback_comment_request: DeleteGoodsFeedbackCommentRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().delete_goods_feedback_comment(businessId, delete_goods_feedback_comment_request)


@router.post(
    "/campaigns/{campaignId}/hidden-offers/delete",
    responses={
        200: {"model": EmptyApiResponse, "description": "Показ товаров возобновлен."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["hidden-offers","fby","fbs","dbs","express"],
    summary="Возобновление показа товаров",
    response_model_by_alias=True,
)
async def delete_hidden_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_hidden_offers_request: DeleteHiddenOffersRequest = Body(None, description="Запрос на возобновление показа оферов."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().delete_hidden_offers(campaignId, delete_hidden_offers_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/delete",
    responses={
        200: {"model": DeleteOffersResponse, "description": "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Удаление товаров из каталога",
    response_model_by_alias=True,
)
async def delete_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_offers_request: DeleteOffersRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> DeleteOffersResponse:
    """Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().delete_offers(businessId, delete_offers_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/unarchive",
    responses={
        200: {"model": DeleteOffersFromArchiveResponse, "description": "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Удаление товаров из архива",
    response_model_by_alias=True,
)
async def delete_offers_from_archive(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_offers_from_archive_request: DeleteOffersFromArchiveRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> DeleteOffersFromArchiveResponse:
    """Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().delete_offers_from_archive(businessId, delete_offers_from_archive_request)


@router.post(
    "/businesses/{businessId}/promos/offers/delete",
    responses={
        200: {"model": DeletePromoOffersResponse, "description": "Результат удаления товаров из акции."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["promos","fby","fbs","dbs","express"],
    summary="Удаление товаров из акции",
    response_model_by_alias=True,
)
async def delete_promo_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_promo_offers_request: DeletePromoOffersRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> DeletePromoOffersResponse:
    """Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().delete_promo_offers(businessId, delete_promo_offers_request)


@router.post(
    "/reports/boost-consolidated/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по бусту продаж",
    response_model_by_alias=True,
)
async def generate_boost_consolidated_report(
    generate_boost_consolidated_request: GenerateBoostConsolidatedRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_boost_consolidated_report(generate_boost_consolidated_request, format)


@router.post(
    "/reports/competitors-position/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Отчет «Конкурентная позиция»",
    response_model_by_alias=True,
)
async def generate_competitors_position_report(
    generate_competitors_position_report_request: GenerateCompetitorsPositionReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_competitors_position_report(generate_competitors_position_report_request, format)


@router.post(
    "/reports/goods-feedback/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по отзывам о товарах",
    response_model_by_alias=True,
)
async def generate_goods_feedback_report(
    generate_goods_feedback_request: GenerateGoodsFeedbackRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_goods_feedback_report(generate_goods_feedback_request, format)


@router.post(
    "/reports/goods-movement/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby"],
    summary="Отчет по движению товаров",
    response_model_by_alias=True,
)
async def generate_goods_movement_report(
    generate_goods_movement_report_request: GenerateGoodsMovementReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_goods_movement_report(generate_goods_movement_report_request, format)


@router.post(
    "/reports/goods-realization/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","express"],
    summary="Отчет по реализации",
    response_model_by_alias=True,
)
async def generate_goods_realization_report(
    generate_goods_realization_report_request: GenerateGoodsRealizationReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_goods_realization_report(generate_goods_realization_report_request, format)


@router.post(
    "/reports/goods-turnover/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby"],
    summary="Отчет по оборачиваемости",
    response_model_by_alias=True,
)
async def generate_goods_turnover_report(
    generate_goods_turnover_request: GenerateGoodsTurnoverRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_goods_turnover_report(generate_goods_turnover_request, format)


@router.post(
    "/reports/prices/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет «Цены на рынке»",
    response_model_by_alias=True,
)
async def generate_prices_report(
    generate_prices_report_request: GeneratePricesReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_prices_report(generate_prices_report_request, format)


@router.post(
    "/reports/shelf-statistics/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по полкам",
    response_model_by_alias=True,
)
async def generate_shelfs_statistics_report(
    generate_shelfs_statistics_request: GenerateShelfsStatisticsRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_shelfs_statistics_report(generate_shelfs_statistics_request, format)


@router.post(
    "/reports/shows-sales/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Отчет «Аналитика продаж»",
    response_model_by_alias=True,
)
async def generate_shows_sales_report(
    generate_shows_sales_report_request: GenerateShowsSalesReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_shows_sales_report(generate_shows_sales_report_request, format)


@router.post(
    "/reports/stocks-on-warehouses/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по остаткам на складах",
    response_model_by_alias=True,
)
async def generate_stocks_on_warehouses_report(
    generate_stocks_on_warehouses_report_request: GenerateStocksOnWarehousesReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, format)


@router.post(
    "/reports/united-marketplace-services/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Отчет по стоимости услуг",
    response_model_by_alias=True,
)
async def generate_united_marketplace_services_report(
    generate_united_marketplace_services_report_request: GenerateUnitedMarketplaceServicesReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, format)


@router.post(
    "/reports/united-netting/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Отчет по платежам",
    response_model_by_alias=True,
)
async def generate_united_netting_report(
    generate_united_netting_report_request: GenerateUnitedNettingReportRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_united_netting_report(generate_united_netting_report_request, format)


@router.post(
    "/reports/united-orders/generate",
    responses={
        200: {"model": GenerateReportResponse, "description": "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","fbs","dbs","express"],
    summary="Отчет по заказам",
    response_model_by_alias=True,
)
async def generate_united_orders_report(
    generate_united_orders_request: GenerateUnitedOrdersRequest = Body(None, description=""),
    format:  = Query(None, description="Формат отчета.", alias="format"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GenerateReportResponse:
    """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().generate_united_orders_report(generate_united_orders_request, format)


@router.get(
    "/campaigns/{campaignId}/offers/all",
    responses={
        200: {"model": GetAllOffersResponse, "description": "Предложения магазина."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offers","dbs","fbs","express","fby"],
    summary="Все предложения магазина",
    response_model_by_alias=True,
)
async def get_all_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feed_id: int = Query(None, description="Идентификатор прайс-листа.", alias="feedId"),
    chunk: int = Query(None, description="Номер сегмента с результатами.  Значение по умолчанию: &#x60;0&#x60;.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#x60;chunk&#x3D;0&#x60; и т. д.  {% endnote %} ", alias="chunk"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetAllOffersResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_all_offers(campaignId, feed_id, chunk)


@router.post(
    "/businesses/{businessId}/bids/info",
    responses={
        200: {"model": GetBidsInfoResponse, "description": "Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["bids","dbs","fbs","fby","express"],
    summary="Информация об установленных ставках",
    response_model_by_alias=True,
)
async def get_bids_info_for_business(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_bids_info_request: GetBidsInfoRequest = Body(None, description="description"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetBidsInfoResponse:
    """Возвращает значения ставок для заданных товаров.  {% note warning \&quot;\&quot; %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_bids_info_for_business(businessId, page_token, limit, get_bids_info_request)


@router.post(
    "/businesses/{businessId}/bids/recommendations",
    responses={
        200: {"model": GetBidsRecommendationsResponse, "description": "Рекомендованные ставки для заданных товаров."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["bids","dbs","fbs","fby","express"],
    summary="Рекомендованные ставки для заданных товаров",
    response_model_by_alias=True,
)
async def get_bids_recommendations(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_bids_recommendations_request: GetBidsRecommendationsRequest = Body(None, description="description."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetBidsRecommendationsResponse:
    """Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_bids_recommendations(businessId, get_bids_recommendations_request)


@router.post(
    "/businesses/{businessId}/price-quarantine",
    responses={
        200: {"model": GetQuarantineOffersResponse, "description": "Список товаров в карантине."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["price-quarantine","dbs","fby","fbs","express"],
    summary="Список товаров, находящихся в карантине по цене в кабинете",
    response_model_by_alias=True,
)
async def get_business_quarantine_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_quarantine_offers_request: GetQuarantineOffersRequest = Body(None, description=""),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetQuarantineOffersResponse:
    """Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_business_quarantine_offers(businessId, get_quarantine_offers_request, page_token, limit)


@router.post(
    "/businesses/{businessId}/settings",
    responses={
        200: {"model": GetBusinessSettingsResponse, "description": "Настройки кабинета."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["businesses","dbs","fbs","fby","express"],
    summary="Настройки кабинета",
    response_model_by_alias=True,
)
async def get_business_settings(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetBusinessSettingsResponse:
    """Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_business_settings(businessId)


@router.get(
    "/campaigns/{campaignId}",
    responses={
        200: {"model": GetCampaignResponse, "description": "Информация о магазине."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["campaigns","dbs","express","fbs","fby"],
    summary="Информация о магазине",
    response_model_by_alias=True,
)
async def get_campaign(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCampaignResponse:
    """Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_campaign(campaignId)


@router.get(
    "/campaigns/{campaignId}/logins",
    responses={
        200: {"model": GetCampaignLoginsResponse, "description": "Список логинов, связанных с магазином."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["campaigns","dbs","express","fbs","fby"],
    summary="Логины, связанные с магазином",
    response_model_by_alias=True,
)
async def get_campaign_logins(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCampaignLoginsResponse:
    """Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_campaign_logins(campaignId)


@router.post(
    "/campaigns/{campaignId}/offers",
    responses={
        200: {"model": GetCampaignOffersResponse, "description": "Список товаров, размещенных в заданном магазине."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offers","dbs","fby","fbs","express"],
    summary="Информация о товарах, которые размещены в заданном магазине",
    response_model_by_alias=True,
)
async def get_campaign_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_campaign_offers_request: GetCampaignOffersRequest = Body(None, description=""),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCampaignOffersResponse:
    """Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_campaign_offers(campaignId, get_campaign_offers_request, page_token, limit)


@router.post(
    "/campaigns/{campaignId}/price-quarantine",
    responses={
        200: {"model": GetQuarantineOffersResponse, "description": "Список товаров в карантине."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["price-quarantine","dbs","fby","fbs","express"],
    summary="Список товаров, находящихся в карантине по цене в магазине",
    response_model_by_alias=True,
)
async def get_campaign_quarantine_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_quarantine_offers_request: GetQuarantineOffersRequest = Body(None, description=""),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetQuarantineOffersResponse:
    """Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_campaign_quarantine_offers(campaignId, get_quarantine_offers_request, page_token, limit)


@router.get(
    "/campaigns/{campaignId}/region",
    responses={
        200: {"model": GetCampaignRegionResponse, "description": "Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["campaigns","dbs","fby","fbs","express"],
    summary="Регион магазина",
    response_model_by_alias=True,
)
async def get_campaign_region(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCampaignRegionResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_campaign_region(campaignId)


@router.get(
    "/campaigns/{campaignId}/settings",
    responses={
        200: {"model": GetCampaignSettingsResponse, "description": "Настройки магазина."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["campaigns","dbs","fbs","express","fby"],
    summary="Настройки магазина",
    response_model_by_alias=True,
)
async def get_campaign_settings(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCampaignSettingsResponse:
    """Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_campaign_settings(campaignId)


@router.get(
    "/campaigns",
    responses={
        200: {"model": GetCampaignsResponse, "description": "Магазины пользователя."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["campaigns","dbs","express","fbs","fby"],
    summary="Список магазинов пользователя",
    response_model_by_alias=True,
)
async def get_campaigns(
    page: int = Query(1, description="Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="page", le=10000),
    page_size: int = Query(None, description="Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="pageSize"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCampaignsResponse:
    """Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_campaigns(page, page_size)


@router.get(
    "/campaigns/by_login/{login}",
    responses={
        200: {"model": GetCampaignsResponse, "description": "Информация о магазинах."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["campaigns","dbs","express","fbs","fby"],
    summary="Магазины, доступные логину",
    response_model_by_alias=True,
)
async def get_campaigns_by_login(
    login: str = Path(..., description="Логин пользователя."),
    page: int = Query(1, description="Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="page", le=10000),
    page_size: int = Query(None, description="Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="pageSize"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCampaignsResponse:
    """Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_campaigns_by_login(login, page, page_size)


@router.post(
    "/categories/max-sale-quantum",
    responses={
        200: {"model": GetCategoriesMaxSaleQuantumResponse, "description": "Лимит на установку кванта и минимального количества товаров."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["categories","fby","fbs","dbs","express"],
    summary="Лимит на установку кванта продажи и минимального количества товаров в заказе",
    response_model_by_alias=True,
)
async def get_categories_max_sale_quantum(
    get_categories_max_sale_quantum_request: GetCategoriesMaxSaleQuantumRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCategoriesMaxSaleQuantumResponse:
    """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_categories_max_sale_quantum(get_categories_max_sale_quantum_request)


@router.post(
    "/categories/tree",
    responses={
        200: {"model": GetCategoriesResponse, "description": "Категории Маркета."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["categories","fby","fbs","dbs","express"],
    summary="Дерево категорий",
    response_model_by_alias=True,
)
async def get_categories_tree(
    get_categories_request: GetCategoriesRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCategoriesResponse:
    """Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_categories_tree(get_categories_request)


@router.post(
    "/category/{categoryId}/parameters",
    responses={
        200: {"model": GetCategoryContentParametersResponse, "description": "Список характеристик товаров из заданной категории."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["content","dbs","fby","fbs","express"],
    summary="Списки характеристик товаров по категориям",
    response_model_by_alias=True,
)
async def get_category_content_parameters(
    categoryId: int = Path(..., description="Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCategoryContentParametersResponse:
    """Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_category_content_parameters(categoryId)


@router.post(
    "/businesses/{businessId}/chats/history",
    responses={
        200: {"model": GetChatHistoryResponse, "description": "История сообщений успешно получена. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Получение истории сообщений в чате",
    response_model_by_alias=True,
)
async def get_chat_history(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    chat_id: int = Query(None, description="Идентификатор чата.", alias="chatId"),
    get_chat_history_request: GetChatHistoryRequest = Body(None, description="description"),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetChatHistoryResponse:
    """Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_chat_history(businessId, chat_id, get_chat_history_request, page_token, limit)


@router.post(
    "/businesses/{businessId}/chats",
    responses={
        200: {"model": GetChatsResponse, "description": "Список чатов. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Получение доступных чатов",
    response_model_by_alias=True,
)
async def get_chats(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_chats_request: GetChatsRequest = Body(None, description="description"),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetChatsResponse:
    """Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_chats(businessId, get_chats_request, page_token, limit)


@router.get(
    "/campaigns/{campaignId}/feeds/{feedId}",
    responses={
        200: {"model": GetFeedResponse, "description": "Информация о прайс-листе."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Информация о прайс-листе",
    response_model_by_alias=True,
)
async def get_feed(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feedId: int = Path(..., description="Идентификатор прайс-листа."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetFeedResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_feed(campaignId, feedId)


@router.get(
    "/campaigns/{campaignId}/feeds/{feedId}/index-logs",
    responses={
        200: {"model": GetFeedIndexLogsResponse, "description": "Отчет по индексации прайс-листа."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Отчет по индексации прайс-листа",
    response_model_by_alias=True,
)
async def get_feed_index_logs(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feedId: int = Path(..., description="Идентификатор прайс-листа."),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    published_time_from: str = Query(None, description="Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса. ", alias="published_time_from"),
    published_time_to: str = Query(None, description="Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %} ", alias="published_time_to"),
    status:  = Query(None, description="Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. ", alias="status"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetFeedIndexLogsResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_feed_index_logs(campaignId, feedId, limit, published_time_from, published_time_to, status)


@router.get(
    "/campaigns/{campaignId}/feedback/updates",
    responses={
        200: {"model": GetFeedbackListResponse, "description": "Список отзывов для магазина."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feedbacks","dbs","fby","fbs","express"],
    summary="Новые и обновленные отзывы о магазине",
    response_model_by_alias=True,
)
async def get_feedback_and_comment_updates(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    from_date: str = Query(None, description="Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. ", alias="from_date"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetFeedbackListResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_feedback_and_comment_updates(campaignId, page_token, limit, from_date)


@router.get(
    "/campaigns/{campaignId}/feeds",
    responses={
        200: {"model": GetFeedsResponse, "description": "Список прайс-листов."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Список прайс-листов магазина",
    response_model_by_alias=True,
)
async def get_feeds(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetFeedsResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_feeds(campaignId)


@router.get(
    "/warehouses",
    responses={
        200: {"model": GetFulfillmentWarehousesResponse, "description": "Список складов."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["warehouses","fby"],
    summary="Идентификаторы складов Маркета (FBY)",
    response_model_by_alias=True,
)
async def get_fulfillment_warehouses(
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetFulfillmentWarehousesResponse:
    """Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_fulfillment_warehouses()


@router.post(
    "/businesses/{businessId}/goods-feedback/comments",
    responses={
        200: {"model": GetGoodsFeedbackCommentsResponse, "description": "Дерево комментариев к отзыву."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Получение комментариев к отзыву",
    response_model_by_alias=True,
)
async def get_goods_feedback_comments(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_goods_feedback_comments_request: GetGoodsFeedbackCommentsRequest = Body(None, description=""),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetGoodsFeedbackCommentsResponse:
    """Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_goods_feedback_comments(businessId, get_goods_feedback_comments_request, page_token, limit)


@router.post(
    "/businesses/{businessId}/goods-feedback",
    responses={
        200: {"model": GetGoodsFeedbackResponse, "description": "Список отзывов."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Получение отзывов о товарах продавца",
    response_model_by_alias=True,
)
async def get_goods_feedbacks(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_goods_feedback_request: GetGoodsFeedbackRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetGoodsFeedbackResponse:
    """Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_goods_feedbacks(businessId, page_token, limit, get_goods_feedback_request)


@router.post(
    "/campaigns/{campaignId}/stats/skus",
    responses={
        200: {"model": GetGoodsStatsResponse, "description": "Отчет по товарам."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-stats","fby","fbs","express","dbs"],
    summary="Отчет по товарам",
    response_model_by_alias=True,
)
async def get_goods_stats(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_goods_stats_request: GetGoodsStatsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetGoodsStatsResponse:
    """Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_goods_stats(campaignId, get_goods_stats_request)


@router.get(
    "/campaigns/{campaignId}/hidden-offers",
    responses={
        200: {"model": GetHiddenOffersResponse, "description": "Информация о скрытых вами товарах."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["hidden-offers","fby","fbs","dbs","express"],
    summary="Информация о скрытых вами товарах",
    response_model_by_alias=True,
)
async def get_hidden_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    offer_id: List[str] = Query(None, description="Идентификатор скрытого предложения. ", alias="offer_id"),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    offset: int = Query(None, description="Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;. ", alias="offset"),
    page: int = Query(1, description="Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="page", le=10000),
    page_size: int = Query(None, description="Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="pageSize"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetHiddenOffersResponse:
    """Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_hidden_offers(campaignId, offer_id, page_token, limit, offset, page, page_size)


@router.post(
    "/businesses/{businessId}/offer-cards",
    responses={
        200: {"model": GetOfferCardsContentStatusResponse, "description": "Информация о карточках указанных товаров."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["content","dbs","fby","fbs","express"],
    summary="Получение информации о заполненности карточек магазина",
    response_model_by_alias=True,
)
async def get_offer_cards_content_status(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_offer_cards_content_status_request: GetOfferCardsContentStatusRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOfferCardsContentStatusResponse:
    """Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_offer_cards_content_status(businessId, page_token, limit, get_offer_cards_content_status_request)


@router.get(
    "/campaigns/{campaignId}/offer-mapping-entries",
    responses={
        200: {"model": GetOfferMappingEntriesResponse, "description": "Информация о товарах в каталоге."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offer-mappings","fby","fbs","express","dbs"],
    summary="Список товаров в каталоге",
    response_model_by_alias=True,
)
async def get_offer_mapping_entries(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    offer_id: List[str] = Query(None, description="Идентификатор товара в каталоге.", alias="offer_id"),
    shop_sku: List[str] = Query(None, description="Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. ", alias="shop_sku"),
    mapping_kind:  = Query(None, description="Тип маппинга.", alias="mapping_kind"),
    status: List[OfferProcessingStatusType] = Query(None, description="Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. ", alias="status"),
    availability: List[OfferAvailabilityStatusType] = Query(None, description="Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. ", alias="availability"),
    category_id: List[int] = Query(None, description="Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. ", alias="category_id"),
    vendor: List[str] = Query(None, description="Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. ", alias="vendor"),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOfferMappingEntriesResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_offer_mapping_entries(campaignId, offer_id, shop_sku, mapping_kind, status, availability, category_id, vendor, page_token, limit)


@router.post(
    "/businesses/{businessId}/offer-mappings",
    responses={
        200: {"model": GetOfferMappingsResponse, "description": "Информация о товарах в каталоге."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Информация о товарах в каталоге",
    response_model_by_alias=True,
)
async def get_offer_mappings(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_offer_mappings_request: GetOfferMappingsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOfferMappingsResponse:
    """Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_offer_mappings(businessId, page_token, limit, get_offer_mappings_request)


@router.post(
    "/businesses/{businessId}/offers/recommendations",
    responses={
        200: {"model": GetOfferRecommendationsResponse, "description": "Список товаров с рекомендациями."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offers","dbs","fby","fbs","express"],
    summary="Рекомендации Маркета, касающиеся цен",
    response_model_by_alias=True,
)
async def get_offer_recommendations(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_offer_recommendations_request: GetOfferRecommendationsRequest = Body(None, description=""),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOfferRecommendationsResponse:
    """Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_offer_recommendations(businessId, get_offer_recommendations_request, page_token, limit)


@router.get(
    "/campaigns/{campaignId}/offers",
    responses={
        200: {"model": GetOffersResponse, "description": "Предложения магазина."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offers","dbs","fbs","express","fby"],
    summary="Предложения магазина",
    response_model_by_alias=True,
)
async def get_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    query: str = Query(None, description="Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете. ", alias="query"),
    feed_id: int = Query(None, description="Идентификатор прайс-листа.", alias="feedId"),
    shop_category_id: str = Query(None, description="Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. ", alias="shopCategoryId"),
    currency:  = Query(None, description="Валюта, в которой указана цена предложения.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна. ", alias="currency"),
    matched: bool = Query(None, description="Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * &#x60;0 / FALSE / NO&#x60; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * &#x60;1 / TRUE / YES&#x60; — поиск выполняется среди предложений, соотнесенных с карточками моделей). ", alias="matched"),
    page: int = Query(1, description="Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="page", le=10000),
    page_size: int = Query(None, description="Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="pageSize"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOffersResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_offers(campaignId, query, feed_id, shop_category_id, currency, matched, page, page_size)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}",
    responses={
        200: {"model": GetOrderResponse, "description": "Информация о заказе."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["orders","fby","fbs","dbs","express"],
    summary="Информация об одном заказе",
    response_model_by_alias=True,
)
async def get_order(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOrderResponse:
    """Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_order(campaignId, orderId)


@router.post(
    "/campaigns/{campaignId}/orders/{orderId}/business-buyer",
    responses={
        200: {"model": GetBusinessBuyerInfoResponse, "description": "Информация о покупателе."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["order-business-information","fbs","fby","dbs","express"],
    summary="Информация о покупателе — юридическом лице",
    response_model_by_alias=True,
)
async def get_order_business_buyer_info(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetBusinessBuyerInfoResponse:
    """Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_order_business_buyer_info(campaignId, orderId)


@router.post(
    "/campaigns/{campaignId}/orders/{orderId}/documents",
    responses={
        200: {"model": GetBusinessDocumentsInfoResponse, "description": "Информация о документах."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["order-business-information","fbs","fby","dbs","express"],
    summary="Информация о документах",
    response_model_by_alias=True,
)
async def get_order_business_documents_info(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetBusinessDocumentsInfoResponse:
    """Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_order_business_documents_info(campaignId, orderId)


@router.get(
    "/campaigns/{campaignId}/orders",
    responses={
        200: {"model": GetOrdersResponse, "description": "Информация о заказах."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["orders","fbs","dbs","fby","express"],
    summary="Информация о нескольких заказах",
    response_model_by_alias=True,
)
async def get_orders(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    order_ids: List[int] = Query(None, description="Фильтрация заказов по идентификаторам. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым. ", alias="orderIds"),
    status: list[OrderStatusType] = Query(None, description="Статус заказа:  * &#x60;CANCELLED&#x60; — заказ отменен.  * &#x60;DELIVERED&#x60; — заказ получен покупателем.  * &#x60;DELIVERY&#x60; — заказ передан в службу доставки.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — заказ находится в обработке.  * &#x60;UNPAID&#x60; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется. ", alias="status"),
    substatus: list[OrderSubstatusType] = Query(None, description="Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  Возможные значения для заказа в статусе &#x60;PROCESSING&#x60;:  * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать. * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке. * &#x60;SHIPPED&#x60; — заказ передан службе доставки.  Возможные значения для заказа в статусе &#x60;CANCELLED&#x60;:  * &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60; — служба доставки не смогла доставить заказ.  * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.  * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.  * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * &#x60;RESERVATION_FAILED&#x60; — Маркет не может продолжить дальнейшую обработку заказа.  * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.  * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.  * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.  * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.  * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.  * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.  * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * &#x60;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#x60; — покупатель хочет получить заказ в другой день. * &#x60;CANCELLED_COURIER_NOT_FOUND&#x60; — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется. ", alias="substatus"),
    from_date: str = Query(None, description="Начальная дата для фильтрации заказов по дате оформления.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;toDate&#x60;) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты. ", alias="fromDate"),
    to_date: str = Query(None, description="Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;fromDate&#x60;) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата. ", alias="toDate"),
    supplier_shipment_date_from: str = Query(None, description="Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;supplierShipmentDateTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. ", alias="supplierShipmentDateFrom"),
    supplier_shipment_date_to: str = Query(None, description="Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;supplierShipmentDateFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. ", alias="supplierShipmentDateTo"),
    updated_at_from: str = Query(None, description="Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной и конечной датой (параметр &#x60;updatedAtTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. ", alias="updatedAtFrom"),
    updated_at_to: str = Query(None, description="Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной (параметр &#x60;updatedAtFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. ", alias="updatedAtTo"),
    dispatch_type:  = Query(None, description="Способ отгрузки", alias="dispatchType"),
    fake: bool = Query(False, description="Фильтрация заказов по типам:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ", alias="fake"),
    has_cis: bool = Query(False, description="Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да.  * &#x60;false&#x60; — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. ", alias="hasCis"),
    only_waiting_for_cancellation_approve: bool = Query(False, description="**Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение &#x60;true&#x60; возвращаются только заказы, которые находятся в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60; и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation). ", alias="onlyWaitingForCancellationApprove"),
    only_estimated_delivery: bool = Query(False, description="Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * &#x60;true&#x60; — возвращаются только заказы с неподтвержденной датой доставки. * &#x60;false&#x60; — фильтрация не применяется. ", alias="onlyEstimatedDelivery"),
    buyer_type:  = Query(None, description="Фильтрация заказов по типу покупателя. ", alias="buyerType"),
    page: int = Query(1, description="Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="page", le=10000),
    page_size: int = Query(None, description="Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="pageSize"),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOrdersResponse:
    """Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_orders(campaignId, order_ids, status, substatus, from_date, to_date, supplier_shipment_date_from, supplier_shipment_date_to, updated_at_from, updated_at_to, dispatch_type, fake, has_cis, only_waiting_for_cancellation_approve, only_estimated_delivery, buyer_type, page, page_size, page_token, limit)


@router.post(
    "/campaigns/{campaignId}/stats/orders",
    responses={
        200: {"model": GetOrdersStatsResponse, "description": "Информация по заказам."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["orders-stats","fby","fbs","dbs","express"],
    summary="Детальная информация по заказам",
    response_model_by_alias=True,
)
async def get_orders_stats(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_orders_stats_request: GetOrdersStatsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOrdersStatsResponse:
    """Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_orders_stats(campaignId, page_token, limit, get_orders_stats_request)


@router.get(
    "/campaigns/{campaignId}/offer-prices",
    responses={
        200: {"model": GetPricesResponse, "description": "Список всех товаров с установленными ценами."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["prices","fby","fbs","dbs","express"],
    summary="Список цен",
    response_model_by_alias=True,
)
async def get_prices(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    archived: bool = Query(False, description="Фильтр по нахождению в архиве.", alias="archived"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetPricesResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_prices(campaignId, page_token, limit, archived)


@router.post(
    "/campaigns/{campaignId}/offer-prices",
    responses={
        200: {"model": GetPricesByOfferIdsResponse, "description": "Список товаров с установленными для заданного магазина ценами."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["prices","fby","fbs","dbs","express"],
    summary="Просмотр цен на указанные товары в магазине",
    response_model_by_alias=True,
)
async def get_prices_by_offer_ids(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_prices_by_offer_ids_request: GetPricesByOfferIdsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetPricesByOfferIdsResponse:
    """Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_prices_by_offer_ids(campaignId, page_token, limit, get_prices_by_offer_ids_request)


@router.post(
    "/businesses/{businessId}/promos/offers",
    responses={
        200: {"model": GetPromoOffersResponse, "description": "Список товаров, которые участвуют или могут участвовать в акции."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["promos","fby","fbs","dbs","express"],
    summary="Получение списка товаров, которые участвуют или могут участвовать в акции",
    response_model_by_alias=True,
)
async def get_promo_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_promo_offers_request: GetPromoOffersRequest = Body(None, description=""),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetPromoOffersResponse:
    """Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_promo_offers(businessId, get_promo_offers_request, page_token, limit)


@router.post(
    "/businesses/{businessId}/promos",
    responses={
        200: {"model": GetPromosResponse, "description": "Список акций Маркета."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["promos","fby","fbs","dbs","express"],
    summary="Получение списка акций",
    response_model_by_alias=True,
)
async def get_promos(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_promos_request: GetPromosRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetPromosResponse:
    """Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_promos(businessId, get_promos_request)


@router.post(
    "/businesses/{businessId}/ratings/quality",
    responses={
        200: {"model": GetQualityRatingResponse, "description": "Значение индекса качества магазинов и его составляющие."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["ratings","fby","fbs","dbs","express"],
    summary="Индекс качества магазинов",
    response_model_by_alias=True,
)
async def get_quality_ratings(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_quality_rating_request: GetQualityRatingRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetQualityRatingResponse:
    """Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_quality_ratings(businessId, get_quality_rating_request)


@router.get(
    "/reports/info/{reportId}",
    responses={
        200: {"model": GetReportInfoResponse, "description": "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["reports","fby","dbs","fbs","express"],
    summary="Получение заданного отчета",
    response_model_by_alias=True,
)
async def get_report_info(
    reportId: str = Path(..., description="Идентификатор отчета, который вы получили после запуска генерации. "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetReportInfoResponse:
    """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_report_info(reportId)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}",
    responses={
        200: {"model": GetReturnResponse, "description": "Детали возврата."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","fbs","dbs","express","fby"],
    summary="Информация о невыкупе или возврате",
    response_model_by_alias=True,
)
async def get_return(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    returnId: int = Path(..., description="Идентификатор возврата."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetReturnResponse:
    """Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_return(campaignId, orderId, returnId)


@router.get(
    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}",
    responses={
        200: {"model": file, "description": "Фотография возврата."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","fbs","dbs","express","fby"],
    summary="Получение фотографии возврата",
    response_model_by_alias=True,
)
async def get_return_photo(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    orderId: int = Path(..., description="Идентификатор заказа."),
    returnId: int = Path(..., description="Идентификатор возврата."),
    itemId: int = Path(..., description="Идентификатор товара в возврате."),
    imageHash: str = Path(..., description="Хеш ссылки изображения для загрузки."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> file:
    """Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_return_photo(campaignId, orderId, returnId, itemId, imageHash)


@router.get(
    "/campaigns/{campaignId}/returns",
    responses={
        200: {"model": GetReturnsResponse, "description": "Постраничные возвраты партнера."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["returns","fbs","dbs","express","fby"],
    summary="Список невыкупов и возвратов",
    response_model_by_alias=True,
)
async def get_returns(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    order_ids: List[int] = Query(None, description="Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. ", alias="orderIds"),
    statuses: List[RefundStatusType] = Query(None, description="Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. ", alias="statuses"),
    type:  = Query(None, description="Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. ", alias="type"),
    from_date: str = Query(None, description="Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. ", alias="fromDate"),
    to_date: str = Query(None, description="Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;. ", alias="toDate"),
    from_date2: str = Query(None, description="{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. ", alias="from_date"),
    to_date2: str = Query(None, description="{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. ", alias="to_date"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetReturnsResponse:
    """Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_returns(campaignId, page_token, limit, order_ids, statuses, type, from_date, to_date, from_date2, to_date2)


@router.post(
    "/campaigns/{campaignId}/offers/stocks",
    responses={
        200: {"model": GetWarehouseStocksResponse, "description": "Остатки товаров на складах."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["stocks","fby","fbs","dbs","express"],
    summary="Информация об остатках и оборачиваемости",
    response_model_by_alias=True,
)
async def get_stocks(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_warehouse_stocks_request: GetWarehouseStocksRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetWarehouseStocksResponse:
    """Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_stocks(campaignId, page_token, limit, get_warehouse_stocks_request)


@router.post(
    "/campaigns/{campaignId}/offer-mapping-entries/suggestions",
    responses={
        200: {"model": GetSuggestedOfferMappingEntriesResponse, "description": "Информация о товарах в каталоге."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offer-mappings","fby","fbs","express","dbs"],
    summary="Рекомендованные карточки для товаров",
    response_model_by_alias=True,
)
async def get_suggested_offer_mapping_entries(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_suggested_offer_mapping_entries_request: GetSuggestedOfferMappingEntriesRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetSuggestedOfferMappingEntriesResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_suggested_offer_mapping_entries(campaignId, get_suggested_offer_mapping_entries_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/suggestions",
    responses={
        200: {"model": GetSuggestedOfferMappingsResponse, "description": "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Просмотр карточек на Маркете, которые подходят вашим товарам",
    response_model_by_alias=True,
)
async def get_suggested_offer_mappings(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_suggested_offer_mappings_request: GetSuggestedOfferMappingsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetSuggestedOfferMappingsResponse:
    """Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_suggested_offer_mappings(businessId, get_suggested_offer_mappings_request)


@router.post(
    "/campaigns/{campaignId}/offer-prices/suggestions",
    responses={
        200: {"model": SuggestPricesResponse, "description": "Список цен для продвижения на Маркете."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["prices","fby","fbs","express","dbs"],
    summary="Цены для продвижения товаров",
    response_model_by_alias=True,
)
async def get_suggested_prices(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    suggest_prices_request: SuggestPricesRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> SuggestPricesResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().get_suggested_prices(campaignId, suggest_prices_request)


@router.put(
    "/businesses/{businessId}/bids",
    responses={
        200: {"model": EmptyApiResponse, "description": "Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["bids","dbs","fbs","fby","express"],
    summary="Включение буста продаж и установка ставок",
    response_model_by_alias=True,
)
async def put_bids_for_business(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    put_sku_bids_request: PutSkuBidsRequest = Body(None, description="description"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \&quot;Как в кабинете выглядит кампания, созданная через API\&quot; %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().put_bids_for_business(businessId, put_sku_bids_request)


@router.put(
    "/campaigns/{campaignId}/bids",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["bids","dbs","fbs","express","fby"],
    summary="Включение буста продаж и установка ставок для магазина",
    response_model_by_alias=True,
)
async def put_bids_for_campaign(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    put_sku_bids_request: PutSkuBidsRequest = Body(None, description="description"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().put_bids_for_campaign(campaignId, put_sku_bids_request)


@router.post(
    "/campaigns/{campaignId}/feeds/{feedId}/refresh",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Сообщить, что прайс-лист обновился",
    response_model_by_alias=True,
)
async def refresh_feed(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feedId: int = Path(..., description="Идентификатор прайс-листа."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().refresh_feed(campaignId, feedId)


@router.get(
    "/regions/{regionId}/children",
    responses={
        200: {"model": GetRegionWithChildrenResponse, "description": "Регионы, являющиеся дочерними к указанному в запросе."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["regions","fby","fbs","dbs","express"],
    summary="Информация о дочерних регионах",
    response_model_by_alias=True,
)
async def search_region_children(
    regionId: int = Path(..., description="Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). "),
    page: int = Query(1, description="Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="page", le=10000),
    page_size: int = Query(None, description="Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;. ", alias="pageSize"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetRegionWithChildrenResponse:
    """Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().search_region_children(regionId, page, page_size)


@router.get(
    "/regions/{regionId}",
    responses={
        200: {"model": GetRegionsResponse, "description": "Найденный регион."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["regions","fby","fbs","dbs","express"],
    summary="Информация о регионе",
    response_model_by_alias=True,
)
async def search_regions_by_id(
    regionId: int = Path(..., description="Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetRegionsResponse:
    """Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().search_regions_by_id(regionId)


@router.get(
    "/regions",
    responses={
        200: {"model": GetRegionsResponse, "description": "Список найденных регионов."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["regions","fby","fbs","dbs","express"],
    summary="Поиск регионов по их имени",
    response_model_by_alias=True,
)
async def search_regions_by_name(
    name: str = Query(None, description="Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;. ", alias="name"),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetRegionsResponse:
    """Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().search_regions_by_name(name, page_token, limit)


@router.post(
    "/businesses/{businessId}/chats/file/send",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ. Означает, что файл отправлен."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Отправка файла в чат",
    response_model_by_alias=True,
)
async def send_file_to_chat(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    chat_id: int = Query(None, description="Идентификатор чата.", alias="chatId"),
    file: str = Form(None, description="Содержимое файла. Максимальный размер файла — 5 Мбайт."),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().send_file_to_chat(businessId, chat_id, file)


@router.post(
    "/businesses/{businessId}/chats/message",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ. Означает, что сообщение отправлено."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["chats","dbs","fbs","fby","express"],
    summary="Отправка сообщения в чат",
    response_model_by_alias=True,
)
async def send_message_to_chat(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    chat_id: int = Query(None, description="Идентификатор чата.", alias="chatId"),
    send_message_to_chat_request: SendMessageToChatRequest = Body(None, description="description"),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().send_message_to_chat(businessId, chat_id, send_message_to_chat_request)


@router.post(
    "/campaigns/{campaignId}/feeds/{feedId}/params",
    responses={
        200: {"model": EmptyApiResponse, "description": "Статус выполнения операции."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["feeds","dbs","fbs","express","fby"],
    summary="Изменение параметров прайс-листа",
    response_model_by_alias=True,
)
async def set_feed_params(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    feedId: int = Path(..., description="Идентификатор прайс-листа."),
    set_feed_params_request: SetFeedParamsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().set_feed_params(campaignId, feedId, set_feed_params_request)


@router.post(
    "/businesses/{businessId}/goods-feedback/skip-reaction",
    responses={
        200: {"model": EmptyApiResponse, "description": "Пустой ответ."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Отказ от ответа на отзывы",
    response_model_by_alias=True,
)
async def skip_goods_feedbacks_reaction(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    skip_goods_feedback_reaction_request: SkipGoodsFeedbackReactionRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().skip_goods_feedbacks_reaction(businessId, skip_goods_feedback_reaction_request)


@router.post(
    "/businesses/{businessId}/offer-prices/updates",
    responses={
        200: {"model": EmptyApiResponse, "description": "Маркет принял информацию о новых ценах."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["prices","fby","fbs","dbs","express"],
    summary="Установка цен на товары во всех магазинах",
    response_model_by_alias=True,
)
async def update_business_prices(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_business_prices_request: UpdateBusinessPricesRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().update_business_prices(businessId, update_business_prices_request)


@router.post(
    "/campaigns/{campaignId}/offers/update",
    responses={
        200: {"model": EmptyApiResponse, "description": "Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offers","dbs","fby","fbs","express"],
    summary="Изменение условий продажи товаров в магазине",
    response_model_by_alias=True,
)
async def update_campaign_offers(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_campaign_offers_request: UpdateCampaignOffersRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().update_campaign_offers(campaignId, update_campaign_offers_request)


@router.post(
    "/businesses/{businessId}/goods-feedback/comments/update",
    responses={
        200: {"model": UpdateGoodsFeedbackCommentResponse, "description": "Информация о добавленном или измененном комментарии."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["goods-feedback","fby","fbs","dbs","express"],
    summary="Добавление нового или изменение созданного комментария",
    response_model_by_alias=True,
)
async def update_goods_feedback_comment(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_goods_feedback_comment_request: UpdateGoodsFeedbackCommentRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> UpdateGoodsFeedbackCommentResponse:
    """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().update_goods_feedback_comment(businessId, update_goods_feedback_comment_request)


@router.post(
    "/businesses/{businessId}/offer-cards/update",
    responses={
        200: {"model": UpdateOfferContentResponse, "description": "Запрос выполнен корректно, данные обработаны.  {% note warning \&quot;Ответ 200 сам по себе не значит, что переданные значения корректны\&quot; %}  Обязательно посмотрите детали ответа: &#x60;status&#x60; и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в &#x60;status&#x60; вернулось &#x60;ERROR&#x60;, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля &#x60;errors&#x60; и &#x60;warnings&#x60;. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["content","dbs","fby","fbs","express"],
    summary="Редактирование категорийных характеристик товара",
    response_model_by_alias=True,
)
async def update_offer_content(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_offer_content_request: UpdateOfferContentRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> UpdateOfferContentResponse:
    """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().update_offer_content(businessId, update_offer_content_request)


@router.post(
    "/campaigns/{campaignId}/offer-mapping-entries/updates",
    responses={
        200: {"model": EmptyApiResponse, "description": "Статус выполнения операции."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["offer-mappings","fby","fbs","express","dbs"],
    summary="Добавление и редактирование товаров в каталоге",
    response_model_by_alias=True,
)
async def update_offer_mapping_entries(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_offer_mapping_entry_request: UpdateOfferMappingEntryRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().update_offer_mapping_entries(campaignId, update_offer_mapping_entry_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/update",
    responses={
        200: {"model": UpdateOfferMappingsResponse, "description": "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Добавление товаров в каталог и изменение информации о них",
    response_model_by_alias=True,
)
async def update_offer_mappings(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_offer_mappings_request: UpdateOfferMappingsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> UpdateOfferMappingsResponse:
    """Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().update_offer_mappings(businessId, update_offer_mappings_request)


@router.post(
    "/campaigns/{campaignId}/offer-prices/updates",
    responses={
        200: {"model": EmptyApiResponse, "description": "Маркет принял информацию о новых ценах."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["prices","fby","fbs","dbs","express"],
    summary="Установка цен на товары в конкретном магазине",
    response_model_by_alias=True,
)
async def update_prices(
    campaignId: int = Path(..., description="Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_prices_request: UpdatePricesRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> EmptyApiResponse:
    """Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().update_prices(campaignId, update_prices_request)


@router.post(
    "/businesses/{businessId}/promos/offers/update",
    responses={
        200: {"model": UpdatePromoOffersResponse, "description": "Результат добавления товаров в акцию или обновления их цен."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["promos","fby","fbs","dbs","express"],
    summary="Добавление товаров в акцию или изменение их цен",
    response_model_by_alias=True,
)
async def update_promo_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_promo_offers_request: UpdatePromoOffersRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> UpdatePromoOffersResponse:
    """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| """
    if not BaseFbyApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFbyApi.subclasses[0]().update_promo_offers(businessId, update_promo_offers_request)
