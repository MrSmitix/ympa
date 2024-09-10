namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderStatusChangeDeliveryDatesDTO

module OrderStatusChangeDeliveryDTO =

  //#region OrderStatusChangeDeliveryDTO

  [<CLIMutable>]
  type OrderStatusChangeDeliveryDTO = {
    [<JsonProperty(PropertyName = "dates")>]
    Dates : OrderStatusChangeDeliveryDatesDTO;
  }

  //#endregion
