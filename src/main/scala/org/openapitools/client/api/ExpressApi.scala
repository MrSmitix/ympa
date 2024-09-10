package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.AddHiddenOffersRequest
import org.openapitools.client.api.AddOffersToArchiveRequest
import org.openapitools.client.api.AddOffersToArchiveResponse
import org.openapitools.client.api.ApiClientDataErrorResponse
import org.openapitools.client.api.ApiForbiddenErrorResponse
import org.openapitools.client.api.ApiLimitErrorResponse
import org.openapitools.client.api.ApiLockedErrorResponse
import org.openapitools.client.api.ApiNotFoundErrorResponse
import org.openapitools.client.api.ApiServerErrorResponse
import org.openapitools.client.api.ApiUnauthorizedErrorResponse
import org.openapitools.client.api.CalculateTariffsRequest
import org.openapitools.client.api.CalculateTariffsResponse
import org.openapitools.client.api.ConfirmPricesRequest
import org.openapitools.client.api.CreateChatRequest
import org.openapitools.client.api.CreateChatResponse
import org.openapitools.client.api.CurrencyType
import org.openapitools.client.api.DeleteCampaignOffersRequest
import org.openapitools.client.api.DeleteCampaignOffersResponse
import org.openapitools.client.api.DeleteGoodsFeedbackCommentRequest
import org.openapitools.client.api.DeleteHiddenOffersRequest
import org.openapitools.client.api.DeleteOffersFromArchiveRequest
import org.openapitools.client.api.DeleteOffersFromArchiveResponse
import org.openapitools.client.api.DeleteOffersRequest
import org.openapitools.client.api.DeleteOffersResponse
import org.openapitools.client.api.DeletePromoOffersRequest
import org.openapitools.client.api.DeletePromoOffersResponse
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.FeedIndexLogsStatusType
import java.io.File
import org.openapitools.client.api.GenerateBoostConsolidatedRequest
import org.openapitools.client.api.GenerateCompetitorsPositionReportRequest
import org.openapitools.client.api.GenerateGoodsFeedbackRequest
import org.openapitools.client.api.GenerateGoodsRealizationReportRequest
import org.openapitools.client.api.GenerateMassOrderLabelsRequest
import org.openapitools.client.api.GeneratePricesReportRequest
import org.openapitools.client.api.GenerateReportResponse
import org.openapitools.client.api.GenerateShelfsStatisticsRequest
import org.openapitools.client.api.GenerateShowsSalesReportRequest
import org.openapitools.client.api.GenerateStocksOnWarehousesReportRequest
import org.openapitools.client.api.GenerateUnitedMarketplaceServicesReportRequest
import org.openapitools.client.api.GenerateUnitedNettingReportRequest
import org.openapitools.client.api.GenerateUnitedOrdersRequest
import org.openapitools.client.api.GetAllOffersResponse
import org.openapitools.client.api.GetBidsInfoRequest
import org.openapitools.client.api.GetBidsInfoResponse
import org.openapitools.client.api.GetBidsRecommendationsRequest
import org.openapitools.client.api.GetBidsRecommendationsResponse
import org.openapitools.client.api.GetBusinessBuyerInfoResponse
import org.openapitools.client.api.GetBusinessDocumentsInfoResponse
import org.openapitools.client.api.GetBusinessSettingsResponse
import org.openapitools.client.api.GetCampaignLoginsResponse
import org.openapitools.client.api.GetCampaignOffersRequest
import org.openapitools.client.api.GetCampaignOffersResponse
import org.openapitools.client.api.GetCampaignRegionResponse
import org.openapitools.client.api.GetCampaignResponse
import org.openapitools.client.api.GetCampaignSettingsResponse
import org.openapitools.client.api.GetCampaignsResponse
import org.openapitools.client.api.GetCategoriesMaxSaleQuantumRequest
import org.openapitools.client.api.GetCategoriesMaxSaleQuantumResponse
import org.openapitools.client.api.GetCategoriesRequest
import org.openapitools.client.api.GetCategoriesResponse
import org.openapitools.client.api.GetCategoryContentParametersResponse
import org.openapitools.client.api.GetChatHistoryRequest
import org.openapitools.client.api.GetChatHistoryResponse
import org.openapitools.client.api.GetChatsRequest
import org.openapitools.client.api.GetChatsResponse
import org.openapitools.client.api.GetDeliveryServicesResponse
import org.openapitools.client.api.GetFeedIndexLogsResponse
import org.openapitools.client.api.GetFeedResponse
import org.openapitools.client.api.GetFeedbackListResponse
import org.openapitools.client.api.GetFeedsResponse
import org.openapitools.client.api.GetGoodsFeedbackCommentsRequest
import org.openapitools.client.api.GetGoodsFeedbackCommentsResponse
import org.openapitools.client.api.GetGoodsFeedbackRequest
import org.openapitools.client.api.GetGoodsFeedbackResponse
import org.openapitools.client.api.GetGoodsStatsRequest
import org.openapitools.client.api.GetGoodsStatsResponse
import org.openapitools.client.api.GetHiddenOffersResponse
import org.openapitools.client.api.GetOfferCardsContentStatusRequest
import org.openapitools.client.api.GetOfferCardsContentStatusResponse
import org.openapitools.client.api.GetOfferMappingEntriesResponse
import org.openapitools.client.api.GetOfferMappingsRequest
import org.openapitools.client.api.GetOfferMappingsResponse
import org.openapitools.client.api.GetOfferRecommendationsRequest
import org.openapitools.client.api.GetOfferRecommendationsResponse
import org.openapitools.client.api.GetOffersResponse
import org.openapitools.client.api.GetOrderLabelsDataResponse
import org.openapitools.client.api.GetOrderResponse
import org.openapitools.client.api.GetOrdersResponse
import org.openapitools.client.api.GetOrdersStatsRequest
import org.openapitools.client.api.GetOrdersStatsResponse
import org.openapitools.client.api.GetPricesByOfferIdsRequest
import org.openapitools.client.api.GetPricesByOfferIdsResponse
import org.openapitools.client.api.GetPricesResponse
import org.openapitools.client.api.GetPromoOffersRequest
import org.openapitools.client.api.GetPromoOffersResponse
import org.openapitools.client.api.GetPromosRequest
import org.openapitools.client.api.GetPromosResponse
import org.openapitools.client.api.GetQualityRatingDetailsResponse
import org.openapitools.client.api.GetQualityRatingRequest
import org.openapitools.client.api.GetQualityRatingResponse
import org.openapitools.client.api.GetQuarantineOffersRequest
import org.openapitools.client.api.GetQuarantineOffersResponse
import org.openapitools.client.api.GetRegionWithChildrenResponse
import org.openapitools.client.api.GetRegionsResponse
import org.openapitools.client.api.GetReportInfoResponse
import org.openapitools.client.api.GetReturnResponse
import org.openapitools.client.api.GetReturnsResponse
import org.openapitools.client.api.GetSuggestedOfferMappingEntriesRequest
import org.openapitools.client.api.GetSuggestedOfferMappingEntriesResponse
import org.openapitools.client.api.GetSuggestedOfferMappingsRequest
import org.openapitools.client.api.GetSuggestedOfferMappingsResponse
import org.openapitools.client.api.GetWarehouseStocksRequest
import org.openapitools.client.api.GetWarehouseStocksResponse
import org.openapitools.client.api.GetWarehousesResponse
import java.time.LocalDate
import org.openapitools.client.api.OfferAvailabilityStatusType
import org.openapitools.client.api.OfferMappingKindType
import org.openapitools.client.api.OfferProcessingStatusType
import java.time.OffsetDateTime
import org.openapitools.client.api.OrderBuyerType
import org.openapitools.client.api.OrderDeliveryDispatchType
import org.openapitools.client.api.OrderStatusType
import org.openapitools.client.api.OrderSubstatusType
import org.openapitools.client.api.PageFormatType
import org.openapitools.client.api.ProvideOrderItemIdentifiersRequest
import org.openapitools.client.api.ProvideOrderItemIdentifiersResponse
import org.openapitools.client.api.PutSkuBidsRequest
import org.openapitools.client.api.RefundStatusType
import org.openapitools.client.api.ReportFormatType
import org.openapitools.client.api.ReturnType
import org.openapitools.client.api.SendMessageToChatRequest
import org.openapitools.client.api.Set
import org.openapitools.client.api.SetFeedParamsRequest
import org.openapitools.client.api.SetOrderBoxLayoutRequest
import org.openapitools.client.api.SetOrderBoxLayoutResponse
import org.openapitools.client.api.SetOrderShipmentBoxesRequest
import org.openapitools.client.api.SetOrderShipmentBoxesResponse
import org.openapitools.client.api.SkipGoodsFeedbackReactionRequest
import org.openapitools.client.api.SuggestPricesRequest
import org.openapitools.client.api.SuggestPricesResponse
import org.openapitools.client.api.UpdateBusinessPricesRequest
import org.openapitools.client.api.UpdateCampaignOffersRequest
import org.openapitools.client.api.UpdateGoodsFeedbackCommentRequest
import org.openapitools.client.api.UpdateGoodsFeedbackCommentResponse
import org.openapitools.client.api.UpdateOfferContentRequest
import org.openapitools.client.api.UpdateOfferContentResponse
import org.openapitools.client.api.UpdateOfferMappingEntryRequest
import org.openapitools.client.api.UpdateOfferMappingsRequest
import org.openapitools.client.api.UpdateOfferMappingsResponse
import org.openapitools.client.api.UpdateOrderItemRequest
import org.openapitools.client.api.UpdateOrderStatusRequest
import org.openapitools.client.api.UpdateOrderStatusResponse
import org.openapitools.client.api.UpdateOrderStatusesRequest
import org.openapitools.client.api.UpdateOrderStatusesResponse
import org.openapitools.client.api.UpdatePricesRequest
import org.openapitools.client.api.UpdatePromoOffersRequest
import org.openapitools.client.api.UpdatePromoOffersResponse
import org.openapitools.client.api.UpdateStocksRequest
import org.openapitools.client.api.VerifyOrderEacRequest
import org.openapitools.client.api.VerifyOrderEacResponse

object ExpressApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addHiddenOffers(host: String, campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/hidden-offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addHiddenOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def addOffersToArchive(host: String, businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Task[AddOffersToArchiveResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AddOffersToArchiveResponse] = jsonOf[AddOffersToArchiveResponse]

    val path = "/businesses/{businessId}/offer-mappings/archive".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addOffersToArchiveRequest)
      resp          <- client.expect[AddOffersToArchiveResponse](req)

    } yield resp
  }

  def calculateTariffs(host: String, calculateTariffsRequest: CalculateTariffsRequest): Task[CalculateTariffsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CalculateTariffsResponse] = jsonOf[CalculateTariffsResponse]

    val path = "/tariffs/calculate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(calculateTariffsRequest)
      resp          <- client.expect[CalculateTariffsResponse](req)

    } yield resp
  }

  def confirmBusinessPrices(host: String, businessId: Long, confirmPricesRequest: ConfirmPricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/price-quarantine/confirm".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(confirmPricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def confirmCampaignPrices(host: String, campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/price-quarantine/confirm".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(confirmPricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def createChat(host: String, businessId: Long, createChatRequest: CreateChatRequest): Task[CreateChatResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateChatResponse] = jsonOf[CreateChatResponse]

    val path = "/businesses/{businessId}/chats/new".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createChatRequest)
      resp          <- client.expect[CreateChatResponse](req)

    } yield resp
  }

  def deleteCampaignOffers(host: String, campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Task[DeleteCampaignOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteCampaignOffersResponse] = jsonOf[DeleteCampaignOffersResponse]

    val path = "/campaigns/{campaignId}/offers/delete".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteCampaignOffersRequest)
      resp          <- client.expect[DeleteCampaignOffersResponse](req)

    } yield resp
  }

  def deleteGoodsFeedbackComment(host: String, businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteGoodsFeedbackCommentRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def deleteHiddenOffers(host: String, campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/hidden-offers/delete".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteHiddenOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def deleteOffers(host: String, businessId: Long, deleteOffersRequest: DeleteOffersRequest): Task[DeleteOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteOffersResponse] = jsonOf[DeleteOffersResponse]

    val path = "/businesses/{businessId}/offer-mappings/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteOffersRequest)
      resp          <- client.expect[DeleteOffersResponse](req)

    } yield resp
  }

  def deleteOffersFromArchive(host: String, businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Task[DeleteOffersFromArchiveResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteOffersFromArchiveResponse] = jsonOf[DeleteOffersFromArchiveResponse]

    val path = "/businesses/{businessId}/offer-mappings/unarchive".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteOffersFromArchiveRequest)
      resp          <- client.expect[DeleteOffersFromArchiveResponse](req)

    } yield resp
  }

  def deletePromoOffers(host: String, businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Task[DeletePromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePromoOffersResponse] = jsonOf[DeletePromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deletePromoOffersRequest)
      resp          <- client.expect[DeletePromoOffersResponse](req)

    } yield resp
  }

  def generateBoostConsolidatedReport(host: String, generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/boost-consolidated/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateBoostConsolidatedRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateCompetitorsPositionReport(host: String, generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/competitors-position/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateCompetitorsPositionReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsFeedbackReport(host: String, generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-feedback/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsFeedbackRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsRealizationReport(host: String, generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-realization/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsRealizationReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateMassOrderLabelsReport(host: String, generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: PageFormatType)(implicit formatQuery: QueryParam[PageFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/documents/labels/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateMassOrderLabelsRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateOrderLabel(host: String, campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: PageFormatType)(implicit formatQuery: QueryParam[PageFormatType]): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString)).replaceAll("\\{" + "boxId" + "\\}",escape(boxId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def generateOrderLabels(host: String, campaignId: Long, orderId: Long, format: PageFormatType)(implicit formatQuery: QueryParam[PageFormatType]): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def generatePricesReport(host: String, generatePricesReportRequest: GeneratePricesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/prices/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generatePricesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShelfsStatisticsReport(host: String, generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/shelf-statistics/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShelfsStatisticsRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShowsSalesReport(host: String, generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/shows-sales/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShowsSalesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateStocksOnWarehousesReport(host: String, generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/stocks-on-warehouses/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateStocksOnWarehousesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedMarketplaceServicesReport(host: String, generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-marketplace-services/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedMarketplaceServicesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedNettingReport(host: String, generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-netting/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedNettingReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedOrdersReport(host: String, generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-orders/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedOrdersRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def getAllOffers(host: String, campaignId: Long, feedId: Long, chunk: Integer)(implicit feedIdQuery: QueryParam[Long], chunkQuery: QueryParam[Integer]): Task[GetAllOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetAllOffersResponse] = jsonOf[GetAllOffersResponse]

    val path = "/campaigns/{campaignId}/offers/all".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("feedId", Some(feedIdQuery.toParamString(feedId))), ("chunk", Some(chunkQuery.toParamString(chunk))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetAllOffersResponse](req)

    } yield resp
  }

  def getBidsInfoForBusiness(host: String, businessId: Long, pageToken: String, limit: Integer, getBidsInfoRequest: GetBidsInfoRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetBidsInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBidsInfoResponse] = jsonOf[GetBidsInfoResponse]

    val path = "/businesses/{businessId}/bids/info".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getBidsInfoRequest)
      resp          <- client.expect[GetBidsInfoResponse](req)

    } yield resp
  }

  def getBidsRecommendations(host: String, businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Task[GetBidsRecommendationsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBidsRecommendationsResponse] = jsonOf[GetBidsRecommendationsResponse]

    val path = "/businesses/{businessId}/bids/recommendations".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getBidsRecommendationsRequest)
      resp          <- client.expect[GetBidsRecommendationsResponse](req)

    } yield resp
  }

  def getBusinessQuarantineOffers(host: String, businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetQuarantineOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetQuarantineOffersResponse] = jsonOf[GetQuarantineOffersResponse]

    val path = "/businesses/{businessId}/price-quarantine".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getQuarantineOffersRequest)
      resp          <- client.expect[GetQuarantineOffersResponse](req)

    } yield resp
  }

  def getBusinessSettings(host: String, businessId: Long): Task[GetBusinessSettingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessSettingsResponse] = jsonOf[GetBusinessSettingsResponse]

    val path = "/businesses/{businessId}/settings".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessSettingsResponse](req)

    } yield resp
  }

  def getCampaign(host: String, campaignId: Long): Task[GetCampaignResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignResponse] = jsonOf[GetCampaignResponse]

    val path = "/campaigns/{campaignId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignResponse](req)

    } yield resp
  }

  def getCampaignLogins(host: String, campaignId: Long): Task[GetCampaignLoginsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignLoginsResponse] = jsonOf[GetCampaignLoginsResponse]

    val path = "/campaigns/{campaignId}/logins".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignLoginsResponse](req)

    } yield resp
  }

  def getCampaignOffers(host: String, campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetCampaignOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignOffersResponse] = jsonOf[GetCampaignOffersResponse]

    val path = "/campaigns/{campaignId}/offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCampaignOffersRequest)
      resp          <- client.expect[GetCampaignOffersResponse](req)

    } yield resp
  }

  def getCampaignQuarantineOffers(host: String, campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetQuarantineOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetQuarantineOffersResponse] = jsonOf[GetQuarantineOffersResponse]

    val path = "/campaigns/{campaignId}/price-quarantine".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getQuarantineOffersRequest)
      resp          <- client.expect[GetQuarantineOffersResponse](req)

    } yield resp
  }

  def getCampaignRegion(host: String, campaignId: Long): Task[GetCampaignRegionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignRegionResponse] = jsonOf[GetCampaignRegionResponse]

    val path = "/campaigns/{campaignId}/region".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignRegionResponse](req)

    } yield resp
  }

  def getCampaignSettings(host: String, campaignId: Long): Task[GetCampaignSettingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignSettingsResponse] = jsonOf[GetCampaignSettingsResponse]

    val path = "/campaigns/{campaignId}/settings".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignSettingsResponse](req)

    } yield resp
  }

  def getCampaigns(host: String, page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetCampaignsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]

    val path = "/campaigns"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignsResponse](req)

    } yield resp
  }

  def getCampaignsByLogin(host: String, login: String, page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetCampaignsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]

    val path = "/campaigns/by_login/{login}".replaceAll("\\{" + "login" + "\\}",escape(login.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignsResponse](req)

    } yield resp
  }

  def getCategoriesMaxSaleQuantum(host: String, getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Task[GetCategoriesMaxSaleQuantumResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoriesMaxSaleQuantumResponse] = jsonOf[GetCategoriesMaxSaleQuantumResponse]

    val path = "/categories/max-sale-quantum"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCategoriesMaxSaleQuantumRequest)
      resp          <- client.expect[GetCategoriesMaxSaleQuantumResponse](req)

    } yield resp
  }

  def getCategoriesTree(host: String, getCategoriesRequest: GetCategoriesRequest): Task[GetCategoriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoriesResponse] = jsonOf[GetCategoriesResponse]

    val path = "/categories/tree"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCategoriesRequest)
      resp          <- client.expect[GetCategoriesResponse](req)

    } yield resp
  }

  def getCategoryContentParameters(host: String, categoryId: Long): Task[GetCategoryContentParametersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoryContentParametersResponse] = jsonOf[GetCategoryContentParametersResponse]

    val path = "/category/{categoryId}/parameters".replaceAll("\\{" + "categoryId" + "\\}",escape(categoryId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCategoryContentParametersResponse](req)

    } yield resp
  }

  def getChatHistory(host: String, businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: String, limit: Integer)(implicit chatIdQuery: QueryParam[Long], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetChatHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetChatHistoryResponse] = jsonOf[GetChatHistoryResponse]

    val path = "/businesses/{businessId}/chats/history".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getChatHistoryRequest)
      resp          <- client.expect[GetChatHistoryResponse](req)

    } yield resp
  }

  def getChats(host: String, businessId: Long, getChatsRequest: GetChatsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetChatsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetChatsResponse] = jsonOf[GetChatsResponse]

    val path = "/businesses/{businessId}/chats".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getChatsRequest)
      resp          <- client.expect[GetChatsResponse](req)

    } yield resp
  }

  def getDeliveryServices(host: String): Task[GetDeliveryServicesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetDeliveryServicesResponse] = jsonOf[GetDeliveryServicesResponse]

    val path = "/delivery/services"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetDeliveryServicesResponse](req)

    } yield resp
  }

  def getFeed(host: String, campaignId: Long, feedId: Long): Task[GetFeedResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedResponse] = jsonOf[GetFeedResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedResponse](req)

    } yield resp
  }

  def getFeedIndexLogs(host: String, campaignId: Long, feedId: Long, limit: Integer, publishedTimeFrom: OffsetDateTime, publishedTimeTo: OffsetDateTime, status: FeedIndexLogsStatusType)(implicit limitQuery: QueryParam[Integer], publishedTimeFromQuery: QueryParam[OffsetDateTime], publishedTimeToQuery: QueryParam[OffsetDateTime], statusQuery: QueryParam[FeedIndexLogsStatusType]): Task[GetFeedIndexLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedIndexLogsResponse] = jsonOf[GetFeedIndexLogsResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("publishedTimeFrom", Some(published_time_fromQuery.toParamString(published_time_from))), ("publishedTimeTo", Some(published_time_toQuery.toParamString(published_time_to))), ("status", Some(statusQuery.toParamString(status))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedIndexLogsResponse](req)

    } yield resp
  }

  def getFeedbackAndCommentUpdates(host: String, campaignId: Long, pageToken: String, limit: Integer, fromDate: LocalDate)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], fromDateQuery: QueryParam[LocalDate]): Task[GetFeedbackListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedbackListResponse] = jsonOf[GetFeedbackListResponse]

    val path = "/campaigns/{campaignId}/feedback/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("fromDate", Some(from_dateQuery.toParamString(from_date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedbackListResponse](req)

    } yield resp
  }

  def getFeeds(host: String, campaignId: Long): Task[GetFeedsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedsResponse] = jsonOf[GetFeedsResponse]

    val path = "/campaigns/{campaignId}/feeds".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedsResponse](req)

    } yield resp
  }

  def getGoodsFeedbackComments(host: String, businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetGoodsFeedbackCommentsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsFeedbackCommentsResponse] = jsonOf[GetGoodsFeedbackCommentsResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsFeedbackCommentsRequest)
      resp          <- client.expect[GetGoodsFeedbackCommentsResponse](req)

    } yield resp
  }

  def getGoodsFeedbacks(host: String, businessId: Long, pageToken: String, limit: Integer, getGoodsFeedbackRequest: GetGoodsFeedbackRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetGoodsFeedbackResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsFeedbackResponse] = jsonOf[GetGoodsFeedbackResponse]

    val path = "/businesses/{businessId}/goods-feedback".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsFeedbackRequest)
      resp          <- client.expect[GetGoodsFeedbackResponse](req)

    } yield resp
  }

  def getGoodsStats(host: String, campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): Task[GetGoodsStatsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsStatsResponse] = jsonOf[GetGoodsStatsResponse]

    val path = "/campaigns/{campaignId}/stats/skus".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsStatsRequest)
      resp          <- client.expect[GetGoodsStatsResponse](req)

    } yield resp
  }

  def getHiddenOffers(host: String, campaignId: Long, offerId: List[String] = List.empty[String] , pageToken: String, limit: Integer, offset: Integer, page: Integer = 1, pageSize: Integer)(implicit offerIdQuery: QueryParam[List[String]], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetHiddenOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetHiddenOffersResponse] = jsonOf[GetHiddenOffersResponse]

    val path = "/campaigns/{campaignId}/hidden-offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("offerId", Some(offer_idQuery.toParamString(offer_id))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetHiddenOffersResponse](req)

    } yield resp
  }

  def getOfferCardsContentStatus(host: String, businessId: Long, pageToken: String, limit: Integer, getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferCardsContentStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferCardsContentStatusResponse] = jsonOf[GetOfferCardsContentStatusResponse]

    val path = "/businesses/{businessId}/offer-cards".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferCardsContentStatusRequest)
      resp          <- client.expect[GetOfferCardsContentStatusResponse](req)

    } yield resp
  }

  def getOfferMappingEntries(host: String, campaignId: Long, offerId: List[String] = List.empty[String] , shopSku: List[String] = List.empty[String] , mappingKind: OfferMappingKindType, status: List[OfferProcessingStatusType] = List.empty[OfferProcessingStatusType] , availability: List[OfferAvailabilityStatusType] = List.empty[OfferAvailabilityStatusType] , categoryId: List[Integer] = List.empty[Integer] , vendor: List[String] = List.empty[String] , pageToken: String, limit: Integer)(implicit offerIdQuery: QueryParam[List[String]], shopSkuQuery: QueryParam[List[String]], mappingKindQuery: QueryParam[OfferMappingKindType], statusQuery: QueryParam[List[OfferProcessingStatusType]], availabilityQuery: QueryParam[List[OfferAvailabilityStatusType]], categoryIdQuery: QueryParam[List[Integer]], vendorQuery: QueryParam[List[String]], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferMappingEntriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferMappingEntriesResponse] = jsonOf[GetOfferMappingEntriesResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("offerId", Some(offer_idQuery.toParamString(offer_id))), ("shopSku", Some(shop_skuQuery.toParamString(shop_sku))), ("mappingKind", Some(mapping_kindQuery.toParamString(mapping_kind))), ("status", Some(statusQuery.toParamString(status))), ("availability", Some(availabilityQuery.toParamString(availability))), ("categoryId", Some(category_idQuery.toParamString(category_id))), ("vendor", Some(vendorQuery.toParamString(vendor))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOfferMappingEntriesResponse](req)

    } yield resp
  }

  def getOfferMappings(host: String, businessId: Long, pageToken: String, limit: Integer, getOfferMappingsRequest: GetOfferMappingsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferMappingsResponse] = jsonOf[GetOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferMappingsRequest)
      resp          <- client.expect[GetOfferMappingsResponse](req)

    } yield resp
  }

  def getOfferRecommendations(host: String, businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferRecommendationsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferRecommendationsResponse] = jsonOf[GetOfferRecommendationsResponse]

    val path = "/businesses/{businessId}/offers/recommendations".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferRecommendationsRequest)
      resp          <- client.expect[GetOfferRecommendationsResponse](req)

    } yield resp
  }

  def getOffers(host: String, campaignId: Long, query: String, feedId: Long, shopCategoryId: String, currency: CurrencyType, matched: Boolean, page: Integer = 1, pageSize: Integer)(implicit queryQuery: QueryParam[String], feedIdQuery: QueryParam[Long], shopCategoryIdQuery: QueryParam[String], currencyQuery: QueryParam[CurrencyType], matchedQuery: QueryParam[Boolean], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOffersResponse] = jsonOf[GetOffersResponse]

    val path = "/campaigns/{campaignId}/offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("query", Some(queryQuery.toParamString(query))), ("feedId", Some(feedIdQuery.toParamString(feedId))), ("shopCategoryId", Some(shopCategoryIdQuery.toParamString(shopCategoryId))), ("currency", Some(currencyQuery.toParamString(currency))), ("matched", Some(matchedQuery.toParamString(matched))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOffersResponse](req)

    } yield resp
  }

  def getOrder(host: String, campaignId: Long, orderId: Long): Task[GetOrderResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrderResponse] = jsonOf[GetOrderResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOrderResponse](req)

    } yield resp
  }

  def getOrderBusinessBuyerInfo(host: String, campaignId: Long, orderId: Long): Task[GetBusinessBuyerInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessBuyerInfoResponse] = jsonOf[GetBusinessBuyerInfoResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessBuyerInfoResponse](req)

    } yield resp
  }

  def getOrderBusinessDocumentsInfo(host: String, campaignId: Long, orderId: Long): Task[GetBusinessDocumentsInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessDocumentsInfoResponse] = jsonOf[GetBusinessDocumentsInfoResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/documents".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessDocumentsInfoResponse](req)

    } yield resp
  }

  def getOrderLabelsData(host: String, campaignId: Long, orderId: Long): Task[GetOrderLabelsDataResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrderLabelsDataResponse] = jsonOf[GetOrderLabelsDataResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOrderLabelsDataResponse](req)

    } yield resp
  }

  def getOrders(host: String, campaignId: Long, orderIds: List[Long] = List.empty[Long] , status: Set[OrderStatusType] = Set.empty[OrderStatusType] , substatus: Set[OrderSubstatusType] = Set.empty[OrderSubstatusType] , fromDate: LocalDate, toDate: LocalDate, supplierShipmentDateFrom: LocalDate, supplierShipmentDateTo: LocalDate, updatedAtFrom: OffsetDateTime, updatedAtTo: OffsetDateTime, dispatchType: OrderDeliveryDispatchType, fake: Boolean = false, hasCis: Boolean = false, onlyWaitingForCancellationApprove: Boolean = false, onlyEstimatedDelivery: Boolean = false, buyerType: OrderBuyerType, page: Integer = 1, pageSize: Integer, pageToken: String, limit: Integer)(implicit orderIdsQuery: QueryParam[List[Long]], statusQuery: QueryParam[Set[OrderStatusType]], substatusQuery: QueryParam[Set[OrderSubstatusType]], fromDateQuery: QueryParam[LocalDate], toDateQuery: QueryParam[LocalDate], supplierShipmentDateFromQuery: QueryParam[LocalDate], supplierShipmentDateToQuery: QueryParam[LocalDate], updatedAtFromQuery: QueryParam[OffsetDateTime], updatedAtToQuery: QueryParam[OffsetDateTime], dispatchTypeQuery: QueryParam[OrderDeliveryDispatchType], fakeQuery: QueryParam[Boolean], hasCisQuery: QueryParam[Boolean], onlyWaitingForCancellationApproveQuery: QueryParam[Boolean], onlyEstimatedDeliveryQuery: QueryParam[Boolean], buyerTypeQuery: QueryParam[OrderBuyerType], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOrdersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrdersResponse] = jsonOf[GetOrdersResponse]

    val path = "/campaigns/{campaignId}/orders".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("orderIds", Some(orderIdsQuery.toParamString(orderIds))), ("status", Some(statusQuery.toParamString(status))), ("substatus", Some(substatusQuery.toParamString(substatus))), ("fromDate", Some(fromDateQuery.toParamString(fromDate))), ("toDate", Some(toDateQuery.toParamString(toDate))), ("supplierShipmentDateFrom", Some(supplierShipmentDateFromQuery.toParamString(supplierShipmentDateFrom))), ("supplierShipmentDateTo", Some(supplierShipmentDateToQuery.toParamString(supplierShipmentDateTo))), ("updatedAtFrom", Some(updatedAtFromQuery.toParamString(updatedAtFrom))), ("updatedAtTo", Some(updatedAtToQuery.toParamString(updatedAtTo))), ("dispatchType", Some(dispatchTypeQuery.toParamString(dispatchType))), ("fake", Some(fakeQuery.toParamString(fake))), ("hasCis", Some(hasCisQuery.toParamString(hasCis))), ("onlyWaitingForCancellationApprove", Some(onlyWaitingForCancellationApproveQuery.toParamString(onlyWaitingForCancellationApprove))), ("onlyEstimatedDelivery", Some(onlyEstimatedDeliveryQuery.toParamString(onlyEstimatedDelivery))), ("buyerType", Some(buyerTypeQuery.toParamString(buyerType))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOrdersResponse](req)

    } yield resp
  }

  def getOrdersStats(host: String, campaignId: Long, pageToken: String, limit: Integer, getOrdersStatsRequest: GetOrdersStatsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOrdersStatsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrdersStatsResponse] = jsonOf[GetOrdersStatsResponse]

    val path = "/campaigns/{campaignId}/stats/orders".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOrdersStatsRequest)
      resp          <- client.expect[GetOrdersStatsResponse](req)

    } yield resp
  }

  def getPrices(host: String, campaignId: Long, pageToken: String, limit: Integer, archived: Boolean = false)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], archivedQuery: QueryParam[Boolean]): Task[GetPricesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPricesResponse] = jsonOf[GetPricesResponse]

    val path = "/campaigns/{campaignId}/offer-prices".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("archived", Some(archivedQuery.toParamString(archived))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetPricesResponse](req)

    } yield resp
  }

  def getPricesByOfferIds(host: String, campaignId: Long, pageToken: String, limit: Integer, getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetPricesByOfferIdsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPricesByOfferIdsResponse] = jsonOf[GetPricesByOfferIdsResponse]

    val path = "/campaigns/{campaignId}/offer-prices".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPricesByOfferIdsRequest)
      resp          <- client.expect[GetPricesByOfferIdsResponse](req)

    } yield resp
  }

  def getPromoOffers(host: String, businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetPromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPromoOffersResponse] = jsonOf[GetPromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPromoOffersRequest)
      resp          <- client.expect[GetPromoOffersResponse](req)

    } yield resp
  }

  def getPromos(host: String, businessId: Long, getPromosRequest: GetPromosRequest): Task[GetPromosResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPromosResponse] = jsonOf[GetPromosResponse]

    val path = "/businesses/{businessId}/promos".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPromosRequest)
      resp          <- client.expect[GetPromosResponse](req)

    } yield resp
  }

  def getQualityRatingDetails(host: String, campaignId: Long): Task[GetQualityRatingDetailsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetQualityRatingDetailsResponse] = jsonOf[GetQualityRatingDetailsResponse]

    val path = "/campaigns/{campaignId}/ratings/quality/details".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetQualityRatingDetailsResponse](req)

    } yield resp
  }

  def getQualityRatings(host: String, businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): Task[GetQualityRatingResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetQualityRatingResponse] = jsonOf[GetQualityRatingResponse]

    val path = "/businesses/{businessId}/ratings/quality".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getQualityRatingRequest)
      resp          <- client.expect[GetQualityRatingResponse](req)

    } yield resp
  }

  def getReportInfo(host: String, reportId: String): Task[GetReportInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetReportInfoResponse] = jsonOf[GetReportInfoResponse]

    val path = "/reports/info/{reportId}".replaceAll("\\{" + "reportId" + "\\}",escape(reportId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetReportInfoResponse](req)

    } yield resp
  }

  def getReturn(host: String, campaignId: Long, orderId: Long, returnId: Long): Task[GetReturnResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetReturnResponse] = jsonOf[GetReturnResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetReturnResponse](req)

    } yield resp
  }

  def getReturnApplication(host: String, campaignId: Long, orderId: Long, returnId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getReturnPhoto(host: String, campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString)).replaceAll("\\{" + "itemId" + "\\}",escape(itemId.toString)).replaceAll("\\{" + "imageHash" + "\\}",escape(imageHash.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getReturns(host: String, campaignId: Long, pageToken: String, limit: Integer, orderIds: List[Long] = List.empty[Long] , statuses: List[RefundStatusType] = List.empty[RefundStatusType] , `type`: ReturnType, fromDate: LocalDate, toDate: LocalDate, fromDate2: LocalDate, toDate2: LocalDate)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], orderIdsQuery: QueryParam[List[Long]], statusesQuery: QueryParam[List[RefundStatusType]], `type`Query: QueryParam[ReturnType], fromDateQuery: QueryParam[LocalDate], toDateQuery: QueryParam[LocalDate], fromDate2Query: QueryParam[LocalDate], toDate2Query: QueryParam[LocalDate]): Task[GetReturnsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetReturnsResponse] = jsonOf[GetReturnsResponse]

    val path = "/campaigns/{campaignId}/returns".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("orderIds", Some(orderIdsQuery.toParamString(orderIds))), ("statuses", Some(statusesQuery.toParamString(statuses))), ("`type`", Some(typeQuery.toParamString(type))), ("fromDate", Some(fromDateQuery.toParamString(fromDate))), ("toDate", Some(toDateQuery.toParamString(toDate))), ("fromDate2", Some(from_dateQuery.toParamString(from_date))), ("toDate2", Some(to_dateQuery.toParamString(to_date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetReturnsResponse](req)

    } yield resp
  }

  def getStocks(host: String, campaignId: Long, pageToken: String, limit: Integer, getWarehouseStocksRequest: GetWarehouseStocksRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetWarehouseStocksResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetWarehouseStocksResponse] = jsonOf[GetWarehouseStocksResponse]

    val path = "/campaigns/{campaignId}/offers/stocks".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getWarehouseStocksRequest)
      resp          <- client.expect[GetWarehouseStocksResponse](req)

    } yield resp
  }

  def getSuggestedOfferMappingEntries(host: String, campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Task[GetSuggestedOfferMappingEntriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetSuggestedOfferMappingEntriesResponse] = jsonOf[GetSuggestedOfferMappingEntriesResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getSuggestedOfferMappingEntriesRequest)
      resp          <- client.expect[GetSuggestedOfferMappingEntriesResponse](req)

    } yield resp
  }

  def getSuggestedOfferMappings(host: String, businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Task[GetSuggestedOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetSuggestedOfferMappingsResponse] = jsonOf[GetSuggestedOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings/suggestions".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getSuggestedOfferMappingsRequest)
      resp          <- client.expect[GetSuggestedOfferMappingsResponse](req)

    } yield resp
  }

  def getSuggestedPrices(host: String, campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Task[SuggestPricesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SuggestPricesResponse] = jsonOf[SuggestPricesResponse]

    val path = "/campaigns/{campaignId}/offer-prices/suggestions".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(suggestPricesRequest)
      resp          <- client.expect[SuggestPricesResponse](req)

    } yield resp
  }

  def getWarehouses(host: String, businessId: Long): Task[GetWarehousesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetWarehousesResponse] = jsonOf[GetWarehousesResponse]

    val path = "/businesses/{businessId}/warehouses".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetWarehousesResponse](req)

    } yield resp
  }

  def provideOrderItemIdentifiers(host: String, campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): Task[ProvideOrderItemIdentifiersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProvideOrderItemIdentifiersResponse] = jsonOf[ProvideOrderItemIdentifiersResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(provideOrderItemIdentifiersRequest)
      resp          <- client.expect[ProvideOrderItemIdentifiersResponse](req)

    } yield resp
  }

  def putBidsForBusiness(host: String, businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/bids".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(putSkuBidsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def putBidsForCampaign(host: String, campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/bids".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(putSkuBidsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def refreshFeed(host: String, campaignId: Long, feedId: Long): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def searchRegionChildren(host: String, regionId: Long, page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetRegionWithChildrenResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetRegionWithChildrenResponse] = jsonOf[GetRegionWithChildrenResponse]

    val path = "/regions/{regionId}/children".replaceAll("\\{" + "regionId" + "\\}",escape(regionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetRegionWithChildrenResponse](req)

    } yield resp
  }

  def searchRegionsById(host: String, regionId: Long): Task[GetRegionsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetRegionsResponse] = jsonOf[GetRegionsResponse]

    val path = "/regions/{regionId}".replaceAll("\\{" + "regionId" + "\\}",escape(regionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetRegionsResponse](req)

    } yield resp
  }

  def searchRegionsByName(host: String, name: String, pageToken: String, limit: Integer)(implicit nameQuery: QueryParam[String], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetRegionsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetRegionsResponse] = jsonOf[GetRegionsResponse]

    val path = "/regions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetRegionsResponse](req)

    } yield resp
  }

  def sendFileToChat(host: String, businessId: Long, chatId: Long, file: File)(implicit chatIdQuery: QueryParam[Long]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/chats/file/send".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def sendMessageToChat(host: String, businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest)(implicit chatIdQuery: QueryParam[Long]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/chats/message".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sendMessageToChatRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def setFeedParams(host: String, campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/params".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setFeedParamsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def setOrderBoxLayout(host: String, campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): Task[SetOrderBoxLayoutResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SetOrderBoxLayoutResponse] = jsonOf[SetOrderBoxLayoutResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/boxes".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setOrderBoxLayoutRequest)
      resp          <- client.expect[SetOrderBoxLayoutResponse](req)

    } yield resp
  }

  def setOrderShipmentBoxes(host: String, campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): Task[SetOrderShipmentBoxesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SetOrderShipmentBoxesResponse] = jsonOf[SetOrderShipmentBoxesResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setOrderShipmentBoxesRequest)
      resp          <- client.expect[SetOrderShipmentBoxesResponse](req)

    } yield resp
  }

  def skipGoodsFeedbacksReaction(host: String, businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/goods-feedback/skip-reaction".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(skipGoodsFeedbackReactionRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateBusinessPrices(host: String, businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/offer-prices/updates".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateBusinessPricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateCampaignOffers(host: String, campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offers/update".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateCampaignOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateGoodsFeedbackComment(host: String, businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Task[UpdateGoodsFeedbackCommentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateGoodsFeedbackCommentResponse] = jsonOf[UpdateGoodsFeedbackCommentResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateGoodsFeedbackCommentRequest)
      resp          <- client.expect[UpdateGoodsFeedbackCommentResponse](req)

    } yield resp
  }

  def updateOfferContent(host: String, businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Task[UpdateOfferContentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOfferContentResponse] = jsonOf[UpdateOfferContentResponse]

    val path = "/businesses/{businessId}/offer-cards/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferContentRequest)
      resp          <- client.expect[UpdateOfferContentResponse](req)

    } yield resp
  }

  def updateOfferMappingEntries(host: String, campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferMappingEntryRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateOfferMappings(host: String, businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Task[UpdateOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOfferMappingsResponse] = jsonOf[UpdateOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferMappingsRequest)
      resp          <- client.expect[UpdateOfferMappingsResponse](req)

    } yield resp
  }

  def updateOrderItems(host: String, campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest): Task[Unit] = {
    val path = "/campaigns/{campaignId}/orders/{orderId}/items".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOrderItemRequest)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def updateOrderStatus(host: String, campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest): Task[UpdateOrderStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOrderStatusResponse] = jsonOf[UpdateOrderStatusResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/status".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOrderStatusRequest)
      resp          <- client.expect[UpdateOrderStatusResponse](req)

    } yield resp
  }

  def updateOrderStatuses(host: String, campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest): Task[UpdateOrderStatusesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOrderStatusesResponse] = jsonOf[UpdateOrderStatusesResponse]

    val path = "/campaigns/{campaignId}/orders/status-update".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOrderStatusesRequest)
      resp          <- client.expect[UpdateOrderStatusesResponse](req)

    } yield resp
  }

  def updatePrices(host: String, campaignId: Long, updatePricesRequest: UpdatePricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offer-prices/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updatePromoOffers(host: String, businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Task[UpdatePromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdatePromoOffersResponse] = jsonOf[UpdatePromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePromoOffersRequest)
      resp          <- client.expect[UpdatePromoOffersResponse](req)

    } yield resp
  }

  def updateStocks(host: String, campaignId: Long, updateStocksRequest: UpdateStocksRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offers/stocks".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateStocksRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def verifyOrderEac(host: String, campaignId: Long, orderId: Long, verifyOrderEacRequest: VerifyOrderEacRequest): Task[VerifyOrderEacResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[VerifyOrderEacResponse] = jsonOf[VerifyOrderEacResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(verifyOrderEacRequest)
      resp          <- client.expect[VerifyOrderEacResponse](req)

    } yield resp
  }

}

class HttpServiceExpressApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/hidden-offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addHiddenOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Task[AddOffersToArchiveResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AddOffersToArchiveResponse] = jsonOf[AddOffersToArchiveResponse]

    val path = "/businesses/{businessId}/offer-mappings/archive".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addOffersToArchiveRequest)
      resp          <- client.expect[AddOffersToArchiveResponse](req)

    } yield resp
  }

  def calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest): Task[CalculateTariffsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CalculateTariffsResponse] = jsonOf[CalculateTariffsResponse]

    val path = "/tariffs/calculate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(calculateTariffsRequest)
      resp          <- client.expect[CalculateTariffsResponse](req)

    } yield resp
  }

  def confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/price-quarantine/confirm".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(confirmPricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/price-quarantine/confirm".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(confirmPricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def createChat(businessId: Long, createChatRequest: CreateChatRequest): Task[CreateChatResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateChatResponse] = jsonOf[CreateChatResponse]

    val path = "/businesses/{businessId}/chats/new".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createChatRequest)
      resp          <- client.expect[CreateChatResponse](req)

    } yield resp
  }

  def deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Task[DeleteCampaignOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteCampaignOffersResponse] = jsonOf[DeleteCampaignOffersResponse]

    val path = "/campaigns/{campaignId}/offers/delete".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteCampaignOffersRequest)
      resp          <- client.expect[DeleteCampaignOffersResponse](req)

    } yield resp
  }

  def deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteGoodsFeedbackCommentRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/hidden-offers/delete".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteHiddenOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): Task[DeleteOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteOffersResponse] = jsonOf[DeleteOffersResponse]

    val path = "/businesses/{businessId}/offer-mappings/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteOffersRequest)
      resp          <- client.expect[DeleteOffersResponse](req)

    } yield resp
  }

  def deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Task[DeleteOffersFromArchiveResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteOffersFromArchiveResponse] = jsonOf[DeleteOffersFromArchiveResponse]

    val path = "/businesses/{businessId}/offer-mappings/unarchive".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteOffersFromArchiveRequest)
      resp          <- client.expect[DeleteOffersFromArchiveResponse](req)

    } yield resp
  }

  def deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Task[DeletePromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePromoOffersResponse] = jsonOf[DeletePromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deletePromoOffersRequest)
      resp          <- client.expect[DeletePromoOffersResponse](req)

    } yield resp
  }

  def generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/boost-consolidated/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateBoostConsolidatedRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/competitors-position/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateCompetitorsPositionReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-feedback/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsFeedbackRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-realization/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsRealizationReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: PageFormatType)(implicit formatQuery: QueryParam[PageFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/documents/labels/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateMassOrderLabelsRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: PageFormatType)(implicit formatQuery: QueryParam[PageFormatType]): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString)).replaceAll("\\{" + "boxId" + "\\}",escape(boxId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def generateOrderLabels(campaignId: Long, orderId: Long, format: PageFormatType)(implicit formatQuery: QueryParam[PageFormatType]): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/prices/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generatePricesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/shelf-statistics/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShelfsStatisticsRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/shows-sales/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShowsSalesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/stocks-on-warehouses/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateStocksOnWarehousesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-marketplace-services/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedMarketplaceServicesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-netting/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedNettingReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-orders/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedOrdersRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def getAllOffers(campaignId: Long, feedId: Long, chunk: Integer)(implicit feedIdQuery: QueryParam[Long], chunkQuery: QueryParam[Integer]): Task[GetAllOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetAllOffersResponse] = jsonOf[GetAllOffersResponse]

    val path = "/campaigns/{campaignId}/offers/all".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("feedId", Some(feedIdQuery.toParamString(feedId))), ("chunk", Some(chunkQuery.toParamString(chunk))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetAllOffersResponse](req)

    } yield resp
  }

  def getBidsInfoForBusiness(businessId: Long, pageToken: String, limit: Integer, getBidsInfoRequest: GetBidsInfoRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetBidsInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBidsInfoResponse] = jsonOf[GetBidsInfoResponse]

    val path = "/businesses/{businessId}/bids/info".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getBidsInfoRequest)
      resp          <- client.expect[GetBidsInfoResponse](req)

    } yield resp
  }

  def getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Task[GetBidsRecommendationsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBidsRecommendationsResponse] = jsonOf[GetBidsRecommendationsResponse]

    val path = "/businesses/{businessId}/bids/recommendations".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getBidsRecommendationsRequest)
      resp          <- client.expect[GetBidsRecommendationsResponse](req)

    } yield resp
  }

  def getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetQuarantineOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetQuarantineOffersResponse] = jsonOf[GetQuarantineOffersResponse]

    val path = "/businesses/{businessId}/price-quarantine".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getQuarantineOffersRequest)
      resp          <- client.expect[GetQuarantineOffersResponse](req)

    } yield resp
  }

  def getBusinessSettings(businessId: Long): Task[GetBusinessSettingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessSettingsResponse] = jsonOf[GetBusinessSettingsResponse]

    val path = "/businesses/{businessId}/settings".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessSettingsResponse](req)

    } yield resp
  }

  def getCampaign(campaignId: Long): Task[GetCampaignResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignResponse] = jsonOf[GetCampaignResponse]

    val path = "/campaigns/{campaignId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignResponse](req)

    } yield resp
  }

  def getCampaignLogins(campaignId: Long): Task[GetCampaignLoginsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignLoginsResponse] = jsonOf[GetCampaignLoginsResponse]

    val path = "/campaigns/{campaignId}/logins".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignLoginsResponse](req)

    } yield resp
  }

  def getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetCampaignOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignOffersResponse] = jsonOf[GetCampaignOffersResponse]

    val path = "/campaigns/{campaignId}/offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCampaignOffersRequest)
      resp          <- client.expect[GetCampaignOffersResponse](req)

    } yield resp
  }

  def getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetQuarantineOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetQuarantineOffersResponse] = jsonOf[GetQuarantineOffersResponse]

    val path = "/campaigns/{campaignId}/price-quarantine".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getQuarantineOffersRequest)
      resp          <- client.expect[GetQuarantineOffersResponse](req)

    } yield resp
  }

  def getCampaignRegion(campaignId: Long): Task[GetCampaignRegionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignRegionResponse] = jsonOf[GetCampaignRegionResponse]

    val path = "/campaigns/{campaignId}/region".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignRegionResponse](req)

    } yield resp
  }

  def getCampaignSettings(campaignId: Long): Task[GetCampaignSettingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignSettingsResponse] = jsonOf[GetCampaignSettingsResponse]

    val path = "/campaigns/{campaignId}/settings".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignSettingsResponse](req)

    } yield resp
  }

  def getCampaigns(page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetCampaignsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]

    val path = "/campaigns"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignsResponse](req)

    } yield resp
  }

  def getCampaignsByLogin(login: String, page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetCampaignsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]

    val path = "/campaigns/by_login/{login}".replaceAll("\\{" + "login" + "\\}",escape(login.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignsResponse](req)

    } yield resp
  }

  def getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Task[GetCategoriesMaxSaleQuantumResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoriesMaxSaleQuantumResponse] = jsonOf[GetCategoriesMaxSaleQuantumResponse]

    val path = "/categories/max-sale-quantum"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCategoriesMaxSaleQuantumRequest)
      resp          <- client.expect[GetCategoriesMaxSaleQuantumResponse](req)

    } yield resp
  }

  def getCategoriesTree(getCategoriesRequest: GetCategoriesRequest): Task[GetCategoriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoriesResponse] = jsonOf[GetCategoriesResponse]

    val path = "/categories/tree"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCategoriesRequest)
      resp          <- client.expect[GetCategoriesResponse](req)

    } yield resp
  }

  def getCategoryContentParameters(categoryId: Long): Task[GetCategoryContentParametersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoryContentParametersResponse] = jsonOf[GetCategoryContentParametersResponse]

    val path = "/category/{categoryId}/parameters".replaceAll("\\{" + "categoryId" + "\\}",escape(categoryId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCategoryContentParametersResponse](req)

    } yield resp
  }

  def getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: String, limit: Integer)(implicit chatIdQuery: QueryParam[Long], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetChatHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetChatHistoryResponse] = jsonOf[GetChatHistoryResponse]

    val path = "/businesses/{businessId}/chats/history".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getChatHistoryRequest)
      resp          <- client.expect[GetChatHistoryResponse](req)

    } yield resp
  }

  def getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetChatsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetChatsResponse] = jsonOf[GetChatsResponse]

    val path = "/businesses/{businessId}/chats".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getChatsRequest)
      resp          <- client.expect[GetChatsResponse](req)

    } yield resp
  }

  def getDeliveryServices(): Task[GetDeliveryServicesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetDeliveryServicesResponse] = jsonOf[GetDeliveryServicesResponse]

    val path = "/delivery/services"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetDeliveryServicesResponse](req)

    } yield resp
  }

  def getFeed(campaignId: Long, feedId: Long): Task[GetFeedResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedResponse] = jsonOf[GetFeedResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedResponse](req)

    } yield resp
  }

  def getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Integer, publishedTimeFrom: OffsetDateTime, publishedTimeTo: OffsetDateTime, status: FeedIndexLogsStatusType)(implicit limitQuery: QueryParam[Integer], publishedTimeFromQuery: QueryParam[OffsetDateTime], publishedTimeToQuery: QueryParam[OffsetDateTime], statusQuery: QueryParam[FeedIndexLogsStatusType]): Task[GetFeedIndexLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedIndexLogsResponse] = jsonOf[GetFeedIndexLogsResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("publishedTimeFrom", Some(published_time_fromQuery.toParamString(published_time_from))), ("publishedTimeTo", Some(published_time_toQuery.toParamString(published_time_to))), ("status", Some(statusQuery.toParamString(status))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedIndexLogsResponse](req)

    } yield resp
  }

  def getFeedbackAndCommentUpdates(campaignId: Long, pageToken: String, limit: Integer, fromDate: LocalDate)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], fromDateQuery: QueryParam[LocalDate]): Task[GetFeedbackListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedbackListResponse] = jsonOf[GetFeedbackListResponse]

    val path = "/campaigns/{campaignId}/feedback/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("fromDate", Some(from_dateQuery.toParamString(from_date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedbackListResponse](req)

    } yield resp
  }

  def getFeeds(campaignId: Long): Task[GetFeedsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedsResponse] = jsonOf[GetFeedsResponse]

    val path = "/campaigns/{campaignId}/feeds".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedsResponse](req)

    } yield resp
  }

  def getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetGoodsFeedbackCommentsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsFeedbackCommentsResponse] = jsonOf[GetGoodsFeedbackCommentsResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsFeedbackCommentsRequest)
      resp          <- client.expect[GetGoodsFeedbackCommentsResponse](req)

    } yield resp
  }

  def getGoodsFeedbacks(businessId: Long, pageToken: String, limit: Integer, getGoodsFeedbackRequest: GetGoodsFeedbackRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetGoodsFeedbackResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsFeedbackResponse] = jsonOf[GetGoodsFeedbackResponse]

    val path = "/businesses/{businessId}/goods-feedback".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsFeedbackRequest)
      resp          <- client.expect[GetGoodsFeedbackResponse](req)

    } yield resp
  }

  def getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): Task[GetGoodsStatsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsStatsResponse] = jsonOf[GetGoodsStatsResponse]

    val path = "/campaigns/{campaignId}/stats/skus".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsStatsRequest)
      resp          <- client.expect[GetGoodsStatsResponse](req)

    } yield resp
  }

  def getHiddenOffers(campaignId: Long, offerId: List[String] = List.empty[String] , pageToken: String, limit: Integer, offset: Integer, page: Integer = 1, pageSize: Integer)(implicit offerIdQuery: QueryParam[List[String]], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetHiddenOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetHiddenOffersResponse] = jsonOf[GetHiddenOffersResponse]

    val path = "/campaigns/{campaignId}/hidden-offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("offerId", Some(offer_idQuery.toParamString(offer_id))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetHiddenOffersResponse](req)

    } yield resp
  }

  def getOfferCardsContentStatus(businessId: Long, pageToken: String, limit: Integer, getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferCardsContentStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferCardsContentStatusResponse] = jsonOf[GetOfferCardsContentStatusResponse]

    val path = "/businesses/{businessId}/offer-cards".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferCardsContentStatusRequest)
      resp          <- client.expect[GetOfferCardsContentStatusResponse](req)

    } yield resp
  }

  def getOfferMappingEntries(campaignId: Long, offerId: List[String] = List.empty[String] , shopSku: List[String] = List.empty[String] , mappingKind: OfferMappingKindType, status: List[OfferProcessingStatusType] = List.empty[OfferProcessingStatusType] , availability: List[OfferAvailabilityStatusType] = List.empty[OfferAvailabilityStatusType] , categoryId: List[Integer] = List.empty[Integer] , vendor: List[String] = List.empty[String] , pageToken: String, limit: Integer)(implicit offerIdQuery: QueryParam[List[String]], shopSkuQuery: QueryParam[List[String]], mappingKindQuery: QueryParam[OfferMappingKindType], statusQuery: QueryParam[List[OfferProcessingStatusType]], availabilityQuery: QueryParam[List[OfferAvailabilityStatusType]], categoryIdQuery: QueryParam[List[Integer]], vendorQuery: QueryParam[List[String]], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferMappingEntriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferMappingEntriesResponse] = jsonOf[GetOfferMappingEntriesResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("offerId", Some(offer_idQuery.toParamString(offer_id))), ("shopSku", Some(shop_skuQuery.toParamString(shop_sku))), ("mappingKind", Some(mapping_kindQuery.toParamString(mapping_kind))), ("status", Some(statusQuery.toParamString(status))), ("availability", Some(availabilityQuery.toParamString(availability))), ("categoryId", Some(category_idQuery.toParamString(category_id))), ("vendor", Some(vendorQuery.toParamString(vendor))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOfferMappingEntriesResponse](req)

    } yield resp
  }

  def getOfferMappings(businessId: Long, pageToken: String, limit: Integer, getOfferMappingsRequest: GetOfferMappingsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferMappingsResponse] = jsonOf[GetOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferMappingsRequest)
      resp          <- client.expect[GetOfferMappingsResponse](req)

    } yield resp
  }

  def getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferRecommendationsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferRecommendationsResponse] = jsonOf[GetOfferRecommendationsResponse]

    val path = "/businesses/{businessId}/offers/recommendations".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferRecommendationsRequest)
      resp          <- client.expect[GetOfferRecommendationsResponse](req)

    } yield resp
  }

  def getOffers(campaignId: Long, query: String, feedId: Long, shopCategoryId: String, currency: CurrencyType, matched: Boolean, page: Integer = 1, pageSize: Integer)(implicit queryQuery: QueryParam[String], feedIdQuery: QueryParam[Long], shopCategoryIdQuery: QueryParam[String], currencyQuery: QueryParam[CurrencyType], matchedQuery: QueryParam[Boolean], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOffersResponse] = jsonOf[GetOffersResponse]

    val path = "/campaigns/{campaignId}/offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("query", Some(queryQuery.toParamString(query))), ("feedId", Some(feedIdQuery.toParamString(feedId))), ("shopCategoryId", Some(shopCategoryIdQuery.toParamString(shopCategoryId))), ("currency", Some(currencyQuery.toParamString(currency))), ("matched", Some(matchedQuery.toParamString(matched))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOffersResponse](req)

    } yield resp
  }

  def getOrder(campaignId: Long, orderId: Long): Task[GetOrderResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrderResponse] = jsonOf[GetOrderResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOrderResponse](req)

    } yield resp
  }

  def getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): Task[GetBusinessBuyerInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessBuyerInfoResponse] = jsonOf[GetBusinessBuyerInfoResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessBuyerInfoResponse](req)

    } yield resp
  }

  def getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): Task[GetBusinessDocumentsInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBusinessDocumentsInfoResponse] = jsonOf[GetBusinessDocumentsInfoResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/documents".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetBusinessDocumentsInfoResponse](req)

    } yield resp
  }

  def getOrderLabelsData(campaignId: Long, orderId: Long): Task[GetOrderLabelsDataResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrderLabelsDataResponse] = jsonOf[GetOrderLabelsDataResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOrderLabelsDataResponse](req)

    } yield resp
  }

  def getOrders(campaignId: Long, orderIds: List[Long] = List.empty[Long] , status: Set[OrderStatusType] = Set.empty[OrderStatusType] , substatus: Set[OrderSubstatusType] = Set.empty[OrderSubstatusType] , fromDate: LocalDate, toDate: LocalDate, supplierShipmentDateFrom: LocalDate, supplierShipmentDateTo: LocalDate, updatedAtFrom: OffsetDateTime, updatedAtTo: OffsetDateTime, dispatchType: OrderDeliveryDispatchType, fake: Boolean = false, hasCis: Boolean = false, onlyWaitingForCancellationApprove: Boolean = false, onlyEstimatedDelivery: Boolean = false, buyerType: OrderBuyerType, page: Integer = 1, pageSize: Integer, pageToken: String, limit: Integer)(implicit orderIdsQuery: QueryParam[List[Long]], statusQuery: QueryParam[Set[OrderStatusType]], substatusQuery: QueryParam[Set[OrderSubstatusType]], fromDateQuery: QueryParam[LocalDate], toDateQuery: QueryParam[LocalDate], supplierShipmentDateFromQuery: QueryParam[LocalDate], supplierShipmentDateToQuery: QueryParam[LocalDate], updatedAtFromQuery: QueryParam[OffsetDateTime], updatedAtToQuery: QueryParam[OffsetDateTime], dispatchTypeQuery: QueryParam[OrderDeliveryDispatchType], fakeQuery: QueryParam[Boolean], hasCisQuery: QueryParam[Boolean], onlyWaitingForCancellationApproveQuery: QueryParam[Boolean], onlyEstimatedDeliveryQuery: QueryParam[Boolean], buyerTypeQuery: QueryParam[OrderBuyerType], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOrdersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrdersResponse] = jsonOf[GetOrdersResponse]

    val path = "/campaigns/{campaignId}/orders".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("orderIds", Some(orderIdsQuery.toParamString(orderIds))), ("status", Some(statusQuery.toParamString(status))), ("substatus", Some(substatusQuery.toParamString(substatus))), ("fromDate", Some(fromDateQuery.toParamString(fromDate))), ("toDate", Some(toDateQuery.toParamString(toDate))), ("supplierShipmentDateFrom", Some(supplierShipmentDateFromQuery.toParamString(supplierShipmentDateFrom))), ("supplierShipmentDateTo", Some(supplierShipmentDateToQuery.toParamString(supplierShipmentDateTo))), ("updatedAtFrom", Some(updatedAtFromQuery.toParamString(updatedAtFrom))), ("updatedAtTo", Some(updatedAtToQuery.toParamString(updatedAtTo))), ("dispatchType", Some(dispatchTypeQuery.toParamString(dispatchType))), ("fake", Some(fakeQuery.toParamString(fake))), ("hasCis", Some(hasCisQuery.toParamString(hasCis))), ("onlyWaitingForCancellationApprove", Some(onlyWaitingForCancellationApproveQuery.toParamString(onlyWaitingForCancellationApprove))), ("onlyEstimatedDelivery", Some(onlyEstimatedDeliveryQuery.toParamString(onlyEstimatedDelivery))), ("buyerType", Some(buyerTypeQuery.toParamString(buyerType))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOrdersResponse](req)

    } yield resp
  }

  def getOrdersStats(campaignId: Long, pageToken: String, limit: Integer, getOrdersStatsRequest: GetOrdersStatsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOrdersStatsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrdersStatsResponse] = jsonOf[GetOrdersStatsResponse]

    val path = "/campaigns/{campaignId}/stats/orders".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOrdersStatsRequest)
      resp          <- client.expect[GetOrdersStatsResponse](req)

    } yield resp
  }

  def getPrices(campaignId: Long, pageToken: String, limit: Integer, archived: Boolean = false)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], archivedQuery: QueryParam[Boolean]): Task[GetPricesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPricesResponse] = jsonOf[GetPricesResponse]

    val path = "/campaigns/{campaignId}/offer-prices".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("archived", Some(archivedQuery.toParamString(archived))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetPricesResponse](req)

    } yield resp
  }

  def getPricesByOfferIds(campaignId: Long, pageToken: String, limit: Integer, getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetPricesByOfferIdsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPricesByOfferIdsResponse] = jsonOf[GetPricesByOfferIdsResponse]

    val path = "/campaigns/{campaignId}/offer-prices".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPricesByOfferIdsRequest)
      resp          <- client.expect[GetPricesByOfferIdsResponse](req)

    } yield resp
  }

  def getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetPromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPromoOffersResponse] = jsonOf[GetPromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPromoOffersRequest)
      resp          <- client.expect[GetPromoOffersResponse](req)

    } yield resp
  }

  def getPromos(businessId: Long, getPromosRequest: GetPromosRequest): Task[GetPromosResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPromosResponse] = jsonOf[GetPromosResponse]

    val path = "/businesses/{businessId}/promos".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPromosRequest)
      resp          <- client.expect[GetPromosResponse](req)

    } yield resp
  }

  def getQualityRatingDetails(campaignId: Long): Task[GetQualityRatingDetailsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetQualityRatingDetailsResponse] = jsonOf[GetQualityRatingDetailsResponse]

    val path = "/campaigns/{campaignId}/ratings/quality/details".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetQualityRatingDetailsResponse](req)

    } yield resp
  }

  def getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): Task[GetQualityRatingResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetQualityRatingResponse] = jsonOf[GetQualityRatingResponse]

    val path = "/businesses/{businessId}/ratings/quality".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getQualityRatingRequest)
      resp          <- client.expect[GetQualityRatingResponse](req)

    } yield resp
  }

  def getReportInfo(reportId: String): Task[GetReportInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetReportInfoResponse] = jsonOf[GetReportInfoResponse]

    val path = "/reports/info/{reportId}".replaceAll("\\{" + "reportId" + "\\}",escape(reportId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetReportInfoResponse](req)

    } yield resp
  }

  def getReturn(campaignId: Long, orderId: Long, returnId: Long): Task[GetReturnResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetReturnResponse] = jsonOf[GetReturnResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetReturnResponse](req)

    } yield resp
  }

  def getReturnApplication(campaignId: Long, orderId: Long, returnId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getReturnPhoto(campaignId: Long, orderId: Long, returnId: Long, itemId: Long, imageHash: String): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString)).replaceAll("\\{" + "itemId" + "\\}",escape(itemId.toString)).replaceAll("\\{" + "imageHash" + "\\}",escape(imageHash.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getReturns(campaignId: Long, pageToken: String, limit: Integer, orderIds: List[Long] = List.empty[Long] , statuses: List[RefundStatusType] = List.empty[RefundStatusType] , `type`: ReturnType, fromDate: LocalDate, toDate: LocalDate, fromDate2: LocalDate, toDate2: LocalDate)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], orderIdsQuery: QueryParam[List[Long]], statusesQuery: QueryParam[List[RefundStatusType]], `type`Query: QueryParam[ReturnType], fromDateQuery: QueryParam[LocalDate], toDateQuery: QueryParam[LocalDate], fromDate2Query: QueryParam[LocalDate], toDate2Query: QueryParam[LocalDate]): Task[GetReturnsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetReturnsResponse] = jsonOf[GetReturnsResponse]

    val path = "/campaigns/{campaignId}/returns".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("orderIds", Some(orderIdsQuery.toParamString(orderIds))), ("statuses", Some(statusesQuery.toParamString(statuses))), ("`type`", Some(typeQuery.toParamString(type))), ("fromDate", Some(fromDateQuery.toParamString(fromDate))), ("toDate", Some(toDateQuery.toParamString(toDate))), ("fromDate2", Some(from_dateQuery.toParamString(from_date))), ("toDate2", Some(to_dateQuery.toParamString(to_date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetReturnsResponse](req)

    } yield resp
  }

  def getStocks(campaignId: Long, pageToken: String, limit: Integer, getWarehouseStocksRequest: GetWarehouseStocksRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetWarehouseStocksResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetWarehouseStocksResponse] = jsonOf[GetWarehouseStocksResponse]

    val path = "/campaigns/{campaignId}/offers/stocks".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getWarehouseStocksRequest)
      resp          <- client.expect[GetWarehouseStocksResponse](req)

    } yield resp
  }

  def getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Task[GetSuggestedOfferMappingEntriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetSuggestedOfferMappingEntriesResponse] = jsonOf[GetSuggestedOfferMappingEntriesResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getSuggestedOfferMappingEntriesRequest)
      resp          <- client.expect[GetSuggestedOfferMappingEntriesResponse](req)

    } yield resp
  }

  def getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Task[GetSuggestedOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetSuggestedOfferMappingsResponse] = jsonOf[GetSuggestedOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings/suggestions".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getSuggestedOfferMappingsRequest)
      resp          <- client.expect[GetSuggestedOfferMappingsResponse](req)

    } yield resp
  }

  def getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Task[SuggestPricesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SuggestPricesResponse] = jsonOf[SuggestPricesResponse]

    val path = "/campaigns/{campaignId}/offer-prices/suggestions".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(suggestPricesRequest)
      resp          <- client.expect[SuggestPricesResponse](req)

    } yield resp
  }

  def getWarehouses(businessId: Long): Task[GetWarehousesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetWarehousesResponse] = jsonOf[GetWarehousesResponse]

    val path = "/businesses/{businessId}/warehouses".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetWarehousesResponse](req)

    } yield resp
  }

  def provideOrderItemIdentifiers(campaignId: Long, orderId: Long, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): Task[ProvideOrderItemIdentifiersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProvideOrderItemIdentifiersResponse] = jsonOf[ProvideOrderItemIdentifiersResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(provideOrderItemIdentifiersRequest)
      resp          <- client.expect[ProvideOrderItemIdentifiersResponse](req)

    } yield resp
  }

  def putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/bids".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(putSkuBidsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/bids".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(putSkuBidsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def refreshFeed(campaignId: Long, feedId: Long): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def searchRegionChildren(regionId: Long, page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetRegionWithChildrenResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetRegionWithChildrenResponse] = jsonOf[GetRegionWithChildrenResponse]

    val path = "/regions/{regionId}/children".replaceAll("\\{" + "regionId" + "\\}",escape(regionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetRegionWithChildrenResponse](req)

    } yield resp
  }

  def searchRegionsById(regionId: Long): Task[GetRegionsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetRegionsResponse] = jsonOf[GetRegionsResponse]

    val path = "/regions/{regionId}".replaceAll("\\{" + "regionId" + "\\}",escape(regionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetRegionsResponse](req)

    } yield resp
  }

  def searchRegionsByName(name: String, pageToken: String, limit: Integer)(implicit nameQuery: QueryParam[String], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetRegionsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetRegionsResponse] = jsonOf[GetRegionsResponse]

    val path = "/regions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("name", Some(nameQuery.toParamString(name))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetRegionsResponse](req)

    } yield resp
  }

  def sendFileToChat(businessId: Long, chatId: Long, file: File)(implicit chatIdQuery: QueryParam[Long]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/chats/file/send".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest)(implicit chatIdQuery: QueryParam[Long]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/chats/message".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sendMessageToChatRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/params".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setFeedParamsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def setOrderBoxLayout(campaignId: Long, orderId: Long, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): Task[SetOrderBoxLayoutResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SetOrderBoxLayoutResponse] = jsonOf[SetOrderBoxLayoutResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/boxes".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setOrderBoxLayoutRequest)
      resp          <- client.expect[SetOrderBoxLayoutResponse](req)

    } yield resp
  }

  def setOrderShipmentBoxes(campaignId: Long, orderId: Long, shipmentId: Long, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): Task[SetOrderShipmentBoxesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SetOrderShipmentBoxesResponse] = jsonOf[SetOrderShipmentBoxesResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setOrderShipmentBoxesRequest)
      resp          <- client.expect[SetOrderShipmentBoxesResponse](req)

    } yield resp
  }

  def skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/goods-feedback/skip-reaction".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(skipGoodsFeedbackReactionRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/offer-prices/updates".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateBusinessPricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offers/update".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateCampaignOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Task[UpdateGoodsFeedbackCommentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateGoodsFeedbackCommentResponse] = jsonOf[UpdateGoodsFeedbackCommentResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateGoodsFeedbackCommentRequest)
      resp          <- client.expect[UpdateGoodsFeedbackCommentResponse](req)

    } yield resp
  }

  def updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Task[UpdateOfferContentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOfferContentResponse] = jsonOf[UpdateOfferContentResponse]

    val path = "/businesses/{businessId}/offer-cards/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferContentRequest)
      resp          <- client.expect[UpdateOfferContentResponse](req)

    } yield resp
  }

  def updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferMappingEntryRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Task[UpdateOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOfferMappingsResponse] = jsonOf[UpdateOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferMappingsRequest)
      resp          <- client.expect[UpdateOfferMappingsResponse](req)

    } yield resp
  }

  def updateOrderItems(campaignId: Long, orderId: Long, updateOrderItemRequest: UpdateOrderItemRequest): Task[Unit] = {
    val path = "/campaigns/{campaignId}/orders/{orderId}/items".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOrderItemRequest)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def updateOrderStatus(campaignId: Long, orderId: Long, updateOrderStatusRequest: UpdateOrderStatusRequest): Task[UpdateOrderStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOrderStatusResponse] = jsonOf[UpdateOrderStatusResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/status".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOrderStatusRequest)
      resp          <- client.expect[UpdateOrderStatusResponse](req)

    } yield resp
  }

  def updateOrderStatuses(campaignId: Long, updateOrderStatusesRequest: UpdateOrderStatusesRequest): Task[UpdateOrderStatusesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOrderStatusesResponse] = jsonOf[UpdateOrderStatusesResponse]

    val path = "/campaigns/{campaignId}/orders/status-update".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOrderStatusesRequest)
      resp          <- client.expect[UpdateOrderStatusesResponse](req)

    } yield resp
  }

  def updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offer-prices/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Task[UpdatePromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdatePromoOffersResponse] = jsonOf[UpdatePromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePromoOffersRequest)
      resp          <- client.expect[UpdatePromoOffersResponse](req)

    } yield resp
  }

  def updateStocks(campaignId: Long, updateStocksRequest: UpdateStocksRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offers/stocks".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateStocksRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def verifyOrderEac(campaignId: Long, orderId: Long, verifyOrderEacRequest: VerifyOrderEacRequest): Task[VerifyOrderEacResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[VerifyOrderEacResponse] = jsonOf[VerifyOrderEacResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/verifyEac".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(verifyOrderEacRequest)
      resp          <- client.expect[VerifyOrderEacResponse](req)

    } yield resp
  }

}
