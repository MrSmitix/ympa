namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OfferWeightDimensionsDTO =

  //#region OfferWeightDimensionsDTO

  [<CLIMutable>]
  type OfferWeightDimensionsDTO = {
    [<JsonProperty(PropertyName = "length")>]
    Length : decimal;
    [<JsonProperty(PropertyName = "width")>]
    Width : decimal;
    [<JsonProperty(PropertyName = "height")>]
    Height : decimal;
    [<JsonProperty(PropertyName = "weight")>]
    Weight : decimal;
  }

  //#endregion
