

#include "ConfirmShipmentRequest.h"

using namespace Tiny;

ConfirmShipmentRequest::ConfirmShipmentRequest()
{
	externalShipmentId = std::string();
}

ConfirmShipmentRequest::ConfirmShipmentRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConfirmShipmentRequest::~ConfirmShipmentRequest()
{

}

void
ConfirmShipmentRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *externalShipmentIdKey = "externalShipmentId";

    if(object.has_key(externalShipmentIdKey))
    {
        bourne::json value = object[externalShipmentIdKey];



        jsonToValue(&externalShipmentId, value, "std::string");


    }


}

bourne::json
ConfirmShipmentRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["externalShipmentId"] = getExternalShipmentId();



    return object;

}

std::string
ConfirmShipmentRequest::getExternalShipmentId()
{
	return externalShipmentId;
}

void
ConfirmShipmentRequest::setExternalShipmentId(std::string  externalShipmentId)
{
	this->externalShipmentId = externalShipmentId;
}



