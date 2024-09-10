package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AddHiddenOffersRequest
import model.AddOffersToArchiveRequest
import model.AddOffersToArchiveResponse
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.CalculateTariffsRequest
import model.CalculateTariffsResponse
import model.ConfirmPricesRequest
import model.ConfirmShipmentRequest
import model.CreateChatRequest
import model.CreateChatResponse
import model.CurrencyType
import model.DeleteCampaignOffersRequest
import model.DeleteCampaignOffersResponse
import model.DeleteGoodsFeedbackCommentRequest
import model.DeleteHiddenOffersRequest
import model.DeleteOffersFromArchiveRequest
import model.DeleteOffersFromArchiveResponse
import model.DeleteOffersRequest
import model.DeleteOffersResponse
import model.DeletePromoOffersRequest
import model.DeletePromoOffersResponse
import model.EmptyApiResponse
import model.FeedIndexLogsStatusType
import model.GenerateBoostConsolidatedRequest
import model.GenerateCompetitorsPositionReportRequest
import model.GenerateGoodsFeedbackRequest
import model.GenerateGoodsRealizationReportRequest
import model.GenerateMassOrderLabelsRequest
import model.GeneratePricesReportRequest
import model.GenerateReportResponse
import model.GenerateShelfsStatisticsRequest
import model.GenerateShipmentListDocumentReportRequest
import model.GenerateShowsSalesReportRequest
import model.GenerateStocksOnWarehousesReportRequest
import model.GenerateUnitedMarketplaceServicesReportRequest
import model.GenerateUnitedNettingReportRequest
import model.GenerateUnitedOrdersRequest
import model.GetAllOffersResponse
import model.GetBidsInfoRequest
import model.GetBidsInfoResponse
import model.GetBidsRecommendationsRequest
import model.GetBidsRecommendationsResponse
import model.GetBusinessBuyerInfoResponse
import model.GetBusinessDocumentsInfoResponse
import model.GetBusinessSettingsResponse
import model.GetCampaignLoginsResponse
import model.GetCampaignOffersRequest
import model.GetCampaignOffersResponse
import model.GetCampaignRegionResponse
import model.GetCampaignResponse
import model.GetCampaignSettingsResponse
import model.GetCampaignsResponse
import model.GetCategoriesMaxSaleQuantumRequest
import model.GetCategoriesMaxSaleQuantumResponse
import model.GetCategoriesRequest
import model.GetCategoriesResponse
import model.GetCategoryContentParametersResponse
import model.GetChatHistoryRequest
import model.GetChatHistoryResponse
import model.GetChatsRequest
import model.GetChatsResponse
import model.GetDeliveryServicesResponse
import model.GetFeedIndexLogsResponse
import model.GetFeedResponse
import model.GetFeedbackListResponse
import model.GetFeedsResponse
import model.GetGoodsFeedbackCommentsRequest
import model.GetGoodsFeedbackCommentsResponse
import model.GetGoodsFeedbackRequest
import model.GetGoodsFeedbackResponse
import model.GetGoodsStatsRequest
import model.GetGoodsStatsResponse
import model.GetHiddenOffersResponse
import model.GetOfferCardsContentStatusRequest
import model.GetOfferCardsContentStatusResponse
import model.GetOfferMappingEntriesResponse
import model.GetOfferMappingsRequest
import model.GetOfferMappingsResponse
import model.GetOfferRecommendationsRequest
import model.GetOfferRecommendationsResponse
import model.GetOffersResponse
import model.GetOrderLabelsDataResponse
import model.GetOrderResponse
import model.GetOrdersResponse
import model.GetOrdersStatsRequest
import model.GetOrdersStatsResponse
import model.GetPricesByOfferIdsRequest
import model.GetPricesByOfferIdsResponse
import model.GetPricesResponse
import model.GetPromoOffersRequest
import model.GetPromoOffersResponse
import model.GetPromosRequest
import model.GetPromosResponse
import model.GetQualityRatingDetailsResponse
import model.GetQualityRatingRequest
import model.GetQualityRatingResponse
import model.GetQuarantineOffersRequest
import model.GetQuarantineOffersResponse
import model.GetRegionWithChildrenResponse
import model.GetRegionsResponse
import model.GetReportInfoResponse
import model.GetReturnResponse
import model.GetReturnsResponse
import model.GetShipmentOrdersInfoResponse
import model.GetShipmentResponse
import model.GetSuggestedOfferMappingEntriesRequest
import model.GetSuggestedOfferMappingEntriesResponse
import model.GetSuggestedOfferMappingsRequest
import model.GetSuggestedOfferMappingsResponse
import model.GetWarehouseStocksRequest
import model.GetWarehouseStocksResponse
import model.GetWarehousesResponse
import java.time.LocalDate
import model.OfferAvailabilityStatusType
import model.OfferMappingKindType
import model.OfferProcessingStatusType
import java.time.OffsetDateTime
import model.OrderBuyerType
import model.OrderDeliveryDispatchType
import model.OrderStatusType
import model.OrderSubstatusType
import model.PageFormatType
import model.ProvideOrderItemIdentifiersRequest
import model.ProvideOrderItemIdentifiersResponse
import model.PutSkuBidsRequest
import model.RefundStatusType
import model.ReportFormatType
import model.ReturnType
import model.SearchShipmentsRequest
import model.SearchShipmentsResponse
import model.SendMessageToChatRequest
import scala.collection.immutable.Set
import model.SetFeedParamsRequest
import model.SetOrderBoxLayoutRequest
import model.SetOrderBoxLayoutResponse
import model.SetOrderShipmentBoxesRequest
import model.SetOrderShipmentBoxesResponse
import model.SetShipmentPalletsCountRequest
import model.ShipmentPalletLabelPageFormatType
import model.SkipGoodsFeedbackReactionRequest
import model.SuggestPricesRequest
import model.SuggestPricesResponse
import play.api.libs.Files.TemporaryFile
import model.TransferOrdersFromShipmentRequest
import model.UpdateBusinessPricesRequest
import model.UpdateCampaignOffersRequest
import model.UpdateGoodsFeedbackCommentRequest
import model.UpdateGoodsFeedbackCommentResponse
import model.UpdateOfferContentRequest
import model.UpdateOfferContentResponse
import model.UpdateOfferMappingEntryRequest
import model.UpdateOfferMappingsRequest
import model.UpdateOfferMappingsResponse
import model.UpdateOrderItemRequest
import model.UpdateOrderStatusRequest
import model.UpdateOrderStatusResponse
import model.UpdateOrderStatusesRequest
import model.UpdateOrderStatusesResponse
import model.UpdatePricesRequest
import model.UpdatePromoOffersRequest
import model.UpdatePromoOffersResponse
import model.UpdateStocksRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class FbsApiController @Inject()(cc: ControllerComponents, api: FbsApi) extends AbstractController(cc) {
  /**
    * POST /campaigns/:campaignId/hidden-offers
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def addHiddenOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val addHiddenOffersRequest = request.body.asJson.map(_.as[AddHiddenOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "addHiddenOffersRequest")
      }
      api.addHiddenOffers(campaignId, addHiddenOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/archive
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def addOffersToArchive(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): AddOffersToArchiveResponse = {
      val addOffersToArchiveRequest = request.body.asJson.map(_.as[AddOffersToArchiveRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "addOffersToArchiveRequest")
      }
      api.addOffersToArchive(businessId, addOffersToArchiveRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /tariffs/calculate
    */
  def calculateTariffs(): Action[AnyContent] = Action { request =>
    def executeApi(): CalculateTariffsResponse = {
      val calculateTariffsRequest = request.body.asJson.map(_.as[CalculateTariffsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "calculateTariffsRequest")
      }
      api.calculateTariffs(calculateTariffsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/price-quarantine/confirm
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def confirmBusinessPrices(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val confirmPricesRequest = request.body.asJson.map(_.as[ConfirmPricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "confirmPricesRequest")
      }
      api.confirmBusinessPrices(businessId, confirmPricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/price-quarantine/confirm
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def confirmCampaignPrices(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val confirmPricesRequest = request.body.asJson.map(_.as[ConfirmPricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "confirmPricesRequest")
      }
      api.confirmCampaignPrices(campaignId, confirmPricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/first-mile/shipments/:shipmentId/confirm
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def confirmShipment(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val confirmShipmentRequest = request.body.asJson.map(_.as[ConfirmShipmentRequest])
      api.confirmShipment(campaignId, shipmentId, confirmShipmentRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats/new
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def createChat(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): CreateChatResponse = {
      val createChatRequest = request.body.asJson.map(_.as[CreateChatRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createChatRequest")
      }
      api.createChat(businessId, createChatRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offers/delete
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteCampaignOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteCampaignOffersResponse = {
      val deleteCampaignOffersRequest = request.body.asJson.map(_.as[DeleteCampaignOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteCampaignOffersRequest")
      }
      api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback/comments/delete
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteGoodsFeedbackComment(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val deleteGoodsFeedbackCommentRequest = request.body.asJson.map(_.as[DeleteGoodsFeedbackCommentRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteGoodsFeedbackCommentRequest")
      }
      api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/hidden-offers/delete
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteHiddenOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val deleteHiddenOffersRequest = request.body.asJson.map(_.as[DeleteHiddenOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteHiddenOffersRequest")
      }
      api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/delete
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteOffersResponse = {
      val deleteOffersRequest = request.body.asJson.map(_.as[DeleteOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteOffersRequest")
      }
      api.deleteOffers(businessId, deleteOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/unarchive
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deleteOffersFromArchive(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteOffersFromArchiveResponse = {
      val deleteOffersFromArchiveRequest = request.body.asJson.map(_.as[DeleteOffersFromArchiveRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteOffersFromArchiveRequest")
      }
      api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/promos/offers/delete
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def deletePromoOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): DeletePromoOffersResponse = {
      val deletePromoOffersRequest = request.body.asJson.map(_.as[DeletePromoOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deletePromoOffersRequest")
      }
      api.deletePromoOffers(businessId, deletePromoOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/first-mile/shipments/:shipmentId/act
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def downloadShipmentAct(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.downloadShipmentAct(campaignId, shipmentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/first-mile/shipments/:shipmentId/discrepancy-act
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def downloadShipmentDiscrepancyAct(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.downloadShipmentDiscrepancyAct(campaignId, shipmentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/first-mile/shipments/:shipmentId/inbound-act
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def downloadShipmentInboundAct(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.downloadShipmentInboundAct(campaignId, shipmentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/first-mile/shipments/:shipmentId/pallet/labels?format=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def downloadShipmentPalletLabels(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      val format = request.getQueryString("format")
        .map(value => )
        
      api.downloadShipmentPalletLabels(campaignId, shipmentId, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/shipments/reception-transfer-act?warehouseId=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def downloadShipmentReceptionTransferAct(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      val warehouseId = request.getQueryString("warehouse_id")
        .map(value => value.toInt)
        
      api.downloadShipmentReceptionTransferAct(campaignId, warehouseId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/first-mile/shipments/:shipmentId/transportation-waybill
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def downloadShipmentTransportationWaybill(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.downloadShipmentTransportationWaybill(campaignId, shipmentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/boost-consolidated/generate?format=[value]
    */
  def generateBoostConsolidatedReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateBoostConsolidatedRequest = request.body.asJson.map(_.as[GenerateBoostConsolidatedRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateBoostConsolidatedRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/competitors-position/generate?format=[value]
    */
  def generateCompetitorsPositionReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateCompetitorsPositionReportRequest = request.body.asJson.map(_.as[GenerateCompetitorsPositionReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateCompetitorsPositionReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/goods-feedback/generate?format=[value]
    */
  def generateGoodsFeedbackReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateGoodsFeedbackRequest = request.body.asJson.map(_.as[GenerateGoodsFeedbackRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateGoodsFeedbackRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/goods-realization/generate?format=[value]
    */
  def generateGoodsRealizationReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateGoodsRealizationReportRequest = request.body.asJson.map(_.as[GenerateGoodsRealizationReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateGoodsRealizationReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/documents/labels/generate?format=[value]
    */
  def generateMassOrderLabelsReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateMassOrderLabelsRequest = request.body.asJson.map(_.as[GenerateMassOrderLabelsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateMassOrderLabelsRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label?format=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param shipmentId Идентификатор грузоместа.
    * @param boxId Идентификатор коробки.
    */
  def generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/delivery/labels?format=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def generateOrderLabels(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateOrderLabels(campaignId, orderId, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/prices/generate?format=[value]
    */
  def generatePricesReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generatePricesReportRequest = request.body.asJson.map(_.as[GeneratePricesReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generatePricesReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generatePricesReport(generatePricesReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/shelf-statistics/generate?format=[value]
    */
  def generateShelfsStatisticsReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateShelfsStatisticsRequest = request.body.asJson.map(_.as[GenerateShelfsStatisticsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateShelfsStatisticsRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/documents/shipment-list/generate
    */
  def generateShipmentListDocumentReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateShipmentListDocumentReportRequest = request.body.asJson.map(_.as[GenerateShipmentListDocumentReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateShipmentListDocumentReportRequest")
      }
      api.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/shows-sales/generate?format=[value]
    */
  def generateShowsSalesReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateShowsSalesReportRequest = request.body.asJson.map(_.as[GenerateShowsSalesReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateShowsSalesReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateShowsSalesReport(generateShowsSalesReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/stocks-on-warehouses/generate?format=[value]
    */
  def generateStocksOnWarehousesReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateStocksOnWarehousesReportRequest = request.body.asJson.map(_.as[GenerateStocksOnWarehousesReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateStocksOnWarehousesReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/united-marketplace-services/generate?format=[value]
    */
  def generateUnitedMarketplaceServicesReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateUnitedMarketplaceServicesReportRequest = request.body.asJson.map(_.as[GenerateUnitedMarketplaceServicesReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateUnitedMarketplaceServicesReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/united-netting/generate?format=[value]
    */
  def generateUnitedNettingReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateUnitedNettingReportRequest = request.body.asJson.map(_.as[GenerateUnitedNettingReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateUnitedNettingReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateUnitedNettingReport(generateUnitedNettingReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/united-orders/generate?format=[value]
    */
  def generateUnitedOrdersReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateUnitedOrdersRequest = request.body.asJson.map(_.as[GenerateUnitedOrdersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateUnitedOrdersRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateUnitedOrdersReport(generateUnitedOrdersRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/offers/all?feedId=[value]&chunk=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getAllOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetAllOffersResponse = {
      val feedId = request.getQueryString("feedId")
        .map(value => value.toLong)
        
      val chunk = request.getQueryString("chunk")
        .map(value => value.toInt)
        
      api.getAllOffers(campaignId, feedId, chunk)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/bids/info?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getBidsInfoForBusiness(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetBidsInfoResponse = {
      val getBidsInfoRequest = request.body.asJson.map(_.as[GetBidsInfoRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/bids/recommendations
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getBidsRecommendations(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetBidsRecommendationsResponse = {
      val getBidsRecommendationsRequest = request.body.asJson.map(_.as[GetBidsRecommendationsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getBidsRecommendationsRequest")
      }
      api.getBidsRecommendations(businessId, getBidsRecommendationsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/price-quarantine?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getBusinessQuarantineOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetQuarantineOffersResponse = {
      val getQuarantineOffersRequest = request.body.asJson.map(_.as[GetQuarantineOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getQuarantineOffersRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/settings
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getBusinessSettings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessSettingsResponse = {
      api.getBusinessSettings(businessId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaign(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignResponse = {
      api.getCampaign(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/logins
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignLogins(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignLoginsResponse = {
      api.getCampaignLogins(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offers?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignOffersResponse = {
      val getCampaignOffersRequest = request.body.asJson.map(_.as[GetCampaignOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getCampaignOffersRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/price-quarantine?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignQuarantineOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetQuarantineOffersResponse = {
      val getQuarantineOffersRequest = request.body.asJson.map(_.as[GetQuarantineOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getQuarantineOffersRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/region
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignRegion(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignRegionResponse = {
      api.getCampaignRegion(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/settings
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getCampaignSettings(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignSettingsResponse = {
      api.getCampaignSettings(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns?page=[value]&pageSize=[value]
    */
  def getCampaigns(): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignsResponse = {
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.getCampaigns(page, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/by_login/:login?page=[value]&pageSize=[value]
    * @param login Логин пользователя.
    */
  def getCampaignsByLogin(login: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetCampaignsResponse = {
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.getCampaignsByLogin(login, page, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /categories/max-sale-quantum
    */
  def getCategoriesMaxSaleQuantum(): Action[AnyContent] = Action { request =>
    def executeApi(): GetCategoriesMaxSaleQuantumResponse = {
      val getCategoriesMaxSaleQuantumRequest = request.body.asJson.map(_.as[GetCategoriesMaxSaleQuantumRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getCategoriesMaxSaleQuantumRequest")
      }
      api.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /categories/tree
    */
  def getCategoriesTree(): Action[AnyContent] = Action { request =>
    def executeApi(): GetCategoriesResponse = {
      val getCategoriesRequest = request.body.asJson.map(_.as[GetCategoriesRequest])
      api.getCategoriesTree(getCategoriesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /category/:categoryId/parameters
    * @param categoryId Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    */
  def getCategoryContentParameters(categoryId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetCategoryContentParametersResponse = {
      api.getCategoryContentParameters(categoryId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats/history?chatId=[value]&pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getChatHistory(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetChatHistoryResponse = {
      val getChatHistoryRequest = request.body.asJson.map(_.as[GetChatHistoryRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getChatHistoryRequest")
      }
      val chatId = request.getQueryString("chatId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("chatId", "query string")
        }
        
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getChats(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetChatsResponse = {
      val getChatsRequest = request.body.asJson.map(_.as[GetChatsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getChatsRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getChats(businessId, getChatsRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /delivery/services
    */
  def getDeliveryServices(): Action[AnyContent] = Action { request =>
    def executeApi(): GetDeliveryServicesResponse = {
      api.getDeliveryServices()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/feeds/:feedId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param feedId Идентификатор прайс-листа.
    */
  def getFeed(campaignId: Long, feedId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetFeedResponse = {
      api.getFeed(campaignId, feedId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/feeds/:feedId/index-logs?limit=[value]&publishedTimeFrom=[value]&publishedTimeTo=[value]&status=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param feedId Идентификатор прайс-листа.
    */
  def getFeedIndexLogs(campaignId: Long, feedId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetFeedIndexLogsResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val publishedTimeFrom = request.getQueryString("published_time_from")
        .map(value => OffsetDateTime.parse(value))
        
      val publishedTimeTo = request.getQueryString("published_time_to")
        .map(value => OffsetDateTime.parse(value))
        
      val status = request.getQueryString("status")
        .map(value => )
        
      api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/feedback/updates?pageToken=[value]&limit=[value]&fromDate=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getFeedbackAndCommentUpdates(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetFeedbackListResponse = {
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val fromDate = request.getQueryString("from_date")
        .map(value => LocalDate.parse(value))
        
      api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/feeds
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getFeeds(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetFeedsResponse = {
      api.getFeeds(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback/comments?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getGoodsFeedbackComments(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetGoodsFeedbackCommentsResponse = {
      val getGoodsFeedbackCommentsRequest = request.body.asJson.map(_.as[GetGoodsFeedbackCommentsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getGoodsFeedbackCommentsRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getGoodsFeedbacks(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetGoodsFeedbackResponse = {
      val getGoodsFeedbackRequest = request.body.asJson.map(_.as[GetGoodsFeedbackRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/stats/skus
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getGoodsStats(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetGoodsStatsResponse = {
      val getGoodsStatsRequest = request.body.asJson.map(_.as[GetGoodsStatsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getGoodsStatsRequest")
      }
      api.getGoodsStats(campaignId, getGoodsStatsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/hidden-offers?offerId=[value]&pageToken=[value]&limit=[value]&offset=[value]&page=[value]&pageSize=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getHiddenOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetHiddenOffersResponse = {
      val offerId = request.getQueryString("offer_id")
        .map(values => splitCollectionParam(values, "csv"))
        
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-cards?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOfferCardsContentStatus(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOfferCardsContentStatusResponse = {
      val getOfferCardsContentStatusRequest = request.body.asJson.map(_.as[GetOfferCardsContentStatusRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/offer-mapping-entries?offerId=[value]&shopSku=[value]&mappingKind=[value]&status=[value]&availability=[value]&categoryId=[value]&vendor=[value]&pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOfferMappingEntries(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOfferMappingEntriesResponse = {
      val offerId = request.getQueryString("offer_id")
        .map(values => splitCollectionParam(values, "csv"))
        
      val shopSku = request.getQueryString("shop_sku")
        .map(values => splitCollectionParam(values, "csv"))
        
      val mappingKind = request.getQueryString("mapping_kind")
        .map(value => )
        
      val status = request.getQueryString("status")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val availability = request.getQueryString("availability")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val categoryId = request.getQueryString("category_id")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toInt)
        
      val vendor = request.getQueryString("vendor")
        .map(values => splitCollectionParam(values, "csv"))
        
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOfferMappings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOfferMappingsResponse = {
      val getOfferMappingsRequest = request.body.asJson.map(_.as[GetOfferMappingsRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offers/recommendations?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOfferRecommendations(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOfferRecommendationsResponse = {
      val getOfferRecommendationsRequest = request.body.asJson.map(_.as[GetOfferRecommendationsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getOfferRecommendationsRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/offers?query=[value]&feedId=[value]&shopCategoryId=[value]&currency=[value]&matched=[value]&page=[value]&pageSize=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOffersResponse = {
      val query = request.getQueryString("query")
        
      val feedId = request.getQueryString("feedId")
        .map(value => value.toLong)
        
      val shopCategoryId = request.getQueryString("shopCategoryId")
        
      val currency = request.getQueryString("currency")
        .map(value => )
        
      val matched = request.getQueryString("matched")
        .map(value => value.toBoolean)
        
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def getOrder(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOrderResponse = {
      api.getOrder(campaignId, orderId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/orders/:orderId/business-buyer
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessBuyerInfoResponse = {
      api.getOrderBusinessBuyerInfo(campaignId, orderId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/orders/:orderId/documents
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessDocumentsInfoResponse = {
      api.getOrderBusinessDocumentsInfo(campaignId, orderId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/delivery/labels/data
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def getOrderLabelsData(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOrderLabelsDataResponse = {
      api.getOrderLabelsData(campaignId, orderId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders?orderIds=[value]&status=[value]&substatus=[value]&fromDate=[value]&toDate=[value]&supplierShipmentDateFrom=[value]&supplierShipmentDateTo=[value]&updatedAtFrom=[value]&updatedAtTo=[value]&dispatchType=[value]&fake=[value]&hasCis=[value]&onlyWaitingForCancellationApprove=[value]&onlyEstimatedDelivery=[value]&buyerType=[value]&page=[value]&pageSize=[value]&pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOrders(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOrdersResponse = {
      val orderIds = request.getQueryString("orderIds")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toLong)
        
      val status = request.getQueryString("status")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val substatus = request.getQueryString("substatus")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val fromDate = request.getQueryString("fromDate")
        .map(value => LocalDate.parse(value))
        
      val toDate = request.getQueryString("toDate")
        .map(value => LocalDate.parse(value))
        
      val supplierShipmentDateFrom = request.getQueryString("supplierShipmentDateFrom")
        .map(value => LocalDate.parse(value))
        
      val supplierShipmentDateTo = request.getQueryString("supplierShipmentDateTo")
        .map(value => LocalDate.parse(value))
        
      val updatedAtFrom = request.getQueryString("updatedAtFrom")
        .map(value => OffsetDateTime.parse(value))
        
      val updatedAtTo = request.getQueryString("updatedAtTo")
        .map(value => OffsetDateTime.parse(value))
        
      val dispatchType = request.getQueryString("dispatchType")
        .map(value => )
        
      val fake = request.getQueryString("fake")
        .map(value => value.toBoolean)
        
      val hasCis = request.getQueryString("hasCis")
        .map(value => value.toBoolean)
        
      val onlyWaitingForCancellationApprove = request.getQueryString("onlyWaitingForCancellationApprove")
        .map(value => value.toBoolean)
        
      val onlyEstimatedDelivery = request.getQueryString("onlyEstimatedDelivery")
        .map(value => value.toBoolean)
        
      val buyerType = request.getQueryString("buyerType")
        .map(value => )
        
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/stats/orders?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getOrdersStats(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetOrdersStatsResponse = {
      val getOrdersStatsRequest = request.body.asJson.map(_.as[GetOrdersStatsRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/offer-prices?pageToken=[value]&limit=[value]&archived=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getPrices(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetPricesResponse = {
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val archived = request.getQueryString("archived")
        .map(value => value.toBoolean)
        
      api.getPrices(campaignId, pageToken, limit, archived)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-prices?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getPricesByOfferIds(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetPricesByOfferIdsResponse = {
      val getPricesByOfferIdsRequest = request.body.asJson.map(_.as[GetPricesByOfferIdsRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/promos/offers?pageToken=[value]&limit=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getPromoOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetPromoOffersResponse = {
      val getPromoOffersRequest = request.body.asJson.map(_.as[GetPromoOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getPromoOffersRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/promos
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getPromos(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetPromosResponse = {
      val getPromosRequest = request.body.asJson.map(_.as[GetPromosRequest])
      api.getPromos(businessId, getPromosRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/ratings/quality/details
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getQualityRatingDetails(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetQualityRatingDetailsResponse = {
      api.getQualityRatingDetails(campaignId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/ratings/quality
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getQualityRatings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetQualityRatingResponse = {
      val getQualityRatingRequest = request.body.asJson.map(_.as[GetQualityRatingRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getQualityRatingRequest")
      }
      api.getQualityRatings(businessId, getQualityRatingRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /reports/info/:reportId
    * @param reportId Идентификатор отчета, который вы получили после запуска генерации. 
    */
  def getReportInfo(reportId: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetReportInfoResponse = {
      api.getReportInfo(reportId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/returns/:returnId
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param returnId Идентификатор возврата.
    */
  def getReturn(campaignId: Long, orderId: Long, returnId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetReturnResponse = {
      api.getReturn(campaignId, orderId, returnId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/returns/:returnId/application
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param returnId Идентификатор возврата.
    */
  def getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.getReturnApplication(campaignId, orderId, returnId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param returnId Идентификатор возврата.
    * @param itemId Идентификатор товара в возврате.
    * @param imageHash Хеш ссылки изображения для загрузки.
    */
  def getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/returns?pageToken=[value]&limit=[value]&orderIds=[value]&statuses=[value]&`type`=[value]&fromDate=[value]&toDate=[value]&fromDate2=[value]&toDate2=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getReturns(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetReturnsResponse = {
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val orderIds = request.getQueryString("orderIds")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => value.toLong)
        
      val statuses = request.getQueryString("statuses")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        
      val `type` = request.getQueryString("type")
        .map(value => )
        
      val fromDate = request.getQueryString("fromDate")
        .map(value => LocalDate.parse(value))
        
      val toDate = request.getQueryString("toDate")
        .map(value => LocalDate.parse(value))
        
      val fromDate2 = request.getQueryString("from_date")
        .map(value => LocalDate.parse(value))
        
      val toDate2 = request.getQueryString("to_date")
        .map(value => LocalDate.parse(value))
        
      api.getReturns(campaignId, pageToken, limit, orderIds, statuses, `type`, fromDate, toDate, fromDate2, toDate2)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/first-mile/shipments/:shipmentId?cancelledOrders=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def getShipment(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetShipmentResponse = {
      val cancelledOrders = request.getQueryString("cancelledOrders")
        .map(value => value.toBoolean)
        
      api.getShipment(campaignId, shipmentId, cancelledOrders)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/info
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def getShipmentOrdersInfo(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetShipmentOrdersInfoResponse = {
      api.getShipmentOrdersInfo(campaignId, shipmentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offers/stocks?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getStocks(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetWarehouseStocksResponse = {
      val getWarehouseStocksRequest = request.body.asJson.map(_.as[GetWarehouseStocksRequest])
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-mapping-entries/suggestions
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getSuggestedOfferMappingEntries(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetSuggestedOfferMappingEntriesResponse = {
      val getSuggestedOfferMappingEntriesRequest = request.body.asJson.map(_.as[GetSuggestedOfferMappingEntriesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "getSuggestedOfferMappingEntriesRequest")
      }
      api.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/suggestions
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getSuggestedOfferMappings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetSuggestedOfferMappingsResponse = {
      val getSuggestedOfferMappingsRequest = request.body.asJson.map(_.as[GetSuggestedOfferMappingsRequest])
      api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-prices/suggestions
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getSuggestedPrices(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SuggestPricesResponse = {
      val suggestPricesRequest = request.body.asJson.map(_.as[SuggestPricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "suggestPricesRequest")
      }
      api.getSuggestedPrices(campaignId, suggestPricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /businesses/:businessId/warehouses
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def getWarehouses(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetWarehousesResponse = {
      api.getWarehouses(businessId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/orders/:orderId/identifiers
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def provideOrderItemIdentifiers(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): ProvideOrderItemIdentifiersResponse = {
      val provideOrderItemIdentifiersRequest = request.body.asJson.map(_.as[ProvideOrderItemIdentifiersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "provideOrderItemIdentifiersRequest")
      }
      api.provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /businesses/:businessId/bids
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def putBidsForBusiness(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val putSkuBidsRequest = request.body.asJson.map(_.as[PutSkuBidsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "putSkuBidsRequest")
      }
      api.putBidsForBusiness(businessId, putSkuBidsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/bids
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def putBidsForCampaign(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val putSkuBidsRequest = request.body.asJson.map(_.as[PutSkuBidsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "putSkuBidsRequest")
      }
      api.putBidsForCampaign(campaignId, putSkuBidsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/feeds/:feedId/refresh
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param feedId Идентификатор прайс-листа.
    */
  def refreshFeed(campaignId: Long, feedId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      api.refreshFeed(campaignId, feedId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /regions/:regionId/children?page=[value]&pageSize=[value]
    * @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
    */
  def searchRegionChildren(regionId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetRegionWithChildrenResponse = {
      val page = request.getQueryString("page")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("pageSize")
        .map(value => value.toInt)
        
      api.searchRegionChildren(regionId, page, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /regions/:regionId
    * @param regionId Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
    */
  def searchRegionsById(regionId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): GetRegionsResponse = {
      api.searchRegionsById(regionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /regions?name=[value]&pageToken=[value]&limit=[value]
    */
  def searchRegionsByName(): Action[AnyContent] = Action { request =>
    def executeApi(): GetRegionsResponse = {
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchRegionsByName(name, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/first-mile/shipments?pageToken=[value]&limit=[value]
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def searchShipments(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SearchShipmentsResponse = {
      val searchShipmentsRequest = request.body.asJson.map(_.as[SearchShipmentsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "searchShipmentsRequest")
      }
      val pageToken = request.getQueryString("page_token")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchShipments(campaignId, searchShipmentsRequest, pageToken, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats/file/send?chatId=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def sendFileToChat(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val chatId = request.getQueryString("chatId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("chatId", "query string")
        }
        
      val file = request.body.asMultipartFormData.flatMap(_.file("file").map(_.ref: TemporaryFile))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("file", "form")
        }
        
      api.sendFileToChat(businessId, chatId, file)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/chats/message?chatId=[value]
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def sendMessageToChat(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val sendMessageToChatRequest = request.body.asJson.map(_.as[SendMessageToChatRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "sendMessageToChatRequest")
      }
      val chatId = request.getQueryString("chatId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("chatId", "query string")
        }
        
      api.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/feeds/:feedId/params
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param feedId Идентификатор прайс-листа.
    */
  def setFeedParams(campaignId: Long, feedId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val setFeedParamsRequest = request.body.asJson.map(_.as[SetFeedParamsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "setFeedParamsRequest")
      }
      api.setFeedParams(campaignId, feedId, setFeedParamsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/orders/:orderId/boxes
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def setOrderBoxLayout(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SetOrderBoxLayoutResponse = {
      val setOrderBoxLayoutRequest = request.body.asJson.map(_.as[SetOrderBoxLayoutRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "setOrderBoxLayoutRequest")
      }
      api.setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param shipmentId Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL. 
    */
  def setOrderShipmentBoxes(campaignId: Long, orderId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): SetOrderShipmentBoxesResponse = {
      val setOrderShipmentBoxesRequest = request.body.asJson.map(_.as[SetOrderShipmentBoxesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "setOrderShipmentBoxesRequest")
      }
      api.setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/first-mile/shipments/:shipmentId/pallets
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def setShipmentPalletsCount(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val setShipmentPalletsCountRequest = request.body.asJson.map(_.as[SetShipmentPalletsCountRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "setShipmentPalletsCountRequest")
      }
      api.setShipmentPalletsCount(campaignId, shipmentId, setShipmentPalletsCountRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback/skip-reaction
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def skipGoodsFeedbacksReaction(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val skipGoodsFeedbackReactionRequest = request.body.asJson.map(_.as[SkipGoodsFeedbackReactionRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "skipGoodsFeedbackReactionRequest")
      }
      api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/transfer
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param shipmentId Идентификатор отгрузки.
    */
  def transferOrdersFromShipment(campaignId: Long, shipmentId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val transferOrdersFromShipmentRequest = request.body.asJson.map(_.as[TransferOrdersFromShipmentRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "transferOrdersFromShipmentRequest")
      }
      api.transferOrdersFromShipment(campaignId, shipmentId, transferOrdersFromShipmentRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-prices/updates
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateBusinessPrices(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateBusinessPricesRequest = request.body.asJson.map(_.as[UpdateBusinessPricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateBusinessPricesRequest")
      }
      api.updateBusinessPrices(businessId, updateBusinessPricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offers/update
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateCampaignOffers(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateCampaignOffersRequest = request.body.asJson.map(_.as[UpdateCampaignOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateCampaignOffersRequest")
      }
      api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/goods-feedback/comments/update
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateGoodsFeedbackComment(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateGoodsFeedbackCommentResponse = {
      val updateGoodsFeedbackCommentRequest = request.body.asJson.map(_.as[UpdateGoodsFeedbackCommentRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateGoodsFeedbackCommentRequest")
      }
      api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-cards/update
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateOfferContent(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateOfferContentResponse = {
      val updateOfferContentRequest = request.body.asJson.map(_.as[UpdateOfferContentRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOfferContentRequest")
      }
      api.updateOfferContent(businessId, updateOfferContentRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-mapping-entries/updates
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateOfferMappingEntries(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateOfferMappingEntryRequest = request.body.asJson.map(_.as[UpdateOfferMappingEntryRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOfferMappingEntryRequest")
      }
      api.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/offer-mappings/update
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateOfferMappings(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateOfferMappingsResponse = {
      val updateOfferMappingsRequest = request.body.asJson.map(_.as[UpdateOfferMappingsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOfferMappingsRequest")
      }
      api.updateOfferMappings(businessId, updateOfferMappingsRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/orders/:orderId/items
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def updateOrderItems(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val updateOrderItemRequest = request.body.asJson.map(_.as[UpdateOrderItemRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOrderItemRequest")
      }
      api.updateOrderItems(campaignId, orderId, updateOrderItemRequest)
    }

    executeApi()
    Ok
  }

  /**
    * PUT /campaigns/:campaignId/orders/:orderId/status
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def updateOrderStatus(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateOrderStatusResponse = {
      val updateOrderStatusRequest = request.body.asJson.map(_.as[UpdateOrderStatusRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOrderStatusRequest")
      }
      api.updateOrderStatus(campaignId, orderId, updateOrderStatusRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/orders/status-update
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateOrderStatuses(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateOrderStatusesResponse = {
      val updateOrderStatusesRequest = request.body.asJson.map(_.as[UpdateOrderStatusesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateOrderStatusesRequest")
      }
      api.updateOrderStatuses(campaignId, updateOrderStatusesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /campaigns/:campaignId/offer-prices/updates
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updatePrices(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updatePricesRequest = request.body.asJson.map(_.as[UpdatePricesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updatePricesRequest")
      }
      api.updatePrices(campaignId, updatePricesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /businesses/:businessId/promos/offers/update
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updatePromoOffers(businessId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): UpdatePromoOffersResponse = {
      val updatePromoOffersRequest = request.body.asJson.map(_.as[UpdatePromoOffersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updatePromoOffersRequest")
      }
      api.updatePromoOffers(businessId, updatePromoOffersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /campaigns/:campaignId/offers/stocks
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    */
  def updateStocks(campaignId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val updateStocksRequest = request.body.asJson.map(_.as[UpdateStocksRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateStocksRequest")
      }
      api.updateStocks(campaignId, updateStocksRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
