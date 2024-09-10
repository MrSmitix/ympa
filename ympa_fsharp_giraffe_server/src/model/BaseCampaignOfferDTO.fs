namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.QuantumDTO

module BaseCampaignOfferDTO =

  //#region BaseCampaignOfferDTO


  type BaseCampaignOfferDTO = {
    OfferId : string;
    Quantum : QuantumDTO;
    Available : bool;
  }
  //#endregion
