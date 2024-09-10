namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GoodsFeedbackStatisticsDTO =

  //#region GoodsFeedbackStatisticsDTO

  [<CLIMutable>]
  type GoodsFeedbackStatisticsDTO = {
    [<JsonProperty(PropertyName = "rating")>]
    Rating : int;
    [<JsonProperty(PropertyName = "commentsCount")>]
    CommentsCount : int64;
    [<JsonProperty(PropertyName = "recommended")>]
    Recommended : bool;
    [<JsonProperty(PropertyName = "paidAmount")>]
    PaidAmount : int64;
  }

  //#endregion
