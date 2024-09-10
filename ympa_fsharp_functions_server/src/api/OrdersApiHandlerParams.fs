namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.AcceptOrderCancellationRequest
open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetOrderResponse
open ympa_fsharp_functions_server.Model.GetOrdersResponse
open ympa_fsharp_functions_server.Model.OrderBuyerType
open ympa_fsharp_functions_server.Model.OrderDeliveryDispatchType
open ympa_fsharp_functions_server.Model.OrderStatusType
open ympa_fsharp_functions_server.Model.OrderSubstatusType
open ympa_fsharp_functions_server.Model.ProvideOrderDigitalCodesRequest
open ympa_fsharp_functions_server.Model.ProvideOrderItemIdentifiersRequest
open ympa_fsharp_functions_server.Model.ProvideOrderItemIdentifiersResponse
open ympa_fsharp_functions_server.Model.Set
open ympa_fsharp_functions_server.Model.SetOrderBoxLayoutRequest
open ympa_fsharp_functions_server.Model.SetOrderBoxLayoutResponse
open ympa_fsharp_functions_server.Model.SetOrderShipmentBoxesRequest
open ympa_fsharp_functions_server.Model.SetOrderShipmentBoxesResponse
open ympa_fsharp_functions_server.Model.UpdateOrderItemRequest
open ympa_fsharp_functions_server.Model.UpdateOrderStatusRequest
open ympa_fsharp_functions_server.Model.UpdateOrderStatusResponse
open ympa_fsharp_functions_server.Model.UpdateOrderStatusesRequest
open ympa_fsharp_functions_server.Model.UpdateOrderStatusesResponse
open System.Collections.Generic
open System

module OrdersApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AcceptOrderCancellationPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AcceptOrderCancellationBodyParams = AcceptOrderCancellationRequest
    //#endregion


    type AcceptOrderCancellationStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type AcceptOrderCancellationStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type AcceptOrderCancellationStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type AcceptOrderCancellationStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type AcceptOrderCancellationStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type AcceptOrderCancellationStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type AcceptOrderCancellationStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type AcceptOrderCancellationResult = AcceptOrderCancellationStatusCode200 of AcceptOrderCancellationStatusCode200Response|AcceptOrderCancellationStatusCode400 of AcceptOrderCancellationStatusCode400Response|AcceptOrderCancellationStatusCode401 of AcceptOrderCancellationStatusCode401Response|AcceptOrderCancellationStatusCode403 of AcceptOrderCancellationStatusCode403Response|AcceptOrderCancellationStatusCode404 of AcceptOrderCancellationStatusCode404Response|AcceptOrderCancellationStatusCode420 of AcceptOrderCancellationStatusCode420Response|AcceptOrderCancellationStatusCode500 of AcceptOrderCancellationStatusCode500Response

    type AcceptOrderCancellationArgs = {
      pathParams:AcceptOrderCancellationPathParams;
      bodyParams:AcceptOrderCancellationBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrderPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion


    type GetOrderStatusCode200Response = {
      content:GetOrderResponse;
      
    }

    type GetOrderStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrderStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrderStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrderStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrderStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrderStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrderResult = GetOrderStatusCode200 of GetOrderStatusCode200Response|GetOrderStatusCode400 of GetOrderStatusCode400Response|GetOrderStatusCode401 of GetOrderStatusCode401Response|GetOrderStatusCode403 of GetOrderStatusCode403Response|GetOrderStatusCode404 of GetOrderStatusCode404Response|GetOrderStatusCode420 of GetOrderStatusCode420Response|GetOrderStatusCode500 of GetOrderStatusCode500Response

    type GetOrderArgs = {
      pathParams:GetOrderPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrdersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOrdersQueryParams = {
      orderIds : int64[] option;


      status : OrderStatusType[] option;


      substatus : OrderSubstatusType[] option;


      fromDate : DateTime option;


      toDate : DateTime option;


      supplierShipmentDateFrom : DateTime option;


      supplierShipmentDateTo : DateTime option;


      updatedAtFrom : DateTime option;


      updatedAtTo : DateTime option;


      dispatchType : OrderDeliveryDispatchType option;


      fake : bool option;


      hasCis : bool option;


      onlyWaitingForCancellationApprove : bool option;


      onlyEstimatedDelivery : bool option;


      buyerType : OrderBuyerType option;


      page : int option;


      pageSize : int option;


      pageToken : string option;


      limit : int option;

    }
    //#endregion


    type GetOrdersStatusCode200Response = {
      content:GetOrdersResponse;
      
    }

    type GetOrdersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrdersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrdersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrdersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrdersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrdersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrdersResult = GetOrdersStatusCode200 of GetOrdersStatusCode200Response|GetOrdersStatusCode400 of GetOrdersStatusCode400Response|GetOrdersStatusCode401 of GetOrdersStatusCode401Response|GetOrdersStatusCode403 of GetOrdersStatusCode403Response|GetOrdersStatusCode404 of GetOrdersStatusCode404Response|GetOrdersStatusCode420 of GetOrdersStatusCode420Response|GetOrdersStatusCode500 of GetOrdersStatusCode500Response

    type GetOrdersArgs = {
      pathParams:GetOrdersPathParams;
      queryParams:Result<GetOrdersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ProvideOrderDigitalCodesPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ProvideOrderDigitalCodesBodyParams = ProvideOrderDigitalCodesRequest
    //#endregion


    type ProvideOrderDigitalCodesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type ProvideOrderDigitalCodesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type ProvideOrderDigitalCodesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type ProvideOrderDigitalCodesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type ProvideOrderDigitalCodesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type ProvideOrderDigitalCodesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type ProvideOrderDigitalCodesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type ProvideOrderDigitalCodesResult = ProvideOrderDigitalCodesStatusCode200 of ProvideOrderDigitalCodesStatusCode200Response|ProvideOrderDigitalCodesStatusCode400 of ProvideOrderDigitalCodesStatusCode400Response|ProvideOrderDigitalCodesStatusCode401 of ProvideOrderDigitalCodesStatusCode401Response|ProvideOrderDigitalCodesStatusCode403 of ProvideOrderDigitalCodesStatusCode403Response|ProvideOrderDigitalCodesStatusCode404 of ProvideOrderDigitalCodesStatusCode404Response|ProvideOrderDigitalCodesStatusCode420 of ProvideOrderDigitalCodesStatusCode420Response|ProvideOrderDigitalCodesStatusCode500 of ProvideOrderDigitalCodesStatusCode500Response

    type ProvideOrderDigitalCodesArgs = {
      pathParams:ProvideOrderDigitalCodesPathParams;
      bodyParams:ProvideOrderDigitalCodesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ProvideOrderItemIdentifiersPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ProvideOrderItemIdentifiersBodyParams = ProvideOrderItemIdentifiersRequest
    //#endregion


    type ProvideOrderItemIdentifiersStatusCode200Response = {
      content:ProvideOrderItemIdentifiersResponse;
      
    }

    type ProvideOrderItemIdentifiersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type ProvideOrderItemIdentifiersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type ProvideOrderItemIdentifiersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type ProvideOrderItemIdentifiersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type ProvideOrderItemIdentifiersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type ProvideOrderItemIdentifiersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type ProvideOrderItemIdentifiersResult = ProvideOrderItemIdentifiersStatusCode200 of ProvideOrderItemIdentifiersStatusCode200Response|ProvideOrderItemIdentifiersStatusCode400 of ProvideOrderItemIdentifiersStatusCode400Response|ProvideOrderItemIdentifiersStatusCode401 of ProvideOrderItemIdentifiersStatusCode401Response|ProvideOrderItemIdentifiersStatusCode403 of ProvideOrderItemIdentifiersStatusCode403Response|ProvideOrderItemIdentifiersStatusCode404 of ProvideOrderItemIdentifiersStatusCode404Response|ProvideOrderItemIdentifiersStatusCode420 of ProvideOrderItemIdentifiersStatusCode420Response|ProvideOrderItemIdentifiersStatusCode500 of ProvideOrderItemIdentifiersStatusCode500Response

    type ProvideOrderItemIdentifiersArgs = {
      pathParams:ProvideOrderItemIdentifiersPathParams;
      bodyParams:ProvideOrderItemIdentifiersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SetOrderBoxLayoutPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SetOrderBoxLayoutBodyParams = SetOrderBoxLayoutRequest
    //#endregion


    type SetOrderBoxLayoutStatusCode200Response = {
      content:SetOrderBoxLayoutResponse;
      
    }

    type SetOrderBoxLayoutStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SetOrderBoxLayoutStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SetOrderBoxLayoutStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SetOrderBoxLayoutStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SetOrderBoxLayoutStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SetOrderBoxLayoutStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SetOrderBoxLayoutResult = SetOrderBoxLayoutStatusCode200 of SetOrderBoxLayoutStatusCode200Response|SetOrderBoxLayoutStatusCode400 of SetOrderBoxLayoutStatusCode400Response|SetOrderBoxLayoutStatusCode401 of SetOrderBoxLayoutStatusCode401Response|SetOrderBoxLayoutStatusCode403 of SetOrderBoxLayoutStatusCode403Response|SetOrderBoxLayoutStatusCode404 of SetOrderBoxLayoutStatusCode404Response|SetOrderBoxLayoutStatusCode420 of SetOrderBoxLayoutStatusCode420Response|SetOrderBoxLayoutStatusCode500 of SetOrderBoxLayoutStatusCode500Response

    type SetOrderBoxLayoutArgs = {
      pathParams:SetOrderBoxLayoutPathParams;
      bodyParams:SetOrderBoxLayoutBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SetOrderShipmentBoxesPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      shipmentId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SetOrderShipmentBoxesBodyParams = SetOrderShipmentBoxesRequest
    //#endregion


    type SetOrderShipmentBoxesStatusCode200Response = {
      content:SetOrderShipmentBoxesResponse;
      
    }

    type SetOrderShipmentBoxesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SetOrderShipmentBoxesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SetOrderShipmentBoxesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SetOrderShipmentBoxesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SetOrderShipmentBoxesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SetOrderShipmentBoxesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SetOrderShipmentBoxesResult = SetOrderShipmentBoxesStatusCode200 of SetOrderShipmentBoxesStatusCode200Response|SetOrderShipmentBoxesStatusCode400 of SetOrderShipmentBoxesStatusCode400Response|SetOrderShipmentBoxesStatusCode401 of SetOrderShipmentBoxesStatusCode401Response|SetOrderShipmentBoxesStatusCode403 of SetOrderShipmentBoxesStatusCode403Response|SetOrderShipmentBoxesStatusCode404 of SetOrderShipmentBoxesStatusCode404Response|SetOrderShipmentBoxesStatusCode420 of SetOrderShipmentBoxesStatusCode420Response|SetOrderShipmentBoxesStatusCode500 of SetOrderShipmentBoxesStatusCode500Response

    type SetOrderShipmentBoxesArgs = {
      pathParams:SetOrderShipmentBoxesPathParams;
      bodyParams:SetOrderShipmentBoxesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOrderItemsPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOrderItemsBodyParams = UpdateOrderItemRequest
    //#endregion


    type UpdateOrderItemsStatusCode200Response = {
      content:string;
      
    }

    type UpdateOrderItemsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOrderItemsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOrderItemsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOrderItemsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOrderItemsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOrderItemsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOrderItemsResult = UpdateOrderItemsStatusCode200 of UpdateOrderItemsStatusCode200Response|UpdateOrderItemsStatusCode400 of UpdateOrderItemsStatusCode400Response|UpdateOrderItemsStatusCode401 of UpdateOrderItemsStatusCode401Response|UpdateOrderItemsStatusCode403 of UpdateOrderItemsStatusCode403Response|UpdateOrderItemsStatusCode404 of UpdateOrderItemsStatusCode404Response|UpdateOrderItemsStatusCode420 of UpdateOrderItemsStatusCode420Response|UpdateOrderItemsStatusCode500 of UpdateOrderItemsStatusCode500Response

    type UpdateOrderItemsArgs = {
      pathParams:UpdateOrderItemsPathParams;
      bodyParams:UpdateOrderItemsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOrderStatusPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOrderStatusBodyParams = UpdateOrderStatusRequest
    //#endregion


    type UpdateOrderStatusStatusCode200Response = {
      content:UpdateOrderStatusResponse;
      
    }

    type UpdateOrderStatusStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOrderStatusStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOrderStatusStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOrderStatusStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOrderStatusStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOrderStatusStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOrderStatusResult = UpdateOrderStatusStatusCode200 of UpdateOrderStatusStatusCode200Response|UpdateOrderStatusStatusCode400 of UpdateOrderStatusStatusCode400Response|UpdateOrderStatusStatusCode401 of UpdateOrderStatusStatusCode401Response|UpdateOrderStatusStatusCode403 of UpdateOrderStatusStatusCode403Response|UpdateOrderStatusStatusCode404 of UpdateOrderStatusStatusCode404Response|UpdateOrderStatusStatusCode420 of UpdateOrderStatusStatusCode420Response|UpdateOrderStatusStatusCode500 of UpdateOrderStatusStatusCode500Response

    type UpdateOrderStatusArgs = {
      pathParams:UpdateOrderStatusPathParams;
      bodyParams:UpdateOrderStatusBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOrderStatusesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOrderStatusesBodyParams = UpdateOrderStatusesRequest
    //#endregion


    type UpdateOrderStatusesStatusCode200Response = {
      content:UpdateOrderStatusesResponse;
      
    }

    type UpdateOrderStatusesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOrderStatusesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOrderStatusesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOrderStatusesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOrderStatusesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOrderStatusesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOrderStatusesResult = UpdateOrderStatusesStatusCode200 of UpdateOrderStatusesStatusCode200Response|UpdateOrderStatusesStatusCode400 of UpdateOrderStatusesStatusCode400Response|UpdateOrderStatusesStatusCode401 of UpdateOrderStatusesStatusCode401Response|UpdateOrderStatusesStatusCode403 of UpdateOrderStatusesStatusCode403Response|UpdateOrderStatusesStatusCode404 of UpdateOrderStatusesStatusCode404Response|UpdateOrderStatusesStatusCode420 of UpdateOrderStatusesStatusCode420Response|UpdateOrderStatusesStatusCode500 of UpdateOrderStatusesStatusCode500Response

    type UpdateOrderStatusesArgs = {
      pathParams:UpdateOrderStatusesPathParams;
      bodyParams:UpdateOrderStatusesBodyParams
    }
