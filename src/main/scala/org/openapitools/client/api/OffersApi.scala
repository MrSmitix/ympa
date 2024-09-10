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
import org.openapitools.client.api.CurrencyType
import org.openapitools.client.api.DeleteCampaignOffersRequest
import org.openapitools.client.api.DeleteCampaignOffersResponse
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.GetAllOffersResponse
import org.openapitools.client.api.GetCampaignOffersRequest
import org.openapitools.client.api.GetCampaignOffersResponse
import org.openapitools.client.api.GetOfferRecommendationsRequest
import org.openapitools.client.api.GetOfferRecommendationsResponse
import org.openapitools.client.api.GetOffersResponse
import org.openapitools.client.api.UpdateCampaignOffersRequest

object OffersApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteCampaignOffers(host: String, campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Task[DeleteCampaignOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteCampaignOffersResponse] = jsonOf[DeleteCampaignOffersResponse]

    val path = "/campaigns/{campaignId}/offers/delete".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteCampaignOffersRequest)
      resp          <- client.expect[DeleteCampaignOffersResponse](req)

    } yield resp
  }

  def getAllOffers(host: String, campaignId: Long, feedId: Long, chunk: Integer)(implicit feedIdQuery: QueryParam[Long], chunkQuery: QueryParam[Integer]): Task[GetAllOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetAllOffersResponse] = jsonOf[GetAllOffersResponse]

    val path = "/campaigns/{campaignId}/offers/all".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("feedId", Some(feedIdQuery.toParamString(feedId))), ("chunk", Some(chunkQuery.toParamString(chunk))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetAllOffersResponse](req)

    } yield resp
  }

  def getCampaignOffers(host: String, campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetCampaignOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignOffersResponse] = jsonOf[GetCampaignOffersResponse]

    val path = "/campaigns/{campaignId}/offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCampaignOffersRequest)
      resp          <- client.expect[GetCampaignOffersResponse](req)

    } yield resp
  }

  def getOfferRecommendations(host: String, businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferRecommendationsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferRecommendationsResponse] = jsonOf[GetOfferRecommendationsResponse]

    val path = "/businesses/{businessId}/offers/recommendations".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferRecommendationsRequest)
      resp          <- client.expect[GetOfferRecommendationsResponse](req)

    } yield resp
  }

  def getOffers(host: String, campaignId: Long, query: String, feedId: Long, shopCategoryId: String, currency: CurrencyType, matched: Boolean, page: Integer = 1, pageSize: Integer)(implicit queryQuery: QueryParam[String], feedIdQuery: QueryParam[Long], shopCategoryIdQuery: QueryParam[String], currencyQuery: QueryParam[CurrencyType], matchedQuery: QueryParam[Boolean], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOffersResponse] = jsonOf[GetOffersResponse]

    val path = "/campaigns/{campaignId}/offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("query", Some(queryQuery.toParamString(query))), ("feedId", Some(feedIdQuery.toParamString(feedId))), ("shopCategoryId", Some(shopCategoryIdQuery.toParamString(shopCategoryId))), ("currency", Some(currencyQuery.toParamString(currency))), ("matched", Some(matchedQuery.toParamString(matched))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOffersResponse](req)

    } yield resp
  }

  def updateCampaignOffers(host: String, campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offers/update".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateCampaignOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServiceOffersApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): Task[DeleteCampaignOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteCampaignOffersResponse] = jsonOf[DeleteCampaignOffersResponse]

    val path = "/campaigns/{campaignId}/offers/delete".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteCampaignOffersRequest)
      resp          <- client.expect[DeleteCampaignOffersResponse](req)

    } yield resp
  }

  def getAllOffers(campaignId: Long, feedId: Long, chunk: Integer)(implicit feedIdQuery: QueryParam[Long], chunkQuery: QueryParam[Integer]): Task[GetAllOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetAllOffersResponse] = jsonOf[GetAllOffersResponse]

    val path = "/campaigns/{campaignId}/offers/all".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("feedId", Some(feedIdQuery.toParamString(feedId))), ("chunk", Some(chunkQuery.toParamString(chunk))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetAllOffersResponse](req)

    } yield resp
  }

  def getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetCampaignOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignOffersResponse] = jsonOf[GetCampaignOffersResponse]

    val path = "/campaigns/{campaignId}/offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCampaignOffersRequest)
      resp          <- client.expect[GetCampaignOffersResponse](req)

    } yield resp
  }

  def getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferRecommendationsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferRecommendationsResponse] = jsonOf[GetOfferRecommendationsResponse]

    val path = "/businesses/{businessId}/offers/recommendations".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferRecommendationsRequest)
      resp          <- client.expect[GetOfferRecommendationsResponse](req)

    } yield resp
  }

  def getOffers(campaignId: Long, query: String, feedId: Long, shopCategoryId: String, currency: CurrencyType, matched: Boolean, page: Integer = 1, pageSize: Integer)(implicit queryQuery: QueryParam[String], feedIdQuery: QueryParam[Long], shopCategoryIdQuery: QueryParam[String], currencyQuery: QueryParam[CurrencyType], matchedQuery: QueryParam[Boolean], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOffersResponse] = jsonOf[GetOffersResponse]

    val path = "/campaigns/{campaignId}/offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("query", Some(queryQuery.toParamString(query))), ("feedId", Some(feedIdQuery.toParamString(feedId))), ("shopCategoryId", Some(shopCategoryIdQuery.toParamString(shopCategoryId))), ("currency", Some(currencyQuery.toParamString(currency))), ("matched", Some(matchedQuery.toParamString(matched))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOffersResponse](req)

    } yield resp
  }

  def updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offers/update".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateCampaignOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
