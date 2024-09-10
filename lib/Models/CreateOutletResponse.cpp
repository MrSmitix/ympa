

#include "CreateOutletResponse.h"

using namespace Tiny;

CreateOutletResponse::CreateOutletResponse()
{
	status = ApiResponseStatusType();
	result = OutletResponseDTO();
}

CreateOutletResponse::CreateOutletResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateOutletResponse::~CreateOutletResponse()
{

}

void
CreateOutletResponse::fromJson(std::string jsonObj)
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




        OutletResponseDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateOutletResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
CreateOutletResponse::getStatus()
{
	return status;
}

void
CreateOutletResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OutletResponseDTO
CreateOutletResponse::getResult()
{
	return result;
}

void
CreateOutletResponse::setResult(OutletResponseDTO  result)
{
	this->result = result;
}



