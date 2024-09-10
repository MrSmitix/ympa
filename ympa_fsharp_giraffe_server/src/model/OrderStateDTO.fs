namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderStatusType
open ympa_fsharp_giraffe_server.Model.OrderSubstatusType

module OrderStateDTO =

  //#region OrderStateDTO


  type OrderStateDTO = {
    Id : int64;
    Status : OrderStatusType;
    Substatus : OrderSubstatusType;
  }
  //#endregion
