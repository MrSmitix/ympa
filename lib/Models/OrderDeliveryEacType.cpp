

#include "OrderDeliveryEacType.h"

using namespace Tiny;

OrderDeliveryEacType::OrderDeliveryEacType()
{
}

OrderDeliveryEacType::OrderDeliveryEacType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryEacType::~OrderDeliveryEacType()
{

}

void
OrderDeliveryEacType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderDeliveryEacType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



