namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType
open ympa_fsharp_functions_server.Model.ModelDTO

module GetModelsResponse =

  //#region GetModelsResponse

  [<CLIMutable>]
  type GetModelsResponse = {
    [<JsonProperty(PropertyName = "models")>]
    Models : ModelDTO[];
    [<JsonProperty(PropertyName = "currency")>]
    Currency : CurrencyType;
    [<JsonProperty(PropertyName = "regionId")>]
    RegionId : int64;
  }

  //#endregion
