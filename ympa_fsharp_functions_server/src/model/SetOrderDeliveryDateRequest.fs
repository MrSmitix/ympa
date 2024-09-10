namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderDeliveryDateDTO
open ympa_fsharp_functions_server.Model.OrderDeliveryDateReasonType

module SetOrderDeliveryDateRequest =

  //#region SetOrderDeliveryDateRequest

  [<CLIMutable>]
  type SetOrderDeliveryDateRequest = {
    [<JsonProperty(PropertyName = "dates")>]
    Dates : OrderDeliveryDateDTO;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : OrderDeliveryDateReasonType;
  }

  //#endregion
