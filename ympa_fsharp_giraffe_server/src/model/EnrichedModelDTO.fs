namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ModelOfferDTO
open ympa_fsharp_giraffe_server.Model.ModelPriceDTO

module EnrichedModelDTO =

  //#region EnrichedModelDTO


  type EnrichedModelDTO = {
    Id : int64;
    Name : string;
    Prices : ModelPriceDTO;
    Offers : ModelOfferDTO[];
    OfflineOffers : int;
    OnlineOffers : int;
  }
  //#endregion
