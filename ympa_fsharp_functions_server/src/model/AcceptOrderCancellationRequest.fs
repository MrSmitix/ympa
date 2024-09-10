namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderCancellationReasonType

module AcceptOrderCancellationRequest =

  //#region AcceptOrderCancellationRequest

  [<CLIMutable>]
  type AcceptOrderCancellationRequest = {
    [<JsonProperty(PropertyName = "accepted")>]
    Accepted : bool;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : OrderCancellationReasonType;
  }

  //#endregion
