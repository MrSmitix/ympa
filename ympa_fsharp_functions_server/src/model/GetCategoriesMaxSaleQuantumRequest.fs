namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set

module GetCategoriesMaxSaleQuantumRequest =

  //#region GetCategoriesMaxSaleQuantumRequest

  [<CLIMutable>]
  type GetCategoriesMaxSaleQuantumRequest = {
    [<JsonProperty(PropertyName = "marketCategoryIds")>]
    MarketCategoryIds : int64[];
  }

  //#endregion
