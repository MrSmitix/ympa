package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AddHiddenOffersRequest
import org.openapitools.model.AddOffersToArchiveRequest
import org.openapitools.model.AddOffersToArchiveResponse
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiLockedErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.CalculateTariffsRequest
import org.openapitools.model.CalculateTariffsResponse
import org.openapitools.model.ConfirmPricesRequest
import org.openapitools.model.CreateChatRequest
import org.openapitools.model.CreateChatResponse
import org.openapitools.model.CurrencyType
import org.openapitools.model.DeleteCampaignOffersRequest
import org.openapitools.model.DeleteCampaignOffersResponse
import org.openapitools.model.DeleteGoodsFeedbackCommentRequest
import org.openapitools.model.DeleteHiddenOffersRequest
import org.openapitools.model.DeleteOffersFromArchiveRequest
import org.openapitools.model.DeleteOffersFromArchiveResponse
import org.openapitools.model.DeleteOffersRequest
import org.openapitools.model.DeleteOffersResponse
import org.openapitools.model.DeletePromoOffersRequest
import org.openapitools.model.DeletePromoOffersResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.FeedIndexLogsStatusType
import org.openapitools.model.GenerateBoostConsolidatedRequest
import org.openapitools.model.GenerateCompetitorsPositionReportRequest
import org.openapitools.model.GenerateGoodsFeedbackRequest
import org.openapitools.model.GenerateGoodsMovementReportRequest
import org.openapitools.model.GenerateGoodsRealizationReportRequest
import org.openapitools.model.GenerateGoodsTurnoverRequest
import org.openapitools.model.GeneratePricesReportRequest
import org.openapitools.model.GenerateReportResponse
import org.openapitools.model.GenerateShelfsStatisticsRequest
import org.openapitools.model.GenerateShowsSalesReportRequest
import org.openapitools.model.GenerateStocksOnWarehousesReportRequest
import org.openapitools.model.GenerateUnitedMarketplaceServicesReportRequest
import org.openapitools.model.GenerateUnitedNettingReportRequest
import org.openapitools.model.GenerateUnitedOrdersRequest
import org.openapitools.model.GetAllOffersResponse
import org.openapitools.model.GetBidsInfoRequest
import org.openapitools.model.GetBidsInfoResponse
import org.openapitools.model.GetBidsRecommendationsRequest
import org.openapitools.model.GetBidsRecommendationsResponse
import org.openapitools.model.GetBusinessBuyerInfoResponse
import org.openapitools.model.GetBusinessDocumentsInfoResponse
import org.openapitools.model.GetBusinessSettingsResponse
import org.openapitools.model.GetCampaignLoginsResponse
import org.openapitools.model.GetCampaignOffersRequest
import org.openapitools.model.GetCampaignOffersResponse
import org.openapitools.model.GetCampaignRegionResponse
import org.openapitools.model.GetCampaignResponse
import org.openapitools.model.GetCampaignSettingsResponse
import org.openapitools.model.GetCampaignsResponse
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse
import org.openapitools.model.GetCategoriesRequest
import org.openapitools.model.GetCategoriesResponse
import org.openapitools.model.GetCategoryContentParametersResponse
import org.openapitools.model.GetChatHistoryRequest
import org.openapitools.model.GetChatHistoryResponse
import org.openapitools.model.GetChatsRequest
import org.openapitools.model.GetChatsResponse
import org.openapitools.model.GetFeedIndexLogsResponse
import org.openapitools.model.GetFeedResponse
import org.openapitools.model.GetFeedbackListResponse
import org.openapitools.model.GetFeedsResponse
import org.openapitools.model.GetFulfillmentWarehousesResponse
import org.openapitools.model.GetGoodsFeedbackCommentsRequest
import org.openapitools.model.GetGoodsFeedbackCommentsResponse
import org.openapitools.model.GetGoodsFeedbackRequest
import org.openapitools.model.GetGoodsFeedbackResponse
import org.openapitools.model.GetGoodsStatsRequest
import org.openapitools.model.GetGoodsStatsResponse
import org.openapitools.model.GetHiddenOffersResponse
import org.openapitools.model.GetOfferCardsContentStatusRequest
import org.openapitools.model.GetOfferCardsContentStatusResponse
import org.openapitools.model.GetOfferMappingEntriesResponse
import org.openapitools.model.GetOfferMappingsRequest
import org.openapitools.model.GetOfferMappingsResponse
import org.openapitools.model.GetOfferRecommendationsRequest
import org.openapitools.model.GetOfferRecommendationsResponse
import org.openapitools.model.GetOffersResponse
import org.openapitools.model.GetOrderResponse
import org.openapitools.model.GetOrdersResponse
import org.openapitools.model.GetOrdersStatsRequest
import org.openapitools.model.GetOrdersStatsResponse
import org.openapitools.model.GetPricesByOfferIdsRequest
import org.openapitools.model.GetPricesByOfferIdsResponse
import org.openapitools.model.GetPricesResponse
import org.openapitools.model.GetPromoOffersRequest
import org.openapitools.model.GetPromoOffersResponse
import org.openapitools.model.GetPromosRequest
import org.openapitools.model.GetPromosResponse
import org.openapitools.model.GetQualityRatingRequest
import org.openapitools.model.GetQualityRatingResponse
import org.openapitools.model.GetQuarantineOffersRequest
import org.openapitools.model.GetQuarantineOffersResponse
import org.openapitools.model.GetRegionWithChildrenResponse
import org.openapitools.model.GetRegionsResponse
import org.openapitools.model.GetReportInfoResponse
import org.openapitools.model.GetReturnResponse
import org.openapitools.model.GetReturnsResponse
import org.openapitools.model.GetSuggestedOfferMappingEntriesRequest
import org.openapitools.model.GetSuggestedOfferMappingEntriesResponse
import org.openapitools.model.GetSuggestedOfferMappingsRequest
import org.openapitools.model.GetSuggestedOfferMappingsResponse
import org.openapitools.model.GetWarehouseStocksRequest
import org.openapitools.model.GetWarehouseStocksResponse
import org.openapitools.model.OfferAvailabilityStatusType
import org.openapitools.model.OfferMappingKindType
import org.openapitools.model.OfferProcessingStatusType
import org.openapitools.model.OrderBuyerType
import org.openapitools.model.OrderDeliveryDispatchType
import org.openapitools.model.OrderStatusType
import org.openapitools.model.OrderSubstatusType
import org.openapitools.model.PutSkuBidsRequest
import org.openapitools.model.RefundStatusType
import org.openapitools.model.ReportFormatType
import org.openapitools.model.ReturnType
import org.openapitools.model.SendMessageToChatRequest
import java.util.Set
import org.openapitools.model.SetFeedParamsRequest
import org.openapitools.model.SkipGoodsFeedbackReactionRequest
import org.openapitools.model.SuggestPricesRequest
import org.openapitools.model.SuggestPricesResponse
import org.openapitools.model.UpdateBusinessPricesRequest
import org.openapitools.model.UpdateCampaignOffersRequest
import org.openapitools.model.UpdateGoodsFeedbackCommentRequest
import org.openapitools.model.UpdateGoodsFeedbackCommentResponse
import org.openapitools.model.UpdateOfferContentRequest
import org.openapitools.model.UpdateOfferContentResponse
import org.openapitools.model.UpdateOfferMappingEntryRequest
import org.openapitools.model.UpdateOfferMappingsRequest
import org.openapitools.model.UpdateOfferMappingsResponse
import org.openapitools.model.UpdatePricesRequest
import org.openapitools.model.UpdatePromoOffersRequest
import org.openapitools.model.UpdatePromoOffersResponse

class FbyApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addHiddenOffers ( Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/hidden-offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (addHiddenOffersRequest == null) {
            throw new RuntimeException("missing required params addHiddenOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = addHiddenOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def addOffersToArchive ( Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/archive"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (addOffersToArchiveRequest == null) {
            throw new RuntimeException("missing required params addOffersToArchiveRequest")
        }



        contentType = 'application/json';
        bodyParams = addOffersToArchiveRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AddOffersToArchiveResponse.class )

    }

    def calculateTariffs ( CalculateTariffsRequest calculateTariffsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/tariffs/calculate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (calculateTariffsRequest == null) {
            throw new RuntimeException("missing required params calculateTariffsRequest")
        }



        contentType = 'application/json';
        bodyParams = calculateTariffsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CalculateTariffsResponse.class )

    }

    def confirmBusinessPrices ( Long businessId, ConfirmPricesRequest confirmPricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/price-quarantine/confirm"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (confirmPricesRequest == null) {
            throw new RuntimeException("missing required params confirmPricesRequest")
        }



        contentType = 'application/json';
        bodyParams = confirmPricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def confirmCampaignPrices ( Long campaignId, ConfirmPricesRequest confirmPricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/price-quarantine/confirm"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (confirmPricesRequest == null) {
            throw new RuntimeException("missing required params confirmPricesRequest")
        }



        contentType = 'application/json';
        bodyParams = confirmPricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def createChat ( Long businessId, CreateChatRequest createChatRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats/new"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (createChatRequest == null) {
            throw new RuntimeException("missing required params createChatRequest")
        }



        contentType = 'application/json';
        bodyParams = createChatRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateChatResponse.class )

    }

    def deleteCampaignOffers ( Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/delete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (deleteCampaignOffersRequest == null) {
            throw new RuntimeException("missing required params deleteCampaignOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteCampaignOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    DeleteCampaignOffersResponse.class )

    }

    def deleteGoodsFeedbackComment ( Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback/comments/delete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (deleteGoodsFeedbackCommentRequest == null) {
            throw new RuntimeException("missing required params deleteGoodsFeedbackCommentRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteGoodsFeedbackCommentRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def deleteHiddenOffers ( Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/hidden-offers/delete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (deleteHiddenOffersRequest == null) {
            throw new RuntimeException("missing required params deleteHiddenOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteHiddenOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def deleteOffers ( Long businessId, DeleteOffersRequest deleteOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/delete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (deleteOffersRequest == null) {
            throw new RuntimeException("missing required params deleteOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    DeleteOffersResponse.class )

    }

    def deleteOffersFromArchive ( Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/unarchive"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (deleteOffersFromArchiveRequest == null) {
            throw new RuntimeException("missing required params deleteOffersFromArchiveRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteOffersFromArchiveRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    DeleteOffersFromArchiveResponse.class )

    }

    def deletePromoOffers ( Long businessId, DeletePromoOffersRequest deletePromoOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/promos/offers/delete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (deletePromoOffersRequest == null) {
            throw new RuntimeException("missing required params deletePromoOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = deletePromoOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    DeletePromoOffersResponse.class )

    }

    def generateBoostConsolidatedReport ( GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/boost-consolidated/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateBoostConsolidatedRequest == null) {
            throw new RuntimeException("missing required params generateBoostConsolidatedRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateBoostConsolidatedRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateCompetitorsPositionReport ( GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/competitors-position/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateCompetitorsPositionReportRequest == null) {
            throw new RuntimeException("missing required params generateCompetitorsPositionReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateCompetitorsPositionReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateGoodsFeedbackReport ( GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/goods-feedback/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateGoodsFeedbackRequest == null) {
            throw new RuntimeException("missing required params generateGoodsFeedbackRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateGoodsFeedbackRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateGoodsMovementReport ( GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/goods-movement/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateGoodsMovementReportRequest == null) {
            throw new RuntimeException("missing required params generateGoodsMovementReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateGoodsMovementReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateGoodsRealizationReport ( GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/goods-realization/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateGoodsRealizationReportRequest == null) {
            throw new RuntimeException("missing required params generateGoodsRealizationReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateGoodsRealizationReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateGoodsTurnoverReport ( GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/goods-turnover/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateGoodsTurnoverRequest == null) {
            throw new RuntimeException("missing required params generateGoodsTurnoverRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateGoodsTurnoverRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generatePricesReport ( GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/prices/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generatePricesReportRequest == null) {
            throw new RuntimeException("missing required params generatePricesReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generatePricesReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateShelfsStatisticsReport ( GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/shelf-statistics/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateShelfsStatisticsRequest == null) {
            throw new RuntimeException("missing required params generateShelfsStatisticsRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateShelfsStatisticsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateShowsSalesReport ( GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/shows-sales/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateShowsSalesReportRequest == null) {
            throw new RuntimeException("missing required params generateShowsSalesReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateShowsSalesReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateStocksOnWarehousesReport ( GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/stocks-on-warehouses/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateStocksOnWarehousesReportRequest == null) {
            throw new RuntimeException("missing required params generateStocksOnWarehousesReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateStocksOnWarehousesReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateUnitedMarketplaceServicesReport ( GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/united-marketplace-services/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateUnitedMarketplaceServicesReportRequest == null) {
            throw new RuntimeException("missing required params generateUnitedMarketplaceServicesReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateUnitedMarketplaceServicesReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateUnitedNettingReport ( GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/united-netting/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateUnitedNettingReportRequest == null) {
            throw new RuntimeException("missing required params generateUnitedNettingReportRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateUnitedNettingReportRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def generateUnitedOrdersReport ( GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/united-orders/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (generateUnitedOrdersRequest == null) {
            throw new RuntimeException("missing required params generateUnitedOrdersRequest")
        }

        if (format != null) {
            queryParams.put("format", format)
        }


        contentType = 'application/json';
        bodyParams = generateUnitedOrdersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GenerateReportResponse.class )

    }

    def getAllOffers ( Long campaignId, Long feedId, Integer chunk, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/all"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (feedId != null) {
            queryParams.put("feedId", feedId)
        }
        if (chunk != null) {
            queryParams.put("chunk", chunk)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetAllOffersResponse.class )

    }

    def getBidsInfoForBusiness ( Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/bids/info"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getBidsInfoRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetBidsInfoResponse.class )

    }

    def getBidsRecommendations ( Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/bids/recommendations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getBidsRecommendationsRequest == null) {
            throw new RuntimeException("missing required params getBidsRecommendationsRequest")
        }



        contentType = 'application/json';
        bodyParams = getBidsRecommendationsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetBidsRecommendationsResponse.class )

    }

    def getBusinessQuarantineOffers ( Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/price-quarantine"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getQuarantineOffersRequest == null) {
            throw new RuntimeException("missing required params getQuarantineOffersRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getQuarantineOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetQuarantineOffersResponse.class )

    }

    def getBusinessSettings ( Long businessId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/settings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetBusinessSettingsResponse.class )

    }

    def getCampaign ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCampaignResponse.class )

    }

    def getCampaignLogins ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/logins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCampaignLoginsResponse.class )

    }

    def getCampaignOffers ( Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (getCampaignOffersRequest == null) {
            throw new RuntimeException("missing required params getCampaignOffersRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getCampaignOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetCampaignOffersResponse.class )

    }

    def getCampaignQuarantineOffers ( Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/price-quarantine"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (getQuarantineOffersRequest == null) {
            throw new RuntimeException("missing required params getQuarantineOffersRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getQuarantineOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetQuarantineOffersResponse.class )

    }

    def getCampaignRegion ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/region"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCampaignRegionResponse.class )

    }

    def getCampaignSettings ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/settings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCampaignSettingsResponse.class )

    }

    def getCampaigns ( Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCampaignsResponse.class )

    }

    def getCampaignsByLogin ( String login, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/by_login/${login}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (login == null) {
            throw new RuntimeException("missing required params login")
        }

        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCampaignsResponse.class )

    }

    def getCategoriesMaxSaleQuantum ( GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/categories/max-sale-quantum"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (getCategoriesMaxSaleQuantumRequest == null) {
            throw new RuntimeException("missing required params getCategoriesMaxSaleQuantumRequest")
        }



        contentType = 'application/json';
        bodyParams = getCategoriesMaxSaleQuantumRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetCategoriesMaxSaleQuantumResponse.class )

    }

    def getCategoriesTree ( GetCategoriesRequest getCategoriesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/categories/tree"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType




        contentType = 'application/json';
        bodyParams = getCategoriesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetCategoriesResponse.class )

    }

    def getCategoryContentParameters ( Long categoryId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/category/${categoryId}/parameters"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (categoryId == null) {
            throw new RuntimeException("missing required params categoryId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetCategoryContentParametersResponse.class )

    }

    def getChatHistory ( Long businessId, Long chatId, GetChatHistoryRequest getChatHistoryRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats/history"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (chatId == null) {
            throw new RuntimeException("missing required params chatId")
        }
        // verify required params are set
        if (getChatHistoryRequest == null) {
            throw new RuntimeException("missing required params getChatHistoryRequest")
        }

        if (chatId != null) {
            queryParams.put("chatId", chatId)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getChatHistoryRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetChatHistoryResponse.class )

    }

    def getChats ( Long businessId, GetChatsRequest getChatsRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getChatsRequest == null) {
            throw new RuntimeException("missing required params getChatsRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getChatsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetChatsResponse.class )

    }

    def getFeed ( Long campaignId, Long feedId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds/${feedId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetFeedResponse.class )

    }

    def getFeedIndexLogs ( Long campaignId, Long feedId, Integer limit, Date publishedTimeFrom, Date publishedTimeTo, FeedIndexLogsStatusType status, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds/${feedId}/index-logs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (publishedTimeFrom != null) {
            queryParams.put("published_time_from", publishedTimeFrom)
        }
        if (publishedTimeTo != null) {
            queryParams.put("published_time_to", publishedTimeTo)
        }
        if (status != null) {
            queryParams.put("status", status)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetFeedIndexLogsResponse.class )

    }

    def getFeedbackAndCommentUpdates ( Long campaignId, String pageToken, Integer limit, Date fromDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feedback/updates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (fromDate != null) {
            queryParams.put("from_date", fromDate)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetFeedbackListResponse.class )

    }

    def getFeeds ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetFeedsResponse.class )

    }

    def getFulfillmentWarehouses ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/warehouses"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetFulfillmentWarehousesResponse.class )

    }

    def getGoodsFeedbackComments ( Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback/comments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getGoodsFeedbackCommentsRequest == null) {
            throw new RuntimeException("missing required params getGoodsFeedbackCommentsRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getGoodsFeedbackCommentsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetGoodsFeedbackCommentsResponse.class )

    }

    def getGoodsFeedbacks ( Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getGoodsFeedbackRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetGoodsFeedbackResponse.class )

    }

    def getGoodsStats ( Long campaignId, GetGoodsStatsRequest getGoodsStatsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/stats/skus"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (getGoodsStatsRequest == null) {
            throw new RuntimeException("missing required params getGoodsStatsRequest")
        }



        contentType = 'application/json';
        bodyParams = getGoodsStatsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetGoodsStatsResponse.class )

    }

    def getHiddenOffers ( Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/hidden-offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (offerId != null) {
            queryParams.put("offer_id", offerId)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetHiddenOffersResponse.class )

    }

    def getOfferCardsContentStatus ( Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-cards"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getOfferCardsContentStatusRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetOfferCardsContentStatusResponse.class )

    }

    def getOfferMappingEntries ( Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-mapping-entries"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (offerId != null) {
            queryParams.put("offer_id", offerId)
        }
        if (shopSku != null) {
            queryParams.put("shop_sku", shopSku)
        }
        if (mappingKind != null) {
            queryParams.put("mapping_kind", mappingKind)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (availability != null) {
            queryParams.put("availability", availability)
        }
        if (categoryId != null) {
            queryParams.put("category_id", categoryId)
        }
        if (vendor != null) {
            queryParams.put("vendor", vendor)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOfferMappingEntriesResponse.class )

    }

    def getOfferMappings ( Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getOfferMappingsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetOfferMappingsResponse.class )

    }

    def getOfferRecommendations ( Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offers/recommendations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getOfferRecommendationsRequest == null) {
            throw new RuntimeException("missing required params getOfferRecommendationsRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getOfferRecommendationsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetOfferRecommendationsResponse.class )

    }

    def getOffers ( Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (query != null) {
            queryParams.put("query", query)
        }
        if (feedId != null) {
            queryParams.put("feedId", feedId)
        }
        if (shopCategoryId != null) {
            queryParams.put("shopCategoryId", shopCategoryId)
        }
        if (currency != null) {
            queryParams.put("currency", currency)
        }
        if (matched != null) {
            queryParams.put("matched", matched)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOffersResponse.class )

    }

    def getOrder ( Long campaignId, Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOrderResponse.class )

    }

    def getOrderBusinessBuyerInfo ( Long campaignId, Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/business-buyer"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetBusinessBuyerInfoResponse.class )

    }

    def getOrderBusinessDocumentsInfo ( Long campaignId, Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/documents"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetBusinessDocumentsInfoResponse.class )

    }

    def getOrders ( Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, Date updatedAtFrom, Date updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (orderIds != null) {
            queryParams.put("orderIds", orderIds)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (substatus != null) {
            queryParams.put("substatus", substatus)
        }
        if (fromDate != null) {
            queryParams.put("fromDate", fromDate)
        }
        if (toDate != null) {
            queryParams.put("toDate", toDate)
        }
        if (supplierShipmentDateFrom != null) {
            queryParams.put("supplierShipmentDateFrom", supplierShipmentDateFrom)
        }
        if (supplierShipmentDateTo != null) {
            queryParams.put("supplierShipmentDateTo", supplierShipmentDateTo)
        }
        if (updatedAtFrom != null) {
            queryParams.put("updatedAtFrom", updatedAtFrom)
        }
        if (updatedAtTo != null) {
            queryParams.put("updatedAtTo", updatedAtTo)
        }
        if (dispatchType != null) {
            queryParams.put("dispatchType", dispatchType)
        }
        if (fake != null) {
            queryParams.put("fake", fake)
        }
        if (hasCis != null) {
            queryParams.put("hasCis", hasCis)
        }
        if (onlyWaitingForCancellationApprove != null) {
            queryParams.put("onlyWaitingForCancellationApprove", onlyWaitingForCancellationApprove)
        }
        if (onlyEstimatedDelivery != null) {
            queryParams.put("onlyEstimatedDelivery", onlyEstimatedDelivery)
        }
        if (buyerType != null) {
            queryParams.put("buyerType", buyerType)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOrdersResponse.class )

    }

    def getOrdersStats ( Long campaignId, String pageToken, Integer limit, GetOrdersStatsRequest getOrdersStatsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/stats/orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getOrdersStatsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetOrdersStatsResponse.class )

    }

    def getPrices ( Long campaignId, String pageToken, Integer limit, Boolean archived, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-prices"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (archived != null) {
            queryParams.put("archived", archived)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetPricesResponse.class )

    }

    def getPricesByOfferIds ( Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-prices"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getPricesByOfferIdsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetPricesByOfferIdsResponse.class )

    }

    def getPromoOffers ( Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/promos/offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getPromoOffersRequest == null) {
            throw new RuntimeException("missing required params getPromoOffersRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getPromoOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetPromoOffersResponse.class )

    }

    def getPromos ( Long businessId, GetPromosRequest getPromosRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/promos"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }



        contentType = 'application/json';
        bodyParams = getPromosRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetPromosResponse.class )

    }

    def getQualityRatings ( Long businessId, GetQualityRatingRequest getQualityRatingRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/ratings/quality"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getQualityRatingRequest == null) {
            throw new RuntimeException("missing required params getQualityRatingRequest")
        }



        contentType = 'application/json';
        bodyParams = getQualityRatingRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetQualityRatingResponse.class )

    }

    def getReportInfo ( String reportId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/reports/info/${reportId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (reportId == null) {
            throw new RuntimeException("missing required params reportId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetReportInfoResponse.class )

    }

    def getReturn ( Long campaignId, Long orderId, Long returnId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (returnId == null) {
            throw new RuntimeException("missing required params returnId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetReturnResponse.class )

    }

    def getReturnPhoto ( Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision/${itemId}/image/${imageHash}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (returnId == null) {
            throw new RuntimeException("missing required params returnId")
        }
        // verify required params are set
        if (itemId == null) {
            throw new RuntimeException("missing required params itemId")
        }
        // verify required params are set
        if (imageHash == null) {
            throw new RuntimeException("missing required params imageHash")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def getReturns ( Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/returns"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (orderIds != null) {
            queryParams.put("orderIds", orderIds)
        }
        if (statuses != null) {
            queryParams.put("statuses", statuses)
        }
        if (type != null) {
            queryParams.put("type", type)
        }
        if (fromDate != null) {
            queryParams.put("fromDate", fromDate)
        }
        if (toDate != null) {
            queryParams.put("toDate", toDate)
        }
        if (fromDate2 != null) {
            queryParams.put("from_date", fromDate2)
        }
        if (toDate2 != null) {
            queryParams.put("to_date", toDate2)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetReturnsResponse.class )

    }

    def getStocks ( Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/stocks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getWarehouseStocksRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetWarehouseStocksResponse.class )

    }

    def getSuggestedOfferMappingEntries ( Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-mapping-entries/suggestions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (getSuggestedOfferMappingEntriesRequest == null) {
            throw new RuntimeException("missing required params getSuggestedOfferMappingEntriesRequest")
        }



        contentType = 'application/json';
        bodyParams = getSuggestedOfferMappingEntriesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetSuggestedOfferMappingEntriesResponse.class )

    }

    def getSuggestedOfferMappings ( Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/suggestions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }



        contentType = 'application/json';
        bodyParams = getSuggestedOfferMappingsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetSuggestedOfferMappingsResponse.class )

    }

    def getSuggestedPrices ( Long campaignId, SuggestPricesRequest suggestPricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-prices/suggestions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (suggestPricesRequest == null) {
            throw new RuntimeException("missing required params suggestPricesRequest")
        }



        contentType = 'application/json';
        bodyParams = suggestPricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    SuggestPricesResponse.class )

    }

    def putBidsForBusiness ( Long businessId, PutSkuBidsRequest putSkuBidsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/bids"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (putSkuBidsRequest == null) {
            throw new RuntimeException("missing required params putSkuBidsRequest")
        }



        contentType = 'application/json';
        bodyParams = putSkuBidsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

    def putBidsForCampaign ( Long campaignId, PutSkuBidsRequest putSkuBidsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/bids"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (putSkuBidsRequest == null) {
            throw new RuntimeException("missing required params putSkuBidsRequest")
        }



        contentType = 'application/json';
        bodyParams = putSkuBidsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

    def refreshFeed ( Long campaignId, Long feedId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds/${feedId}/refresh"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def searchRegionChildren ( Long regionId, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/regions/${regionId}/children"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }

        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetRegionWithChildrenResponse.class )

    }

    def searchRegionsById ( Long regionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/regions/${regionId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetRegionsResponse.class )

    }

    def searchRegionsByName ( String name, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/regions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        if (name != null) {
            queryParams.put("name", name)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetRegionsResponse.class )

    }

    def sendFileToChat ( Long businessId, Long chatId, File _file, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats/file/send"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (chatId == null) {
            throw new RuntimeException("missing required params chatId")
        }
        // verify required params are set
        if (_file == null) {
            throw new RuntimeException("missing required params _file")
        }

        if (chatId != null) {
            queryParams.put("chatId", chatId)
        }



        contentType = 'multipart/form-data';
        bodyParams = _file

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def sendMessageToChat ( Long businessId, Long chatId, SendMessageToChatRequest sendMessageToChatRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/chats/message"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (chatId == null) {
            throw new RuntimeException("missing required params chatId")
        }
        // verify required params are set
        if (sendMessageToChatRequest == null) {
            throw new RuntimeException("missing required params sendMessageToChatRequest")
        }

        if (chatId != null) {
            queryParams.put("chatId", chatId)
        }


        contentType = 'application/json';
        bodyParams = sendMessageToChatRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def setFeedParams ( Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds/${feedId}/params"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }
        // verify required params are set
        if (setFeedParamsRequest == null) {
            throw new RuntimeException("missing required params setFeedParamsRequest")
        }



        contentType = 'application/json';
        bodyParams = setFeedParamsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def skipGoodsFeedbacksReaction ( Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback/skip-reaction"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (skipGoodsFeedbackReactionRequest == null) {
            throw new RuntimeException("missing required params skipGoodsFeedbackReactionRequest")
        }



        contentType = 'application/json';
        bodyParams = skipGoodsFeedbackReactionRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def updateBusinessPrices ( Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-prices/updates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (updateBusinessPricesRequest == null) {
            throw new RuntimeException("missing required params updateBusinessPricesRequest")
        }



        contentType = 'application/json';
        bodyParams = updateBusinessPricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def updateCampaignOffers ( Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/update"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (updateCampaignOffersRequest == null) {
            throw new RuntimeException("missing required params updateCampaignOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = updateCampaignOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def updateGoodsFeedbackComment ( Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback/comments/update"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (updateGoodsFeedbackCommentRequest == null) {
            throw new RuntimeException("missing required params updateGoodsFeedbackCommentRequest")
        }



        contentType = 'application/json';
        bodyParams = updateGoodsFeedbackCommentRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdateGoodsFeedbackCommentResponse.class )

    }

    def updateOfferContent ( Long businessId, UpdateOfferContentRequest updateOfferContentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-cards/update"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (updateOfferContentRequest == null) {
            throw new RuntimeException("missing required params updateOfferContentRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOfferContentRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdateOfferContentResponse.class )

    }

    def updateOfferMappingEntries ( Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-mapping-entries/updates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (updateOfferMappingEntryRequest == null) {
            throw new RuntimeException("missing required params updateOfferMappingEntryRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOfferMappingEntryRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def updateOfferMappings ( Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/update"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (updateOfferMappingsRequest == null) {
            throw new RuntimeException("missing required params updateOfferMappingsRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOfferMappingsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdateOfferMappingsResponse.class )

    }

    def updatePrices ( Long campaignId, UpdatePricesRequest updatePricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-prices/updates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (updatePricesRequest == null) {
            throw new RuntimeException("missing required params updatePricesRequest")
        }



        contentType = 'application/json';
        bodyParams = updatePricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def updatePromoOffers ( Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/promos/offers/update"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (updatePromoOffersRequest == null) {
            throw new RuntimeException("missing required params updatePromoOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = updatePromoOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdatePromoOffersResponse.class )

    }

}
