

#include "OrderVatType.h"

using namespace Tiny;

OrderVatType::OrderVatType()
{
}

OrderVatType::OrderVatType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderVatType::~OrderVatType()
{

}

void
OrderVatType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderVatType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



