namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.WarehouseAddressDTO

module WarehouseDTO =

  //#region WarehouseDTO

  [<CLIMutable>]
  type WarehouseDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "campaignId")>]
    CampaignId : int64;
    [<JsonProperty(PropertyName = "express")>]
    Express : bool;
    [<JsonProperty(PropertyName = "address")>]
    Address : WarehouseAddressDTO;
  }

  //#endregion
