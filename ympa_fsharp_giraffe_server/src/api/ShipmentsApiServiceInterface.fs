namespace ympa_fsharp_giraffe_server
open ShipmentsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ShipmentsApiServiceInterface =

    //#region Service interface
    type IShipmentsApiService =
      abstract member ConfirmShipment:HttpContext -> ConfirmShipmentArgs->ConfirmShipmentResult
      abstract member DownloadShipmentAct:HttpContext -> DownloadShipmentActArgs->DownloadShipmentActResult
      abstract member DownloadShipmentDiscrepancyAct:HttpContext -> DownloadShipmentDiscrepancyActArgs->DownloadShipmentDiscrepancyActResult
      abstract member DownloadShipmentInboundAct:HttpContext -> DownloadShipmentInboundActArgs->DownloadShipmentInboundActResult
      abstract member DownloadShipmentPalletLabels:HttpContext -> DownloadShipmentPalletLabelsArgs->DownloadShipmentPalletLabelsResult
      abstract member DownloadShipmentReceptionTransferAct:HttpContext -> DownloadShipmentReceptionTransferActArgs->DownloadShipmentReceptionTransferActResult
      abstract member DownloadShipmentTransportationWaybill:HttpContext -> DownloadShipmentTransportationWaybillArgs->DownloadShipmentTransportationWaybillResult
      abstract member GetShipment:HttpContext -> GetShipmentArgs->GetShipmentResult
      abstract member GetShipmentOrdersInfo:HttpContext -> GetShipmentOrdersInfoArgs->GetShipmentOrdersInfoResult
      abstract member SearchShipments:HttpContext -> SearchShipmentsArgs->SearchShipmentsResult
      abstract member SetShipmentPalletsCount:HttpContext -> SetShipmentPalletsCountArgs->SetShipmentPalletsCountResult
      abstract member TransferOrdersFromShipment:HttpContext -> TransferOrdersFromShipmentArgs->TransferOrdersFromShipmentResult
    //#endregion