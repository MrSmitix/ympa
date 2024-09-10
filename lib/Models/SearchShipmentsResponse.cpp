

#include "SearchShipmentsResponse.h"

using namespace Tiny;

SearchShipmentsResponse::SearchShipmentsResponse()
{
	status = ApiResponseStatusType();
	result = SearchShipmentsResponseDTO();
}

SearchShipmentsResponse::SearchShipmentsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SearchShipmentsResponse::~SearchShipmentsResponse()
{

}

void
SearchShipmentsResponse::fromJson(std::string jsonObj)
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




        SearchShipmentsResponseDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
SearchShipmentsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
SearchShipmentsResponse::getStatus()
{
	return status;
}

void
SearchShipmentsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

SearchShipmentsResponseDTO
SearchShipmentsResponse::getResult()
{
	return result;
}

void
SearchShipmentsResponse::setResult(SearchShipmentsResponseDTO  result)
{
	this->result = result;
}



