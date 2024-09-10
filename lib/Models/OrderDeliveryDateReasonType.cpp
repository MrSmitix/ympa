

#include "OrderDeliveryDateReasonType.h"

using namespace Tiny;

OrderDeliveryDateReasonType::OrderDeliveryDateReasonType()
{
}

OrderDeliveryDateReasonType::OrderDeliveryDateReasonType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryDateReasonType::~OrderDeliveryDateReasonType()
{

}

void
OrderDeliveryDateReasonType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderDeliveryDateReasonType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



