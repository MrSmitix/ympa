namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.ConfirmShipmentRequest
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetShipmentOrdersInfoResponse
open ympa_fsharp_functions_server.Model.GetShipmentResponse
open ympa_fsharp_functions_server.Model.SearchShipmentsRequest
open ympa_fsharp_functions_server.Model.SearchShipmentsResponse
open ympa_fsharp_functions_server.Model.SetShipmentPalletsCountRequest
open ympa_fsharp_functions_server.Model.ShipmentPalletLabelPageFormatType
open ympa_fsharp_functions_server.Model.TransferOrdersFromShipmentRequest
open System.Collections.Generic
open System

module ShipmentsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ConfirmShipmentPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ConfirmShipmentBodyParams = ConfirmShipmentRequest
    //#endregion


    type ConfirmShipmentStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type ConfirmShipmentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type ConfirmShipmentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type ConfirmShipmentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type ConfirmShipmentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type ConfirmShipmentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type ConfirmShipmentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type ConfirmShipmentResult = ConfirmShipmentStatusCode200 of ConfirmShipmentStatusCode200Response|ConfirmShipmentStatusCode400 of ConfirmShipmentStatusCode400Response|ConfirmShipmentStatusCode401 of ConfirmShipmentStatusCode401Response|ConfirmShipmentStatusCode403 of ConfirmShipmentStatusCode403Response|ConfirmShipmentStatusCode404 of ConfirmShipmentStatusCode404Response|ConfirmShipmentStatusCode420 of ConfirmShipmentStatusCode420Response|ConfirmShipmentStatusCode500 of ConfirmShipmentStatusCode500Response

    type ConfirmShipmentArgs = {
      pathParams:ConfirmShipmentPathParams;
      bodyParams:ConfirmShipmentBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DownloadShipmentActPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion


    type DownloadShipmentActStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type DownloadShipmentActStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DownloadShipmentActStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DownloadShipmentActStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DownloadShipmentActStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DownloadShipmentActStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DownloadShipmentActStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DownloadShipmentActResult = DownloadShipmentActStatusCode200 of DownloadShipmentActStatusCode200Response|DownloadShipmentActStatusCode400 of DownloadShipmentActStatusCode400Response|DownloadShipmentActStatusCode401 of DownloadShipmentActStatusCode401Response|DownloadShipmentActStatusCode403 of DownloadShipmentActStatusCode403Response|DownloadShipmentActStatusCode404 of DownloadShipmentActStatusCode404Response|DownloadShipmentActStatusCode420 of DownloadShipmentActStatusCode420Response|DownloadShipmentActStatusCode500 of DownloadShipmentActStatusCode500Response

    type DownloadShipmentActArgs = {
      pathParams:DownloadShipmentActPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DownloadShipmentDiscrepancyActPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion


    type DownloadShipmentDiscrepancyActStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type DownloadShipmentDiscrepancyActStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DownloadShipmentDiscrepancyActStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DownloadShipmentDiscrepancyActStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DownloadShipmentDiscrepancyActStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DownloadShipmentDiscrepancyActStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DownloadShipmentDiscrepancyActStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DownloadShipmentDiscrepancyActResult = DownloadShipmentDiscrepancyActStatusCode200 of DownloadShipmentDiscrepancyActStatusCode200Response|DownloadShipmentDiscrepancyActStatusCode400 of DownloadShipmentDiscrepancyActStatusCode400Response|DownloadShipmentDiscrepancyActStatusCode401 of DownloadShipmentDiscrepancyActStatusCode401Response|DownloadShipmentDiscrepancyActStatusCode403 of DownloadShipmentDiscrepancyActStatusCode403Response|DownloadShipmentDiscrepancyActStatusCode404 of DownloadShipmentDiscrepancyActStatusCode404Response|DownloadShipmentDiscrepancyActStatusCode420 of DownloadShipmentDiscrepancyActStatusCode420Response|DownloadShipmentDiscrepancyActStatusCode500 of DownloadShipmentDiscrepancyActStatusCode500Response

    type DownloadShipmentDiscrepancyActArgs = {
      pathParams:DownloadShipmentDiscrepancyActPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DownloadShipmentInboundActPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion


    type DownloadShipmentInboundActStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type DownloadShipmentInboundActStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DownloadShipmentInboundActStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DownloadShipmentInboundActStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DownloadShipmentInboundActStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DownloadShipmentInboundActStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DownloadShipmentInboundActStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DownloadShipmentInboundActResult = DownloadShipmentInboundActStatusCode200 of DownloadShipmentInboundActStatusCode200Response|DownloadShipmentInboundActStatusCode400 of DownloadShipmentInboundActStatusCode400Response|DownloadShipmentInboundActStatusCode401 of DownloadShipmentInboundActStatusCode401Response|DownloadShipmentInboundActStatusCode403 of DownloadShipmentInboundActStatusCode403Response|DownloadShipmentInboundActStatusCode404 of DownloadShipmentInboundActStatusCode404Response|DownloadShipmentInboundActStatusCode420 of DownloadShipmentInboundActStatusCode420Response|DownloadShipmentInboundActStatusCode500 of DownloadShipmentInboundActStatusCode500Response

    type DownloadShipmentInboundActArgs = {
      pathParams:DownloadShipmentInboundActPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DownloadShipmentPalletLabelsPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type DownloadShipmentPalletLabelsQueryParams = {
      format : ShipmentPalletLabelPageFormatType option;

    }
    //#endregion


    type DownloadShipmentPalletLabelsStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type DownloadShipmentPalletLabelsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DownloadShipmentPalletLabelsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DownloadShipmentPalletLabelsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DownloadShipmentPalletLabelsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DownloadShipmentPalletLabelsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DownloadShipmentPalletLabelsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DownloadShipmentPalletLabelsResult = DownloadShipmentPalletLabelsStatusCode200 of DownloadShipmentPalletLabelsStatusCode200Response|DownloadShipmentPalletLabelsStatusCode400 of DownloadShipmentPalletLabelsStatusCode400Response|DownloadShipmentPalletLabelsStatusCode401 of DownloadShipmentPalletLabelsStatusCode401Response|DownloadShipmentPalletLabelsStatusCode403 of DownloadShipmentPalletLabelsStatusCode403Response|DownloadShipmentPalletLabelsStatusCode404 of DownloadShipmentPalletLabelsStatusCode404Response|DownloadShipmentPalletLabelsStatusCode420 of DownloadShipmentPalletLabelsStatusCode420Response|DownloadShipmentPalletLabelsStatusCode500 of DownloadShipmentPalletLabelsStatusCode500Response

    type DownloadShipmentPalletLabelsArgs = {
      pathParams:DownloadShipmentPalletLabelsPathParams;
      queryParams:Result<DownloadShipmentPalletLabelsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DownloadShipmentReceptionTransferActPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type DownloadShipmentReceptionTransferActQueryParams = {
      warehouseId : int option;

    }
    //#endregion


    type DownloadShipmentReceptionTransferActStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type DownloadShipmentReceptionTransferActStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DownloadShipmentReceptionTransferActStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DownloadShipmentReceptionTransferActStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DownloadShipmentReceptionTransferActStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DownloadShipmentReceptionTransferActStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DownloadShipmentReceptionTransferActStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DownloadShipmentReceptionTransferActResult = DownloadShipmentReceptionTransferActStatusCode200 of DownloadShipmentReceptionTransferActStatusCode200Response|DownloadShipmentReceptionTransferActStatusCode400 of DownloadShipmentReceptionTransferActStatusCode400Response|DownloadShipmentReceptionTransferActStatusCode401 of DownloadShipmentReceptionTransferActStatusCode401Response|DownloadShipmentReceptionTransferActStatusCode403 of DownloadShipmentReceptionTransferActStatusCode403Response|DownloadShipmentReceptionTransferActStatusCode404 of DownloadShipmentReceptionTransferActStatusCode404Response|DownloadShipmentReceptionTransferActStatusCode420 of DownloadShipmentReceptionTransferActStatusCode420Response|DownloadShipmentReceptionTransferActStatusCode500 of DownloadShipmentReceptionTransferActStatusCode500Response

    type DownloadShipmentReceptionTransferActArgs = {
      pathParams:DownloadShipmentReceptionTransferActPathParams;
      queryParams:Result<DownloadShipmentReceptionTransferActQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DownloadShipmentTransportationWaybillPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion


    type DownloadShipmentTransportationWaybillStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type DownloadShipmentTransportationWaybillStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DownloadShipmentTransportationWaybillStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DownloadShipmentTransportationWaybillStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DownloadShipmentTransportationWaybillStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DownloadShipmentTransportationWaybillStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DownloadShipmentTransportationWaybillStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DownloadShipmentTransportationWaybillResult = DownloadShipmentTransportationWaybillStatusCode200 of DownloadShipmentTransportationWaybillStatusCode200Response|DownloadShipmentTransportationWaybillStatusCode400 of DownloadShipmentTransportationWaybillStatusCode400Response|DownloadShipmentTransportationWaybillStatusCode401 of DownloadShipmentTransportationWaybillStatusCode401Response|DownloadShipmentTransportationWaybillStatusCode403 of DownloadShipmentTransportationWaybillStatusCode403Response|DownloadShipmentTransportationWaybillStatusCode404 of DownloadShipmentTransportationWaybillStatusCode404Response|DownloadShipmentTransportationWaybillStatusCode420 of DownloadShipmentTransportationWaybillStatusCode420Response|DownloadShipmentTransportationWaybillStatusCode500 of DownloadShipmentTransportationWaybillStatusCode500Response

    type DownloadShipmentTransportationWaybillArgs = {
      pathParams:DownloadShipmentTransportationWaybillPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetShipmentPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetShipmentQueryParams = {
      cancelledOrders : bool option;

    }
    //#endregion


    type GetShipmentStatusCode200Response = {
      content:GetShipmentResponse;
      
    }

    type GetShipmentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetShipmentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetShipmentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetShipmentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetShipmentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetShipmentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetShipmentResult = GetShipmentStatusCode200 of GetShipmentStatusCode200Response|GetShipmentStatusCode400 of GetShipmentStatusCode400Response|GetShipmentStatusCode401 of GetShipmentStatusCode401Response|GetShipmentStatusCode403 of GetShipmentStatusCode403Response|GetShipmentStatusCode404 of GetShipmentStatusCode404Response|GetShipmentStatusCode420 of GetShipmentStatusCode420Response|GetShipmentStatusCode500 of GetShipmentStatusCode500Response

    type GetShipmentArgs = {
      pathParams:GetShipmentPathParams;
      queryParams:Result<GetShipmentQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetShipmentOrdersInfoPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion


    type GetShipmentOrdersInfoStatusCode200Response = {
      content:GetShipmentOrdersInfoResponse;
      
    }

    type GetShipmentOrdersInfoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetShipmentOrdersInfoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetShipmentOrdersInfoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetShipmentOrdersInfoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetShipmentOrdersInfoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetShipmentOrdersInfoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetShipmentOrdersInfoResult = GetShipmentOrdersInfoStatusCode200 of GetShipmentOrdersInfoStatusCode200Response|GetShipmentOrdersInfoStatusCode400 of GetShipmentOrdersInfoStatusCode400Response|GetShipmentOrdersInfoStatusCode401 of GetShipmentOrdersInfoStatusCode401Response|GetShipmentOrdersInfoStatusCode403 of GetShipmentOrdersInfoStatusCode403Response|GetShipmentOrdersInfoStatusCode404 of GetShipmentOrdersInfoStatusCode404Response|GetShipmentOrdersInfoStatusCode420 of GetShipmentOrdersInfoStatusCode420Response|GetShipmentOrdersInfoStatusCode500 of GetShipmentOrdersInfoStatusCode500Response

    type GetShipmentOrdersInfoArgs = {
      pathParams:GetShipmentOrdersInfoPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SearchShipmentsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SearchShipmentsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SearchShipmentsBodyParams = SearchShipmentsRequest
    //#endregion


    type SearchShipmentsStatusCode200Response = {
      content:SearchShipmentsResponse;
      
    }

    type SearchShipmentsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SearchShipmentsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SearchShipmentsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SearchShipmentsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SearchShipmentsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SearchShipmentsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SearchShipmentsResult = SearchShipmentsStatusCode200 of SearchShipmentsStatusCode200Response|SearchShipmentsStatusCode400 of SearchShipmentsStatusCode400Response|SearchShipmentsStatusCode401 of SearchShipmentsStatusCode401Response|SearchShipmentsStatusCode403 of SearchShipmentsStatusCode403Response|SearchShipmentsStatusCode404 of SearchShipmentsStatusCode404Response|SearchShipmentsStatusCode420 of SearchShipmentsStatusCode420Response|SearchShipmentsStatusCode500 of SearchShipmentsStatusCode500Response

    type SearchShipmentsArgs = {
      pathParams:SearchShipmentsPathParams;
      queryParams:Result<SearchShipmentsQueryParams,string>;
      bodyParams:SearchShipmentsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SetShipmentPalletsCountPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SetShipmentPalletsCountBodyParams = SetShipmentPalletsCountRequest
    //#endregion


    type SetShipmentPalletsCountStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SetShipmentPalletsCountStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SetShipmentPalletsCountStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SetShipmentPalletsCountStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SetShipmentPalletsCountStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SetShipmentPalletsCountStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SetShipmentPalletsCountStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SetShipmentPalletsCountResult = SetShipmentPalletsCountStatusCode200 of SetShipmentPalletsCountStatusCode200Response|SetShipmentPalletsCountStatusCode400 of SetShipmentPalletsCountStatusCode400Response|SetShipmentPalletsCountStatusCode401 of SetShipmentPalletsCountStatusCode401Response|SetShipmentPalletsCountStatusCode403 of SetShipmentPalletsCountStatusCode403Response|SetShipmentPalletsCountStatusCode404 of SetShipmentPalletsCountStatusCode404Response|SetShipmentPalletsCountStatusCode420 of SetShipmentPalletsCountStatusCode420Response|SetShipmentPalletsCountStatusCode500 of SetShipmentPalletsCountStatusCode500Response

    type SetShipmentPalletsCountArgs = {
      pathParams:SetShipmentPalletsCountPathParams;
      bodyParams:SetShipmentPalletsCountBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type TransferOrdersFromShipmentPathParams = {
      campaignId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type TransferOrdersFromShipmentBodyParams = TransferOrdersFromShipmentRequest
    //#endregion


    type TransferOrdersFromShipmentStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type TransferOrdersFromShipmentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type TransferOrdersFromShipmentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type TransferOrdersFromShipmentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type TransferOrdersFromShipmentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type TransferOrdersFromShipmentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type TransferOrdersFromShipmentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type TransferOrdersFromShipmentResult = TransferOrdersFromShipmentStatusCode200 of TransferOrdersFromShipmentStatusCode200Response|TransferOrdersFromShipmentStatusCode400 of TransferOrdersFromShipmentStatusCode400Response|TransferOrdersFromShipmentStatusCode401 of TransferOrdersFromShipmentStatusCode401Response|TransferOrdersFromShipmentStatusCode403 of TransferOrdersFromShipmentStatusCode403Response|TransferOrdersFromShipmentStatusCode404 of TransferOrdersFromShipmentStatusCode404Response|TransferOrdersFromShipmentStatusCode420 of TransferOrdersFromShipmentStatusCode420Response|TransferOrdersFromShipmentStatusCode500 of TransferOrdersFromShipmentStatusCode500Response

    type TransferOrdersFromShipmentArgs = {
      pathParams:TransferOrdersFromShipmentPathParams;
      bodyParams:TransferOrdersFromShipmentBodyParams
    }
