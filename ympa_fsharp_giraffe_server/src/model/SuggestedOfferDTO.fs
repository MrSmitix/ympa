namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.BasePriceDTO

module SuggestedOfferDTO =

  //#region SuggestedOfferDTO


  type SuggestedOfferDTO = {
    OfferId : string;
    Name : string;
    Category : string;
    Vendor : string;
    Barcodes : string[];
    Description : string;
    VendorCode : string;
    BasicPrice : BasePriceDTO;
  }
  //#endregion
