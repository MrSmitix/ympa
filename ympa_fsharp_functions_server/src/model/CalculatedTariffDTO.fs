namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CalculatedTariffType
open ympa_fsharp_functions_server.Model.TariffParameterDTO

module CalculatedTariffDTO =

  //#region CalculatedTariffDTO

  [<CLIMutable>]
  type CalculatedTariffDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : CalculatedTariffType;
    [<JsonProperty(PropertyName = "amount")>]
    Amount : decimal;
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : TariffParameterDTO[];
  }

  //#endregion
