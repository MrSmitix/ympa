namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderItemStatusType

module OrderItemDetailDTO =

  //#region OrderItemDetailDTO


  type OrderItemDetailDTO = {
    ItemCount : int64;
    ItemStatus : OrderItemStatusType;
    UpdateDate : string;
  }
  //#endregion
