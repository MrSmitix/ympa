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
import java.io.File
import org.openapitools.client.api.GetReturnResponse
import org.openapitools.client.api.GetReturnsResponse
import java.time.LocalDate
import org.openapitools.client.api.RefundStatusType
import org.openapitools.client.api.ReturnType
import org.openapitools.client.api.SetReturnDecisionRequest

object ReturnsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

  def setReturnDecision(host: String, campaignId: Long, orderId: Long, returnId: Long, setReturnDecisionRequest: SetReturnDecisionRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setReturnDecisionRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def submitReturnDecision(host: String, campaignId: Long, orderId: Long, returnId: Long): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString))

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

}

class HttpServiceReturnsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

  def setReturnDecision(campaignId: Long, orderId: Long, returnId: Long, setReturnDecisionRequest: SetReturnDecisionRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setReturnDecisionRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def submitReturnDecision(campaignId: Long, orderId: Long, returnId: Long): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "orderId" + "\\}",escape(orderId.toString)).replaceAll("\\{" + "returnId" + "\\}",escape(returnId.toString))

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

}
