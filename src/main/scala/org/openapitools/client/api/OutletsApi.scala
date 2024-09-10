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
import org.openapitools.client.api.ChangeOutletRequest
import org.openapitools.client.api.CreateOutletResponse
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.GetOutletResponse
import org.openapitools.client.api.GetOutletsResponse

object OutletsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createOutlet(host: String, campaignId: Long, changeOutletRequest: ChangeOutletRequest): Task[CreateOutletResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateOutletResponse] = jsonOf[CreateOutletResponse]

    val path = "/campaigns/{campaignId}/outlets".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(changeOutletRequest)
      resp          <- client.expect[CreateOutletResponse](req)

    } yield resp
  }

  def deleteOutlet(host: String, campaignId: Long, outletId: Long): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/outlets/{outletId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "outletId" + "\\}",escape(outletId.toString))

    val httpMethod = Method.DELETE
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

  def getOutlet(host: String, campaignId: Long, outletId: Long): Task[GetOutletResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOutletResponse] = jsonOf[GetOutletResponse]

    val path = "/campaigns/{campaignId}/outlets/{outletId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "outletId" + "\\}",escape(outletId.toString))

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
      resp          <- client.expect[GetOutletResponse](req)

    } yield resp
  }

  def getOutlets(host: String, campaignId: Long, pageToken: String, regionId: Long, shopOutletCode: String, regionId2: Long)(implicit pageTokenQuery: QueryParam[String], regionIdQuery: QueryParam[Long], shopOutletCodeQuery: QueryParam[String], regionId2Query: QueryParam[Long]): Task[GetOutletsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOutletsResponse] = jsonOf[GetOutletsResponse]

    val path = "/campaigns/{campaignId}/outlets".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("regionId", Some(region_idQuery.toParamString(region_id))), ("shopOutletCode", Some(shop_outlet_codeQuery.toParamString(shop_outlet_code))), ("regionId2", Some(regionIdQuery.toParamString(regionId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOutletsResponse](req)

    } yield resp
  }

  def updateOutlet(host: String, campaignId: Long, outletId: Long, changeOutletRequest: ChangeOutletRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/outlets/{outletId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "outletId" + "\\}",escape(outletId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(changeOutletRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServiceOutletsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createOutlet(campaignId: Long, changeOutletRequest: ChangeOutletRequest): Task[CreateOutletResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateOutletResponse] = jsonOf[CreateOutletResponse]

    val path = "/campaigns/{campaignId}/outlets".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(changeOutletRequest)
      resp          <- client.expect[CreateOutletResponse](req)

    } yield resp
  }

  def deleteOutlet(campaignId: Long, outletId: Long): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/outlets/{outletId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "outletId" + "\\}",escape(outletId.toString))

    val httpMethod = Method.DELETE
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

  def getOutlet(campaignId: Long, outletId: Long): Task[GetOutletResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOutletResponse] = jsonOf[GetOutletResponse]

    val path = "/campaigns/{campaignId}/outlets/{outletId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "outletId" + "\\}",escape(outletId.toString))

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
      resp          <- client.expect[GetOutletResponse](req)

    } yield resp
  }

  def getOutlets(campaignId: Long, pageToken: String, regionId: Long, shopOutletCode: String, regionId2: Long)(implicit pageTokenQuery: QueryParam[String], regionIdQuery: QueryParam[Long], shopOutletCodeQuery: QueryParam[String], regionId2Query: QueryParam[Long]): Task[GetOutletsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOutletsResponse] = jsonOf[GetOutletsResponse]

    val path = "/campaigns/{campaignId}/outlets".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pageToken", Some(page_tokenQuery.toParamString(page_token))), ("regionId", Some(region_idQuery.toParamString(region_id))), ("shopOutletCode", Some(shop_outlet_codeQuery.toParamString(shop_outlet_code))), ("regionId2", Some(regionIdQuery.toParamString(regionId))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOutletsResponse](req)

    } yield resp
  }

  def updateOutlet(campaignId: Long, outletId: Long, changeOutletRequest: ChangeOutletRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/outlets/{outletId}".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString)).replaceAll("\\{" + "outletId" + "\\}",escape(outletId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(changeOutletRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
