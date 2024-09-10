namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.QuantumDTO

module UpdateCampaignOfferDTO =

  //#region UpdateCampaignOfferDTO


  type UpdateCampaignOfferDTO = {
    OfferId : string;
    Quantum : QuantumDTO;
    Available : bool;
    Vat : int;
  }
  //#endregion
