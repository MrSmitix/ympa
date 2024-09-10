namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ReportsApiHandlerParams
open ReportsApiServiceInterface
open ReportsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GenerateBoostConsolidatedRequest
open ympa_fsharp_giraffe_server.Model.GenerateCompetitorsPositionReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsFeedbackRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsMovementReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsRealizationReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsTurnoverRequest
open ympa_fsharp_giraffe_server.Model.GenerateMassOrderLabelsRequest
open ympa_fsharp_giraffe_server.Model.GeneratePricesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateReportResponse
open ympa_fsharp_giraffe_server.Model.GenerateShelfsStatisticsRequest
open ympa_fsharp_giraffe_server.Model.GenerateShipmentListDocumentReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateShowsSalesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateStocksOnWarehousesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedMarketplaceServicesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedNettingReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedOrdersRequest
open ympa_fsharp_giraffe_server.Model.GetReportInfoResponse
open ympa_fsharp_giraffe_server.Model.PageFormatType
open ympa_fsharp_giraffe_server.Model.ReportFormatType

module ReportsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GenerateBoostConsolidatedReport
    /// <summary>
    /// Отчет по бусту продаж
    /// </summary>

    let GenerateBoostConsolidatedReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateBoostConsolidatedReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateBoostConsolidatedReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateBoostConsolidatedReportArgs
          let result = ReportsApiService.GenerateBoostConsolidatedReport ctx serviceArgs
          return! (match result with
                      | GenerateBoostConsolidatedReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateCompetitorsPositionReport
    /// <summary>
    /// Отчет «Конкурентная позиция»
    /// </summary>

    let GenerateCompetitorsPositionReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateCompetitorsPositionReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateCompetitorsPositionReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateCompetitorsPositionReportArgs
          let result = ReportsApiService.GenerateCompetitorsPositionReport ctx serviceArgs
          return! (match result with
                      | GenerateCompetitorsPositionReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateGoodsFeedbackReport
    /// <summary>
    /// Отчет по отзывам о товарах
    /// </summary>

    let GenerateGoodsFeedbackReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateGoodsFeedbackReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateGoodsFeedbackReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateGoodsFeedbackReportArgs
          let result = ReportsApiService.GenerateGoodsFeedbackReport ctx serviceArgs
          return! (match result with
                      | GenerateGoodsFeedbackReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateGoodsMovementReport
    /// <summary>
    /// Отчет по движению товаров
    /// </summary>

    let GenerateGoodsMovementReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateGoodsMovementReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateGoodsMovementReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateGoodsMovementReportArgs
          let result = ReportsApiService.GenerateGoodsMovementReport ctx serviceArgs
          return! (match result with
                      | GenerateGoodsMovementReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateGoodsMovementReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateGoodsMovementReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateGoodsMovementReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateGoodsMovementReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateGoodsMovementReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateGoodsRealizationReport
    /// <summary>
    /// Отчет по реализации
    /// </summary>

    let GenerateGoodsRealizationReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateGoodsRealizationReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateGoodsRealizationReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateGoodsRealizationReportArgs
          let result = ReportsApiService.GenerateGoodsRealizationReport ctx serviceArgs
          return! (match result with
                      | GenerateGoodsRealizationReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateGoodsTurnoverReport
    /// <summary>
    /// Отчет по оборачиваемости
    /// </summary>

    let GenerateGoodsTurnoverReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateGoodsTurnoverReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateGoodsTurnoverReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateGoodsTurnoverReportArgs
          let result = ReportsApiService.GenerateGoodsTurnoverReport ctx serviceArgs
          return! (match result with
                      | GenerateGoodsTurnoverReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateGoodsTurnoverReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateGoodsTurnoverReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateGoodsTurnoverReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateGoodsTurnoverReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateGoodsTurnoverReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateMassOrderLabelsReport
    /// <summary>
    /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    /// </summary>

    let GenerateMassOrderLabelsReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateMassOrderLabelsReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateMassOrderLabelsReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateMassOrderLabelsReportArgs
          let result = ReportsApiService.GenerateMassOrderLabelsReport ctx serviceArgs
          return! (match result with
                      | GenerateMassOrderLabelsReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GeneratePricesReport
    /// <summary>
    /// Отчет «Цены на рынке»
    /// </summary>

    let GeneratePricesReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GeneratePricesReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GeneratePricesReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GeneratePricesReportArgs
          let result = ReportsApiService.GeneratePricesReport ctx serviceArgs
          return! (match result with
                      | GeneratePricesReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GeneratePricesReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GeneratePricesReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GeneratePricesReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GeneratePricesReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GeneratePricesReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateShelfsStatisticsReport
    /// <summary>
    /// Отчет по полкам
    /// </summary>

    let GenerateShelfsStatisticsReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateShelfsStatisticsReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateShelfsStatisticsReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateShelfsStatisticsReportArgs
          let result = ReportsApiService.GenerateShelfsStatisticsReport ctx serviceArgs
          return! (match result with
                      | GenerateShelfsStatisticsReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateShipmentListDocumentReport
    /// <summary>
    /// Получение листа сборки
    /// </summary>

    let GenerateShipmentListDocumentReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GenerateShipmentListDocumentReportBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : GenerateShipmentListDocumentReportArgs
          let result = ReportsApiService.GenerateShipmentListDocumentReport ctx serviceArgs
          return! (match result with
                      | GenerateShipmentListDocumentReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateShipmentListDocumentReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateShipmentListDocumentReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateShipmentListDocumentReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateShipmentListDocumentReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateShipmentListDocumentReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateShowsSalesReport
    /// <summary>
    /// Отчет «Аналитика продаж»
    /// </summary>

    let GenerateShowsSalesReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateShowsSalesReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateShowsSalesReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateShowsSalesReportArgs
          let result = ReportsApiService.GenerateShowsSalesReport ctx serviceArgs
          return! (match result with
                      | GenerateShowsSalesReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateStocksOnWarehousesReport
    /// <summary>
    /// Отчет по остаткам на складах
    /// </summary>

    let GenerateStocksOnWarehousesReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateStocksOnWarehousesReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateStocksOnWarehousesReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateStocksOnWarehousesReportArgs
          let result = ReportsApiService.GenerateStocksOnWarehousesReport ctx serviceArgs
          return! (match result with
                      | GenerateStocksOnWarehousesReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateUnitedMarketplaceServicesReport
    /// <summary>
    /// Отчет по стоимости услуг
    /// </summary>

    let GenerateUnitedMarketplaceServicesReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateUnitedMarketplaceServicesReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateUnitedMarketplaceServicesReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateUnitedMarketplaceServicesReportArgs
          let result = ReportsApiService.GenerateUnitedMarketplaceServicesReport ctx serviceArgs
          return! (match result with
                      | GenerateUnitedMarketplaceServicesReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateUnitedNettingReport
    /// <summary>
    /// Отчет по платежам
    /// </summary>

    let GenerateUnitedNettingReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateUnitedNettingReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateUnitedNettingReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateUnitedNettingReportArgs
          let result = ReportsApiService.GenerateUnitedNettingReport ctx serviceArgs
          return! (match result with
                      | GenerateUnitedNettingReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateUnitedOrdersReport
    /// <summary>
    /// Отчет по заказам
    /// </summary>

    let GenerateUnitedOrdersReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateUnitedOrdersReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateUnitedOrdersReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateUnitedOrdersReportArgs
          let result = ReportsApiService.GenerateUnitedOrdersReport ctx serviceArgs
          return! (match result with
                      | GenerateUnitedOrdersReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReportInfo
    /// <summary>
    /// Получение заданного отчета
    /// </summary>

    let GetReportInfo (pathParams:GetReportInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetReportInfoArgs
          let result = ReportsApiService.GetReportInfo ctx serviceArgs
          return! (match result with
                      | GetReportInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetReportInfoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReportInfoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReportInfoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReportInfoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReportInfoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReportInfoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

