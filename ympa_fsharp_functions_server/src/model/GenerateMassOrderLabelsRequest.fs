namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.Set

module GenerateMassOrderLabelsRequest =

  //#region GenerateMassOrderLabelsRequest

  [<CLIMutable>]
  type GenerateMassOrderLabelsRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
    [<JsonProperty(PropertyName = "orderIds")>]
    OrderIds : int64[];
  }

  //#endregion
