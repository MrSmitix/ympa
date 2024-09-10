

#include "UpdateGoodsFeedbackCommentResponse.h"

using namespace Tiny;

UpdateGoodsFeedbackCommentResponse::UpdateGoodsFeedbackCommentResponse()
{
	status = ApiResponseStatusType();
	result = GoodsFeedbackCommentDTO();
}

UpdateGoodsFeedbackCommentResponse::UpdateGoodsFeedbackCommentResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateGoodsFeedbackCommentResponse::~UpdateGoodsFeedbackCommentResponse()
{

}

void
UpdateGoodsFeedbackCommentResponse::fromJson(std::string jsonObj)
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




        GoodsFeedbackCommentDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateGoodsFeedbackCommentResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
UpdateGoodsFeedbackCommentResponse::getStatus()
{
	return status;
}

void
UpdateGoodsFeedbackCommentResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GoodsFeedbackCommentDTO
UpdateGoodsFeedbackCommentResponse::getResult()
{
	return result;
}

void
UpdateGoodsFeedbackCommentResponse::setResult(GoodsFeedbackCommentDTO  result)
{
	this->result = result;
}



