

#include "CreateChatRequest.h"

using namespace Tiny;

CreateChatRequest::CreateChatRequest()
{
	orderId = long(0);
}

CreateChatRequest::CreateChatRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatRequest::~CreateChatRequest()
{

}

void
CreateChatRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderIdKey = "orderId";

    if(object.has_key(orderIdKey))
    {
        bourne::json value = object[orderIdKey];



        jsonToValue(&orderId, value, "long");


    }


}

bourne::json
CreateChatRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["orderId"] = getOrderId();



    return object;

}

long
CreateChatRequest::getOrderId()
{
	return orderId;
}

void
CreateChatRequest::setOrderId(long  orderId)
{
	this->orderId = orderId;
}



