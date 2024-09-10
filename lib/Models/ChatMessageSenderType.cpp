

#include "ChatMessageSenderType.h"

using namespace Tiny;

ChatMessageSenderType::ChatMessageSenderType()
{
}

ChatMessageSenderType::ChatMessageSenderType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatMessageSenderType::~ChatMessageSenderType()
{

}

void
ChatMessageSenderType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChatMessageSenderType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



