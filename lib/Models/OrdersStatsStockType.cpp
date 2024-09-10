

#include "OrdersStatsStockType.h"

using namespace Tiny;

OrdersStatsStockType::OrdersStatsStockType()
{
}

OrdersStatsStockType::OrdersStatsStockType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsStockType::~OrdersStatsStockType()
{

}

void
OrdersStatsStockType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrdersStatsStockType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



