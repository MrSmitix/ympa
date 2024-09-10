namespace ympa_fsharp_functions_server
open ChatsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ChatsApiServiceInterface =

    //#region Service interface
    type IChatsApiService =
      abstract member CreateChat : CreateChatBodyParams -> CreateChatResult
      abstract member GetChatHistory : GetChatHistoryBodyParams -> GetChatHistoryResult
      abstract member GetChats : GetChatsBodyParams -> GetChatsResult
      abstract member SendFileToChat : unit -> SendFileToChatResult
      abstract member SendMessageToChat : SendMessageToChatBodyParams -> SendMessageToChatResult
    //#endregion