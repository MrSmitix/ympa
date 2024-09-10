namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ParameterValueDTO =

  //#region ParameterValueDTO

  [<CLIMutable>]
  type ParameterValueDTO = {
    [<JsonProperty(PropertyName = "parameterId")>]
    ParameterId : int64;
    [<JsonProperty(PropertyName = "unitId")>]
    UnitId : int64;
    [<JsonProperty(PropertyName = "valueId")>]
    ValueId : int64;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
