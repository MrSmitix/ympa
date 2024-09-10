namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.CategoryParameterUnitDTO
open ympa_fsharp_functions_server.Model.OfferCardRecommendationType
open ympa_fsharp_functions_server.Model.ParameterType
open ympa_fsharp_functions_server.Model.ParameterValueConstraintsDTO
open ympa_fsharp_functions_server.Model.ParameterValueOptionDTO
open ympa_fsharp_functions_server.Model.ValueRestrictionDTO

module CategoryParameterDTO =

  //#region CategoryParameterDTO

  [<CLIMutable>]
  type CategoryParameterDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : ParameterType;
    [<JsonProperty(PropertyName = "unit")>]
    Unit : CategoryParameterUnitDTO;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "recommendationTypes")>]
    RecommendationTypes : OfferCardRecommendationType[];
    [<JsonProperty(PropertyName = "required")>]
    Required : bool;
    [<JsonProperty(PropertyName = "filtering")>]
    Filtering : bool;
    [<JsonProperty(PropertyName = "distinctive")>]
    Distinctive : bool;
    [<JsonProperty(PropertyName = "multivalue")>]
    Multivalue : bool;
    [<JsonProperty(PropertyName = "allowCustomValues")>]
    AllowCustomValues : bool;
    [<JsonProperty(PropertyName = "values")>]
    Values : ParameterValueOptionDTO[];
    [<JsonProperty(PropertyName = "constraints")>]
    Constraints : ParameterValueConstraintsDTO;
    [<JsonProperty(PropertyName = "valueRestrictions")>]
    ValueRestrictions : ValueRestrictionDTO[];
  }

  //#endregion
