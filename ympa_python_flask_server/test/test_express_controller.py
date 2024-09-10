import unittest

from flask import json

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
from ympa_python_flask_server.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest  # noqa: E501
from ympa_python_flask_server.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest  # noqa: E501
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
from ympa_python_flask_server.models.get_delivery_services_response import GetDeliveryServicesResponse  # noqa: E501
from ympa_python_flask_server.models.get_feed_index_logs_response import GetFeedIndexLogsResponse  # noqa: E501
from ympa_python_flask_server.models.get_feed_response import GetFeedResponse  # noqa: E501
from ympa_python_flask_server.models.get_feedback_list_response import GetFeedbackListResponse  # noqa: E501
from ympa_python_flask_server.models.get_feeds_response import GetFeedsResponse  # noqa: E501
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
from ympa_python_flask_server.models.get_order_labels_data_response import GetOrderLabelsDataResponse  # noqa: E501
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
from ympa_python_flask_server.models.get_quality_rating_details_response import GetQualityRatingDetailsResponse  # noqa: E501
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
from ympa_python_flask_server.models.get_warehouses_response import GetWarehousesResponse  # noqa: E501
from ympa_python_flask_server.models.offer_availability_status_type import OfferAvailabilityStatusType  # noqa: E501
from ympa_python_flask_server.models.offer_mapping_kind_type import OfferMappingKindType  # noqa: E501
from ympa_python_flask_server.models.offer_processing_status_type import OfferProcessingStatusType  # noqa: E501
from ympa_python_flask_server.models.order_buyer_type import OrderBuyerType  # noqa: E501
from ympa_python_flask_server.models.order_delivery_dispatch_type import OrderDeliveryDispatchType  # noqa: E501
from ympa_python_flask_server.models.order_status_type import OrderStatusType  # noqa: E501
from ympa_python_flask_server.models.order_substatus_type import OrderSubstatusType  # noqa: E501
from ympa_python_flask_server.models.page_format_type import PageFormatType  # noqa: E501
from ympa_python_flask_server.models.provide_order_item_identifiers_request import ProvideOrderItemIdentifiersRequest  # noqa: E501
from ympa_python_flask_server.models.provide_order_item_identifiers_response import ProvideOrderItemIdentifiersResponse  # noqa: E501
from ympa_python_flask_server.models.put_sku_bids_request import PutSkuBidsRequest  # noqa: E501
from ympa_python_flask_server.models.refund_status_type import RefundStatusType  # noqa: E501
from ympa_python_flask_server.models.report_format_type import ReportFormatType  # noqa: E501
from ympa_python_flask_server.models.return_type import ReturnType  # noqa: E501
from ympa_python_flask_server.models.send_message_to_chat_request import SendMessageToChatRequest  # noqa: E501
from ympa_python_flask_server.models.set_feed_params_request import SetFeedParamsRequest  # noqa: E501
from ympa_python_flask_server.models.set_order_box_layout_request import SetOrderBoxLayoutRequest  # noqa: E501
from ympa_python_flask_server.models.set_order_box_layout_response import SetOrderBoxLayoutResponse  # noqa: E501
from ympa_python_flask_server.models.set_order_shipment_boxes_request import SetOrderShipmentBoxesRequest  # noqa: E501
from ympa_python_flask_server.models.set_order_shipment_boxes_response import SetOrderShipmentBoxesResponse  # noqa: E501
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
from ympa_python_flask_server.models.update_order_item_request import UpdateOrderItemRequest  # noqa: E501
from ympa_python_flask_server.models.update_order_status_request import UpdateOrderStatusRequest  # noqa: E501
from ympa_python_flask_server.models.update_order_status_response import UpdateOrderStatusResponse  # noqa: E501
from ympa_python_flask_server.models.update_order_statuses_request import UpdateOrderStatusesRequest  # noqa: E501
from ympa_python_flask_server.models.update_order_statuses_response import UpdateOrderStatusesResponse  # noqa: E501
from ympa_python_flask_server.models.update_prices_request import UpdatePricesRequest  # noqa: E501
from ympa_python_flask_server.models.update_promo_offers_request import UpdatePromoOffersRequest  # noqa: E501
from ympa_python_flask_server.models.update_promo_offers_response import UpdatePromoOffersResponse  # noqa: E501
from ympa_python_flask_server.models.update_stocks_request import UpdateStocksRequest  # noqa: E501
from ympa_python_flask_server.models.verify_order_eac_request import VerifyOrderEacRequest  # noqa: E501
from ympa_python_flask_server.models.verify_order_eac_response import VerifyOrderEacResponse  # noqa: E501
from ympa_python_flask_server.test import BaseTestCase


class TestExpressController(BaseTestCase):
    """ExpressController integration test stubs"""

    def test_add_hidden_offers(self):
        """Test case for add_hidden_offers

        Скрытие товаров и настройки скрытия
        """
        add_hidden_offers_request = {"hiddenOffers":[{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/hidden-offers'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(add_hidden_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_offers_to_archive(self):
        """Test case for add_offers_to_archive

        Добавление товаров в архив
        """
        add_offers_to_archive_request = {"offerIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-mappings/archive'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(add_offers_to_archive_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_calculate_tariffs(self):
        """Test case for calculate_tariffs

        Калькулятор стоимости услуг
        """
        calculate_tariffs_request = {"offers":[{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328},{"quantity":1,"price":0.6027456183070403,"length":0.14658129805029452,"width":0.5962133916683182,"weight":0.23021358869347652,"categoryId":0,"height":0.5637376656633328}],"parameters":{"campaignId":0,"sellingProgram":"FBY","frequency":"DAILY"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/tariffs/calculate',
            method='POST',
            headers=headers,
            data=json.dumps(calculate_tariffs_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_confirm_business_prices(self):
        """Test case for confirm_business_prices

        Удаление товара из карантина по цене в кабинете
        """
        confirm_prices_request = {"offerIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/price-quarantine/confirm'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(confirm_prices_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_confirm_campaign_prices(self):
        """Test case for confirm_campaign_prices

        Удаление товара из карантина по цене в магазине
        """
        confirm_prices_request = {"offerIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/price-quarantine/confirm'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(confirm_prices_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_chat(self):
        """Test case for create_chat

        Создание нового чата с покупателем
        """
        create_chat_request = {"orderId":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/chats/new'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(create_chat_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_campaign_offers(self):
        """Test case for delete_campaign_offers

        Удаление товаров из ассортимента магазина
        """
        delete_campaign_offers_request = {"offerIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/delete'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(delete_campaign_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_goods_feedback_comment(self):
        """Test case for delete_goods_feedback_comment

        Удаление комментария к отзыву
        """
        delete_goods_feedback_comment_request = {"id":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback/comments/delete'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(delete_goods_feedback_comment_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_hidden_offers(self):
        """Test case for delete_hidden_offers

        Возобновление показа товаров
        """
        delete_hidden_offers_request = {"hiddenOffers":[{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"},{"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/hidden-offers/delete'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(delete_hidden_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_offers(self):
        """Test case for delete_offers

        Удаление товаров из каталога
        """
        delete_offers_request = {"offerIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-mappings/delete'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(delete_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_offers_from_archive(self):
        """Test case for delete_offers_from_archive

        Удаление товаров из архива
        """
        delete_offers_from_archive_request = {"offerIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-mappings/unarchive'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(delete_offers_from_archive_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_promo_offers(self):
        """Test case for delete_promo_offers

        Удаление товаров из акции
        """
        delete_promo_offers_request = {"deleteAllOffers":True,"promoId":"promoId","offerIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/promos/offers/delete'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(delete_promo_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_boost_consolidated_report(self):
        """Test case for generate_boost_consolidated_report

        Отчет по бусту продаж
        """
        generate_boost_consolidated_request = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23"}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/boost-consolidated/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_boost_consolidated_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_competitors_position_report(self):
        """Test case for generate_competitors_position_report

        Отчет «Конкурентная позиция»
        """
        generate_competitors_position_report_request = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","categoryId":6}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/competitors-position/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_competitors_position_report_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_goods_feedback_report(self):
        """Test case for generate_goods_feedback_report

        Отчет по отзывам о товарах
        """
        generate_goods_feedback_request = {"businessId":0}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/goods-feedback/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_goods_feedback_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_goods_realization_report(self):
        """Test case for generate_goods_realization_report

        Отчет по реализации
        """
        generate_goods_realization_report_request = {"month":2,"year":6,"campaignId":0}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/goods-realization/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_goods_realization_report_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_mass_order_labels_report(self):
        """Test case for generate_mass_order_labels_report

        Готовые ярлыки‑наклейки на все коробки в нескольких заказах
        """
        generate_mass_order_labels_request = {"businessId":0,"orderIds":[6,6,6,6,6]}
        query_string = [('format', ympa_python_flask_server.PageFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/documents/labels/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_mass_order_labels_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_order_label(self):
        """Test case for generate_order_label

        Готовый ярлык‑наклейка для коробки в заказе
        """
        query_string = [('format', ympa_python_flask_server.PageFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes/{box_id}/label'.format(campaign_id=56, order_id=56, shipment_id=56, box_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_order_labels(self):
        """Test case for generate_order_labels

        Готовые ярлыки‑наклейки на все коробки в одном заказе
        """
        query_string = [('format', ympa_python_flask_server.PageFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/labels'.format(campaign_id=56, order_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_prices_report(self):
        """Test case for generate_prices_report

        Отчет «Цены на рынке»
        """
        generate_prices_report_request = {"categoryIds":[1,1],"creationDateTo":"2000-01-23","campaignId":6,"businessId":0,"creationDateFrom":"2000-01-23"}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/prices/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_prices_report_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_shelfs_statistics_report(self):
        """Test case for generate_shelfs_statistics_report

        Отчет по полкам
        """
        generate_shelfs_statistics_request = {"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","attributionType":"CLICKS"}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/shelf-statistics/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_shelfs_statistics_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_shows_sales_report(self):
        """Test case for generate_shows_sales_report

        Отчет «Аналитика продаж»
        """
        generate_shows_sales_report_request = {"campaignId":6,"businessId":0,"dateTo":"2000-01-23","dateFrom":"2000-01-23","grouping":"CATEGORIES"}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/shows-sales/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_shows_sales_report_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_stocks_on_warehouses_report(self):
        """Test case for generate_stocks_on_warehouses_report

        Отчет по остаткам на складах
        """
        generate_stocks_on_warehouses_report_request = {"categoryIds":[1,1],"hasStocks":True,"reportDate":"2000-01-23","campaignId":0,"warehouseIds":[6,6]}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/stocks-on-warehouses/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_stocks_on_warehouses_report_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_united_marketplace_services_report(self):
        """Test case for generate_united_marketplace_services_report

        Отчет по стоимости услуг
        """
        generate_united_marketplace_services_report_request = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","yearFrom":6,"placementPrograms":["FBS","FBS"],"businessId":0,"dateTo":"2000-01-23","monthFrom":2,"dateTimeTo":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaignIds":[2,2],"dateFrom":"2000-01-23","monthTo":7,"yearTo":5}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/united-marketplace-services/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_united_marketplace_services_report_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_united_netting_report(self):
        """Test case for generate_united_netting_report

        Отчет по платежам
        """
        generate_united_netting_report_request = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","bankOrderId":6,"placementPrograms":["FBS","FBS"],"businessId":0,"dateTo":"2000-01-23","dateTimeTo":"2000-01-23T04:56:07.000+00:00","inns":["inns","inns"],"campaignIds":[1,1],"dateFrom":"2000-01-23","bankOrderDateTime":"2000-01-23T04:56:07.000+00:00"}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/united-netting/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_united_netting_report_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generate_united_orders_report(self):
        """Test case for generate_united_orders_report

        Отчет по заказам
        """
        generate_united_orders_request = {"businessId":0,"dateTo":"2000-01-23","campaignIds":[6,6],"promoId":"promoId","dateFrom":"2000-01-23"}
        query_string = [('format', ympa_python_flask_server.ReportFormatType())]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/united-orders/generate',
            method='POST',
            headers=headers,
            data=json.dumps(generate_united_orders_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_offers(self):
        """Test case for get_all_offers

        Все предложения магазина
        """
        query_string = [('feedId', 56),
                        ('chunk', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/all'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bids_info_for_business(self):
        """Test case for get_bids_info_for_business

        Информация об установленных ставках
        """
        get_bids_info_request = {"skus":[null,null,null,null,null]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/bids/info'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_bids_info_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_bids_recommendations(self):
        """Test case for get_bids_recommendations

        Рекомендованные ставки для заданных товаров
        """
        get_bids_recommendations_request = {"skus":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/bids/recommendations'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_bids_recommendations_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_business_quarantine_offers(self):
        """Test case for get_business_quarantine_offers

        Список товаров, находящихся в карантине по цене в кабинете
        """
        get_quarantine_offers_request = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/price-quarantine'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_quarantine_offers_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_business_settings(self):
        """Test case for get_business_settings

        Настройки кабинета
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/settings'.format(business_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign(self):
        """Test case for get_campaign

        Информация о магазине
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}'.format(campaign_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_logins(self):
        """Test case for get_campaign_logins

        Логины, связанные с магазином
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/logins'.format(campaign_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_offers(self):
        """Test case for get_campaign_offers

        Информация о товарах, которые размещены в заданном магазине
        """
        get_campaign_offers_request = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"statuses":["PUBLISHED","PUBLISHED"],"offerIds":[null,null,null,null,null],"tags":["tags","tags"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_campaign_offers_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_quarantine_offers(self):
        """Test case for get_campaign_quarantine_offers

        Список товаров, находящихся в карантине по цене в магазине
        """
        get_quarantine_offers_request = {"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/price-quarantine'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_quarantine_offers_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_region(self):
        """Test case for get_campaign_region

        Регион магазина
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/region'.format(campaign_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_settings(self):
        """Test case for get_campaign_settings

        Настройки магазина
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/settings'.format(campaign_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaigns(self):
        """Test case for get_campaigns

        Список магазинов пользователя
        """
        query_string = [('page', 1),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaigns_by_login(self):
        """Test case for get_campaigns_by_login

        Магазины, доступные логину
        """
        query_string = [('page', 1),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/by_login/{login}'.format(login='login_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_categories_max_sale_quantum(self):
        """Test case for get_categories_max_sale_quantum

        Лимит на установку кванта продажи и минимального количества товаров в заказе
        """
        get_categories_max_sale_quantum_request = {"marketCategoryIds":[0,0,0,0,0]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/categories/max-sale-quantum',
            method='POST',
            headers=headers,
            data=json.dumps(get_categories_max_sale_quantum_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_categories_tree(self):
        """Test case for get_categories_tree

        Дерево категорий
        """
        get_categories_request = {"language":"RU"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/categories/tree',
            method='POST',
            headers=headers,
            data=json.dumps(get_categories_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_category_content_parameters(self):
        """Test case for get_category_content_parameters

        Списки характеристик товаров по категориям
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/category/{category_id}/parameters'.format(category_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_chat_history(self):
        """Test case for get_chat_history

        Получение истории сообщений в чате
        """
        get_chat_history_request = {"messageIdFrom":0}
        query_string = [('chatId', 56),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/chats/history'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_chat_history_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_chats(self):
        """Test case for get_chats

        Получение доступных чатов
        """
        get_chats_request = {"types":["CHAT","CHAT"],"statuses":["NEW","NEW"],"orderIds":[0,0]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/chats'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_chats_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_delivery_services(self):
        """Test case for get_delivery_services

        Справочник служб доставки
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/delivery/services',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feed(self):
        """Test case for get_feed

        Информация о прайс-листе
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds/{feed_id}'.format(campaign_id=56, feed_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feed_index_logs(self):
        """Test case for get_feed_index_logs

        Отчет по индексации прайс-листа
        """
        query_string = [('limit', 20),
                        ('published_time_from', '2013-10-20T19:20:30+01:00'),
                        ('published_time_to', '2013-10-20T19:20:30+01:00'),
                        ('status', ympa_python_flask_server.FeedIndexLogsStatusType())]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds/{feed_id}/index-logs'.format(campaign_id=56, feed_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feedback_and_comment_updates(self):
        """Test case for get_feedback_and_comment_updates

        Новые и обновленные отзывы о магазине
        """
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20),
                        ('from_date', '2013-10-20')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feedback/updates'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feeds(self):
        """Test case for get_feeds

        Список прайс-листов магазина
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds'.format(campaign_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goods_feedback_comments(self):
        """Test case for get_goods_feedback_comments

        Получение комментариев к отзыву
        """
        get_goods_feedback_comments_request = {"feedbackId":0}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback/comments'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_goods_feedback_comments_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goods_feedbacks(self):
        """Test case for get_goods_feedbacks

        Получение отзывов о товарах продавца
        """
        get_goods_feedback_request = {"dateTimeFrom":"2000-01-23T04:56:07.000+00:00","ratingValues":[0,0,0,0,0],"modelIds":[6,6,6,6,6],"paid":True,"reactionStatus":"ALL","dateTimeTo":"2000-01-23T04:56:07.000+00:00"}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_goods_feedback_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goods_stats(self):
        """Test case for get_goods_stats

        Отчет по товарам
        """
        get_goods_stats_request = {"shopSkus":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/stats/skus'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_goods_stats_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_hidden_offers(self):
        """Test case for get_hidden_offers

        Информация о скрытых вами товарах
        """
        query_string = [('offer_id', ['offer_id_example']),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20),
                        ('offset', 56),
                        ('page', 1),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/hidden-offers'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_offer_cards_content_status(self):
        """Test case for get_offer_cards_content_status

        Получение информации о заполненности карточек магазина
        """
        get_offer_cards_content_status_request = {"categoryIds":[null,null,null,null,null],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-cards'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_offer_cards_content_status_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_offer_mapping_entries(self):
        """Test case for get_offer_mapping_entries

        Список товаров в каталоге
        """
        query_string = [('offer_id', ['offer_id_example']),
                        ('shop_sku', ['shop_sku_example']),
                        ('mapping_kind', ympa_python_flask_server.OfferMappingKindType()),
                        ('status', [ympa_python_flask_server.OfferProcessingStatusType()]),
                        ('availability', [ympa_python_flask_server.OfferAvailabilityStatusType()]),
                        ('category_id', [56]),
                        ('vendor', ['vendor_example']),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-mapping-entries'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_offer_mappings(self):
        """Test case for get_offer_mappings

        Информация о товарах в каталоге
        """
        get_offer_mappings_request = {"archived":True,"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-mappings'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_offer_mappings_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_offer_recommendations(self):
        """Test case for get_offer_recommendations

        Рекомендации Маркета, касающиеся цен
        """
        get_offer_recommendations_request = {"cofinancePriceFilter":"SPECIFIED","competitivenessFilter":"OPTIMAL","offerIds":[null,null]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offers/recommendations'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_offer_recommendations_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_offers(self):
        """Test case for get_offers

        Предложения магазина
        """
        query_string = [('query', 'query_example'),
                        ('feedId', 56),
                        ('shopCategoryId', 'shop_category_id_example'),
                        ('currency', ympa_python_flask_server.CurrencyType()),
                        ('matched', True),
                        ('page', 1),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_order(self):
        """Test case for get_order

        Информация об одном заказе
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}'.format(campaign_id=56, order_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_order_business_buyer_info(self):
        """Test case for get_order_business_buyer_info

        Информация о покупателе — юридическом лице
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/business-buyer'.format(campaign_id=56, order_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_order_business_documents_info(self):
        """Test case for get_order_business_documents_info

        Информация о документах
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/documents'.format(campaign_id=56, order_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_order_labels_data(self):
        """Test case for get_order_labels_data

        Данные для самостоятельного изготовления ярлыков
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/labels/data'.format(campaign_id=56, order_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_orders(self):
        """Test case for get_orders

        Информация о нескольких заказах
        """
        query_string = [('orderIds', [56]),
                        ('status', [ympa_python_flask_server.OrderStatusType()]),
                        ('substatus', [ympa_python_flask_server.OrderSubstatusType()]),
                        ('fromDate', '2013-10-20'),
                        ('toDate', '2013-10-20'),
                        ('supplierShipmentDateFrom', '2013-10-20'),
                        ('supplierShipmentDateTo', '2013-10-20'),
                        ('updatedAtFrom', '2013-10-20T19:20:30+01:00'),
                        ('updatedAtTo', '2013-10-20T19:20:30+01:00'),
                        ('dispatchType', ympa_python_flask_server.OrderDeliveryDispatchType()),
                        ('fake', False),
                        ('hasCis', False),
                        ('onlyWaitingForCancellationApprove', False),
                        ('onlyEstimatedDelivery', False),
                        ('buyerType', ympa_python_flask_server.OrderBuyerType()),
                        ('page', 1),
                        ('pageSize', 56),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_orders_stats(self):
        """Test case for get_orders_stats

        Детальная информация по заказам
        """
        get_orders_stats_request = {"updateTo":"2000-01-23","updateFrom":"2000-01-23","hasCis":True,"dateTo":"2000-01-23","statuses":["CANCELLED_BEFORE_PROCESSING","CANCELLED_BEFORE_PROCESSING"],"orders":[0,0],"dateFrom":"2000-01-23"}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/stats/orders'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_orders_stats_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_prices(self):
        """Test case for get_prices

        Список цен
        """
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20),
                        ('archived', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-prices'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_prices_by_offer_ids(self):
        """Test case for get_prices_by_offer_ids

        Просмотр цен на указанные товары в магазине
        """
        get_prices_by_offer_ids_request = {"offerIds":[null,null,null,null,null]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-prices'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_prices_by_offer_ids_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_promo_offers(self):
        """Test case for get_promo_offers

        Получение списка товаров, которые участвуют или могут участвовать в акции
        """
        get_promo_offers_request = {"statusType":"MANUALLY_ADDED","promoId":"promoId"}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/promos/offers'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_promo_offers_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_promos(self):
        """Test case for get_promos

        Получение списка акций
        """
        get_promos_request = {"participation":"PARTICIPATING_NOW","mechanics":"DIRECT_DISCOUNT"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/promos'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_promos_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_quality_rating_details(self):
        """Test case for get_quality_rating_details

        Заказы, которые повлияли на индекс качества
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/ratings/quality/details'.format(campaign_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_quality_ratings(self):
        """Test case for get_quality_ratings

        Индекс качества магазинов
        """
        get_quality_rating_request = {"dateTo":"2000-01-23","campaignIds":[0,0,0,0,0],"dateFrom":"2000-01-23"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/ratings/quality'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_quality_rating_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_report_info(self):
        """Test case for get_report_info

        Получение заданного отчета
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/reports/info/{report_id}'.format(report_id='report_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return(self):
        """Test case for get_return

        Информация о невыкупе или возврате
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}'.format(campaign_id=56, order_id=56, return_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_application(self):
        """Test case for get_return_application

        Получение заявления на возврат
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/application'.format(campaign_id=56, order_id=56, return_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_photo(self):
        """Test case for get_return_photo

        Получение фотографии возврата
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/returns/{return_id}/decision/{item_id}/image/{image_hash}'.format(campaign_id=56, order_id=56, return_id=56, item_id=56, image_hash='image_hash_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_returns(self):
        """Test case for get_returns

        Список невыкупов и возвратов
        """
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20),
                        ('orderIds', [56]),
                        ('statuses', [ympa_python_flask_server.RefundStatusType()]),
                        ('type', ympa_python_flask_server.ReturnType()),
                        ('fromDate', '2022-10-31'),
                        ('toDate', '2022-11-30'),
                        ('from_date2', '2022-10-31'),
                        ('to_date2', '2022-11-30')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/returns'.format(campaign_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_stocks(self):
        """Test case for get_stocks

        Информация об остатках и оборачиваемости
        """
        get_warehouse_stocks_request = {"archived":True,"withTurnover":False,"offerIds":[null,null,null,null,null]}
        query_string = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/stocks'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_warehouse_stocks_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_suggested_offer_mapping_entries(self):
        """Test case for get_suggested_offer_mapping_entries

        Рекомендованные карточки для товаров
        """
        get_suggested_offer_mapping_entries_request = {"offers":[{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","price":2.027123023002322,"transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-mapping-entries/suggestions'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_suggested_offer_mapping_entries_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_suggested_offer_mappings(self):
        """Test case for get_suggested_offer_mappings

        Просмотр карточек на Маркете, которые подходят вашим товарам
        """
        get_suggested_offer_mappings_request = {"offers":[{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-mappings/suggestions'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(get_suggested_offer_mappings_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_suggested_prices(self):
        """Test case for get_suggested_prices

        Цены для продвижения товаров
        """
        suggest_prices_request = {"offers":[{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"},{"marketSku":0,"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-prices/suggestions'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(suggest_prices_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_warehouses(self):
        """Test case for get_warehouses

        Список складов и групп складов
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/warehouses'.format(business_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_provide_order_item_identifiers(self):
        """Test case for provide_order_item_identifiers

        Передача кодов маркировки единиц товара
        """
        provide_order_item_identifiers_request = {"items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/identifiers'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(provide_order_item_identifiers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_bids_for_business(self):
        """Test case for put_bids_for_business

        Включение буста продаж и установка ставок
        """
        put_sku_bids_request = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/bids'.format(business_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(put_sku_bids_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_bids_for_campaign(self):
        """Test case for put_bids_for_campaign

        Включение буста продаж и установка ставок для магазина
        """
        put_sku_bids_request = {"bids":[{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570},{"sku":"sku","bid":570}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/bids'.format(campaign_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(put_sku_bids_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_refresh_feed(self):
        """Test case for refresh_feed

        Сообщить, что прайс-лист обновился
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds/{feed_id}/refresh'.format(campaign_id=56, feed_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_region_children(self):
        """Test case for search_region_children

        Информация о дочерних регионах
        """
        query_string = [('page', 1),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/regions/{region_id}/children'.format(region_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_regions_by_id(self):
        """Test case for search_regions_by_id

        Информация о регионе
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/regions/{region_id}'.format(region_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_regions_by_name(self):
        """Test case for search_regions_by_name

        Поиск регионов по их имени
        """
        query_string = [('name', 'name_example'),
                        ('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/regions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_send_file_to_chat(self):
        """Test case for send_file_to_chat

        Отправка файла в чат
        """
        query_string = [('chatId', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
            'Authorization': 'Bearer special-key',
        }
        data = dict(file='/path/to/file')
        response = self.client.open(
            '/businesses/{business_id}/chats/file/send'.format(business_id=56),
            method='POST',
            headers=headers,
            data=data,
            content_type='multipart/form-data',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_message_to_chat(self):
        """Test case for send_message_to_chat

        Отправка сообщения в чат
        """
        send_message_to_chat_request = {"message":"message"}
        query_string = [('chatId', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/chats/message'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(send_message_to_chat_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_feed_params(self):
        """Test case for set_feed_params

        Изменение параметров прайс-листа
        """
        set_feed_params_request = {"parameters":[{"deleted":True,"values":[0,0],"name":"name"},{"deleted":True,"values":[0,0],"name":"name"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/feeds/{feed_id}/params'.format(campaign_id=56, feed_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(set_feed_params_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_box_layout(self):
        """Test case for set_order_box_layout

        Подготовка заказа
        """
        set_order_box_layout_request = {"boxes":[{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]},{"items":[{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1},{"partialCount":{"current":1,"total":2},"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"id":0,"fullCount":1}]}],"allowRemove":False}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/boxes'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(set_order_box_layout_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_order_shipment_boxes(self):
        """Test case for set_order_shipment_boxes

        Передача количества грузовых мест в заказе
        """
        set_order_shipment_boxes_request = {"boxes":[{"fulfilmentId":"fulfilmentId","id":0},{"fulfilmentId":"fulfilmentId","id":0}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/delivery/shipments/{shipment_id}/boxes'.format(campaign_id=56, order_id=56, shipment_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(set_order_shipment_boxes_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_skip_goods_feedbacks_reaction(self):
        """Test case for skip_goods_feedbacks_reaction

        Отказ от ответа на отзывы
        """
        skip_goods_feedback_reaction_request = {"feedbackIds":[null,null,null,null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback/skip-reaction'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(skip_goods_feedback_reaction_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_business_prices(self):
        """Test case for update_business_prices

        Установка цен на товары во всех магазинах
        """
        update_business_prices_request = {"offers":[{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"},{"price":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-prices/updates'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_business_prices_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_campaign_offers(self):
        """Test case for update_campaign_offers

        Изменение условий продажи товаров в магазине
        """
        update_campaign_offers_request = {"offers":[{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}},{"available":True,"vat":0,"offerId":"offerId","quantum":{"minQuantity":1,"stepQuantity":60}}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/update'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_campaign_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_goods_feedback_comment(self):
        """Test case for update_goods_feedback_comment

        Добавление нового или изменение созданного комментария
        """
        update_goods_feedback_comment_request = {"feedbackId":0,"comment":{"id":6,"text":"text","parentId":1}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/goods-feedback/comments/update'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_goods_feedback_comment_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_offer_content(self):
        """Test case for update_offer_content

        Редактирование категорийных характеристик товара
        """
        update_offer_content_request = {"offersContent":[{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]},{"offerId":"offerId","categoryId":0,"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}]}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-cards/update'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_offer_content_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_offer_mapping_entries(self):
        """Test case for update_offer_mapping_entries

        Добавление и редактирование товаров в каталоге
        """
        update_offer_mapping_entry_request = {"offerMappingEntries":[{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}},{"offer":{"manufacturerCountries":["manufacturerCountries","manufacturerCountries"],"certificate":"certificate","description":"description","availability":"ACTIVE","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","manufacturer":"manufacturer","urls":["urls","urls"],"deliveryDurationDays":5,"feedId":0,"vendor":"LEVENHUK","transportUnitSize":1,"id":"id","lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"supplyScheduleDays":["MONDAY","MONDAY"],"lifeTimeDays":9,"quantumOfSupply":5,"barcodes":["46012300000000","46012300000000"],"customsCommodityCodes":["customsCommodityCodes","customsCommodityCodes"],"processingState":{"notes":[{"payload":"payload","type":"ASSORTMENT"},{"payload":"payload","type":"ASSORTMENT"}],"status":"UNKNOWN"},"shopSku":"shopSku","boxCount":2,"minShipment":6,"name":"Ударная дрель Makita HP1630, 710 Вт","shelfLifeDays":7,"guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","guaranteePeriodDays":3},"mapping":{"modelId":7,"marketSku":4,"categoryId":1},"awaitingModerationMapping":{"modelId":7,"marketSku":4,"categoryId":1},"rejectedMapping":{"modelId":7,"marketSku":4,"categoryId":1}}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-mapping-entries/updates'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_offer_mapping_entry_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_offer_mappings(self):
        """Test case for update_offer_mappings

        Добавление товаров в каталог и изменение информации о них
        """
        update_offer_mappings_request = {"offerMappings":[{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}}],"onlyPartnerMediaContent":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/offer-mappings/update'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_offer_mappings_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_items(self):
        """Test case for update_order_items

        Удаление товара из заказа или уменьшение числа единиц
        """
        update_order_item_request = {"reason":"PARTNER_REQUESTED_REMOVE","items":[{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0},{"instances":[{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"},{"rnpt":"rnpt","gtd":"gtd","uin":"uin","cis":"cis"}],"count":0,"id":0}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/items'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_order_item_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_status(self):
        """Test case for update_order_status

        Изменение статуса одного заказа
        """
        update_order_status_request = {"order":{"delivery":{"dates":{"realDeliveryDate":"2000-01-23"}},"substatus":"RESERVATION_EXPIRED","status":"PLACING"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/status'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_order_status_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_order_statuses(self):
        """Test case for update_order_statuses

        Изменение статусов нескольких заказов
        """
        update_order_statuses_request = {"orders":[{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"},{"substatus":"RESERVATION_EXPIRED","id":0,"status":"PLACING"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/status-update'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_order_statuses_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_prices(self):
        """Test case for update_prices

        Установка цен на товары в конкретном магазине
        """
        update_prices_request = {"offers":[{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"},{"price":{"vat":1,"discountBase":6.027456183070403,"currencyId":"RUR","value":0.8008281904610115},"offerId":"offerId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offer-prices/updates'.format(campaign_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_prices_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_promo_offers(self):
        """Test case for update_promo_offers

        Добавление товаров в акцию или изменение их цен
        """
        update_promo_offers_request = {"offers":[{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}},{"offerId":"offerId","params":{"discountParams":{"promoPrice":1,"price":1}}}],"promoId":"promoId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/businesses/{business_id}/promos/offers/update'.format(business_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(update_promo_offers_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_stocks(self):
        """Test case for update_stocks

        Передача информации об остатках
        """
        update_stocks_request = {"skus":[{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]},{"sku":"sku","items":[{"count":160165638,"updatedAt":"2000-01-23T04:56:07.000+00:00"}]}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/offers/stocks'.format(campaign_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_stocks_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_verify_order_eac(self):
        """Test case for verify_order_eac

        Передача кода подтверждения
        """
        verify_order_eac_request = {"code":"code"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/campaigns/{campaign_id}/orders/{order_id}/verifyEac'.format(campaign_id=56, order_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(verify_order_eac_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
