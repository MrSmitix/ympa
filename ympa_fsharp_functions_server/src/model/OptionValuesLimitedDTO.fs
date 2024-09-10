namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OptionValuesLimitedDTO =

  //#region OptionValuesLimitedDTO

  [<CLIMutable>]
  type OptionValuesLimitedDTO = {
    [<JsonProperty(PropertyName = "limitingOptionValueId")>]
    LimitingOptionValueId : int64;
    [<JsonProperty(PropertyName = "optionValueIds")>]
    OptionValueIds : int64[];
  }

  //#endregion
