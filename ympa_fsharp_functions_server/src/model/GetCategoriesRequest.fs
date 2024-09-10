namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.LanguageType

module GetCategoriesRequest =

  //#region GetCategoriesRequest

  [<CLIMutable>]
  type GetCategoriesRequest = {
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageType;
  }

  //#endregion
