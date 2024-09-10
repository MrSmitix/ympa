namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BasePriceDTO

module PriceCompetitivenessThresholdsDTO =

  //#region PriceCompetitivenessThresholdsDTO

  [<CLIMutable>]
  type PriceCompetitivenessThresholdsDTO = {
    [<JsonProperty(PropertyName = "optimalPrice")>]
    OptimalPrice : BasePriceDTO;
    [<JsonProperty(PropertyName = "averagePrice")>]
    AveragePrice : BasePriceDTO;
  }

  //#endregion
