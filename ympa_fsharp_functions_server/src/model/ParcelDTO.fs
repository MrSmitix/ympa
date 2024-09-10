namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ParcelBoxDTO

module ParcelDTO =

  //#region ParcelDTO

  [<CLIMutable>]
  type ParcelDTO = {
    [<JsonProperty(PropertyName = "boxes")>]
    Boxes : ParcelBoxDTO[];
  }

  //#endregion
