namespace ympa_fsharp_giraffe_server
open ChatsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ChatsApiServiceInterface =

    //#region Service interface
    type IChatsApiService =
      abstract member CreateChat:HttpContext -> CreateChatArgs->CreateChatResult
      abstract member GetChatHistory:HttpContext -> GetChatHistoryArgs->GetChatHistoryResult
      abstract member GetChats:HttpContext -> GetChatsArgs->GetChatsResult
      abstract member SendFileToChat:HttpContext -> SendFileToChatArgs->SendFileToChatResult
      abstract member SendMessageToChat:HttpContext -> SendMessageToChatArgs->SendMessageToChatResult
    //#endregion