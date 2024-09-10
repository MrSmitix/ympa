

#include "ChatStatusType.h"

using namespace Tiny;

ChatStatusType::ChatStatusType()
{
}

ChatStatusType::ChatStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatStatusType::~ChatStatusType()
{

}

void
ChatStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChatStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



