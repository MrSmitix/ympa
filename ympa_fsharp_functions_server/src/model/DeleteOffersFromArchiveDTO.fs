namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteOffersFromArchiveDTO =

  //#region DeleteOffersFromArchiveDTO

  [<CLIMutable>]
  type DeleteOffersFromArchiveDTO = {
    [<JsonProperty(PropertyName = "notUnarchivedOfferIds")>]
    NotUnarchivedOfferIds : string[];
  }

  //#endregion
