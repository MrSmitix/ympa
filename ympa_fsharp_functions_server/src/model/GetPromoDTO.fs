namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ChannelType
open ympa_fsharp_functions_server.Model.GetPromoAssortmentInfoDTO
open ympa_fsharp_functions_server.Model.GetPromoBestsellerInfoDTO
open ympa_fsharp_functions_server.Model.GetPromoConstraintsDTO
open ympa_fsharp_functions_server.Model.GetPromoMechanicsInfoDTO
open ympa_fsharp_functions_server.Model.PromoPeriodDTO

module GetPromoDTO =

  //#region GetPromoDTO

  [<CLIMutable>]
  type GetPromoDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "period")>]
    Period : PromoPeriodDTO;
    [<JsonProperty(PropertyName = "participating")>]
    Participating : bool;
    [<JsonProperty(PropertyName = "assortmentInfo")>]
    AssortmentInfo : GetPromoAssortmentInfoDTO;
    [<JsonProperty(PropertyName = "mechanicsInfo")>]
    MechanicsInfo : GetPromoMechanicsInfoDTO;
    [<JsonProperty(PropertyName = "bestsellerInfo")>]
    BestsellerInfo : GetPromoBestsellerInfoDTO;
    [<JsonProperty(PropertyName = "channels")>]
    Channels : ChannelType[];
    [<JsonProperty(PropertyName = "constraints")>]
    Constraints : GetPromoConstraintsDTO;
  }

  //#endregion
