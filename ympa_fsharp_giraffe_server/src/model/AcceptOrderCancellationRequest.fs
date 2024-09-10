namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderCancellationReasonType

module AcceptOrderCancellationRequest =

  //#region AcceptOrderCancellationRequest


  type AcceptOrderCancellationRequest = {
    Accepted : bool;
    Reason : OrderCancellationReasonType;
  }
  //#endregion
