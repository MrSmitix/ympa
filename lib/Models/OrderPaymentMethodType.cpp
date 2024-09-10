

#include "OrderPaymentMethodType.h"

using namespace Tiny;

OrderPaymentMethodType::OrderPaymentMethodType()
{
}

OrderPaymentMethodType::OrderPaymentMethodType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderPaymentMethodType::~OrderPaymentMethodType()
{

}

void
OrderPaymentMethodType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderPaymentMethodType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



