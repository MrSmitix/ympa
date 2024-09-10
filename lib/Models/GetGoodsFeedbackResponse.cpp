

#include "GetGoodsFeedbackResponse.h"

using namespace Tiny;

GetGoodsFeedbackResponse::GetGoodsFeedbackResponse()
{
	status = ApiResponseStatusType();
	result = GoodsFeedbackListDTO();
}

GetGoodsFeedbackResponse::GetGoodsFeedbackResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetGoodsFeedbackResponse::~GetGoodsFeedbackResponse()
{

}

void
GetGoodsFeedbackResponse::fromJson(std::string jsonObj)
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




        GoodsFeedbackListDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetGoodsFeedbackResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetGoodsFeedbackResponse::getStatus()
{
	return status;
}

void
GetGoodsFeedbackResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GoodsFeedbackListDTO
GetGoodsFeedbackResponse::getResult()
{
	return result;
}

void
GetGoodsFeedbackResponse::setResult(GoodsFeedbackListDTO  result)
{
	this->result = result;
}



