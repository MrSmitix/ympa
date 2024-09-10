namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UpdateOrderStorageLimitRequest =

  //#region UpdateOrderStorageLimitRequest

  [<CLIMutable>]
  type UpdateOrderStorageLimitRequest = {
    [<JsonProperty(PropertyName = "newDate")>]
    NewDate : DateTime;
  }

  //#endregion
