

#include "DeleteOffersFromArchiveResponse.h"

using namespace Tiny;

DeleteOffersFromArchiveResponse::DeleteOffersFromArchiveResponse()
{
	status = ApiResponseStatusType();
	result = DeleteOffersFromArchiveDTO();
}

DeleteOffersFromArchiveResponse::DeleteOffersFromArchiveResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteOffersFromArchiveResponse::~DeleteOffersFromArchiveResponse()
{

}

void
DeleteOffersFromArchiveResponse::fromJson(std::string jsonObj)
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




        DeleteOffersFromArchiveDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
DeleteOffersFromArchiveResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
DeleteOffersFromArchiveResponse::getStatus()
{
	return status;
}

void
DeleteOffersFromArchiveResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

DeleteOffersFromArchiveDTO
DeleteOffersFromArchiveResponse::getResult()
{
	return result;
}

void
DeleteOffersFromArchiveResponse::setResult(DeleteOffersFromArchiveDTO  result)
{
	this->result = result;
}



