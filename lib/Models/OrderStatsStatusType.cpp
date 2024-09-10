

#include "OrderStatsStatusType.h"

using namespace Tiny;

OrderStatsStatusType::OrderStatsStatusType()
{
}

OrderStatsStatusType::OrderStatsStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderStatsStatusType::~OrderStatsStatusType()
{

}

void
OrderStatsStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderStatsStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



