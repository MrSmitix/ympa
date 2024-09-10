namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenerateUnitedOrdersRequest =

  //#region GenerateUnitedOrdersRequest

  [<CLIMutable>]
  type GenerateUnitedOrdersRequest = {
    [<JsonProperty(PropertyName = "businessId")>]
    BusinessId : int64;
    [<JsonProperty(PropertyName = "dateFrom")>]
    DateFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTo")>]
    DateTo : DateTime;
    [<JsonProperty(PropertyName = "campaignIds")>]
    CampaignIds : int64[];
    [<JsonProperty(PropertyName = "promoId")>]
    PromoId : string;
  }

  //#endregion
