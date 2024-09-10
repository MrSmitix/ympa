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
import org.openapitools.client.api.GetCategoryContentParametersResponse
import org.openapitools.client.api.GetOfferCardsContentStatusRequest
import org.openapitools.client.api.GetOfferCardsContentStatusResponse
import org.openapitools.client.api.UpdateOfferContentRequest
import org.openapitools.client.api.UpdateOfferContentResponse

object ContentApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getCategoryContentParameters(host: String, categoryId: Long): Task[GetCategoryContentParametersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoryContentParametersResponse] = jsonOf[GetCategoryContentParametersResponse]

    val path = "/category/{categoryId}/parameters".replaceAll("\\{" + "categoryId" + "\\}",escape(categoryId.toString))

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
      resp          <- client.expect[GetCategoryContentParametersResponse](req)

    } yield resp
  }

  def getOfferCardsContentStatus(host: String, businessId: Long, pageToken: String, limit: Integer, getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferCardsContentStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferCardsContentStatusResponse] = jsonOf[GetOfferCardsContentStatusResponse]

    val path = "/businesses/{businessId}/offer-cards".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferCardsContentStatusRequest)
      resp          <- client.expect[GetOfferCardsContentStatusResponse](req)

    } yield resp
  }

  def updateOfferContent(host: String, businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Task[UpdateOfferContentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOfferContentResponse] = jsonOf[UpdateOfferContentResponse]

    val path = "/businesses/{businessId}/offer-cards/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferContentRequest)
      resp          <- client.expect[UpdateOfferContentResponse](req)

    } yield resp
  }

}

class HttpServiceContentApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getCategoryContentParameters(categoryId: Long): Task[GetCategoryContentParametersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoryContentParametersResponse] = jsonOf[GetCategoryContentParametersResponse]

    val path = "/category/{categoryId}/parameters".replaceAll("\\{" + "categoryId" + "\\}",escape(categoryId.toString))

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
      resp          <- client.expect[GetCategoryContentParametersResponse](req)

    } yield resp
  }

  def getOfferCardsContentStatus(businessId: Long, pageToken: String, limit: Integer, getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetOfferCardsContentStatusResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOfferCardsContentStatusResponse] = jsonOf[GetOfferCardsContentStatusResponse]

    val path = "/businesses/{businessId}/offer-cards".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getOfferCardsContentStatusRequest)
      resp          <- client.expect[GetOfferCardsContentStatusResponse](req)

    } yield resp
  }

  def updateOfferContent(businessId: Long, updateOfferContentRequest: UpdateOfferContentRequest): Task[UpdateOfferContentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateOfferContentResponse] = jsonOf[UpdateOfferContentResponse]

    val path = "/businesses/{businessId}/offer-cards/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOfferContentRequest)
      resp          <- client.expect[UpdateOfferContentResponse](req)

    } yield resp
  }

}
