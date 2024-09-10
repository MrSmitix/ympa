

#include "OrdersStatsCommissionType.h"

using namespace Tiny;

OrdersStatsCommissionType::OrdersStatsCommissionType()
{
}

OrdersStatsCommissionType::OrdersStatsCommissionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsCommissionType::~OrdersStatsCommissionType()
{

}

void
OrdersStatsCommissionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrdersStatsCommissionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



