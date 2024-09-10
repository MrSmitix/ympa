namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GoodsFeedbackDescriptionDTO =

  //#region GoodsFeedbackDescriptionDTO


  type GoodsFeedbackDescriptionDTO = {
    Advantages : string;
    Disadvantages : string;
    Comment : string;
  }
  //#endregion
