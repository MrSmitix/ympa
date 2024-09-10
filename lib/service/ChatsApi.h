#ifndef TINY_CPP_CLIENT_ChatsApi_H_
#define TINY_CPP_CLIENT_ChatsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "CreateChatRequest.h"
#include "CreateChatResponse.h"
#include "EmptyApiResponse.h"
#include "GetChatHistoryRequest.h"
#include "GetChatHistoryResponse.h"
#include "GetChatsRequest.h"
#include "GetChatsResponse.h"
#include "SendMessageToChatRequest.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ChatsApi : public Service {
public:
    ChatsApi() = default;

    virtual ~ChatsApi() = default;

    /**
    * Создание нового чата с покупателем.
    *
    * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param createChatRequest description *Required*
    */
    Response<
                CreateChatResponse
        >
    createChat(
            
            long businessId
            , 
            
            CreateChatRequest createChatRequest
            
    );
    /**
    * Получение истории сообщений в чате.
    *
    * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param chatId Идентификатор чата. *Required*
    * \param getChatHistoryRequest description *Required*
    * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    * \param limit Количество значений на одной странице. 
    */
    Response<
                GetChatHistoryResponse
        >
    getChatHistory(
            
            long businessId
            , 
            
            long chatId
            , 
            
            GetChatHistoryRequest getChatHistoryRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
    );
    /**
    * Получение доступных чатов.
    *
    * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param getChatsRequest description *Required*
    * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    * \param limit Количество значений на одной странице. 
    */
    Response<
                GetChatsResponse
        >
    getChats(
            
            long businessId
            , 
            
            GetChatsRequest getChatsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
    );
    /**
    * Отправка файла в чат.
    *
    * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param chatId Идентификатор чата. *Required*
    * \param file Содержимое файла. Максимальный размер файла — 5 Мбайт. *Required*
    */
    Response<
                EmptyApiResponse
        >
    sendFileToChat(
            
            long businessId
            , 
            
            long chatId
            , 
            
            std::string file
            
    );
    /**
    * Отправка сообщения в чат.
    *
    * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param chatId Идентификатор чата. *Required*
    * \param sendMessageToChatRequest description *Required*
    */
    Response<
                EmptyApiResponse
        >
    sendMessageToChat(
            
            long businessId
            , 
            
            long chatId
            , 
            
            SendMessageToChatRequest sendMessageToChatRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ChatsApi_H_ */