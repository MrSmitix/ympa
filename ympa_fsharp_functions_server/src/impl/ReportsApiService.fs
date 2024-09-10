namespace ympa_fsharp_functions_server
open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.GenerateBoostConsolidatedRequest
open ympa_fsharp_functions_server.Model.GenerateCompetitorsPositionReportRequest
open ympa_fsharp_functions_server.Model.GenerateGoodsFeedbackRequest
open ympa_fsharp_functions_server.Model.GenerateGoodsMovementReportRequest
open ympa_fsharp_functions_server.Model.GenerateGoodsRealizationReportRequest
open ympa_fsharp_functions_server.Model.GenerateGoodsTurnoverRequest
open ympa_fsharp_functions_server.Model.GenerateMassOrderLabelsRequest
open ympa_fsharp_functions_server.Model.GeneratePricesReportRequest
open ympa_fsharp_functions_server.Model.GenerateReportResponse
open ympa_fsharp_functions_server.Model.GenerateShelfsStatisticsRequest
open ympa_fsharp_functions_server.Model.GenerateShipmentListDocumentReportRequest
open ympa_fsharp_functions_server.Model.GenerateShowsSalesReportRequest
open ympa_fsharp_functions_server.Model.GenerateStocksOnWarehousesReportRequest
open ympa_fsharp_functions_server.Model.GenerateUnitedMarketplaceServicesReportRequest
open ympa_fsharp_functions_server.Model.GenerateUnitedNettingReportRequest
open ympa_fsharp_functions_server.Model.GenerateUnitedOrdersRequest
open ympa_fsharp_functions_server.Model.GetReportInfoResponse
open ympa_fsharp_functions_server.Model.PageFormatType
open ympa_fsharp_functions_server.Model.ReportFormatType
open ReportsApiHandlerParams
open ReportsApiServiceInterface
open System.Collections.Generic
open System

module ReportsApiServiceImplementation =

    //#region Service implementation
    type ReportsApiServiceImpl() =
      interface IReportsApiService with

        member this.GenerateBoostConsolidatedReport (parameters:GenerateBoostConsolidatedReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateBoostConsolidatedReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateBoostConsolidatedReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateBoostConsolidatedReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateBoostConsolidatedReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateBoostConsolidatedReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateBoostConsolidatedReportStatusCode500 { content = content }

        member this.GenerateCompetitorsPositionReport (parameters:GenerateCompetitorsPositionReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateCompetitorsPositionReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateCompetitorsPositionReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateCompetitorsPositionReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateCompetitorsPositionReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateCompetitorsPositionReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateCompetitorsPositionReportStatusCode500 { content = content }

        member this.GenerateGoodsFeedbackReport (parameters:GenerateGoodsFeedbackReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsFeedbackReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsFeedbackReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsFeedbackReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsFeedbackReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsFeedbackReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsFeedbackReportStatusCode500 { content = content }

        member this.GenerateGoodsMovementReport (parameters:GenerateGoodsMovementReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsMovementReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsMovementReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsMovementReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsMovementReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsMovementReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsMovementReportStatusCode500 { content = content }

        member this.GenerateGoodsRealizationReport (parameters:GenerateGoodsRealizationReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsRealizationReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsRealizationReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsRealizationReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsRealizationReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsRealizationReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsRealizationReportStatusCode500 { content = content }

        member this.GenerateGoodsTurnoverReport (parameters:GenerateGoodsTurnoverReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsTurnoverReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsTurnoverReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsTurnoverReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsTurnoverReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsTurnoverReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateGoodsTurnoverReportStatusCode500 { content = content }

        member this.GenerateMassOrderLabelsReport (parameters:GenerateMassOrderLabelsReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус &#x60;RESOURCE_NOT_FOUND&#x60;. " :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateMassOrderLabelsReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateMassOrderLabelsReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateMassOrderLabelsReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateMassOrderLabelsReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateMassOrderLabelsReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateMassOrderLabelsReportStatusCode500 { content = content }

        member this.GeneratePricesReport (parameters:GeneratePricesReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GeneratePricesReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GeneratePricesReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GeneratePricesReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GeneratePricesReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GeneratePricesReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GeneratePricesReportStatusCode500 { content = content }

        member this.GenerateShelfsStatisticsReport (parameters:GenerateShelfsStatisticsReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShelfsStatisticsReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShelfsStatisticsReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShelfsStatisticsReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShelfsStatisticsReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShelfsStatisticsReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShelfsStatisticsReportStatusCode500 { content = content }

        member this.GenerateShipmentListDocumentReport (parameters:GenerateShipmentListDocumentReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShipmentListDocumentReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShipmentListDocumentReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShipmentListDocumentReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShipmentListDocumentReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShipmentListDocumentReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShipmentListDocumentReportStatusCode500 { content = content }

        member this.GenerateShowsSalesReport (parameters:GenerateShowsSalesReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShowsSalesReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShowsSalesReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShowsSalesReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShowsSalesReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShowsSalesReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateShowsSalesReportStatusCode500 { content = content }

        member this.GenerateStocksOnWarehousesReport (parameters:GenerateStocksOnWarehousesReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateStocksOnWarehousesReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateStocksOnWarehousesReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateStocksOnWarehousesReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateStocksOnWarehousesReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateStocksOnWarehousesReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateStocksOnWarehousesReportStatusCode500 { content = content }

        member this.GenerateUnitedMarketplaceServicesReport (parameters:GenerateUnitedMarketplaceServicesReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedMarketplaceServicesReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedMarketplaceServicesReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedMarketplaceServicesReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedMarketplaceServicesReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedMarketplaceServicesReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedMarketplaceServicesReportStatusCode500 { content = content }

        member this.GenerateUnitedNettingReport (parameters:GenerateUnitedNettingReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedNettingReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedNettingReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedNettingReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedNettingReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedNettingReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedNettingReportStatusCode500 { content = content }

        member this.GenerateUnitedOrdersReport (parameters:GenerateUnitedOrdersReportBodyParams) =
          if true then
            let content = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет." :> obj :?> GenerateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedOrdersReportStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedOrdersReportStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedOrdersReportStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedOrdersReportStatusCode403 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedOrdersReportStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GenerateUnitedOrdersReportStatusCode500 { content = content }

        member this.GetReportInfo () =
          if true then
            let content = "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    " :> obj :?> GetReportInfoResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetReportInfoStatusCode200 { content = content }
          else if true then
            let content = "Запрос содержит неправильные данные." :> obj :?> ApiClientDataErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetReportInfoStatusCode400 { content = content }
          else if true then
            let content = "В запросе не указаны данные для авторизации." :> obj :?> ApiUnauthorizedErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetReportInfoStatusCode401 { content = content }
          else if true then
            let content = "Данные для авторизации неверны или доступ к ресурсу запрещен." :> obj :?> ApiForbiddenErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetReportInfoStatusCode403 { content = content }
          else if true then
            let content = "Запрашиваемый ресурс не найден." :> obj :?> ApiNotFoundErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetReportInfoStatusCode404 { content = content }
          else if true then
            let content = "Превышено ограничение на доступ к ресурсу." :> obj :?> ApiLimitErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetReportInfoStatusCode420 { content = content }
          else
            let content = "Внутренняя ошибка сервера." :> obj :?> ApiServerErrorResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetReportInfoStatusCode500 { content = content }

      //#endregion

    let ReportsApiService = ReportsApiServiceImpl() :> IReportsApiService