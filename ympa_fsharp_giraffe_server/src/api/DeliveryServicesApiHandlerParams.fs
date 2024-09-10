namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetDeliveryServicesResponse
open System.Collections.Generic
open System

module DeliveryServicesApiHandlerParams =



    type GetDeliveryServicesStatusCode200Response = {
      content:GetDeliveryServicesResponse;
      
    }

    type GetDeliveryServicesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetDeliveryServicesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetDeliveryServicesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetDeliveryServicesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetDeliveryServicesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetDeliveryServicesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetDeliveryServicesResult = GetDeliveryServicesStatusCode200 of GetDeliveryServicesStatusCode200Response|GetDeliveryServicesStatusCode400 of GetDeliveryServicesStatusCode400Response|GetDeliveryServicesStatusCode401 of GetDeliveryServicesStatusCode401Response|GetDeliveryServicesStatusCode403 of GetDeliveryServicesStatusCode403Response|GetDeliveryServicesStatusCode404 of GetDeliveryServicesStatusCode404Response|GetDeliveryServicesStatusCode420 of GetDeliveryServicesStatusCode420Response|GetDeliveryServicesStatusCode500 of GetDeliveryServicesStatusCode500Response

