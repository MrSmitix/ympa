

#include "GenerateReportResponse.h"

using namespace Tiny;

GenerateReportResponse::GenerateReportResponse()
{
	status = ApiResponseStatusType();
	result = GenerateReportDTO();
}

GenerateReportResponse::GenerateReportResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateReportResponse::~GenerateReportResponse()
{

}

void
GenerateReportResponse::fromJson(std::string jsonObj)
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




        GenerateReportDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GenerateReportResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GenerateReportResponse::getStatus()
{
	return status;
}

void
GenerateReportResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GenerateReportDTO
GenerateReportResponse::getResult()
{
	return result;
}

void
GenerateReportResponse::setResult(GenerateReportDTO  result)
{
	this->result = result;
}



