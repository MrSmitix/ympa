namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferMappingDTO =

  //#region OfferMappingDTO

  [<CLIMutable>]
  type OfferMappingDTO = {
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
    [<JsonProperty(PropertyName = "modelId")>]
    ModelId : int64;
    [<JsonProperty(PropertyName = "categoryId")>]
    CategoryId : int64;
  }

  //#endregion
