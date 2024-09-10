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
import org.openapitools.client.api.ApiLockedErrorResponse
import org.openapitools.client.api.ApiNotFoundErrorResponse
import org.openapitools.client.api.ApiServerErrorResponse
import org.openapitools.client.api.ApiUnauthorizedErrorResponse
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.GetPricesByOfferIdsRequest
import org.openapitools.client.api.GetPricesByOfferIdsResponse
import org.openapitools.client.api.GetPricesResponse
import org.openapitools.client.api.SuggestPricesRequest
import org.openapitools.client.api.SuggestPricesResponse
import org.openapitools.client.api.UpdateBusinessPricesRequest
import org.openapitools.client.api.UpdatePricesRequest

object PricesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getPrices(host: String, campaignId: Long, pageToken: String, limit: Integer, archived: Boolean = false)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], archivedQuery: QueryParam[Boolean]): Task[GetPricesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPricesResponse] = jsonOf[GetPricesResponse]

    val path = "/campaigns/{campaignId}/offer-prices".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("archived", Some(archivedQuery.toParamString(archived))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetPricesResponse](req)

    } yield resp
  }

  def getPricesByOfferIds(host: String, campaignId: Long, pageToken: String, limit: Integer, getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetPricesByOfferIdsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPricesByOfferIdsResponse] = jsonOf[GetPricesByOfferIdsResponse]

    val path = "/campaigns/{campaignId}/offer-prices".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPricesByOfferIdsRequest)
      resp          <- client.expect[GetPricesByOfferIdsResponse](req)

    } yield resp
  }

  def getSuggestedPrices(host: String, campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Task[SuggestPricesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SuggestPricesResponse] = jsonOf[SuggestPricesResponse]

    val path = "/campaigns/{campaignId}/offer-prices/suggestions".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(suggestPricesRequest)
      resp          <- client.expect[SuggestPricesResponse](req)

    } yield resp
  }

  def updateBusinessPrices(host: String, businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/offer-prices/updates".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateBusinessPricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updatePrices(host: String, campaignId: Long, updatePricesRequest: UpdatePricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offer-prices/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServicePricesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getPrices(campaignId: Long, pageToken: String, limit: Integer, archived: Boolean = false)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], archivedQuery: QueryParam[Boolean]): Task[GetPricesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPricesResponse] = jsonOf[GetPricesResponse]

    val path = "/campaigns/{campaignId}/offer-prices".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("archived", Some(archivedQuery.toParamString(archived))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetPricesResponse](req)

    } yield resp
  }

  def getPricesByOfferIds(campaignId: Long, pageToken: String, limit: Integer, getPricesByOfferIdsRequest: GetPricesByOfferIdsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetPricesByOfferIdsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPricesByOfferIdsResponse] = jsonOf[GetPricesByOfferIdsResponse]

    val path = "/campaigns/{campaignId}/offer-prices".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPricesByOfferIdsRequest)
      resp          <- client.expect[GetPricesByOfferIdsResponse](req)

    } yield resp
  }

  def getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): Task[SuggestPricesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SuggestPricesResponse] = jsonOf[SuggestPricesResponse]

    val path = "/campaigns/{campaignId}/offer-prices/suggestions".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(suggestPricesRequest)
      resp          <- client.expect[SuggestPricesResponse](req)

    } yield resp
  }

  def updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/offer-prices/updates".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateBusinessPricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offer-prices/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePricesRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
