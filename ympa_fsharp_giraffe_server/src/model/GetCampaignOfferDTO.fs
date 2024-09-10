namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GetPriceWithDiscountDTO
open ympa_fsharp_giraffe_server.Model.GetPriceWithVatDTO
open ympa_fsharp_giraffe_server.Model.OfferCampaignStatusType
open ympa_fsharp_giraffe_server.Model.OfferErrorDTO
open ympa_fsharp_giraffe_server.Model.QuantumDTO

module GetCampaignOfferDTO =

  //#region GetCampaignOfferDTO


  type GetCampaignOfferDTO = {
    OfferId : string;
    Quantum : QuantumDTO;
    Available : bool;
    BasicPrice : GetPriceWithDiscountDTO;
    CampaignPrice : GetPriceWithVatDTO;
    Status : OfferCampaignStatusType;
    Errors : OfferErrorDTO[];
    Warnings : OfferErrorDTO[];
  }
  //#endregion
