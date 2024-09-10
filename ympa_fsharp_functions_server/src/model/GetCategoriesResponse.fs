namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.CategoryDTO

module GetCategoriesResponse =

  //#region GetCategoriesResponse

  [<CLIMutable>]
  type GetCategoriesResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "result")>]
    Result : CategoryDTO;
  }

  //#endregion
