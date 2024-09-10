

#include "OrdersStatsPaymentSourceType.h"

using namespace Tiny;

OrdersStatsPaymentSourceType::OrdersStatsPaymentSourceType()
{
}

OrdersStatsPaymentSourceType::OrdersStatsPaymentSourceType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsPaymentSourceType::~OrdersStatsPaymentSourceType()
{

}

void
OrdersStatsPaymentSourceType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrdersStatsPaymentSourceType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



