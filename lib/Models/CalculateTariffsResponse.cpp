

#include "CalculateTariffsResponse.h"

using namespace Tiny;

CalculateTariffsResponse::CalculateTariffsResponse()
{
	status = ApiResponseStatusType();
	result = CalculateTariffsResponseDTO();
}

CalculateTariffsResponse::CalculateTariffsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CalculateTariffsResponse::~CalculateTariffsResponse()
{

}

void
CalculateTariffsResponse::fromJson(std::string jsonObj)
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




        CalculateTariffsResponseDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
CalculateTariffsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
CalculateTariffsResponse::getStatus()
{
	return status;
}

void
CalculateTariffsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

CalculateTariffsResponseDTO
CalculateTariffsResponse::getResult()
{
	return result;
}

void
CalculateTariffsResponse::setResult(CalculateTariffsResponseDTO  result)
{
	this->result = result;
}



