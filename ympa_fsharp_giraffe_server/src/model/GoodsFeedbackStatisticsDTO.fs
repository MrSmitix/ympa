namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GoodsFeedbackStatisticsDTO =

  //#region GoodsFeedbackStatisticsDTO


  type GoodsFeedbackStatisticsDTO = {
    Rating : int;
    CommentsCount : int64;
    Recommended : bool;
    PaidAmount : int64;
  }
  //#endregion
