namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderStatusChangeDeliveryDatesDTO =

  //#region OrderStatusChangeDeliveryDatesDTO

  [<CLIMutable>]
  type OrderStatusChangeDeliveryDatesDTO = {
    [<JsonProperty(PropertyName = "realDeliveryDate")>]
    RealDeliveryDate : DateTime;
  }

  //#endregion
