

#include "SuggestPricesResponse.h"

using namespace Tiny;

SuggestPricesResponse::SuggestPricesResponse()
{
	status = ApiResponseStatusType();
	result = SuggestPricesResultDTO();
}

SuggestPricesResponse::SuggestPricesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuggestPricesResponse::~SuggestPricesResponse()
{

}

void
SuggestPricesResponse::fromJson(std::string jsonObj)
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




        SuggestPricesResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
SuggestPricesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
SuggestPricesResponse::getStatus()
{
	return status;
}

void
SuggestPricesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

SuggestPricesResultDTO
SuggestPricesResponse::getResult()
{
	return result;
}

void
SuggestPricesResponse::setResult(SuggestPricesResultDTO  result)
{
	this->result = result;
}



