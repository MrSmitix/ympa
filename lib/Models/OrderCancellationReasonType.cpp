

#include "OrderCancellationReasonType.h"

using namespace Tiny;

OrderCancellationReasonType::OrderCancellationReasonType()
{
}

OrderCancellationReasonType::OrderCancellationReasonType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderCancellationReasonType::~OrderCancellationReasonType()
{

}

void
OrderCancellationReasonType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderCancellationReasonType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



