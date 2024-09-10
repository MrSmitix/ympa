namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderStatusChangeDeliveryDatesDTO

module OrderStatusChangeDeliveryDTO =

  //#region OrderStatusChangeDeliveryDTO


  type OrderStatusChangeDeliveryDTO = {
    Dates : OrderStatusChangeDeliveryDatesDTO;
  }
  //#endregion
