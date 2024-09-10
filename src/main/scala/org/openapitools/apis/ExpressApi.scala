package org.openapitools.apis

import java.io._
import ympa_scala_finch_server._
import org.openapitools.models._
import org.openapitools.models.AddHiddenOffersRequest
import org.openapitools.models.AddOffersToArchiveRequest
import org.openapitools.models.AddOffersToArchiveResponse
import org.openapitools.models.ApiClientDataErrorResponse
import org.openapitools.models.ApiForbiddenErrorResponse
import org.openapitools.models.ApiLimitErrorResponse
import org.openapitools.models.ApiLockedErrorResponse
import org.openapitools.models.ApiNotFoundErrorResponse
import org.openapitools.models.ApiServerErrorResponse
import org.openapitools.models.ApiUnauthorizedErrorResponse
import org.openapitools.models.CalculateTariffsRequest
import org.openapitools.models.CalculateTariffsResponse
import org.openapitools.models.ConfirmPricesRequest
import org.openapitools.models.CreateChatRequest
import org.openapitools.models.CreateChatResponse
import org.openapitools.models.CurrencyType
import org.openapitools.models.DeleteCampaignOffersRequest
import org.openapitools.models.DeleteCampaignOffersResponse
import org.openapitools.models.DeleteGoodsFeedbackCommentRequest
import org.openapitools.models.DeleteHiddenOffersRequest
import org.openapitools.models.DeleteOffersFromArchiveRequest
import org.openapitools.models.DeleteOffersFromArchiveResponse
import org.openapitools.models.DeleteOffersRequest
import org.openapitools.models.DeleteOffersResponse
import org.openapitools.models.DeletePromoOffersRequest
import org.openapitools.models.DeletePromoOffersResponse
import org.openapitools.models.EmptyApiResponse
import org.openapitools.models.FeedIndexLogsStatusType
import java.io.File
import org.openapitools.models.GenerateBoostConsolidatedRequest
import org.openapitools.models.GenerateCompetitorsPositionReportRequest
import org.openapitools.models.GenerateGoodsFeedbackRequest
import org.openapitools.models.GenerateGoodsRealizationReportRequest
import org.openapitools.models.GenerateMassOrderLabelsRequest
import org.openapitools.models.GeneratePricesReportRequest
import org.openapitools.models.GenerateReportResponse
import org.openapitools.models.GenerateShelfsStatisticsRequest
import org.openapitools.models.GenerateShowsSalesReportRequest
import org.openapitools.models.GenerateStocksOnWarehousesReportRequest
import org.openapitools.models.GenerateUnitedMarketplaceServicesReportRequest
import org.openapitools.models.GenerateUnitedNettingReportRequest
import org.openapitools.models.GenerateUnitedOrdersRequest
import org.openapitools.models.GetAllOffersResponse
import org.openapitools.models.GetBidsInfoRequest
import org.openapitools.models.GetBidsInfoResponse
import org.openapitools.models.GetBidsRecommendationsRequest
import org.openapitools.models.GetBidsRecommendationsResponse
import org.openapitools.models.GetBusinessBuyerInfoResponse
import org.openapitools.models.GetBusinessDocumentsInfoResponse
import org.openapitools.models.GetBusinessSettingsResponse
import org.openapitools.models.GetCampaignLoginsResponse
import org.openapitools.models.GetCampaignOffersRequest
import org.openapitools.models.GetCampaignOffersResponse
import org.openapitools.models.GetCampaignRegionResponse
import org.openapitools.models.GetCampaignResponse
import org.openapitools.models.GetCampaignSettingsResponse
import org.openapitools.models.GetCampaignsResponse
import org.openapitools.models.GetCategoriesMaxSaleQuantumRequest
import org.openapitools.models.GetCategoriesMaxSaleQuantumResponse
import org.openapitools.models.GetCategoriesRequest
import org.openapitools.models.GetCategoriesResponse
import org.openapitools.models.GetCategoryContentParametersResponse
import org.openapitools.models.GetChatHistoryRequest
import org.openapitools.models.GetChatHistoryResponse
import org.openapitools.models.GetChatsRequest
import org.openapitools.models.GetChatsResponse
import org.openapitools.models.GetDeliveryServicesResponse
import org.openapitools.models.GetFeedIndexLogsResponse
import org.openapitools.models.GetFeedResponse
import org.openapitools.models.GetFeedbackListResponse
import org.openapitools.models.GetFeedsResponse
import org.openapitools.models.GetGoodsFeedbackCommentsRequest
import org.openapitools.models.GetGoodsFeedbackCommentsResponse
import org.openapitools.models.GetGoodsFeedbackRequest
import org.openapitools.models.GetGoodsFeedbackResponse
import org.openapitools.models.GetGoodsStatsRequest
import org.openapitools.models.GetGoodsStatsResponse
import org.openapitools.models.GetHiddenOffersResponse
import org.openapitools.models.GetOfferCardsContentStatusRequest
import org.openapitools.models.GetOfferCardsContentStatusResponse
import org.openapitools.models.GetOfferMappingEntriesResponse
import org.openapitools.models.GetOfferMappingsRequest
import org.openapitools.models.GetOfferMappingsResponse
import org.openapitools.models.GetOfferRecommendationsRequest
import org.openapitools.models.GetOfferRecommendationsResponse
import org.openapitools.models.GetOffersResponse
import org.openapitools.models.GetOrderLabelsDataResponse
import org.openapitools.models.GetOrderResponse
import org.openapitools.models.GetOrdersResponse
import org.openapitools.models.GetOrdersStatsRequest
import org.openapitools.models.GetOrdersStatsResponse
import org.openapitools.models.GetPricesByOfferIdsRequest
import org.openapitools.models.GetPricesByOfferIdsResponse
import org.openapitools.models.GetPricesResponse
import org.openapitools.models.GetPromoOffersRequest
import org.openapitools.models.GetPromoOffersResponse
import org.openapitools.models.GetPromosRequest
import org.openapitools.models.GetPromosResponse
import org.openapitools.models.GetQualityRatingDetailsResponse
import org.openapitools.models.GetQualityRatingRequest
import org.openapitools.models.GetQualityRatingResponse
import org.openapitools.models.GetQuarantineOffersRequest
import org.openapitools.models.GetQuarantineOffersResponse
import org.openapitools.models.GetRegionWithChildrenResponse
import org.openapitools.models.GetRegionsResponse
import org.openapitools.models.GetReportInfoResponse
import org.openapitools.models.GetReturnResponse
import org.openapitools.models.GetReturnsResponse
import org.openapitools.models.GetSuggestedOfferMappingEntriesRequest
import org.openapitools.models.GetSuggestedOfferMappingEntriesResponse
import org.openapitools.models.GetSuggestedOfferMappingsRequest
import org.openapitools.models.GetSuggestedOfferMappingsResponse
import org.openapitools.models.GetWarehouseStocksRequest
import org.openapitools.models.GetWarehouseStocksResponse
import org.openapitools.models.GetWarehousesResponse
import java.time.LocalDateTime
import org.openapitools.models.OfferAvailabilityStatusType
import org.openapitools.models.OfferMappingKindType
import org.openapitools.models.OfferProcessingStatusType
import org.openapitools.models.OrderBuyerType
import org.openapitools.models.OrderDeliveryDispatchType
import org.openapitools.models.OrderStatusType
import org.openapitools.models.OrderSubstatusType
import org.openapitools.models.PageFormatType
import org.openapitools.models.ProvideOrderItemIdentifiersRequest
import org.openapitools.models.ProvideOrderItemIdentifiersResponse
import org.openapitools.models.PutSkuBidsRequest
import org.openapitools.models.RefundStatusType
import org.openapitools.models.ReportFormatType
import org.openapitools.models.ReturnType
import org.openapitools.models.SendMessageToChatRequest
import scala.collection.immutable.Seq
import org.openapitools.models.SetFeedParamsRequest
import org.openapitools.models.SetOrderBoxLayoutRequest
import org.openapitools.models.SetOrderBoxLayoutResponse
import org.openapitools.models.SetOrderShipmentBoxesRequest
import org.openapitools.models.SetOrderShipmentBoxesResponse
import org.openapitools.models.SkipGoodsFeedbackReactionRequest
import org.openapitools.models.SuggestPricesRequest
import org.openapitools.models.SuggestPricesResponse
import org.openapitools.models.UpdateBusinessPricesRequest
import org.openapitools.models.UpdateCampaignOffersRequest
import org.openapitools.models.UpdateGoodsFeedbackCommentRequest
import org.openapitools.models.UpdateGoodsFeedbackCommentResponse
import org.openapitools.models.UpdateOfferContentRequest
import org.openapitools.models.UpdateOfferContentResponse
import org.openapitools.models.UpdateOfferMappingEntryRequest
import org.openapitools.models.UpdateOfferMappingsRequest
import org.openapitools.models.UpdateOfferMappingsResponse
import org.openapitools.models.UpdateOrderItemRequest
import org.openapitools.models.UpdateOrderStatusRequest
import org.openapitools.models.UpdateOrderStatusResponse
import org.openapitools.models.UpdateOrderStatusesRequest
import org.openapitools.models.UpdateOrderStatusesResponse
import org.openapitools.models.UpdatePricesRequest
import org.openapitools.models.UpdatePromoOffersRequest
import org.openapitools.models.UpdatePromoOffersResponse
import org.openapitools.models.UpdateStocksRequest
import org.openapitools.models.VerifyOrderEacRequest
import org.openapitools.models.VerifyOrderEacResponse
import java.time.ZonedDateTime
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object ExpressApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        addHiddenOffers(da) :+:
        addOffersToArchive(da) :+:
        calculateTariffs(da) :+:
        confirmBusinessPrices(da) :+:
        confirmCampaignPrices(da) :+:
        createChat(da) :+:
        deleteCampaignOffers(da) :+:
        deleteGoodsFeedbackComment(da) :+:
        deleteHiddenOffers(da) :+:
        deleteOffers(da) :+:
        deleteOffersFromArchive(da) :+:
        deletePromoOffers(da) :+:
        generateBoostConsolidatedReport(da) :+:
        generateCompetitorsPositionReport(da) :+:
        generateGoodsFeedbackReport(da) :+:
        generateGoodsRealizationReport(da) :+:
        generateMassOrderLabelsReport(da) :+:
        generateOrderLabel(da) :+:
        generateOrderLabels(da) :+:
        generatePricesReport(da) :+:
        generateShelfsStatisticsReport(da) :+:
        generateShowsSalesReport(da) :+:
        generateStocksOnWarehousesReport(da) :+:
        generateUnitedMarketplaceServicesReport(da) :+:
        generateUnitedNettingReport(da) :+:
        generateUnitedOrdersReport(da) :+:
        getAllOffers(da) :+:
        getBidsInfoForBusiness(da) :+:
        getBidsRecommendations(da) :+:
        getBusinessQuarantineOffers(da) :+:
        getBusinessSettings(da) :+:
        getCampaign(da) :+:
        getCampaignLogins(da) :+:
        getCampaignOffers(da) :+:
        getCampaignQuarantineOffers(da) :+:
        getCampaignRegion(da) :+:
        getCampaignSettings(da) :+:
        getCampaigns(da) :+:
        getCampaignsByLogin(da) :+:
        getCategoriesMaxSaleQuantum(da) :+:
        getCategoriesTree(da) :+:
        getCategoryContentParameters(da) :+:
        getChatHistory(da) :+:
        getChats(da) :+:
        getDeliveryServices(da) :+:
        getFeed(da) :+:
        getFeedIndexLogs(da) :+:
        getFeedbackAndCommentUpdates(da) :+:
        getFeeds(da) :+:
        getGoodsFeedbackComments(da) :+:
        getGoodsFeedbacks(da) :+:
        getGoodsStats(da) :+:
        getHiddenOffers(da) :+:
        getOfferCardsContentStatus(da) :+:
        getOfferMappingEntries(da) :+:
        getOfferMappings(da) :+:
        getOfferRecommendations(da) :+:
        getOffers(da) :+:
        getOrder(da) :+:
        getOrderBusinessBuyerInfo(da) :+:
        getOrderBusinessDocumentsInfo(da) :+:
        getOrderLabelsData(da) :+:
        getOrders(da) :+:
        getOrdersStats(da) :+:
        getPrices(da) :+:
        getPricesByOfferIds(da) :+:
        getPromoOffers(da) :+:
        getPromos(da) :+:
        getQualityRatingDetails(da) :+:
        getQualityRatings(da) :+:
        getReportInfo(da) :+:
        getReturn(da) :+:
        getReturnApplication(da) :+:
        getReturnPhoto(da) :+:
        getReturns(da) :+:
        getStocks(da) :+:
        getSuggestedOfferMappingEntries(da) :+:
        getSuggestedOfferMappings(da) :+:
        getSuggestedPrices(da) :+:
        getWarehouses(da) :+:
        provideOrderItemIdentifiers(da) :+:
        putBidsForBusiness(da) :+:
        putBidsForCampaign(da) :+:
        refreshFeed(da) :+:
        searchRegionChildren(da) :+:
        searchRegionsById(da) :+:
        searchRegionsByName(da) :+:
        sendFileToChat(da) :+:
        sendMessageToChat(da) :+:
        setFeedParams(da) :+:
        setOrderBoxLayout(da) :+:
        setOrderShipmentBoxes(da) :+:
        skipGoodsFeedbacksReaction(da) :+:
        updateBusinessPrices(da) :+:
        updateCampaignOffers(da) :+:
        updateGoodsFeedbackComment(da) :+:
        updateOfferContent(da) :+:
        updateOfferMappingEntries(da) :+:
        updateOfferMappings(da) :+:
        updateOrderItems(da) :+:
        updateOrderStatus(da) :+:
        updateOrderStatuses(da) :+:
        updatePrices(da) :+:
        updatePromoOffers(da) :+:
        updateStocks(da) :+:
        verifyOrderEac(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def addHiddenOffers(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "hidden-offers" :: jsonBody[AddHiddenOffersRequest]) { (campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest) =>
          da.Express_addHiddenOffers(campaignId, addHiddenOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AddOffersToArchiveResponse
        */
        private def addOffersToArchive(da: DataAccessor): Endpoint[AddOffersToArchiveResponse] =
        post("businesses" :: long :: "offer-mappings" :: "archive" :: jsonBody[AddOffersToArchiveRequest]) { (businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest) =>
          da.Express_addOffersToArchive(businessId, addOffersToArchiveRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CalculateTariffsResponse
        */
        private def calculateTariffs(da: DataAccessor): Endpoint[CalculateTariffsResponse] =
        post("tariffs" :: "calculate" :: jsonBody[CalculateTariffsRequest]) { (calculateTariffsRequest: CalculateTariffsRequest) =>
          da.Express_calculateTariffs(calculateTariffsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def confirmBusinessPrices(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "price-quarantine" :: "confirm" :: jsonBody[ConfirmPricesRequest]) { (businessId: Long, confirmPricesRequest: ConfirmPricesRequest) =>
          da.Express_confirmBusinessPrices(businessId, confirmPricesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def confirmCampaignPrices(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "price-quarantine" :: "confirm" :: jsonBody[ConfirmPricesRequest]) { (campaignId: Long, confirmPricesRequest: ConfirmPricesRequest) =>
          da.Express_confirmCampaignPrices(campaignId, confirmPricesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateChatResponse
        */
        private def createChat(da: DataAccessor): Endpoint[CreateChatResponse] =
        post("businesses" :: long :: "chats" :: "new" :: jsonBody[CreateChatRequest]) { (businessId: Long, createChatRequest: CreateChatRequest) =>
          da.Express_createChat(businessId, createChatRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteCampaignOffersResponse
        */
        private def deleteCampaignOffers(da: DataAccessor): Endpoint[DeleteCampaignOffersResponse] =
        post("campaigns" :: long :: "offers" :: "delete" :: jsonBody[DeleteCampaignOffersRequest]) { (campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest) =>
          da.Express_deleteCampaignOffers(campaignId, deleteCampaignOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def deleteGoodsFeedbackComment(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "goods-feedback" :: "comments" :: "delete" :: jsonBody[DeleteGoodsFeedbackCommentRequest]) { (businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest) =>
          da.Express_deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def deleteHiddenOffers(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "hidden-offers" :: "delete" :: jsonBody[DeleteHiddenOffersRequest]) { (campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest) =>
          da.Express_deleteHiddenOffers(campaignId, deleteHiddenOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteOffersResponse
        */
        private def deleteOffers(da: DataAccessor): Endpoint[DeleteOffersResponse] =
        post("businesses" :: long :: "offer-mappings" :: "delete" :: jsonBody[DeleteOffersRequest]) { (businessId: Long, deleteOffersRequest: DeleteOffersRequest) =>
          da.Express_deleteOffers(businessId, deleteOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteOffersFromArchiveResponse
        */
        private def deleteOffersFromArchive(da: DataAccessor): Endpoint[DeleteOffersFromArchiveResponse] =
        post("businesses" :: long :: "offer-mappings" :: "unarchive" :: jsonBody[DeleteOffersFromArchiveRequest]) { (businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest) =>
          da.Express_deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeletePromoOffersResponse
        */
        private def deletePromoOffers(da: DataAccessor): Endpoint[DeletePromoOffersResponse] =
        post("businesses" :: long :: "promos" :: "offers" :: "delete" :: jsonBody[DeletePromoOffersRequest]) { (businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest) =>
          da.Express_deletePromoOffers(businessId, deletePromoOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateBoostConsolidatedReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "boost-consolidated" :: "generate" :: jsonBody[GenerateBoostConsolidatedRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[ReportFormatType]) =>
          da.Express_generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateCompetitorsPositionReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "competitors-position" :: "generate" :: jsonBody[GenerateCompetitorsPositionReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[ReportFormatType]) =>
          da.Express_generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateGoodsFeedbackReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "goods-feedback" :: "generate" :: jsonBody[GenerateGoodsFeedbackRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[ReportFormatType]) =>
          da.Express_generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateGoodsRealizationReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "goods-realization" :: "generate" :: jsonBody[GenerateGoodsRealizationReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[ReportFormatType]) =>
          da.Express_generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateMassOrderLabelsReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "documents" :: "labels" :: "generate" :: jsonBody[GenerateMassOrderLabelsRequest] :: paramOption("format").map(_.map(_.toPageFormatType))) { (generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[PageFormatType]) =>
          da.Express_generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def generateOrderLabel(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "orders" :: long :: "delivery" :: "shipments" :: long :: "boxes" :: long :: "label" :: paramOption("format").map(_.map(_.toPageFormatType))) { (campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: Option[PageFormatType]) =>
          da.Express_generateOrderLabel(campaignId, orderId, shipmentId, boxId, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def generateOrderLabels(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "orders" :: long :: "delivery" :: "labels" :: paramOption("format").map(_.map(_.toPageFormatType))) { (campaignId: Long, orderId: Long, format: Option[PageFormatType]) =>
          da.Express_generateOrderLabels(campaignId, orderId, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generatePricesReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "prices" :: "generate" :: jsonBody[GeneratePricesReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generatePricesReportRequest: GeneratePricesReportRequest, format: Option[ReportFormatType]) =>
          da.Express_generatePricesReport(generatePricesReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateShelfsStatisticsReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "shelf-statistics" :: "generate" :: jsonBody[GenerateShelfsStatisticsRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[ReportFormatType]) =>
          da.Express_generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateShowsSalesReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "shows-sales" :: "generate" :: jsonBody[GenerateShowsSalesReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[ReportFormatType]) =>
          da.Express_generateShowsSalesReport(generateShowsSalesReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateStocksOnWarehousesReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "stocks-on-warehouses" :: "generate" :: jsonBody[GenerateStocksOnWarehousesReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[ReportFormatType]) =>
          da.Express_generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateUnitedMarketplaceServicesReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "united-marketplace-services" :: "generate" :: jsonBody[GenerateUnitedMarketplaceServicesReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[ReportFormatType]) =>
          da.Express_generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateUnitedNettingReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "united-netting" :: "generate" :: jsonBody[GenerateUnitedNettingReportRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[ReportFormatType]) =>
          da.Express_generateUnitedNettingReport(generateUnitedNettingReportRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GenerateReportResponse
        */
        private def generateUnitedOrdersReport(da: DataAccessor): Endpoint[GenerateReportResponse] =
        post("reports" :: "united-orders" :: "generate" :: jsonBody[GenerateUnitedOrdersRequest] :: paramOption("format").map(_.map(_.toReportFormatType))) { (generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[ReportFormatType]) =>
          da.Express_generateUnitedOrdersReport(generateUnitedOrdersRequest, format) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetAllOffersResponse
        */
        private def getAllOffers(da: DataAccessor): Endpoint[GetAllOffersResponse] =
        get("campaigns" :: long :: "offers" :: "all" :: paramOption("feedId").map(_.map(_.toLong)) :: paramOption("chunk").map(_.map(_.toInt))) { (campaignId: Long, feedId: Option[Long], chunk: Option[Int]) =>
          da.Express_getAllOffers(campaignId, feedId, chunk) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBidsInfoResponse
        */
        private def getBidsInfoForBusiness(da: DataAccessor): Endpoint[GetBidsInfoResponse] =
        post("businesses" :: long :: "bids" :: "info" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetBidsInfoRequest]) { (businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: GetBidsInfoRequest) =>
          da.Express_getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBidsRecommendationsResponse
        */
        private def getBidsRecommendations(da: DataAccessor): Endpoint[GetBidsRecommendationsResponse] =
        post("businesses" :: long :: "bids" :: "recommendations" :: jsonBody[GetBidsRecommendationsRequest]) { (businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest) =>
          da.Express_getBidsRecommendations(businessId, getBidsRecommendationsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetQuarantineOffersResponse
        */
        private def getBusinessQuarantineOffers(da: DataAccessor): Endpoint[GetQuarantineOffersResponse] =
        post("businesses" :: long :: "price-quarantine" :: jsonBody[GetQuarantineOffersRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBusinessSettingsResponse
        */
        private def getBusinessSettings(da: DataAccessor): Endpoint[GetBusinessSettingsResponse] =
        post("businesses" :: long :: "settings") { (businessId: Long) =>
          da.Express_getBusinessSettings(businessId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignResponse
        */
        private def getCampaign(da: DataAccessor): Endpoint[GetCampaignResponse] =
        get("campaigns" :: long) { (campaignId: Long) =>
          da.Express_getCampaign(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignLoginsResponse
        */
        private def getCampaignLogins(da: DataAccessor): Endpoint[GetCampaignLoginsResponse] =
        get("campaigns" :: long :: "logins") { (campaignId: Long) =>
          da.Express_getCampaignLogins(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignOffersResponse
        */
        private def getCampaignOffers(da: DataAccessor): Endpoint[GetCampaignOffersResponse] =
        post("campaigns" :: long :: "offers" :: jsonBody[GetCampaignOffersRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetQuarantineOffersResponse
        */
        private def getCampaignQuarantineOffers(da: DataAccessor): Endpoint[GetQuarantineOffersResponse] =
        post("campaigns" :: long :: "price-quarantine" :: jsonBody[GetQuarantineOffersRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignRegionResponse
        */
        private def getCampaignRegion(da: DataAccessor): Endpoint[GetCampaignRegionResponse] =
        get("campaigns" :: long :: "region") { (campaignId: Long) =>
          da.Express_getCampaignRegion(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignSettingsResponse
        */
        private def getCampaignSettings(da: DataAccessor): Endpoint[GetCampaignSettingsResponse] =
        get("campaigns" :: long :: "settings") { (campaignId: Long) =>
          da.Express_getCampaignSettings(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignsResponse
        */
        private def getCampaigns(da: DataAccessor): Endpoint[GetCampaignsResponse] =
        get("campaigns" :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (page: Option[Int], pageSize: Option[Int]) =>
          da.Express_getCampaigns(page, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCampaignsResponse
        */
        private def getCampaignsByLogin(da: DataAccessor): Endpoint[GetCampaignsResponse] =
        get("campaigns" :: "by_login" :: string :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (login: String, page: Option[Int], pageSize: Option[Int]) =>
          da.Express_getCampaignsByLogin(login, page, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCategoriesMaxSaleQuantumResponse
        */
        private def getCategoriesMaxSaleQuantum(da: DataAccessor): Endpoint[GetCategoriesMaxSaleQuantumResponse] =
        post("categories" :: "max-sale-quantum" :: jsonBody[GetCategoriesMaxSaleQuantumRequest]) { (getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest) =>
          da.Express_getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCategoriesResponse
        */
        private def getCategoriesTree(da: DataAccessor): Endpoint[GetCategoriesResponse] =
        post("categories" :: "tree" :: jsonBody[GetCategoriesRequest]) { (getCategoriesRequest: GetCategoriesRequest) =>
          da.Express_getCategoriesTree(getCategoriesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetCategoryContentParametersResponse
        */
        private def getCategoryContentParameters(da: DataAccessor): Endpoint[GetCategoryContentParametersResponse] =
        post("category" :: long :: "parameters") { (categoryId: Long) =>
          da.Express_getCategoryContentParameters(categoryId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetChatHistoryResponse
        */
        private def getChatHistory(da: DataAccessor): Endpoint[GetChatHistoryResponse] =
        post("businesses" :: long :: "chats" :: "history" :: param("chatId").map(_.toLong) :: jsonBody[GetChatHistoryRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetChatsResponse
        */
        private def getChats(da: DataAccessor): Endpoint[GetChatsResponse] =
        post("businesses" :: long :: "chats" :: jsonBody[GetChatsRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getChatsRequest: GetChatsRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getChats(businessId, getChatsRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetDeliveryServicesResponse
        */
        private def getDeliveryServices(da: DataAccessor): Endpoint[GetDeliveryServicesResponse] =
        get("delivery" :: "services") { () =>
          da.Express_getDeliveryServices() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetFeedResponse
        */
        private def getFeed(da: DataAccessor): Endpoint[GetFeedResponse] =
        get("campaigns" :: long :: "feeds" :: long) { (campaignId: Long, feedId: Long) =>
          da.Express_getFeed(campaignId, feedId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetFeedIndexLogsResponse
        */
        private def getFeedIndexLogs(da: DataAccessor): Endpoint[GetFeedIndexLogsResponse] =
        get("campaigns" :: long :: "feeds" :: long :: "index-logs" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("published_time_from").map(_.map(_.toZonedDateTime)) :: paramOption("published_time_to").map(_.map(_.toZonedDateTime)) :: paramOption("status").map(_.map(_.toFeedIndexLogsStatusType))) { (campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[ZonedDateTime], publishedTimeTo: Option[ZonedDateTime], status: Option[FeedIndexLogsStatusType]) =>
          da.Express_getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetFeedbackListResponse
        */
        private def getFeedbackAndCommentUpdates(da: DataAccessor): Endpoint[GetFeedbackListResponse] =
        get("campaigns" :: long :: "feedback" :: "updates" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("from_date").map(_.map(_.toLocalDateTime))) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[LocalDateTime]) =>
          da.Express_getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetFeedsResponse
        */
        private def getFeeds(da: DataAccessor): Endpoint[GetFeedsResponse] =
        get("campaigns" :: long :: "feeds") { (campaignId: Long) =>
          da.Express_getFeeds(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetGoodsFeedbackCommentsResponse
        */
        private def getGoodsFeedbackComments(da: DataAccessor): Endpoint[GetGoodsFeedbackCommentsResponse] =
        post("businesses" :: long :: "goods-feedback" :: "comments" :: jsonBody[GetGoodsFeedbackCommentsRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetGoodsFeedbackResponse
        */
        private def getGoodsFeedbacks(da: DataAccessor): Endpoint[GetGoodsFeedbackResponse] =
        post("businesses" :: long :: "goods-feedback" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetGoodsFeedbackRequest]) { (businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: GetGoodsFeedbackRequest) =>
          da.Express_getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetGoodsStatsResponse
        */
        private def getGoodsStats(da: DataAccessor): Endpoint[GetGoodsStatsResponse] =
        post("campaigns" :: long :: "stats" :: "skus" :: jsonBody[GetGoodsStatsRequest]) { (campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest) =>
          da.Express_getGoodsStats(campaignId, getGoodsStatsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetHiddenOffersResponse
        */
        private def getHiddenOffers(da: DataAccessor): Endpoint[GetHiddenOffersResponse] =
        get("campaigns" :: long :: "hidden-offers" :: params("offer_id") :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("offset").map(_.map(_.toInt)) :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (campaignId: Long, offerId: Seq[String], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Option[Int], pageSize: Option[Int]) =>
          da.Express_getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOfferCardsContentStatusResponse
        */
        private def getOfferCardsContentStatus(da: DataAccessor): Endpoint[GetOfferCardsContentStatusResponse] =
        post("businesses" :: long :: "offer-cards" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetOfferCardsContentStatusRequest]) { (businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest) =>
          da.Express_getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOfferMappingEntriesResponse
        */
        private def getOfferMappingEntries(da: DataAccessor): Endpoint[GetOfferMappingEntriesResponse] =
        get("campaigns" :: long :: "offer-mapping-entries" :: params("offer_id") :: params("shop_sku") :: paramOption("mapping_kind").map(_.map(_.toOfferMappingKindType)) :: params("status") :: params("availability") :: params("category_id") :: params("vendor") :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, offerId: Seq[String], shopSku: Seq[String], mappingKind: Option[OfferMappingKindType], status: Seq[OfferProcessingStatusType], availability: Seq[OfferAvailabilityStatusType], categoryId: Seq[Int], vendor: Seq[String], pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOfferMappingsResponse
        */
        private def getOfferMappings(da: DataAccessor): Endpoint[GetOfferMappingsResponse] =
        post("businesses" :: long :: "offer-mappings" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetOfferMappingsRequest]) { (businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: GetOfferMappingsRequest) =>
          da.Express_getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOfferRecommendationsResponse
        */
        private def getOfferRecommendations(da: DataAccessor): Endpoint[GetOfferRecommendationsResponse] =
        post("businesses" :: long :: "offers" :: "recommendations" :: jsonBody[GetOfferRecommendationsRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOffersResponse
        */
        private def getOffers(da: DataAccessor): Endpoint[GetOffersResponse] =
        get("campaigns" :: long :: "offers" :: paramOption("query") :: paramOption("feedId").map(_.map(_.toLong)) :: paramOption("shopCategoryId") :: paramOption("currency").map(_.map(_.toCurrencyType)) :: paramOption("matched").map(_.map(_.toBoolean)) :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]) =>
          da.Express_getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOrderResponse
        */
        private def getOrder(da: DataAccessor): Endpoint[GetOrderResponse] =
        get("campaigns" :: long :: "orders" :: long) { (campaignId: Long, orderId: Long) =>
          da.Express_getOrder(campaignId, orderId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBusinessBuyerInfoResponse
        */
        private def getOrderBusinessBuyerInfo(da: DataAccessor): Endpoint[GetBusinessBuyerInfoResponse] =
        post("campaigns" :: long :: "orders" :: long :: "business-buyer") { (campaignId: Long, orderId: Long) =>
          da.Express_getOrderBusinessBuyerInfo(campaignId, orderId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetBusinessDocumentsInfoResponse
        */
        private def getOrderBusinessDocumentsInfo(da: DataAccessor): Endpoint[GetBusinessDocumentsInfoResponse] =
        post("campaigns" :: long :: "orders" :: long :: "documents") { (campaignId: Long, orderId: Long) =>
          da.Express_getOrderBusinessDocumentsInfo(campaignId, orderId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOrderLabelsDataResponse
        */
        private def getOrderLabelsData(da: DataAccessor): Endpoint[GetOrderLabelsDataResponse] =
        get("campaigns" :: long :: "orders" :: long :: "delivery" :: "labels" :: "data") { (campaignId: Long, orderId: Long) =>
          da.Express_getOrderLabelsData(campaignId, orderId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOrdersResponse
        */
        private def getOrders(da: DataAccessor): Endpoint[GetOrdersResponse] =
        get("campaigns" :: long :: "orders" :: params("orderIds") :: params("status") :: params("substatus") :: paramOption("fromDate").map(_.map(_.toLocalDateTime)) :: paramOption("toDate").map(_.map(_.toLocalDateTime)) :: paramOption("supplierShipmentDateFrom").map(_.map(_.toLocalDateTime)) :: paramOption("supplierShipmentDateTo").map(_.map(_.toLocalDateTime)) :: paramOption("updatedAtFrom").map(_.map(_.toZonedDateTime)) :: paramOption("updatedAtTo").map(_.map(_.toZonedDateTime)) :: paramOption("dispatchType").map(_.map(_.toOrderDeliveryDispatchType)) :: paramOption("fake").map(_.map(_.toBoolean)) :: paramOption("hasCis").map(_.map(_.toBoolean)) :: paramOption("onlyWaitingForCancellationApprove").map(_.map(_.toBoolean)) :: paramOption("onlyEstimatedDelivery").map(_.map(_.toBoolean)) :: paramOption("buyerType").map(_.map(_.toOrderBuyerType)) :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt)) :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (campaignId: Long, orderIds: Seq[Long], status: Seq[OrderStatusType], substatus: Seq[OrderSubstatusType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], supplierShipmentDateFrom: Option[LocalDateTime], supplierShipmentDateTo: Option[LocalDateTime], updatedAtFrom: Option[ZonedDateTime], updatedAtTo: Option[ZonedDateTime], dispatchType: Option[OrderDeliveryDispatchType], fake: Option[Boolean], hasCis: Option[Boolean], onlyWaitingForCancellationApprove: Option[Boolean], onlyEstimatedDelivery: Option[Boolean], buyerType: Option[OrderBuyerType], page: Option[Int], pageSize: Option[Int], pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetOrdersStatsResponse
        */
        private def getOrdersStats(da: DataAccessor): Endpoint[GetOrdersStatsResponse] =
        post("campaigns" :: long :: "stats" :: "orders" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetOrdersStatsRequest]) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: GetOrdersStatsRequest) =>
          da.Express_getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetPricesResponse
        */
        private def getPrices(da: DataAccessor): Endpoint[GetPricesResponse] =
        get("campaigns" :: long :: "offer-prices" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("archived").map(_.map(_.toBoolean))) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]) =>
          da.Express_getPrices(campaignId, pageToken, limit, archived) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetPricesByOfferIdsResponse
        */
        private def getPricesByOfferIds(da: DataAccessor): Endpoint[GetPricesByOfferIdsResponse] =
        post("campaigns" :: long :: "offer-prices" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetPricesByOfferIdsRequest]) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest) =>
          da.Express_getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetPromoOffersResponse
        */
        private def getPromoOffers(da: DataAccessor): Endpoint[GetPromoOffersResponse] =
        post("businesses" :: long :: "promos" :: "offers" :: jsonBody[GetPromoOffersRequest] :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetPromosResponse
        */
        private def getPromos(da: DataAccessor): Endpoint[GetPromosResponse] =
        post("businesses" :: long :: "promos" :: jsonBody[GetPromosRequest]) { (businessId: Long, getPromosRequest: GetPromosRequest) =>
          da.Express_getPromos(businessId, getPromosRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetQualityRatingDetailsResponse
        */
        private def getQualityRatingDetails(da: DataAccessor): Endpoint[GetQualityRatingDetailsResponse] =
        post("campaigns" :: long :: "ratings" :: "quality" :: "details") { (campaignId: Long) =>
          da.Express_getQualityRatingDetails(campaignId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetQualityRatingResponse
        */
        private def getQualityRatings(da: DataAccessor): Endpoint[GetQualityRatingResponse] =
        post("businesses" :: long :: "ratings" :: "quality" :: jsonBody[GetQualityRatingRequest]) { (businessId: Long, getQualityRatingRequest: GetQualityRatingRequest) =>
          da.Express_getQualityRatings(businessId, getQualityRatingRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetReportInfoResponse
        */
        private def getReportInfo(da: DataAccessor): Endpoint[GetReportInfoResponse] =
        get("reports" :: "info" :: string) { (reportId: String) =>
          da.Express_getReportInfo(reportId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetReturnResponse
        */
        private def getReturn(da: DataAccessor): Endpoint[GetReturnResponse] =
        get("campaigns" :: long :: "orders" :: long :: "returns" :: long) { (campaignId: Long, orderId: Long, returnId: Long) =>
          da.Express_getReturn(campaignId, orderId, returnId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def getReturnApplication(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "orders" :: long :: "returns" :: long :: "application") { (campaignId: Long, orderId: Long, returnId: Long) =>
          da.Express_getReturnApplication(campaignId, orderId, returnId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def getReturnPhoto(da: DataAccessor): Endpoint[File] =
        get("campaigns" :: long :: "orders" :: long :: "returns" :: long :: "decision" :: long :: "image" :: string) { (campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String) =>
          da.Express_getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetReturnsResponse
        */
        private def getReturns(da: DataAccessor): Endpoint[GetReturnsResponse] =
        get("campaigns" :: long :: "returns" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: params("orderIds") :: params("statuses") :: paramOption("type").map(_.map(_.toReturnType)) :: paramOption("fromDate").map(_.map(_.toLocalDateTime)) :: paramOption("toDate").map(_.map(_.toLocalDateTime)) :: paramOption("from_date").map(_.map(_.toLocalDateTime)) :: paramOption("to_date").map(_.map(_.toLocalDateTime))) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], orderIds: Seq[Long], statuses: Seq[RefundStatusType], _type: Option[ReturnType], fromDate: Option[LocalDateTime], toDate: Option[LocalDateTime], fromDate2: Option[LocalDateTime], toDate2: Option[LocalDateTime]) =>
          da.Express_getReturns(campaignId, pageToken, limit, orderIds, statuses, _type, fromDate, toDate, fromDate2, toDate2) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetWarehouseStocksResponse
        */
        private def getStocks(da: DataAccessor): Endpoint[GetWarehouseStocksResponse] =
        post("campaigns" :: long :: "offers" :: "stocks" :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt)) :: jsonBody[GetWarehouseStocksRequest]) { (campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: GetWarehouseStocksRequest) =>
          da.Express_getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetSuggestedOfferMappingEntriesResponse
        */
        private def getSuggestedOfferMappingEntries(da: DataAccessor): Endpoint[GetSuggestedOfferMappingEntriesResponse] =
        post("campaigns" :: long :: "offer-mapping-entries" :: "suggestions" :: jsonBody[GetSuggestedOfferMappingEntriesRequest]) { (campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest) =>
          da.Express_getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetSuggestedOfferMappingsResponse
        */
        private def getSuggestedOfferMappings(da: DataAccessor): Endpoint[GetSuggestedOfferMappingsResponse] =
        post("businesses" :: long :: "offer-mappings" :: "suggestions" :: jsonBody[GetSuggestedOfferMappingsRequest]) { (businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest) =>
          da.Express_getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SuggestPricesResponse
        */
        private def getSuggestedPrices(da: DataAccessor): Endpoint[SuggestPricesResponse] =
        post("campaigns" :: long :: "offer-prices" :: "suggestions" :: jsonBody[SuggestPricesRequest]) { (campaignId: Long, suggestPricesRequest: SuggestPricesRequest) =>
          da.Express_getSuggestedPrices(campaignId, suggestPricesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetWarehousesResponse
        */
        private def getWarehouses(da: DataAccessor): Endpoint[GetWarehousesResponse] =
        get("businesses" :: long :: "warehouses") { (businessId: Long) =>
          da.Express_getWarehouses(businessId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProvideOrderItemIdentifiersResponse
        */
        private def provideOrderItemIdentifiers(da: DataAccessor): Endpoint[ProvideOrderItemIdentifiersResponse] =
        put("campaigns" :: long :: "orders" :: long :: "identifiers" :: jsonBody[ProvideOrderItemIdentifiersRequest]) { (campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest) =>
          da.Express_provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def putBidsForBusiness(da: DataAccessor): Endpoint[EmptyApiResponse] =
        put("businesses" :: long :: "bids" :: jsonBody[PutSkuBidsRequest]) { (businessId: Long, putSkuBidsRequest: PutSkuBidsRequest) =>
          da.Express_putBidsForBusiness(businessId, putSkuBidsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def putBidsForCampaign(da: DataAccessor): Endpoint[EmptyApiResponse] =
        put("campaigns" :: long :: "bids" :: jsonBody[PutSkuBidsRequest]) { (campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest) =>
          da.Express_putBidsForCampaign(campaignId, putSkuBidsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def refreshFeed(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "feeds" :: long :: "refresh") { (campaignId: Long, feedId: Long) =>
          da.Express_refreshFeed(campaignId, feedId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetRegionWithChildrenResponse
        */
        private def searchRegionChildren(da: DataAccessor): Endpoint[GetRegionWithChildrenResponse] =
        get("regions" :: long :: "children" :: paramOption("page").map(_.map(_.toInt)) :: paramOption("pageSize").map(_.map(_.toInt))) { (regionId: Long, page: Option[Int], pageSize: Option[Int]) =>
          da.Express_searchRegionChildren(regionId, page, pageSize) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetRegionsResponse
        */
        private def searchRegionsById(da: DataAccessor): Endpoint[GetRegionsResponse] =
        get("regions" :: long) { (regionId: Long) =>
          da.Express_searchRegionsById(regionId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a GetRegionsResponse
        */
        private def searchRegionsByName(da: DataAccessor): Endpoint[GetRegionsResponse] =
        get("regions" :: param("name") :: paramOption("page_token") :: paramOption("limit").map(_.map(_.toInt))) { (name: String, pageToken: Option[String], limit: Option[Int]) =>
          da.Express_searchRegionsByName(name, pageToken, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def sendFileToChat(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "chats" :: "file" :: "send" :: param("chatId").map(_.toLong) :: fileUpload("file")) { (businessId: Long, chatId: Long, file: FileUpload) =>
          da.Express_sendFileToChat(businessId, chatId, file) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def sendMessageToChat(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "chats" :: "message" :: param("chatId").map(_.toLong) :: jsonBody[SendMessageToChatRequest]) { (businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest) =>
          da.Express_sendMessageToChat(businessId, chatId, sendMessageToChatRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def setFeedParams(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "feeds" :: long :: "params" :: jsonBody[SetFeedParamsRequest]) { (campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest) =>
          da.Express_setFeedParams(campaignId, feedId, setFeedParamsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SetOrderBoxLayoutResponse
        */
        private def setOrderBoxLayout(da: DataAccessor): Endpoint[SetOrderBoxLayoutResponse] =
        put("campaigns" :: long :: "orders" :: long :: "boxes" :: jsonBody[SetOrderBoxLayoutRequest]) { (campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest) =>
          da.Express_setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SetOrderShipmentBoxesResponse
        */
        private def setOrderShipmentBoxes(da: DataAccessor): Endpoint[SetOrderShipmentBoxesResponse] =
        put("campaigns" :: long :: "orders" :: long :: "delivery" :: "shipments" :: long :: "boxes" :: jsonBody[SetOrderShipmentBoxesRequest]) { (campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest) =>
          da.Express_setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def skipGoodsFeedbacksReaction(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "goods-feedback" :: "skip-reaction" :: jsonBody[SkipGoodsFeedbackReactionRequest]) { (businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest) =>
          da.Express_skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def updateBusinessPrices(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("businesses" :: long :: "offer-prices" :: "updates" :: jsonBody[UpdateBusinessPricesRequest]) { (businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest) =>
          da.Express_updateBusinessPrices(businessId, updateBusinessPricesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def updateCampaignOffers(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "offers" :: "update" :: jsonBody[UpdateCampaignOffersRequest]) { (campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest) =>
          da.Express_updateCampaignOffers(campaignId, updateCampaignOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateGoodsFeedbackCommentResponse
        */
        private def updateGoodsFeedbackComment(da: DataAccessor): Endpoint[UpdateGoodsFeedbackCommentResponse] =
        post("businesses" :: long :: "goods-feedback" :: "comments" :: "update" :: jsonBody[UpdateGoodsFeedbackCommentRequest]) { (businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest) =>
          da.Express_updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateOfferContentResponse
        */
        private def updateOfferContent(da: DataAccessor): Endpoint[UpdateOfferContentResponse] =
        post("businesses" :: long :: "offer-cards" :: "update" :: jsonBody[UpdateOfferContentRequest]) { (businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest) =>
          da.Express_updateOfferContent(businessId, updateOfferContentRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def updateOfferMappingEntries(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "offer-mapping-entries" :: "updates" :: jsonBody[UpdateOfferMappingEntryRequest]) { (campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest) =>
          da.Express_updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateOfferMappingsResponse
        */
        private def updateOfferMappings(da: DataAccessor): Endpoint[UpdateOfferMappingsResponse] =
        post("businesses" :: long :: "offer-mappings" :: "update" :: jsonBody[UpdateOfferMappingsRequest]) { (businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest) =>
          da.Express_updateOfferMappings(businessId, updateOfferMappingsRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def updateOrderItems(da: DataAccessor): Endpoint[Unit] =
        put("campaigns" :: long :: "orders" :: long :: "items" :: jsonBody[UpdateOrderItemRequest]) { (campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest) =>
          da.Express_updateOrderItems(campaignId, orderId, updateOrderItemRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateOrderStatusResponse
        */
        private def updateOrderStatus(da: DataAccessor): Endpoint[UpdateOrderStatusResponse] =
        put("campaigns" :: long :: "orders" :: long :: "status" :: jsonBody[UpdateOrderStatusRequest]) { (campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest) =>
          da.Express_updateOrderStatus(campaignId, orderId, updateOrderStatusRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdateOrderStatusesResponse
        */
        private def updateOrderStatuses(da: DataAccessor): Endpoint[UpdateOrderStatusesResponse] =
        post("campaigns" :: long :: "orders" :: "status-update" :: jsonBody[UpdateOrderStatusesRequest]) { (campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest) =>
          da.Express_updateOrderStatuses(campaignId, updateOrderStatusesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def updatePrices(da: DataAccessor): Endpoint[EmptyApiResponse] =
        post("campaigns" :: long :: "offer-prices" :: "updates" :: jsonBody[UpdatePricesRequest]) { (campaignId: Long, updatePricesRequest: UpdatePricesRequest) =>
          da.Express_updatePrices(campaignId, updatePricesRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UpdatePromoOffersResponse
        */
        private def updatePromoOffers(da: DataAccessor): Endpoint[UpdatePromoOffersResponse] =
        post("businesses" :: long :: "promos" :: "offers" :: "update" :: jsonBody[UpdatePromoOffersRequest]) { (businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest) =>
          da.Express_updatePromoOffers(businessId, updatePromoOffersRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EmptyApiResponse
        */
        private def updateStocks(da: DataAccessor): Endpoint[EmptyApiResponse] =
        put("campaigns" :: long :: "offers" :: "stocks" :: jsonBody[UpdateStocksRequest]) { (campaignId: Long, updateStocksRequest: UpdateStocksRequest) =>
          da.Express_updateStocks(campaignId, updateStocksRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VerifyOrderEacResponse
        */
        private def verifyOrderEac(da: DataAccessor): Endpoint[VerifyOrderEacResponse] =
        put("campaigns" :: long :: "orders" :: long :: "verifyEac" :: jsonBody[VerifyOrderEacRequest]) { (campaignId: Long, orderId: Long, verifyOrderEacRequest: VerifyOrderEacRequest) =>
          da.Express_verifyOrderEac(campaignId, orderId, verifyOrderEacRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpExpressApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
