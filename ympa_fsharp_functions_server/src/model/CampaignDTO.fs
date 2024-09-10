namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BusinessDTO
open ympa_fsharp_functions_server.Model.PlacementType

module CampaignDTO =

  //#region CampaignDTO

  [<CLIMutable>]
  type CampaignDTO = {
    [<JsonProperty(PropertyName = "domain")>]
    Domain : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "clientId")>]
    ClientId : int64;
    [<JsonProperty(PropertyName = "business")>]
    Business : BusinessDTO;
    [<JsonProperty(PropertyName = "placementType")>]
    PlacementType : PlacementType;
  }

  //#endregion
