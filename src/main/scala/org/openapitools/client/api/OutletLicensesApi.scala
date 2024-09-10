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
import org.openapitools.client.api.EmptyApiResponse
import org.openapitools.client.api.GetOutletLicensesResponse
import org.openapitools.client.api.Set
import org.openapitools.client.api.UpdateOutletLicenseRequest

object OutletLicensesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteOutletLicenses(host: String, campaignId: Long, ids: Set[Long] = Set.empty[Long] )(implicit idsQuery: QueryParam[Set[Long]]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/outlets/licenses".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ids", Some(idsQuery.toParamString(ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def getOutletLicenses(host: String, campaignId: Long, outletIds: Set[Long] = Set.empty[Long] , ids: Set[Long] = Set.empty[Long] )(implicit outletIdsQuery: QueryParam[Set[Long]], idsQuery: QueryParam[Set[Long]]): Task[GetOutletLicensesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOutletLicensesResponse] = jsonOf[GetOutletLicensesResponse]

    val path = "/campaigns/{campaignId}/outlets/licenses".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("outletIds", Some(outletIdsQuery.toParamString(outletIds))), ("ids", Some(idsQuery.toParamString(ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOutletLicensesResponse](req)

    } yield resp
  }

  def updateOutletLicenses(host: String, campaignId: Long, updateOutletLicenseRequest: UpdateOutletLicenseRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/outlets/licenses".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOutletLicenseRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}

class HttpServiceOutletLicensesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteOutletLicenses(campaignId: Long, ids: Set[Long] = Set.empty[Long] )(implicit idsQuery: QueryParam[Set[Long]]): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/outlets/licenses".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ids", Some(idsQuery.toParamString(ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

  def getOutletLicenses(campaignId: Long, outletIds: Set[Long] = Set.empty[Long] , ids: Set[Long] = Set.empty[Long] )(implicit outletIdsQuery: QueryParam[Set[Long]], idsQuery: QueryParam[Set[Long]]): Task[GetOutletLicensesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetOutletLicensesResponse] = jsonOf[GetOutletLicensesResponse]

    val path = "/campaigns/{campaignId}/outlets/licenses".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("outletIds", Some(outletIdsQuery.toParamString(outletIds))), ("ids", Some(idsQuery.toParamString(ids))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetOutletLicensesResponse](req)

    } yield resp
  }

  def updateOutletLicenses(campaignId: Long, updateOutletLicenseRequest: UpdateOutletLicenseRequest): Task[EmptyApiResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[EmptyApiResponse] = jsonOf[EmptyApiResponse]

    val path = "/campaigns/{campaignId}/outlets/licenses".replaceAll("\\{" + "campaignId" + "\\}",escape(campaignId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateOutletLicenseRequest)
      resp          <- client.expect[EmptyApiResponse](req)

    } yield resp
  }

}
