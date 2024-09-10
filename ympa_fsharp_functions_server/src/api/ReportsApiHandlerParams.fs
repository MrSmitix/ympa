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
open System.Collections.Generic
open System

module ReportsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type GenerateBoostConsolidatedReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateBoostConsolidatedReportBodyParams = GenerateBoostConsolidatedRequest
    //#endregion


    type GenerateBoostConsolidatedReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateBoostConsolidatedReportResult = GenerateBoostConsolidatedReportStatusCode200 of GenerateBoostConsolidatedReportStatusCode200Response|GenerateBoostConsolidatedReportStatusCode400 of GenerateBoostConsolidatedReportStatusCode400Response|GenerateBoostConsolidatedReportStatusCode401 of GenerateBoostConsolidatedReportStatusCode401Response|GenerateBoostConsolidatedReportStatusCode403 of GenerateBoostConsolidatedReportStatusCode403Response|GenerateBoostConsolidatedReportStatusCode420 of GenerateBoostConsolidatedReportStatusCode420Response|GenerateBoostConsolidatedReportStatusCode500 of GenerateBoostConsolidatedReportStatusCode500Response

    type GenerateBoostConsolidatedReportArgs = {
      queryParams:Result<GenerateBoostConsolidatedReportQueryParams,string>;
      bodyParams:GenerateBoostConsolidatedReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateCompetitorsPositionReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateCompetitorsPositionReportBodyParams = GenerateCompetitorsPositionReportRequest
    //#endregion


    type GenerateCompetitorsPositionReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateCompetitorsPositionReportResult = GenerateCompetitorsPositionReportStatusCode200 of GenerateCompetitorsPositionReportStatusCode200Response|GenerateCompetitorsPositionReportStatusCode400 of GenerateCompetitorsPositionReportStatusCode400Response|GenerateCompetitorsPositionReportStatusCode401 of GenerateCompetitorsPositionReportStatusCode401Response|GenerateCompetitorsPositionReportStatusCode403 of GenerateCompetitorsPositionReportStatusCode403Response|GenerateCompetitorsPositionReportStatusCode420 of GenerateCompetitorsPositionReportStatusCode420Response|GenerateCompetitorsPositionReportStatusCode500 of GenerateCompetitorsPositionReportStatusCode500Response

    type GenerateCompetitorsPositionReportArgs = {
      queryParams:Result<GenerateCompetitorsPositionReportQueryParams,string>;
      bodyParams:GenerateCompetitorsPositionReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateGoodsFeedbackReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateGoodsFeedbackReportBodyParams = GenerateGoodsFeedbackRequest
    //#endregion


    type GenerateGoodsFeedbackReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateGoodsFeedbackReportResult = GenerateGoodsFeedbackReportStatusCode200 of GenerateGoodsFeedbackReportStatusCode200Response|GenerateGoodsFeedbackReportStatusCode400 of GenerateGoodsFeedbackReportStatusCode400Response|GenerateGoodsFeedbackReportStatusCode401 of GenerateGoodsFeedbackReportStatusCode401Response|GenerateGoodsFeedbackReportStatusCode403 of GenerateGoodsFeedbackReportStatusCode403Response|GenerateGoodsFeedbackReportStatusCode420 of GenerateGoodsFeedbackReportStatusCode420Response|GenerateGoodsFeedbackReportStatusCode500 of GenerateGoodsFeedbackReportStatusCode500Response

    type GenerateGoodsFeedbackReportArgs = {
      queryParams:Result<GenerateGoodsFeedbackReportQueryParams,string>;
      bodyParams:GenerateGoodsFeedbackReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateGoodsMovementReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateGoodsMovementReportBodyParams = GenerateGoodsMovementReportRequest
    //#endregion


    type GenerateGoodsMovementReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateGoodsMovementReportResult = GenerateGoodsMovementReportStatusCode200 of GenerateGoodsMovementReportStatusCode200Response|GenerateGoodsMovementReportStatusCode400 of GenerateGoodsMovementReportStatusCode400Response|GenerateGoodsMovementReportStatusCode401 of GenerateGoodsMovementReportStatusCode401Response|GenerateGoodsMovementReportStatusCode403 of GenerateGoodsMovementReportStatusCode403Response|GenerateGoodsMovementReportStatusCode420 of GenerateGoodsMovementReportStatusCode420Response|GenerateGoodsMovementReportStatusCode500 of GenerateGoodsMovementReportStatusCode500Response

    type GenerateGoodsMovementReportArgs = {
      queryParams:Result<GenerateGoodsMovementReportQueryParams,string>;
      bodyParams:GenerateGoodsMovementReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateGoodsRealizationReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateGoodsRealizationReportBodyParams = GenerateGoodsRealizationReportRequest
    //#endregion


    type GenerateGoodsRealizationReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateGoodsRealizationReportResult = GenerateGoodsRealizationReportStatusCode200 of GenerateGoodsRealizationReportStatusCode200Response|GenerateGoodsRealizationReportStatusCode400 of GenerateGoodsRealizationReportStatusCode400Response|GenerateGoodsRealizationReportStatusCode401 of GenerateGoodsRealizationReportStatusCode401Response|GenerateGoodsRealizationReportStatusCode403 of GenerateGoodsRealizationReportStatusCode403Response|GenerateGoodsRealizationReportStatusCode420 of GenerateGoodsRealizationReportStatusCode420Response|GenerateGoodsRealizationReportStatusCode500 of GenerateGoodsRealizationReportStatusCode500Response

    type GenerateGoodsRealizationReportArgs = {
      queryParams:Result<GenerateGoodsRealizationReportQueryParams,string>;
      bodyParams:GenerateGoodsRealizationReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateGoodsTurnoverReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateGoodsTurnoverReportBodyParams = GenerateGoodsTurnoverRequest
    //#endregion


    type GenerateGoodsTurnoverReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateGoodsTurnoverReportResult = GenerateGoodsTurnoverReportStatusCode200 of GenerateGoodsTurnoverReportStatusCode200Response|GenerateGoodsTurnoverReportStatusCode400 of GenerateGoodsTurnoverReportStatusCode400Response|GenerateGoodsTurnoverReportStatusCode401 of GenerateGoodsTurnoverReportStatusCode401Response|GenerateGoodsTurnoverReportStatusCode403 of GenerateGoodsTurnoverReportStatusCode403Response|GenerateGoodsTurnoverReportStatusCode420 of GenerateGoodsTurnoverReportStatusCode420Response|GenerateGoodsTurnoverReportStatusCode500 of GenerateGoodsTurnoverReportStatusCode500Response

    type GenerateGoodsTurnoverReportArgs = {
      queryParams:Result<GenerateGoodsTurnoverReportQueryParams,string>;
      bodyParams:GenerateGoodsTurnoverReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateMassOrderLabelsReportQueryParams = {
      format : PageFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateMassOrderLabelsReportBodyParams = GenerateMassOrderLabelsRequest
    //#endregion


    type GenerateMassOrderLabelsReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateMassOrderLabelsReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateMassOrderLabelsReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateMassOrderLabelsReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateMassOrderLabelsReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateMassOrderLabelsReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateMassOrderLabelsReportResult = GenerateMassOrderLabelsReportStatusCode200 of GenerateMassOrderLabelsReportStatusCode200Response|GenerateMassOrderLabelsReportStatusCode400 of GenerateMassOrderLabelsReportStatusCode400Response|GenerateMassOrderLabelsReportStatusCode401 of GenerateMassOrderLabelsReportStatusCode401Response|GenerateMassOrderLabelsReportStatusCode403 of GenerateMassOrderLabelsReportStatusCode403Response|GenerateMassOrderLabelsReportStatusCode420 of GenerateMassOrderLabelsReportStatusCode420Response|GenerateMassOrderLabelsReportStatusCode500 of GenerateMassOrderLabelsReportStatusCode500Response

    type GenerateMassOrderLabelsReportArgs = {
      queryParams:Result<GenerateMassOrderLabelsReportQueryParams,string>;
      bodyParams:GenerateMassOrderLabelsReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GeneratePricesReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GeneratePricesReportBodyParams = GeneratePricesReportRequest
    //#endregion


    type GeneratePricesReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GeneratePricesReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GeneratePricesReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GeneratePricesReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GeneratePricesReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GeneratePricesReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GeneratePricesReportResult = GeneratePricesReportStatusCode200 of GeneratePricesReportStatusCode200Response|GeneratePricesReportStatusCode400 of GeneratePricesReportStatusCode400Response|GeneratePricesReportStatusCode401 of GeneratePricesReportStatusCode401Response|GeneratePricesReportStatusCode403 of GeneratePricesReportStatusCode403Response|GeneratePricesReportStatusCode420 of GeneratePricesReportStatusCode420Response|GeneratePricesReportStatusCode500 of GeneratePricesReportStatusCode500Response

    type GeneratePricesReportArgs = {
      queryParams:Result<GeneratePricesReportQueryParams,string>;
      bodyParams:GeneratePricesReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateShelfsStatisticsReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateShelfsStatisticsReportBodyParams = GenerateShelfsStatisticsRequest
    //#endregion


    type GenerateShelfsStatisticsReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateShelfsStatisticsReportResult = GenerateShelfsStatisticsReportStatusCode200 of GenerateShelfsStatisticsReportStatusCode200Response|GenerateShelfsStatisticsReportStatusCode400 of GenerateShelfsStatisticsReportStatusCode400Response|GenerateShelfsStatisticsReportStatusCode401 of GenerateShelfsStatisticsReportStatusCode401Response|GenerateShelfsStatisticsReportStatusCode403 of GenerateShelfsStatisticsReportStatusCode403Response|GenerateShelfsStatisticsReportStatusCode420 of GenerateShelfsStatisticsReportStatusCode420Response|GenerateShelfsStatisticsReportStatusCode500 of GenerateShelfsStatisticsReportStatusCode500Response

    type GenerateShelfsStatisticsReportArgs = {
      queryParams:Result<GenerateShelfsStatisticsReportQueryParams,string>;
      bodyParams:GenerateShelfsStatisticsReportBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type GenerateShipmentListDocumentReportBodyParams = GenerateShipmentListDocumentReportRequest
    //#endregion


    type GenerateShipmentListDocumentReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateShipmentListDocumentReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateShipmentListDocumentReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateShipmentListDocumentReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateShipmentListDocumentReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateShipmentListDocumentReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateShipmentListDocumentReportResult = GenerateShipmentListDocumentReportStatusCode200 of GenerateShipmentListDocumentReportStatusCode200Response|GenerateShipmentListDocumentReportStatusCode400 of GenerateShipmentListDocumentReportStatusCode400Response|GenerateShipmentListDocumentReportStatusCode401 of GenerateShipmentListDocumentReportStatusCode401Response|GenerateShipmentListDocumentReportStatusCode403 of GenerateShipmentListDocumentReportStatusCode403Response|GenerateShipmentListDocumentReportStatusCode420 of GenerateShipmentListDocumentReportStatusCode420Response|GenerateShipmentListDocumentReportStatusCode500 of GenerateShipmentListDocumentReportStatusCode500Response

    type GenerateShipmentListDocumentReportArgs = {
      bodyParams:GenerateShipmentListDocumentReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateShowsSalesReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateShowsSalesReportBodyParams = GenerateShowsSalesReportRequest
    //#endregion


    type GenerateShowsSalesReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateShowsSalesReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateShowsSalesReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateShowsSalesReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateShowsSalesReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateShowsSalesReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateShowsSalesReportResult = GenerateShowsSalesReportStatusCode200 of GenerateShowsSalesReportStatusCode200Response|GenerateShowsSalesReportStatusCode400 of GenerateShowsSalesReportStatusCode400Response|GenerateShowsSalesReportStatusCode401 of GenerateShowsSalesReportStatusCode401Response|GenerateShowsSalesReportStatusCode403 of GenerateShowsSalesReportStatusCode403Response|GenerateShowsSalesReportStatusCode420 of GenerateShowsSalesReportStatusCode420Response|GenerateShowsSalesReportStatusCode500 of GenerateShowsSalesReportStatusCode500Response

    type GenerateShowsSalesReportArgs = {
      queryParams:Result<GenerateShowsSalesReportQueryParams,string>;
      bodyParams:GenerateShowsSalesReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateStocksOnWarehousesReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateStocksOnWarehousesReportBodyParams = GenerateStocksOnWarehousesReportRequest
    //#endregion


    type GenerateStocksOnWarehousesReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateStocksOnWarehousesReportResult = GenerateStocksOnWarehousesReportStatusCode200 of GenerateStocksOnWarehousesReportStatusCode200Response|GenerateStocksOnWarehousesReportStatusCode400 of GenerateStocksOnWarehousesReportStatusCode400Response|GenerateStocksOnWarehousesReportStatusCode401 of GenerateStocksOnWarehousesReportStatusCode401Response|GenerateStocksOnWarehousesReportStatusCode403 of GenerateStocksOnWarehousesReportStatusCode403Response|GenerateStocksOnWarehousesReportStatusCode420 of GenerateStocksOnWarehousesReportStatusCode420Response|GenerateStocksOnWarehousesReportStatusCode500 of GenerateStocksOnWarehousesReportStatusCode500Response

    type GenerateStocksOnWarehousesReportArgs = {
      queryParams:Result<GenerateStocksOnWarehousesReportQueryParams,string>;
      bodyParams:GenerateStocksOnWarehousesReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateUnitedMarketplaceServicesReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateUnitedMarketplaceServicesReportBodyParams = GenerateUnitedMarketplaceServicesReportRequest
    //#endregion


    type GenerateUnitedMarketplaceServicesReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateUnitedMarketplaceServicesReportResult = GenerateUnitedMarketplaceServicesReportStatusCode200 of GenerateUnitedMarketplaceServicesReportStatusCode200Response|GenerateUnitedMarketplaceServicesReportStatusCode400 of GenerateUnitedMarketplaceServicesReportStatusCode400Response|GenerateUnitedMarketplaceServicesReportStatusCode401 of GenerateUnitedMarketplaceServicesReportStatusCode401Response|GenerateUnitedMarketplaceServicesReportStatusCode403 of GenerateUnitedMarketplaceServicesReportStatusCode403Response|GenerateUnitedMarketplaceServicesReportStatusCode420 of GenerateUnitedMarketplaceServicesReportStatusCode420Response|GenerateUnitedMarketplaceServicesReportStatusCode500 of GenerateUnitedMarketplaceServicesReportStatusCode500Response

    type GenerateUnitedMarketplaceServicesReportArgs = {
      queryParams:Result<GenerateUnitedMarketplaceServicesReportQueryParams,string>;
      bodyParams:GenerateUnitedMarketplaceServicesReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateUnitedNettingReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateUnitedNettingReportBodyParams = GenerateUnitedNettingReportRequest
    //#endregion


    type GenerateUnitedNettingReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateUnitedNettingReportResult = GenerateUnitedNettingReportStatusCode200 of GenerateUnitedNettingReportStatusCode200Response|GenerateUnitedNettingReportStatusCode400 of GenerateUnitedNettingReportStatusCode400Response|GenerateUnitedNettingReportStatusCode401 of GenerateUnitedNettingReportStatusCode401Response|GenerateUnitedNettingReportStatusCode403 of GenerateUnitedNettingReportStatusCode403Response|GenerateUnitedNettingReportStatusCode420 of GenerateUnitedNettingReportStatusCode420Response|GenerateUnitedNettingReportStatusCode500 of GenerateUnitedNettingReportStatusCode500Response

    type GenerateUnitedNettingReportArgs = {
      queryParams:Result<GenerateUnitedNettingReportQueryParams,string>;
      bodyParams:GenerateUnitedNettingReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateUnitedOrdersReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateUnitedOrdersReportBodyParams = GenerateUnitedOrdersRequest
    //#endregion


    type GenerateUnitedOrdersReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateUnitedOrdersReportResult = GenerateUnitedOrdersReportStatusCode200 of GenerateUnitedOrdersReportStatusCode200Response|GenerateUnitedOrdersReportStatusCode400 of GenerateUnitedOrdersReportStatusCode400Response|GenerateUnitedOrdersReportStatusCode401 of GenerateUnitedOrdersReportStatusCode401Response|GenerateUnitedOrdersReportStatusCode403 of GenerateUnitedOrdersReportStatusCode403Response|GenerateUnitedOrdersReportStatusCode420 of GenerateUnitedOrdersReportStatusCode420Response|GenerateUnitedOrdersReportStatusCode500 of GenerateUnitedOrdersReportStatusCode500Response

    type GenerateUnitedOrdersReportArgs = {
      queryParams:Result<GenerateUnitedOrdersReportQueryParams,string>;
      bodyParams:GenerateUnitedOrdersReportBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetReportInfoPathParams = {
      reportId : string ;
    }
    //#endregion


    type GetReportInfoStatusCode200Response = {
      content:GetReportInfoResponse;
      
    }

    type GetReportInfoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReportInfoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReportInfoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReportInfoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReportInfoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReportInfoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReportInfoResult = GetReportInfoStatusCode200 of GetReportInfoStatusCode200Response|GetReportInfoStatusCode400 of GetReportInfoStatusCode400Response|GetReportInfoStatusCode401 of GetReportInfoStatusCode401Response|GetReportInfoStatusCode403 of GetReportInfoStatusCode403Response|GetReportInfoStatusCode404 of GetReportInfoStatusCode404Response|GetReportInfoStatusCode420 of GetReportInfoStatusCode420Response|GetReportInfoStatusCode500 of GetReportInfoStatusCode500Response

    type GetReportInfoArgs = {
      pathParams:GetReportInfoPathParams;
    }
