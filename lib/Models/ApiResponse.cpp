

#include "ApiResponse.h"

using namespace Tiny;

ApiResponse::ApiResponse()
{
	status = ApiResponseStatusType();
}

ApiResponse::ApiResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ApiResponse::~ApiResponse()
{

}

void
ApiResponse::fromJson(std::string jsonObj)
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
ApiResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();


    return object;

}

ApiResponseStatusType
ApiResponse::getStatus()
{
	return status;
}

void
ApiResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}



