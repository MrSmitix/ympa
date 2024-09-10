namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ApiResponseStatusType
open ympa_fsharp_functions_server.Model.UpdateOfferContentResultDTO

module UpdateOfferContentResponse =

  //#region UpdateOfferContentResponse

  [<CLIMutable>]
  type UpdateOfferContentResponse = {
    [<JsonProperty(PropertyName = "status")>]
    Status : ApiResponseStatusType;
    [<JsonProperty(PropertyName = "results")>]
    Results : UpdateOfferContentResultDTO[];
  }

  //#endregion
