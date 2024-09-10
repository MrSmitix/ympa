namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.CategoryErrorDTO
open ympa_fsharp_functions_server.Model.MaxSaleQuantumDTO

module GetCategoriesMaxSaleQuantumResponse =

  //#region GetCategoriesMaxSaleQuantumResponse

  [<CLIMutable>]
  type GetCategoriesMaxSaleQuantumResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "results")>]
    Results : MaxSaleQuantumDTO[];
    [<JsonProperty(PropertyName = "errors")>]
    Errors : CategoryErrorDTO[];
  }

  //#endregion
