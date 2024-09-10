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
import org.openapitools.client.api.FeedIndexLogsStatusType
import org.openapitools.client.api.GetFeedIndexLogsResponse
import org.openapitools.client.api.GetFeedResponse
import org.openapitools.client.api.GetFeedsResponse
import java.time.OffsetDateTime
import org.openapitools.client.api.SetFeedParamsRequest

object FeedsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getFeed(host: String, campaignId: Long, feedId: Long): Task[GetFeedResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedResponse] = jsonOf[GetFeedResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedResponse](req)

    } yield resp
  }

  def getFeedIndexLogs(host: String, campaignId: Long, feedId: Long, limit: Integer, publishedTimeFrom: OffsetDateTime, publishedTimeTo: OffsetDateTime, status: FeedIndexLogsStatusType)(implicit limitQuery: QueryParam[Integer], publishedTimeFromQuery: QueryParam[OffsetDateTime], publishedTimeToQuery: QueryParam[OffsetDateTime], statusQuery: QueryParam[FeedIndexLogsStatusType]): Task[GetFeedIndexLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedIndexLogsResponse] = jsonOf[GetFeedIndexLogsResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("publishedTimeFrom", Some(published_time_fromQuery.toParamString(published_time_from))), ("publishedTimeTo", Some(published_time_toQuery.toParamString(published_time_to))), ("status", Some(statusQuery.toParamString(status))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedIndexLogsResponse](req)

    } yield resp
  }

  def getFeeds(host: String, campaignId: Long): Task[GetFeedsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedsResponse] = jsonOf[GetFeedsResponse]

    val path = "/campaigns/{campaignId}/feeds".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedsResponse](req)

    } yield resp
  }

  def refreshFeed(host: String, campaignId: Long, feedId: Long): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

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
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def setFeedParams(host: String, campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/params".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setFeedParamsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServiceFeedsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getFeed(campaignId: Long, feedId: Long): Task[GetFeedResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedResponse] = jsonOf[GetFeedResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedResponse](req)

    } yield resp
  }

  def getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Integer, publishedTimeFrom: OffsetDateTime, publishedTimeTo: OffsetDateTime, status: FeedIndexLogsStatusType)(implicit limitQuery: QueryParam[Integer], publishedTimeFromQuery: QueryParam[OffsetDateTime], publishedTimeToQuery: QueryParam[OffsetDateTime], statusQuery: QueryParam[FeedIndexLogsStatusType]): Task[GetFeedIndexLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedIndexLogsResponse] = jsonOf[GetFeedIndexLogsResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("publishedTimeFrom", Some(published_time_fromQuery.toParamString(published_time_from))), ("publishedTimeTo", Some(published_time_toQuery.toParamString(published_time_to))), ("status", Some(statusQuery.toParamString(status))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedIndexLogsResponse](req)

    } yield resp
  }

  def getFeeds(campaignId: Long): Task[GetFeedsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFeedsResponse] = jsonOf[GetFeedsResponse]

    val path = "/campaigns/{campaignId}/feeds".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetFeedsResponse](req)

    } yield resp
  }

  def refreshFeed(campaignId: Long, feedId: Long): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

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
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/feeds/{feedId}/params".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "feedId" + "\\}",escape(feedId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(setFeedParamsRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
