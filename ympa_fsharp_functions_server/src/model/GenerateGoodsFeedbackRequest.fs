namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateGoodsFeedbackRequest =

  //#region GenerateGoodsFeedbackRequest

  [<CLIMutable>]
  type GenerateGoodsFeedbackRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
  }

  //#endregion
