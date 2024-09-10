namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ParameterValueOptionDTO =

  //#region ParameterValueOptionDTO

  [<CLIMutable>]
  type ParameterValueOptionDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }

  //#endregion
