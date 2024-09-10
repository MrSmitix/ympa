

#include "SetOrderBoxLayoutResponse.h"

using namespace Tiny;

SetOrderBoxLayoutResponse::SetOrderBoxLayoutResponse()
{
	status = ApiResponseStatusType();
	result = OrderBoxesLayoutDTO();
}

SetOrderBoxLayoutResponse::SetOrderBoxLayoutResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetOrderBoxLayoutResponse::~SetOrderBoxLayoutResponse()
{

}

void
SetOrderBoxLayoutResponse::fromJson(std::string jsonObj)
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




        OrderBoxesLayoutDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
SetOrderBoxLayoutResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
SetOrderBoxLayoutResponse::getStatus()
{
	return status;
}

void
SetOrderBoxLayoutResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OrderBoxesLayoutDTO
SetOrderBoxLayoutResponse::getResult()
{
	return result;
}

void
SetOrderBoxLayoutResponse::setResult(OrderBoxesLayoutDTO  result)
{
	this->result = result;
}



