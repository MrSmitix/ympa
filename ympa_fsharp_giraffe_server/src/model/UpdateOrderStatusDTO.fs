namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderStatusType
open ympa_fsharp_giraffe_server.Model.OrderSubstatusType
open ympa_fsharp_giraffe_server.Model.OrderUpdateStatusType

module UpdateOrderStatusDTO =

  //#region UpdateOrderStatusDTO


  type UpdateOrderStatusDTO = {
    Id : int64;
    Status : OrderStatusType;
    Substatus : OrderSubstatusType;
    UpdateStatus : OrderUpdateStatusType;
    ErrorDetails : string;
  }
  //#endregion
