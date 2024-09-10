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
import org.openapitools.client.api.GetCategoriesMaxSaleQuantumRequest
import org.openapitools.client.api.GetCategoriesMaxSaleQuantumResponse
import org.openapitools.client.api.GetCategoriesRequest
import org.openapitools.client.api.GetCategoriesResponse

object CategoriesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getCategoriesMaxSaleQuantum(host: String, getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Task[GetCategoriesMaxSaleQuantumResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoriesMaxSaleQuantumResponse] = jsonOf[GetCategoriesMaxSaleQuantumResponse]

    val path = "/categories/max-sale-quantum"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCategoriesMaxSaleQuantumRequest)
      resp          <- client.expect[GetCategoriesMaxSaleQuantumResponse](req)

    } yield resp
  }

  def getCategoriesTree(host: String, getCategoriesRequest: GetCategoriesRequest): Task[GetCategoriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoriesResponse] = jsonOf[GetCategoriesResponse]

    val path = "/categories/tree"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCategoriesRequest)
      resp          <- client.expect[GetCategoriesResponse](req)

    } yield resp
  }

}

class HttpServiceCategoriesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): Task[GetCategoriesMaxSaleQuantumResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoriesMaxSaleQuantumResponse] = jsonOf[GetCategoriesMaxSaleQuantumResponse]

    val path = "/categories/max-sale-quantum"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCategoriesMaxSaleQuantumRequest)
      resp          <- client.expect[GetCategoriesMaxSaleQuantumResponse](req)

    } yield resp
  }

  def getCategoriesTree(getCategoriesRequest: GetCategoriesRequest): Task[GetCategoriesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetCategoriesResponse] = jsonOf[GetCategoriesResponse]

    val path = "/categories/tree"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getCategoriesRequest)
      resp          <- client.expect[GetCategoriesResponse](req)

    } yield resp
  }

}
