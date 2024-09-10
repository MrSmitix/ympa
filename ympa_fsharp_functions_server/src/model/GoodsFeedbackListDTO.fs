namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.GoodsFeedbackDTO

module GoodsFeedbackListDTO =

  //#region GoodsFeedbackListDTO

  [<CLIMutable>]
  type GoodsFeedbackListDTO = {
    [<JsonProperty(PropertyName = "feedbacks")>]
    Feedbacks : GoodsFeedbackDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
