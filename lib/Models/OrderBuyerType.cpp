

#include "OrderBuyerType.h"

using namespace Tiny;

OrderBuyerType::OrderBuyerType()
{
}

OrderBuyerType::OrderBuyerType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBuyerType::~OrderBuyerType()
{

}

void
OrderBuyerType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderBuyerType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



