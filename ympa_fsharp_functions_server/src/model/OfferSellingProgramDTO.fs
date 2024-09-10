namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferSellingProgramStatusType
open ympa_fsharp_functions_server.Model.SellingProgramType

module OfferSellingProgramDTO =

  //#region OfferSellingProgramDTO

  [<CLIMutable>]
  type OfferSellingProgramDTO = {
    [<JsonProperty(PropertyName = "sellingProgram")>]
    SellingProgram : SellingProgramType;
    [<JsonProperty(PropertyName = "status")>]
    Status : OfferSellingProgramStatusType;
  }

  //#endregion
