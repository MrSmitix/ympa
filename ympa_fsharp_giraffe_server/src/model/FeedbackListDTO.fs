namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedbackDTO
open ympa_fsharp_giraffe_server.Model.ScrollingPagerDTO

module FeedbackListDTO =

  //#region FeedbackListDTO


  type FeedbackListDTO = {
    Paging : ScrollingPagerDTO;
    FeedbackList : FeedbackDTO[];
  }
  //#endregion
