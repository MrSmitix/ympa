namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module FeedbackFactorDTO =

  //#region FeedbackFactorDTO


  type FeedbackFactorDTO = {
    Id : int64;
    Title : string;
    Description : string;
    Value : int;
  }
  //#endregion
