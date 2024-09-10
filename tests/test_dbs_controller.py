# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData

from ympa_python_aiohttp_server.models.accept_order_cancellation_request import AcceptOrderCancellationRequest
from ympa_python_aiohttp_server.models.add_hidden_offers_request import AddHiddenOffersRequest
from ympa_python_aiohttp_server.models.add_offers_to_archive_request import AddOffersToArchiveRequest
from ympa_python_aiohttp_server.models.add_offers_to_archive_response import AddOffersToArchiveResponse
from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.calculate_tariffs_request import CalculateTariffsRequest
from ympa_python_aiohttp_server.models.calculate_tariffs_response import CalculateTariffsResponse
from ympa_python_aiohttp_server.models.change_outlet_request import ChangeOutletRequest
from ympa_python_aiohttp_server.models.confirm_prices_request import ConfirmPricesRequest
from ympa_python_aiohttp_server.models.create_chat_request import CreateChatRequest
from ympa_python_aiohttp_server.models.create_chat_response import CreateChatResponse
from ympa_python_aiohttp_server.models.create_outlet_response import CreateOutletResponse
from ympa_python_aiohttp_server.models.currency_type import CurrencyType
from ympa_python_aiohttp_server.models.delete_campaign_offers_request import DeleteCampaignOffersRequest
from ympa_python_aiohttp_server.models.delete_campaign_offers_response import DeleteCampaignOffersResponse
from ympa_python_aiohttp_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest
from ympa_python_aiohttp_server.models.delete_hidden_offers_request import DeleteHiddenOffersRequest
from ympa_python_aiohttp_server.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest
from ympa_python_aiohttp_server.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse
from ympa_python_aiohttp_server.models.delete_offers_request import DeleteOffersRequest
from ympa_python_aiohttp_server.models.delete_offers_response import DeleteOffersResponse
from ympa_python_aiohttp_server.models.delete_promo_offers_request import DeletePromoOffersRequest
from ympa_python_aiohttp_server.models.delete_promo_offers_response import DeletePromoOffersResponse
from ympa_python_aiohttp_server.models.empty_api_response import EmptyApiResponse
from ympa_python_aiohttp_server.models.feed_index_logs_status_type import FeedIndexLogsStatusType
from ympa_python_aiohttp_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest
from ympa_python_aiohttp_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest
from ympa_python_aiohttp_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest
from ympa_python_aiohttp_server.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest
from ympa_python_aiohttp_server.models.generate_prices_report_request import GeneratePricesReportRequest
from ympa_python_aiohttp_server.models.generate_report_response import GenerateReportResponse
from ympa_python_aiohttp_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest
from ympa_python_aiohttp_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest
from ympa_python_aiohttp_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest
from ympa_python_aiohttp_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest
from ympa_python_aiohttp_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest
from ympa_python_aiohttp_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest
from ympa_python_aiohttp_server.models.get_all_offers_response import GetAllOffersResponse
from ympa_python_aiohttp_server.models.get_bids_info_request import GetBidsInfoRequest
from ympa_python_aiohttp_server.models.get_bids_info_response import GetBidsInfoResponse
from ympa_python_aiohttp_server.models.get_bids_recommendations_request import GetBidsRecommendationsRequest
from ympa_python_aiohttp_server.models.get_bids_recommendations_response import GetBidsRecommendationsResponse
from ympa_python_aiohttp_server.models.get_business_buyer_info_response import GetBusinessBuyerInfoResponse
from ympa_python_aiohttp_server.models.get_business_documents_info_response import GetBusinessDocumentsInfoResponse
from ympa_python_aiohttp_server.models.get_business_settings_response import GetBusinessSettingsResponse
from ympa_python_aiohttp_server.models.get_campaign_logins_response import GetCampaignLoginsResponse
from ympa_python_aiohttp_server.models.get_campaign_offers_request import GetCampaignOffersRequest
from ympa_python_aiohttp_server.models.get_campaign_offers_response import GetCampaignOffersResponse
from ympa_python_aiohttp_server.models.get_campaign_region_response import GetCampaignRegionResponse
from ympa_python_aiohttp_server.models.get_campaign_response import GetCampaignResponse
from ympa_python_aiohttp_server.models.get_campaign_settings_response import GetCampaignSettingsResponse
from ympa_python_aiohttp_server.models.get_campaigns_response import GetCampaignsResponse
from ympa_python_aiohttp_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest
from ympa_python_aiohttp_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse
from ympa_python_aiohttp_server.models.get_categories_request import GetCategoriesRequest
from ympa_python_aiohttp_server.models.get_categories_response import GetCategoriesResponse
from ympa_python_aiohttp_server.models.get_category_content_parameters_response import GetCategoryContentParametersResponse
from ympa_python_aiohttp_server.models.get_chat_history_request import GetChatHistoryRequest
from ympa_python_aiohttp_server.models.get_chat_history_response import GetChatHistoryResponse
from ympa_python_aiohttp_server.models.get_chats_request import GetChatsRequest
from ympa_python_aiohttp_server.models.get_chats_response import GetChatsResponse
from ympa_python_aiohttp_server.models.get_delivery_services_response import GetDeliveryServicesResponse
from ympa_python_aiohttp_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse
from ympa_python_aiohttp_server.models.get_feed_response import GetFeedResponse
from ympa_python_aiohttp_server.models.get_feedback_list_response import GetFeedbackListResponse
from ympa_python_aiohttp_server.models.get_feeds_response import GetFeedsResponse
from ympa_python_aiohttp_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest
from ympa_python_aiohttp_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse
from ympa_python_aiohttp_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest
from ympa_python_aiohttp_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse
from ympa_python_aiohttp_server.models.get_goods_stats_request import GetGoodsStatsRequest
from ympa_python_aiohttp_server.models.get_goods_stats_response import GetGoodsStatsResponse
from ympa_python_aiohttp_server.models.get_hidden_offers_response import GetHiddenOffersResponse
from ympa_python_aiohttp_server.models.get_models_offers_response import GetModelsOffersResponse
from ympa_python_aiohttp_server.models.get_models_request import GetModelsRequest
from ympa_python_aiohttp_server.models.get_models_response import GetModelsResponse
from ympa_python_aiohttp_server.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest
from ympa_python_aiohttp_server.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse
from ympa_python_aiohttp_server.models.get_offer_mapping_entries_response import GetOfferMappingEntriesResponse
from ympa_python_aiohttp_server.models.get_offer_mappings_request import GetOfferMappingsRequest
from ympa_python_aiohttp_server.models.get_offer_mappings_response import GetOfferMappingsResponse
from ympa_python_aiohttp_server.models.get_offer_recommendations_request import GetOfferRecommendationsRequest
from ympa_python_aiohttp_server.models.get_offer_recommendations_response import GetOfferRecommendationsResponse
from ympa_python_aiohttp_server.models.get_offers_response import GetOffersResponse
from ympa_python_aiohttp_server.models.get_order_buyer_info_response import GetOrderBuyerInfoResponse
from ympa_python_aiohttp_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse
from ympa_python_aiohttp_server.models.get_order_response import GetOrderResponse
from ympa_python_aiohttp_server.models.get_orders_response import GetOrdersResponse
from ympa_python_aiohttp_server.models.get_orders_stats_request import GetOrdersStatsRequest
from ympa_python_aiohttp_server.models.get_orders_stats_response import GetOrdersStatsResponse
from ympa_python_aiohttp_server.models.get_outlet_licenses_response import GetOutletLicensesResponse
from ympa_python_aiohttp_server.models.get_outlet_response import GetOutletResponse
from ympa_python_aiohttp_server.models.get_outlets_response import GetOutletsResponse
from ympa_python_aiohttp_server.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest
from ympa_python_aiohttp_server.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse
from ympa_python_aiohttp_server.models.get_prices_response import GetPricesResponse
from ympa_python_aiohttp_server.models.get_promo_offers_request import GetPromoOffersRequest
from ympa_python_aiohttp_server.models.get_promo_offers_response import GetPromoOffersResponse
from ympa_python_aiohttp_server.models.get_promos_request import GetPromosRequest
from ympa_python_aiohttp_server.models.get_promos_response import GetPromosResponse
from ympa_python_aiohttp_server.models.get_quality_rating_details_response import GetQualityRatingDetailsResponse
from ympa_python_aiohttp_server.models.get_quality_rating_request import GetQualityRatingRequest
from ympa_python_aiohttp_server.models.get_quality_rating_response import GetQualityRatingResponse
from ympa_python_aiohttp_server.models.get_quarantine_offers_request import GetQuarantineOffersRequest
from ympa_python_aiohttp_server.models.get_quarantine_offers_response import GetQuarantineOffersResponse
from ympa_python_aiohttp_server.models.get_region_with_children_response import GetRegionWithChildrenResponse
from ympa_python_aiohttp_server.models.get_regions_response import GetRegionsResponse
from ympa_python_aiohttp_server.models.get_report_info_response import GetReportInfoResponse
from ympa_python_aiohttp_server.models.get_return_response import GetReturnResponse
from ympa_python_aiohttp_server.models.get_returns_response import GetReturnsResponse
from ympa_python_aiohttp_server.models.get_suggested_offer_mapping_entries_request import GetSuggestedOfferMappingEntriesRequest
from ympa_python_aiohttp_server.models.get_suggested_offer_mapping_entries_response import GetSuggestedOfferMappingEntriesResponse
from ympa_python_aiohttp_server.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest
from ympa_python_aiohttp_server.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse
from ympa_python_aiohttp_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest
from ympa_python_aiohttp_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse
from ympa_python_aiohttp_server.models.get_warehouses_response import GetWarehousesResponse
from ympa_python_aiohttp_server.models.offer_availability_status_type import OfferAvailabilityStatusType
from ympa_python_aiohttp_server.models.offer_mapping_kind_type import OfferMappingKindType
from ympa_python_aiohttp_server.models.offer_processing_status_type import OfferProcessingStatusType
from ympa_python_aiohttp_server.models.order_buyer_type import OrderBuyerType
from ympa_python_aiohttp_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType
from ympa_python_aiohttp_server.models.order_status_type import OrderStatusType
from ympa_python_aiohttp_server.models.order_substatus_type import OrderSubstatusType
from ympa_python_aiohttp_server.models.page_format_type import PageFormatType
from ympa_python_aiohttp_server.models.provide_order_digital_codes_request import ProvideOrderDigitalCodesRequest
from ympa_python_aiohttp_server.models.provide_order_item_identifiers_request import ProvideOrderItemIdentifiersRequest
from ympa_python_aiohttp_server.models.provide_order_item_identifiers_response import ProvideOrderItemIdentifiersResponse
from ympa_python_aiohttp_server.models.put_sku_bids_request import PutSkuBidsRequest
from ympa_python_aiohttp_server.models.refund_status_type import RefundStatusType
from ympa_python_aiohttp_server.models.report_format_type import ReportFormatType
from ympa_python_aiohttp_server.models.return_type import ReturnType
from ympa_python_aiohttp_server.models.search_models_response import SearchModelsResponse
from ympa_python_aiohttp_server.models.send_message_to_chat_request import SendMessageToChatRequest
from ympa_python_aiohttp_server.models.set_feed_params_request import SetFeedParamsRequest
from ympa_python_aiohttp_server.models.set_order_box_layout_request import SetOrderBoxLayoutRequest
from ympa_python_aiohttp_server.models.set_order_box_layout_response import SetOrderBoxLayoutResponse
from ympa_python_aiohttp_server.models.set_order_delivery_date_request import SetOrderDeliveryDateRequest
from ympa_python_aiohttp_server.models.set_order_delivery_track_code_request import SetOrderDeliveryTrackCodeRequest
from ympa_python_aiohttp_server.models.set_order_shipment_boxes_request import SetOrderShipmentBoxesRequest
from ympa_python_aiohttp_server.models.set_order_shipment_boxes_response import SetOrderShipmentBoxesResponse
from ympa_python_aiohttp_server.models.set_return_decision_request import SetReturnDecisionRequest
from ympa_python_aiohttp_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest
from ympa_python_aiohttp_server.models.sort_order_type import SortOrderType
from ympa_python_aiohttp_server.models.suggest_prices_request import SuggestPricesRequest
from ympa_python_aiohttp_server.models.suggest_prices_response import SuggestPricesResponse
from ympa_python_aiohttp_server.models.update_business_prices_request import UpdateBusinessPricesRequest
from ympa_python_aiohttp_server.models.update_campaign_offers_request import UpdateCampaignOffersRequest
from ympa_python_aiohttp_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest
from ympa_python_aiohttp_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse
from ympa_python_aiohttp_server.models.update_offer_content_request import UpdateOfferContentRequest
from ympa_python_aiohttp_server.models.update_offer_content_response import UpdateOfferContentResponse
from ympa_python_aiohttp_server.models.update_offer_mapping_entry_request import UpdateOfferMappingEntryRequest
from ympa_python_aiohttp_server.models.update_offer_mappings_request import UpdateOfferMappingsRequest
from ympa_python_aiohttp_server.models.update_offer_mappings_response import UpdateOfferMappingsResponse
from ympa_python_aiohttp_server.models.update_order_item_request import UpdateOrderItemRequest
from ympa_python_aiohttp_server.models.update_order_status_request import UpdateOrderStatusRequest
from ympa_python_aiohttp_server.models.update_order_status_response import UpdateOrderStatusResponse
from ympa_python_aiohttp_server.models.update_order_statuses_request import UpdateOrderStatusesRequest
from ympa_python_aiohttp_server.models.update_order_statuses_response import UpdateOrderStatusesResponse
from ympa_python_aiohttp_server.models.update_order_storage_limit_request import UpdateOrderStorageLimitRequest
from ympa_python_aiohttp_server.models.update_outlet_license_request import UpdateOutletLicenseRequest
from ympa_python_aiohttp_server.models.update_prices_request import UpdatePricesRequest
from ympa_python_aiohttp_server.models.update_promo_offers_request import UpdatePromoOffersRequest
from ympa_python_aiohttp_server.models.update_promo_offers_response import UpdatePromoOffersResponse
from ympa_python_aiohttp_server.models.update_stocks_request import UpdateStocksRequest


pytestmark = pytest.mark.asyncio

async def test_accept_order_cancellation(client):
    """Test case for accept_order_cancellation

    Отмена заказа покупателем
    """
    body = {"reason":"ORDER_DELIVERED","accepted":True}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/cancellation/accept'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_add_hidden_offers(client):
    """Test case for add_hidden_offers

    Скрытие товаров и настройки скрытия
    """
    body = {"hiddenOffers":[{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/hidden-offers'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_add_offers_to_archive(client):
    """Test case for add_offers_to_archive

    Добавление товаров в архив
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/archive'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_calculate_tariffs(client):
    """Test case for calculate_tariffs

    Калькулятор стоимости услуг
    """
    body = {"offers":[{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328}],"parameters":{"campaignId":0,"sellingProgram":"FBY","frequency":"DAILY"}}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/tariffs/calculate',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_confirm_business_prices(client):
    """Test case for confirm_business_prices

    Удаление товара из карантина по цене в кабинете
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/price-quarantine/confirm'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_confirm_campaign_prices(client):
    """Test case for confirm_campaign_prices

    Удаление товара из карантина по цене в магазине
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/price-quarantine/confirm'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_chat(client):
    """Test case for create_chat

    Создание нового чата с покупателем
    """
    body = {"orderId":0}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats/new'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_outlet(client):
    """Test case for create_outlet

    Создание точки продаж
    """
    body = {"storagePeriod":0,"address":{"number":"number","km":6,"regionId":0,"city":"city","street":"street","additional":"additional","estate":"estate","block":"block","building":"building"},"visibility":"HIDDEN","isMain":True,"shopOutletCode":"shopOutletCode","name":"name","phones":["phones","phones"],"type":"DEPOT","coords":"coords","workingSchedule":{"scheduleItems":[{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"},{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"}],"workInHoliday":True},"deliveryRules":[{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True},{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/outlets'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_campaign_offers(client):
    """Test case for delete_campaign_offers

    Удаление товаров из ассортимента магазина
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offers/delete'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_goods_feedback_comment(client):
    """Test case for delete_goods_feedback_comment

    Удаление комментария к отзыву
    """
    body = {"id":0}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/goods-feedback/comments/delete'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_hidden_offers(client):
    """Test case for delete_hidden_offers

    Возобновление показа товаров
    """
    body = {"hiddenOffers":[{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/hidden-offers/delete'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_offers(client):
    """Test case for delete_offers

    Удаление товаров из каталога
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/delete'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_offers_from_archive(client):
    """Test case for delete_offers_from_archive

    Удаление товаров из архива
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/unarchive'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_outlet(client):
    """Test case for delete_outlet

    Удаление точки продаж
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_outlet_licenses(client):
    """Test case for delete_outlet_licenses

    Удаление лицензий для точек продаж
    """
    params = [('ids', [56])]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_promo_offers(client):
    """Test case for delete_promo_offers

    Удаление товаров из акции
    """
    body = {"deleteAllOffers":True,"promoId":"promoId","offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/promos/offers/delete'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_boost_consolidated_report(client):
    """Test case for generate_boost_consolidated_report

    Отчет по бусту продаж
    """
    body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/boost-consolidated/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_competitors_position_report(client):
    """Test case for generate_competitors_position_report

    Отчет «Конкурентная позиция»
    """
    body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","categoryId":6}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/competitors-position/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_goods_feedback_report(client):
    """Test case for generate_goods_feedback_report

    Отчет по отзывам о товарах
    """
    body = {"businessId":0}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/goods-feedback/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_mass_order_labels_report(client):
    """Test case for generate_mass_order_labels_report

    Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    """
    body = {"businessId":0,"orderIds":[6,6,6,6,6]}
    params = [('format', ympa_python_aiohttp_server.PageFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/documents/labels/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_order_label(client):
    """Test case for generate_order_label

    Готовый ярлык‑наклейка для коробки в заказе
    """
    params = [('format', ympa_python_aiohttp_server.PageFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes/{box_id}/label'.format(campaign_id=56, order_id=56, shipment_id=56, box_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_order_labels(client):
    """Test case for generate_order_labels

    Готовые ярлыки‑наклейки на все коробки в одном заказе
    """
    params = [('format', ympa_python_aiohttp_server.PageFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/labels'.format(campaign_id=56, order_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_prices_report(client):
    """Test case for generate_prices_report

    Отчет «Цены на рынке»
    """
    body = {"categoryIds":[1,1],"creationDateTo":"2000-01-23","campaignId":6,"businessId":0,"creationDateFrom":"2000-01-23"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/prices/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_shelfs_statistics_report(client):
    """Test case for generate_shelfs_statistics_report

    Отчет по полкам
    """
    body = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","attributionType":"CLICKS"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/shelf-statistics/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_shows_sales_report(client):
    """Test case for generate_shows_sales_report

    Отчет «Аналитика продаж»
    """
    body = {"campaignId":6,"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","grouping":"CATEGORIES"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/shows-sales/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_stocks_on_warehouses_report(client):
    """Test case for generate_stocks_on_warehouses_report

    Отчет по остаткам на складах
    """
    body = {"categoryIds":[1,1],"hasStocks":True,"reportDate":"2000-01-23","campaignId":0,"warehouseIds":[6,6]}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/stocks-on-warehouses/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_united_marketplace_services_report(client):
    """Test case for generate_united_marketplace_services_report

    Отчет по стоимости услуг
    """
    body = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","yearFrom":6,"placementPrograms":["FBS","FBS"],"businessId":0,"dateTo":"2000-01-23","monthFrom":2,"dateTimeTo":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaignIds":[2,2],"dateFrom":"2000-01-23","monthTo":7,"yearTo":5}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/united-marketplace-services/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_united_netting_report(client):
    """Test case for generate_united_netting_report

    Отчет по платежам
    """
    body = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","bankOrderId":6,"placementPrograms":["FBS","FBS"],"businessId":0,"dateTo":"2000-01-23","dateTimeTo":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaignIds":[1,1],"dateFrom":"2000-01-23","bankOrderDateTime":"2000-01-23T04:56:07.000+00:00"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/united-netting/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_generate_united_orders_report(client):
    """Test case for generate_united_orders_report

    Отчет по заказам
    """
    body = {"businessId":0,"dateTo":"2000-01-23","campaignIds":[6,6],"promoId":"promoId","dateFrom":"2000-01-23"}
    params = [('format', ympa_python_aiohttp_server.ReportFormatType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/reports/united-orders/generate',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_all_offers(client):
    """Test case for get_all_offers

    Все предложения магазина
    """
    params = [('feedId', 56),
                    ('chunk', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/offers/all'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_bids_info_for_business(client):
    """Test case for get_bids_info_for_business

    Информация об установленных ставках
    """
    body = {"skus":[null,null,null,null,null]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/bids/info'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_bids_recommendations(client):
    """Test case for get_bids_recommendations

    Рекомендованные ставки для заданных товаров
    """
    body = {"skus":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/bids/recommendations'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_business_quarantine_offers(client):
    """Test case for get_business_quarantine_offers

    Список товаров, находящихся в карантине по цене в кабинете
    """
    body = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/price-quarantine'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_business_settings(client):
    """Test case for get_business_settings

    Настройки кабинета
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/settings'.format(business_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaign(client):
    """Test case for get_campaign

    Информация о магазине
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}'.format(campaign_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaign_logins(client):
    """Test case for get_campaign_logins

    Логины, связанные с магазином
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/logins'.format(campaign_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaign_offers(client):
    """Test case for get_campaign_offers

    Информация о товарах, которые размещены в заданном магазине
    """
    body = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"statuses":["PUBLISHED","PUBLISHED"],"offerIds":[null,null,null,null,null],"tags":["tags","tags"]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offers'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaign_quarantine_offers(client):
    """Test case for get_campaign_quarantine_offers

    Список товаров, находящихся в карантине по цене в магазине
    """
    body = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/price-quarantine'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaign_region(client):
    """Test case for get_campaign_region

    Регион магазина
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/region'.format(campaign_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaign_settings(client):
    """Test case for get_campaign_settings

    Настройки магазина
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/settings'.format(campaign_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaigns(client):
    """Test case for get_campaigns

    Список магазинов пользователя
    """
    params = [('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_campaigns_by_login(client):
    """Test case for get_campaigns_by_login

    Магазины, доступные логину
    """
    params = [('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/by_login/{login}'.format(login='login_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_categories_max_sale_quantum(client):
    """Test case for get_categories_max_sale_quantum

    Лимит на установку кванта продажи и минимального количества товаров в заказе
    """
    body = {"marketCategoryIds":[0,0,0,0,0]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/categories/max-sale-quantum',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_categories_tree(client):
    """Test case for get_categories_tree

    Дерево категорий
    """
    body = {"language":"RU"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/categories/tree',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_category_content_parameters(client):
    """Test case for get_category_content_parameters

    Списки характеристик товаров по категориям
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/category/{category_id}/parameters'.format(category_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_chat_history(client):
    """Test case for get_chat_history

    Получение истории сообщений в чате
    """
    body = {"messageIdFrom":0}
    params = [('chatId', 56),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats/history'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_chats(client):
    """Test case for get_chats

    Получение доступных чатов
    """
    body = {"types":["CHAT","CHAT"],"statuses":["NEW","NEW"],"orderIds":[0,0]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_delivery_services(client):
    """Test case for get_delivery_services

    Справочник служб доставки
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/delivery/services',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_feed(client):
    """Test case for get_feed

    Информация о прайс-листе
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/feeds/{feed_id}'.format(campaign_id=56, feed_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_feed_index_logs(client):
    """Test case for get_feed_index_logs

    Отчет по индексации прайс-листа
    """
    params = [('limit', 20),
                    ('published_time_from', '2013-10-20T19:20:30+01:00'),
                    ('published_time_to', '2013-10-20T19:20:30+01:00'),
                    ('status', ympa_python_aiohttp_server.FeedIndexLogsStatusType())]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/feeds/{feed_id}/index-logs'.format(campaign_id=56, feed_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_feedback_and_comment_updates(client):
    """Test case for get_feedback_and_comment_updates

    Новые и обновленные отзывы о магазине
    """
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20),
                    ('from_date', '2013-10-20')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/feedback/updates'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_feeds(client):
    """Test case for get_feeds

    Список прайс-листов магазина
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/feeds'.format(campaign_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_goods_feedback_comments(client):
    """Test case for get_goods_feedback_comments

    Получение комментариев к отзыву
    """
    body = {"feedbackId":0}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/goods-feedback/comments'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_goods_feedbacks(client):
    """Test case for get_goods_feedbacks

    Получение отзывов о товарах продавца
    """
    body = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","ratingValues":[0,0,0,0,0],"modelIds":[6,6,6,6,6],"paid":True,"reactionStatus":"ALL","dateTimeTo":"2000-01-23T04:56:07.000+00:00"}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/goods-feedback'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_goods_stats(client):
    """Test case for get_goods_stats

    Отчет по товарам
    """
    body = {"shopSkus":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/stats/skus'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_hidden_offers(client):
    """Test case for get_hidden_offers

    Информация о скрытых вами товарах
    """
    params = [('offer_id', ['offer_id_example']),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20),
                    ('offset', 56),
                    ('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/hidden-offers'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_model(client):
    """Test case for get_model

    Информация об одной модели
    """
    params = [('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType())]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/models/{model_id}'.format(model_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_model_offers(client):
    """Test case for get_model_offers

    Список предложений для одной модели
    """
    params = [('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType()),
                    ('orderByPrice', ympa_python_aiohttp_server.SortOrderType()),
                    ('count', 10),
                    ('page', 1)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/models/{model_id}/offers'.format(model_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_models(client):
    """Test case for get_models

    Информация о нескольких моделях
    """
    body = {"models":[0,0]}
    params = [('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/models',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_models_offers(client):
    """Test case for get_models_offers

    Список предложений для нескольких моделей
    """
    body = {"models":[0,0]}
    params = [('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType()),
                    ('orderByPrice', ympa_python_aiohttp_server.SortOrderType())]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/models/offers',
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_offer_cards_content_status(client):
    """Test case for get_offer_cards_content_status

    Получение информации о заполненности карточек магазина
    """
    body = {"categoryIds":[null,null,null,null,null],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-cards'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_offer_mapping_entries(client):
    """Test case for get_offer_mapping_entries

    Список товаров в каталоге
    """
    params = [('offer_id', ['offer_id_example']),
                    ('shop_sku', ['shop_sku_example']),
                    ('mapping_kind', ympa_python_aiohttp_server.OfferMappingKindType()),
                    ('status', [ympa_python_aiohttp_server.OfferProcessingStatusType()]),
                    ('availability', [ympa_python_aiohttp_server.OfferAvailabilityStatusType()]),
                    ('category_id', [56]),
                    ('vendor', ['vendor_example']),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/offer-mapping-entries'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_offer_mappings(client):
    """Test case for get_offer_mappings

    Информация о товарах в каталоге
    """
    body = {"archived":True,"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_offer_recommendations(client):
    """Test case for get_offer_recommendations

    Рекомендации Маркета, касающиеся цен
    """
    body = {"cofinancePriceFilter":"SPECIFIED","competitivenessFilter":"OPTIMAL","offerIds":[null,null]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offers/recommendations'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_offers(client):
    """Test case for get_offers

    Предложения магазина
    """
    params = [('query', 'query_example'),
                    ('feedId', 56),
                    ('shopCategoryId', 'shop_category_id_example'),
                    ('currency', ympa_python_aiohttp_server.CurrencyType()),
                    ('matched', True),
                    ('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/offers'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_order(client):
    """Test case for get_order

    Информация об одном заказе
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}'.format(campaign_id=56, order_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_order_business_buyer_info(client):
    """Test case for get_order_business_buyer_info

    Информация о покупателе — юридическом лице
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/business-buyer'.format(campaign_id=56, order_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_order_business_documents_info(client):
    """Test case for get_order_business_documents_info

    Информация о документах
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/documents'.format(campaign_id=56, order_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_order_buyer_info(client):
    """Test case for get_order_buyer_info

    Информация о покупателе — физическом лице
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/buyer'.format(campaign_id=56, order_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_order_labels_data(client):
    """Test case for get_order_labels_data

    Данные для самостоятельного изготовления ярлыков
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/labels/data'.format(campaign_id=56, order_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_orders(client):
    """Test case for get_orders

    Информация о нескольких заказах
    """
    params = [('orderIds', [56]),
                    ('status', [ympa_python_aiohttp_server.OrderStatusType()]),
                    ('substatus', [ympa_python_aiohttp_server.OrderSubstatusType()]),
                    ('fromDate', '2013-10-20'),
                    ('toDate', '2013-10-20'),
                    ('supplierShipmentDateFrom', '2013-10-20'),
                    ('supplierShipmentDateTo', '2013-10-20'),
                    ('updatedAtFrom', '2013-10-20T19:20:30+01:00'),
                    ('updatedAtTo', '2013-10-20T19:20:30+01:00'),
                    ('dispatchType', ympa_python_aiohttp_server.OrderDeliveryDispatchType()),
                    ('fake', False),
                    ('hasCis', False),
                    ('onlyWaitingForCancellationApprove', False),
                    ('onlyEstimatedDelivery', False),
                    ('buyerType', ympa_python_aiohttp_server.OrderBuyerType()),
                    ('page', 1),
                    ('pageSize', 56),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_orders_stats(client):
    """Test case for get_orders_stats

    Детальная информация по заказам
    """
    body = {"updateTo":"2000-01-23","updateFrom":"2000-01-23","hasCis":True,"dateTo":"2000-01-23","statuses":["CANCELLED_BEFORE_PROCESSING","CANCELLED_BEFORE_PROCESSING"],"orders":[0,0],"dateFrom":"2000-01-23"}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/stats/orders'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_outlet(client):
    """Test case for get_outlet

    Информация об одной точке продаж
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_outlet_licenses(client):
    """Test case for get_outlet_licenses

    Информация о лицензиях для точек продаж
    """
    params = [('outletIds', [56]),
                    ('ids', [56])]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_outlets(client):
    """Test case for get_outlets

    Информация о нескольких точках продаж
    """
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('region_id', 56),
                    ('shop_outlet_code', 'shop_outlet_code_example'),
                    ('regionId', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/outlets'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_prices(client):
    """Test case for get_prices

    Список цен
    """
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20),
                    ('archived', False)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/offer-prices'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_prices_by_offer_ids(client):
    """Test case for get_prices_by_offer_ids

    Просмотр цен на указанные товары в магазине
    """
    body = {"offerIds":[null,null,null,null,null]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-prices'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_promo_offers(client):
    """Test case for get_promo_offers

    Получение списка товаров, которые участвуют или могут участвовать в акции
    """
    body = {"statusType":"MANUALLY_ADDED","promoId":"promoId"}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/promos/offers'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_promos(client):
    """Test case for get_promos

    Получение списка акций
    """
    body = {"participation":"PARTICIPATING_NOW","mechanics":"DIRECT_DISCOUNT"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/promos'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_quality_rating_details(client):
    """Test case for get_quality_rating_details

    Заказы, которые повлияли на индекс качества
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/ratings/quality/details'.format(campaign_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_quality_ratings(client):
    """Test case for get_quality_ratings

    Индекс качества магазинов
    """
    body = {"dateTo":"2000-01-23","campaignIds":[0,0,0,0,0],"dateFrom":"2000-01-23"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/ratings/quality'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_report_info(client):
    """Test case for get_report_info

    Получение заданного отчета
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/reports/info/{report_id}'.format(report_id='report_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_return(client):
    """Test case for get_return

    Информация о невыкупе или возврате
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}'.format(campaign_id=56, order_id=56, return_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_return_application(client):
    """Test case for get_return_application

    Получение заявления на возврат
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/application'.format(campaign_id=56, order_id=56, return_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_return_photo(client):
    """Test case for get_return_photo

    Получение фотографии возврата
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/{item_id}/image/{image_hash}'.format(campaign_id=56, order_id=56, return_id=56, item_id=56, image_hash='image_hash_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_returns(client):
    """Test case for get_returns

    Список невыкупов и возвратов
    """
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20),
                    ('orderIds', [56]),
                    ('statuses', [ympa_python_aiohttp_server.RefundStatusType()]),
                    ('type', ympa_python_aiohttp_server.ReturnType()),
                    ('fromDate', '2022-10-31'),
                    ('toDate', '2022-11-30'),
                    ('from_date2', '2022-10-31'),
                    ('to_date2', '2022-11-30')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/campaigns/{campaign_id}/returns'.format(campaign_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_stocks(client):
    """Test case for get_stocks

    Информация об остатках и оборачиваемости
    """
    body = {"archived":True,"withTurnover":False,"offerIds":[null,null,null,null,null]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offers/stocks'.format(campaign_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_suggested_offer_mapping_entries(client):
    """Test case for get_suggested_offer_mapping_entries

    Рекомендованные карточки для товаров
    """
    body = {"offers":[{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-mapping-entries/suggestions'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_suggested_offer_mappings(client):
    """Test case for get_suggested_offer_mappings

    Просмотр карточек на Маркете, которые подходят вашим товарам
    """
    body = {"offers":[{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/suggestions'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_suggested_prices(client):
    """Test case for get_suggested_prices

    Цены для продвижения товаров
    """
    body = {"offers":[{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-prices/suggestions'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_warehouses(client):
    """Test case for get_warehouses

    Список складов и групп складов
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/businesses/{business_id}/warehouses'.format(business_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_provide_order_digital_codes(client):
    """Test case for provide_order_digital_codes

    Передача ключей цифровых товаров
    """
    body = {"items":[{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0},{"activate_till":"2000-01-23","code":"code","slip":"slip","id":0}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/deliverDigitalGoods'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_provide_order_item_identifiers(client):
    """Test case for provide_order_item_identifiers

    Передача кодов маркировки единиц товара
    """
    body = {"items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/identifiers'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_put_bids_for_business(client):
    """Test case for put_bids_for_business

    Включение буста продаж и установка ставок
    """
    body = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/businesses/{business_id}/bids'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_put_bids_for_campaign(client):
    """Test case for put_bids_for_campaign

    Включение буста продаж и установка ставок для магазина
    """
    body = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/bids'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_refresh_feed(client):
    """Test case for refresh_feed

    Сообщить, что прайс-лист обновился
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/feeds/{feed_id}/refresh'.format(campaign_id=56, feed_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_search_models(client):
    """Test case for search_models

    Поиск модели товара
    """
    params = [('query', 'query_example'),
                    ('regionId', 56),
                    ('currency', ympa_python_aiohttp_server.CurrencyType()),
                    ('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/models',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_search_region_children(client):
    """Test case for search_region_children

    Информация о дочерних регионах
    """
    params = [('page', 1),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/regions/{region_id}/children'.format(region_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_search_regions_by_id(client):
    """Test case for search_regions_by_id

    Информация о регионе
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/regions/{region_id}'.format(region_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_search_regions_by_name(client):
    """Test case for search_regions_by_name

    Поиск регионов по их имени
    """
    params = [('name', 'name_example'),
                    ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/regions',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_send_file_to_chat(client):
    """Test case for send_file_to_chat

    Отправка файла в чат
    """
    params = [('chatId', 56)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'Bearer special-key',
    }
    data = FormData()
    data.add_field('file', '/path/to/file')
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats/file/send'.format(business_id=56),
        headers=headers,
        data=data,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_send_message_to_chat(client):
    """Test case for send_message_to_chat

    Отправка сообщения в чат
    """
    body = {"message":"message"}
    params = [('chatId', 56)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/chats/message'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_feed_params(client):
    """Test case for set_feed_params

    Изменение параметров прайс-листа
    """
    body = {"parameters":[{"deleted":True,"values":[0,0],"name":"name"},{"deleted":True,"values":[0,0],"name":"name"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/feeds/{feed_id}/params'.format(campaign_id=56, feed_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_order_box_layout(client):
    """Test case for set_order_box_layout

    Подготовка заказа
    """
    body = {"boxes":[{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]},{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]}],"allowRemove":False}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/boxes'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_order_delivery_date(client):
    """Test case for set_order_delivery_date

    Изменение даты доставки заказа
    """
    body = {"reason":"USER_MOVED_DELIVERY_DATES","dates":{"toDate":"2000-01-23"}}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/date'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_order_delivery_track_code(client):
    """Test case for set_order_delivery_track_code

    Передача трек‑номера посылки
    """
    body = {"trackCode":"trackCode","deliveryServiceId":0}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/track'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_order_shipment_boxes(client):
    """Test case for set_order_shipment_boxes

    Передача количества грузовых мест в заказе
    """
    body = {"boxes":[{"fulfilmentId":"fulfilmentId","id":0},{"fulfilmentId":"fulfilmentId","id":0}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes'.format(campaign_id=56, order_id=56, shipment_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_set_return_decision(client):
    """Test case for set_return_decision

    Принятие или изменение решения по возврату
    """
    body = {"returnItemId":1,"decisionType":"REFUND_MONEY_INCLUDING_SHIPMENT","comment":"Вернуть 149 рублей за пересылку"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision'.format(campaign_id=56, order_id=56, return_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_skip_goods_feedbacks_reaction(client):
    """Test case for skip_goods_feedbacks_reaction

    Отказ от ответа на отзывы
    """
    body = {"feedbackIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/goods-feedback/skip-reaction'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_submit_return_decision(client):
    """Test case for submit_return_decision

    Подтверждение решения по возврату
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/submit'.format(campaign_id=56, order_id=56, return_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_business_prices(client):
    """Test case for update_business_prices

    Установка цен на товары во всех магазинах
    """
    body = {"offers":[{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-prices/updates'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_campaign_offers(client):
    """Test case for update_campaign_offers

    Изменение условий продажи товаров в магазине
    """
    body = {"offers":[{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offers/update'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_goods_feedback_comment(client):
    """Test case for update_goods_feedback_comment

    Добавление нового или изменение созданного комментария
    """
    body = {"feedbackId":0,"comment":{"id":6,"text":"text","parentId":1}}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/goods-feedback/comments/update'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_offer_content(client):
    """Test case for update_offer_content

    Редактирование категорийных характеристик товара
    """
    body = {"offersContent":[{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-cards/update'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_offer_mapping_entries(client):
    """Test case for update_offer_mapping_entries

    Добавление и редактирование товаров в каталоге
    """
    body = {"offerMappingEntries":[{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-mapping-entries/updates'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_offer_mappings(client):
    """Test case for update_offer_mappings

    Добавление товаров в каталог и изменение информации о них
    """
    body = {"offerMappings":[{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}}],"onlyPartnerMediaContent":True}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/update'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_order_items(client):
    """Test case for update_order_items

    Удаление товара из заказа или уменьшение числа единиц
    """
    body = {"reason":"PARTNER_REQUESTED_REMOVE","items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/items'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_order_status(client):
    """Test case for update_order_status

    Изменение статуса одного заказа
    """
    body = {"order":{"delivery":{"dates":{"realDeliveryDate":"2000-01-23"}},"substatus":"RESERVATION_EXPIRED","status":"PLACING"}}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/status'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_order_statuses(client):
    """Test case for update_order_statuses

    Изменение статусов нескольких заказов
    """
    body = {"orders":[{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/orders/status-update'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_order_storage_limit(client):
    """Test case for update_order_storage_limit

    Продление срока хранения заказа
    """
    body = {"newDate":"2000-01-23"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/orders/{order_id}/delivery/storage-limit'.format(campaign_id=56, order_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_outlet(client):
    """Test case for update_outlet

    Изменение информации о точке продаж
    """
    body = {"storagePeriod":0,"address":{"number":"number","km":6,"regionId":0,"city":"city","street":"street","additional":"additional","estate":"estate","block":"block","building":"building"},"visibility":"HIDDEN","isMain":True,"shopOutletCode":"shopOutletCode","name":"name","phones":["phones","phones"],"type":"DEPOT","coords":"coords","workingSchedule":{"scheduleItems":[{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"},{"startDay":"MONDAY","startTime":"startTime","endTime":"endTime"}],"workInHoliday":True},"deliveryRules":[{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True},{"priceFreePickup":7.061401241503109,"deliveryServiceId":5,"maxDeliveryDays":5,"minDeliveryDays":1,"orderBefore":5,"unspecifiedDeliveryInterval":True}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/outlets/{outlet_id}'.format(campaign_id=56, outlet_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_outlet_licenses(client):
    """Test case for update_outlet_licenses

    Создание и изменение лицензий для точек продаж
    """
    body = {"licenses":[{"licenseType":"ALCOHOL","number":"number","dateOfExpiry":"2000-01-23T04:56:07.000+00:00","outletId":6,"id":0,"dateOfIssue":"2000-01-23T04:56:07.000+00:00"},{"licenseType":"ALCOHOL","number":"number","dateOfExpiry":"2000-01-23T04:56:07.000+00:00","outletId":6,"id":0,"dateOfIssue":"2000-01-23T04:56:07.000+00:00"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/outlets/licenses'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_prices(client):
    """Test case for update_prices

    Установка цен на товары в конкретном магазине
    """
    body = {"offers":[{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/campaigns/{campaign_id}/offer-prices/updates'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_promo_offers(client):
    """Test case for update_promo_offers

    Добавление товаров в акцию или изменение их цен
    """
    body = {"offers":[{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}}],"promoId":"promoId"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/promos/offers/update'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_stocks(client):
    """Test case for update_stocks

    Передача информации об остатках
    """
    body = {"skus":[{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/campaigns/{campaign_id}/offers/stocks'.format(campaign_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

