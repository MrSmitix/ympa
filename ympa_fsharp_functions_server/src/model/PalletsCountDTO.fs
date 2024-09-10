namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PalletsCountDTO =

  //#region PalletsCountDTO

  [<CLIMutable>]
  type PalletsCountDTO = {
    [<JsonProperty(PropertyName = "planned")>]
    Planned : int;
    [<JsonProperty(PropertyName = "fact")>]
    Fact : int;
  }

  //#endregion
