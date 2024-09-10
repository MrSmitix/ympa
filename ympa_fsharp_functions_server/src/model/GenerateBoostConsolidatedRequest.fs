namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateBoostConsolidatedRequest =

  //#region GenerateBoostConsolidatedRequest

  [<CLIMutable>]
  type GenerateBoostConsolidatedRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
  }

  //#endregion
