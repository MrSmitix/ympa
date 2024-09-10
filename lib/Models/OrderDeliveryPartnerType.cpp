

#include "OrderDeliveryPartnerType.h"

using namespace Tiny;

OrderDeliveryPartnerType::OrderDeliveryPartnerType()
{
}

OrderDeliveryPartnerType::OrderDeliveryPartnerType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderDeliveryPartnerType::~OrderDeliveryPartnerType()
{

}

void
OrderDeliveryPartnerType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderDeliveryPartnerType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



