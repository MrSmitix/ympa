namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.RegionDTO

module FeedbackAuthorDTO =

  //#region FeedbackAuthorDTO

  [<CLIMutable>]
  type FeedbackAuthorDTO = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "region")>]
    Region : RegionDTO;
  }

  //#endregion
