namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.ConfirmPricesRequest
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetQuarantineOffersRequest
open ympa_fsharp_giraffe_server.Model.GetQuarantineOffersResponse
open System.Collections.Generic
open System

module PriceQuarantineApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ConfirmBusinessPricesPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ConfirmBusinessPricesBodyParams = ConfirmPricesRequest
    //#endregion


    type ConfirmBusinessPricesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type ConfirmBusinessPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type ConfirmBusinessPricesResult = ConfirmBusinessPricesStatusCode200 of ConfirmBusinessPricesStatusCode200Response|ConfirmBusinessPricesStatusCode400 of ConfirmBusinessPricesStatusCode400Response|ConfirmBusinessPricesStatusCode401 of ConfirmBusinessPricesStatusCode401Response|ConfirmBusinessPricesStatusCode403 of ConfirmBusinessPricesStatusCode403Response|ConfirmBusinessPricesStatusCode404 of ConfirmBusinessPricesStatusCode404Response|ConfirmBusinessPricesStatusCode420 of ConfirmBusinessPricesStatusCode420Response|ConfirmBusinessPricesStatusCode423 of ConfirmBusinessPricesStatusCode423Response|ConfirmBusinessPricesStatusCode500 of ConfirmBusinessPricesStatusCode500Response

    type ConfirmBusinessPricesArgs = {
      pathParams:ConfirmBusinessPricesPathParams;
      bodyParams:ConfirmBusinessPricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ConfirmCampaignPricesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ConfirmCampaignPricesBodyParams = ConfirmPricesRequest
    //#endregion


    type ConfirmCampaignPricesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type ConfirmCampaignPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type ConfirmCampaignPricesResult = ConfirmCampaignPricesStatusCode200 of ConfirmCampaignPricesStatusCode200Response|ConfirmCampaignPricesStatusCode400 of ConfirmCampaignPricesStatusCode400Response|ConfirmCampaignPricesStatusCode401 of ConfirmCampaignPricesStatusCode401Response|ConfirmCampaignPricesStatusCode403 of ConfirmCampaignPricesStatusCode403Response|ConfirmCampaignPricesStatusCode404 of ConfirmCampaignPricesStatusCode404Response|ConfirmCampaignPricesStatusCode420 of ConfirmCampaignPricesStatusCode420Response|ConfirmCampaignPricesStatusCode423 of ConfirmCampaignPricesStatusCode423Response|ConfirmCampaignPricesStatusCode500 of ConfirmCampaignPricesStatusCode500Response

    type ConfirmCampaignPricesArgs = {
      pathParams:ConfirmCampaignPricesPathParams;
      bodyParams:ConfirmCampaignPricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetBusinessQuarantineOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetBusinessQuarantineOffersQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetBusinessQuarantineOffersBodyParams = GetQuarantineOffersRequest
    //#endregion


    type GetBusinessQuarantineOffersStatusCode200Response = {
      content:GetQuarantineOffersResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetBusinessQuarantineOffersResult = GetBusinessQuarantineOffersStatusCode200 of GetBusinessQuarantineOffersStatusCode200Response|GetBusinessQuarantineOffersStatusCode400 of GetBusinessQuarantineOffersStatusCode400Response|GetBusinessQuarantineOffersStatusCode401 of GetBusinessQuarantineOffersStatusCode401Response|GetBusinessQuarantineOffersStatusCode403 of GetBusinessQuarantineOffersStatusCode403Response|GetBusinessQuarantineOffersStatusCode404 of GetBusinessQuarantineOffersStatusCode404Response|GetBusinessQuarantineOffersStatusCode420 of GetBusinessQuarantineOffersStatusCode420Response|GetBusinessQuarantineOffersStatusCode500 of GetBusinessQuarantineOffersStatusCode500Response

    type GetBusinessQuarantineOffersArgs = {
      pathParams:GetBusinessQuarantineOffersPathParams;
      queryParams:Result<GetBusinessQuarantineOffersQueryParams,string>;
      bodyParams:GetBusinessQuarantineOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignQuarantineOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetCampaignQuarantineOffersQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetCampaignQuarantineOffersBodyParams = GetQuarantineOffersRequest
    //#endregion


    type GetCampaignQuarantineOffersStatusCode200Response = {
      content:GetQuarantineOffersResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignQuarantineOffersResult = GetCampaignQuarantineOffersStatusCode200 of GetCampaignQuarantineOffersStatusCode200Response|GetCampaignQuarantineOffersStatusCode400 of GetCampaignQuarantineOffersStatusCode400Response|GetCampaignQuarantineOffersStatusCode401 of GetCampaignQuarantineOffersStatusCode401Response|GetCampaignQuarantineOffersStatusCode403 of GetCampaignQuarantineOffersStatusCode403Response|GetCampaignQuarantineOffersStatusCode404 of GetCampaignQuarantineOffersStatusCode404Response|GetCampaignQuarantineOffersStatusCode420 of GetCampaignQuarantineOffersStatusCode420Response|GetCampaignQuarantineOffersStatusCode500 of GetCampaignQuarantineOffersStatusCode500Response

    type GetCampaignQuarantineOffersArgs = {
      pathParams:GetCampaignQuarantineOffersPathParams;
      queryParams:Result<GetCampaignQuarantineOffersQueryParams,string>;
      bodyParams:GetCampaignQuarantineOffersBodyParams
    }
