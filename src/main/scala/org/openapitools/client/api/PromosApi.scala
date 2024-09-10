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
import org.openapitools.client.api.DeletePromoOffersRequest
import org.openapitools.client.api.DeletePromoOffersResponse
import org.openapitools.client.api.GetPromoOffersRequest
import org.openapitools.client.api.GetPromoOffersResponse
import org.openapitools.client.api.GetPromosRequest
import org.openapitools.client.api.GetPromosResponse
import org.openapitools.client.api.UpdatePromoOffersRequest
import org.openapitools.client.api.UpdatePromoOffersResponse

object PromosApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deletePromoOffers(host: String, businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Task[DeletePromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePromoOffersResponse] = jsonOf[DeletePromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deletePromoOffersRequest)
      resp          <- client.expect[DeletePromoOffersResponse](req)

    } yield resp
  }

  def getPromoOffers(host: String, businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetPromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPromoOffersResponse] = jsonOf[GetPromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPromoOffersRequest)
      resp          <- client.expect[GetPromoOffersResponse](req)

    } yield resp
  }

  def getPromos(host: String, businessId: Long, getPromosRequest: GetPromosRequest): Task[GetPromosResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPromosResponse] = jsonOf[GetPromosResponse]

    val path = "/businesses/{businessId}/promos".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPromosRequest)
      resp          <- client.expect[GetPromosResponse](req)

    } yield resp
  }

  def updatePromoOffers(host: String, businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Task[UpdatePromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdatePromoOffersResponse] = jsonOf[UpdatePromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePromoOffersRequest)
      resp          <- client.expect[UpdatePromoOffersResponse](req)

    } yield resp
  }

}

class HttpServicePromosApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): Task[DeletePromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeletePromoOffersResponse] = jsonOf[DeletePromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deletePromoOffersRequest)
      resp          <- client.expect[DeletePromoOffersResponse](req)

    } yield resp
  }

  def getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetPromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPromoOffersResponse] = jsonOf[GetPromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPromoOffersRequest)
      resp          <- client.expect[GetPromoOffersResponse](req)

    } yield resp
  }

  def getPromos(businessId: Long, getPromosRequest: GetPromosRequest): Task[GetPromosResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetPromosResponse] = jsonOf[GetPromosResponse]

    val path = "/businesses/{businessId}/promos".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getPromosRequest)
      resp          <- client.expect[GetPromosResponse](req)

    } yield resp
  }

  def updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): Task[UpdatePromoOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdatePromoOffersResponse] = jsonOf[UpdatePromoOffersResponse]

    val path = "/businesses/{businessId}/promos/offers/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updatePromoOffersRequest)
      resp          <- client.expect[UpdatePromoOffersResponse](req)

    } yield resp
  }

}
