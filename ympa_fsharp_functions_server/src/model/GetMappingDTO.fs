namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetMappingDTO =

  //#region GetMappingDTO

  [<CLIMutable>]
  type GetMappingDTO = {
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
    [<JsonProperty(PropertyName = "marketSkuName")>]
    MarketSkuName : string;
    [<JsonProperty(PropertyName = "marketModelId")>]
    MarketModelId : int64;
    [<JsonProperty(PropertyName = "marketModelName")>]
    MarketModelName : string;
    [<JsonProperty(PropertyName = "marketCategoryId")>]
    MarketCategoryId : int64;
    [<JsonProperty(PropertyName = "marketCategoryName")>]
    MarketCategoryName : string;
  }

  //#endregion
