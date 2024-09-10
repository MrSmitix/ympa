

#include "OrdersStatsPriceType.h"

using namespace Tiny;

OrdersStatsPriceType::OrdersStatsPriceType()
{
}

OrdersStatsPriceType::OrdersStatsPriceType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsPriceType::~OrdersStatsPriceType()
{

}

void
OrdersStatsPriceType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrdersStatsPriceType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



