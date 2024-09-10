

#include "GetPricesByOfferIdsResponse.h"

using namespace Tiny;

GetPricesByOfferIdsResponse::GetPricesByOfferIdsResponse()
{
	status = ApiResponseStatusType();
	result = OfferPriceByOfferIdsListResponseDTO();
}

GetPricesByOfferIdsResponse::GetPricesByOfferIdsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPricesByOfferIdsResponse::~GetPricesByOfferIdsResponse()
{

}

void
GetPricesByOfferIdsResponse::fromJson(std::string jsonObj)
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




        OfferPriceByOfferIdsListResponseDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetPricesByOfferIdsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
GetPricesByOfferIdsResponse::getStatus()
{
	return status;
}

void
GetPricesByOfferIdsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

OfferPriceByOfferIdsListResponseDTO
GetPricesByOfferIdsResponse::getResult()
{
	return result;
}

void
GetPricesByOfferIdsResponse::setResult(OfferPriceByOfferIdsListResponseDTO  result)
{
	this->result = result;
}



