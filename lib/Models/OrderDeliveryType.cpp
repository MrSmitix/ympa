

#include "OrderDeliveryType.h"

using namespace Tiny;

OrderDeliveryType::OrderDeliveryType()
{
}

OrderDeliveryType::OrderDeliveryType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryType::~OrderDeliveryType()
{

}

void
OrderDeliveryType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderDeliveryType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



