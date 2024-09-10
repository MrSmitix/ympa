# coding: utf-8

from fastapi.testclient import TestClient


from ympa_python_fastapi_server.models.add_hidden_offers_request import AddHiddenOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.add_offers_to_archive_request import AddOffersToArchiveRequest  # noqa: F401
from ympa_python_fastapi_server.models.add_offers_to_archive_response import AddOffersToArchiveResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: F401
from ympa_python_fastapi_server.models.calculate_tariffs_request import CalculateTariffsRequest  # noqa: F401
from ympa_python_fastapi_server.models.calculate_tariffs_response import CalculateTariffsResponse  # noqa: F401
from ympa_python_fastapi_server.models.confirm_prices_request import ConfirmPricesRequest  # noqa: F401
from ympa_python_fastapi_server.models.confirm_shipment_request import ConfirmShipmentRequest  # noqa: F401
from ympa_python_fastapi_server.models.create_chat_request import CreateChatRequest  # noqa: F401
from ympa_python_fastapi_server.models.create_chat_response import CreateChatResponse  # noqa: F401
from ympa_python_fastapi_server.models.currency_type import CurrencyType  # noqa: F401
from ympa_python_fastapi_server.models.delete_campaign_offers_request import DeleteCampaignOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_campaign_offers_response import DeleteCampaignOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_hidden_offers_request import DeleteHiddenOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse  # noqa: F401
from ympa_python_fastapi_server.models.delete_offers_request import DeleteOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_offers_response import DeleteOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.delete_promo_offers_request import DeletePromoOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.delete_promo_offers_response import DeletePromoOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.empty_api_response import EmptyApiResponse  # noqa: F401
from ympa_python_fastapi_server.models.feed_index_logs_status_type import FeedIndexLogsStatusType  # noqa: F401
from ympa_python_fastapi_server.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_prices_report_request import GeneratePricesReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_report_response import GenerateReportResponse  # noqa: F401
from ympa_python_fastapi_server.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_shipment_list_document_report_request import GenerateShipmentListDocumentReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest  # noqa: F401
from ympa_python_fastapi_server.models.generate_united_orders_request import GenerateUnitedOrdersRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_all_offers_response import GetAllOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_bids_info_request import GetBidsInfoRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_bids_info_response import GetBidsInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_bids_recommendations_request import GetBidsRecommendationsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_bids_recommendations_response import GetBidsRecommendationsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_business_buyer_info_response import GetBusinessBuyerInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_business_documents_info_response import GetBusinessDocumentsInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_business_settings_response import GetBusinessSettingsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_logins_response import GetCampaignLoginsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_offers_request import GetCampaignOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_offers_response import GetCampaignOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_region_response import GetCampaignRegionResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_response import GetCampaignResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaign_settings_response import GetCampaignSettingsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_campaigns_response import GetCampaignsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_categories_request import GetCategoriesRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_categories_response import GetCategoriesResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_category_content_parameters_response import GetCategoryContentParametersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_chat_history_request import GetChatHistoryRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_chat_history_response import GetChatHistoryResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_chats_request import GetChatsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_chats_response import GetChatsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_delivery_services_response import GetDeliveryServicesResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_feed_response import GetFeedResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_feedback_list_response import GetFeedbackListResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_feeds_response import GetFeedsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_feedback_request import GetGoodsFeedbackRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_feedback_response import GetGoodsFeedbackResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_stats_request import GetGoodsStatsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_goods_stats_response import GetGoodsStatsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_hidden_offers_response import GetHiddenOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_mapping_entries_response import GetOfferMappingEntriesResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_mappings_request import GetOfferMappingsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_mappings_response import GetOfferMappingsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_recommendations_request import GetOfferRecommendationsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_offer_recommendations_response import GetOfferRecommendationsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_offers_response import GetOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_order_response import GetOrderResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_orders_response import GetOrdersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_orders_stats_request import GetOrdersStatsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_orders_stats_response import GetOrdersStatsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_prices_by_offer_ids_response import GetPricesByOfferIdsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_prices_response import GetPricesResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_promo_offers_request import GetPromoOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_promo_offers_response import GetPromoOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_promos_request import GetPromosRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_promos_response import GetPromosResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_quality_rating_details_response import GetQualityRatingDetailsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_quality_rating_request import GetQualityRatingRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_quality_rating_response import GetQualityRatingResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_quarantine_offers_request import GetQuarantineOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_quarantine_offers_response import GetQuarantineOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_region_with_children_response import GetRegionWithChildrenResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_regions_response import GetRegionsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_report_info_response import GetReportInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_return_response import GetReturnResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_returns_response import GetReturnsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_shipment_orders_info_response import GetShipmentOrdersInfoResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_shipment_response import GetShipmentResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_suggested_offer_mapping_entries_request import GetSuggestedOfferMappingEntriesRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_suggested_offer_mapping_entries_response import GetSuggestedOfferMappingEntriesResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest  # noqa: F401
from ympa_python_fastapi_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse  # noqa: F401
from ympa_python_fastapi_server.models.get_warehouses_response import GetWarehousesResponse  # noqa: F401
from ympa_python_fastapi_server.models.offer_availability_status_type import OfferAvailabilityStatusType  # noqa: F401
from ympa_python_fastapi_server.models.offer_mapping_kind_type import OfferMappingKindType  # noqa: F401
from ympa_python_fastapi_server.models.offer_processing_status_type import OfferProcessingStatusType  # noqa: F401
from ympa_python_fastapi_server.models.order_buyer_type import OrderBuyerType  # noqa: F401
from ympa_python_fastapi_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType  # noqa: F401
from ympa_python_fastapi_server.models.order_status_type import OrderStatusType  # noqa: F401
from ympa_python_fastapi_server.models.order_substatus_type import OrderSubstatusType  # noqa: F401
from ympa_python_fastapi_server.models.page_format_type import PageFormatType  # noqa: F401
from ympa_python_fastapi_server.models.provide_order_item_identifiers_request import ProvideOrderItemIdentifiersRequest  # noqa: F401
from ympa_python_fastapi_server.models.provide_order_item_identifiers_response import ProvideOrderItemIdentifiersResponse  # noqa: F401
from ympa_python_fastapi_server.models.put_sku_bids_request import PutSkuBidsRequest  # noqa: F401
from ympa_python_fastapi_server.models.refund_status_type import RefundStatusType  # noqa: F401
from ympa_python_fastapi_server.models.report_format_type import ReportFormatType  # noqa: F401
from ympa_python_fastapi_server.models.return_type import ReturnType  # noqa: F401
from ympa_python_fastapi_server.models.search_shipments_request import SearchShipmentsRequest  # noqa: F401
from ympa_python_fastapi_server.models.search_shipments_response import SearchShipmentsResponse  # noqa: F401
from ympa_python_fastapi_server.models.send_message_to_chat_request import SendMessageToChatRequest  # noqa: F401
from ympa_python_fastapi_server.models.set_feed_params_request import SetFeedParamsRequest  # noqa: F401
from ympa_python_fastapi_server.models.set_order_box_layout_request import SetOrderBoxLayoutRequest  # noqa: F401
from ympa_python_fastapi_server.models.set_order_box_layout_response import SetOrderBoxLayoutResponse  # noqa: F401
from ympa_python_fastapi_server.models.set_order_shipment_boxes_request import SetOrderShipmentBoxesRequest  # noqa: F401
from ympa_python_fastapi_server.models.set_order_shipment_boxes_response import SetOrderShipmentBoxesResponse  # noqa: F401
from ympa_python_fastapi_server.models.set_shipment_pallets_count_request import SetShipmentPalletsCountRequest  # noqa: F401
from ympa_python_fastapi_server.models.shipment_pallet_label_page_format_type import ShipmentPalletLabelPageFormatType  # noqa: F401
from ympa_python_fastapi_server.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest  # noqa: F401
from ympa_python_fastapi_server.models.suggest_prices_request import SuggestPricesRequest  # noqa: F401
from ympa_python_fastapi_server.models.suggest_prices_response import SuggestPricesResponse  # noqa: F401
from ympa_python_fastapi_server.models.transfer_orders_from_shipment_request import TransferOrdersFromShipmentRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_business_prices_request import UpdateBusinessPricesRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_campaign_offers_request import UpdateCampaignOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_content_request import UpdateOfferContentRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_content_response import UpdateOfferContentResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_mapping_entry_request import UpdateOfferMappingEntryRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_mappings_request import UpdateOfferMappingsRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_offer_mappings_response import UpdateOfferMappingsResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_order_item_request import UpdateOrderItemRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_order_status_request import UpdateOrderStatusRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_order_status_response import UpdateOrderStatusResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_order_statuses_request import UpdateOrderStatusesRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_order_statuses_response import UpdateOrderStatusesResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_prices_request import UpdatePricesRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_promo_offers_request import UpdatePromoOffersRequest  # noqa: F401
from ympa_python_fastapi_server.models.update_promo_offers_response import UpdatePromoOffersResponse  # noqa: F401
from ympa_python_fastapi_server.models.update_stocks_request import UpdateStocksRequest  # noqa: F401


def test_add_hidden_offers(client: TestClient):
    """Test case for add_hidden_offers

    Скрытие товаров и настройки скрытия
    """
    add_hidden_offers_request = {"hidden_offers":[{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/hidden-offers".format(campaignId=56),
    #    headers=headers,
    #    json=add_hidden_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_add_offers_to_archive(client: TestClient):
    """Test case for add_offers_to_archive

    Добавление товаров в архив
    """
    add_offers_to_archive_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/archive".format(businessId=56),
    #    headers=headers,
    #    json=add_offers_to_archive_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_calculate_tariffs(client: TestClient):
    """Test case for calculate_tariffs

    Калькулятор стоимости услуг
    """
    calculate_tariffs_request = {"offers":[{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"category_id":0,"height":0.5637376656633328}],"parameters":{"campaign_id":0,"selling_program":"FBY","frequency":"DAILY"}}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/tariffs/calculate",
    #    headers=headers,
    #    json=calculate_tariffs_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_confirm_business_prices(client: TestClient):
    """Test case for confirm_business_prices

    Удаление товара из карантина по цене в кабинете
    """
    confirm_prices_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/price-quarantine/confirm".format(businessId=56),
    #    headers=headers,
    #    json=confirm_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_confirm_campaign_prices(client: TestClient):
    """Test case for confirm_campaign_prices

    Удаление товара из карантина по цене в магазине
    """
    confirm_prices_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/price-quarantine/confirm".format(campaignId=56),
    #    headers=headers,
    #    json=confirm_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_confirm_shipment(client: TestClient):
    """Test case for confirm_shipment

    Подтверждение отгрузки
    """
    confirm_shipment_request = {"external_shipment_id":"externalShipmentId"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    json=confirm_shipment_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_chat(client: TestClient):
    """Test case for create_chat

    Создание нового чата с покупателем
    """
    create_chat_request = {"order_id":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats/new".format(businessId=56),
    #    headers=headers,
    #    json=create_chat_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_campaign_offers(client: TestClient):
    """Test case for delete_campaign_offers

    Удаление товаров из ассортимента магазина
    """
    delete_campaign_offers_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offers/delete".format(campaignId=56),
    #    headers=headers,
    #    json=delete_campaign_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_goods_feedback_comment(client: TestClient):
    """Test case for delete_goods_feedback_comment

    Удаление комментария к отзыву
    """
    delete_goods_feedback_comment_request = {"id":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback/comments/delete".format(businessId=56),
    #    headers=headers,
    #    json=delete_goods_feedback_comment_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_hidden_offers(client: TestClient):
    """Test case for delete_hidden_offers

    Возобновление показа товаров
    """
    delete_hidden_offers_request = {"hidden_offers":[{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"},{"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/hidden-offers/delete".format(campaignId=56),
    #    headers=headers,
    #    json=delete_hidden_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_offers(client: TestClient):
    """Test case for delete_offers

    Удаление товаров из каталога
    """
    delete_offers_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/delete".format(businessId=56),
    #    headers=headers,
    #    json=delete_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_offers_from_archive(client: TestClient):
    """Test case for delete_offers_from_archive

    Удаление товаров из архива
    """
    delete_offers_from_archive_request = {"offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/unarchive".format(businessId=56),
    #    headers=headers,
    #    json=delete_offers_from_archive_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_promo_offers(client: TestClient):
    """Test case for delete_promo_offers

    Удаление товаров из акции
    """
    delete_promo_offers_request = {"delete_all_offers":1,"promo_id":"promoId","offer_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/promos/offers/delete".format(businessId=56),
    #    headers=headers,
    #    json=delete_promo_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_act(client: TestClient):
    """Test case for download_shipment_act

    Получение акта приема-передачи
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_discrepancy_act(client: TestClient):
    """Test case for download_shipment_discrepancy_act

    Получение акта расхождений
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_inbound_act(client: TestClient):
    """Test case for download_shipment_inbound_act

    Получение фактического акта приема-передачи
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_pallet_labels(client: TestClient):
    """Test case for download_shipment_pallet_labels

    Ярлыки для доверительной приемки (FBS)
    """
    params = [("format", A8)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_reception_transfer_act(client: TestClient):
    """Test case for download_shipment_reception_transfer_act

    Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    """
    params = [("warehouse_id", 123123)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/shipments/reception-transfer-act".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_shipment_transportation_waybill(client: TestClient):
    """Test case for download_shipment_transportation_waybill

    Получение транспортной накладной
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_boost_consolidated_report(client: TestClient):
    """Test case for generate_boost_consolidated_report

    Отчет по бусту продаж
    """
    generate_boost_consolidated_request = {"business_id":0,"date_to":"2000-01-23","date_from":"2000-01-23"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/boost-consolidated/generate",
    #    headers=headers,
    #    json=generate_boost_consolidated_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_competitors_position_report(client: TestClient):
    """Test case for generate_competitors_position_report

    Отчет «Конкурентная позиция»
    """
    generate_competitors_position_report_request = {"business_id":0,"date_to":"2000-01-23","date_from":"2000-01-23","category_id":6}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/competitors-position/generate",
    #    headers=headers,
    #    json=generate_competitors_position_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_goods_feedback_report(client: TestClient):
    """Test case for generate_goods_feedback_report

    Отчет по отзывам о товарах
    """
    generate_goods_feedback_request = {"business_id":0}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/goods-feedback/generate",
    #    headers=headers,
    #    json=generate_goods_feedback_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_goods_realization_report(client: TestClient):
    """Test case for generate_goods_realization_report

    Отчет по реализации
    """
    generate_goods_realization_report_request = {"month":2,"year":6,"campaign_id":0}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/goods-realization/generate",
    #    headers=headers,
    #    json=generate_goods_realization_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_mass_order_labels_report(client: TestClient):
    """Test case for generate_mass_order_labels_report

    Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    """
    generate_mass_order_labels_request = {"business_id":0,"order_ids":[6,6,6,6,6]}
    params = [("format", ympa_python_fastapi_server.PageFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/documents/labels/generate",
    #    headers=headers,
    #    json=generate_mass_order_labels_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_order_label(client: TestClient):
    """Test case for generate_order_label

    Готовый ярлык‑наклейка для коробки в заказе
    """
    params = [("format", ympa_python_fastapi_server.PageFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".format(campaignId=56, orderId=56, shipmentId=56, boxId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_order_labels(client: TestClient):
    """Test case for generate_order_labels

    Готовые ярлыки‑наклейки на все коробки в одном заказе
    """
    params = [("format", ympa_python_fastapi_server.PageFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_prices_report(client: TestClient):
    """Test case for generate_prices_report

    Отчет «Цены на рынке»
    """
    generate_prices_report_request = {"category_ids":[1,1],"creation_date_to":"2000-01-23","campaign_id":6,"business_id":0,"creation_date_from":"2000-01-23"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/prices/generate",
    #    headers=headers,
    #    json=generate_prices_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_shelfs_statistics_report(client: TestClient):
    """Test case for generate_shelfs_statistics_report

    Отчет по полкам
    """
    generate_shelfs_statistics_request = {"business_id":0,"date_to":"2000-01-23","date_from":"2000-01-23","attribution_type":"CLICKS"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/shelf-statistics/generate",
    #    headers=headers,
    #    json=generate_shelfs_statistics_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_shipment_list_document_report(client: TestClient):
    """Test case for generate_shipment_list_document_report

    Получение листа сборки
    """
    generate_shipment_list_document_report_request = {"campaign_id":0,"shipment_id":6,"order_ids":[1,1]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/documents/shipment-list/generate",
    #    headers=headers,
    #    json=generate_shipment_list_document_report_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_shows_sales_report(client: TestClient):
    """Test case for generate_shows_sales_report

    Отчет «Аналитика продаж»
    """
    generate_shows_sales_report_request = {"campaign_id":6,"business_id":0,"date_to":"2000-01-23","date_from":"2000-01-23","grouping":"CATEGORIES"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/shows-sales/generate",
    #    headers=headers,
    #    json=generate_shows_sales_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_stocks_on_warehouses_report(client: TestClient):
    """Test case for generate_stocks_on_warehouses_report

    Отчет по остаткам на складах
    """
    generate_stocks_on_warehouses_report_request = {"category_ids":[1,1],"has_stocks":1,"report_date":"2000-01-23","campaign_id":0,"warehouse_ids":[6,6]}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/stocks-on-warehouses/generate",
    #    headers=headers,
    #    json=generate_stocks_on_warehouses_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_united_marketplace_services_report(client: TestClient):
    """Test case for generate_united_marketplace_services_report

    Отчет по стоимости услуг
    """
    generate_united_marketplace_services_report_request = {"date_time_from":"2000-01-23T04:56:07.000+00:00","year_from":6,"placement_programs":["FBS","FBS"],"business_id":0,"date_to":"2000-01-23","month_from":2,"date_time_to":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaign_ids":[2,2],"date_from":"2000-01-23","month_to":7,"year_to":5}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/united-marketplace-services/generate",
    #    headers=headers,
    #    json=generate_united_marketplace_services_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_united_netting_report(client: TestClient):
    """Test case for generate_united_netting_report

    Отчет по платежам
    """
    generate_united_netting_report_request = {"date_time_from":"2000-01-23T04:56:07.000+00:00","bank_order_id":6,"placement_programs":["FBS","FBS"],"business_id":0,"date_to":"2000-01-23","date_time_to":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaign_ids":[1,1],"date_from":"2000-01-23","bank_order_date_time":"2000-01-23T04:56:07.000+00:00"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/united-netting/generate",
    #    headers=headers,
    #    json=generate_united_netting_report_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_generate_united_orders_report(client: TestClient):
    """Test case for generate_united_orders_report

    Отчет по заказам
    """
    generate_united_orders_request = {"business_id":0,"date_to":"2000-01-23","campaign_ids":[6,6],"promo_id":"promoId","date_from":"2000-01-23"}
    params = [("format", ympa_python_fastapi_server.ReportFormatType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/reports/united-orders/generate",
    #    headers=headers,
    #    json=generate_united_orders_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_all_offers(client: TestClient):
    """Test case for get_all_offers

    Все предложения магазина
    """
    params = [("feed_id", 56),     ("chunk", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/offers/all".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_bids_info_for_business(client: TestClient):
    """Test case for get_bids_info_for_business

    Информация об установленных ставках
    """
    get_bids_info_request = {"skus":[null,null,null,null,null]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/bids/info".format(businessId=56),
    #    headers=headers,
    #    json=get_bids_info_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_bids_recommendations(client: TestClient):
    """Test case for get_bids_recommendations

    Рекомендованные ставки для заданных товаров
    """
    get_bids_recommendations_request = {"skus":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/bids/recommendations".format(businessId=56),
    #    headers=headers,
    #    json=get_bids_recommendations_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_business_quarantine_offers(client: TestClient):
    """Test case for get_business_quarantine_offers

    Список товаров, находящихся в карантине по цене в кабинете
    """
    get_quarantine_offers_request = {"category_ids":[0,0],"vendor_names":["vendorNames","vendorNames"],"offer_ids":[null,null,null,null,null],"card_statuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/price-quarantine".format(businessId=56),
    #    headers=headers,
    #    json=get_quarantine_offers_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_business_settings(client: TestClient):
    """Test case for get_business_settings

    Настройки кабинета
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/settings".format(businessId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign(client: TestClient):
    """Test case for get_campaign

    Информация о магазине
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_logins(client: TestClient):
    """Test case for get_campaign_logins

    Логины, связанные с магазином
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/logins".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_offers(client: TestClient):
    """Test case for get_campaign_offers

    Информация о товарах, которые размещены в заданном магазине
    """
    get_campaign_offers_request = {"category_ids":[0,0],"vendor_names":["vendorNames","vendorNames"],"statuses":["PUBLISHED","PUBLISHED"],"offer_ids":[null,null,null,null,null],"tags":["tags","tags"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offers".format(campaignId=56),
    #    headers=headers,
    #    json=get_campaign_offers_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_quarantine_offers(client: TestClient):
    """Test case for get_campaign_quarantine_offers

    Список товаров, находящихся в карантине по цене в магазине
    """
    get_quarantine_offers_request = {"category_ids":[0,0],"vendor_names":["vendorNames","vendorNames"],"offer_ids":[null,null,null,null,null],"card_statuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/price-quarantine".format(campaignId=56),
    #    headers=headers,
    #    json=get_quarantine_offers_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_region(client: TestClient):
    """Test case for get_campaign_region

    Регион магазина
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/region".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaign_settings(client: TestClient):
    """Test case for get_campaign_settings

    Настройки магазина
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/settings".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaigns(client: TestClient):
    """Test case for get_campaigns

    Список магазинов пользователя
    """
    params = [("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_campaigns_by_login(client: TestClient):
    """Test case for get_campaigns_by_login

    Магазины, доступные логину
    """
    params = [("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/by_login/{login}".format(login='login_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_categories_max_sale_quantum(client: TestClient):
    """Test case for get_categories_max_sale_quantum

    Лимит на установку кванта продажи и минимального количества товаров в заказе
    """
    get_categories_max_sale_quantum_request = {"market_category_ids":[0,0,0,0,0]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/categories/max-sale-quantum",
    #    headers=headers,
    #    json=get_categories_max_sale_quantum_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_categories_tree(client: TestClient):
    """Test case for get_categories_tree

    Дерево категорий
    """
    get_categories_request = {"language":"RU"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/categories/tree",
    #    headers=headers,
    #    json=get_categories_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_category_content_parameters(client: TestClient):
    """Test case for get_category_content_parameters

    Списки характеристик товаров по категориям
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/category/{categoryId}/parameters".format(categoryId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_chat_history(client: TestClient):
    """Test case for get_chat_history

    Получение истории сообщений в чате
    """
    get_chat_history_request = {"message_id_from":0}
    params = [("chat_id", 56),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats/history".format(businessId=56),
    #    headers=headers,
    #    json=get_chat_history_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_chats(client: TestClient):
    """Test case for get_chats

    Получение доступных чатов
    """
    get_chats_request = {"types":["CHAT","CHAT"],"statuses":["NEW","NEW"],"order_ids":[0,0]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats".format(businessId=56),
    #    headers=headers,
    #    json=get_chats_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_delivery_services(client: TestClient):
    """Test case for get_delivery_services

    Справочник служб доставки
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/delivery/services",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_feed(client: TestClient):
    """Test case for get_feed

    Информация о прайс-листе
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/feeds/{feedId}".format(campaignId=56, feedId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_feed_index_logs(client: TestClient):
    """Test case for get_feed_index_logs

    Отчет по индексации прайс-листа
    """
    params = [("limit", 20),     ("published_time_from", '2013-10-20T19:20:30+01:00'),     ("published_time_to", '2013-10-20T19:20:30+01:00'),     ("status", ympa_python_fastapi_server.FeedIndexLogsStatusType())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/feeds/{feedId}/index-logs".format(campaignId=56, feedId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_feedback_and_comment_updates(client: TestClient):
    """Test case for get_feedback_and_comment_updates

    Новые и обновленные отзывы о магазине
    """
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20),     ("from_date", '2013-10-20')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/feedback/updates".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_feeds(client: TestClient):
    """Test case for get_feeds

    Список прайс-листов магазина
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/feeds".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_goods_feedback_comments(client: TestClient):
    """Test case for get_goods_feedback_comments

    Получение комментариев к отзыву
    """
    get_goods_feedback_comments_request = {"feedback_id":0}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback/comments".format(businessId=56),
    #    headers=headers,
    #    json=get_goods_feedback_comments_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_goods_feedbacks(client: TestClient):
    """Test case for get_goods_feedbacks

    Получение отзывов о товарах продавца
    """
    get_goods_feedback_request = {"date_time_from":"2000-01-23T04:56:07.000+00:00","rating_values":[0,0,0,0,0],"model_ids":[6,6,6,6,6],"paid":1,"reaction_status":"ALL","date_time_to":"2000-01-23T04:56:07.000+00:00"}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback".format(businessId=56),
    #    headers=headers,
    #    json=get_goods_feedback_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_goods_stats(client: TestClient):
    """Test case for get_goods_stats

    Отчет по товарам
    """
    get_goods_stats_request = {"shop_skus":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/stats/skus".format(campaignId=56),
    #    headers=headers,
    #    json=get_goods_stats_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_hidden_offers(client: TestClient):
    """Test case for get_hidden_offers

    Информация о скрытых вами товарах
    """
    params = [("offer_id", ['offer_id_example']),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20),     ("offset", 56),     ("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/hidden-offers".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offer_cards_content_status(client: TestClient):
    """Test case for get_offer_cards_content_status

    Получение информации о заполненности карточек магазина
    """
    get_offer_cards_content_status_request = {"category_ids":[null,null,null,null,null],"offer_ids":[null,null,null,null,null],"card_statuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-cards".format(businessId=56),
    #    headers=headers,
    #    json=get_offer_cards_content_status_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offer_mapping_entries(client: TestClient):
    """Test case for get_offer_mapping_entries

    Список товаров в каталоге
    """
    params = [("offer_id", ['offer_id_example']),     ("shop_sku", ['shop_sku_example']),     ("mapping_kind", ympa_python_fastapi_server.OfferMappingKindType()),     ("status", [ympa_python_fastapi_server.OfferProcessingStatusType()]),     ("availability", [ympa_python_fastapi_server.OfferAvailabilityStatusType()]),     ("category_id", [56]),     ("vendor", ['vendor_example']),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/offer-mapping-entries".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offer_mappings(client: TestClient):
    """Test case for get_offer_mappings

    Информация о товарах в каталоге
    """
    get_offer_mappings_request = {"archived":1,"category_ids":[0,0],"vendor_names":["vendorNames","vendorNames"],"offer_ids":[null,null,null,null,null],"card_statuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings".format(businessId=56),
    #    headers=headers,
    #    json=get_offer_mappings_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offer_recommendations(client: TestClient):
    """Test case for get_offer_recommendations

    Рекомендации Маркета, касающиеся цен
    """
    get_offer_recommendations_request = {"cofinance_price_filter":"SPECIFIED","competitiveness_filter":"OPTIMAL","offer_ids":[null,null]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offers/recommendations".format(businessId=56),
    #    headers=headers,
    #    json=get_offer_recommendations_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_offers(client: TestClient):
    """Test case for get_offers

    Предложения магазина
    """
    params = [("query", 'query_example'),     ("feed_id", 56),     ("shop_category_id", 'shop_category_id_example'),     ("currency", ympa_python_fastapi_server.CurrencyType()),     ("matched", True),     ("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/offers".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_order(client: TestClient):
    """Test case for get_order

    Информация об одном заказе
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_order_business_buyer_info(client: TestClient):
    """Test case for get_order_business_buyer_info

    Информация о покупателе — юридическом лице
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/{orderId}/business-buyer".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_order_business_documents_info(client: TestClient):
    """Test case for get_order_business_documents_info

    Информация о документах
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/{orderId}/documents".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_order_labels_data(client: TestClient):
    """Test case for get_order_labels_data

    Данные для самостоятельного изготовления ярлыков
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".format(campaignId=56, orderId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_orders(client: TestClient):
    """Test case for get_orders

    Информация о нескольких заказах
    """
    params = [("order_ids", [56]),     ("status", [ympa_python_fastapi_server.OrderStatusType()]),     ("substatus", [ympa_python_fastapi_server.OrderSubstatusType()]),     ("from_date", '2013-10-20'),     ("to_date", '2013-10-20'),     ("supplier_shipment_date_from", '2013-10-20'),     ("supplier_shipment_date_to", '2013-10-20'),     ("updated_at_from", '2013-10-20T19:20:30+01:00'),     ("updated_at_to", '2013-10-20T19:20:30+01:00'),     ("dispatch_type", ympa_python_fastapi_server.OrderDeliveryDispatchType()),     ("fake", False),     ("has_cis", False),     ("only_waiting_for_cancellation_approve", False),     ("only_estimated_delivery", False),     ("buyer_type", ympa_python_fastapi_server.OrderBuyerType()),     ("page", 1),     ("page_size", 56),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_orders_stats(client: TestClient):
    """Test case for get_orders_stats

    Детальная информация по заказам
    """
    get_orders_stats_request = {"update_to":"2000-01-23","update_from":"2000-01-23","has_cis":1,"date_to":"2000-01-23","statuses":["CANCELLED_BEFORE_PROCESSING","CANCELLED_BEFORE_PROCESSING"],"orders":[0,0],"date_from":"2000-01-23"}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/stats/orders".format(campaignId=56),
    #    headers=headers,
    #    json=get_orders_stats_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_prices(client: TestClient):
    """Test case for get_prices

    Список цен
    """
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20),     ("archived", False)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/offer-prices".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_prices_by_offer_ids(client: TestClient):
    """Test case for get_prices_by_offer_ids

    Просмотр цен на указанные товары в магазине
    """
    get_prices_by_offer_ids_request = {"offer_ids":[null,null,null,null,null]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-prices".format(campaignId=56),
    #    headers=headers,
    #    json=get_prices_by_offer_ids_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_promo_offers(client: TestClient):
    """Test case for get_promo_offers

    Получение списка товаров, которые участвуют или могут участвовать в акции
    """
    get_promo_offers_request = {"status_type":"MANUALLY_ADDED","promo_id":"promoId"}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/promos/offers".format(businessId=56),
    #    headers=headers,
    #    json=get_promo_offers_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_promos(client: TestClient):
    """Test case for get_promos

    Получение списка акций
    """
    get_promos_request = {"participation":"PARTICIPATING_NOW","mechanics":"DIRECT_DISCOUNT"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/promos".format(businessId=56),
    #    headers=headers,
    #    json=get_promos_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_quality_rating_details(client: TestClient):
    """Test case for get_quality_rating_details

    Заказы, которые повлияли на индекс качества
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/ratings/quality/details".format(campaignId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_quality_ratings(client: TestClient):
    """Test case for get_quality_ratings

    Индекс качества магазинов
    """
    get_quality_rating_request = {"date_to":"2000-01-23","campaign_ids":[0,0,0,0,0],"date_from":"2000-01-23"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/ratings/quality".format(businessId=56),
    #    headers=headers,
    #    json=get_quality_rating_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_report_info(client: TestClient):
    """Test case for get_report_info

    Получение заданного отчета
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/reports/info/{reportId}".format(reportId='report_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_return(client: TestClient):
    """Test case for get_return

    Информация о невыкупе или возврате
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".format(campaignId=56, orderId=56, returnId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_return_application(client: TestClient):
    """Test case for get_return_application

    Получение заявления на возврат
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".format(campaignId=56, orderId=56, returnId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_return_photo(client: TestClient):
    """Test case for get_return_photo

    Получение фотографии возврата
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".format(campaignId=56, orderId=56, returnId=56, itemId=56, imageHash='image_hash_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_returns(client: TestClient):
    """Test case for get_returns

    Список невыкупов и возвратов
    """
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20),     ("order_ids", [56]),     ("statuses", [ympa_python_fastapi_server.RefundStatusType()]),     ("type", ympa_python_fastapi_server.ReturnType()),     ("from_date", '2022-10-31'),     ("to_date", '2022-11-30'),     ("from_date2", '2022-10-31'),     ("to_date2", '2022-11-30')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/returns".format(campaignId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_shipment(client: TestClient):
    """Test case for get_shipment

    Получение информации об одной отгрузке
    """
    params = [("cancelled_orders", True)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_shipment_orders_info(client: TestClient):
    """Test case for get_shipment_orders_info

    Получение информации о возможности печати ярлыков (FBS)
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_stocks(client: TestClient):
    """Test case for get_stocks

    Информация об остатках и оборачиваемости
    """
    get_warehouse_stocks_request = {"archived":1,"with_turnover":0,"offer_ids":[null,null,null,null,null]}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offers/stocks".format(campaignId=56),
    #    headers=headers,
    #    json=get_warehouse_stocks_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_suggested_offer_mapping_entries(client: TestClient):
    """Test case for get_suggested_offer_mapping_entries

    Рекомендованные карточки для товаров
    """
    get_suggested_offer_mapping_entries_request = {"offers":[{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","price":2.027123023002322,"transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-mapping-entries/suggestions".format(campaignId=56),
    #    headers=headers,
    #    json=get_suggested_offer_mapping_entries_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_suggested_offer_mappings(client: TestClient):
    """Test case for get_suggested_offer_mappings

    Просмотр карточек на Маркете, которые подходят вашим товарам
    """
    get_suggested_offer_mappings_request = {"offers":[{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"},{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"},{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"},{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"},{"vendor":"LEVENHUK","basic_price":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendor_code":"VNDR-0005A"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/suggestions".format(businessId=56),
    #    headers=headers,
    #    json=get_suggested_offer_mappings_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_suggested_prices(client: TestClient):
    """Test case for get_suggested_prices

    Цены для продвижения товаров
    """
    suggest_prices_request = {"offers":[{"market_sku":0,"offer_id":"offerId"},{"market_sku":0,"offer_id":"offerId"},{"market_sku":0,"offer_id":"offerId"},{"market_sku":0,"offer_id":"offerId"},{"market_sku":0,"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-prices/suggestions".format(campaignId=56),
    #    headers=headers,
    #    json=suggest_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_warehouses(client: TestClient):
    """Test case for get_warehouses

    Список складов и групп складов
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{businessId}/warehouses".format(businessId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_provide_order_item_identifiers(client: TestClient):
    """Test case for provide_order_item_identifiers

    Передача кодов маркировки единиц товара
    """
    provide_order_item_identifiers_request = {"items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/identifiers".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=provide_order_item_identifiers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_put_bids_for_business(client: TestClient):
    """Test case for put_bids_for_business

    Включение буста продаж и установка ставок
    """
    put_sku_bids_request = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/businesses/{businessId}/bids".format(businessId=56),
    #    headers=headers,
    #    json=put_sku_bids_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_put_bids_for_campaign(client: TestClient):
    """Test case for put_bids_for_campaign

    Включение буста продаж и установка ставок для магазина
    """
    put_sku_bids_request = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/bids".format(campaignId=56),
    #    headers=headers,
    #    json=put_sku_bids_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_refresh_feed(client: TestClient):
    """Test case for refresh_feed

    Сообщить, что прайс-лист обновился
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/feeds/{feedId}/refresh".format(campaignId=56, feedId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_search_region_children(client: TestClient):
    """Test case for search_region_children

    Информация о дочерних регионах
    """
    params = [("page", 1),     ("page_size", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/regions/{regionId}/children".format(regionId=56),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_search_regions_by_id(client: TestClient):
    """Test case for search_regions_by_id

    Информация о регионе
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/regions/{regionId}".format(regionId=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_search_regions_by_name(client: TestClient):
    """Test case for search_regions_by_name

    Поиск регионов по их имени
    """
    params = [("name", 'name_example'),     ("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/regions",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_search_shipments(client: TestClient):
    """Test case for search_shipments

    Получение информации о нескольких отгрузках
    """
    search_shipments_request = {"cancelled_orders":1,"date_to":"2000-01-23","statuses":["OUTBOUND_CREATED","OUTBOUND_CREATED"],"order_ids":[0,0],"date_from":"2000-01-23"}
    params = [("page_token", 'eyBuZXh0SWQ6IDIzNDIgfQ=='),     ("limit", 20)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/first-mile/shipments".format(campaignId=56),
    #    headers=headers,
    #    json=search_shipments_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_send_file_to_chat(client: TestClient):
    """Test case for send_file_to_chat

    Отправка файла в чат
    """
    params = [("chat_id", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    data = {
        "file": '/path/to/file'
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats/file/send".format(businessId=56),
    #    headers=headers,
    #    data=data,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_send_message_to_chat(client: TestClient):
    """Test case for send_message_to_chat

    Отправка сообщения в чат
    """
    send_message_to_chat_request = {"message":"message"}
    params = [("chat_id", 56)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/chats/message".format(businessId=56),
    #    headers=headers,
    #    json=send_message_to_chat_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_feed_params(client: TestClient):
    """Test case for set_feed_params

    Изменение параметров прайс-листа
    """
    set_feed_params_request = {"parameters":[{"deleted":1,"values":[0,0],"name":"name"},{"deleted":1,"values":[0,0],"name":"name"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/feeds/{feedId}/params".format(campaignId=56, feedId=56),
    #    headers=headers,
    #    json=set_feed_params_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_order_box_layout(client: TestClient):
    """Test case for set_order_box_layout

    Подготовка заказа
    """
    set_order_box_layout_request = {"boxes":[{"items":[{"partial_count":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"full_count":1},{"partial_count":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"full_count":1}]},{"items":[{"partial_count":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"full_count":1},{"partial_count":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"full_count":1}]}],"allow_remove":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/boxes".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=set_order_box_layout_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_order_shipment_boxes(client: TestClient):
    """Test case for set_order_shipment_boxes

    Передача количества грузовых мест в заказе
    """
    set_order_shipment_boxes_request = {"boxes":[{"fulfilment_id":"fulfilmentId","id":0},{"fulfilment_id":"fulfilmentId","id":0}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".format(campaignId=56, orderId=56, shipmentId=56),
    #    headers=headers,
    #    json=set_order_shipment_boxes_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_set_shipment_pallets_count(client: TestClient):
    """Test case for set_shipment_pallets_count

    Передача количества упаковок в отгрузке
    """
    set_shipment_pallets_count_request = {"places_count":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    json=set_shipment_pallets_count_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_skip_goods_feedbacks_reaction(client: TestClient):
    """Test case for skip_goods_feedbacks_reaction

    Отказ от ответа на отзывы
    """
    skip_goods_feedback_reaction_request = {"feedback_ids":[null,null,null,null,null]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback/skip-reaction".format(businessId=56),
    #    headers=headers,
    #    json=skip_goods_feedback_reaction_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_transfer_orders_from_shipment(client: TestClient):
    """Test case for transfer_orders_from_shipment

    Перенос заказов в следующую отгрузку
    """
    transfer_orders_from_shipment_request = {"order_ids":[0,0,0,0,0]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".format(campaignId=56, shipmentId=56),
    #    headers=headers,
    #    json=transfer_orders_from_shipment_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_business_prices(client: TestClient):
    """Test case for update_business_prices

    Установка цен на товары во всех магазинах
    """
    update_business_prices_request = {"offers":[{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"},{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"},{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"},{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"},{"price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-prices/updates".format(businessId=56),
    #    headers=headers,
    #    json=update_business_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_campaign_offers(client: TestClient):
    """Test case for update_campaign_offers

    Изменение условий продажи товаров в магазине
    """
    update_campaign_offers_request = {"offers":[{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}},{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}},{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}},{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}},{"available":1,"vat":0,"offer_id":"offerId","quantum":{"min_quantity":1,"step_quantity":60}}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offers/update".format(campaignId=56),
    #    headers=headers,
    #    json=update_campaign_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_goods_feedback_comment(client: TestClient):
    """Test case for update_goods_feedback_comment

    Добавление нового или изменение созданного комментария
    """
    update_goods_feedback_comment_request = {"feedback_id":0,"comment":{"id":6,"text":"text","parent_id":1}}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/goods-feedback/comments/update".format(businessId=56),
    #    headers=headers,
    #    json=update_goods_feedback_comment_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_offer_content(client: TestClient):
    """Test case for update_offer_content

    Редактирование категорийных характеристик товара
    """
    update_offer_content_request = {"offers_content":[{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]},{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]},{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]},{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]},{"offer_id":"offerId","category_id":0,"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}]}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-cards/update".format(businessId=56),
    #    headers=headers,
    #    json=update_offer_content_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_offer_mapping_entries(client: TestClient):
    """Test case for update_offer_mapping_entries

    Добавление и редактирование товаров в каталоге
    """
    update_offer_mapping_entry_request = {"offer_mapping_entries":[{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}},{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}},{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}},{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}},{"offer":{"manufacturer_countries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"delivery_duration_days":5,"feed_id":0,"vendor":"LEVENHUK","transport_unit_size":1,"id":"id","life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"supply_schedule_days":["MONDAY","MONDAY"],"life_time_days":9,"quantum_of_supply":5,"barcodes":["46012300000000","46012300000000"],"customs_commodity_codes":["customsCommodityCodes","customsCommodityCodes"],"processing_state":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shop_sku":"shopSku","box_count":2,"min_shipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelf_life_days":7,"guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guarantee_period_days":3},"mapping":{"model_id":7,"market_sku":4,"category_id":1},"awaiting_moderation_mapping":{"model_id":7,"market_sku":4,"category_id":1},"rejected_mapping":{"model_id":7,"market_sku":4,"category_id":1}}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-mapping-entries/updates".format(campaignId=56),
    #    headers=headers,
    #    json=update_offer_mapping_entry_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_offer_mappings(client: TestClient):
    """Test case for update_offer_mappings

    Добавление товаров в каталог и изменение информации о них
    """
    update_offer_mappings_request = {"offer_mappings":[{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}},{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}},{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}},{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}},{"offer":{"downloadable":1,"market_category_id":0,"manufacturer_countries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchase_price":{"value":0.9301444243932576},"type":"DEFAULT","pictures":["pictures","pictures"],"vendor_code":"VNDR-0005A","vendor":"LEVENHUK","basic_price":{"discount_base":0.7061401241503109,"currency_id":"RUR","value":0.23021358869347652},"life_time":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"shelf_life":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"cofinance_price":{"value":0.9301444243932576},"parameter_values":[{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"},{"value_id":5,"parameter_id":1,"unit_id":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"box_count":6,"additional_expenses":{"value":0.9301444243932576},"name":"Ударная дрель Makita HP1630, 710 Вт","offer_id":"offerId","guarantee_period":{"time_period":6,"comment":"comment","time_unit":"HOUR"},"weight_dimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customs_commodity_code":"8517610008","adult":1,"age":{"age_unit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"market_sku":3}}],"only_partner_media_content":1}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/offer-mappings/update".format(businessId=56),
    #    headers=headers,
    #    json=update_offer_mappings_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_order_items(client: TestClient):
    """Test case for update_order_items

    Удаление товара из заказа или уменьшение числа единиц
    """
    update_order_item_request = {"reason":"PARTNER_REQUESTED_REMOVE","items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/items".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=update_order_item_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_order_status(client: TestClient):
    """Test case for update_order_status

    Изменение статуса одного заказа
    """
    update_order_status_request = {"order":{"delivery":{"dates":{"real_delivery_date":"2000-01-23"}},"substatus":"RESERVATION_EXPIRED","status":"PLACING"}}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/orders/{orderId}/status".format(campaignId=56, orderId=56),
    #    headers=headers,
    #    json=update_order_status_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_order_statuses(client: TestClient):
    """Test case for update_order_statuses

    Изменение статусов нескольких заказов
    """
    update_order_statuses_request = {"orders":[{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/orders/status-update".format(campaignId=56),
    #    headers=headers,
    #    json=update_order_statuses_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_prices(client: TestClient):
    """Test case for update_prices

    Установка цен на товары в конкретном магазине
    """
    update_prices_request = {"offers":[{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"},{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"},{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"},{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"},{"price":{"vat":1,"discount_base":6.027456183070403,"currency_id":"RUR","value":0.8008281904610115},"offer_id":"offerId"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/campaigns/{campaignId}/offer-prices/updates".format(campaignId=56),
    #    headers=headers,
    #    json=update_prices_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_promo_offers(client: TestClient):
    """Test case for update_promo_offers

    Добавление товаров в акцию или изменение их цен
    """
    update_promo_offers_request = {"offers":[{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}},{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}},{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}},{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}},{"offer_id":"offerId","params":{"discount_params":{"promo_price":1,"price":1}}}],"promo_id":"promoId"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{businessId}/promos/offers/update".format(businessId=56),
    #    headers=headers,
    #    json=update_promo_offers_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_stocks(client: TestClient):
    """Test case for update_stocks

    Передача информации об остатках
    """
    update_stocks_request = {"skus":[{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updated_at":"2000-01-23T04:56:07.000+00:00"}]}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PUT",
    #    "/campaigns/{campaignId}/offers/stocks".format(campaignId=56),
    #    headers=headers,
    #    json=update_stocks_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

