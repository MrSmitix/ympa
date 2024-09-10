namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ApiResponseStatusType
open ympa_fsharp_giraffe_server.Model.OrdersStatsDTO

module GetOrdersStatsResponse =

  //#region GetOrdersStatsResponse


  type GetOrdersStatsResponse = {
    Status : ApiResponseStatusType;
    Result : OrdersStatsDTO;
  }
  //#endregion
