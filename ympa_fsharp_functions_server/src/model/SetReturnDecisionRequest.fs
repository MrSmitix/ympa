namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ReturnRequestDecisionType

module SetReturnDecisionRequest =

  //#region SetReturnDecisionRequest

  [<CLIMutable>]
  type SetReturnDecisionRequest = {
    [<JsonProperty(PropertyName = "returnItemId")>]
    ReturnItemId : int64;
    [<JsonProperty(PropertyName = "decisionType")>]
    DecisionType : ReturnRequestDecisionType;
    [<JsonProperty(PropertyName = "comment")>]
    Comment : string;
  }

  //#endregion
