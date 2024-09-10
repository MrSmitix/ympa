namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.GetModelsOffersResponse
open ympa_fsharp_giraffe_server.Model.GetModelsRequest
open ympa_fsharp_giraffe_server.Model.GetModelsResponse
open ympa_fsharp_giraffe_server.Model.SearchModelsResponse
open ympa_fsharp_giraffe_server.Model.SortOrderType
open System.Collections.Generic
open System

module ModelsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetModelPathParams = {
      modelId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetModelQueryParams = {
      regionId : int64 ;


      currency : CurrencyType option;

    }
    //#endregion


    type GetModelStatusCode200Response = {
      content:GetModelsResponse;
      
    }

    type GetModelStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetModelStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetModelStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetModelStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetModelStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetModelStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetModelResult = GetModelStatusCode200 of GetModelStatusCode200Response|GetModelStatusCode400 of GetModelStatusCode400Response|GetModelStatusCode401 of GetModelStatusCode401Response|GetModelStatusCode403 of GetModelStatusCode403Response|GetModelStatusCode404 of GetModelStatusCode404Response|GetModelStatusCode420 of GetModelStatusCode420Response|GetModelStatusCode500 of GetModelStatusCode500Response

    type GetModelArgs = {
      pathParams:GetModelPathParams;
      queryParams:Result<GetModelQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetModelOffersPathParams = {
      modelId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetModelOffersQueryParams = {
      regionId : int64 ;


      currency : CurrencyType option;


      orderByPrice : SortOrderType option;


      count : int option;


      page : int option;

    }
    //#endregion


    type GetModelOffersStatusCode200Response = {
      content:GetModelsOffersResponse;
      
    }

    type GetModelOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetModelOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetModelOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetModelOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetModelOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetModelOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetModelOffersResult = GetModelOffersStatusCode200 of GetModelOffersStatusCode200Response|GetModelOffersStatusCode400 of GetModelOffersStatusCode400Response|GetModelOffersStatusCode401 of GetModelOffersStatusCode401Response|GetModelOffersStatusCode403 of GetModelOffersStatusCode403Response|GetModelOffersStatusCode404 of GetModelOffersStatusCode404Response|GetModelOffersStatusCode420 of GetModelOffersStatusCode420Response|GetModelOffersStatusCode500 of GetModelOffersStatusCode500Response

    type GetModelOffersArgs = {
      pathParams:GetModelOffersPathParams;
      queryParams:Result<GetModelOffersQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetModelsQueryParams = {
      regionId : int64 ;


      currency : CurrencyType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetModelsBodyParams = GetModelsRequest
    //#endregion


    type GetModelsStatusCode200Response = {
      content:GetModelsResponse;
      
    }

    type GetModelsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetModelsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetModelsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetModelsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetModelsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetModelsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetModelsResult = GetModelsStatusCode200 of GetModelsStatusCode200Response|GetModelsStatusCode400 of GetModelsStatusCode400Response|GetModelsStatusCode401 of GetModelsStatusCode401Response|GetModelsStatusCode403 of GetModelsStatusCode403Response|GetModelsStatusCode404 of GetModelsStatusCode404Response|GetModelsStatusCode420 of GetModelsStatusCode420Response|GetModelsStatusCode500 of GetModelsStatusCode500Response

    type GetModelsArgs = {
      queryParams:Result<GetModelsQueryParams,string>;
      bodyParams:GetModelsBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetModelsOffersQueryParams = {
      regionId : int64 ;


      currency : CurrencyType option;


      orderByPrice : SortOrderType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetModelsOffersBodyParams = GetModelsRequest
    //#endregion


    type GetModelsOffersStatusCode200Response = {
      content:GetModelsOffersResponse;
      
    }

    type GetModelsOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetModelsOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetModelsOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetModelsOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetModelsOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetModelsOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetModelsOffersResult = GetModelsOffersStatusCode200 of GetModelsOffersStatusCode200Response|GetModelsOffersStatusCode400 of GetModelsOffersStatusCode400Response|GetModelsOffersStatusCode401 of GetModelsOffersStatusCode401Response|GetModelsOffersStatusCode403 of GetModelsOffersStatusCode403Response|GetModelsOffersStatusCode404 of GetModelsOffersStatusCode404Response|GetModelsOffersStatusCode420 of GetModelsOffersStatusCode420Response|GetModelsOffersStatusCode500 of GetModelsOffersStatusCode500Response

    type GetModelsOffersArgs = {
      queryParams:Result<GetModelsOffersQueryParams,string>;
      bodyParams:GetModelsOffersBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type SearchModelsQueryParams = {
      query : string ;


      regionId : int64 ;


      currency : CurrencyType option;


      page : int option;


      pageSize : int option;

    }
    //#endregion


    type SearchModelsStatusCode200Response = {
      content:SearchModelsResponse;
      
    }

    type SearchModelsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SearchModelsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SearchModelsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SearchModelsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SearchModelsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SearchModelsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SearchModelsResult = SearchModelsStatusCode200 of SearchModelsStatusCode200Response|SearchModelsStatusCode400 of SearchModelsStatusCode400Response|SearchModelsStatusCode401 of SearchModelsStatusCode401Response|SearchModelsStatusCode403 of SearchModelsStatusCode403Response|SearchModelsStatusCode404 of SearchModelsStatusCode404Response|SearchModelsStatusCode420 of SearchModelsStatusCode420Response|SearchModelsStatusCode500 of SearchModelsStatusCode500Response

    type SearchModelsArgs = {
      queryParams:Result<SearchModelsQueryParams,string>;
    }
