namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CategoryParameterDTO

module CategoryContentParametersDTO =

  //#region CategoryContentParametersDTO

  [<CLIMutable>]
  type CategoryContentParametersDTO = {
    [<JsonProperty(PropertyName = "categoryId")>]
    CategoryId : int;
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : CategoryParameterDTO[];
  }

  //#endregion
