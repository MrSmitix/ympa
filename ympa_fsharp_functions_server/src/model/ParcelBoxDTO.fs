namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ParcelBoxDTO =

  //#region ParcelBoxDTO

  [<CLIMutable>]
  type ParcelBoxDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "fulfilmentId")>]
    FulfilmentId : string;
  }

  //#endregion
