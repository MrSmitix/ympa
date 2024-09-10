namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdateMappingDTO
open ympa_fsharp_giraffe_server.Model.UpdateOfferDTO

module UpdateOfferMappingDTO =

  //#region UpdateOfferMappingDTO


  type UpdateOfferMappingDTO = {
    Offer : UpdateOfferDTO;
    Mapping : UpdateMappingDTO;
  }
  //#endregion
