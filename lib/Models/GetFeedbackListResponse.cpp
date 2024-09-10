

#include "GetFeedbackListResponse.h"

using namespace Tiny;

GetFeedbackListResponse::GetFeedbackListResponse()
{
	status = ApiResponseStatusType();
	result = FeedbackListDTO();
}

GetFeedbackListResponse::GetFeedbackListResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetFeedbackListResponse::~GetFeedbackListResponse()
{

}

void
GetFeedbackListResponse::fromJson(std::string jsonObj)
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




        FeedbackListDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetFeedbackListResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetFeedbackListResponse::getStatus()
{
	return status;
}

void
GetFeedbackListResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

FeedbackListDTO
GetFeedbackListResponse::getResult()
{
	return result;
}

void
GetFeedbackListResponse::setResult(FeedbackListDTO  result)
{
	this->result = result;
}



