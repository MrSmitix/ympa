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
import org.openapitools.client.api.GetBidsInfoRequest
import org.openapitools.client.api.GetBidsInfoResponse
import org.openapitools.client.api.GetBidsRecommendationsRequest
import org.openapitools.client.api.GetBidsRecommendationsResponse
import org.openapitools.client.api.PutSkuBidsRequest

object BidsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getBidsInfoForBusiness(host: String, businessId: Long, pageToken: String, limit: Integer, getBidsInfoRequest: GetBidsInfoRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetBidsInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBidsInfoResponse] = jsonOf[GetBidsInfoResponse]

    val path = "/businesses/{businessId}/bids/info".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getBidsInfoRequest)
      resp          <- client.expect[GetBidsInfoResponse](req)

    } yield resp
  }

  def getBidsRecommendations(host: String, businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Task[GetBidsRecommendationsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBidsRecommendationsResponse] = jsonOf[GetBidsRecommendationsResponse]

    val path = "/businesses/{businessId}/bids/recommendations".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getBidsRecommendationsRequest)
      resp          <- client.expect[GetBidsRecommendationsResponse](req)

    } yield resp
  }

  def putBidsForBusiness(host: String, businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/bids".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(putSkuBidsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def putBidsForCampaign(host: String, campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/bids".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(putSkuBidsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServiceBidsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getBidsInfoForBusiness(businessId: Long, pageToken: String, limit: Integer, getBidsInfoRequest: GetBidsInfoRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetBidsInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBidsInfoResponse] = jsonOf[GetBidsInfoResponse]

    val path = "/businesses/{businessId}/bids/info".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getBidsInfoRequest)
      resp          <- client.expect[GetBidsInfoResponse](req)

    } yield resp
  }

  def getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): Task[GetBidsRecommendationsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetBidsRecommendationsResponse] = jsonOf[GetBidsRecommendationsResponse]

    val path = "/businesses/{businessId}/bids/recommendations".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getBidsRecommendationsRequest)
      resp          <- client.expect[GetBidsRecommendationsResponse](req)

    } yield resp
  }

  def putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/bids".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(putSkuBidsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/bids".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(putSkuBidsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
