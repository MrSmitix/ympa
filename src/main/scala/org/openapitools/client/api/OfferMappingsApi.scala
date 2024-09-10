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
import org.openapitools.client.api.GetOfferMappingEntriesResponse
import org.openapitools.client.api.GetSuggestedOfferMappingEntriesRequest
import org.openapitools.client.api.GetSuggestedOfferMappingEntriesResponse
import org.openapitools.client.api.OfferAvailabilityStatusType
import org.openapitools.client.api.OfferMappingKindType
import org.openapitools.client.api.OfferProcessingStatusType
import org.openapitools.client.api.UpdateOfferMappingEntryRequest

object OfferMappingsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getOfferMappingEntries(host: String, campaignId: Long, offerId: List[String] = List.empty[String] , shopSku: List[String] = List.empty[String] , mappingKind: OfferMappingKindType, status: List[OfferProcessingStatusType] = List.empty[OfferProcessingStatusType] , availability: List[OfferAvailabilityStatusType] = List.empty[OfferAvailabilityStatusType] , categoryId: List[Integer] = List.empty[Integer] , vendor: List[String] = List.empty[String] , pageToken: String, limit: Integer)(implicit offerIdQuery: QueryParam[List[String]], shopSkuQuery: QueryParam[List[String]], mappingKindQuery: QueryParam[OfferMappingKindType], statusQuery: QueryParam[List[OfferProcessingStatusType]], availabilityQuery: QueryParam[List[OfferAvailabilityStatusType]], categoryIdQuery: QueryParam[List[Integer]], vendorQuery: QueryParam[List[String]], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferMappingEntriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferMappingEntriesResponse] = jsonOf[GetOfferMappingEntriesResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("offerId", Some(offer_idQuery.toParamString(offer_id))), ("shopSku", Some(shop_skuQuery.toParamString(shop_sku))), ("mappingKind", Some(mapping_kindQuery.toParamString(mapping_kind))), ("status", Some(statusQuery.toParamString(status))), ("availability", Some(availabilityQuery.toParamString(availability))), ("categoryId", Some(category_idQuery.toParamString(category_id))), ("vendor", Some(vendorQuery.toParamString(vendor))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOfferMappingEntriesResponse](req)

    } yield resp
  }

  def getSuggestedOfferMappingEntries(host: String, campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Task[GetSuggestedOfferMappingEntriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetSuggestedOfferMappingEntriesResponse] = jsonOf[GetSuggestedOfferMappingEntriesResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getSuggestedOfferMappingEntriesRequest)
      resp          <- client.expect[GetSuggestedOfferMappingEntriesResponse](req)

    } yield resp
  }

  def updateOfferMappingEntries(host: String, campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferMappingEntryRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServiceOfferMappingsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getOfferMappingEntries(campaignId: Long, offerId: List[String] = List.empty[String] , shopSku: List[String] = List.empty[String] , mappingKind: OfferMappingKindType, status: List[OfferProcessingStatusType] = List.empty[OfferProcessingStatusType] , availability: List[OfferAvailabilityStatusType] = List.empty[OfferAvailabilityStatusType] , categoryId: List[Integer] = List.empty[Integer] , vendor: List[String] = List.empty[String] , pageToken: String, limit: Integer)(implicit offerIdQuery: QueryParam[List[String]], shopSkuQuery: QueryParam[List[String]], mappingKindQuery: QueryParam[OfferMappingKindType], statusQuery: QueryParam[List[OfferProcessingStatusType]], availabilityQuery: QueryParam[List[OfferAvailabilityStatusType]], categoryIdQuery: QueryParam[List[Integer]], vendorQuery: QueryParam[List[String]], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferMappingEntriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferMappingEntriesResponse] = jsonOf[GetOfferMappingEntriesResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("offerId", Some(offer_idQuery.toParamString(offer_id))), ("shopSku", Some(shop_skuQuery.toParamString(shop_sku))), ("mappingKind", Some(mapping_kindQuery.toParamString(mapping_kind))), ("status", Some(statusQuery.toParamString(status))), ("availability", Some(availabilityQuery.toParamString(availability))), ("categoryId", Some(category_idQuery.toParamString(category_id))), ("vendor", Some(vendorQuery.toParamString(vendor))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOfferMappingEntriesResponse](req)

    } yield resp
  }

  def getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): Task[GetSuggestedOfferMappingEntriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetSuggestedOfferMappingEntriesResponse] = jsonOf[GetSuggestedOfferMappingEntriesResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getSuggestedOfferMappingEntriesRequest)
      resp          <- client.expect[GetSuggestedOfferMappingEntriesResponse](req)

    } yield resp
  }

  def updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/offer-mapping-entries/updates".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferMappingEntryRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
