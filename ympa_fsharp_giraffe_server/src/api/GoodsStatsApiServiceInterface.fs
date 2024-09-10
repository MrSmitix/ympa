namespace ympa_fsharp_giraffe_server
open GoodsStatsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module GoodsStatsApiServiceInterface =

    //#region Service interface
    type IGoodsStatsApiService =
      abstract member GetGoodsStats:HttpContext -> GetGoodsStatsArgs->GetGoodsStatsResult
    //#endregion