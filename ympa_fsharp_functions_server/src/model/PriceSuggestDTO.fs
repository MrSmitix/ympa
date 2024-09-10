namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PriceSuggestType

module PriceSuggestDTO =

  //#region PriceSuggestDTO

  [<CLIMutable>]
  type PriceSuggestDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : PriceSuggestType;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
  }

  //#endregion
