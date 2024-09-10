namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GoodsFeedbackDescriptionDTO
open ympa_fsharp_functions_server.Model.GoodsFeedbackIdentifiersDTO
open ympa_fsharp_functions_server.Model.GoodsFeedbackMediaDTO
open ympa_fsharp_functions_server.Model.GoodsFeedbackStatisticsDTO

module GoodsFeedbackDTO =

  //#region GoodsFeedbackDTO

  [<CLIMutable>]
  type GoodsFeedbackDTO = {
    [<JsonProperty(PropertyName = "feedbackId")>]
    FeedbackId : int64;
    [<JsonProperty(PropertyName = "createdAt")>]
    CreatedAt : DateTime;
    [<JsonProperty(PropertyName = "needReaction")>]
    NeedReaction : bool;
    [<JsonProperty(PropertyName = "identifiers")>]
    Identifiers : GoodsFeedbackIdentifiersDTO;
    [<JsonProperty(PropertyName = "author")>]
    Author : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : GoodsFeedbackDescriptionDTO;
    [<JsonProperty(PropertyName = "media")>]
    Media : GoodsFeedbackMediaDTO;
    [<JsonProperty(PropertyName = "statistics")>]
    Statistics : GoodsFeedbackStatisticsDTO;
  }

  //#endregion
