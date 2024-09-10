namespace ympa_fsharp_giraffe_server.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open ympa_fsharp_giraffe_server.ChatsApiHandler
open ympa_fsharp_giraffe_server.ChatsApiHandlerParams

module ChatsApiHandlerTestsHelper =


  let mutable CreateChatExamples = Map.empty
  let mutable CreateChatBody = ""

  CreateChatBody <- WebUtility.HtmlDecode "{
  &quot;orderId&quot; : 0
}"
  CreateChatExamples <- CreateChatExamples.Add("application/json", CreateChatBody)

  let getCreateChatExample mediaType =
    CreateChatExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetChatHistoryExamples = Map.empty
  let mutable GetChatHistoryBody = ""

  GetChatHistoryBody <- WebUtility.HtmlDecode "{
  &quot;messageIdFrom&quot; : 0
}"
  GetChatHistoryExamples <- GetChatHistoryExamples.Add("application/json", GetChatHistoryBody)

  let getGetChatHistoryExample mediaType =
    GetChatHistoryExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetChatsExamples = Map.empty
  let mutable GetChatsBody = ""

  GetChatsBody <- WebUtility.HtmlDecode "{
  &quot;types&quot; : [ &quot;CHAT&quot;, &quot;CHAT&quot; ],
  &quot;statuses&quot; : [ &quot;NEW&quot;, &quot;NEW&quot; ],
  &quot;orderIds&quot; : [ 0, 0 ]
}"
  GetChatsExamples <- GetChatsExamples.Add("application/json", GetChatsBody)

  let getGetChatsExample mediaType =
    GetChatsExamples.[mediaType]
      |> getConverter mediaType

  let mutable SendFileToChatExamples = Map.empty
  let mutable SendFileToChatBody = ""

  let getSendFileToChatExample mediaType =
    SendFileToChatExamples.[mediaType]
      |> getConverter mediaType

  let mutable SendMessageToChatExamples = Map.empty
  let mutable SendMessageToChatBody = ""

  SendMessageToChatBody <- WebUtility.HtmlDecode "{
  &quot;message&quot; : &quot;message&quot;
}"
  SendMessageToChatExamples <- SendMessageToChatExamples.Add("application/json", SendMessageToChatBody)

  let getSendMessageToChatExample mediaType =
    SendMessageToChatExamples.[mediaType]
      |> getConverter mediaType
