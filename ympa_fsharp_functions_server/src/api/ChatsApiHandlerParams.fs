namespace ympa_fsharp_functions_server

open ympa_fsharp_functions_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_functions_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_functions_server.Model.ApiLimitErrorResponse
open ympa_fsharp_functions_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_functions_server.Model.ApiServerErrorResponse
open ympa_fsharp_functions_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_functions_server.Model.CreateChatRequest
open ympa_fsharp_functions_server.Model.CreateChatResponse
open ympa_fsharp_functions_server.Model.EmptyApiResponse
open ympa_fsharp_functions_server.Model.GetChatHistoryRequest
open ympa_fsharp_functions_server.Model.GetChatHistoryResponse
open ympa_fsharp_functions_server.Model.GetChatsRequest
open ympa_fsharp_functions_server.Model.GetChatsResponse
open ympa_fsharp_functions_server.Model.SendMessageToChatRequest
open System.Collections.Generic
open System

module ChatsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CreateChatPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateChatBodyParams = CreateChatRequest
    //#endregion


    type CreateChatStatusCode200Response = {
      content:CreateChatResponse;
      
    }

    type CreateChatStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type CreateChatStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type CreateChatStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type CreateChatStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type CreateChatStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type CreateChatStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type CreateChatResult = CreateChatStatusCode200 of CreateChatStatusCode200Response|CreateChatStatusCode400 of CreateChatStatusCode400Response|CreateChatStatusCode401 of CreateChatStatusCode401Response|CreateChatStatusCode403 of CreateChatStatusCode403Response|CreateChatStatusCode404 of CreateChatStatusCode404Response|CreateChatStatusCode420 of CreateChatStatusCode420Response|CreateChatStatusCode500 of CreateChatStatusCode500Response

    type CreateChatArgs = {
      pathParams:CreateChatPathParams;
      bodyParams:CreateChatBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetChatHistoryPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetChatHistoryQueryParams = {
      chatId : int64 ;


      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetChatHistoryBodyParams = GetChatHistoryRequest
    //#endregion


    type GetChatHistoryStatusCode200Response = {
      content:GetChatHistoryResponse;
      
    }

    type GetChatHistoryStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetChatHistoryStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetChatHistoryStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetChatHistoryStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetChatHistoryStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetChatHistoryStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetChatHistoryResult = GetChatHistoryStatusCode200 of GetChatHistoryStatusCode200Response|GetChatHistoryStatusCode400 of GetChatHistoryStatusCode400Response|GetChatHistoryStatusCode401 of GetChatHistoryStatusCode401Response|GetChatHistoryStatusCode403 of GetChatHistoryStatusCode403Response|GetChatHistoryStatusCode404 of GetChatHistoryStatusCode404Response|GetChatHistoryStatusCode420 of GetChatHistoryStatusCode420Response|GetChatHistoryStatusCode500 of GetChatHistoryStatusCode500Response

    type GetChatHistoryArgs = {
      pathParams:GetChatHistoryPathParams;
      queryParams:Result<GetChatHistoryQueryParams,string>;
      bodyParams:GetChatHistoryBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetChatsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetChatsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetChatsBodyParams = GetChatsRequest
    //#endregion


    type GetChatsStatusCode200Response = {
      content:GetChatsResponse;
      
    }

    type GetChatsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetChatsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetChatsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetChatsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetChatsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetChatsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetChatsResult = GetChatsStatusCode200 of GetChatsStatusCode200Response|GetChatsStatusCode400 of GetChatsStatusCode400Response|GetChatsStatusCode401 of GetChatsStatusCode401Response|GetChatsStatusCode403 of GetChatsStatusCode403Response|GetChatsStatusCode404 of GetChatsStatusCode404Response|GetChatsStatusCode420 of GetChatsStatusCode420Response|GetChatsStatusCode500 of GetChatsStatusCode500Response

    type GetChatsArgs = {
      pathParams:GetChatsPathParams;
      queryParams:Result<GetChatsQueryParams,string>;
      bodyParams:GetChatsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SendFileToChatPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SendFileToChatQueryParams = {
      chatId : int64 ;

    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type SendFileToChatFormParams = {
      file : System.IO.Stream ;
    }
    //#endregion


    type SendFileToChatStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SendFileToChatStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SendFileToChatStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SendFileToChatStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SendFileToChatStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SendFileToChatStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SendFileToChatStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SendFileToChatResult = SendFileToChatStatusCode200 of SendFileToChatStatusCode200Response|SendFileToChatStatusCode400 of SendFileToChatStatusCode400Response|SendFileToChatStatusCode401 of SendFileToChatStatusCode401Response|SendFileToChatStatusCode403 of SendFileToChatStatusCode403Response|SendFileToChatStatusCode404 of SendFileToChatStatusCode404Response|SendFileToChatStatusCode420 of SendFileToChatStatusCode420Response|SendFileToChatStatusCode500 of SendFileToChatStatusCode500Response

    type SendFileToChatArgs = {
      pathParams:SendFileToChatPathParams;
      queryParams:Result<SendFileToChatQueryParams,string>;
      formParams:Result<SendFileToChatFormParams,string>
    }
    //#region Path parameters
    [<CLIMutable>]
    type SendMessageToChatPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SendMessageToChatQueryParams = {
      chatId : int64 ;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SendMessageToChatBodyParams = SendMessageToChatRequest
    //#endregion


    type SendMessageToChatStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SendMessageToChatStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SendMessageToChatStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SendMessageToChatStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SendMessageToChatStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SendMessageToChatStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SendMessageToChatStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SendMessageToChatResult = SendMessageToChatStatusCode200 of SendMessageToChatStatusCode200Response|SendMessageToChatStatusCode400 of SendMessageToChatStatusCode400Response|SendMessageToChatStatusCode401 of SendMessageToChatStatusCode401Response|SendMessageToChatStatusCode403 of SendMessageToChatStatusCode403Response|SendMessageToChatStatusCode404 of SendMessageToChatStatusCode404Response|SendMessageToChatStatusCode420 of SendMessageToChatStatusCode420Response|SendMessageToChatStatusCode500 of SendMessageToChatStatusCode500Response

    type SendMessageToChatArgs = {
      pathParams:SendMessageToChatPathParams;
      queryParams:Result<SendMessageToChatQueryParams,string>;
      bodyParams:SendMessageToChatBodyParams
    }
