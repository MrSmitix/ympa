

#include "OrderPaymentType.h"

using namespace Tiny;

OrderPaymentType::OrderPaymentType()
{
}

OrderPaymentType::OrderPaymentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderPaymentType::~OrderPaymentType()
{

}

void
OrderPaymentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderPaymentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



