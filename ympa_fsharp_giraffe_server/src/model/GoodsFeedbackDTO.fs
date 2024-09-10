namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackDescriptionDTO
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackIdentifiersDTO
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackMediaDTO
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackStatisticsDTO

module GoodsFeedbackDTO =

  //#region GoodsFeedbackDTO


  type GoodsFeedbackDTO = {
    FeedbackId : int64;
    CreatedAt : DateTime;
    NeedReaction : bool;
    Identifiers : GoodsFeedbackIdentifiersDTO;
    Author : string;
    Description : GoodsFeedbackDescriptionDTO;
    Media : GoodsFeedbackMediaDTO;
    Statistics : GoodsFeedbackStatisticsDTO;
  }
  //#endregion
