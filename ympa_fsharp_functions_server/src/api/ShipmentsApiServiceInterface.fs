namespace ympa_fsharp_functions_server
open ShipmentsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ShipmentsApiServiceInterface =

    //#region Service interface
    type IShipmentsApiService =
      abstract member ConfirmShipment : ConfirmShipmentBodyParams -> ConfirmShipmentResult
      abstract member DownloadShipmentAct : unit -> DownloadShipmentActResult
      abstract member DownloadShipmentDiscrepancyAct : unit -> DownloadShipmentDiscrepancyActResult
      abstract member DownloadShipmentInboundAct : unit -> DownloadShipmentInboundActResult
      abstract member DownloadShipmentPalletLabels : unit -> DownloadShipmentPalletLabelsResult
      abstract member DownloadShipmentReceptionTransferAct : unit -> DownloadShipmentReceptionTransferActResult
      abstract member DownloadShipmentTransportationWaybill : unit -> DownloadShipmentTransportationWaybillResult
      abstract member GetShipment : unit -> GetShipmentResult
      abstract member GetShipmentOrdersInfo : unit -> GetShipmentOrdersInfoResult
      abstract member SearchShipments : SearchShipmentsBodyParams -> SearchShipmentsResult
      abstract member SetShipmentPalletsCount : SetShipmentPalletsCountBodyParams -> SetShipmentPalletsCountResult
      abstract member TransferOrdersFromShipment : TransferOrdersFromShipmentBodyParams -> TransferOrdersFromShipmentResult
    //#endregion