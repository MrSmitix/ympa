namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedbackReactionStatusType
open ympa_fsharp_giraffe_server.Model.Set

module GetGoodsFeedbackRequest =

  //#region GetGoodsFeedbackRequest


  type GetGoodsFeedbackRequest = {
    DateTimeFrom : Nullable<DateTime>;
    DateTimeTo : Nullable<DateTime>;
    ReactionStatus : FeedbackReactionStatusType;
    RatingValues : int[];
    ModelIds : int64[];
    Paid : bool;
  }
  //#endregion
