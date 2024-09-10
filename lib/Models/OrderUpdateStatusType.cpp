

#include "OrderUpdateStatusType.h"

using namespace Tiny;

OrderUpdateStatusType::OrderUpdateStatusType()
{
}

OrderUpdateStatusType::OrderUpdateStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderUpdateStatusType::~OrderUpdateStatusType()
{

}

void
OrderUpdateStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderUpdateStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



