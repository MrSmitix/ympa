

#include "OrderDeliveryDispatchType.h"

using namespace Tiny;

OrderDeliveryDispatchType::OrderDeliveryDispatchType()
{
}

OrderDeliveryDispatchType::OrderDeliveryDispatchType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryDispatchType::~OrderDeliveryDispatchType()
{

}

void
OrderDeliveryDispatchType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderDeliveryDispatchType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



