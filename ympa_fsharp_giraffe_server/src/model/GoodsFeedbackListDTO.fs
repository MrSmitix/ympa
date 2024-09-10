namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.GoodsFeedbackDTO

module GoodsFeedbackListDTO =

  //#region GoodsFeedbackListDTO


  type GoodsFeedbackListDTO = {
    Feedbacks : GoodsFeedbackDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
