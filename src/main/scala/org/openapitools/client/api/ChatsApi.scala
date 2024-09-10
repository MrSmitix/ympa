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
import org.openapitools.client.api.CreateChatRequest
import org.openapitools.client.api.CreateChatResponse
import org.openapitools.client.api.EmptyApiResponse
import java.io.File
import org.openapitools.client.api.GetChatHistoryRequest
import org.openapitools.client.api.GetChatHistoryResponse
import org.openapitools.client.api.GetChatsRequest
import org.openapitools.client.api.GetChatsResponse
import org.openapitools.client.api.SendMessageToChatRequest

object ChatsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createChat(host: String, businessId: Long, createChatRequest: CreateChatRequest): Task[CreateChatResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateChatResponse] = jsonOf[CreateChatResponse]

    val path = "/businesses/{businessId}/chats/new".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createChatRequest)
      resp          <- client.expect[CreateChatResponse](req)

    } yield resp
  }

  def getChatHistory(host: String, businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: String, limit: Integer)(implicit chatIdQuery: QueryParam[Long], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetChatHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetChatHistoryResponse] = jsonOf[GetChatHistoryResponse]

    val path = "/businesses/{businessId}/chats/history".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getChatHistoryRequest)
      resp          <- client.expect[GetChatHistoryResponse](req)

    } yield resp
  }

  def getChats(host: String, businessId: Long, getChatsRequest: GetChatsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetChatsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetChatsResponse] = jsonOf[GetChatsResponse]

    val path = "/businesses/{businessId}/chats".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getChatsRequest)
      resp          <- client.expect[GetChatsResponse](req)

    } yield resp
  }

  def sendFileToChat(host: String, businessId: Long, chatId: Long, file: File)(implicit chatIdQuery: QueryParam[Long]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/chats/file/send".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def sendMessageToChat(host: String, businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest)(implicit chatIdQuery: QueryParam[Long]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/chats/message".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sendMessageToChatRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServiceChatsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createChat(businessId: Long, createChatRequest: CreateChatRequest): Task[CreateChatResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateChatResponse] = jsonOf[CreateChatResponse]

    val path = "/businesses/{businessId}/chats/new".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createChatRequest)
      resp          <- client.expect[CreateChatResponse](req)

    } yield resp
  }

  def getChatHistory(businessId: Long, chatId: Long, getChatHistoryRequest: GetChatHistoryRequest, pageToken: String, limit: Integer)(implicit chatIdQuery: QueryParam[Long], pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetChatHistoryResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetChatHistoryResponse] = jsonOf[GetChatHistoryResponse]

    val path = "/businesses/{businessId}/chats/history".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))), ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getChatHistoryRequest)
      resp          <- client.expect[GetChatHistoryResponse](req)

    } yield resp
  }

  def getChats(businessId: Long, getChatsRequest: GetChatsRequest, pageToken: String, limit: Integer)(implicit pageTokenQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[GetChatsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetChatsResponse] = jsonOf[GetChatsResponse]

    val path = "/businesses/{businessId}/chats".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getChatsRequest)
      resp          <- client.expect[GetChatsResponse](req)

    } yield resp
  }

  def sendFileToChat(businessId: Long, chatId: Long, file: File)(implicit chatIdQuery: QueryParam[Long]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/chats/file/send".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def sendMessageToChat(businessId: Long, chatId: Long, sendMessageToChatRequest: SendMessageToChatRequest)(implicit chatIdQuery: QueryParam[Long]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/businesses/{businessId}/chats/message".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("chatId", Some(chatIdQuery.toParamString(chatId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(sendMessageToChatRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
