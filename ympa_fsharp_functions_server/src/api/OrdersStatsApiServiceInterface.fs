namespace ympa_fsharp_functions_server
open OrdersStatsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OrdersStatsApiServiceInterface =

    //#region Service interface
    type IOrdersStatsApiService =
      abstract member GetOrdersStats : GetOrdersStatsBodyParams -> GetOrdersStatsResult
    //#endregion