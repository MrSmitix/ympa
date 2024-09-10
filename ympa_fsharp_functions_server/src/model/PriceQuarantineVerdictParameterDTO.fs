namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PriceQuarantineVerdictParamNameType

module PriceQuarantineVerdictParameterDTO =

  //#region PriceQuarantineVerdictParameterDTO

  [<CLIMutable>]
  type PriceQuarantineVerdictParameterDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : PriceQuarantineVerdictParamNameType;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
