namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedbackAuthorDTO
open ympa_fsharp_functions_server.Model.FeedbackCommentDTO
open ympa_fsharp_functions_server.Model.FeedbackGradesDTO
open ympa_fsharp_functions_server.Model.FeedbackOrderDTO
open ympa_fsharp_functions_server.Model.FeedbackShopDTO
open ympa_fsharp_functions_server.Model.FeedbackStateType

module FeedbackDTO =

  //#region FeedbackDTO

  [<CLIMutable>]
  type FeedbackDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "createdAt")>]
    CreatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "state")>]
    State : FeedbackStateType;
    [<JsonProperty(PropertyName = "author")>]
    Author : FeedbackAuthorDTO;
    [<JsonProperty(PropertyName = "pro")>]
    Pro : string;
    [<JsonProperty(PropertyName = "contra")>]
    Contra : string;
    [<JsonProperty(PropertyName = "comments")>]
    Comments : FeedbackCommentDTO[];
    [<JsonProperty(PropertyName = "shop")>]
    Shop : FeedbackShopDTO;
    [<JsonProperty(PropertyName = "resolved")>]
    Resolved : bool;
    [<JsonProperty(PropertyName = "verified")>]
    Verified : bool;
    [<JsonProperty(PropertyName = "recommend")>]
    Recommend : bool;
    [<JsonProperty(PropertyName = "grades")>]
    Grades : FeedbackGradesDTO;
    [<JsonProperty(PropertyName = "order")>]
    Order : FeedbackOrderDTO;
  }

  //#endregion
