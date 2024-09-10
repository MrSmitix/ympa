

#include "GetReportInfoResponse.h"

using namespace Tiny;

GetReportInfoResponse::GetReportInfoResponse()
{
	status = ApiResponseStatusType();
	result = ReportInfoDTO();
}

GetReportInfoResponse::GetReportInfoResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetReportInfoResponse::~GetReportInfoResponse()
{

}

void
GetReportInfoResponse::fromJson(std::string jsonObj)
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




        ReportInfoDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetReportInfoResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetReportInfoResponse::getStatus()
{
	return status;
}

void
GetReportInfoResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

ReportInfoDTO
GetReportInfoResponse::getResult()
{
	return result;
}

void
GetReportInfoResponse::setResult(ReportInfoDTO  result)
{
	this->result = result;
}



