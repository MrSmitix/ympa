namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CategoryErrorType

module CategoryErrorDTO =

  //#region CategoryErrorDTO

  [<CLIMutable>]
  type CategoryErrorDTO = {
    [<JsonProperty(PropertyName = "categoryId")>]
    CategoryId : int64;
    [<JsonProperty(PropertyName = "type")>]
    Type : CategoryErrorType;
  }

  //#endregion
