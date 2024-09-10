/**
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

/*
* FbyApiImpl.h
*
* 
*/

#ifndef FBY_API_IMPL_H_
#define FBY_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <FbyApi.h>


#include "AddHiddenOffersRequest.h"
#include "AddOffersToArchiveRequest.h"
#include "AddOffersToArchiveResponse.h"
#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiLockedErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "CalculateTariffsRequest.h"
#include "CalculateTariffsResponse.h"
#include "ConfirmPricesRequest.h"
#include "CreateChatRequest.h"
#include "CreateChatResponse.h"
#include "CurrencyType.h"
#include "DeleteCampaignOffersRequest.h"
#include "DeleteCampaignOffersResponse.h"
#include "DeleteGoodsFeedbackCommentRequest.h"
#include "DeleteHiddenOffersRequest.h"
#include "DeleteOffersFromArchiveRequest.h"
#include "DeleteOffersFromArchiveResponse.h"
#include "DeleteOffersRequest.h"
#include "DeleteOffersResponse.h"
#include "DeletePromoOffersRequest.h"
#include "DeletePromoOffersResponse.h"
#include "EmptyApiResponse.h"
#include "FeedIndexLogsStatusType.h"
#include "GenerateBoostConsolidatedRequest.h"
#include "GenerateCompetitorsPositionReportRequest.h"
#include "GenerateGoodsFeedbackRequest.h"
#include "GenerateGoodsMovementReportRequest.h"
#include "GenerateGoodsRealizationReportRequest.h"
#include "GenerateGoodsTurnoverRequest.h"
#include "GeneratePricesReportRequest.h"
#include "GenerateReportResponse.h"
#include "GenerateShelfsStatisticsRequest.h"
#include "GenerateShowsSalesReportRequest.h"
#include "GenerateStocksOnWarehousesReportRequest.h"
#include "GenerateUnitedMarketplaceServicesReportRequest.h"
#include "GenerateUnitedNettingReportRequest.h"
#include "GenerateUnitedOrdersRequest.h"
#include "GetAllOffersResponse.h"
#include "GetBidsInfoRequest.h"
#include "GetBidsInfoResponse.h"
#include "GetBidsRecommendationsRequest.h"
#include "GetBidsRecommendationsResponse.h"
#include "GetBusinessBuyerInfoResponse.h"
#include "GetBusinessDocumentsInfoResponse.h"
#include "GetBusinessSettingsResponse.h"
#include "GetCampaignLoginsResponse.h"
#include "GetCampaignOffersRequest.h"
#include "GetCampaignOffersResponse.h"
#include "GetCampaignRegionResponse.h"
#include "GetCampaignResponse.h"
#include "GetCampaignSettingsResponse.h"
#include "GetCampaignsResponse.h"
#include "GetCategoriesMaxSaleQuantumRequest.h"
#include "GetCategoriesMaxSaleQuantumResponse.h"
#include "GetCategoriesRequest.h"
#include "GetCategoriesResponse.h"
#include "GetCategoryContentParametersResponse.h"
#include "GetChatHistoryRequest.h"
#include "GetChatHistoryResponse.h"
#include "GetChatsRequest.h"
#include "GetChatsResponse.h"
#include "GetFeedIndexLogsResponse.h"
#include "GetFeedResponse.h"
#include "GetFeedbackListResponse.h"
#include "GetFeedsResponse.h"
#include "GetFulfillmentWarehousesResponse.h"
#include "GetGoodsFeedbackCommentsRequest.h"
#include "GetGoodsFeedbackCommentsResponse.h"
#include "GetGoodsFeedbackRequest.h"
#include "GetGoodsFeedbackResponse.h"
#include "GetGoodsStatsRequest.h"
#include "GetGoodsStatsResponse.h"
#include "GetHiddenOffersResponse.h"
#include "GetOfferCardsContentStatusRequest.h"
#include "GetOfferCardsContentStatusResponse.h"
#include "GetOfferMappingEntriesResponse.h"
#include "GetOfferMappingsRequest.h"
#include "GetOfferMappingsResponse.h"
#include "GetOfferRecommendationsRequest.h"
#include "GetOfferRecommendationsResponse.h"
#include "GetOffersResponse.h"
#include "GetOrderResponse.h"
#include "GetOrdersResponse.h"
#include "GetOrdersStatsRequest.h"
#include "GetOrdersStatsResponse.h"
#include "GetPricesByOfferIdsRequest.h"
#include "GetPricesByOfferIdsResponse.h"
#include "GetPricesResponse.h"
#include "GetPromoOffersRequest.h"
#include "GetPromoOffersResponse.h"
#include "GetPromosRequest.h"
#include "GetPromosResponse.h"
#include "GetQualityRatingRequest.h"
#include "GetQualityRatingResponse.h"
#include "GetQuarantineOffersRequest.h"
#include "GetQuarantineOffersResponse.h"
#include "GetRegionWithChildrenResponse.h"
#include "GetRegionsResponse.h"
#include "GetReportInfoResponse.h"
#include "GetReturnResponse.h"
#include "GetReturnsResponse.h"
#include "GetSuggestedOfferMappingEntriesRequest.h"
#include "GetSuggestedOfferMappingEntriesResponse.h"
#include "GetSuggestedOfferMappingsRequest.h"
#include "GetSuggestedOfferMappingsResponse.h"
#include "GetWarehouseStocksRequest.h"
#include "GetWarehouseStocksResponse.h"
#include "OfferAvailabilityStatusType.h"
#include "OfferMappingKindType.h"
#include "OfferProcessingStatusType.h"
#include "OrderBuyerType.h"
#include "OrderDeliveryDispatchType.h"
#include "OrderStatusType.h"
#include "OrderSubstatusType.h"
#include "PutSkuBidsRequest.h"
#include "RefundStatusType.h"
#include "ReportFormatType.h"
#include "ReturnType.h"
#include "SendMessageToChatRequest.h"
#include "SetFeedParamsRequest.h"
#include "SkipGoodsFeedbackReactionRequest.h"
#include "SuggestPricesRequest.h"
#include "SuggestPricesResponse.h"
#include "UpdateBusinessPricesRequest.h"
#include "UpdateCampaignOffersRequest.h"
#include "UpdateGoodsFeedbackCommentRequest.h"
#include "UpdateGoodsFeedbackCommentResponse.h"
#include "UpdateOfferContentRequest.h"
#include "UpdateOfferContentResponse.h"
#include "UpdateOfferMappingEntryRequest.h"
#include "UpdateOfferMappingsRequest.h"
#include "UpdateOfferMappingsResponse.h"
#include "UpdatePricesRequest.h"
#include "UpdatePromoOffersRequest.h"
#include "UpdatePromoOffersResponse.h"
#include <set>
#include <string>
#include <vector>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  FbyApiImpl : public org::openapitools::server::api::FbyApi {
public:
    explicit FbyApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~FbyApiImpl() override = default;

    void add_hidden_offers(const int64_t &campaignId, const AddHiddenOffersRequest &addHiddenOffersRequest, Pistache::Http::ResponseWriter &response);
    void add_offers_to_archive(const int64_t &businessId, const AddOffersToArchiveRequest &addOffersToArchiveRequest, Pistache::Http::ResponseWriter &response);
    void calculate_tariffs(const CalculateTariffsRequest &calculateTariffsRequest, Pistache::Http::ResponseWriter &response);
    void confirm_business_prices(const int64_t &businessId, const ConfirmPricesRequest &confirmPricesRequest, Pistache::Http::ResponseWriter &response);
    void confirm_campaign_prices(const int64_t &campaignId, const ConfirmPricesRequest &confirmPricesRequest, Pistache::Http::ResponseWriter &response);
    void create_chat(const int64_t &businessId, const CreateChatRequest &createChatRequest, Pistache::Http::ResponseWriter &response);
    void delete_campaign_offers(const int64_t &campaignId, const DeleteCampaignOffersRequest &deleteCampaignOffersRequest, Pistache::Http::ResponseWriter &response);
    void delete_goods_feedback_comment(const int64_t &businessId, const DeleteGoodsFeedbackCommentRequest &deleteGoodsFeedbackCommentRequest, Pistache::Http::ResponseWriter &response);
    void delete_hidden_offers(const int64_t &campaignId, const DeleteHiddenOffersRequest &deleteHiddenOffersRequest, Pistache::Http::ResponseWriter &response);
    void delete_offers(const int64_t &businessId, const DeleteOffersRequest &deleteOffersRequest, Pistache::Http::ResponseWriter &response);
    void delete_offers_from_archive(const int64_t &businessId, const DeleteOffersFromArchiveRequest &deleteOffersFromArchiveRequest, Pistache::Http::ResponseWriter &response);
    void delete_promo_offers(const int64_t &businessId, const DeletePromoOffersRequest &deletePromoOffersRequest, Pistache::Http::ResponseWriter &response);
    void generate_boost_consolidated_report(const GenerateBoostConsolidatedRequest &generateBoostConsolidatedRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_competitors_position_report(const GenerateCompetitorsPositionReportRequest &generateCompetitorsPositionReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_goods_feedback_report(const GenerateGoodsFeedbackRequest &generateGoodsFeedbackRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_goods_movement_report(const GenerateGoodsMovementReportRequest &generateGoodsMovementReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_goods_realization_report(const GenerateGoodsRealizationReportRequest &generateGoodsRealizationReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_goods_turnover_report(const GenerateGoodsTurnoverRequest &generateGoodsTurnoverRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_prices_report(const GeneratePricesReportRequest &generatePricesReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_shelfs_statistics_report(const GenerateShelfsStatisticsRequest &generateShelfsStatisticsRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_shows_sales_report(const GenerateShowsSalesReportRequest &generateShowsSalesReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_stocks_on_warehouses_report(const GenerateStocksOnWarehousesReportRequest &generateStocksOnWarehousesReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_united_marketplace_services_report(const GenerateUnitedMarketplaceServicesReportRequest &generateUnitedMarketplaceServicesReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_united_netting_report(const GenerateUnitedNettingReportRequest &generateUnitedNettingReportRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void generate_united_orders_report(const GenerateUnitedOrdersRequest &generateUnitedOrdersRequest, const std::optional<org::openapitools::server::model::ReportFormatType> &format, Pistache::Http::ResponseWriter &response);
    void get_all_offers(const int64_t &campaignId, const std::optional<int64_t> &feedId, const std::optional<int32_t> &chunk, Pistache::Http::ResponseWriter &response);
    void get_bids_info_for_business(const int64_t &businessId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const GetBidsInfoRequest &getBidsInfoRequest, Pistache::Http::ResponseWriter &response);
    void get_bids_recommendations(const int64_t &businessId, const GetBidsRecommendationsRequest &getBidsRecommendationsRequest, Pistache::Http::ResponseWriter &response);
    void get_business_quarantine_offers(const int64_t &businessId, const GetQuarantineOffersRequest &getQuarantineOffersRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_business_settings(const int64_t &businessId, Pistache::Http::ResponseWriter &response);
    void get_campaign(const int64_t &campaignId, Pistache::Http::ResponseWriter &response);
    void get_campaign_logins(const int64_t &campaignId, Pistache::Http::ResponseWriter &response);
    void get_campaign_offers(const int64_t &campaignId, const GetCampaignOffersRequest &getCampaignOffersRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_campaign_quarantine_offers(const int64_t &campaignId, const GetQuarantineOffersRequest &getQuarantineOffersRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_campaign_region(const int64_t &campaignId, Pistache::Http::ResponseWriter &response);
    void get_campaign_settings(const int64_t &campaignId, Pistache::Http::ResponseWriter &response);
    void get_campaigns(const std::optional<int32_t> &page, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void get_campaigns_by_login(const std::string &login, const std::optional<int32_t> &page, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void get_categories_max_sale_quantum(const GetCategoriesMaxSaleQuantumRequest &getCategoriesMaxSaleQuantumRequest, Pistache::Http::ResponseWriter &response);
    void get_categories_tree(const GetCategoriesRequest &getCategoriesRequest, Pistache::Http::ResponseWriter &response);
    void get_category_content_parameters(const int64_t &categoryId, Pistache::Http::ResponseWriter &response);
    void get_chat_history(const int64_t &businessId, const std::optional<int64_t> &chatId, const GetChatHistoryRequest &getChatHistoryRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_chats(const int64_t &businessId, const GetChatsRequest &getChatsRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_feed(const int64_t &campaignId, const int64_t &feedId, Pistache::Http::ResponseWriter &response);
    void get_feed_index_logs(const int64_t &campaignId, const int64_t &feedId, const std::optional<int32_t> &limit, const std::optional<std::string> &publishedTimeFrom, const std::optional<std::string> &publishedTimeTo, const std::optional<org::openapitools::server::model::FeedIndexLogsStatusType> &status, Pistache::Http::ResponseWriter &response);
    void get_feedback_and_comment_updates(const int64_t &campaignId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const std::optional<std::string> &fromDate, Pistache::Http::ResponseWriter &response);
    void get_feeds(const int64_t &campaignId, Pistache::Http::ResponseWriter &response);
    void get_fulfillment_warehouses(Pistache::Http::ResponseWriter &response);
    void get_goods_feedback_comments(const int64_t &businessId, const GetGoodsFeedbackCommentsRequest &getGoodsFeedbackCommentsRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_goods_feedbacks(const int64_t &businessId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const GetGoodsFeedbackRequest &getGoodsFeedbackRequest, Pistache::Http::ResponseWriter &response);
    void get_goods_stats(const int64_t &campaignId, const GetGoodsStatsRequest &getGoodsStatsRequest, Pistache::Http::ResponseWriter &response);
    void get_hidden_offers(const int64_t &campaignId, const std::optional<std::vector<std::string>> &offerId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, const std::optional<int32_t> &page, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void get_offer_cards_content_status(const int64_t &businessId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const GetOfferCardsContentStatusRequest &getOfferCardsContentStatusRequest, Pistache::Http::ResponseWriter &response);
    void get_offer_mapping_entries(const int64_t &campaignId, const std::optional<std::vector<std::string>> &offerId, const std::optional<std::vector<std::string>> &shopSku, const std::optional<org::openapitools::server::model::OfferMappingKindType> &mappingKind, const std::optional<std::vector<org::openapitools::server::model::OfferProcessingStatusType>> &status, const std::optional<std::vector<org::openapitools::server::model::OfferAvailabilityStatusType>> &availability, const std::optional<std::vector<int32_t>> &categoryId, const std::optional<std::vector<std::string>> &vendor, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_offer_mappings(const int64_t &businessId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const GetOfferMappingsRequest &getOfferMappingsRequest, Pistache::Http::ResponseWriter &response);
    void get_offer_recommendations(const int64_t &businessId, const GetOfferRecommendationsRequest &getOfferRecommendationsRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_offers(const int64_t &campaignId, const std::optional<std::string> &query, const std::optional<int64_t> &feedId, const std::optional<std::string> &shopCategoryId, const std::optional<org::openapitools::server::model::CurrencyType> &currency, const std::optional<bool> &matched, const std::optional<int32_t> &page, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void get_order(const int64_t &campaignId, const int64_t &orderId, Pistache::Http::ResponseWriter &response);
    void get_order_business_buyer_info(const int64_t &campaignId, const int64_t &orderId, Pistache::Http::ResponseWriter &response);
    void get_order_business_documents_info(const int64_t &campaignId, const int64_t &orderId, Pistache::Http::ResponseWriter &response);
    void get_orders(const int64_t &campaignId, const std::optional<std::vector<int64_t>> &orderIds, const std::optional<std::set<org::openapitools::server::model::OrderStatusType>> &status, const std::optional<std::set<org::openapitools::server::model::OrderSubstatusType>> &substatus, const std::optional<std::string> &fromDate, const std::optional<std::string> &toDate, const std::optional<std::string> &supplierShipmentDateFrom, const std::optional<std::string> &supplierShipmentDateTo, const std::optional<std::string> &updatedAtFrom, const std::optional<std::string> &updatedAtTo, const std::optional<org::openapitools::server::model::OrderDeliveryDispatchType> &dispatchType, const std::optional<bool> &fake, const std::optional<bool> &hasCis, const std::optional<bool> &onlyWaitingForCancellationApprove, const std::optional<bool> &onlyEstimatedDelivery, const std::optional<org::openapitools::server::model::OrderBuyerType> &buyerType, const std::optional<int32_t> &page, const std::optional<int32_t> &pageSize, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_orders_stats(const int64_t &campaignId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const GetOrdersStatsRequest &getOrdersStatsRequest, Pistache::Http::ResponseWriter &response);
    void get_prices(const int64_t &campaignId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const std::optional<bool> &archived, Pistache::Http::ResponseWriter &response);
    void get_prices_by_offer_ids(const int64_t &campaignId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const GetPricesByOfferIdsRequest &getPricesByOfferIdsRequest, Pistache::Http::ResponseWriter &response);
    void get_promo_offers(const int64_t &businessId, const GetPromoOffersRequest &getPromoOffersRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void get_promos(const int64_t &businessId, const GetPromosRequest &getPromosRequest, Pistache::Http::ResponseWriter &response);
    void get_quality_ratings(const int64_t &businessId, const GetQualityRatingRequest &getQualityRatingRequest, Pistache::Http::ResponseWriter &response);
    void get_report_info(const std::string &reportId, Pistache::Http::ResponseWriter &response);
    void get_return(const int64_t &campaignId, const int64_t &orderId, const int64_t &returnId, Pistache::Http::ResponseWriter &response);
    void get_return_photo(const int64_t &campaignId, const int64_t &orderId, const int64_t &returnId, const int64_t &itemId, const std::string &imageHash, Pistache::Http::ResponseWriter &response);
    void get_returns(const int64_t &campaignId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const std::optional<std::vector<int64_t>> &orderIds, const std::optional<std::vector<org::openapitools::server::model::RefundStatusType>> &statuses, const std::optional<org::openapitools::server::model::ReturnType> &type, const std::optional<std::string> &fromDate, const std::optional<std::string> &toDate, const std::optional<std::string> &fromDate2, const std::optional<std::string> &toDate2, Pistache::Http::ResponseWriter &response);
    void get_stocks(const int64_t &campaignId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const GetWarehouseStocksRequest &getWarehouseStocksRequest, Pistache::Http::ResponseWriter &response);
    void get_suggested_offer_mapping_entries(const int64_t &campaignId, const GetSuggestedOfferMappingEntriesRequest &getSuggestedOfferMappingEntriesRequest, Pistache::Http::ResponseWriter &response);
    void get_suggested_offer_mappings(const int64_t &businessId, const GetSuggestedOfferMappingsRequest &getSuggestedOfferMappingsRequest, Pistache::Http::ResponseWriter &response);
    void get_suggested_prices(const int64_t &campaignId, const SuggestPricesRequest &suggestPricesRequest, Pistache::Http::ResponseWriter &response);
    void put_bids_for_business(const int64_t &businessId, const PutSkuBidsRequest &putSkuBidsRequest, Pistache::Http::ResponseWriter &response);
    void put_bids_for_campaign(const int64_t &campaignId, const PutSkuBidsRequest &putSkuBidsRequest, Pistache::Http::ResponseWriter &response);
    void refresh_feed(const int64_t &campaignId, const int64_t &feedId, Pistache::Http::ResponseWriter &response);
    void search_region_children(const int64_t &regionId, const std::optional<int32_t> &page, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void search_regions_by_id(const int64_t &regionId, Pistache::Http::ResponseWriter &response);
    void search_regions_by_name(const std::optional<std::string> &name, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response);
    void send_file_to_chat(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response);
    void send_message_to_chat(const int64_t &businessId, const std::optional<int64_t> &chatId, const SendMessageToChatRequest &sendMessageToChatRequest, Pistache::Http::ResponseWriter &response);
    void set_feed_params(const int64_t &campaignId, const int64_t &feedId, const SetFeedParamsRequest &setFeedParamsRequest, Pistache::Http::ResponseWriter &response);
    void skip_goods_feedbacks_reaction(const int64_t &businessId, const SkipGoodsFeedbackReactionRequest &skipGoodsFeedbackReactionRequest, Pistache::Http::ResponseWriter &response);
    void update_business_prices(const int64_t &businessId, const UpdateBusinessPricesRequest &updateBusinessPricesRequest, Pistache::Http::ResponseWriter &response);
    void update_campaign_offers(const int64_t &campaignId, const UpdateCampaignOffersRequest &updateCampaignOffersRequest, Pistache::Http::ResponseWriter &response);
    void update_goods_feedback_comment(const int64_t &businessId, const UpdateGoodsFeedbackCommentRequest &updateGoodsFeedbackCommentRequest, Pistache::Http::ResponseWriter &response);
    void update_offer_content(const int64_t &businessId, const UpdateOfferContentRequest &updateOfferContentRequest, Pistache::Http::ResponseWriter &response);
    void update_offer_mapping_entries(const int64_t &campaignId, const UpdateOfferMappingEntryRequest &updateOfferMappingEntryRequest, Pistache::Http::ResponseWriter &response);
    void update_offer_mappings(const int64_t &businessId, const UpdateOfferMappingsRequest &updateOfferMappingsRequest, Pistache::Http::ResponseWriter &response);
    void update_prices(const int64_t &campaignId, const UpdatePricesRequest &updatePricesRequest, Pistache::Http::ResponseWriter &response);
    void update_promo_offers(const int64_t &businessId, const UpdatePromoOffersRequest &updatePromoOffersRequest, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
