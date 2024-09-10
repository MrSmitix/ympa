namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedbackAuthorDTO
open ympa_fsharp_giraffe_server.Model.FeedbackCommentDTO
open ympa_fsharp_giraffe_server.Model.FeedbackGradesDTO
open ympa_fsharp_giraffe_server.Model.FeedbackOrderDTO
open ympa_fsharp_giraffe_server.Model.FeedbackShopDTO
open ympa_fsharp_giraffe_server.Model.FeedbackStateType

module FeedbackDTO =

  //#region FeedbackDTO


  type FeedbackDTO = {
    Id : int64;
    CreatedAt : Nullable<DateTime>;
    Text : string;
    State : FeedbackStateType;
    Author : FeedbackAuthorDTO;
    Pro : string;
    Contra : string;
    Comments : FeedbackCommentDTO[];
    Shop : FeedbackShopDTO;
    Resolved : bool;
    Verified : bool;
    Recommend : bool;
    Grades : FeedbackGradesDTO;
    Order : FeedbackOrderDTO;
  }
  //#endregion
