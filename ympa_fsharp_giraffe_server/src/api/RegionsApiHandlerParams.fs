namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetRegionWithChildrenResponse
open ympa_fsharp_giraffe_server.Model.GetRegionsResponse
open System.Collections.Generic
open System

module RegionsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type SearchRegionChildrenPathParams = {
      regionId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SearchRegionChildrenQueryParams = {
      page : int option;


      pageSize : int option;

    }
    //#endregion


    type SearchRegionChildrenStatusCode200Response = {
      content:GetRegionWithChildrenResponse;
      
    }

    type SearchRegionChildrenStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SearchRegionChildrenResult = SearchRegionChildrenStatusCode200 of SearchRegionChildrenStatusCode200Response|SearchRegionChildrenStatusCode400 of SearchRegionChildrenStatusCode400Response|SearchRegionChildrenStatusCode401 of SearchRegionChildrenStatusCode401Response|SearchRegionChildrenStatusCode403 of SearchRegionChildrenStatusCode403Response|SearchRegionChildrenStatusCode404 of SearchRegionChildrenStatusCode404Response|SearchRegionChildrenStatusCode420 of SearchRegionChildrenStatusCode420Response|SearchRegionChildrenStatusCode500 of SearchRegionChildrenStatusCode500Response

    type SearchRegionChildrenArgs = {
      pathParams:SearchRegionChildrenPathParams;
      queryParams:Result<SearchRegionChildrenQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SearchRegionsByIdPathParams = {
      regionId : int64 ;
    }
    //#endregion


    type SearchRegionsByIdStatusCode200Response = {
      content:GetRegionsResponse;
      
    }

    type SearchRegionsByIdStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SearchRegionsByIdStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SearchRegionsByIdStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SearchRegionsByIdStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SearchRegionsByIdStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SearchRegionsByIdResult = SearchRegionsByIdStatusCode200 of SearchRegionsByIdStatusCode200Response|SearchRegionsByIdStatusCode401 of SearchRegionsByIdStatusCode401Response|SearchRegionsByIdStatusCode403 of SearchRegionsByIdStatusCode403Response|SearchRegionsByIdStatusCode404 of SearchRegionsByIdStatusCode404Response|SearchRegionsByIdStatusCode420 of SearchRegionsByIdStatusCode420Response|SearchRegionsByIdStatusCode500 of SearchRegionsByIdStatusCode500Response

    type SearchRegionsByIdArgs = {
      pathParams:SearchRegionsByIdPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SearchRegionsByNameQueryParams = {
      name : string ;


      pageToken : string option;


      limit : int option;

    }
    //#endregion


    type SearchRegionsByNameStatusCode200Response = {
      content:GetRegionsResponse;
      
    }

    type SearchRegionsByNameStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SearchRegionsByNameStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SearchRegionsByNameStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SearchRegionsByNameStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SearchRegionsByNameResult = SearchRegionsByNameStatusCode200 of SearchRegionsByNameStatusCode200Response|SearchRegionsByNameStatusCode401 of SearchRegionsByNameStatusCode401Response|SearchRegionsByNameStatusCode403 of SearchRegionsByNameStatusCode403Response|SearchRegionsByNameStatusCode420 of SearchRegionsByNameStatusCode420Response|SearchRegionsByNameStatusCode500 of SearchRegionsByNameStatusCode500Response

    type SearchRegionsByNameArgs = {
      queryParams:Result<SearchRegionsByNameQueryParams,string>;
    }
