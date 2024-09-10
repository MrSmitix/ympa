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
import java.io.File
import org.openapitools.client.api.GetOrderLabelsDataResponse
import org.openapitools.client.api.PageFormatType

object OrderLabelsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}

class HttpServiceOrderLabelsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}
