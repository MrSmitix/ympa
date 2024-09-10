namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.QualityRatingComponentDTO

module QualityRatingDTO =

  //#region QualityRatingDTO

  [<CLIMutable>]
  type QualityRatingDTO = {
    [<JsonProperty(PropertyName = "rating")>]
    Rating : int64;
    [<JsonProperty(PropertyName = "calculationDate")>]
    CalculationDate : DateTime;
    [<JsonProperty(PropertyName = "components")>]
    Components : QualityRatingComponentDTO[];
  }

  //#endregion
