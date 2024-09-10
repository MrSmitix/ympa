namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.GetPromoOfferDTO

module GetPromoOffersResultDTO =

  //#region GetPromoOffersResultDTO

  [<CLIMutable>]
  type GetPromoOffersResultDTO = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : GetPromoOfferDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
