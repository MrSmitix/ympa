{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Chats exposing
    ( createChat
    , getChatHistory
    , getChats
    , sendFileToChat
    , sendMessageToChat
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode
import File exposing (File)

{-| Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-}
createChat : Int -> Api.Data.CreateChatRequest -> Api.Request Api.Data.CreateChatResponse
createChat businessId_path createChatRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/chats/new"
        [ ( "businessId", String.fromInt businessId_path ) ]
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeCreateChatRequest createChatRequest_body)))
        Api.Data.createChatResponseDecoder


{-| Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-}
getChatHistory : Int -> Int -> Maybe String -> Maybe Int -> Api.Data.GetChatHistoryRequest -> Api.Request Api.Data.GetChatHistoryResponse
getChatHistory businessId_path chatId_query pageToken_query limit_query getChatHistoryRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/chats/history"
        [ ( "businessId", String.fromInt businessId_path ) ]
        [ ( "chatId", Just <| String.fromInt chatId_query ), ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGetChatHistoryRequest getChatHistoryRequest_body)))
        Api.Data.getChatHistoryResponseDecoder


{-| Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-}
getChats : Int -> Maybe String -> Maybe Int -> Api.Data.GetChatsRequest -> Api.Request Api.Data.GetChatsResponse
getChats businessId_path pageToken_query limit_query getChatsRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/chats"
        [ ( "businessId", String.fromInt businessId_path ) ]
        [ ( "page_token", Maybe.map identity pageToken_query ), ( "limit", Maybe.map String.fromInt limit_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGetChatsRequest getChatsRequest_body)))
        Api.Data.getChatsResponseDecoder


{-| Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-}
sendFileToChat : Int -> Int -> File -> Api.Request Api.Data.EmptyApiResponse
sendFileToChat businessId_path chatId_query file =
    Api.request
        "POST"
        "/businesses/{businessId}/chats/file/send"
        [ ( "businessId", String.fromInt businessId_path ) ]
        [ ( "chatId", Just <| String.fromInt chatId_query ) ]
        []
        (Just <| Http.multipartBody <| List.filterMap identity [ Just <| Http.filePart "file" file ])
        Api.Data.emptyApiResponseDecoder


{-| Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-}
sendMessageToChat : Int -> Int -> Api.Data.SendMessageToChatRequest -> Api.Request Api.Data.EmptyApiResponse
sendMessageToChat businessId_path chatId_query sendMessageToChatRequest_body =
    Api.request
        "POST"
        "/businesses/{businessId}/chats/message"
        [ ( "businessId", String.fromInt businessId_path ) ]
        [ ( "chatId", Just <| String.fromInt chatId_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeSendMessageToChatRequest sendMessageToChatRequest_body)))
        Api.Data.emptyApiResponseDecoder

