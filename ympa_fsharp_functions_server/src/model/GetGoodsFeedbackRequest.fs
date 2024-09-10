namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedbackReactionStatusType
open ympa_fsharp_functions_server.Model.Set

module GetGoodsFeedbackRequest =

  //#region GetGoodsFeedbackRequest

  [<CLIMutable>]
  type GetGoodsFeedbackRequest = {
    [<JsonProperty(PropertyName = "dateTimeFrom")>]
    DateTimeFrom : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "dateTimeTo")>]
    DateTimeTo : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "reactionStatus")>]
    ReactionStatus : FeedbackReactionStatusType;
    [<JsonProperty(PropertyName = "ratingValues")>]
    RatingValues : int[];
    [<JsonProperty(PropertyName = "modelIds")>]
    ModelIds : int64[];
    [<JsonProperty(PropertyName = "paid")>]
    Paid : bool;
  }

  //#endregion
