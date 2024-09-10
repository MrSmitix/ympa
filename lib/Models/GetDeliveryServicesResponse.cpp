

#include "GetDeliveryServicesResponse.h"

using namespace Tiny;

GetDeliveryServicesResponse::GetDeliveryServicesResponse()
{
	result = DeliveryServicesDTO();
}

GetDeliveryServicesResponse::GetDeliveryServicesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetDeliveryServicesResponse::~GetDeliveryServicesResponse()
{

}

void
GetDeliveryServicesResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *resultKey = "result";

    if(object.has_key(resultKey))
    {
        bourne::json value = object[resultKey];




        DeliveryServicesDTO* obj = &result;
		obj->fromJson(value.dump());

    }


}

bourne::json
GetDeliveryServicesResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["result"] = getResult().toJson();


    return object;

}

DeliveryServicesDTO
GetDeliveryServicesResponse::getResult()
{
	return result;
}

void
GetDeliveryServicesResponse::setResult(DeliveryServicesDTO  result)
{
	this->result = result;
}



