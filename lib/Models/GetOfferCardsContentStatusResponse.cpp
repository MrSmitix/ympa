

#include "GetOfferCardsContentStatusResponse.h"

using namespace Tiny;

GetOfferCardsContentStatusResponse::GetOfferCardsContentStatusResponse()
{
	status = ApiResponseStatusType();
	result = OfferCardsContentStatusDTO();
}

GetOfferCardsContentStatusResponse::GetOfferCardsContentStatusResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferCardsContentStatusResponse::~GetOfferCardsContentStatusResponse()
{

}

void
GetOfferCardsContentStatusResponse::fromJson(std::string jsonObj)
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




        OfferCardsContentStatusDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetOfferCardsContentStatusResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetOfferCardsContentStatusResponse::getStatus()
{
	return status;
}

void
GetOfferCardsContentStatusResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferCardsContentStatusDTO
GetOfferCardsContentStatusResponse::getResult()
{
	return result;
}

void
GetOfferCardsContentStatusResponse::setResult(OfferCardsContentStatusDTO  result)
{
	this->result = result;
}



