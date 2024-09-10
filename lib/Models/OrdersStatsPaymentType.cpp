

#include "OrdersStatsPaymentType.h"

using namespace Tiny;

OrdersStatsPaymentType::OrdersStatsPaymentType()
{
}

OrdersStatsPaymentType::OrdersStatsPaymentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsPaymentType::~OrdersStatsPaymentType()
{

}

void
OrdersStatsPaymentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrdersStatsPaymentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



