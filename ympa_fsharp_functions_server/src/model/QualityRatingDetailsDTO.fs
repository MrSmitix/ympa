namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.QualityRatingAffectedOrderDTO

module QualityRatingDetailsDTO =

  //#region QualityRatingDetailsDTO

  [<CLIMutable>]
  type QualityRatingDetailsDTO = {
    [<JsonProperty(PropertyName = "affectedOrders")>]
    AffectedOrders : QualityRatingAffectedOrderDTO[];
  }

  //#endregion
