/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "ChatsApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

ChatsApiImpl::ChatsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ChatsApi(rtr)
{
}

void ChatsApiImpl::create_chat(const int64_t &businessId, const CreateChatRequest &createChatRequest, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void ChatsApiImpl::get_chat_history(const int64_t &businessId, const std::optional<int64_t> &chatId, const GetChatHistoryRequest &getChatHistoryRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void ChatsApiImpl::get_chats(const int64_t &businessId, const GetChatsRequest &getChatsRequest, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void ChatsApiImpl::send_file_to_chat(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response){
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void ChatsApiImpl::send_message_to_chat(const int64_t &businessId, const std::optional<int64_t> &chatId, const SendMessageToChatRequest &sendMessageToChatRequest, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

