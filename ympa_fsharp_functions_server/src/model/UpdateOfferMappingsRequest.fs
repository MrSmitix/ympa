namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdateOfferMappingDTO

module UpdateOfferMappingsRequest =

  //#region UpdateOfferMappingsRequest

  [<CLIMutable>]
  type UpdateOfferMappingsRequest = {
    [<JsonProperty(PropertyName = "offerMappings")>]
    OfferMappings : UpdateOfferMappingDTO[];
    [<JsonProperty(PropertyName = "onlyPartnerMediaContent")>]
    OnlyPartnerMediaContent : bool;
  }

  //#endregion
