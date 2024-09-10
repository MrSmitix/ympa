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

import org.openapitools.client.api.AcceptOrderCancellationRequest
import org.openapitools.client.api.ApiClientDataErrorResponse
import org.openapitools.client.api.ApiForbiddenErrorResponse
import org.openapitools.client.api.ApiLimitErrorResponse
import org.openapitools.client.api.ApiNotFoundErrorResponse
import org.openapitools.client.api.ApiServerErrorResponse
import org.openapitools.client.api.ApiUnauthorizedErrorResponse
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.GetOrderResponse
import org.openapitools.client.api.GetOrdersResponse
import java.time.LocalDate
import java.time.OffsetDateTime
import org.openapitools.client.api.OrderBuyerType
import org.openapitools.client.api.OrderDeliveryDispatchType
import org.openapitools.client.api.OrderStatusType
import org.openapitools.client.api.OrderSubstatusType
import org.openapitools.client.api.ProvideOrderDigitalCodesRequest
import org.openapitools.client.api.ProvideOrderItemIdentifiersRequest
import org.openapitools.client.api.ProvideOrderItemIdentifiersResponse
import org.openapitools.client.api.Set
import org.openapitools.client.api.SetOrderBoxLayoutRequest
import org.openapitools.client.api.SetOrderBoxLayoutResponse
import org.openapitools.client.api.SetOrderShipmentBoxesRequest
import org.openapitools.client.api.SetOrderShipmentBoxesResponse
import org.openapitools.client.api.UpdateOrderItemRequest
import org.openapitools.client.api.UpdateOrderStatusRequest
import org.openapitools.client.api.UpdateOrderStatusResponse
import org.openapitools.client.api.UpdateOrderStatusesRequest
import org.openapitools.client.api.UpdateOrderStatusesResponse

object OrdersApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def acceptOrderCancellation(host: String, campaignId: Long, orderId: Long, acceptOrderCancellationRequest: AcceptOrderCancellationRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(acceptOrderCancellationRequest)
      resp          <- client.expect[EmptyApiResponse](req)

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

  def provideOrderDigitalCodes(host: String, campaignId: Long, orderId: Long, provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(provideOrderDigitalCodesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

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

}

class HttpServiceOrdersApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def acceptOrderCancellation(campaignId: Long, orderId: Long, acceptOrderCancellationRequest: AcceptOrderCancellationRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/cancellation/accept".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(acceptOrderCancellationRequest)
      resp          <- client.expect[EmptyApiResponse](req)

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

  def provideOrderDigitalCodes(campaignId: Long, orderId: Long, provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(provideOrderDigitalCodesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

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

}
