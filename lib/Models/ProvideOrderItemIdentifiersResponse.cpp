

#include "ProvideOrderItemIdentifiersResponse.h"

using namespace Tiny;

ProvideOrderItemIdentifiersResponse::ProvideOrderItemIdentifiersResponse()
{
	status = ApiResponseStatusType();
	result = OrderItemsModificationResultDTO();
}

ProvideOrderItemIdentifiersResponse::ProvideOrderItemIdentifiersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProvideOrderItemIdentifiersResponse::~ProvideOrderItemIdentifiersResponse()
{

}

void
ProvideOrderItemIdentifiersResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ApiResponseStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *resultKey = "result";

    if(object.has_key(resultKey))
    {
        bourne::json value = object[resultKey];




        OrderItemsModificationResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProvideOrderItemIdentifiersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
ProvideOrderItemIdentifiersResponse::getStatus()
{
	return status;
}

void
ProvideOrderItemIdentifiersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OrderItemsModificationResultDTO
ProvideOrderItemIdentifiersResponse::getResult()
{
	return result;
}

void
ProvideOrderItemIdentifiersResponse::setResult(OrderItemsModificationResultDTO  result)
{
	this->result = result;
}



