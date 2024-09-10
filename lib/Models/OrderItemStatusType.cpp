

#include "OrderItemStatusType.h"

using namespace Tiny;

OrderItemStatusType::OrderItemStatusType()
{
}

OrderItemStatusType::OrderItemStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemStatusType::~OrderItemStatusType()
{

}

void
OrderItemStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderItemStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



