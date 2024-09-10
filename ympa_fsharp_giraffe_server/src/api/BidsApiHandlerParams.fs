namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetBidsInfoRequest
open ympa_fsharp_giraffe_server.Model.GetBidsInfoResponse
open ympa_fsharp_giraffe_server.Model.GetBidsRecommendationsRequest
open ympa_fsharp_giraffe_server.Model.GetBidsRecommendationsResponse
open ympa_fsharp_giraffe_server.Model.PutSkuBidsRequest
open System.Collections.Generic
open System

module BidsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetBidsInfoForBusinessPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetBidsInfoForBusinessQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetBidsInfoForBusinessBodyParams = GetBidsInfoRequest
    //#endregion


    type GetBidsInfoForBusinessStatusCode200Response = {
      content:GetBidsInfoResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetBidsInfoForBusinessResult = GetBidsInfoForBusinessStatusCode200 of GetBidsInfoForBusinessStatusCode200Response|GetBidsInfoForBusinessStatusCode400 of GetBidsInfoForBusinessStatusCode400Response|GetBidsInfoForBusinessStatusCode401 of GetBidsInfoForBusinessStatusCode401Response|GetBidsInfoForBusinessStatusCode403 of GetBidsInfoForBusinessStatusCode403Response|GetBidsInfoForBusinessStatusCode404 of GetBidsInfoForBusinessStatusCode404Response|GetBidsInfoForBusinessStatusCode420 of GetBidsInfoForBusinessStatusCode420Response|GetBidsInfoForBusinessStatusCode500 of GetBidsInfoForBusinessStatusCode500Response

    type GetBidsInfoForBusinessArgs = {
      pathParams:GetBidsInfoForBusinessPathParams;
      queryParams:Result<GetBidsInfoForBusinessQueryParams,string>;
      bodyParams:GetBidsInfoForBusinessBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetBidsRecommendationsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetBidsRecommendationsBodyParams = GetBidsRecommendationsRequest
    //#endregion


    type GetBidsRecommendationsStatusCode200Response = {
      content:GetBidsRecommendationsResponse;
      
    }

    type GetBidsRecommendationsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetBidsRecommendationsResult = GetBidsRecommendationsStatusCode200 of GetBidsRecommendationsStatusCode200Response|GetBidsRecommendationsStatusCode400 of GetBidsRecommendationsStatusCode400Response|GetBidsRecommendationsStatusCode401 of GetBidsRecommendationsStatusCode401Response|GetBidsRecommendationsStatusCode403 of GetBidsRecommendationsStatusCode403Response|GetBidsRecommendationsStatusCode404 of GetBidsRecommendationsStatusCode404Response|GetBidsRecommendationsStatusCode420 of GetBidsRecommendationsStatusCode420Response|GetBidsRecommendationsStatusCode500 of GetBidsRecommendationsStatusCode500Response

    type GetBidsRecommendationsArgs = {
      pathParams:GetBidsRecommendationsPathParams;
      bodyParams:GetBidsRecommendationsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PutBidsForBusinessPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PutBidsForBusinessBodyParams = PutSkuBidsRequest
    //#endregion


    type PutBidsForBusinessStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type PutBidsForBusinessStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type PutBidsForBusinessResult = PutBidsForBusinessStatusCode200 of PutBidsForBusinessStatusCode200Response|PutBidsForBusinessStatusCode400 of PutBidsForBusinessStatusCode400Response|PutBidsForBusinessStatusCode401 of PutBidsForBusinessStatusCode401Response|PutBidsForBusinessStatusCode403 of PutBidsForBusinessStatusCode403Response|PutBidsForBusinessStatusCode404 of PutBidsForBusinessStatusCode404Response|PutBidsForBusinessStatusCode420 of PutBidsForBusinessStatusCode420Response|PutBidsForBusinessStatusCode500 of PutBidsForBusinessStatusCode500Response

    type PutBidsForBusinessArgs = {
      pathParams:PutBidsForBusinessPathParams;
      bodyParams:PutBidsForBusinessBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PutBidsForCampaignPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PutBidsForCampaignBodyParams = PutSkuBidsRequest
    //#endregion


    type PutBidsForCampaignStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type PutBidsForCampaignStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type PutBidsForCampaignResult = PutBidsForCampaignStatusCode200 of PutBidsForCampaignStatusCode200Response|PutBidsForCampaignStatusCode400 of PutBidsForCampaignStatusCode400Response|PutBidsForCampaignStatusCode401 of PutBidsForCampaignStatusCode401Response|PutBidsForCampaignStatusCode403 of PutBidsForCampaignStatusCode403Response|PutBidsForCampaignStatusCode404 of PutBidsForCampaignStatusCode404Response|PutBidsForCampaignStatusCode420 of PutBidsForCampaignStatusCode420Response|PutBidsForCampaignStatusCode500 of PutBidsForCampaignStatusCode500Response

    type PutBidsForCampaignArgs = {
      pathParams:PutBidsForCampaignPathParams;
      bodyParams:PutBidsForCampaignBodyParams
    }
