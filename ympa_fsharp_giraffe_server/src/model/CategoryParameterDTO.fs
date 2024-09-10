namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.CategoryParameterUnitDTO
open ympa_fsharp_giraffe_server.Model.OfferCardRecommendationType
open ympa_fsharp_giraffe_server.Model.ParameterType
open ympa_fsharp_giraffe_server.Model.ParameterValueConstraintsDTO
open ympa_fsharp_giraffe_server.Model.ParameterValueOptionDTO
open ympa_fsharp_giraffe_server.Model.ValueRestrictionDTO

module CategoryParameterDTO =

  //#region CategoryParameterDTO


  type CategoryParameterDTO = {
    Id : int64;
    Name : string;
    Type : ParameterType;
    Unit : CategoryParameterUnitDTO;
    Description : string;
    RecommendationTypes : OfferCardRecommendationType[];
    Required : bool;
    Filtering : bool;
    Distinctive : bool;
    Multivalue : bool;
    AllowCustomValues : bool;
    Values : ParameterValueOptionDTO[];
    Constraints : ParameterValueConstraintsDTO;
    ValueRestrictions : ValueRestrictionDTO[];
  }
  //#endregion
