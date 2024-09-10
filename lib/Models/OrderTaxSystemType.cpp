

#include "OrderTaxSystemType.h"

using namespace Tiny;

OrderTaxSystemType::OrderTaxSystemType()
{
}

OrderTaxSystemType::OrderTaxSystemType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderTaxSystemType::~OrderTaxSystemType()
{

}

void
OrderTaxSystemType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderTaxSystemType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



