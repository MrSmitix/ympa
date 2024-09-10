namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CurrencyType
open ympa_fsharp_functions_server.Model.FlippingPagerDTO
open ympa_fsharp_functions_server.Model.ModelDTO

module SearchModelsResponse =

  //#region SearchModelsResponse

  [<CLIMutable>]
  type SearchModelsResponse = {
    [<JsonProperty(PropertyName = "models")>]
    Models : ModelDTO[];
    [<JsonProperty(PropertyName = "currency")>]
    Currency : CurrencyType;
    [<JsonProperty(PropertyName = "regionId")>]
    RegionId : int64;
    [<JsonProperty(PropertyName = "pager")>]
    Pager : FlippingPagerDTO;
  }

  //#endregion
