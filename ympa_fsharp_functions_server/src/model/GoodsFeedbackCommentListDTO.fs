namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.GoodsFeedbackCommentDTO

module GoodsFeedbackCommentListDTO =

  //#region GoodsFeedbackCommentListDTO

  [<CLIMutable>]
  type GoodsFeedbackCommentListDTO = {
    [<JsonProperty(PropertyName = "comments")>]
    Comments : GoodsFeedbackCommentDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
