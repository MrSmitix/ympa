

#include "VerifyOrderEacResponse.h"

using namespace Tiny;

VerifyOrderEacResponse::VerifyOrderEacResponse()
{
	status = ApiResponseStatusType();
	result = EacVerificationResultDTO();
}

VerifyOrderEacResponse::VerifyOrderEacResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

VerifyOrderEacResponse::~VerifyOrderEacResponse()
{

}

void
VerifyOrderEacResponse::fromJson(std::string jsonObj)
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




        EacVerificationResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
VerifyOrderEacResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
VerifyOrderEacResponse::getStatus()
{
	return status;
}

void
VerifyOrderEacResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

EacVerificationResultDTO
VerifyOrderEacResponse::getResult()
{
	return result;
}

void
VerifyOrderEacResponse::setResult(EacVerificationResultDTO  result)
{
	this->result = result;
}



