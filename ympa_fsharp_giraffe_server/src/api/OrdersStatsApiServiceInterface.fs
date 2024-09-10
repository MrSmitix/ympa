namespace ympa_fsharp_giraffe_server
open OrdersStatsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OrdersStatsApiServiceInterface =

    //#region Service interface
    type IOrdersStatsApiService =
      abstract member GetOrdersStats:HttpContext -> GetOrdersStatsArgs->GetOrdersStatsResult
    //#endregion