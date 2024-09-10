

#include "GetPromoOffersResponse.h"

using namespace Tiny;

GetPromoOffersResponse::GetPromoOffersResponse()
{
	status = ApiResponseStatusType();
	result = GetPromoOffersResultDTO();
}

GetPromoOffersResponse::GetPromoOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoOffersResponse::~GetPromoOffersResponse()
{

}

void
GetPromoOffersResponse::fromJson(std::string jsonObj)
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




        GetPromoOffersResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPromoOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetPromoOffersResponse::getStatus()
{
	return status;
}

void
GetPromoOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

GetPromoOffersResultDTO
GetPromoOffersResponse::getResult()
{
	return result;
}

void
GetPromoOffersResponse::setResult(GetPromoOffersResultDTO  result)
{
	this->result = result;
}



