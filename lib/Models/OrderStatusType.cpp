

#include "OrderStatusType.h"

using namespace Tiny;

OrderStatusType::OrderStatusType()
{
}

OrderStatusType::OrderStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderStatusType::~OrderStatusType()
{

}

void
OrderStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



