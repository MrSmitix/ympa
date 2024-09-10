namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ReturnDecisionReasonType
open ympa_fsharp_giraffe_server.Model.ReturnDecisionSubreasonType
open ympa_fsharp_giraffe_server.Model.ReturnDecisionType

module ReturnDecisionDTO =

  //#region ReturnDecisionDTO


  type ReturnDecisionDTO = {
    ReturnItemId : int64;
    Count : int;
    Comment : string;
    ReasonType : ReturnDecisionReasonType;
    SubreasonType : ReturnDecisionSubreasonType;
    DecisionType : ReturnDecisionType;
    RefundAmount : int64;
    PartnerCompensation : int64;
    Images : string[];
  }
  //#endregion
