namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module QuantumDTO =

  //#region QuantumDTO

  [<CLIMutable>]
  type QuantumDTO = {
    [<JsonProperty(PropertyName = "minQuantity")>]
    MinQuantity : int;
    [<JsonProperty(PropertyName = "stepQuantity")>]
    StepQuantity : int;
  }

  //#endregion
