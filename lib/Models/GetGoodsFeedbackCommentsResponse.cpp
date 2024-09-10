

#include "GetGoodsFeedbackCommentsResponse.h"

using namespace Tiny;

GetGoodsFeedbackCommentsResponse::GetGoodsFeedbackCommentsResponse()
{
	status = ApiResponseStatusType();
	result = GoodsFeedbackCommentListDTO();
}

GetGoodsFeedbackCommentsResponse::GetGoodsFeedbackCommentsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetGoodsFeedbackCommentsResponse::~GetGoodsFeedbackCommentsResponse()
{

}

void
GetGoodsFeedbackCommentsResponse::fromJson(std::string jsonObj)
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




        GoodsFeedbackCommentListDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetGoodsFeedbackCommentsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetGoodsFeedbackCommentsResponse::getStatus()
{
	return status;
}

void
GetGoodsFeedbackCommentsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GoodsFeedbackCommentListDTO
GetGoodsFeedbackCommentsResponse::getResult()
{
	return result;
}

void
GetGoodsFeedbackCommentsResponse::setResult(GoodsFeedbackCommentListDTO  result)
{
	this->result = result;
}



