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
import org.openapitools.client.api.CurrencyType
import org.openapitools.client.api.GetModelsOffersResponse
import org.openapitools.client.api.GetModelsRequest
import org.openapitools.client.api.GetModelsResponse
import org.openapitools.client.api.SearchModelsResponse
import org.openapitools.client.api.SortOrderType

object ModelsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getModel(host: String, modelId: Long, regionId: Long, currency: CurrencyType)(implicit regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType]): Task[GetModelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetModelsResponse] = jsonOf[GetModelsResponse]

    val path = "/models/{modelId}".replaceAll("\\{" + "modelId" + "\\}",escape(modelId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetModelsResponse](req)

    } yield resp
  }

  def getModelOffers(host: String, modelId: Long, regionId: Long, currency: CurrencyType, orderByPrice: SortOrderType, count: Integer = 10, page: Integer = 1)(implicit regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType], orderByPriceQuery: QueryParam[SortOrderType], countQuery: QueryParam[Integer], pageQuery: QueryParam[Integer]): Task[GetModelsOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetModelsOffersResponse] = jsonOf[GetModelsOffersResponse]

    val path = "/models/{modelId}/offers".replaceAll("\\{" + "modelId" + "\\}",escape(modelId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))), ("orderByPrice", Some(orderByPriceQuery.toParamString(orderByPrice))), ("count", Some(countQuery.toParamString(count))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetModelsOffersResponse](req)

    } yield resp
  }

  def getModels(host: String, regionId: Long, getModelsRequest: GetModelsRequest, currency: CurrencyType)(implicit regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType]): Task[GetModelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetModelsResponse] = jsonOf[GetModelsResponse]

    val path = "/models"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getModelsRequest)
      resp          <- client.expect[GetModelsResponse](req)

    } yield resp
  }

  def getModelsOffers(host: String, regionId: Long, getModelsRequest: GetModelsRequest, currency: CurrencyType, orderByPrice: SortOrderType)(implicit regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType], orderByPriceQuery: QueryParam[SortOrderType]): Task[GetModelsOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetModelsOffersResponse] = jsonOf[GetModelsOffersResponse]

    val path = "/models/offers"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))), ("orderByPrice", Some(orderByPriceQuery.toParamString(orderByPrice))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getModelsRequest)
      resp          <- client.expect[GetModelsOffersResponse](req)

    } yield resp
  }

  def searchModels(host: String, query: String, regionId: Long, currency: CurrencyType, page: Integer = 1, pageSize: Integer)(implicit queryQuery: QueryParam[String], regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[SearchModelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SearchModelsResponse] = jsonOf[SearchModelsResponse]

    val path = "/models"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("query", Some(queryQuery.toParamString(query))), ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SearchModelsResponse](req)

    } yield resp
  }

}

class HttpServiceModelsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getModel(modelId: Long, regionId: Long, currency: CurrencyType)(implicit regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType]): Task[GetModelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetModelsResponse] = jsonOf[GetModelsResponse]

    val path = "/models/{modelId}".replaceAll("\\{" + "modelId" + "\\}",escape(modelId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetModelsResponse](req)

    } yield resp
  }

  def getModelOffers(modelId: Long, regionId: Long, currency: CurrencyType, orderByPrice: SortOrderType, count: Integer = 10, page: Integer = 1)(implicit regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType], orderByPriceQuery: QueryParam[SortOrderType], countQuery: QueryParam[Integer], pageQuery: QueryParam[Integer]): Task[GetModelsOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetModelsOffersResponse] = jsonOf[GetModelsOffersResponse]

    val path = "/models/{modelId}/offers".replaceAll("\\{" + "modelId" + "\\}",escape(modelId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))), ("orderByPrice", Some(orderByPriceQuery.toParamString(orderByPrice))), ("count", Some(countQuery.toParamString(count))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetModelsOffersResponse](req)

    } yield resp
  }

  def getModels(regionId: Long, getModelsRequest: GetModelsRequest, currency: CurrencyType)(implicit regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType]): Task[GetModelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetModelsResponse] = jsonOf[GetModelsResponse]

    val path = "/models"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getModelsRequest)
      resp          <- client.expect[GetModelsResponse](req)

    } yield resp
  }

  def getModelsOffers(regionId: Long, getModelsRequest: GetModelsRequest, currency: CurrencyType, orderByPrice: SortOrderType)(implicit regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType], orderByPriceQuery: QueryParam[SortOrderType]): Task[GetModelsOffersResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetModelsOffersResponse] = jsonOf[GetModelsOffersResponse]

    val path = "/models/offers"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))), ("orderByPrice", Some(orderByPriceQuery.toParamString(orderByPrice))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(getModelsRequest)
      resp          <- client.expect[GetModelsOffersResponse](req)

    } yield resp
  }

  def searchModels(query: String, regionId: Long, currency: CurrencyType, page: Integer = 1, pageSize: Integer)(implicit queryQuery: QueryParam[String], regionIdQuery: QueryParam[Long], currencyQuery: QueryParam[CurrencyType], pageQuery: QueryParam[Integer], pageSizeQuery: QueryParam[Integer]): Task[SearchModelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[SearchModelsResponse] = jsonOf[SearchModelsResponse]

    val path = "/models"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("query", Some(queryQuery.toParamString(query))), ("regionId", Some(regionIdQuery.toParamString(regionId))), ("currency", Some(currencyQuery.toParamString(currency))), ("page", Some(pageQuery.toParamString(page))), ("pageSize", Some(pageSizeQuery.toParamString(pageSize))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SearchModelsResponse](req)

    } yield resp
  }

}
