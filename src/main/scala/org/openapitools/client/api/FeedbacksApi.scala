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
import org.openapitools.client.api.GetFeedbackListResponse
import java.time.LocalDate

object FeedbacksApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}

class HttpServiceFeedbacksApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}
