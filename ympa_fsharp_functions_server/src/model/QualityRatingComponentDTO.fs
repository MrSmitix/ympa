namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.QualityRatingComponentType

module QualityRatingComponentDTO =

  //#region QualityRatingComponentDTO

  [<CLIMutable>]
  type QualityRatingComponentDTO = {
    [<JsonProperty(PropertyName = "value")>]
    Value : double;
    [<JsonProperty(PropertyName = "componentType")>]
    ComponentType : QualityRatingComponentType;
  }

  //#endregion
