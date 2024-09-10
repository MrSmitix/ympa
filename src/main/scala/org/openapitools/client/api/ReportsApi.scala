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
import org.openapitools.client.api.GenerateBoostConsolidatedRequest
import org.openapitools.client.api.GenerateCompetitorsPositionReportRequest
import org.openapitools.client.api.GenerateGoodsFeedbackRequest
import org.openapitools.client.api.GenerateGoodsMovementReportRequest
import org.openapitools.client.api.GenerateGoodsRealizationReportRequest
import org.openapitools.client.api.GenerateGoodsTurnoverRequest
import org.openapitools.client.api.GenerateMassOrderLabelsRequest
import org.openapitools.client.api.GeneratePricesReportRequest
import org.openapitools.client.api.GenerateReportResponse
import org.openapitools.client.api.GenerateShelfsStatisticsRequest
import org.openapitools.client.api.GenerateShipmentListDocumentReportRequest
import org.openapitools.client.api.GenerateShowsSalesReportRequest
import org.openapitools.client.api.GenerateStocksOnWarehousesReportRequest
import org.openapitools.client.api.GenerateUnitedMarketplaceServicesReportRequest
import org.openapitools.client.api.GenerateUnitedNettingReportRequest
import org.openapitools.client.api.GenerateUnitedOrdersRequest
import org.openapitools.client.api.GetReportInfoResponse
import org.openapitools.client.api.PageFormatType
import org.openapitools.client.api.ReportFormatType

object ReportsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def generateBoostConsolidatedReport(host: String, generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/boost-consolidated/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateBoostConsolidatedRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateCompetitorsPositionReport(host: String, generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/competitors-position/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateCompetitorsPositionReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsFeedbackReport(host: String, generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-feedback/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsFeedbackRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsMovementReport(host: String, generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-movement/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsMovementReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsRealizationReport(host: String, generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-realization/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsRealizationReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsTurnoverReport(host: String, generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-turnover/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsTurnoverRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateMassOrderLabelsReport(host: String, generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: PageFormatType)(implicit formatQuery: QueryParam[PageFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/documents/labels/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateMassOrderLabelsRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generatePricesReport(host: String, generatePricesReportRequest: GeneratePricesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/prices/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generatePricesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShelfsStatisticsReport(host: String, generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/shelf-statistics/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShelfsStatisticsRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShipmentListDocumentReport(host: String, generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/documents/shipment-list/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShipmentListDocumentReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShowsSalesReport(host: String, generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/shows-sales/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShowsSalesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateStocksOnWarehousesReport(host: String, generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/stocks-on-warehouses/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateStocksOnWarehousesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedMarketplaceServicesReport(host: String, generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-marketplace-services/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedMarketplaceServicesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedNettingReport(host: String, generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-netting/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedNettingReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedOrdersReport(host: String, generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-orders/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedOrdersRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def getReportInfo(host: String, reportId: String): Task[GetReportInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetReportInfoResponse] = jsonOf[GetReportInfoResponse]

    val path = "/reports/info/{reportId}".replaceAll("\\{" + "reportId" + "\\}",escape(reportId.toString))

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
      resp          <- client.expect[GetReportInfoResponse](req)

    } yield resp
  }

}

class HttpServiceReportsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/boost-consolidated/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateBoostConsolidatedRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/competitors-position/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateCompetitorsPositionReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-feedback/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsFeedbackRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsMovementReport(generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-movement/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsMovementReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-realization/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsRealizationReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateGoodsTurnoverReport(generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/goods-turnover/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateGoodsTurnoverRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: PageFormatType)(implicit formatQuery: QueryParam[PageFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/documents/labels/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateMassOrderLabelsRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/prices/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generatePricesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/shelf-statistics/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShelfsStatisticsRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/documents/shipment-list/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShipmentListDocumentReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/shows-sales/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateShowsSalesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/stocks-on-warehouses/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateStocksOnWarehousesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-marketplace-services/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedMarketplaceServicesReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-netting/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedNettingReportRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: ReportFormatType)(implicit formatQuery: QueryParam[ReportFormatType]): Task[GenerateReportResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GenerateReportResponse] = jsonOf[GenerateReportResponse]

    val path = "/reports/united-orders/generate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("format", Some(formatQuery.toParamString(format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(generateUnitedOrdersRequest)
      resp          <- client.expect[GenerateReportResponse](req)

    } yield resp
  }

  def getReportInfo(reportId: String): Task[GetReportInfoResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[GetReportInfoResponse] = jsonOf[GetReportInfoResponse]

    val path = "/reports/info/{reportId}".replaceAll("\\{" + "reportId" + "\\}",escape(reportId.toString))

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
      resp          <- client.expect[GetReportInfoResponse](req)

    } yield resp
  }

}
