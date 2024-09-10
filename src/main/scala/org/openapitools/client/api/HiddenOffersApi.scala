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

import org.openapitools.client.api.AddHiddenOffersRequest
import org.openapitools.client.api.ApiClientDataErrorResponse
import org.openapitools.client.api.ApiForbiddenErrorResponse
import org.openapitools.client.api.ApiLimitErrorResponse
import org.openapitools.client.api.ApiLockedErrorResponse
import org.openapitools.client.api.ApiNotFoundErrorResponse
import org.openapitools.client.api.ApiServerErrorResponse
import org.openapitools.client.api.ApiUnauthorizedErrorResponse
import org.openapitools.client.api.DeleteHiddenOffersRequest
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.GetHiddenOffersResponse

object HiddenOffersApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addHiddenOffers(host: String, campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/hidden-offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addHiddenOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def deleteHiddenOffers(host: String, campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/hidden-offers/delete".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteHiddenOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def getHiddenOffers(host: String, campaignId: Long, offerId: List[String] = List.empty[String] , pageToken: String, limit: Integer, offset: Integer, page: Integer = 1, pageSize: Integer)(implicit offerIdQuery: QueryParam[List[String]], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetHiddenOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetHiddenOffersResponse] = jsonOf[GetHiddenOffersResponse]

    val path = "/campaigns/{campaignId}/hidden-offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("offerId", Some(offer_idQuery.toParamString(offer_id))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetHiddenOffersResponse](req)

    } yield resp
  }

}

class HttpServiceHiddenOffersApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/hidden-offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(addHiddenOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/hidden-offers/delete".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteHiddenOffersRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def getHiddenOffers(campaignId: Long, offerId: List[String] = List.empty[String] , pageToken: String, limit: Integer, offset: Integer, page: Integer = 1, pageSize: Integer)(implicit offerIdQuery: QueryParam[List[String]], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer], offsetQuery: QueryParam[Integer], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetHiddenOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetHiddenOffersResponse] = jsonOf[GetHiddenOffersResponse]

    val path = "/campaigns/{campaignId}/hidden-offers".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("offerId", Some(offer_idQuery.toParamString(offer_id))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetHiddenOffersResponse](req)

    } yield resp
  }

}
