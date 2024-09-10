

#include "UpdatePromoOffersResponse.h"

using namespace Tiny;

UpdatePromoOffersResponse::UpdatePromoOffersResponse()
{
	status = ApiResponseStatusType();
	result = UpdatePromoOffersResultDTO();
}

UpdatePromoOffersResponse::UpdatePromoOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePromoOffersResponse::~UpdatePromoOffersResponse()
{

}

void
UpdatePromoOffersResponse::fromJson(std::string jsonObj)
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




        UpdatePromoOffersResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdatePromoOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
UpdatePromoOffersResponse::getStatus()
{
	return status;
}

void
UpdatePromoOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

UpdatePromoOffersResultDTO
UpdatePromoOffersResponse::getResult()
{
	return result;
}

void
UpdatePromoOffersResponse::setResult(UpdatePromoOffersResultDTO  result)
{
	this->result = result;
}



