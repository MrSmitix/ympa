

#include "EmptyApiResponse.h"

using namespace Tiny;

EmptyApiResponse::EmptyApiResponse()
{
	status = ApiResponseStatusType();
}

EmptyApiResponse::EmptyApiResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

EmptyApiResponse::~EmptyApiResponse()
{

}

void
EmptyApiResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ApiResponseStatusType* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
EmptyApiResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();


    return object;

}

ApiResponseStatusType
EmptyApiResponse::getStatus()
{
	return status;
}

void
EmptyApiResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}



