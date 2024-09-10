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

import org.openapitools.client.api.ApiClientDataErrorResponse
import org.openapitools.client.api.ApiForbiddenErrorResponse
import org.openapitools.client.api.ApiLimitErrorResponse
import org.openapitools.client.api.ApiNotFoundErrorResponse
import org.openapitools.client.api.ApiServerErrorResponse
import org.openapitools.client.api.ApiUnauthorizedErrorResponse
import org.openapitools.client.api.ConfirmShipmentRequest
import org.openapitools.client.api.EmptyApiResponse
import java.io.File
import org.openapitools.client.api.GetShipmentOrdersInfoResponse
import org.openapitools.client.api.GetShipmentResponse
import org.openapitools.client.api.SearchShipmentsRequest
import org.openapitools.client.api.SearchShipmentsResponse
import org.openapitools.client.api.SetShipmentPalletsCountRequest
import org.openapitools.client.api.ShipmentPalletLabelPageFormatType
import org.openapitools.client.api.TransferOrdersFromShipmentRequest

object ShipmentsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def confirmShipment(host: String, campaignId: Long, shipmentId: Long, confirmShipmentRequest: ConfirmShipmentRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(confirmShipmentRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def downloadShipmentAct(host: String, campaignId: Long, shipmentId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def downloadShipmentDiscrepancyAct(host: String, campaignId: Long, shipmentId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def downloadShipmentInboundAct(host: String, campaignId: Long, shipmentId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def downloadShipmentPalletLabels(host: String, campaignId: Long, shipmentId: Long, format: ShipmentPalletLabelPageFormatType)(implicit formatQuery: QueryParam[ShipmentPalletLabelPageFormatType]): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def downloadShipmentReceptionTransferAct(host: String, campaignId: Long, warehouseId: Integer)(implicit warehouseIdQuery: QueryParam[Integer]): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/shipments/reception-transfer-act".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("warehouseId", Some(warehouse_idQuery.toParamString(warehouse_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def downloadShipmentTransportationWaybill(host: String, campaignId: Long, shipmentId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def getShipment(host: String, campaignId: Long, shipmentId: Long, cancelledOrders: Boolean = true)(implicit cancelledOrdersQuery: QueryParam[Boolean]): Task[GetShipmentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetShipmentResponse] = jsonOf[GetShipmentResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("cancelledOrders", Some(cancelledOrdersQuery.toParamString(cancelledOrders))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetShipmentResponse](req)

    } yield resp
  }

  def getShipmentOrdersInfo(host: String, campaignId: Long, shipmentId: Long): Task[GetShipmentOrdersInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetShipmentOrdersInfoResponse] = jsonOf[GetShipmentOrdersInfoResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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
      resp          <- client.expect[GetShipmentOrdersInfoResponse](req)

    } yield resp
  }

  def searchShipments(host: String, campaignId: Long, searchShipmentsRequest: SearchShipmentsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[SearchShipmentsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SearchShipmentsResponse] = jsonOf[SearchShipmentsResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(searchShipmentsRequest)
      resp          <- client.expect[SearchShipmentsResponse](req)

    } yield resp
  }

  def setShipmentPalletsCount(host: String, campaignId: Long, shipmentId: Long, setShipmentPalletsCountRequest: SetShipmentPalletsCountRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setShipmentPalletsCountRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def transferOrdersFromShipment(host: String, campaignId: Long, shipmentId: Long, transferOrdersFromShipmentRequest: TransferOrdersFromShipmentRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(transferOrdersFromShipmentRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServiceShipmentsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def confirmShipment(campaignId: Long, shipmentId: Long, confirmShipmentRequest: ConfirmShipmentRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(confirmShipmentRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def downloadShipmentAct(campaignId: Long, shipmentId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def downloadShipmentDiscrepancyAct(campaignId: Long, shipmentId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def downloadShipmentInboundAct(campaignId: Long, shipmentId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def downloadShipmentPalletLabels(campaignId: Long, shipmentId: Long, format: ShipmentPalletLabelPageFormatType)(implicit formatQuery: QueryParam[ShipmentPalletLabelPageFormatType]): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def downloadShipmentReceptionTransferAct(campaignId: Long, warehouseId: Integer)(implicit warehouseIdQuery: QueryParam[Integer]): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/shipments/reception-transfer-act".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("warehouseId", Some(warehouse_idQuery.toParamString(warehouse_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[File](req)

    } yield resp
  }

  def downloadShipmentTransportationWaybill(campaignId: Long, shipmentId: Long): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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

  def getShipment(campaignId: Long, shipmentId: Long, cancelledOrders: Boolean = true)(implicit cancelledOrdersQuery: QueryParam[Boolean]): Task[GetShipmentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetShipmentResponse] = jsonOf[GetShipmentResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("cancelledOrders", Some(cancelledOrdersQuery.toParamString(cancelledOrders))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetShipmentResponse](req)

    } yield resp
  }

  def getShipmentOrdersInfo(campaignId: Long, shipmentId: Long): Task[GetShipmentOrdersInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetShipmentOrdersInfoResponse] = jsonOf[GetShipmentOrdersInfoResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

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
      resp          <- client.expect[GetShipmentOrdersInfoResponse](req)

    } yield resp
  }

  def searchShipments(campaignId: Long, searchShipmentsRequest: SearchShipmentsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[SearchShipmentsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SearchShipmentsResponse] = jsonOf[SearchShipmentsResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(searchShipmentsRequest)
      resp          <- client.expect[SearchShipmentsResponse](req)

    } yield resp
  }

  def setShipmentPalletsCount(campaignId: Long, shipmentId: Long, setShipmentPalletsCountRequest: SetShipmentPalletsCountRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setShipmentPalletsCountRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def transferOrdersFromShipment(campaignId: Long, shipmentId: Long, transferOrdersFromShipmentRequest: TransferOrdersFromShipmentRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "shipmentId" + "\\}",escape(shipmentId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(transferOrdersFromShipmentRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
