

#include "OrderItemsModificationRequestReasonType.h"

using namespace Tiny;

OrderItemsModificationRequestReasonType::OrderItemsModificationRequestReasonType()
{
}

OrderItemsModificationRequestReasonType::OrderItemsModificationRequestReasonType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderItemsModificationRequestReasonType::~OrderItemsModificationRequestReasonType()
{

}

void
OrderItemsModificationRequestReasonType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderItemsModificationRequestReasonType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



