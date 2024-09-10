

#include "OrdersStatsOrderPaymentType.h"

using namespace Tiny;

OrdersStatsOrderPaymentType::OrdersStatsOrderPaymentType()
{
}

OrdersStatsOrderPaymentType::OrdersStatsOrderPaymentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsOrderPaymentType::~OrdersStatsOrderPaymentType()
{

}

void
OrdersStatsOrderPaymentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrdersStatsOrderPaymentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



