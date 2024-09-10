

#include "AddOffersToArchiveResponse.h"

using namespace Tiny;

AddOffersToArchiveResponse::AddOffersToArchiveResponse()
{
	status = ApiResponseStatusType();
	result = AddOffersToArchiveDTO();
}

AddOffersToArchiveResponse::AddOffersToArchiveResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AddOffersToArchiveResponse::~AddOffersToArchiveResponse()
{

}

void
AddOffersToArchiveResponse::fromJson(std::string jsonObj)
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




        AddOffersToArchiveDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
AddOffersToArchiveResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
AddOffersToArchiveResponse::getStatus()
{
	return status;
}

void
AddOffersToArchiveResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

AddOffersToArchiveDTO
AddOffersToArchiveResponse::getResult()
{
	return result;
}

void
AddOffersToArchiveResponse::setResult(AddOffersToArchiveDTO  result)
{
	this->result = result;
}



