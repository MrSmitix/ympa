namespace ympa_fsharp_functions_server
open ReportsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ReportsApiServiceInterface =

    //#region Service interface
    type IReportsApiService =
      abstract member GenerateBoostConsolidatedReport : GenerateBoostConsolidatedReportBodyParams -> GenerateBoostConsolidatedReportResult
      abstract member GenerateCompetitorsPositionReport : GenerateCompetitorsPositionReportBodyParams -> GenerateCompetitorsPositionReportResult
      abstract member GenerateGoodsFeedbackReport : GenerateGoodsFeedbackReportBodyParams -> GenerateGoodsFeedbackReportResult
      abstract member GenerateGoodsMovementReport : GenerateGoodsMovementReportBodyParams -> GenerateGoodsMovementReportResult
      abstract member GenerateGoodsRealizationReport : GenerateGoodsRealizationReportBodyParams -> GenerateGoodsRealizationReportResult
      abstract member GenerateGoodsTurnoverReport : GenerateGoodsTurnoverReportBodyParams -> GenerateGoodsTurnoverReportResult
      abstract member GenerateMassOrderLabelsReport : GenerateMassOrderLabelsReportBodyParams -> GenerateMassOrderLabelsReportResult
      abstract member GeneratePricesReport : GeneratePricesReportBodyParams -> GeneratePricesReportResult
      abstract member GenerateShelfsStatisticsReport : GenerateShelfsStatisticsReportBodyParams -> GenerateShelfsStatisticsReportResult
      abstract member GenerateShipmentListDocumentReport : GenerateShipmentListDocumentReportBodyParams -> GenerateShipmentListDocumentReportResult
      abstract member GenerateShowsSalesReport : GenerateShowsSalesReportBodyParams -> GenerateShowsSalesReportResult
      abstract member GenerateStocksOnWarehousesReport : GenerateStocksOnWarehousesReportBodyParams -> GenerateStocksOnWarehousesReportResult
      abstract member GenerateUnitedMarketplaceServicesReport : GenerateUnitedMarketplaceServicesReportBodyParams -> GenerateUnitedMarketplaceServicesReportResult
      abstract member GenerateUnitedNettingReport : GenerateUnitedNettingReportBodyParams -> GenerateUnitedNettingReportResult
      abstract member GenerateUnitedOrdersReport : GenerateUnitedOrdersReportBodyParams -> GenerateUnitedOrdersReportResult
      abstract member GetReportInfo : unit -> GetReportInfoResult
    //#endregion