

#include "OrdersStatsItemStatusType.h"

using namespace Tiny;

OrdersStatsItemStatusType::OrdersStatsItemStatusType()
{
}

OrdersStatsItemStatusType::OrdersStatsItemStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsItemStatusType::~OrdersStatsItemStatusType()
{

}

void
OrdersStatsItemStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrdersStatsItemStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



