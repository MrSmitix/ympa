

#include "DeleteOffersResponse.h"

using namespace Tiny;

DeleteOffersResponse::DeleteOffersResponse()
{
	status = ApiResponseStatusType();
	result = DeleteOffersDTO();
}

DeleteOffersResponse::DeleteOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteOffersResponse::~DeleteOffersResponse()
{

}

void
DeleteOffersResponse::fromJson(std::string jsonObj)
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




        DeleteOffersDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
DeleteOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
DeleteOffersResponse::getStatus()
{
	return status;
}

void
DeleteOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

DeleteOffersDTO
DeleteOffersResponse::getResult()
{
	return result;
}

void
DeleteOffersResponse::setResult(DeleteOffersDTO  result)
{
	this->result = result;
}



