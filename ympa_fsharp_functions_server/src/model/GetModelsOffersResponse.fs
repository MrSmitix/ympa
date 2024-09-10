namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType
open ympa_fsharp_functions_server.Model.EnrichedModelDTO

module GetModelsOffersResponse =

  //#region GetModelsOffersResponse

  [<CLIMutable>]
  type GetModelsOffersResponse = {
    [<JsonProperty(PropertyName = "models")>]
    Models : EnrichedModelDTO[];
    [<JsonProperty(PropertyName = "currency")>]
    Currency : CurrencyType;
    [<JsonProperty(PropertyName = "regionId")>]
    RegionId : int64;
  }

  //#endregion
