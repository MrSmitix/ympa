namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderStatusChangeDeliveryDTO
open ympa_fsharp_giraffe_server.Model.OrderStatusType
open ympa_fsharp_giraffe_server.Model.OrderSubstatusType

module OrderStatusChangeDTO =

  //#region OrderStatusChangeDTO


  type OrderStatusChangeDTO = {
    Status : OrderStatusType;
    Substatus : OrderSubstatusType;
    Delivery : OrderStatusChangeDeliveryDTO;
  }
  //#endregion
