

#include "OrderItemInstanceType.h"

using namespace Tiny;

OrderItemInstanceType::OrderItemInstanceType()
{
}

OrderItemInstanceType::OrderItemInstanceType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemInstanceType::~OrderItemInstanceType()
{

}

void
OrderItemInstanceType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderItemInstanceType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



