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
import org.openapitools.client.api.GetFulfillmentWarehousesResponse
import org.openapitools.client.api.GetWarehousesResponse

object WarehousesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getFulfillmentWarehouses(host: String): Task[GetFulfillmentWarehousesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFulfillmentWarehousesResponse] = jsonOf[GetFulfillmentWarehousesResponse]

    val path = "/warehouses"

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
      resp          <- client.expect[GetFulfillmentWarehousesResponse](req)

    } yield resp
  }

  def getWarehouses(host: String, businessId: Long): Task[GetWarehousesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetWarehousesResponse] = jsonOf[GetWarehousesResponse]

    val path = "/businesses/{businessId}/warehouses".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

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
      resp          <- client.expect[GetWarehousesResponse](req)

    } yield resp
  }

}

class HttpServiceWarehousesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getFulfillmentWarehouses(): Task[GetFulfillmentWarehousesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetFulfillmentWarehousesResponse] = jsonOf[GetFulfillmentWarehousesResponse]

    val path = "/warehouses"

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
      resp          <- client.expect[GetFulfillmentWarehousesResponse](req)

    } yield resp
  }

  def getWarehouses(businessId: Long): Task[GetWarehousesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetWarehousesResponse] = jsonOf[GetWarehousesResponse]

    val path = "/businesses/{businessId}/warehouses".replaceAll("\\{" + "businessId" + "\\}",escape(businessId.toString))

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
      resp          <- client.expect[GetWarehousesResponse](req)

    } yield resp
  }

}
