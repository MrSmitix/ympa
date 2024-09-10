namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdatePriceWithDiscountDTO

module UpdateBusinessOfferPriceDTO =

  //#region UpdateBusinessOfferPriceDTO


  type UpdateBusinessOfferPriceDTO = {
    OfferId : string;
    Price : UpdatePriceWithDiscountDTO;
  }
  //#endregion
