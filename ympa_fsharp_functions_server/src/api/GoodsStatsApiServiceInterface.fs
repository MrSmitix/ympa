namespace ympa_fsharp_functions_server
open GoodsStatsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module GoodsStatsApiServiceInterface =

    //#region Service interface
    type IGoodsStatsApiService =
      abstract member GetGoodsStats : GetGoodsStatsBodyParams -> GetGoodsStatsResult
    //#endregion