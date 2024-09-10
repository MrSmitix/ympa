namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.TariffParameterDTO
open ympa_fsharp_functions_server.Model.TariffType

module TariffDTO =

  //#region TariffDTO

  [<CLIMutable>]
  type TariffDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : TariffType;
    [<JsonProperty(PropertyName = "percent")>]
    Percent : decimal;
    [<JsonProperty(PropertyName = "amount")>]
    Amount : decimal;
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : TariffParameterDTO[];
  }

  //#endregion
