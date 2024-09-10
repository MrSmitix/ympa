namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ParameterValueConstraintsDTO =

  //#region ParameterValueConstraintsDTO

  [<CLIMutable>]
  type ParameterValueConstraintsDTO = {
    [<JsonProperty(PropertyName = "minValue")>]
    MinValue : double;
    [<JsonProperty(PropertyName = "maxValue")>]
    MaxValue : double;
    [<JsonProperty(PropertyName = "maxLength")>]
    MaxLength : int;
  }

  //#endregion
