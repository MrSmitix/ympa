namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ReturnDecisionReasonType
open ympa_fsharp_functions_server.Model.ReturnDecisionSubreasonType
open ympa_fsharp_functions_server.Model.ReturnDecisionType

module ReturnDecisionDTO =

  //#region ReturnDecisionDTO

  [<CLIMutable>]
  type ReturnDecisionDTO = {
    [<JsonProperty(PropertyName = "returnItemId")>]
    ReturnItemId : int64;
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "comment")>]
    Comment : string;
    [<JsonProperty(PropertyName = "reasonType")>]
    ReasonType : ReturnDecisionReasonType;
    [<JsonProperty(PropertyName = "subreasonType")>]
    SubreasonType : ReturnDecisionSubreasonType;
    [<JsonProperty(PropertyName = "decisionType")>]
    DecisionType : ReturnDecisionType;
    [<JsonProperty(PropertyName = "refundAmount")>]
    RefundAmount : int64;
    [<JsonProperty(PropertyName = "partnerCompensation")>]
    PartnerCompensation : int64;
    [<JsonProperty(PropertyName = "images")>]
    Images : string[];
  }

  //#endregion
