

#include "GetFeedIndexLogsResponse.h"

using namespace Tiny;

GetFeedIndexLogsResponse::GetFeedIndexLogsResponse()
{
	status = ApiResponseStatusType();
	result = FeedIndexLogsResultDTO();
}

GetFeedIndexLogsResponse::GetFeedIndexLogsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetFeedIndexLogsResponse::~GetFeedIndexLogsResponse()
{

}

void
GetFeedIndexLogsResponse::fromJson(std::string jsonObj)
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




        FeedIndexLogsResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetFeedIndexLogsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetFeedIndexLogsResponse::getStatus()
{
	return status;
}

void
GetFeedIndexLogsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

FeedIndexLogsResultDTO
GetFeedIndexLogsResponse::getResult()
{
	return result;
}

void
GetFeedIndexLogsResponse::setResult(FeedIndexLogsResultDTO  result)
{
	this->result = result;
}



