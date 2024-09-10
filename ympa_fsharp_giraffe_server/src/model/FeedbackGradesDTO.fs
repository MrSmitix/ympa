namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FeedbackFactorDTO

module FeedbackGradesDTO =

  //#region FeedbackGradesDTO


  type FeedbackGradesDTO = {
    Average : decimal;
    AgreeCount : int64;
    RejectCount : int64;
    Factors : FeedbackFactorDTO[];
  }
  //#endregion
