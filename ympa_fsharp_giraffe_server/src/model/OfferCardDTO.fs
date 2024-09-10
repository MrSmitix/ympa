namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GetMappingDTO
open ympa_fsharp_giraffe_server.Model.OfferCardRecommendationDTO
open ympa_fsharp_giraffe_server.Model.OfferCardStatusType
open ympa_fsharp_giraffe_server.Model.OfferErrorDTO
open ympa_fsharp_giraffe_server.Model.ParameterValueDTO

module OfferCardDTO =

  //#region OfferCardDTO


  type OfferCardDTO = {
    OfferId : string;
    Mapping : GetMappingDTO;
    ParameterValues : ParameterValueDTO[];
    CardStatus : OfferCardStatusType;
    ContentRating : int;
    Recommendations : OfferCardRecommendationDTO[];
    Errors : OfferErrorDTO[];
    Warnings : OfferErrorDTO[];
  }
  //#endregion
