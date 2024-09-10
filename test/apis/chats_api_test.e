note
    description: "API tests for CHATS_API"
    date: "$Date$"
    revision: "$Revision$"


class CHATS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_chat_history
            -- Получение истории сообщений в чате
            --
            -- Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: GET_CHAT_HISTORY_RESPONSE
            l_business_id: INTEGER_64
            l_chat_id: INTEGER_64
            l_get_chat_history_request: GET_CHAT_HISTORY_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_chat_id
            -- l_get_chat_history_request

            -- l_response := api.chat_history(l_business_id, l_chat_id, l_get_chat_history_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_chats
            -- Получение доступных чатов
            --
            -- Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
        local
            l_response: GET_CHATS_RESPONSE
            l_business_id: INTEGER_64
            l_get_chats_request: GET_CHATS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_chats_request

            -- l_response := api.chats(l_business_id, l_get_chats_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_create_chat
            -- Создание нового чата с покупателем
            --
            -- Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: CREATE_CHAT_RESPONSE
            l_business_id: INTEGER_64
            l_create_chat_request: CREATE_CHAT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_create_chat_request

            -- l_response := api.create_chat(l_business_id, l_create_chat_request)
            assert ("not_implemented", False)
        end

    test_send_file_to_chat
            -- Отправка файла в чат
            --
            -- Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_chat_id: INTEGER_64
            l_file: FILE
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_chat_id
            -- l_file

            -- l_response := api.send_file_to_chat(l_business_id, l_chat_id, l_file)
            assert ("not_implemented", False)
        end

    test_send_message_to_chat
            -- Отправка сообщения в чат
            --
            -- Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_chat_id: INTEGER_64
            l_send_message_to_chat_request: SEND_MESSAGE_TO_CHAT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_chat_id
            -- l_send_message_to_chat_request

            -- l_response := api.send_message_to_chat(l_business_id, l_chat_id, l_send_message_to_chat_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CHATS_API
            -- Create an object instance of `CHATS_API'.
        once
            create { CHATS_API } Result
        end

end
