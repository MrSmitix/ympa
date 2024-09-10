namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetAllOffersResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersResponse
open ympa_fsharp_giraffe_server.Model.GetOfferRecommendationsRequest
open ympa_fsharp_giraffe_server.Model.GetOfferRecommendationsResponse
open ympa_fsharp_giraffe_server.Model.GetOffersResponse
open ympa_fsharp_giraffe_server.Model.UpdateCampaignOffersRequest
open System.Collections.Generic
open System

module OffersApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type DeleteCampaignOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteCampaignOffersBodyParams = DeleteCampaignOffersRequest
    //#endregion


    type DeleteCampaignOffersStatusCode200Response = {
      content:DeleteCampaignOffersResponse;
      
    }

    type DeleteCampaignOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteCampaignOffersResult = DeleteCampaignOffersStatusCode200 of DeleteCampaignOffersStatusCode200Response|DeleteCampaignOffersStatusCode400 of DeleteCampaignOffersStatusCode400Response|DeleteCampaignOffersStatusCode401 of DeleteCampaignOffersStatusCode401Response|DeleteCampaignOffersStatusCode403 of DeleteCampaignOffersStatusCode403Response|DeleteCampaignOffersStatusCode404 of DeleteCampaignOffersStatusCode404Response|DeleteCampaignOffersStatusCode420 of DeleteCampaignOffersStatusCode420Response|DeleteCampaignOffersStatusCode423 of DeleteCampaignOffersStatusCode423Response|DeleteCampaignOffersStatusCode500 of DeleteCampaignOffersStatusCode500Response

    type DeleteCampaignOffersArgs = {
      pathParams:DeleteCampaignOffersPathParams;
      bodyParams:DeleteCampaignOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetAllOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetAllOffersQueryParams = {
      feedId : int64 option;


      chunk : int option;

    }
    //#endregion


    type GetAllOffersStatusCode200Response = {
      content:GetAllOffersResponse;
      
    }

    type GetAllOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetAllOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetAllOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetAllOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetAllOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetAllOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetAllOffersResult = GetAllOffersStatusCode200 of GetAllOffersStatusCode200Response|GetAllOffersStatusCode400 of GetAllOffersStatusCode400Response|GetAllOffersStatusCode401 of GetAllOffersStatusCode401Response|GetAllOffersStatusCode403 of GetAllOffersStatusCode403Response|GetAllOffersStatusCode404 of GetAllOffersStatusCode404Response|GetAllOffersStatusCode420 of GetAllOffersStatusCode420Response|GetAllOffersStatusCode500 of GetAllOffersStatusCode500Response

    type GetAllOffersArgs = {
      pathParams:GetAllOffersPathParams;
      queryParams:Result<GetAllOffersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetCampaignOffersQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetCampaignOffersBodyParams = GetCampaignOffersRequest
    //#endregion


    type GetCampaignOffersStatusCode200Response = {
      content:GetCampaignOffersResponse;
      
    }

    type GetCampaignOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignOffersResult = GetCampaignOffersStatusCode200 of GetCampaignOffersStatusCode200Response|GetCampaignOffersStatusCode400 of GetCampaignOffersStatusCode400Response|GetCampaignOffersStatusCode401 of GetCampaignOffersStatusCode401Response|GetCampaignOffersStatusCode403 of GetCampaignOffersStatusCode403Response|GetCampaignOffersStatusCode404 of GetCampaignOffersStatusCode404Response|GetCampaignOffersStatusCode420 of GetCampaignOffersStatusCode420Response|GetCampaignOffersStatusCode500 of GetCampaignOffersStatusCode500Response

    type GetCampaignOffersArgs = {
      pathParams:GetCampaignOffersPathParams;
      queryParams:Result<GetCampaignOffersQueryParams,string>;
      bodyParams:GetCampaignOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOfferRecommendationsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOfferRecommendationsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetOfferRecommendationsBodyParams = GetOfferRecommendationsRequest
    //#endregion


    type GetOfferRecommendationsStatusCode200Response = {
      content:GetOfferRecommendationsResponse;
      
    }

    type GetOfferRecommendationsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOfferRecommendationsResult = GetOfferRecommendationsStatusCode200 of GetOfferRecommendationsStatusCode200Response|GetOfferRecommendationsStatusCode400 of GetOfferRecommendationsStatusCode400Response|GetOfferRecommendationsStatusCode401 of GetOfferRecommendationsStatusCode401Response|GetOfferRecommendationsStatusCode403 of GetOfferRecommendationsStatusCode403Response|GetOfferRecommendationsStatusCode404 of GetOfferRecommendationsStatusCode404Response|GetOfferRecommendationsStatusCode420 of GetOfferRecommendationsStatusCode420Response|GetOfferRecommendationsStatusCode500 of GetOfferRecommendationsStatusCode500Response

    type GetOfferRecommendationsArgs = {
      pathParams:GetOfferRecommendationsPathParams;
      queryParams:Result<GetOfferRecommendationsQueryParams,string>;
      bodyParams:GetOfferRecommendationsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOffersQueryParams = {
      query : string option;


      feedId : int64 option;


      shopCategoryId : string option;


      currency : CurrencyType option;


      matched : bool option;


      page : int option;


      pageSize : int option;

    }
    //#endregion


    type GetOffersStatusCode200Response = {
      content:GetOffersResponse;
      
    }

    type GetOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOffersResult = GetOffersStatusCode200 of GetOffersStatusCode200Response|GetOffersStatusCode400 of GetOffersStatusCode400Response|GetOffersStatusCode401 of GetOffersStatusCode401Response|GetOffersStatusCode403 of GetOffersStatusCode403Response|GetOffersStatusCode404 of GetOffersStatusCode404Response|GetOffersStatusCode420 of GetOffersStatusCode420Response|GetOffersStatusCode500 of GetOffersStatusCode500Response

    type GetOffersArgs = {
      pathParams:GetOffersPathParams;
      queryParams:Result<GetOffersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateCampaignOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateCampaignOffersBodyParams = UpdateCampaignOffersRequest
    //#endregion


    type UpdateCampaignOffersStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateCampaignOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateCampaignOffersResult = UpdateCampaignOffersStatusCode200 of UpdateCampaignOffersStatusCode200Response|UpdateCampaignOffersStatusCode400 of UpdateCampaignOffersStatusCode400Response|UpdateCampaignOffersStatusCode401 of UpdateCampaignOffersStatusCode401Response|UpdateCampaignOffersStatusCode403 of UpdateCampaignOffersStatusCode403Response|UpdateCampaignOffersStatusCode404 of UpdateCampaignOffersStatusCode404Response|UpdateCampaignOffersStatusCode420 of UpdateCampaignOffersStatusCode420Response|UpdateCampaignOffersStatusCode423 of UpdateCampaignOffersStatusCode423Response|UpdateCampaignOffersStatusCode500 of UpdateCampaignOffersStatusCode500Response

    type UpdateCampaignOffersArgs = {
      pathParams:UpdateCampaignOffersPathParams;
      bodyParams:UpdateCampaignOffersBodyParams
    }
