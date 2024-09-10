namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ShipmentsApiHandlerParams
open ShipmentsApiServiceInterface
open ShipmentsApiServiceImplementation
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.ConfirmShipmentRequest
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetShipmentOrdersInfoResponse
open ympa_fsharp_giraffe_server.Model.GetShipmentResponse
open ympa_fsharp_giraffe_server.Model.SearchShipmentsRequest
open ympa_fsharp_giraffe_server.Model.SearchShipmentsResponse
open ympa_fsharp_giraffe_server.Model.SetShipmentPalletsCountRequest
open ympa_fsharp_giraffe_server.Model.ShipmentPalletLabelPageFormatType
open ympa_fsharp_giraffe_server.Model.TransferOrdersFromShipmentRequest

module ShipmentsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ConfirmShipment
    /// <summary>
    /// Подтверждение отгрузки
    /// </summary>

    let ConfirmShipment (pathParams:ConfirmShipmentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ConfirmShipmentBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ConfirmShipmentArgs
          let result = ShipmentsApiService.ConfirmShipment ctx serviceArgs
          return! (match result with
                      | ConfirmShipmentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConfirmShipmentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConfirmShipmentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConfirmShipmentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConfirmShipmentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConfirmShipmentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | ConfirmShipmentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DownloadShipmentAct
    /// <summary>
    /// Получение акта приема-передачи
    /// </summary>

    let DownloadShipmentAct (pathParams:DownloadShipmentActPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DownloadShipmentActArgs
          let result = ShipmentsApiService.DownloadShipmentAct ctx serviceArgs
          return! (match result with
                      | DownloadShipmentActStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | DownloadShipmentActStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DownloadShipmentActStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DownloadShipmentActStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DownloadShipmentActStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DownloadShipmentActStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DownloadShipmentActStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DownloadShipmentDiscrepancyAct
    /// <summary>
    /// Получение акта расхождений
    /// </summary>

    let DownloadShipmentDiscrepancyAct (pathParams:DownloadShipmentDiscrepancyActPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DownloadShipmentDiscrepancyActArgs
          let result = ShipmentsApiService.DownloadShipmentDiscrepancyAct ctx serviceArgs
          return! (match result with
                      | DownloadShipmentDiscrepancyActStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | DownloadShipmentDiscrepancyActStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DownloadShipmentDiscrepancyActStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DownloadShipmentDiscrepancyActStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DownloadShipmentDiscrepancyActStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DownloadShipmentDiscrepancyActStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DownloadShipmentDiscrepancyActStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DownloadShipmentInboundAct
    /// <summary>
    /// Получение фактического акта приема-передачи
    /// </summary>

    let DownloadShipmentInboundAct (pathParams:DownloadShipmentInboundActPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DownloadShipmentInboundActArgs
          let result = ShipmentsApiService.DownloadShipmentInboundAct ctx serviceArgs
          return! (match result with
                      | DownloadShipmentInboundActStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | DownloadShipmentInboundActStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DownloadShipmentInboundActStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DownloadShipmentInboundActStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DownloadShipmentInboundActStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DownloadShipmentInboundActStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DownloadShipmentInboundActStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DownloadShipmentPalletLabels
    /// <summary>
    /// Ярлыки для доверительной приемки (FBS)
    /// </summary>

    let DownloadShipmentPalletLabels (pathParams:DownloadShipmentPalletLabelsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<DownloadShipmentPalletLabelsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : DownloadShipmentPalletLabelsArgs
          let result = ShipmentsApiService.DownloadShipmentPalletLabels ctx serviceArgs
          return! (match result with
                      | DownloadShipmentPalletLabelsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | DownloadShipmentPalletLabelsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DownloadShipmentPalletLabelsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DownloadShipmentPalletLabelsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DownloadShipmentPalletLabelsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DownloadShipmentPalletLabelsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DownloadShipmentPalletLabelsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DownloadShipmentReceptionTransferAct
    /// <summary>
    /// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    /// </summary>

    let DownloadShipmentReceptionTransferAct (pathParams:DownloadShipmentReceptionTransferActPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<DownloadShipmentReceptionTransferActQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : DownloadShipmentReceptionTransferActArgs
          let result = ShipmentsApiService.DownloadShipmentReceptionTransferAct ctx serviceArgs
          return! (match result with
                      | DownloadShipmentReceptionTransferActStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | DownloadShipmentReceptionTransferActStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DownloadShipmentReceptionTransferActStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DownloadShipmentReceptionTransferActStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DownloadShipmentReceptionTransferActStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DownloadShipmentReceptionTransferActStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DownloadShipmentReceptionTransferActStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DownloadShipmentTransportationWaybill
    /// <summary>
    /// Получение транспортной накладной
    /// </summary>

    let DownloadShipmentTransportationWaybill (pathParams:DownloadShipmentTransportationWaybillPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DownloadShipmentTransportationWaybillArgs
          let result = ShipmentsApiService.DownloadShipmentTransportationWaybill ctx serviceArgs
          return! (match result with
                      | DownloadShipmentTransportationWaybillStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | DownloadShipmentTransportationWaybillStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DownloadShipmentTransportationWaybillStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DownloadShipmentTransportationWaybillStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DownloadShipmentTransportationWaybillStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DownloadShipmentTransportationWaybillStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DownloadShipmentTransportationWaybillStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetShipment
    /// <summary>
    /// Получение информации об одной отгрузке
    /// </summary>

    let GetShipment (pathParams:GetShipmentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetShipmentQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetShipmentArgs
          let result = ShipmentsApiService.GetShipment ctx serviceArgs
          return! (match result with
                      | GetShipmentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetShipmentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetShipmentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetShipmentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetShipmentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetShipmentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetShipmentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetShipmentOrdersInfo
    /// <summary>
    /// Получение информации о возможности печати ярлыков (FBS)
    /// </summary>

    let GetShipmentOrdersInfo (pathParams:GetShipmentOrdersInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetShipmentOrdersInfoArgs
          let result = ShipmentsApiService.GetShipmentOrdersInfo ctx serviceArgs
          return! (match result with
                      | GetShipmentOrdersInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetShipmentOrdersInfoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetShipmentOrdersInfoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetShipmentOrdersInfoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetShipmentOrdersInfoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetShipmentOrdersInfoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetShipmentOrdersInfoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchShipments
    /// <summary>
    /// Получение информации о нескольких отгрузках
    /// </summary>

    let SearchShipments (pathParams:SearchShipmentsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchShipmentsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<SearchShipmentsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : SearchShipmentsArgs
          let result = ShipmentsApiService.SearchShipments ctx serviceArgs
          return! (match result with
                      | SearchShipmentsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchShipmentsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SearchShipmentsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SearchShipmentsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SearchShipmentsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SearchShipmentsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SearchShipmentsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetShipmentPalletsCount
    /// <summary>
    /// Передача количества упаковок в отгрузке
    /// </summary>

    let SetShipmentPalletsCount (pathParams:SetShipmentPalletsCountPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetShipmentPalletsCountBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetShipmentPalletsCountArgs
          let result = ShipmentsApiService.SetShipmentPalletsCount ctx serviceArgs
          return! (match result with
                      | SetShipmentPalletsCountStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetShipmentPalletsCountStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetShipmentPalletsCountStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetShipmentPalletsCountStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetShipmentPalletsCountStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetShipmentPalletsCountStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetShipmentPalletsCountStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TransferOrdersFromShipment
    /// <summary>
    /// Перенос заказов в следующую отгрузку
    /// </summary>

    let TransferOrdersFromShipment (pathParams:TransferOrdersFromShipmentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<TransferOrdersFromShipmentBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : TransferOrdersFromShipmentArgs
          let result = ShipmentsApiService.TransferOrdersFromShipment ctx serviceArgs
          return! (match result with
                      | TransferOrdersFromShipmentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TransferOrdersFromShipmentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TransferOrdersFromShipmentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | TransferOrdersFromShipmentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | TransferOrdersFromShipmentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | TransferOrdersFromShipmentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | TransferOrdersFromShipmentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

