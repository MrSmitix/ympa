

#include "GetPricesResponse.h"

using namespace Tiny;

GetPricesResponse::GetPricesResponse()
{
	status = ApiResponseStatusType();
	result = OfferPriceListResponseDTO();
}

GetPricesResponse::GetPricesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPricesResponse::~GetPricesResponse()
{

}

void
GetPricesResponse::fromJson(std::string jsonObj)
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




        OfferPriceListResponseDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPricesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetPricesResponse::getStatus()
{
	return status;
}

void
GetPricesResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferPriceListResponseDTO
GetPricesResponse::getResult()
{
	return result;
}

void
GetPricesResponse::setResult(OfferPriceListResponseDTO  result)
{
	this->result = result;
}



