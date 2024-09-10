

#include "DeletePromoOffersResponse.h"

using namespace Tiny;

DeletePromoOffersResponse::DeletePromoOffersResponse()
{
	status = ApiResponseStatusType();
	result = DeletePromoOffersResultDTO();
}

DeletePromoOffersResponse::DeletePromoOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePromoOffersResponse::~DeletePromoOffersResponse()
{

}

void
DeletePromoOffersResponse::fromJson(std::string jsonObj)
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




        DeletePromoOffersResultDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
DeletePromoOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();






	object["result"] = getResult().toJson();


    return object;

}

ApiResponseStatusType
DeletePromoOffersResponse::getStatus()
{
	return status;
}

void
DeletePromoOffersResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

DeletePromoOffersResultDTO
DeletePromoOffersResponse::getResult()
{
	return result;
}

void
DeletePromoOffersResponse::setResult(DeletePromoOffersResultDTO  result)
{
	this->result = result;
}



