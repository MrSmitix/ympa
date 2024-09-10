package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.ConfirmShipmentRequest
import model.EmptyApiResponse
import model.GetShipmentOrdersInfoResponse
import model.GetShipmentResponse
import model.SearchShipmentsRequest
import model.SearchShipmentsResponse
import model.SetShipmentPalletsCountRequest
import model.ShipmentPalletLabelPageFormatType
import play.api.libs.Files.TemporaryFile
import model.TransferOrdersFromShipmentRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class ShipmentsApiController @Inject()(cc: ControllerComponents, api: ShipmentsApi) extends AbstractController(cc) {
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
