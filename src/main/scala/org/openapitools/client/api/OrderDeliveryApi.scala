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
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.GetOrderBuyerInfoResponse
import org.openapitools.client.api.SetOrderDeliveryDateRequest
import org.openapitools.client.api.SetOrderDeliveryTrackCodeRequest
import org.openapitools.client.api.UpdateOrderStorageLimitRequest
import org.openapitools.client.api.VerifyOrderEacRequest
import org.openapitools.client.api.VerifyOrderEacResponse

object OrderDeliveryApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getOrderBuyerInfo(host: String, campaignId: Long, orderId: Long): Task[GetOrderBuyerInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrderBuyerInfoResponse] = jsonOf[GetOrderBuyerInfoResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/buyer".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

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
      resp          <- client.expect[GetOrderBuyerInfoResponse](req)

    } yield resp
  }

  def setOrderDeliveryDate(host: String, campaignId: Long, orderId: Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setOrderDeliveryDateRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def setOrderDeliveryTrackCode(host: String, campaignId: Long, orderId: Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setOrderDeliveryTrackCodeRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateOrderStorageLimit(host: String, campaignId: Long, orderId: Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOrderStorageLimitRequest)
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

class HttpServiceOrderDeliveryApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getOrderBuyerInfo(campaignId: Long, orderId: Long): Task[GetOrderBuyerInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOrderBuyerInfoResponse] = jsonOf[GetOrderBuyerInfoResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/buyer".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

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
      resp          <- client.expect[GetOrderBuyerInfoResponse](req)

    } yield resp
  }

  def setOrderDeliveryDate(campaignId: Long, orderId: Long, setOrderDeliveryDateRequest: SetOrderDeliveryDateRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/date".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setOrderDeliveryDateRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def setOrderDeliveryTrackCode(campaignId: Long, orderId: Long, setOrderDeliveryTrackCodeRequest: SetOrderDeliveryTrackCodeRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/track".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setOrderDeliveryTrackCodeRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateOrderStorageLimit(campaignId: Long, orderId: Long, updateOrderStorageLimitRequest: UpdateOrderStorageLimitRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOrderStorageLimitRequest)
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
