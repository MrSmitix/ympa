namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CategoryErrorDTO
open ympa_fsharp_functions_server.Model.MaxSaleQuantumDTO

module GetCategoriesMaxSaleQuantumDTO =

  //#region GetCategoriesMaxSaleQuantumDTO

  [<CLIMutable>]
  type GetCategoriesMaxSaleQuantumDTO = {
    [<JsonProperty(PropertyName = "results")>]
    Results : MaxSaleQuantumDTO[];
    [<JsonProperty(PropertyName = "errors")>]
    Errors : CategoryErrorDTO[];
  }

  //#endregion
