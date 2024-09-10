namespace ympa_fsharp_giraffe_server
open ReportsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ReportsApiServiceInterface =

    //#region Service interface
    type IReportsApiService =
      abstract member GenerateBoostConsolidatedReport:HttpContext -> GenerateBoostConsolidatedReportArgs->GenerateBoostConsolidatedReportResult
      abstract member GenerateCompetitorsPositionReport:HttpContext -> GenerateCompetitorsPositionReportArgs->GenerateCompetitorsPositionReportResult
      abstract member GenerateGoodsFeedbackReport:HttpContext -> GenerateGoodsFeedbackReportArgs->GenerateGoodsFeedbackReportResult
      abstract member GenerateGoodsMovementReport:HttpContext -> GenerateGoodsMovementReportArgs->GenerateGoodsMovementReportResult
      abstract member GenerateGoodsRealizationReport:HttpContext -> GenerateGoodsRealizationReportArgs->GenerateGoodsRealizationReportResult
      abstract member GenerateGoodsTurnoverReport:HttpContext -> GenerateGoodsTurnoverReportArgs->GenerateGoodsTurnoverReportResult
      abstract member GenerateMassOrderLabelsReport:HttpContext -> GenerateMassOrderLabelsReportArgs->GenerateMassOrderLabelsReportResult
      abstract member GeneratePricesReport:HttpContext -> GeneratePricesReportArgs->GeneratePricesReportResult
      abstract member GenerateShelfsStatisticsReport:HttpContext -> GenerateShelfsStatisticsReportArgs->GenerateShelfsStatisticsReportResult
      abstract member GenerateShipmentListDocumentReport:HttpContext -> GenerateShipmentListDocumentReportArgs->GenerateShipmentListDocumentReportResult
      abstract member GenerateShowsSalesReport:HttpContext -> GenerateShowsSalesReportArgs->GenerateShowsSalesReportResult
      abstract member GenerateStocksOnWarehousesReport:HttpContext -> GenerateStocksOnWarehousesReportArgs->GenerateStocksOnWarehousesReportResult
      abstract member GenerateUnitedMarketplaceServicesReport:HttpContext -> GenerateUnitedMarketplaceServicesReportArgs->GenerateUnitedMarketplaceServicesReportResult
      abstract member GenerateUnitedNettingReport:HttpContext -> GenerateUnitedNettingReportArgs->GenerateUnitedNettingReportResult
      abstract member GenerateUnitedOrdersReport:HttpContext -> GenerateUnitedOrdersReportArgs->GenerateUnitedOrdersReportResult
      abstract member GetReportInfo:HttpContext -> GetReportInfoArgs->GetReportInfoResult
    //#endregion