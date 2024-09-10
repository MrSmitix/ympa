namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.Set

module OrdersShipmentInfoDTO =

  //#region OrdersShipmentInfoDTO


  type OrdersShipmentInfoDTO = {
    OrderIdsWithLabels : int64[];
    OrderIdsWithoutLabels : int64[];
  }
  //#endregion
