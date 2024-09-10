namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedbackFactorDTO

module FeedbackGradesDTO =

  //#region FeedbackGradesDTO

  [<CLIMutable>]
  type FeedbackGradesDTO = {
    [<JsonProperty(PropertyName = "average")>]
    Average : decimal;
    [<JsonProperty(PropertyName = "agreeCount")>]
    AgreeCount : int64;
    [<JsonProperty(PropertyName = "rejectCount")>]
    RejectCount : int64;
    [<JsonProperty(PropertyName = "factors")>]
    Factors : FeedbackFactorDTO[];
  }

  //#endregion
