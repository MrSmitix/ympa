namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.AffectedOrderQualityRatingComponentType

module QualityRatingAffectedOrderDTO =

  //#region QualityRatingAffectedOrderDTO

  [<CLIMutable>]
  type QualityRatingAffectedOrderDTO = {
    [<JsonProperty(PropertyName = "orderId")>]
    OrderId : int64;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "componentType")>]
    ComponentType : AffectedOrderQualityRatingComponentType;
  }

  //#endregion
