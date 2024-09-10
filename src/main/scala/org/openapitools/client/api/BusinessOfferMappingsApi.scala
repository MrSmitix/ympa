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

import org.openapitools.client.api.AddOffersToArchiveRequest
import org.openapitools.client.api.AddOffersToArchiveResponse
import org.openapitools.client.api.ApiClientDataErrorResponse
import org.openapitools.client.api.ApiForbiddenErrorResponse
import org.openapitools.client.api.ApiLimitErrorResponse
import org.openapitools.client.api.ApiLockedErrorResponse
import org.openapitools.client.api.ApiNotFoundErrorResponse
import org.openapitools.client.api.ApiServerErrorResponse
import org.openapitools.client.api.ApiUnauthorizedErrorResponse
import org.openapitools.client.api.DeleteOffersFromArchiveRequest
import org.openapitools.client.api.DeleteOffersFromArchiveResponse
import org.openapitools.client.api.DeleteOffersRequest
import org.openapitools.client.api.DeleteOffersResponse
import org.openapitools.client.api.GetOfferMappingsRequest
import org.openapitools.client.api.GetOfferMappingsResponse
import org.openapitools.client.api.GetSuggestedOfferMappingsRequest
import org.openapitools.client.api.GetSuggestedOfferMappingsResponse
import org.openapitools.client.api.UpdateOfferMappingsRequest
import org.openapitools.client.api.UpdateOfferMappingsResponse

object BusinessOfferMappingsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addOffersToArchive(host: String, businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Task[AddOffersToArchiveResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AddOffersToArchiveResponse] = jsonOf[AddOffersToArchiveResponse]

    val path = "/businesses/{businessId}/offer-mappings/archive".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addOffersToArchiveRequest)
      resp          <- client.expect[AddOffersToArchiveResponse](req)

    } yield resp
  }

  def deleteOffers(host: String, businessId: Long, deleteOffersRequest: DeleteOffersRequest): Task[DeleteOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteOffersResponse] = jsonOf[DeleteOffersResponse]

    val path = "/businesses/{businessId}/offer-mappings/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteOffersRequest)
      resp          <- client.expect[DeleteOffersResponse](req)

    } yield resp
  }

  def deleteOffersFromArchive(host: String, businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Task[DeleteOffersFromArchiveResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteOffersFromArchiveResponse] = jsonOf[DeleteOffersFromArchiveResponse]

    val path = "/businesses/{businessId}/offer-mappings/unarchive".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteOffersFromArchiveRequest)
      resp          <- client.expect[DeleteOffersFromArchiveResponse](req)

    } yield resp
  }

  def getOfferMappings(host: String, businessId: Long, pageToken: String, limit: Integer, getOfferMappingsRequest: GetOfferMappingsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferMappingsResponse] = jsonOf[GetOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferMappingsRequest)
      resp          <- client.expect[GetOfferMappingsResponse](req)

    } yield resp
  }

  def getSuggestedOfferMappings(host: String, businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Task[GetSuggestedOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetSuggestedOfferMappingsResponse] = jsonOf[GetSuggestedOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings/suggestions".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getSuggestedOfferMappingsRequest)
      resp          <- client.expect[GetSuggestedOfferMappingsResponse](req)

    } yield resp
  }

  def updateOfferMappings(host: String, businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Task[UpdateOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOfferMappingsResponse] = jsonOf[UpdateOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferMappingsRequest)
      resp          <- client.expect[UpdateOfferMappingsResponse](req)

    } yield resp
  }

}

class HttpServiceBusinessOfferMappingsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Task[AddOffersToArchiveResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[AddOffersToArchiveResponse] = jsonOf[AddOffersToArchiveResponse]

    val path = "/businesses/{businessId}/offer-mappings/archive".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addOffersToArchiveRequest)
      resp          <- client.expect[AddOffersToArchiveResponse](req)

    } yield resp
  }

  def deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): Task[DeleteOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteOffersResponse] = jsonOf[DeleteOffersResponse]

    val path = "/businesses/{businessId}/offer-mappings/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteOffersRequest)
      resp          <- client.expect[DeleteOffersResponse](req)

    } yield resp
  }

  def deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Task[DeleteOffersFromArchiveResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteOffersFromArchiveResponse] = jsonOf[DeleteOffersFromArchiveResponse]

    val path = "/businesses/{businessId}/offer-mappings/unarchive".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteOffersFromArchiveRequest)
      resp          <- client.expect[DeleteOffersFromArchiveResponse](req)

    } yield resp
  }

  def getOfferMappings(businessId: Long, pageToken: String, limit: Integer, getOfferMappingsRequest: GetOfferMappingsRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferMappingsResponse] = jsonOf[GetOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferMappingsRequest)
      resp          <- client.expect[GetOfferMappingsResponse](req)

    } yield resp
  }

  def getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest): Task[GetSuggestedOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetSuggestedOfferMappingsResponse] = jsonOf[GetSuggestedOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings/suggestions".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getSuggestedOfferMappingsRequest)
      resp          <- client.expect[GetSuggestedOfferMappingsResponse](req)

    } yield resp
  }

  def updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Task[UpdateOfferMappingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOfferMappingsResponse] = jsonOf[UpdateOfferMappingsResponse]

    val path = "/businesses/{businessId}/offer-mappings/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferMappingsRequest)
      resp          <- client.expect[UpdateOfferMappingsResponse](req)

    } yield resp
  }

}
