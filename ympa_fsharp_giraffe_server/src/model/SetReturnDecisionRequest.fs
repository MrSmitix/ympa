namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ReturnRequestDecisionType

module SetReturnDecisionRequest =

  //#region SetReturnDecisionRequest


  type SetReturnDecisionRequest = {
    ReturnItemId : int64;
    DecisionType : ReturnRequestDecisionType;
    Comment : string;
  }
  //#endregion
