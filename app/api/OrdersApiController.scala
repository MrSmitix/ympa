package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AcceptOrderCancellationRequest
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetOrderResponse
import model.GetOrdersResponse
import java.time.LocalDate
import java.time.OffsetDateTime
import model.OrderBuyerType
import model.OrderDeliveryDispatchType
import model.OrderStatusType
import model.OrderSubstatusType
import model.ProvideOrderDigitalCodesRequest
import model.ProvideOrderItemIdentifiersRequest
import model.ProvideOrderItemIdentifiersResponse
import scala.collection.immutable.Set
import model.SetOrderBoxLayoutRequest
import model.SetOrderBoxLayoutResponse
import model.SetOrderShipmentBoxesRequest
import model.SetOrderShipmentBoxesResponse
import model.UpdateOrderItemRequest
import model.UpdateOrderStatusRequest
import model.UpdateOrderStatusResponse
import model.UpdateOrderStatusesRequest
import model.UpdateOrderStatusesResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class OrdersApiController @Inject()(cc: ControllerComponents, api: OrdersApi) extends AbstractController(cc) {
  /**
    * PUT /campaigns/:campaignId/orders/:orderId/cancellation/accept
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def acceptOrderCancellation(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val acceptOrderCancellationRequest = request.body.asJson.map(_.as[AcceptOrderCancellationRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "acceptOrderCancellationRequest")
      }
      api.acceptOrderCancellation(campaignId, orderId, acceptOrderCancellationRequest)
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
    * POST /campaigns/:campaignId/orders/:orderId/deliverDigitalGoods
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def provideOrderDigitalCodes(campaignId: Long, orderId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): EmptyApiResponse = {
      val provideOrderDigitalCodesRequest = request.body.asJson.map(_.as[ProvideOrderDigitalCodesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "provideOrderDigitalCodesRequest")
      }
      api.provideOrderDigitalCodes(campaignId, orderId, provideOrderDigitalCodesRequest)
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
