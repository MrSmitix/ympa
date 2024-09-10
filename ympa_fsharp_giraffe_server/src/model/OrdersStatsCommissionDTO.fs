namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrdersStatsCommissionType

module OrdersStatsCommissionDTO =

  //#region OrdersStatsCommissionDTO


  type OrdersStatsCommissionDTO = {
    Type : OrdersStatsCommissionType;
    Actual : decimal;
  }
  //#endregion
