namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingDTO

module UpdateOfferMappingsRequest =

  //#region UpdateOfferMappingsRequest


  type UpdateOfferMappingsRequest = {
    OfferMappings : UpdateOfferMappingDTO[];
    OnlyPartnerMediaContent : bool;
  }
  //#endregion
