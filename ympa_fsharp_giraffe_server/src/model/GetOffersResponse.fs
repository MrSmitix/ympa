namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.FlippingPagerDTO
open ympa_fsharp_giraffe_server.Model.OfferDTO

module GetOffersResponse =

  //#region GetOffersResponse


  type GetOffersResponse = {
    Offers : OfferDTO[];
    Pager : FlippingPagerDTO;
  }
  //#endregion
