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
import org.openapitools.client.api.GetCampaignLoginsResponse
import org.openapitools.client.api.GetCampaignRegionResponse
import org.openapitools.client.api.GetCampaignResponse
import org.openapitools.client.api.GetCampaignSettingsResponse
import org.openapitools.client.api.GetCampaignsResponse

object CampaignsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getCampaign(host: String, campaignId: Long): Task[GetCampaignResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignResponse] = jsonOf[GetCampaignResponse]

    val path = "/campaigns/{campaignId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[GetCampaignResponse](req)

    } yield resp
  }

  def getCampaignLogins(host: String, campaignId: Long): Task[GetCampaignLoginsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignLoginsResponse] = jsonOf[GetCampaignLoginsResponse]

    val path = "/campaigns/{campaignId}/logins".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[GetCampaignLoginsResponse](req)

    } yield resp
  }

  def getCampaignRegion(host: String, campaignId: Long): Task[GetCampaignRegionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignRegionResponse] = jsonOf[GetCampaignRegionResponse]

    val path = "/campaigns/{campaignId}/region".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[GetCampaignRegionResponse](req)

    } yield resp
  }

  def getCampaignSettings(host: String, campaignId: Long): Task[GetCampaignSettingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignSettingsResponse] = jsonOf[GetCampaignSettingsResponse]

    val path = "/campaigns/{campaignId}/settings".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[GetCampaignSettingsResponse](req)

    } yield resp
  }

  def getCampaigns(host: String, page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetCampaignsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]

    val path = "/campaigns"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignsResponse](req)

    } yield resp
  }

  def getCampaignsByLogin(host: String, login: String, page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetCampaignsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]

    val path = "/campaigns/by_login/{login}".replaceAll("\\{" + "login" + "\\}",escape(login.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignsResponse](req)

    } yield resp
  }

}

class HttpServiceCampaignsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getCampaign(campaignId: Long): Task[GetCampaignResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignResponse] = jsonOf[GetCampaignResponse]

    val path = "/campaigns/{campaignId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[GetCampaignResponse](req)

    } yield resp
  }

  def getCampaignLogins(campaignId: Long): Task[GetCampaignLoginsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignLoginsResponse] = jsonOf[GetCampaignLoginsResponse]

    val path = "/campaigns/{campaignId}/logins".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[GetCampaignLoginsResponse](req)

    } yield resp
  }

  def getCampaignRegion(campaignId: Long): Task[GetCampaignRegionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignRegionResponse] = jsonOf[GetCampaignRegionResponse]

    val path = "/campaigns/{campaignId}/region".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[GetCampaignRegionResponse](req)

    } yield resp
  }

  def getCampaignSettings(campaignId: Long): Task[GetCampaignSettingsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignSettingsResponse] = jsonOf[GetCampaignSettingsResponse]

    val path = "/campaigns/{campaignId}/settings".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

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
      resp          <- client.expect[GetCampaignSettingsResponse](req)

    } yield resp
  }

  def getCampaigns(page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetCampaignsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]

    val path = "/campaigns"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignsResponse](req)

    } yield resp
  }

  def getCampaignsByLogin(login: String, page: Integer = 1, pageSize: Integer)(implicit pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[GetCampaignsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCampaignsResponse] = jsonOf[GetCampaignsResponse]

    val path = "/campaigns/by_login/{login}".replaceAll("\\{" + "login" + "\\}",escape(login.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetCampaignsResponse](req)

    } yield resp
  }

}
