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
import org.openapitools.client.api.GetBusinessBuyerInfoResponse
import org.openapitools.client.api.GetBusinessDocumentsInfoResponse

object OrderBusinessInformationApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}

class HttpServiceOrderBusinessInformationApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}
