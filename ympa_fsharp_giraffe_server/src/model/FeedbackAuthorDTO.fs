namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.RegionDTO

module FeedbackAuthorDTO =

  //#region FeedbackAuthorDTO


  type FeedbackAuthorDTO = {
    Name : string;
    Region : RegionDTO;
  }
  //#endregion
