namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDeliveryDateDTO =

  //#region OrderDeliveryDateDTO

  [<CLIMutable>]
  type OrderDeliveryDateDTO = {
    [<JsonProperty(PropertyName = "toDate")>]
    ToDate : DateTime;
  }

  //#endregion
