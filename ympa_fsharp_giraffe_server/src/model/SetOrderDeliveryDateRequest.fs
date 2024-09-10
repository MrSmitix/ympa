namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDateDTO
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDateReasonType

module SetOrderDeliveryDateRequest =

  //#region SetOrderDeliveryDateRequest


  type SetOrderDeliveryDateRequest = {
    Dates : OrderDeliveryDateDTO;
    Reason : OrderDeliveryDateReasonType;
  }
  //#endregion
