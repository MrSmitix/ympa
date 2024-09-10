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
import org.openapitools.client.api.GetQualityRatingDetailsResponse
import org.openapitools.client.api.GetQualityRatingRequest
import org.openapitools.client.api.GetQualityRatingResponse

object RatingsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}

class HttpServiceRatingsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}
