package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GenerateBoostConsolidatedRequest
import model.GenerateCompetitorsPositionReportRequest
import model.GenerateGoodsFeedbackRequest
import model.GenerateGoodsMovementReportRequest
import model.GenerateGoodsRealizationReportRequest
import model.GenerateGoodsTurnoverRequest
import model.GenerateMassOrderLabelsRequest
import model.GeneratePricesReportRequest
import model.GenerateReportResponse
import model.GenerateShelfsStatisticsRequest
import model.GenerateShipmentListDocumentReportRequest
import model.GenerateShowsSalesReportRequest
import model.GenerateStocksOnWarehousesReportRequest
import model.GenerateUnitedMarketplaceServicesReportRequest
import model.GenerateUnitedNettingReportRequest
import model.GenerateUnitedOrdersRequest
import model.GetReportInfoResponse
import model.PageFormatType
import model.ReportFormatType

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Singleton
class ReportsApiController @Inject()(cc: ControllerComponents, api: ReportsApi) extends AbstractController(cc) {
  /**
    * POST /reports/boost-consolidated/generate?format=[value]
    */
  def generateBoostConsolidatedReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateBoostConsolidatedRequest = request.body.asJson.map(_.as[GenerateBoostConsolidatedRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateBoostConsolidatedRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/competitors-position/generate?format=[value]
    */
  def generateCompetitorsPositionReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateCompetitorsPositionReportRequest = request.body.asJson.map(_.as[GenerateCompetitorsPositionReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateCompetitorsPositionReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/goods-feedback/generate?format=[value]
    */
  def generateGoodsFeedbackReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateGoodsFeedbackRequest = request.body.asJson.map(_.as[GenerateGoodsFeedbackRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateGoodsFeedbackRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/goods-movement/generate?format=[value]
    */
  def generateGoodsMovementReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateGoodsMovementReportRequest = request.body.asJson.map(_.as[GenerateGoodsMovementReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateGoodsMovementReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateGoodsMovementReport(generateGoodsMovementReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/goods-realization/generate?format=[value]
    */
  def generateGoodsRealizationReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateGoodsRealizationReportRequest = request.body.asJson.map(_.as[GenerateGoodsRealizationReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateGoodsRealizationReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/goods-turnover/generate?format=[value]
    */
  def generateGoodsTurnoverReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateGoodsTurnoverRequest = request.body.asJson.map(_.as[GenerateGoodsTurnoverRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateGoodsTurnoverRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/documents/labels/generate?format=[value]
    */
  def generateMassOrderLabelsReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateMassOrderLabelsRequest = request.body.asJson.map(_.as[GenerateMassOrderLabelsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateMassOrderLabelsRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/prices/generate?format=[value]
    */
  def generatePricesReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generatePricesReportRequest = request.body.asJson.map(_.as[GeneratePricesReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generatePricesReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generatePricesReport(generatePricesReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/shelf-statistics/generate?format=[value]
    */
  def generateShelfsStatisticsReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateShelfsStatisticsRequest = request.body.asJson.map(_.as[GenerateShelfsStatisticsRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateShelfsStatisticsRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/documents/shipment-list/generate
    */
  def generateShipmentListDocumentReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateShipmentListDocumentReportRequest = request.body.asJson.map(_.as[GenerateShipmentListDocumentReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateShipmentListDocumentReportRequest")
      }
      api.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/shows-sales/generate?format=[value]
    */
  def generateShowsSalesReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateShowsSalesReportRequest = request.body.asJson.map(_.as[GenerateShowsSalesReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateShowsSalesReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateShowsSalesReport(generateShowsSalesReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/stocks-on-warehouses/generate?format=[value]
    */
  def generateStocksOnWarehousesReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateStocksOnWarehousesReportRequest = request.body.asJson.map(_.as[GenerateStocksOnWarehousesReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateStocksOnWarehousesReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/united-marketplace-services/generate?format=[value]
    */
  def generateUnitedMarketplaceServicesReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateUnitedMarketplaceServicesReportRequest = request.body.asJson.map(_.as[GenerateUnitedMarketplaceServicesReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateUnitedMarketplaceServicesReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/united-netting/generate?format=[value]
    */
  def generateUnitedNettingReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateUnitedNettingReportRequest = request.body.asJson.map(_.as[GenerateUnitedNettingReportRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateUnitedNettingReportRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateUnitedNettingReport(generateUnitedNettingReportRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /reports/united-orders/generate?format=[value]
    */
  def generateUnitedOrdersReport(): Action[AnyContent] = Action { request =>
    def executeApi(): GenerateReportResponse = {
      val generateUnitedOrdersRequest = request.body.asJson.map(_.as[GenerateUnitedOrdersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "generateUnitedOrdersRequest")
      }
      val format = request.getQueryString("format")
        .map(value => )
        
      api.generateUnitedOrdersReport(generateUnitedOrdersRequest, format)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /reports/info/:reportId
    * @param reportId Идентификатор отчета, который вы получили после запуска генерации. 
    */
  def getReportInfo(reportId: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetReportInfoResponse = {
      api.getReportInfo(reportId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
