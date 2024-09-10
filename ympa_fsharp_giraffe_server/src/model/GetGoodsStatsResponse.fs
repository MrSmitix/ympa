namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.GoodsStatsDTO

module GetGoodsStatsResponse =

  //#region GetGoodsStatsResponse


  type GetGoodsStatsResponse = {
    Status : ApiResponseStatusType;
    Result : GoodsStatsDTO;
  }
  //#endregion
