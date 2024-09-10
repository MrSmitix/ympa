namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OptionValuesLimitedDTO

module ValueRestrictionDTO =

  //#region ValueRestrictionDTO

  [<CLIMutable>]
  type ValueRestrictionDTO = {
    [<JsonProperty(PropertyName = "limitingParameterId")>]
    LimitingParameterId : int64;
    [<JsonProperty(PropertyName = "limitedValues")>]
    LimitedValues : OptionValuesLimitedDTO[];
  }

  //#endregion
