

#include "OrderItemSubsidyType.h"

using namespace Tiny;

OrderItemSubsidyType::OrderItemSubsidyType()
{
}

OrderItemSubsidyType::OrderItemSubsidyType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemSubsidyType::~OrderItemSubsidyType()
{

}

void
OrderItemSubsidyType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderItemSubsidyType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



