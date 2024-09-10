

#include "GetQualityRatingDetailsResponse.h"

using namespace Tiny;

GetQualityRatingDetailsResponse::GetQualityRatingDetailsResponse()
{
	status = ApiResponseStatusType();
	result = QualityRatingDetailsDTO();
}

GetQualityRatingDetailsResponse::GetQualityRatingDetailsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetQualityRatingDetailsResponse::~GetQualityRatingDetailsResponse()
{

}

void
GetQualityRatingDetailsResponse::fromJson(std::string jsonObj)
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




        QualityRatingDetailsDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetQualityRatingDetailsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetQualityRatingDetailsResponse::getStatus()
{
	return status;
}

void
GetQualityRatingDetailsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

QualityRatingDetailsDTO
GetQualityRatingDetailsResponse::getResult()
{
	return result;
}

void
GetQualityRatingDetailsResponse::setResult(QualityRatingDetailsDTO  result)
{
	this->result = result;
}



