namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OfferConditionQualityType
open ympa_fsharp_functions_server.Model.OfferConditionType

module OfferConditionDTO =

  //#region OfferConditionDTO

  [<CLIMutable>]
  type OfferConditionDTO = {
    [<JsonProperty(PropertyName = "type")>]
    Type : OfferConditionType;
    [<JsonProperty(PropertyName = "quality")>]
    Quality : OfferConditionQualityType;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : string;
  }

  //#endregion
