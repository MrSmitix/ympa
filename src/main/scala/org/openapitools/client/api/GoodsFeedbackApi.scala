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
import org.openapitools.client.api.DeleteGoodsFeedbackCommentRequest
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.GetGoodsFeedbackCommentsRequest
import org.openapitools.client.api.GetGoodsFeedbackCommentsResponse
import org.openapitools.client.api.GetGoodsFeedbackRequest
import org.openapitools.client.api.GetGoodsFeedbackResponse
import org.openapitools.client.api.SkipGoodsFeedbackReactionRequest
import org.openapitools.client.api.UpdateGoodsFeedbackCommentRequest
import org.openapitools.client.api.UpdateGoodsFeedbackCommentResponse

object GoodsFeedbackApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteGoodsFeedbackComment(host: String, businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteGoodsFeedbackCommentRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def getGoodsFeedbackComments(host: String, businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetGoodsFeedbackCommentsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsFeedbackCommentsResponse] = jsonOf[GetGoodsFeedbackCommentsResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsFeedbackCommentsRequest)
      resp          <- client.expect[GetGoodsFeedbackCommentsResponse](req)

    } yield resp
  }

  def getGoodsFeedbacks(host: String, businessId: Long, pageToken: String, limit: Integer, getGoodsFeedbackRequest: GetGoodsFeedbackRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetGoodsFeedbackResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsFeedbackResponse] = jsonOf[GetGoodsFeedbackResponse]

    val path = "/businesses/{businessId}/goods-feedback".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsFeedbackRequest)
      resp          <- client.expect[GetGoodsFeedbackResponse](req)

    } yield resp
  }

  def skipGoodsFeedbacksReaction(host: String, businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/goods-feedback/skip-reaction".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(skipGoodsFeedbackReactionRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateGoodsFeedbackComment(host: String, businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Task[UpdateGoodsFeedbackCommentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateGoodsFeedbackCommentResponse] = jsonOf[UpdateGoodsFeedbackCommentResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateGoodsFeedbackCommentRequest)
      resp          <- client.expect[UpdateGoodsFeedbackCommentResponse](req)

    } yield resp
  }

}

class HttpServiceGoodsFeedbackApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments/delete".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(deleteGoodsFeedbackCommentRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetGoodsFeedbackCommentsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsFeedbackCommentsResponse] = jsonOf[GetGoodsFeedbackCommentsResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsFeedbackCommentsRequest)
      resp          <- client.expect[GetGoodsFeedbackCommentsResponse](req)

    } yield resp
  }

  def getGoodsFeedbacks(businessId: Long, pageToken: String, limit: Integer, getGoodsFeedbackRequest: GetGoodsFeedbackRequest)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetGoodsFeedbackResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetGoodsFeedbackResponse] = jsonOf[GetGoodsFeedbackResponse]

    val path = "/businesses/{businessId}/goods-feedback".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getGoodsFeedbackRequest)
      resp          <- client.expect[GetGoodsFeedbackResponse](req)

    } yield resp
  }

  def skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/goods-feedback/skip-reaction".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(skipGoodsFeedbackReactionRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): Task[UpdateGoodsFeedbackCommentResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UpdateGoodsFeedbackCommentResponse] = jsonOf[UpdateGoodsFeedbackCommentResponse]

    val path = "/businesses/{businessId}/goods-feedback/comments/update".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateGoodsFeedbackCommentRequest)
      resp          <- client.expect[UpdateGoodsFeedbackCommentResponse](req)

    } yield resp
  }

}
