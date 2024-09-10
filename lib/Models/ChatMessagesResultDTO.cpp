

#include "ChatMessagesResultDTO.h"

using namespace Tiny;

ChatMessagesResultDTO::ChatMessagesResultDTO()
{
	orderId = long(0);
	messages = std::list<ChatMessageDTO>();
	paging = ForwardScrollingPagerDTO();
}

ChatMessagesResultDTO::ChatMessagesResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatMessagesResultDTO::~ChatMessagesResultDTO()
{

}

void
ChatMessagesResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderIdKey = "orderId";

    if(object.has_key(orderIdKey))
    {
        bourne::json value = object[orderIdKey];



        jsonToValue(&orderId, value, "long");


    }

    const char *messagesKey = "messages";

    if(object.has_key(messagesKey))
    {
        bourne::json value = object[messagesKey];


        std::list<ChatMessageDTO> messages_list;
        ChatMessageDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            messages_list.push_back(element);
        }
        messages = messages_list;


    }

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ForwardScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatMessagesResultDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["orderId"] = getOrderId();





    std::list<ChatMessageDTO> messages_list = getMessages();
    bourne::json messages_arr = bourne::json::array();

    for(auto& var : messages_list)
    {
        ChatMessageDTO obj = var;
        messages_arr.append(obj.toJson());
    }
    object["messages"] = messages_arr;








	object["paging"] = getPaging().toJson();


    return object;

}

long
ChatMessagesResultDTO::getOrderId()
{
	return orderId;
}

void
ChatMessagesResultDTO::setOrderId(long  orderId)
{
	this->orderId = orderId;
}

std::list<ChatMessageDTO>
ChatMessagesResultDTO::getMessages()
{
	return messages;
}

void
ChatMessagesResultDTO::setMessages(std::list <ChatMessageDTO> messages)
{
	this->messages = messages;
}

ForwardScrollingPagerDTO
ChatMessagesResultDTO::getPaging()
{
	return paging;
}

void
ChatMessagesResultDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}



