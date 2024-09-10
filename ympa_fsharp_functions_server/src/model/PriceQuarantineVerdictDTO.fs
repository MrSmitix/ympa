namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PriceQuarantineVerdictParameterDTO
open ympa_fsharp_functions_server.Model.PriceQuarantineVerdictType

module PriceQuarantineVerdictDTO =

  //#region PriceQuarantineVerdictDTO

  [<CLIMutable>]
  type PriceQuarantineVerdictDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : PriceQuarantineVerdictType;
    [<JsonProperty(PropertyName = "params")>]
    Params : PriceQuarantineVerdictParameterDTO[];
  }

  //#endregion
