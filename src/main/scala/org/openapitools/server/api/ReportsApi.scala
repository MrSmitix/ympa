package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ApiClientDataErrorResponse
import org.openapitools.server.model.ApiForbiddenErrorResponse
import org.openapitools.server.model.ApiLimitErrorResponse
import org.openapitools.server.model.ApiNotFoundErrorResponse
import org.openapitools.server.model.ApiServerErrorResponse
import org.openapitools.server.model.ApiUnauthorizedErrorResponse
import org.openapitools.server.model.GenerateBoostConsolidatedRequest
import org.openapitools.server.model.GenerateCompetitorsPositionReportRequest
import org.openapitools.server.model.GenerateGoodsFeedbackRequest
import org.openapitools.server.model.GenerateGoodsMovementReportRequest
import org.openapitools.server.model.GenerateGoodsRealizationReportRequest
import org.openapitools.server.model.GenerateGoodsTurnoverRequest
import org.openapitools.server.model.GenerateMassOrderLabelsRequest
import org.openapitools.server.model.GeneratePricesReportRequest
import org.openapitools.server.model.GenerateReportResponse
import org.openapitools.server.model.GenerateShelfsStatisticsRequest
import org.openapitools.server.model.GenerateShipmentListDocumentReportRequest
import org.openapitools.server.model.GenerateShowsSalesReportRequest
import org.openapitools.server.model.GenerateStocksOnWarehousesReportRequest
import org.openapitools.server.model.GenerateUnitedMarketplaceServicesReportRequest
import org.openapitools.server.model.GenerateUnitedNettingReportRequest
import org.openapitools.server.model.GenerateUnitedOrdersRequest
import org.openapitools.server.model.GetReportInfoResponse
import org.openapitools.server.model.PageFormatType
import org.openapitools.server.model.ReportFormatType


class ReportsApi(
    reportsService: ReportsApiService,
    reportsMarshaller: ReportsApiMarshaller
) {

  
  import reportsMarshaller._

  lazy val route: Route =
    path("reports" / "boost-consolidated" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateBoostConsolidatedRequest]){ generateBoostConsolidatedRequest =>
              reportsService.generateBoostConsolidatedReport(generateBoostConsolidatedRequest = generateBoostConsolidatedRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "competitors-position" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateCompetitorsPositionReportRequest]){ generateCompetitorsPositionReportRequest =>
              reportsService.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest = generateCompetitorsPositionReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "goods-feedback" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateGoodsFeedbackRequest]){ generateGoodsFeedbackRequest =>
              reportsService.generateGoodsFeedbackReport(generateGoodsFeedbackRequest = generateGoodsFeedbackRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "goods-movement" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateGoodsMovementReportRequest]){ generateGoodsMovementReportRequest =>
              reportsService.generateGoodsMovementReport(generateGoodsMovementReportRequest = generateGoodsMovementReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "goods-realization" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateGoodsRealizationReportRequest]){ generateGoodsRealizationReportRequest =>
              reportsService.generateGoodsRealizationReport(generateGoodsRealizationReportRequest = generateGoodsRealizationReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "goods-turnover" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateGoodsTurnoverRequest]){ generateGoodsTurnoverRequest =>
              reportsService.generateGoodsTurnoverReport(generateGoodsTurnoverRequest = generateGoodsTurnoverRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "documents" / "labels" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateMassOrderLabelsRequest]){ generateMassOrderLabelsRequest =>
              reportsService.generateMassOrderLabelsReport(generateMassOrderLabelsRequest = generateMassOrderLabelsRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "prices" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GeneratePricesReportRequest]){ generatePricesReportRequest =>
              reportsService.generatePricesReport(generatePricesReportRequest = generatePricesReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "shelf-statistics" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateShelfsStatisticsRequest]){ generateShelfsStatisticsRequest =>
              reportsService.generateShelfsStatisticsReport(generateShelfsStatisticsRequest = generateShelfsStatisticsRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "documents" / "shipment-list" / "generate") { 
      post {  
            entity(as[GenerateShipmentListDocumentReportRequest]){ generateShipmentListDocumentReportRequest =>
              reportsService.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest = generateShipmentListDocumentReportRequest)
            }
      }
    } ~
    path("reports" / "shows-sales" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateShowsSalesReportRequest]){ generateShowsSalesReportRequest =>
              reportsService.generateShowsSalesReport(generateShowsSalesReportRequest = generateShowsSalesReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "stocks-on-warehouses" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateStocksOnWarehousesReportRequest]){ generateStocksOnWarehousesReportRequest =>
              reportsService.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest = generateStocksOnWarehousesReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "united-marketplace-services" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateUnitedMarketplaceServicesReportRequest]){ generateUnitedMarketplaceServicesReportRequest =>
              reportsService.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest = generateUnitedMarketplaceServicesReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "united-netting" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateUnitedNettingReportRequest]){ generateUnitedNettingReportRequest =>
              reportsService.generateUnitedNettingReport(generateUnitedNettingReportRequest = generateUnitedNettingReportRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "united-orders" / "generate") { 
      post { 
        parameters("format".as[String].?) { (format) => 
            entity(as[GenerateUnitedOrdersRequest]){ generateUnitedOrdersRequest =>
              reportsService.generateUnitedOrdersReport(generateUnitedOrdersRequest = generateUnitedOrdersRequest, format = format)
            }
        }
      }
    } ~
    path("reports" / "info" / Segment) { (reportId) => 
      get {  
            reportsService.getReportInfo(reportId = reportId)
      }
    }
}


trait ReportsApiService {

  def generateBoostConsolidatedReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateBoostConsolidatedReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateBoostConsolidatedReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateBoostConsolidatedReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateBoostConsolidatedReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateBoostConsolidatedReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateBoostConsolidatedReport(generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateCompetitorsPositionReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateCompetitorsPositionReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateCompetitorsPositionReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateCompetitorsPositionReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateCompetitorsPositionReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateCompetitorsPositionReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateGoodsFeedbackReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateGoodsFeedbackReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateGoodsFeedbackReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateGoodsFeedbackReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateGoodsFeedbackReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateGoodsFeedbackReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateGoodsFeedbackReport(generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateGoodsMovementReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateGoodsMovementReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateGoodsMovementReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateGoodsMovementReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateGoodsMovementReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateGoodsMovementReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateGoodsMovementReport(generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateGoodsRealizationReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateGoodsRealizationReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateGoodsRealizationReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateGoodsRealizationReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateGoodsRealizationReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateGoodsRealizationReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateGoodsRealizationReport(generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateGoodsTurnoverReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateGoodsTurnoverReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateGoodsTurnoverReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateGoodsTurnoverReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateGoodsTurnoverReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateGoodsTurnoverReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateGoodsTurnoverReport(generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateMassOrderLabelsReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateMassOrderLabelsReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateMassOrderLabelsReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateMassOrderLabelsReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateMassOrderLabelsReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateMassOrderLabelsReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус &#x60;RESOURCE_NOT_FOUND&#x60;. , DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateMassOrderLabelsReport(generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generatePricesReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generatePricesReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generatePricesReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generatePricesReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generatePricesReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generatePricesReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generatePricesReport(generatePricesReportRequest: GeneratePricesReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateShelfsStatisticsReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateShelfsStatisticsReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateShelfsStatisticsReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateShelfsStatisticsReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateShelfsStatisticsReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateShelfsStatisticsReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateShelfsStatisticsReport(generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateShipmentListDocumentReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateShipmentListDocumentReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateShipmentListDocumentReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateShipmentListDocumentReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateShipmentListDocumentReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateShipmentListDocumentReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest)
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateShowsSalesReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateShowsSalesReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateShowsSalesReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateShowsSalesReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateShowsSalesReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateShowsSalesReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateShowsSalesReport(generateShowsSalesReportRequest: GenerateShowsSalesReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateStocksOnWarehousesReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateStocksOnWarehousesReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateStocksOnWarehousesReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateStocksOnWarehousesReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateStocksOnWarehousesReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateStocksOnWarehousesReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateUnitedMarketplaceServicesReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateUnitedMarketplaceServicesReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateUnitedMarketplaceServicesReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateUnitedMarketplaceServicesReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateUnitedMarketplaceServicesReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateUnitedMarketplaceServicesReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateUnitedNettingReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateUnitedNettingReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateUnitedNettingReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateUnitedNettingReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateUnitedNettingReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateUnitedNettingReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateUnitedNettingReport(generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def generateUnitedOrdersReport200(responseGenerateReportResponse: GenerateReportResponse)(implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]): Route =
    complete((200, responseGenerateReportResponse))
  def generateUnitedOrdersReport400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def generateUnitedOrdersReport401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def generateUnitedOrdersReport403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def generateUnitedOrdersReport420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def generateUnitedOrdersReport500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет., DataType: GenerateReportResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def generateUnitedOrdersReport(generateUnitedOrdersRequest: GenerateUnitedOrdersRequest, format: Option[String])
      (implicit toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getReportInfo200(responseGetReportInfoResponse: GetReportInfoResponse)(implicit toEntityMarshallerGetReportInfoResponse: ToEntityMarshaller[GetReportInfoResponse]): Route =
    complete((200, responseGetReportInfoResponse))
  def getReportInfo400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getReportInfo401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getReportInfo403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getReportInfo404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getReportInfo420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getReportInfo500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    , DataType: GetReportInfoResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getReportInfo(reportId: String)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerGetReportInfoResponse: ToEntityMarshaller[GetReportInfoResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

}

trait ReportsApiMarshaller {
  implicit def fromEntityUnmarshallerGenerateShipmentListDocumentReportRequest: FromEntityUnmarshaller[GenerateShipmentListDocumentReportRequest]

  implicit def fromEntityUnmarshallerGenerateGoodsMovementReportRequest: FromEntityUnmarshaller[GenerateGoodsMovementReportRequest]

  implicit def fromEntityUnmarshallerGenerateGoodsTurnoverRequest: FromEntityUnmarshaller[GenerateGoodsTurnoverRequest]

  implicit def fromEntityUnmarshallerGeneratePricesReportRequest: FromEntityUnmarshaller[GeneratePricesReportRequest]

  implicit def fromEntityUnmarshallerGenerateGoodsFeedbackRequest: FromEntityUnmarshaller[GenerateGoodsFeedbackRequest]

  implicit def fromEntityUnmarshallerGenerateMassOrderLabelsRequest: FromEntityUnmarshaller[GenerateMassOrderLabelsRequest]

  implicit def fromEntityUnmarshallerGenerateShowsSalesReportRequest: FromEntityUnmarshaller[GenerateShowsSalesReportRequest]

  implicit def fromEntityUnmarshallerGenerateCompetitorsPositionReportRequest: FromEntityUnmarshaller[GenerateCompetitorsPositionReportRequest]

  implicit def fromEntityUnmarshallerGenerateStocksOnWarehousesReportRequest: FromEntityUnmarshaller[GenerateStocksOnWarehousesReportRequest]

  implicit def fromEntityUnmarshallerGenerateUnitedOrdersRequest: FromEntityUnmarshaller[GenerateUnitedOrdersRequest]

  implicit def fromEntityUnmarshallerGenerateBoostConsolidatedRequest: FromEntityUnmarshaller[GenerateBoostConsolidatedRequest]

  implicit def fromEntityUnmarshallerGenerateGoodsRealizationReportRequest: FromEntityUnmarshaller[GenerateGoodsRealizationReportRequest]

  implicit def fromEntityUnmarshallerGenerateUnitedNettingReportRequest: FromEntityUnmarshaller[GenerateUnitedNettingReportRequest]

  implicit def fromEntityUnmarshallerGenerateUnitedMarketplaceServicesReportRequest: FromEntityUnmarshaller[GenerateUnitedMarketplaceServicesReportRequest]

  implicit def fromEntityUnmarshallerGenerateShelfsStatisticsRequest: FromEntityUnmarshaller[GenerateShelfsStatisticsRequest]



  implicit def toEntityMarshallerGenerateReportResponse: ToEntityMarshaller[GenerateReportResponse]

  implicit def toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]

  implicit def toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]

  implicit def toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]

  implicit def toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]

  implicit def toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]

  implicit def toEntityMarshallerGetReportInfoResponse: ToEntityMarshaller[GetReportInfoResponse]

  implicit def toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]

}

