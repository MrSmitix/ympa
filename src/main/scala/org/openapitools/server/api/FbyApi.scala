package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.StringDirectives
import org.openapitools.server.MultipartDirectives
import org.openapitools.server.FileField
import org.openapitools.server.PartsAndFiles
import org.openapitools.server.model.AddHiddenOffersRequest
import org.openapitools.server.model.AddOffersToArchiveRequest
import org.openapitools.server.model.AddOffersToArchiveResponse
import org.openapitools.server.model.ApiClientDataErrorResponse
import org.openapitools.server.model.ApiForbiddenErrorResponse
import org.openapitools.server.model.ApiLimitErrorResponse
import org.openapitools.server.model.ApiLockedErrorResponse
import org.openapitools.server.model.ApiNotFoundErrorResponse
import org.openapitools.server.model.ApiServerErrorResponse
import org.openapitools.server.model.ApiUnauthorizedErrorResponse
import org.openapitools.server.model.CalculateTariffsRequest
import org.openapitools.server.model.CalculateTariffsResponse
import org.openapitools.server.model.ConfirmPricesRequest
import org.openapitools.server.model.CreateChatRequest
import org.openapitools.server.model.CreateChatResponse
import org.openapitools.server.model.CurrencyType
import org.openapitools.server.model.DeleteCampaignOffersRequest
import org.openapitools.server.model.DeleteCampaignOffersResponse
import org.openapitools.server.model.DeleteGoodsFeedbackCommentRequest
import org.openapitools.server.model.DeleteHiddenOffersRequest
import org.openapitools.server.model.DeleteOffersFromArchiveRequest
import org.openapitools.server.model.DeleteOffersFromArchiveResponse
import org.openapitools.server.model.DeleteOffersRequest
import org.openapitools.server.model.DeleteOffersResponse
import org.openapitools.server.model.DeletePromoOffersRequest
import org.openapitools.server.model.DeletePromoOffersResponse
import org.openapitools.server.model.EmptyApiResponse
import org.openapitools.server.model.FeedIndexLogsStatusType
import java.io.File
import org.openapitools.server.model.GenerateBoostConsolidatedRequest
import org.openapitools.server.model.GenerateCompetitorsPositionReportRequest
import org.openapitools.server.model.GenerateGoodsFeedbackRequest
import org.openapitools.server.model.GenerateGoodsMovementReportRequest
import org.openapitools.server.model.GenerateGoodsRealizationReportRequest
import org.openapitools.server.model.GenerateGoodsTurnoverRequest
import org.openapitools.server.model.GeneratePricesReportRequest
import org.openapitools.server.model.GenerateReportResponse
import org.openapitools.server.model.GenerateShelfsStatisticsRequest
import org.openapitools.server.model.GenerateShowsSalesReportRequest
import org.openapitools.server.model.GenerateStocksOnWarehousesReportRequest
import org.openapitools.server.model.GenerateUnitedMarketplaceServicesReportRequest
import org.openapitools.server.model.GenerateUnitedNettingReportRequest
import org.openapitools.server.model.GenerateUnitedOrdersRequest
import org.openapitools.server.model.GetAllOffersResponse
import org.openapitools.server.model.GetBidsInfoRequest
import org.openapitools.server.model.GetBidsInfoResponse
import org.openapitools.server.model.GetBidsRecommendationsRequest
import org.openapitools.server.model.GetBidsRecommendationsResponse
import org.openapitools.server.model.GetBusinessBuyerInfoResponse
import org.openapitools.server.model.GetBusinessDocumentsInfoResponse
import org.openapitools.server.model.GetBusinessSettingsResponse
import org.openapitools.server.model.GetCampaignLoginsResponse
import org.openapitools.server.model.GetCampaignOffersRequest
import org.openapitools.server.model.GetCampaignOffersResponse
import org.openapitools.server.model.GetCampaignRegionResponse
import org.openapitools.server.model.GetCampaignResponse
import org.openapitools.server.model.GetCampaignSettingsResponse
import org.openapitools.server.model.GetCampaignsResponse
import org.openapitools.server.model.GetCategoriesMaxSaleQuantumRequest
import org.openapitools.server.model.GetCategoriesMaxSaleQuantumResponse
import org.openapitools.server.model.GetCategoriesRequest
import org.openapitools.server.model.GetCategoriesResponse
import org.openapitools.server.model.GetCategoryContentParametersResponse
import org.openapitools.server.model.GetChatHistoryRequest
import org.openapitools.server.model.GetChatHistoryResponse
import org.openapitools.server.model.GetChatsRequest
import org.openapitools.server.model.GetChatsResponse
import org.openapitools.server.model.GetFeedIndexLogsResponse
import org.openapitools.server.model.GetFeedResponse
import org.openapitools.server.model.GetFeedbackListResponse
import org.openapitools.server.model.GetFeedsResponse
import org.openapitools.server.model.GetFulfillmentWarehousesResponse
import org.openapitools.server.model.GetGoodsFeedbackCommentsRequest
import org.openapitools.server.model.GetGoodsFeedbackCommentsResponse
import org.openapitools.server.model.GetGoodsFeedbackRequest
import org.openapitools.server.model.GetGoodsFeedbackResponse
import org.openapitools.server.model.GetGoodsStatsRequest
import org.openapitools.server.model.GetGoodsStatsResponse
import org.openapitools.server.model.GetHiddenOffersResponse
import org.openapitools.server.model.GetOfferCardsContentStatusRequest
import org.openapitools.server.model.GetOfferCardsContentStatusResponse
import org.openapitools.server.model.GetOfferMappingEntriesResponse
import org.openapitools.server.model.GetOfferMappingsRequest
import org.openapitools.server.model.GetOfferMappingsResponse
import org.openapitools.server.model.GetOfferRecommendationsRequest
import org.openapitools.server.model.GetOfferRecommendationsResponse
import org.openapitools.server.model.GetOffersResponse
import org.openapitools.server.model.GetOrderResponse
import org.openapitools.server.model.GetOrdersResponse
import org.openapitools.server.model.GetOrdersStatsRequest
import org.openapitools.server.model.GetOrdersStatsResponse
import org.openapitools.server.model.GetPricesByOfferIdsRequest
import org.openapitools.server.model.GetPricesByOfferIdsResponse
import org.openapitools.server.model.GetPricesResponse
import org.openapitools.server.model.GetPromoOffersRequest
import org.openapitools.server.model.GetPromoOffersResponse
import org.openapitools.server.model.GetPromosRequest
import org.openapitools.server.model.GetPromosResponse
import org.openapitools.server.model.GetQualityRatingRequest
import org.openapitools.server.model.GetQualityRatingResponse
import org.openapitools.server.model.GetQuarantineOffersRequest
import org.openapitools.server.model.GetQuarantineOffersResponse
import org.openapitools.server.model.GetRegionWithChildrenResponse
import org.openapitools.server.model.GetRegionsResponse
import org.openapitools.server.model.GetReportInfoResponse
import org.openapitools.server.model.GetReturnResponse
import org.openapitools.server.model.GetReturnsResponse
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesRequest
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesResponse
import org.openapitools.server.model.GetSuggestedOfferMappingsRequest
import org.openapitools.server.model.GetSuggestedOfferMappingsResponse
import org.openapitools.server.model.GetWarehouseStocksRequest
import org.openapitools.server.model.GetWarehouseStocksResponse
import java.time.LocalDate
import org.openapitools.server.model.OfferAvailabilityStatusType
import org.openapitools.server.model.OfferMappingKindType
import org.openapitools.server.model.OfferProcessingStatusType
import java.time.OffsetDateTime
import org.openapitools.server.model.OrderBuyerType
import org.openapitools.server.model.OrderDeliveryDispatchType
import org.openapitools.server.model.OrderStatusType
import org.openapitools.server.model.OrderSubstatusType
import org.openapitools.server.model.PutSkuBidsRequest
import org.openapitools.server.model.RefundStatusType
import org.openapitools.server.model.ReportFormatType
import org.openapitools.server.model.ReturnType
import org.openapitools.server.model.SendMessageToChatRequest
import org.openapitools.server.model.Set
import org.openapitools.server.model.SetFeedParamsRequest
import org.openapitools.server.model.SkipGoodsFeedbackReactionRequest
import org.openapitools.server.model.SuggestPricesRequest
import org.openapitools.server.model.SuggestPricesResponse
import org.openapitools.server.model.UpdateBusinessPricesRequest
import org.openapitools.server.model.UpdateCampaignOffersRequest
import org.openapitools.server.model.UpdateGoodsFeedbackCommentRequest
import org.openapitools.server.model.UpdateGoodsFeedbackCommentResponse
import org.openapitools.server.model.UpdateOfferContentRequest
import org.openapitools.server.model.UpdateOfferContentResponse
import org.openapitools.server.model.UpdateOfferMappingEntryRequest
import org.openapitools.server.model.UpdateOfferMappingsRequest
import org.openapitools.server.model.UpdateOfferMappingsResponse
import org.openapitools.server.model.UpdatePricesRequest
import org.openapitools.server.model.UpdatePromoOffersRequest
import org.openapitools.server.model.UpdatePromoOffersResponse
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class FbyApi(
    fbyService: FbyApiService,
    fbyMarshaller: FbyApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import fbyMarshaller._

  lazy val route: Route =
    path("campaigns" / LongNumber / "hidden-offers") { (campaignId) => 
      post {  
            entity(as[AddHiddenOffersRequest]){ addHiddenOffersRequest =>
              fbyService.addHiddenOffers(campaignId = campaignId, addHiddenOffersRequest = addHiddenOffersRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "offer-mappings" / "archive") { (businessId) => 
      post {  
            entity(as[AddOffersToArchiveRequest]){ addOffersToArchiveRequest =>
              fbyService.addOffersToArchive(businessId = businessId, addOffersToArchiveRequest = addOffersToArchiveRequest)
            }
      }
    } ~
    path("tariffs" / "calculate") { 
      post {  
            entity(as[CalculateTariffsRequest]){ calculateTariffsRequest =>
              fbyService.calculateTariffs(calculateTariffsRequest = calculateTariffsRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "price-quarantine" / "confirm") { (businessId) => 
      post {  
            entity(as[ConfirmPricesRequest]){ confirmPricesRequest =>
              fbyService.confirmBusinessPrices(businessId = businessId, confirmPricesRequest = confirmPricesRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "price-quarantine" / "confirm") { (campaignId) => 
      post {  
            entity(as[ConfirmPricesRequest]){ confirmPricesRequest =>
              fbyService.confirmCampaignPrices(campaignId = campaignId, confirmPricesRequest = confirmPricesRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "chats" / "new") { (businessId) => 
      post {  
            entity(as[CreateChatRequest]){ createChatRequest =>
              fbyService.createChat(businessId = businessId, createChatRequest = createChatRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "offers" / "delete") { (campaignId) => 
      post {  
            entity(as[DeleteCampaignOffersRequest]){ deleteCampaignOffersRequest =>
              fbyService.deleteCampaignOffers(campaignId = campaignId, deleteCampaignOffersRequest = deleteCampaignOffersRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "goods-feedback" / "comments" / "delete") { (businessId) => 
      post {  
            entity(as[DeleteGoodsFeedbackCommentRequest]){ deleteGoodsFeedbackCommentRequest =>
              fbyService.deleteGoodsFeedbackComment(businessId = businessId, deleteGoodsFeedbackCommentRequest = deleteGoodsFeedbackCommentRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "hidden-offers" / "delete") { (campaignId) => 
      post {  
            entity(as[DeleteHiddenOffersRequest]){ deleteHiddenOffersRequest =>
              fbyService.deleteHiddenOffers(campaignId = campaignId, deleteHiddenOffersRequest = deleteHiddenOffersRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "offer-mappings" / "delete") { (businessId) => 
      post {  
            entity(as[DeleteOffersRequest]){ deleteOffersRequest =>
              fbyService.deleteOffers(businessId = businessId, deleteOffersRequest = deleteOffersRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "offer-mappings" / "unarchive") { (businessId) => 
      post {  
            entity(as[DeleteOffersFromArchiveRequest]){ deleteOffersFromArchiveRequest =>
              fbyService.deleteOffersFromArchive(businessId = businessId, deleteOffersFromArchiveRequest = deleteOffersFromArchiveRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "promos" / "offers" / "delete") { (businessId) => 
      post {  
            entity(as[DeletePromoOffersRequest]){ deletePromoOffersRequest =>
              fbyService.deletePromoOffers(businessId = businessId, deletePromoOffersRequest = deletePromoOffersRequest)
            }
      }
    } ~
    path("reports" / "boost-consolidated" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateBoostConsolidatedRequest]){ generateBoostConsolidatedRequest =>
              fbyService.generateBoostConsolidatedReport(generateBoostConsolidatedRequest = generateBoostConsolidatedRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "competitors-position" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateCompetitorsPositionReportRequest]){ generateCompetitorsPositionReportRequest =>
              fbyService.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest = generateCompetitorsPositionReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "goods-feedback" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateGoodsFeedbackRequest]){ generateGoodsFeedbackRequest =>
              fbyService.generateGoodsFeedbackReport(generateGoodsFeedbackRequest = generateGoodsFeedbackRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "goods-movement" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateGoodsMovementReportRequest]){ generateGoodsMovementReportRequest =>
              fbyService.generateGoodsMovementReport(generateGoodsMovementReportRequest = generateGoodsMovementReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "goods-realization" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateGoodsRealizationReportRequest]){ generateGoodsRealizationReportRequest =>
              fbyService.generateGoodsRealizationReport(generateGoodsRealizationReportRequest = generateGoodsRealizationReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "goods-turnover" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateGoodsTurnoverRequest]){ generateGoodsTurnoverRequest =>
              fbyService.generateGoodsTurnoverReport(generateGoodsTurnoverRequest = generateGoodsTurnoverRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "prices" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GeneratePricesReportRequest]){ generatePricesReportRequest =>
              fbyService.generatePricesReport(generatePricesReportRequest = generatePricesReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "shelf-statistics" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateShelfsStatisticsRequest]){ generateShelfsStatisticsRequest =>
              fbyService.generateShelfsStatisticsReport(generateShelfsStatisticsRequest = generateShelfsStatisticsRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "shows-sales" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateShowsSalesReportRequest]){ generateShowsSalesReportRequest =>
              fbyService.generateShowsSalesReport(generateShowsSalesReportRequest = generateShowsSalesReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "stocks-on-warehouses" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateStocksOnWarehousesReportRequest]){ generateStocksOnWarehousesReportRequest =>
              fbyService.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest = generateStocksOnWarehousesReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "united-marketplace-services" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateUnitedMarketplaceServicesReportRequest]){ generateUnitedMarketplaceServicesReportRequest =>
              fbyService.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest = generateUnitedMarketplaceServicesReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "united-netting" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateUnitedNettingReportRequest]){ generateUnitedNettingReportRequest =>
              fbyService.generateUnitedNettingReport(generateUnitedNettingReportRequest = generateUnitedNettingReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "united-orders" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateUnitedOrdersRequest]){ generateUnitedOrdersRequest =>
              fbyService.generateUnitedOrdersReport(generateUnitedOrdersRequest = generateUnitedOrdersRequest, format = format)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "offers" / "all") { (campaignId) => 
      get { 
        parameters("feedId".as[Long].?, "chunk".as[Int].?) { (feedId, chunk) => 
            fbyService.getAllOffers(campaignId = campaignId, feedId = feedId, chunk = chunk)
        }
      }
    } ~
    path("businesses" / LongNumber / "bids" / "info") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetBidsInfoRequest]){ getBidsInfoRequest =>
              fbyService.getBidsInfoForBusiness(businessId = businessId, pageToken = pageToken, limit = limit, getBidsInfoRequest = getBidsInfoRequest)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "bids" / "recommendations") { (businessId) => 
      post {  
            entity(as[GetBidsRecommendationsRequest]){ getBidsRecommendationsRequest =>
              fbyService.getBidsRecommendations(businessId = businessId, getBidsRecommendationsRequest = getBidsRecommendationsRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "price-quarantine") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetQuarantineOffersRequest]){ getQuarantineOffersRequest =>
              fbyService.getBusinessQuarantineOffers(businessId = businessId, getQuarantineOffersRequest = getQuarantineOffersRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "settings") { (businessId) => 
      post {  
            fbyService.getBusinessSettings(businessId = businessId)
      }
    } ~
    path("campaigns" / LongNumber) { (campaignId) => 
      get {  
            fbyService.getCampaign(campaignId = campaignId)
      }
    } ~
    path("campaigns" / LongNumber / "logins") { (campaignId) => 
      get {  
            fbyService.getCampaignLogins(campaignId = campaignId)
      }
    } ~
    path("campaigns" / LongNumber / "offers") { (campaignId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetCampaignOffersRequest]){ getCampaignOffersRequest =>
              fbyService.getCampaignOffers(campaignId = campaignId, getCampaignOffersRequest = getCampaignOffersRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "price-quarantine") { (campaignId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetQuarantineOffersRequest]){ getQuarantineOffersRequest =>
              fbyService.getCampaignQuarantineOffers(campaignId = campaignId, getQuarantineOffersRequest = getQuarantineOffersRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "region") { (campaignId) => 
      get {  
            fbyService.getCampaignRegion(campaignId = campaignId)
      }
    } ~
    path("campaigns" / LongNumber / "settings") { (campaignId) => 
      get {  
            fbyService.getCampaignSettings(campaignId = campaignId)
      }
    } ~
    path("campaigns") { 
      get { 
        parameters("page".as[Int].?(1), "pageSize".as[Int].?) { (page, pageSize) => 
            fbyService.getCampaigns(page = page, pageSize = pageSize)
        }
      }
    } ~
    path("campaigns" / "by_login" / Segment) { (login) => 
      get { 
        parameters("page".as[Int].?(1), "pageSize".as[Int].?) { (page, pageSize) => 
            fbyService.getCampaignsByLogin(login = login, page = page, pageSize = pageSize)
        }
      }
    } ~
    path("categories" / "max-sale-quantum") { 
      post {  
            entity(as[GetCategoriesMaxSaleQuantumRequest]){ getCategoriesMaxSaleQuantumRequest =>
              fbyService.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest = getCategoriesMaxSaleQuantumRequest)
            }
      }
    } ~
    path("categories" / "tree") { 
      post {  
            entity(as[GetCategoriesRequest]){ getCategoriesRequest =>
              fbyService.getCategoriesTree(getCategoriesRequest = getCategoriesRequest)
            }
      }
    } ~
    path("category" / LongNumber / "parameters") { (categoryId) => 
      post {  
            fbyService.getCategoryContentParameters(categoryId = categoryId)
      }
    } ~
    path("businesses" / LongNumber / "chats" / "history") { (businessId) => 
      post { 
        parameters("chatId".as[Long], "page_token".as[String].?, "limit".as[Int].?) { (chatId, pageToken, limit) => 
            entity(as[GetChatHistoryRequest]){ getChatHistoryRequest =>
              fbyService.getChatHistory(businessId = businessId, chatId = chatId, getChatHistoryRequest = getChatHistoryRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "chats") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetChatsRequest]){ getChatsRequest =>
              fbyService.getChats(businessId = businessId, getChatsRequest = getChatsRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "feeds" / LongNumber) { (campaignId, feedId) => 
      get {  
            fbyService.getFeed(campaignId = campaignId, feedId = feedId)
      }
    } ~
    path("campaigns" / LongNumber / "feeds" / LongNumber / "index-logs") { (campaignId, feedId) => 
      get { 
        parameters("limit".as[Int].?, "published_time_from".as[String].?, "published_time_to".as[String].?, "status".as[String].?) { (limit, publishedTimeFrom, publishedTimeTo, status) => 
            fbyService.getFeedIndexLogs(campaignId = campaignId, feedId = feedId, limit = limit, publishedTimeFrom = publishedTimeFrom, publishedTimeTo = publishedTimeTo, status = status)
        }
      }
    } ~
    path("campaigns" / LongNumber / "feedback" / "updates") { (campaignId) => 
      get { 
        parameters("page_token".as[String].?, "limit".as[Int].?, "from_date".as[String].?) { (pageToken, limit, fromDate) => 
            fbyService.getFeedbackAndCommentUpdates(campaignId = campaignId, pageToken = pageToken, limit = limit, fromDate = fromDate)
        }
      }
    } ~
    path("campaigns" / LongNumber / "feeds") { (campaignId) => 
      get {  
            fbyService.getFeeds(campaignId = campaignId)
      }
    } ~
    path("warehouses") { 
      get {  
            fbyService.getFulfillmentWarehouses()
      }
    } ~
    path("businesses" / LongNumber / "goods-feedback" / "comments") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetGoodsFeedbackCommentsRequest]){ getGoodsFeedbackCommentsRequest =>
              fbyService.getGoodsFeedbackComments(businessId = businessId, getGoodsFeedbackCommentsRequest = getGoodsFeedbackCommentsRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "goods-feedback") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetGoodsFeedbackRequest]){ getGoodsFeedbackRequest =>
              fbyService.getGoodsFeedbacks(businessId = businessId, pageToken = pageToken, limit = limit, getGoodsFeedbackRequest = getGoodsFeedbackRequest)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "stats" / "skus") { (campaignId) => 
      post {  
            entity(as[GetGoodsStatsRequest]){ getGoodsStatsRequest =>
              fbyService.getGoodsStats(campaignId = campaignId, getGoodsStatsRequest = getGoodsStatsRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "hidden-offers") { (campaignId) => 
      get { 
        parameters("offer_id".as[String].?, "page_token".as[String].?, "limit".as[Int].?, "offset".as[Int].?, "page".as[Int].?(1), "pageSize".as[Int].?) { (offerId, pageToken, limit, offset, page, pageSize) => 
            fbyService.getHiddenOffers(campaignId = campaignId, offerId = offerId, pageToken = pageToken, limit = limit, offset = offset, page = page, pageSize = pageSize)
        }
      }
    } ~
    path("businesses" / LongNumber / "offer-cards") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetOfferCardsContentStatusRequest]){ getOfferCardsContentStatusRequest =>
              fbyService.getOfferCardsContentStatus(businessId = businessId, pageToken = pageToken, limit = limit, getOfferCardsContentStatusRequest = getOfferCardsContentStatusRequest)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "offer-mapping-entries") { (campaignId) => 
      get { 
        parameters("offer_id".as[String].?, "shop_sku".as[String].?, "mapping_kind".as[String].?, "status".as[String].?, "availability".as[String].?, "category_id".as[String].?, "vendor".as[String].?, "page_token".as[String].?, "limit".as[Int].?) { (offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit) => 
            fbyService.getOfferMappingEntries(campaignId = campaignId, offerId = offerId, shopSku = shopSku, mappingKind = mappingKind, status = status, availability = availability, categoryId = categoryId, vendor = vendor, pageToken = pageToken, limit = limit)
        }
      }
    } ~
    path("businesses" / LongNumber / "offer-mappings") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetOfferMappingsRequest]){ getOfferMappingsRequest =>
              fbyService.getOfferMappings(businessId = businessId, pageToken = pageToken, limit = limit, getOfferMappingsRequest = getOfferMappingsRequest)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "offers" / "recommendations") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetOfferRecommendationsRequest]){ getOfferRecommendationsRequest =>
              fbyService.getOfferRecommendations(businessId = businessId, getOfferRecommendationsRequest = getOfferRecommendationsRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "offers") { (campaignId) => 
      get { 
        parameters("query".as[String].?, "feedId".as[Long].?, "shopCategoryId".as[String].?, "currency".as[String].?, "matched".as[Boolean].?, "page".as[Int].?(1), "pageSize".as[Int].?) { (query, feedId, shopCategoryId, currency, matched, page, pageSize) => 
            fbyService.getOffers(campaignId = campaignId, query = query, feedId = feedId, shopCategoryId = shopCategoryId, currency = currency, matched = matched, page = page, pageSize = pageSize)
        }
      }
    } ~
    path("campaigns" / LongNumber / "orders" / LongNumber) { (campaignId, orderId) => 
      get {  
            fbyService.getOrder(campaignId = campaignId, orderId = orderId)
      }
    } ~
    path("campaigns" / LongNumber / "orders" / LongNumber / "business-buyer") { (campaignId, orderId) => 
      post {  
            fbyService.getOrderBusinessBuyerInfo(campaignId = campaignId, orderId = orderId)
      }
    } ~
    path("campaigns" / LongNumber / "orders" / LongNumber / "documents") { (campaignId, orderId) => 
      post {  
            fbyService.getOrderBusinessDocumentsInfo(campaignId = campaignId, orderId = orderId)
      }
    } ~
    path("campaigns" / LongNumber / "orders") { (campaignId) => 
      get { 
        parameters("orderIds".as[String].?, "status".as[String].?, "substatus".as[String].?, "fromDate".as[String].?, "toDate".as[String].?, "supplierShipmentDateFrom".as[String].?, "supplierShipmentDateTo".as[String].?, "updatedAtFrom".as[String].?, "updatedAtTo".as[String].?, "dispatchType".as[String].?, "fake".as[Boolean].?(false), "hasCis".as[Boolean].?(false), "onlyWaitingForCancellationApprove".as[Boolean].?(false), "onlyEstimatedDelivery".as[Boolean].?(false), "buyerType".as[String].?, "page".as[Int].?(1), "pageSize".as[Int].?, "page_token".as[String].?, "limit".as[Int].?) { (orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit) => 
            fbyService.getOrders(campaignId = campaignId, orderIds = orderIds, status = status, substatus = substatus, fromDate = fromDate, toDate = toDate, supplierShipmentDateFrom = supplierShipmentDateFrom, supplierShipmentDateTo = supplierShipmentDateTo, updatedAtFrom = updatedAtFrom, updatedAtTo = updatedAtTo, dispatchType = dispatchType, fake = fake, hasCis = hasCis, onlyWaitingForCancellationApprove = onlyWaitingForCancellationApprove, onlyEstimatedDelivery = onlyEstimatedDelivery, buyerType = buyerType, page = page, pageSize = pageSize, pageToken = pageToken, limit = limit)
        }
      }
    } ~
    path("campaigns" / LongNumber / "stats" / "orders") { (campaignId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetOrdersStatsRequest]){ getOrdersStatsRequest =>
              fbyService.getOrdersStats(campaignId = campaignId, pageToken = pageToken, limit = limit, getOrdersStatsRequest = getOrdersStatsRequest)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "offer-prices") { (campaignId) => 
      get { 
        parameters("page_token".as[String].?, "limit".as[Int].?, "archived".as[Boolean].?(false)) { (pageToken, limit, archived) => 
            fbyService.getPrices(campaignId = campaignId, pageToken = pageToken, limit = limit, archived = archived)
        }
      }
    } ~
    path("campaigns" / LongNumber / "offer-prices") { (campaignId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetPricesByOfferIdsRequest]){ getPricesByOfferIdsRequest =>
              fbyService.getPricesByOfferIds(campaignId = campaignId, pageToken = pageToken, limit = limit, getPricesByOfferIdsRequest = getPricesByOfferIdsRequest)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "promos" / "offers") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetPromoOffersRequest]){ getPromoOffersRequest =>
              fbyService.getPromoOffers(businessId = businessId, getPromoOffersRequest = getPromoOffersRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("businesses" / LongNumber / "promos") { (businessId) => 
      post {  
            entity(as[GetPromosRequest]){ getPromosRequest =>
              fbyService.getPromos(businessId = businessId, getPromosRequest = getPromosRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "ratings" / "quality") { (businessId) => 
      post {  
            entity(as[GetQualityRatingRequest]){ getQualityRatingRequest =>
              fbyService.getQualityRatings(businessId = businessId, getQualityRatingRequest = getQualityRatingRequest)
            }
      }
    } ~
    path("reports" / "info" / Segment) { (reportId) => 
      get {  
            fbyService.getReportInfo(reportId = reportId)
      }
    } ~
    path("campaigns" / LongNumber / "orders" / LongNumber / "returns" / LongNumber) { (campaignId, orderId, returnId) => 
      get {  
            fbyService.getReturn(campaignId = campaignId, orderId = orderId, returnId = returnId)
      }
    } ~
    path("campaigns" / LongNumber / "orders" / LongNumber / "returns" / LongNumber / "decision" / LongNumber / "image" / Segment) { (campaignId, orderId, returnId, itemId, imageHash) => 
      get {  
            fbyService.getReturnPhoto(campaignId = campaignId, orderId = orderId, returnId = returnId, itemId = itemId, imageHash = imageHash)
      }
    } ~
    path("campaigns" / LongNumber / "returns") { (campaignId) => 
      get { 
        parameters("page_token".as[String].?, "limit".as[Int].?, "orderIds".as[String].?, "statuses".as[String].?, "type".as[String].?, "fromDate".as[String].?, "toDate".as[String].?, "from_date".as[String].?, "to_date".as[String].?) { (pageToken, limit, orderIds, statuses, `type`, fromDate, toDate, fromDate2, toDate2) => 
            fbyService.getReturns(campaignId = campaignId, pageToken = pageToken, limit = limit, orderIds = orderIds, statuses = statuses, `type` = `type`, fromDate = fromDate, toDate = toDate, fromDate2 = fromDate2, toDate2 = toDate2)
        }
      }
    } ~
    path("campaigns" / LongNumber / "offers" / "stocks") { (campaignId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetWarehouseStocksRequest]){ getWarehouseStocksRequest =>
              fbyService.getStocks(campaignId = campaignId, pageToken = pageToken, limit = limit, getWarehouseStocksRequest = getWarehouseStocksRequest)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "offer-mapping-entries" / "suggestions") { (campaignId) => 
      post {  
            entity(as[GetSuggestedOfferMappingEntriesRequest]){ getSuggestedOfferMappingEntriesRequest =>
              fbyService.getSuggestedOfferMappingEntries(campaignId = campaignId, getSuggestedOfferMappingEntriesRequest = getSuggestedOfferMappingEntriesRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "offer-mappings" / "suggestions") { (businessId) => 
      post {  
            entity(as[GetSuggestedOfferMappingsRequest]){ getSuggestedOfferMappingsRequest =>
              fbyService.getSuggestedOfferMappings(businessId = businessId, getSuggestedOfferMappingsRequest = getSuggestedOfferMappingsRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "offer-prices" / "suggestions") { (campaignId) => 
      post {  
            entity(as[SuggestPricesRequest]){ suggestPricesRequest =>
              fbyService.getSuggestedPrices(campaignId = campaignId, suggestPricesRequest = suggestPricesRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "bids") { (businessId) => 
      put {  
            entity(as[PutSkuBidsRequest]){ putSkuBidsRequest =>
              fbyService.putBidsForBusiness(businessId = businessId, putSkuBidsRequest = putSkuBidsRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "bids") { (campaignId) => 
      put {  
            entity(as[PutSkuBidsRequest]){ putSkuBidsRequest =>
              fbyService.putBidsForCampaign(campaignId = campaignId, putSkuBidsRequest = putSkuBidsRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "feeds" / LongNumber / "refresh") { (campaignId, feedId) => 
      post {  
            fbyService.refreshFeed(campaignId = campaignId, feedId = feedId)
      }
    } ~
    path("regions" / LongNumber / "children") { (regionId) => 
      get { 
        parameters("page".as[Int].?(1), "pageSize".as[Int].?) { (page, pageSize) => 
            fbyService.searchRegionChildren(regionId = regionId, page = page, pageSize = pageSize)
        }
      }
    } ~
    path("regions" / LongNumber) { (regionId) => 
      get {  
            fbyService.searchRegionsById(regionId = regionId)
      }
    } ~
    path("regions") { 
      get { 
        parameters("name".as[String], "page_token".as[String].?, "limit".as[Int].?) { (name, pageToken, limit) => 
            fbyService.searchRegionsByName(name = name, pageToken = pageToken, limit = limit)
        }
      }
    } ~
    path("businesses" / LongNumber / "chats" / "file" / "send") { (businessId) => 
      post { 
        parameters("chatId".as[Long]) { (chatId) => 
        formAndFiles(FileField("file")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              fbyService.sendFileToChat(businessId = businessId, chatId = chatId, file = file)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
        }
      }
    } ~
    path("businesses" / LongNumber / "chats" / "message") { (businessId) => 
      post { 
        parameters("chatId".as[Long]) { (chatId) => 
            entity(as[SendMessageToChatRequest]){ sendMessageToChatRequest =>
              fbyService.sendMessageToChat(businessId = businessId, chatId = chatId, sendMessageToChatRequest = sendMessageToChatRequest)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "feeds" / LongNumber / "params") { (campaignId, feedId) => 
      post {  
            entity(as[SetFeedParamsRequest]){ setFeedParamsRequest =>
              fbyService.setFeedParams(campaignId = campaignId, feedId = feedId, setFeedParamsRequest = setFeedParamsRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "goods-feedback" / "skip-reaction") { (businessId) => 
      post {  
            entity(as[SkipGoodsFeedbackReactionRequest]){ skipGoodsFeedbackReactionRequest =>
              fbyService.skipGoodsFeedbacksReaction(businessId = businessId, skipGoodsFeedbackReactionRequest = skipGoodsFeedbackReactionRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "offer-prices" / "updates") { (businessId) => 
      post {  
            entity(as[UpdateBusinessPricesRequest]){ updateBusinessPricesRequest =>
              fbyService.updateBusinessPrices(businessId = businessId, updateBusinessPricesRequest = updateBusinessPricesRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "offers" / "update") { (campaignId) => 
      post {  
            entity(as[UpdateCampaignOffersRequest]){ updateCampaignOffersRequest =>
              fbyService.updateCampaignOffers(campaignId = campaignId, updateCampaignOffersRequest = updateCampaignOffersRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "goods-feedback" / "comments" / "update") { (businessId) => 
      post {  
            entity(as[UpdateGoodsFeedbackCommentRequest]){ updateGoodsFeedbackCommentRequest =>
              fbyService.updateGoodsFeedbackComment(businessId = businessId, updateGoodsFeedbackCommentRequest = updateGoodsFeedbackCommentRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "offer-cards" / "update") { (businessId) => 
      post {  
            entity(as[UpdateOfferContentRequest]){ updateOfferContentRequest =>
              fbyService.updateOfferContent(businessId = businessId, updateOfferContentRequest = updateOfferContentRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "offer-mapping-entries" / "updates") { (campaignId) => 
      post {  
            entity(as[UpdateOfferMappingEntryRequest]){ updateOfferMappingEntryRequest =>
              fbyService.updateOfferMappingEntries(campaignId = campaignId, updateOfferMappingEntryRequest = updateOfferMappingEntryRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "offer-mappings" / "update") { (businessId) => 
      post {  
            entity(as[UpdateOfferMappingsRequest]){ updateOfferMappingsRequest =>
              fbyService.updateOfferMappings(businessId = businessId, updateOfferMappingsRequest = updateOfferMappingsRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "offer-prices" / "updates") { (campaignId) => 
      post {  
            entity(as[UpdatePricesRequest]){ updatePricesRequest =>
              fbyService.updatePrices(campaignId = campaignId, updatePricesRequest = updatePricesRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "promos" / "offers" / "update") { (businessId) => 
      post {  
            entity(as[UpdatePromoOffersRequest]){ updatePromoOffersRequest =>
              fbyService.updatePromoOffers(businessId = businessId, updatePromoOffersRequest = updatePromoOffersRequest)
            }
      }
    }
}


trait FbyApiService {

  def addHiddenOffers200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def addHiddenOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def addHiddenOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def addHiddenOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def addHiddenOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def addHiddenOffers423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def addHiddenOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Настройки скрытия получены и скоро вступят в силу., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def addOffersToArchive200(responseAddOffersToArchiveResponse: AddOffersToArchiveResponse)(implicit toEntityMarshallerAddOffersToArchiveResponse: ToEntityMarshaller[AddOffersToArchiveResponse]): Route =
    complete((200, responseAddOffersToArchiveResponse))
  def addOffersToArchive400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def addOffersToArchive401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def addOffersToArchive403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def addOffersToArchive404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def addOffersToArchive420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def addOffersToArchive423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def addOffersToArchive500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. , DataType: AddOffersToArchiveResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerAddOffersToArchiveResponse: ToEntityMarshaller[AddOffersToArchiveResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def calculateTariffs200(responseCalculateTariffsResponse: CalculateTariffsResponse)(implicit toEntityMarshallerCalculateTariffsResponse: ToEntityMarshaller[CalculateTariffsResponse]): Route =
    complete((200, responseCalculateTariffsResponse))
  def calculateTariffs400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def calculateTariffs401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def calculateTariffs403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def calculateTariffs404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def calculateTariffs420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def calculateTariffs500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Стоимость услуг., DataType: CalculateTariffsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest)
      (implicit toEntityMarshallerCalculateTariffsResponse: ToEntityMarshaller[CalculateTariffsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def confirmBusinessPrices200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def confirmBusinessPrices400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def confirmBusinessPrices401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def confirmBusinessPrices403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def confirmBusinessPrices404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def confirmBusinessPrices420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def confirmBusinessPrices423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def confirmBusinessPrices500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Ответ 200 обозначает, что цены подтверждены., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def confirmCampaignPrices200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def confirmCampaignPrices400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def confirmCampaignPrices401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def confirmCampaignPrices403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def confirmCampaignPrices404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def confirmCampaignPrices420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def confirmCampaignPrices423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def confirmCampaignPrices500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Ответ 200 обозначает, что цены подтверждены., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def createChat200(responseCreateChatResponse: CreateChatResponse)(implicit toEntityMarshallerCreateChatResponse: ToEntityMarshaller[CreateChatResponse]): Route =
    complete((200, responseCreateChatResponse))
  def createChat400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def createChat401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def createChat403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def createChat404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def createChat420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def createChat500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Все получилось: чат создан. , DataType: CreateChatResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def createChat(businessId: Long, createChatRequest: CreateChatRequest)
      (implicit toEntityMarshallerCreateChatResponse: ToEntityMarshaller[CreateChatResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def deleteCampaignOffers200(responseDeleteCampaignOffersResponse: DeleteCampaignOffersResponse)(implicit toEntityMarshallerDeleteCampaignOffersResponse: ToEntityMarshaller[DeleteCampaignOffersResponse]): Route =
    complete((200, responseDeleteCampaignOffersResponse))
  def deleteCampaignOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def deleteCampaignOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def deleteCampaignOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def deleteCampaignOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def deleteCampaignOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def deleteCampaignOffers423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def deleteCampaignOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине., DataType: DeleteCampaignOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest)
      (implicit toEntityMarshallerDeleteCampaignOffersResponse: ToEntityMarshaller[DeleteCampaignOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def deleteGoodsFeedbackComment200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def deleteGoodsFeedbackComment400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def deleteGoodsFeedbackComment401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def deleteGoodsFeedbackComment403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def deleteGoodsFeedbackComment404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def deleteGoodsFeedbackComment420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def deleteGoodsFeedbackComment500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Пустой ответ., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def deleteHiddenOffers200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def deleteHiddenOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def deleteHiddenOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def deleteHiddenOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def deleteHiddenOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def deleteHiddenOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def deleteHiddenOffers423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def deleteHiddenOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Показ товаров возобновлен., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def deleteOffers200(responseDeleteOffersResponse: DeleteOffersResponse)(implicit toEntityMarshallerDeleteOffersResponse: ToEntityMarshaller[DeleteOffersResponse]): Route =
    complete((200, responseDeleteOffersResponse))
  def deleteOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def deleteOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def deleteOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def deleteOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def deleteOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def deleteOffers423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def deleteOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине., DataType: DeleteOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerDeleteOffersResponse: ToEntityMarshaller[DeleteOffersResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def deleteOffersFromArchive200(responseDeleteOffersFromArchiveResponse: DeleteOffersFromArchiveResponse)(implicit toEntityMarshallerDeleteOffersFromArchiveResponse: ToEntityMarshaller[DeleteOffersFromArchiveResponse]): Route =
    complete((200, responseDeleteOffersFromArchiveResponse))
  def deleteOffersFromArchive400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def deleteOffersFromArchive401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def deleteOffersFromArchive403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def deleteOffersFromArchive404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def deleteOffersFromArchive420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def deleteOffersFromArchive423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def deleteOffersFromArchive500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. , DataType: DeleteOffersFromArchiveResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerDeleteOffersFromArchiveResponse: ToEntityMarshaller[DeleteOffersFromArchiveResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def deletePromoOffers200(responseDeletePromoOffersResponse: DeletePromoOffersResponse)(implicit toEntityMarshallerDeletePromoOffersResponse: ToEntityMarshaller[DeletePromoOffersResponse]): Route =
    complete((200, responseDeletePromoOffersResponse))
  def deletePromoOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def deletePromoOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def deletePromoOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def deletePromoOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def deletePromoOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def deletePromoOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Результат удаления товаров из акции., DataType: DeletePromoOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerDeletePromoOffersResponse: ToEntityMarshaller[DeletePromoOffersResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateBoostConsolidatedReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateBoostConsolidatedReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateBoostConsolidatedReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateBoostConsolidatedReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateBoostConsolidatedReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateBoostConsolidatedReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateCompetitorsPositionReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateCompetitorsPositionReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateCompetitorsPositionReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateCompetitorsPositionReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateCompetitorsPositionReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateCompetitorsPositionReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateGoodsFeedbackReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateGoodsFeedbackReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateGoodsFeedbackReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateGoodsFeedbackReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateGoodsFeedbackReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateGoodsFeedbackReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateGoodsMovementReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateGoodsMovementReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateGoodsMovementReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateGoodsMovementReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateGoodsMovementReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateGoodsMovementReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateGoodsMovementReport(generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateGoodsRealizationReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateGoodsRealizationReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateGoodsRealizationReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateGoodsRealizationReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateGoodsRealizationReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateGoodsRealizationReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateGoodsTurnoverReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateGoodsTurnoverReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateGoodsTurnoverReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateGoodsTurnoverReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateGoodsTurnoverReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateGoodsTurnoverReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateGoodsTurnoverReport(generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generatePricesReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generatePricesReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generatePricesReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generatePricesReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generatePricesReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generatePricesReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateShelfsStatisticsReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateShelfsStatisticsReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateShelfsStatisticsReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateShelfsStatisticsReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateShelfsStatisticsReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateShelfsStatisticsReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateShowsSalesReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateShowsSalesReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateShowsSalesReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateShowsSalesReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateShowsSalesReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateShowsSalesReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateStocksOnWarehousesReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateStocksOnWarehousesReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateStocksOnWarehousesReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateStocksOnWarehousesReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateStocksOnWarehousesReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateStocksOnWarehousesReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateUnitedMarketplaceServicesReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateUnitedMarketplaceServicesReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateUnitedMarketplaceServicesReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateUnitedMarketplaceServicesReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateUnitedMarketplaceServicesReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateUnitedMarketplaceServicesReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateUnitedNettingReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateUnitedNettingReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateUnitedNettingReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateUnitedNettingReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateUnitedNettingReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateUnitedNettingReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateUnitedOrdersReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateUnitedOrdersReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateUnitedOrdersReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateUnitedOrdersReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateUnitedOrdersReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateUnitedOrdersReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getAllOffers200(responseGetAllOffersResponse: GetAllOffersResponse)(implicit toEntityMarshallerGetAllOffersResponse: ToEntityMarshaller[GetAllOffersResponse]): Route =
    complete((200, responseGetAllOffersResponse))
  def getAllOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getAllOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getAllOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getAllOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getAllOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getAllOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Предложения магазина., DataType: GetAllOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getAllOffers(campaignId: Long, feedId: Option[Long], chunk: Option[Int])
      (implicit toEntityMarshallerGetAllOffersResponse: ToEntityMarshaller[GetAllOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getBidsInfoForBusiness200(responseGetBidsInfoResponse: GetBidsInfoResponse)(implicit toEntityMarshallerGetBidsInfoResponse: ToEntityMarshaller[GetBidsInfoResponse]): Route =
    complete((200, responseGetBidsInfoResponse))
  def getBidsInfoForBusiness400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getBidsInfoForBusiness401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getBidsInfoForBusiness403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getBidsInfoForBusiness404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getBidsInfoForBusiness420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getBidsInfoForBusiness500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки., DataType: GetBidsInfoResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getBidsInfoForBusiness(businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: Option[GetBidsInfoRequest])
      (implicit toEntityMarshallerGetBidsInfoResponse: ToEntityMarshaller[GetBidsInfoResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getBidsRecommendations200(responseGetBidsRecommendationsResponse: GetBidsRecommendationsResponse)(implicit toEntityMarshallerGetBidsRecommendationsResponse: ToEntityMarshaller[GetBidsRecommendationsResponse]): Route =
    complete((200, responseGetBidsRecommendationsResponse))
  def getBidsRecommendations400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getBidsRecommendations401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getBidsRecommendations403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getBidsRecommendations404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getBidsRecommendations420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getBidsRecommendations500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Рекомендованные ставки для заданных товаров., DataType: GetBidsRecommendationsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetBidsRecommendationsResponse: ToEntityMarshaller[GetBidsRecommendationsResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getBusinessQuarantineOffers200(responseGetQuarantineOffersResponse: GetQuarantineOffersResponse)(implicit toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse]): Route =
    complete((200, responseGetQuarantineOffersResponse))
  def getBusinessQuarantineOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getBusinessQuarantineOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getBusinessQuarantineOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getBusinessQuarantineOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getBusinessQuarantineOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getBusinessQuarantineOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список товаров в карантине., DataType: GetQuarantineOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getBusinessSettings200(responseGetBusinessSettingsResponse: GetBusinessSettingsResponse)(implicit toEntityMarshallerGetBusinessSettingsResponse: ToEntityMarshaller[GetBusinessSettingsResponse]): Route =
    complete((200, responseGetBusinessSettingsResponse))
  def getBusinessSettings400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getBusinessSettings401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getBusinessSettings403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getBusinessSettings404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getBusinessSettings420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getBusinessSettings500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Настройки кабинета., DataType: GetBusinessSettingsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getBusinessSettings(businessId: Long)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetBusinessSettingsResponse: ToEntityMarshaller[GetBusinessSettingsResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaign200(responseGetCampaignResponse: GetCampaignResponse)(implicit toEntityMarshallerGetCampaignResponse: ToEntityMarshaller[GetCampaignResponse]): Route =
    complete((200, responseGetCampaignResponse))
  def getCampaign400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaign401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaign403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaign404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaign420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaign500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о магазине., DataType: GetCampaignResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaign(campaignId: Long)
      (implicit toEntityMarshallerGetCampaignResponse: ToEntityMarshaller[GetCampaignResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaignLogins200(responseGetCampaignLoginsResponse: GetCampaignLoginsResponse)(implicit toEntityMarshallerGetCampaignLoginsResponse: ToEntityMarshaller[GetCampaignLoginsResponse]): Route =
    complete((200, responseGetCampaignLoginsResponse))
  def getCampaignLogins400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaignLogins401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaignLogins403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaignLogins404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaignLogins420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaignLogins500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список логинов, связанных с магазином., DataType: GetCampaignLoginsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaignLogins(campaignId: Long)
      (implicit toEntityMarshallerGetCampaignLoginsResponse: ToEntityMarshaller[GetCampaignLoginsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaignOffers200(responseGetCampaignOffersResponse: GetCampaignOffersResponse)(implicit toEntityMarshallerGetCampaignOffersResponse: ToEntityMarshaller[GetCampaignOffersResponse]): Route =
    complete((200, responseGetCampaignOffersResponse))
  def getCampaignOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaignOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaignOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaignOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaignOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaignOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список товаров, размещенных в заданном магазине., DataType: GetCampaignOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetCampaignOffersResponse: ToEntityMarshaller[GetCampaignOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaignQuarantineOffers200(responseGetQuarantineOffersResponse: GetQuarantineOffersResponse)(implicit toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse]): Route =
    complete((200, responseGetQuarantineOffersResponse))
  def getCampaignQuarantineOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaignQuarantineOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaignQuarantineOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaignQuarantineOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaignQuarantineOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaignQuarantineOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список товаров в карантине., DataType: GetQuarantineOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaignRegion200(responseGetCampaignRegionResponse: GetCampaignRegionResponse)(implicit toEntityMarshallerGetCampaignRegionResponse: ToEntityMarshaller[GetCampaignRegionResponse]): Route =
    complete((200, responseGetCampaignRegionResponse))
  def getCampaignRegion400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaignRegion401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaignRegion403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaignRegion404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaignRegion420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaignRegion500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| , DataType: GetCampaignRegionResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaignRegion(campaignId: Long)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerGetCampaignRegionResponse: ToEntityMarshaller[GetCampaignRegionResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaignSettings200(responseGetCampaignSettingsResponse: GetCampaignSettingsResponse)(implicit toEntityMarshallerGetCampaignSettingsResponse: ToEntityMarshaller[GetCampaignSettingsResponse]): Route =
    complete((200, responseGetCampaignSettingsResponse))
  def getCampaignSettings400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaignSettings401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaignSettings403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaignSettings404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaignSettings420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaignSettings500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Настройки магазина., DataType: GetCampaignSettingsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaignSettings(campaignId: Long)
      (implicit toEntityMarshallerGetCampaignSettingsResponse: ToEntityMarshaller[GetCampaignSettingsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaigns200(responseGetCampaignsResponse: GetCampaignsResponse)(implicit toEntityMarshallerGetCampaignsResponse: ToEntityMarshaller[GetCampaignsResponse]): Route =
    complete((200, responseGetCampaignsResponse))
  def getCampaigns400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaigns401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaigns403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaigns404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaigns420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaigns500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Магазины пользователя., DataType: GetCampaignsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaigns(page: Int, pageSize: Option[Int])
      (implicit toEntityMarshallerGetCampaignsResponse: ToEntityMarshaller[GetCampaignsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaignsByLogin200(responseGetCampaignsResponse: GetCampaignsResponse)(implicit toEntityMarshallerGetCampaignsResponse: ToEntityMarshaller[GetCampaignsResponse]): Route =
    complete((200, responseGetCampaignsResponse))
  def getCampaignsByLogin400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaignsByLogin401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaignsByLogin403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaignsByLogin404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaignsByLogin420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaignsByLogin500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о магазинах., DataType: GetCampaignsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaignsByLogin(login: String, page: Int, pageSize: Option[Int])
      (implicit toEntityMarshallerGetCampaignsResponse: ToEntityMarshaller[GetCampaignsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCategoriesMaxSaleQuantum200(responseGetCategoriesMaxSaleQuantumResponse: GetCategoriesMaxSaleQuantumResponse)(implicit toEntityMarshallerGetCategoriesMaxSaleQuantumResponse: ToEntityMarshaller[GetCategoriesMaxSaleQuantumResponse]): Route =
    complete((200, responseGetCategoriesMaxSaleQuantumResponse))
  def getCategoriesMaxSaleQuantum400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCategoriesMaxSaleQuantum401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCategoriesMaxSaleQuantum403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCategoriesMaxSaleQuantum404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCategoriesMaxSaleQuantum420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCategoriesMaxSaleQuantum500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Лимит на установку кванта и минимального количества товаров., DataType: GetCategoriesMaxSaleQuantumResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest)
      (implicit toEntityMarshallerGetCategoriesMaxSaleQuantumResponse: ToEntityMarshaller[GetCategoriesMaxSaleQuantumResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCategoriesTree200(responseGetCategoriesResponse: GetCategoriesResponse)(implicit toEntityMarshallerGetCategoriesResponse: ToEntityMarshaller[GetCategoriesResponse]): Route =
    complete((200, responseGetCategoriesResponse))
  def getCategoriesTree400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCategoriesTree401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCategoriesTree403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCategoriesTree404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCategoriesTree420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCategoriesTree500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Категории Маркета., DataType: GetCategoriesResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCategoriesTree(getCategoriesRequest: Option[GetCategoriesRequest])
      (implicit toEntityMarshallerGetCategoriesResponse: ToEntityMarshaller[GetCategoriesResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCategoryContentParameters200(responseGetCategoryContentParametersResponse: GetCategoryContentParametersResponse)(implicit toEntityMarshallerGetCategoryContentParametersResponse: ToEntityMarshaller[GetCategoryContentParametersResponse]): Route =
    complete((200, responseGetCategoryContentParametersResponse))
  def getCategoryContentParameters400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCategoryContentParameters401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCategoryContentParameters403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCategoryContentParameters404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCategoryContentParameters420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCategoryContentParameters500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список характеристик товаров из заданной категории., DataType: GetCategoryContentParametersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCategoryContentParameters(categoryId: Long)
      (implicit toEntityMarshallerGetCategoryContentParametersResponse: ToEntityMarshaller[GetCategoryContentParametersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getChatHistory200(responseGetChatHistoryResponse: GetChatHistoryResponse)(implicit toEntityMarshallerGetChatHistoryResponse: ToEntityMarshaller[GetChatHistoryResponse]): Route =
    complete((200, responseGetChatHistoryResponse))
  def getChatHistory400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getChatHistory401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getChatHistory403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getChatHistory404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getChatHistory420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getChatHistory500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: История сообщений успешно получена. , DataType: GetChatHistoryResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetChatHistoryResponse: ToEntityMarshaller[GetChatHistoryResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getChats200(responseGetChatsResponse: GetChatsResponse)(implicit toEntityMarshallerGetChatsResponse: ToEntityMarshaller[GetChatsResponse]): Route =
    complete((200, responseGetChatsResponse))
  def getChats400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getChats401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getChats403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getChats404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getChats420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getChats500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список чатов. , DataType: GetChatsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetChatsResponse: ToEntityMarshaller[GetChatsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getFeed200(responseGetFeedResponse: GetFeedResponse)(implicit toEntityMarshallerGetFeedResponse: ToEntityMarshaller[GetFeedResponse]): Route =
    complete((200, responseGetFeedResponse))
  def getFeed400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getFeed401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getFeed403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getFeed404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getFeed420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getFeed500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о прайс-листе., DataType: GetFeedResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getFeed(campaignId: Long, feedId: Long)
      (implicit toEntityMarshallerGetFeedResponse: ToEntityMarshaller[GetFeedResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getFeedIndexLogs200(responseGetFeedIndexLogsResponse: GetFeedIndexLogsResponse)(implicit toEntityMarshallerGetFeedIndexLogsResponse: ToEntityMarshaller[GetFeedIndexLogsResponse]): Route =
    complete((200, responseGetFeedIndexLogsResponse))
  def getFeedIndexLogs400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getFeedIndexLogs401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getFeedIndexLogs403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getFeedIndexLogs404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getFeedIndexLogs420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getFeedIndexLogs500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Отчет по индексации прайс-листа., DataType: GetFeedIndexLogsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[String], publishedTimeTo: Option[String], status: Option[String])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerGetFeedIndexLogsResponse: ToEntityMarshaller[GetFeedIndexLogsResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getFeedbackAndCommentUpdates200(responseGetFeedbackListResponse: GetFeedbackListResponse)(implicit toEntityMarshallerGetFeedbackListResponse: ToEntityMarshaller[GetFeedbackListResponse]): Route =
    complete((200, responseGetFeedbackListResponse))
  def getFeedbackAndCommentUpdates400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getFeedbackAndCommentUpdates401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getFeedbackAndCommentUpdates403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getFeedbackAndCommentUpdates404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getFeedbackAndCommentUpdates420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getFeedbackAndCommentUpdates500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список отзывов для магазина., DataType: GetFeedbackListResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getFeedbackAndCommentUpdates(campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[String])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetFeedbackListResponse: ToEntityMarshaller[GetFeedbackListResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getFeeds200(responseGetFeedsResponse: GetFeedsResponse)(implicit toEntityMarshallerGetFeedsResponse: ToEntityMarshaller[GetFeedsResponse]): Route =
    complete((200, responseGetFeedsResponse))
  def getFeeds400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getFeeds401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getFeeds403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getFeeds404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getFeeds420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getFeeds500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список прайс-листов., DataType: GetFeedsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getFeeds(campaignId: Long)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerGetFeedsResponse: ToEntityMarshaller[GetFeedsResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getFulfillmentWarehouses200(responseGetFulfillmentWarehousesResponse: GetFulfillmentWarehousesResponse)(implicit toEntityMarshallerGetFulfillmentWarehousesResponse: ToEntityMarshaller[GetFulfillmentWarehousesResponse]): Route =
    complete((200, responseGetFulfillmentWarehousesResponse))
  def getFulfillmentWarehouses400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getFulfillmentWarehouses401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getFulfillmentWarehouses403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getFulfillmentWarehouses404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getFulfillmentWarehouses420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getFulfillmentWarehouses500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список складов., DataType: GetFulfillmentWarehousesResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getFulfillmentWarehouses()
      (implicit toEntityMarshallerGetFulfillmentWarehousesResponse: ToEntityMarshaller[GetFulfillmentWarehousesResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getGoodsFeedbackComments200(responseGetGoodsFeedbackCommentsResponse: GetGoodsFeedbackCommentsResponse)(implicit toEntityMarshallerGetGoodsFeedbackCommentsResponse: ToEntityMarshaller[GetGoodsFeedbackCommentsResponse]): Route =
    complete((200, responseGetGoodsFeedbackCommentsResponse))
  def getGoodsFeedbackComments400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getGoodsFeedbackComments401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getGoodsFeedbackComments403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getGoodsFeedbackComments404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getGoodsFeedbackComments420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getGoodsFeedbackComments500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Дерево комментариев к отзыву., DataType: GetGoodsFeedbackCommentsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetGoodsFeedbackCommentsResponse: ToEntityMarshaller[GetGoodsFeedbackCommentsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getGoodsFeedbacks200(responseGetGoodsFeedbackResponse: GetGoodsFeedbackResponse)(implicit toEntityMarshallerGetGoodsFeedbackResponse: ToEntityMarshaller[GetGoodsFeedbackResponse]): Route =
    complete((200, responseGetGoodsFeedbackResponse))
  def getGoodsFeedbacks400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getGoodsFeedbacks401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getGoodsFeedbacks403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getGoodsFeedbacks404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getGoodsFeedbacks420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getGoodsFeedbacks500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список отзывов., DataType: GetGoodsFeedbackResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getGoodsFeedbacks(businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: Option[GetGoodsFeedbackRequest])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerGetGoodsFeedbackResponse: ToEntityMarshaller[GetGoodsFeedbackResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getGoodsStats200(responseGetGoodsStatsResponse: GetGoodsStatsResponse)(implicit toEntityMarshallerGetGoodsStatsResponse: ToEntityMarshaller[GetGoodsStatsResponse]): Route =
    complete((200, responseGetGoodsStatsResponse))
  def getGoodsStats400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getGoodsStats401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getGoodsStats403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getGoodsStats404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getGoodsStats420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getGoodsStats500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Отчет по товарам., DataType: GetGoodsStatsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest)
      (implicit toEntityMarshallerGetGoodsStatsResponse: ToEntityMarshaller[GetGoodsStatsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getHiddenOffers200(responseGetHiddenOffersResponse: GetHiddenOffersResponse)(implicit toEntityMarshallerGetHiddenOffersResponse: ToEntityMarshaller[GetHiddenOffersResponse]): Route =
    complete((200, responseGetHiddenOffersResponse))
  def getHiddenOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getHiddenOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getHiddenOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getHiddenOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getHiddenOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о скрытых вами товарах., DataType: GetHiddenOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getHiddenOffers(campaignId: Long, offerId: Option[String], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Int, pageSize: Option[Int])
      (implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetHiddenOffersResponse: ToEntityMarshaller[GetHiddenOffersResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOfferCardsContentStatus200(responseGetOfferCardsContentStatusResponse: GetOfferCardsContentStatusResponse)(implicit toEntityMarshallerGetOfferCardsContentStatusResponse: ToEntityMarshaller[GetOfferCardsContentStatusResponse]): Route =
    complete((200, responseGetOfferCardsContentStatusResponse))
  def getOfferCardsContentStatus400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOfferCardsContentStatus401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOfferCardsContentStatus403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOfferCardsContentStatus404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOfferCardsContentStatus420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOfferCardsContentStatus500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о карточках указанных товаров., DataType: GetOfferCardsContentStatusResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOfferCardsContentStatus(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: Option[GetOfferCardsContentStatusRequest])
      (implicit toEntityMarshallerGetOfferCardsContentStatusResponse: ToEntityMarshaller[GetOfferCardsContentStatusResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOfferMappingEntries200(responseGetOfferMappingEntriesResponse: GetOfferMappingEntriesResponse)(implicit toEntityMarshallerGetOfferMappingEntriesResponse: ToEntityMarshaller[GetOfferMappingEntriesResponse]): Route =
    complete((200, responseGetOfferMappingEntriesResponse))
  def getOfferMappingEntries400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOfferMappingEntries401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOfferMappingEntries403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOfferMappingEntries404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOfferMappingEntries420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOfferMappingEntries500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о товарах в каталоге., DataType: GetOfferMappingEntriesResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOfferMappingEntries(campaignId: Long, offerId: Option[String], shopSku: Option[String], mappingKind: Option[String], status: Option[String], availability: Option[String], categoryId: Option[String], vendor: Option[String], pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetOfferMappingEntriesResponse: ToEntityMarshaller[GetOfferMappingEntriesResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOfferMappings200(responseGetOfferMappingsResponse: GetOfferMappingsResponse)(implicit toEntityMarshallerGetOfferMappingsResponse: ToEntityMarshaller[GetOfferMappingsResponse]): Route =
    complete((200, responseGetOfferMappingsResponse))
  def getOfferMappings400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOfferMappings401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOfferMappings403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOfferMappings404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOfferMappings420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOfferMappings500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о товарах в каталоге., DataType: GetOfferMappingsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOfferMappings(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: Option[GetOfferMappingsRequest])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerGetOfferMappingsResponse: ToEntityMarshaller[GetOfferMappingsResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOfferRecommendations200(responseGetOfferRecommendationsResponse: GetOfferRecommendationsResponse)(implicit toEntityMarshallerGetOfferRecommendationsResponse: ToEntityMarshaller[GetOfferRecommendationsResponse]): Route =
    complete((200, responseGetOfferRecommendationsResponse))
  def getOfferRecommendations400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOfferRecommendations401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOfferRecommendations403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOfferRecommendations404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOfferRecommendations420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOfferRecommendations500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список товаров с рекомендациями., DataType: GetOfferRecommendationsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetOfferRecommendationsResponse: ToEntityMarshaller[GetOfferRecommendationsResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOffers200(responseGetOffersResponse: GetOffersResponse)(implicit toEntityMarshallerGetOffersResponse: ToEntityMarshaller[GetOffersResponse]): Route =
    complete((200, responseGetOffersResponse))
  def getOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Предложения магазина., DataType: GetOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOffers(campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[String], matched: Option[Boolean], page: Int, pageSize: Option[Int])
      (implicit toEntityMarshallerGetOffersResponse: ToEntityMarshaller[GetOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOrder200(responseGetOrderResponse: GetOrderResponse)(implicit toEntityMarshallerGetOrderResponse: ToEntityMarshaller[GetOrderResponse]): Route =
    complete((200, responseGetOrderResponse))
  def getOrder400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOrder401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOrder403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOrder404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOrder420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOrder500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о заказе., DataType: GetOrderResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOrder(campaignId: Long, orderId: Long)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetOrderResponse: ToEntityMarshaller[GetOrderResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOrderBusinessBuyerInfo200(responseGetBusinessBuyerInfoResponse: GetBusinessBuyerInfoResponse)(implicit toEntityMarshallerGetBusinessBuyerInfoResponse: ToEntityMarshaller[GetBusinessBuyerInfoResponse]): Route =
    complete((200, responseGetBusinessBuyerInfoResponse))
  def getOrderBusinessBuyerInfo400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOrderBusinessBuyerInfo401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOrderBusinessBuyerInfo403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOrderBusinessBuyerInfo404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOrderBusinessBuyerInfo420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOrderBusinessBuyerInfo500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о покупателе., DataType: GetBusinessBuyerInfoResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetBusinessBuyerInfoResponse: ToEntityMarshaller[GetBusinessBuyerInfoResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOrderBusinessDocumentsInfo200(responseGetBusinessDocumentsInfoResponse: GetBusinessDocumentsInfoResponse)(implicit toEntityMarshallerGetBusinessDocumentsInfoResponse: ToEntityMarshaller[GetBusinessDocumentsInfoResponse]): Route =
    complete((200, responseGetBusinessDocumentsInfoResponse))
  def getOrderBusinessDocumentsInfo400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOrderBusinessDocumentsInfo401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOrderBusinessDocumentsInfo403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOrderBusinessDocumentsInfo404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOrderBusinessDocumentsInfo420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOrderBusinessDocumentsInfo500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о документах., DataType: GetBusinessDocumentsInfoResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerGetBusinessDocumentsInfoResponse: ToEntityMarshaller[GetBusinessDocumentsInfoResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOrders200(responseGetOrdersResponse: GetOrdersResponse)(implicit toEntityMarshallerGetOrdersResponse: ToEntityMarshaller[GetOrdersResponse]): Route =
    complete((200, responseGetOrdersResponse))
  def getOrders400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOrders401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOrders403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOrders404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOrders420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOrders500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о заказах., DataType: GetOrdersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOrders(campaignId: Long, orderIds: Option[String], status: Option[String], substatus: Option[String], fromDate: Option[String], toDate: Option[String], supplierShipmentDateFrom: Option[String], supplierShipmentDateTo: Option[String], updatedAtFrom: Option[String], updatedAtTo: Option[String], dispatchType: Option[String], fake: Boolean, hasCis: Boolean, onlyWaitingForCancellationApprove: Boolean, onlyEstimatedDelivery: Boolean, buyerType: Option[String], page: Int, pageSize: Option[Int], pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetOrdersResponse: ToEntityMarshaller[GetOrdersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getOrdersStats200(responseGetOrdersStatsResponse: GetOrdersStatsResponse)(implicit toEntityMarshallerGetOrdersStatsResponse: ToEntityMarshaller[GetOrdersStatsResponse]): Route =
    complete((200, responseGetOrdersStatsResponse))
  def getOrdersStats400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOrdersStats401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOrdersStats403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOrdersStats404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOrdersStats420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOrdersStats500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация по заказам., DataType: GetOrdersStatsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOrdersStats(campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: Option[GetOrdersStatsRequest])
      (implicit toEntityMarshallerGetOrdersStatsResponse: ToEntityMarshaller[GetOrdersStatsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getPrices200(responseGetPricesResponse: GetPricesResponse)(implicit toEntityMarshallerGetPricesResponse: ToEntityMarshaller[GetPricesResponse]): Route =
    complete((200, responseGetPricesResponse))
  def getPrices400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getPrices401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getPrices403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getPrices404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getPrices420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getPrices500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список всех товаров с установленными ценами., DataType: GetPricesResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getPrices(campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Boolean)
      (implicit toEntityMarshallerGetPricesResponse: ToEntityMarshaller[GetPricesResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getPricesByOfferIds200(responseGetPricesByOfferIdsResponse: GetPricesByOfferIdsResponse)(implicit toEntityMarshallerGetPricesByOfferIdsResponse: ToEntityMarshaller[GetPricesByOfferIdsResponse]): Route =
    complete((200, responseGetPricesByOfferIdsResponse))
  def getPricesByOfferIds400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getPricesByOfferIds401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getPricesByOfferIds403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getPricesByOfferIds404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getPricesByOfferIds420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getPricesByOfferIds500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список товаров с установленными для заданного магазина ценами., DataType: GetPricesByOfferIdsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getPricesByOfferIds(campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: Option[GetPricesByOfferIdsRequest])
      (implicit toEntityMarshallerGetPricesByOfferIdsResponse: ToEntityMarshaller[GetPricesByOfferIdsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getPromoOffers200(responseGetPromoOffersResponse: GetPromoOffersResponse)(implicit toEntityMarshallerGetPromoOffersResponse: ToEntityMarshaller[GetPromoOffersResponse]): Route =
    complete((200, responseGetPromoOffersResponse))
  def getPromoOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getPromoOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getPromoOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getPromoOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getPromoOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getPromoOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список товаров, которые участвуют или могут участвовать в акции., DataType: GetPromoOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetPromoOffersResponse: ToEntityMarshaller[GetPromoOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getPromos200(responseGetPromosResponse: GetPromosResponse)(implicit toEntityMarshallerGetPromosResponse: ToEntityMarshaller[GetPromosResponse]): Route =
    complete((200, responseGetPromosResponse))
  def getPromos400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getPromos401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getPromos403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getPromos404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getPromos420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getPromos500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список акций Маркета., DataType: GetPromosResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getPromos(businessId: Long, getPromosRequest: Option[GetPromosRequest])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetPromosResponse: ToEntityMarshaller[GetPromosResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getQualityRatings200(responseGetQualityRatingResponse: GetQualityRatingResponse)(implicit toEntityMarshallerGetQualityRatingResponse: ToEntityMarshaller[GetQualityRatingResponse]): Route =
    complete((200, responseGetQualityRatingResponse))
  def getQualityRatings400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getQualityRatings401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getQualityRatings403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getQualityRatings404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getQualityRatings420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getQualityRatings500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Значение индекса качества магазинов и его составляющие., DataType: GetQualityRatingResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest)
      (implicit toEntityMarshallerGetQualityRatingResponse: ToEntityMarshaller[GetQualityRatingResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getReportInfo200(responseGetReportInfoResponse: GetReportInfoResponse)(implicit toEntityMarshallerGetReportInfoResponse: ToEntityMarshaller[GetReportInfoResponse]): Route =
    complete((200, responseGetReportInfoResponse))
  def getReportInfo400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getReportInfo401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getReportInfo403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getReportInfo404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getReportInfo420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getReportInfo500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    , DataType: GetReportInfoResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getReportInfo(reportId: String)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerGetReportInfoResponse: ToEntityMarshaller[GetReportInfoResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getReturn200(responseGetReturnResponse: GetReturnResponse)(implicit toEntityMarshallerGetReturnResponse: ToEntityMarshaller[GetReturnResponse]): Route =
    complete((200, responseGetReturnResponse))
  def getReturn400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getReturn401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getReturn403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getReturn404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getReturn420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getReturn500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Детали возврата., DataType: GetReturnResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getReturn(campaignId: Long, orderId: Long, returnId: Long)
      (implicit toEntityMarshallerGetReturnResponse: ToEntityMarshaller[GetReturnResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getReturnPhoto200(responseFile: File)(implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route =
    complete((200, responseFile))
  def getReturnPhoto400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getReturnPhoto401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getReturnPhoto403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getReturnPhoto404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getReturnPhoto420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getReturnPhoto500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Фотография возврата., DataType: File
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerFile: ToEntityMarshaller[File], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getReturns200(responseGetReturnsResponse: GetReturnsResponse)(implicit toEntityMarshallerGetReturnsResponse: ToEntityMarshaller[GetReturnsResponse]): Route =
    complete((200, responseGetReturnsResponse))
  def getReturns400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getReturns401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getReturns403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getReturns404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getReturns420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getReturns500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Постраничные возвраты партнера., DataType: GetReturnsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getReturns(campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Option[String], statuses: Option[String], `type`: Option[String], fromDate: Option[String], toDate: Option[String], fromDate2: Option[String], toDate2: Option[String])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerGetReturnsResponse: ToEntityMarshaller[GetReturnsResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getStocks200(responseGetWarehouseStocksResponse: GetWarehouseStocksResponse)(implicit toEntityMarshallerGetWarehouseStocksResponse: ToEntityMarshaller[GetWarehouseStocksResponse]): Route =
    complete((200, responseGetWarehouseStocksResponse))
  def getStocks400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getStocks401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getStocks403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getStocks420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getStocks500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Остатки товаров на складах., DataType: GetWarehouseStocksResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getStocks(campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: Option[GetWarehouseStocksRequest])
      (implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerGetWarehouseStocksResponse: ToEntityMarshaller[GetWarehouseStocksResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getSuggestedOfferMappingEntries200(responseGetSuggestedOfferMappingEntriesResponse: GetSuggestedOfferMappingEntriesResponse)(implicit toEntityMarshallerGetSuggestedOfferMappingEntriesResponse: ToEntityMarshaller[GetSuggestedOfferMappingEntriesResponse]): Route =
    complete((200, responseGetSuggestedOfferMappingEntriesResponse))
  def getSuggestedOfferMappingEntries400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getSuggestedOfferMappingEntries401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getSuggestedOfferMappingEntries403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getSuggestedOfferMappingEntries404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getSuggestedOfferMappingEntries420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getSuggestedOfferMappingEntries500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о товарах в каталоге., DataType: GetSuggestedOfferMappingEntriesResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerGetSuggestedOfferMappingEntriesResponse: ToEntityMarshaller[GetSuggestedOfferMappingEntriesResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getSuggestedOfferMappings200(responseGetSuggestedOfferMappingsResponse: GetSuggestedOfferMappingsResponse)(implicit toEntityMarshallerGetSuggestedOfferMappingsResponse: ToEntityMarshaller[GetSuggestedOfferMappingsResponse]): Route =
    complete((200, responseGetSuggestedOfferMappingsResponse))
  def getSuggestedOfferMappings400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getSuggestedOfferMappings401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getSuggestedOfferMappings403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getSuggestedOfferMappings404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getSuggestedOfferMappings420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getSuggestedOfferMappings500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. , DataType: GetSuggestedOfferMappingsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: Option[GetSuggestedOfferMappingsRequest])
      (implicit toEntityMarshallerGetSuggestedOfferMappingsResponse: ToEntityMarshaller[GetSuggestedOfferMappingsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getSuggestedPrices200(responseSuggestPricesResponse: SuggestPricesResponse)(implicit toEntityMarshallerSuggestPricesResponse: ToEntityMarshaller[SuggestPricesResponse]): Route =
    complete((200, responseSuggestPricesResponse))
  def getSuggestedPrices400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getSuggestedPrices401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getSuggestedPrices403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getSuggestedPrices404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getSuggestedPrices420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getSuggestedPrices500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список цен для продвижения на Маркете., DataType: SuggestPricesResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest)
      (implicit toEntityMarshallerSuggestPricesResponse: ToEntityMarshaller[SuggestPricesResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def putBidsForBusiness200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def putBidsForBusiness400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def putBidsForBusiness401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def putBidsForBusiness403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def putBidsForBusiness404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def putBidsForBusiness420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def putBidsForBusiness500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. , DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def putBidsForCampaign200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def putBidsForCampaign400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def putBidsForCampaign401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def putBidsForCampaign403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def putBidsForCampaign404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def putBidsForCampaign420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def putBidsForCampaign500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Пустой ответ., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def refreshFeed200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def refreshFeed400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def refreshFeed401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def refreshFeed403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def refreshFeed404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def refreshFeed420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def refreshFeed500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Пустой ответ., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def refreshFeed(campaignId: Long, feedId: Long)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def searchRegionChildren200(responseGetRegionWithChildrenResponse: GetRegionWithChildrenResponse)(implicit toEntityMarshallerGetRegionWithChildrenResponse: ToEntityMarshaller[GetRegionWithChildrenResponse]): Route =
    complete((200, responseGetRegionWithChildrenResponse))
  def searchRegionChildren400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def searchRegionChildren401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def searchRegionChildren403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def searchRegionChildren404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def searchRegionChildren420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def searchRegionChildren500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Регионы, являющиеся дочерними к указанному в запросе., DataType: GetRegionWithChildrenResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def searchRegionChildren(regionId: Long, page: Int, pageSize: Option[Int])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerGetRegionWithChildrenResponse: ToEntityMarshaller[GetRegionWithChildrenResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def searchRegionsById200(responseGetRegionsResponse: GetRegionsResponse)(implicit toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse]): Route =
    complete((200, responseGetRegionsResponse))
  def searchRegionsById401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def searchRegionsById403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def searchRegionsById404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def searchRegionsById420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def searchRegionsById500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Найденный регион., DataType: GetRegionsResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def searchRegionsById(regionId: Long)
      (implicit toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def searchRegionsByName200(responseGetRegionsResponse: GetRegionsResponse)(implicit toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse]): Route =
    complete((200, responseGetRegionsResponse))
  def searchRegionsByName401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def searchRegionsByName403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def searchRegionsByName420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def searchRegionsByName500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список найденных регионов., DataType: GetRegionsResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def sendFileToChat200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def sendFileToChat400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def sendFileToChat401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def sendFileToChat403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def sendFileToChat404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def sendFileToChat420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def sendFileToChat500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Пустой ответ. Означает, что файл отправлен., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def sendFileToChat(businessId: Long, chatId: Long, file: (FileInfo, File))
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def sendMessageToChat200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def sendMessageToChat400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def sendMessageToChat401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def sendMessageToChat403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def sendMessageToChat404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def sendMessageToChat420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def sendMessageToChat500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Пустой ответ. Означает, что сообщение отправлено., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def setFeedParams200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def setFeedParams400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def setFeedParams401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def setFeedParams403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def setFeedParams404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def setFeedParams420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def setFeedParams423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def setFeedParams500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Статус выполнения операции., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def skipGoodsFeedbacksReaction200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def skipGoodsFeedbacksReaction400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def skipGoodsFeedbacksReaction401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def skipGoodsFeedbacksReaction403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def skipGoodsFeedbacksReaction404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def skipGoodsFeedbacksReaction420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def skipGoodsFeedbacksReaction500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Пустой ответ., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updateBusinessPrices200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def updateBusinessPrices400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updateBusinessPrices401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updateBusinessPrices403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updateBusinessPrices404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updateBusinessPrices420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updateBusinessPrices423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def updateBusinessPrices500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Маркет принял информацию о новых ценах., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updateCampaignOffers200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def updateCampaignOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updateCampaignOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updateCampaignOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updateCampaignOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updateCampaignOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updateCampaignOffers423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def updateCampaignOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updateGoodsFeedbackComment200(responseUpdateGoodsFeedbackCommentResponse: UpdateGoodsFeedbackCommentResponse)(implicit toEntityMarshallerUpdateGoodsFeedbackCommentResponse: ToEntityMarshaller[UpdateGoodsFeedbackCommentResponse]): Route =
    complete((200, responseUpdateGoodsFeedbackCommentResponse))
  def updateGoodsFeedbackComment400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updateGoodsFeedbackComment401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updateGoodsFeedbackComment403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updateGoodsFeedbackComment404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updateGoodsFeedbackComment420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updateGoodsFeedbackComment500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о добавленном или измененном комментарии., DataType: UpdateGoodsFeedbackCommentResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerUpdateGoodsFeedbackCommentResponse: ToEntityMarshaller[UpdateGoodsFeedbackCommentResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updateOfferContent200(responseUpdateOfferContentResponse: UpdateOfferContentResponse)(implicit toEntityMarshallerUpdateOfferContentResponse: ToEntityMarshaller[UpdateOfferContentResponse]): Route =
    complete((200, responseUpdateOfferContentResponse))
  def updateOfferContent400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updateOfferContent401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updateOfferContent403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updateOfferContent404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updateOfferContent420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updateOfferContent423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def updateOfferContent500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Запрос выполнен корректно, данные обработаны.  {% note warning \&quot;Ответ 200 сам по себе не значит, что переданные значения корректны\&quot; %}  Обязательно посмотрите детали ответа: &#x60;status&#x60; и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в &#x60;status&#x60; вернулось &#x60;ERROR&#x60;, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля &#x60;errors&#x60; и &#x60;warnings&#x60;. , DataType: UpdateOfferContentResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest)
      (implicit toEntityMarshallerUpdateOfferContentResponse: ToEntityMarshaller[UpdateOfferContentResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updateOfferMappingEntries200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def updateOfferMappingEntries400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updateOfferMappingEntries401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updateOfferMappingEntries403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updateOfferMappingEntries404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updateOfferMappingEntries420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updateOfferMappingEntries423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def updateOfferMappingEntries500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Статус выполнения операции., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updateOfferMappings200(responseUpdateOfferMappingsResponse: UpdateOfferMappingsResponse)(implicit toEntityMarshallerUpdateOfferMappingsResponse: ToEntityMarshaller[UpdateOfferMappingsResponse]): Route =
    complete((200, responseUpdateOfferMappingsResponse))
  def updateOfferMappings400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updateOfferMappings401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updateOfferMappings403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updateOfferMappings404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updateOfferMappings420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updateOfferMappings423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def updateOfferMappings500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. , DataType: UpdateOfferMappingsResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerUpdateOfferMappingsResponse: ToEntityMarshaller[UpdateOfferMappingsResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updatePrices200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def updatePrices400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updatePrices401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updatePrices403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updatePrices404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updatePrices420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updatePrices423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def updatePrices500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Маркет принял информацию о новых ценах., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updatePromoOffers200(responseUpdatePromoOffersResponse: UpdatePromoOffersResponse)(implicit toEntityMarshallerUpdatePromoOffersResponse: ToEntityMarshaller[UpdatePromoOffersResponse]): Route =
    complete((200, responseUpdatePromoOffersResponse))
  def updatePromoOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updatePromoOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updatePromoOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updatePromoOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updatePromoOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updatePromoOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Результат добавления товаров в акцию или обновления их цен., DataType: UpdatePromoOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerUpdatePromoOffersResponse: ToEntityMarshaller[UpdatePromoOffersResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

}

trait FbyApiMarshaller {
  implicit def fromEntityUnmarshallerSendMessageToChatRequest: FromEntityUnmarshaller[SendMessageToChatRequest]

  implicit def fromEntityUnmarshallerUpdatePricesRequest: FromEntityUnmarshaller[UpdatePricesRequest]

  implicit def fromEntityUnmarshallerGenerateGoodsMovementReportRequest: FromEntityUnmarshaller[GenerateGoodsMovementReportRequest]

  implicit def fromEntityUnmarshallerGenerateGoodsTurnoverRequest: FromEntityUnmarshaller[GenerateGoodsTurnoverRequest]

  implicit def fromEntityUnmarshallerGetBidsRecommendationsRequest: FromEntityUnmarshaller[GetBidsRecommendationsRequest]

  implicit def fromEntityUnmarshallerGetOrdersStatsRequest: FromEntityUnmarshaller[GetOrdersStatsRequest]

  implicit def fromEntityUnmarshallerGetQuarantineOffersRequest: FromEntityUnmarshaller[GetQuarantineOffersRequest]

  implicit def fromEntityUnmarshallerGetChatHistoryRequest: FromEntityUnmarshaller[GetChatHistoryRequest]

  implicit def fromEntityUnmarshallerUpdatePromoOffersRequest: FromEntityUnmarshaller[UpdatePromoOffersRequest]

  implicit def fromEntityUnmarshallerGetBidsInfoRequest: FromEntityUnmarshaller[GetBidsInfoRequest]

  implicit def fromEntityUnmarshallerSkipGoodsFeedbackReactionRequest: FromEntityUnmarshaller[SkipGoodsFeedbackReactionRequest]

  implicit def fromEntityUnmarshallerUpdateBusinessPricesRequest: FromEntityUnmarshaller[UpdateBusinessPricesRequest]

  implicit def fromEntityUnmarshallerGetGoodsFeedbackCommentsRequest: FromEntityUnmarshaller[GetGoodsFeedbackCommentsRequest]

  implicit def fromEntityUnmarshallerGenerateGoodsRealizationReportRequest: FromEntityUnmarshaller[GenerateGoodsRealizationReportRequest]

  implicit def fromEntityUnmarshallerGetWarehouseStocksRequest: FromEntityUnmarshaller[GetWarehouseStocksRequest]

  implicit def fromEntityUnmarshallerUpdateOfferContentRequest: FromEntityUnmarshaller[UpdateOfferContentRequest]

  implicit def fromEntityUnmarshallerDeleteHiddenOffersRequest: FromEntityUnmarshaller[DeleteHiddenOffersRequest]

  implicit def fromEntityUnmarshallerGetPromosRequest: FromEntityUnmarshaller[GetPromosRequest]

  implicit def fromEntityUnmarshallerGetSuggestedOfferMappingEntriesRequest: FromEntityUnmarshaller[GetSuggestedOfferMappingEntriesRequest]

  implicit def fromEntityUnmarshallerCreateChatRequest: FromEntityUnmarshaller[CreateChatRequest]

  implicit def fromEntityUnmarshallerPutSkuBidsRequest: FromEntityUnmarshaller[PutSkuBidsRequest]

  implicit def fromEntityUnmarshallerSuggestPricesRequest: FromEntityUnmarshaller[SuggestPricesRequest]

  implicit def fromEntityUnmarshallerGenerateGoodsFeedbackRequest: FromEntityUnmarshaller[GenerateGoodsFeedbackRequest]

  implicit def fromEntityUnmarshallerDeleteCampaignOffersRequest: FromEntityUnmarshaller[DeleteCampaignOffersRequest]

  implicit def fromEntityUnmarshallerGenerateStocksOnWarehousesReportRequest: FromEntityUnmarshaller[GenerateStocksOnWarehousesReportRequest]

  implicit def fromEntityUnmarshallerUpdateGoodsFeedbackCommentRequest: FromEntityUnmarshaller[UpdateGoodsFeedbackCommentRequest]

  implicit def fromEntityUnmarshallerGetChatsRequest: FromEntityUnmarshaller[GetChatsRequest]

  implicit def fromEntityUnmarshallerGetOfferMappingsRequest: FromEntityUnmarshaller[GetOfferMappingsRequest]

  implicit def fromEntityUnmarshallerGenerateUnitedMarketplaceServicesReportRequest: FromEntityUnmarshaller[GenerateUnitedMarketplaceServicesReportRequest]

  implicit def fromEntityUnmarshallerUpdateOfferMappingEntryRequest: FromEntityUnmarshaller[UpdateOfferMappingEntryRequest]

  implicit def fromEntityUnmarshallerDeleteOffersRequest: FromEntityUnmarshaller[DeleteOffersRequest]

  implicit def fromEntityUnmarshallerUpdateOfferMappingsRequest: FromEntityUnmarshaller[UpdateOfferMappingsRequest]

  implicit def fromEntityUnmarshallerGetPromoOffersRequest: FromEntityUnmarshaller[GetPromoOffersRequest]

  implicit def fromEntityUnmarshallerDeleteGoodsFeedbackCommentRequest: FromEntityUnmarshaller[DeleteGoodsFeedbackCommentRequest]

  implicit def fromEntityUnmarshallerAddOffersToArchiveRequest: FromEntityUnmarshaller[AddOffersToArchiveRequest]

  implicit def fromEntityUnmarshallerGenerateShowsSalesReportRequest: FromEntityUnmarshaller[GenerateShowsSalesReportRequest]

  implicit def fromEntityUnmarshallerConfirmPricesRequest: FromEntityUnmarshaller[ConfirmPricesRequest]

  implicit def fromEntityUnmarshallerSetFeedParamsRequest: FromEntityUnmarshaller[SetFeedParamsRequest]

  implicit def fromEntityUnmarshallerGenerateUnitedOrdersRequest: FromEntityUnmarshaller[GenerateUnitedOrdersRequest]

  implicit def fromEntityUnmarshallerDeleteOffersFromArchiveRequest: FromEntityUnmarshaller[DeleteOffersFromArchiveRequest]

  implicit def fromEntityUnmarshallerGenerateBoostConsolidatedRequest: FromEntityUnmarshaller[GenerateBoostConsolidatedRequest]

  implicit def fromEntityUnmarshallerGetGoodsFeedbackRequest: FromEntityUnmarshaller[GetGoodsFeedbackRequest]

  implicit def fromEntityUnmarshallerGetPricesByOfferIdsRequest: FromEntityUnmarshaller[GetPricesByOfferIdsRequest]

  implicit def fromEntityUnmarshallerAddHiddenOffersRequest: FromEntityUnmarshaller[AddHiddenOffersRequest]

  implicit def fromEntityUnmarshallerGetCampaignOffersRequest: FromEntityUnmarshaller[GetCampaignOffersRequest]

  implicit def fromEntityUnmarshallerGetCategoriesMaxSaleQuantumRequest: FromEntityUnmarshaller[GetCategoriesMaxSaleQuantumRequest]

  implicit def fromEntityUnmarshallerGetQualityRatingRequest: FromEntityUnmarshaller[GetQualityRatingRequest]

  implicit def fromEntityUnmarshallerGetSuggestedOfferMappingsRequest: FromEntityUnmarshaller[GetSuggestedOfferMappingsRequest]

  implicit def fromEntityUnmarshallerGetCategoriesRequest: FromEntityUnmarshaller[GetCategoriesRequest]

  implicit def fromEntityUnmarshallerGeneratePricesReportRequest: FromEntityUnmarshaller[GeneratePricesReportRequest]

  implicit def fromEntityUnmarshallerGetGoodsStatsRequest: FromEntityUnmarshaller[GetGoodsStatsRequest]

  implicit def fromEntityUnmarshallerCalculateTariffsRequest: FromEntityUnmarshaller[CalculateTariffsRequest]

  implicit def fromEntityUnmarshallerGenerateCompetitorsPositionReportRequest: FromEntityUnmarshaller[GenerateCompetitorsPositionReportRequest]

  implicit def fromEntityUnmarshallerGetOfferRecommendationsRequest: FromEntityUnmarshaller[GetOfferRecommendationsRequest]

  implicit def fromEntityUnmarshallerGetOfferCardsContentStatusRequest: FromEntityUnmarshaller[GetOfferCardsContentStatusRequest]

  implicit def fromEntityUnmarshallerUpdateCampaignOffersRequest: FromEntityUnmarshaller[UpdateCampaignOffersRequest]

  implicit def fromEntityUnmarshallerGenerateUnitedNettingReportRequest: FromEntityUnmarshaller[GenerateUnitedNettingReportRequest]

  implicit def fromEntityUnmarshallerDeletePromoOffersRequest: FromEntityUnmarshaller[DeletePromoOffersRequest]

  implicit def fromEntityUnmarshallerGenerateShelfsStatisticsRequest: FromEntityUnmarshaller[GenerateShelfsStatisticsRequest]



  implicit def toEntityMarshallerGetAllOffersResponse: ToEntityMarshaller[GetAllOffersResponse]

  implicit def toEntityMarshallerGetCampaignLoginsResponse: ToEntityMarshaller[GetCampaignLoginsResponse]

  implicit def toEntityMarshallerGetOrdersResponse: ToEntityMarshaller[GetOrdersResponse]

  implicit def toEntityMarshallerGetCampaignsResponse: ToEntityMarshaller[GetCampaignsResponse]

  implicit def toEntityMarshallerGetFeedbackListResponse: ToEntityMarshaller[GetFeedbackListResponse]

  implicit def toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]

  implicit def toEntityMarshallerGetReturnsResponse: ToEntityMarshaller[GetReturnsResponse]

  implicit def toEntityMarshallerGetPromoOffersResponse: ToEntityMarshaller[GetPromoOffersResponse]

  implicit def toEntityMarshallerCalculateTariffsResponse: ToEntityMarshaller[CalculateTariffsResponse]

  implicit def toEntityMarshallerUpdateOfferContentResponse: ToEntityMarshaller[UpdateOfferContentResponse]

  implicit def toEntityMarshallerGetChatsResponse: ToEntityMarshaller[GetChatsResponse]

  implicit def toEntityMarshallerSuggestPricesResponse: ToEntityMarshaller[SuggestPricesResponse]

  implicit def toEntityMarshallerGetFeedResponse: ToEntityMarshaller[GetFeedResponse]

  implicit def toEntityMarshallerGetOffersResponse: ToEntityMarshaller[GetOffersResponse]

  implicit def toEntityMarshallerGetOrdersStatsResponse: ToEntityMarshaller[GetOrdersStatsResponse]

  implicit def toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]

  implicit def toEntityMarshallerCreateChatResponse: ToEntityMarshaller[CreateChatResponse]

  implicit def toEntityMarshallerGetPricesByOfferIdsResponse: ToEntityMarshaller[GetPricesByOfferIdsResponse]

  implicit def toEntityMarshallerGetBidsRecommendationsResponse: ToEntityMarshaller[GetBidsRecommendationsResponse]

  implicit def toEntityMarshallerAddOffersToArchiveResponse: ToEntityMarshaller[AddOffersToArchiveResponse]

  implicit def toEntityMarshallerGetSuggestedOfferMappingEntriesResponse: ToEntityMarshaller[GetSuggestedOfferMappingEntriesResponse]

  implicit def toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse]

  implicit def toEntityMarshallerGetCampaignResponse: ToEntityMarshaller[GetCampaignResponse]

  implicit def toEntityMarshallerGetCategoriesResponse: ToEntityMarshaller[GetCategoriesResponse]

  implicit def toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]

  implicit def toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]

  implicit def toEntityMarshallerDeleteOffersFromArchiveResponse: ToEntityMarshaller[DeleteOffersFromArchiveResponse]

  implicit def toEntityMarshallerGetOfferCardsContentStatusResponse: ToEntityMarshaller[GetOfferCardsContentStatusResponse]

  implicit def toEntityMarshallerGetPromosResponse: ToEntityMarshaller[GetPromosResponse]

  implicit def toEntityMarshallerGetOfferRecommendationsResponse: ToEntityMarshaller[GetOfferRecommendationsResponse]

  implicit def toEntityMarshallerGetReportInfoResponse: ToEntityMarshaller[GetReportInfoResponse]

  implicit def toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]

  implicit def toEntityMarshallerGetGoodsFeedbackResponse: ToEntityMarshaller[GetGoodsFeedbackResponse]

  implicit def toEntityMarshallerGetReturnResponse: ToEntityMarshaller[GetReturnResponse]

  implicit def toEntityMarshallerGetCampaignOffersResponse: ToEntityMarshaller[GetCampaignOffersResponse]

  implicit def toEntityMarshallerDeleteCampaignOffersResponse: ToEntityMarshaller[DeleteCampaignOffersResponse]

  implicit def toEntityMarshallerUpdateGoodsFeedbackCommentResponse: ToEntityMarshaller[UpdateGoodsFeedbackCommentResponse]

  implicit def toEntityMarshallerGetOrderResponse: ToEntityMarshaller[GetOrderResponse]

  implicit def toEntityMarshallerGetHiddenOffersResponse: ToEntityMarshaller[GetHiddenOffersResponse]

  implicit def toEntityMarshallerDeletePromoOffersResponse: ToEntityMarshaller[DeletePromoOffersResponse]

  implicit def toEntityMarshallerGetFeedsResponse: ToEntityMarshaller[GetFeedsResponse]

  implicit def toEntityMarshallerGetRegionWithChildrenResponse: ToEntityMarshaller[GetRegionWithChildrenResponse]

  implicit def toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]

  implicit def toEntityMarshallerGetBidsInfoResponse: ToEntityMarshaller[GetBidsInfoResponse]

  implicit def toEntityMarshallerGetCampaignSettingsResponse: ToEntityMarshaller[GetCampaignSettingsResponse]

  implicit def toEntityMarshallerGetFulfillmentWarehousesResponse: ToEntityMarshaller[GetFulfillmentWarehousesResponse]

  implicit def toEntityMarshallerGetCategoryContentParametersResponse: ToEntityMarshaller[GetCategoryContentParametersResponse]

  implicit def toEntityMarshallerGetChatHistoryResponse: ToEntityMarshaller[GetChatHistoryResponse]

  implicit def toEntityMarshallerGetPricesResponse: ToEntityMarshaller[GetPricesResponse]

  implicit def toEntityMarshallerGetSuggestedOfferMappingsResponse: ToEntityMarshaller[GetSuggestedOfferMappingsResponse]

  implicit def toEntityMarshallerGetGoodsFeedbackCommentsResponse: ToEntityMarshaller[GetGoodsFeedbackCommentsResponse]

  implicit def toEntityMarshallerGetCategoriesMaxSaleQuantumResponse: ToEntityMarshaller[GetCategoriesMaxSaleQuantumResponse]

  implicit def toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse]

  implicit def toEntityMarshallerGetBusinessSettingsResponse: ToEntityMarshaller[GetBusinessSettingsResponse]

  implicit def toEntityMarshallerGetBusinessBuyerInfoResponse: ToEntityMarshaller[GetBusinessBuyerInfoResponse]

  implicit def toEntityMarshallerFile: ToEntityMarshaller[File]

  implicit def toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]

  implicit def toEntityMarshallerGetOfferMappingsResponse: ToEntityMarshaller[GetOfferMappingsResponse]

  implicit def toEntityMarshallerGetFeedIndexLogsResponse: ToEntityMarshaller[GetFeedIndexLogsResponse]

  implicit def toEntityMarshallerGetBusinessDocumentsInfoResponse: ToEntityMarshaller[GetBusinessDocumentsInfoResponse]

  implicit def toEntityMarshallerGetWarehouseStocksResponse: ToEntityMarshaller[GetWarehouseStocksResponse]

  implicit def toEntityMarshallerUpdatePromoOffersResponse: ToEntityMarshaller[UpdatePromoOffersResponse]

  implicit def toEntityMarshallerGetGoodsStatsResponse: ToEntityMarshaller[GetGoodsStatsResponse]

  implicit def toEntityMarshallerGetQualityRatingResponse: ToEntityMarshaller[GetQualityRatingResponse]

  implicit def toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]

  implicit def toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]

  implicit def toEntityMarshallerGetOfferMappingEntriesResponse: ToEntityMarshaller[GetOfferMappingEntriesResponse]

  implicit def toEntityMarshallerDeleteOffersResponse: ToEntityMarshaller[DeleteOffersResponse]

  implicit def toEntityMarshallerGetCampaignRegionResponse: ToEntityMarshaller[GetCampaignRegionResponse]

  implicit def toEntityMarshallerUpdateOfferMappingsResponse: ToEntityMarshaller[UpdateOfferMappingsResponse]

}

