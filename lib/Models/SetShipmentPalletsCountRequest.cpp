

#include "SetShipmentPalletsCountRequest.h"

using namespace Tiny;

SetShipmentPalletsCountRequest::SetShipmentPalletsCountRequest()
{
	placesCount = int(0);
}

SetShipmentPalletsCountRequest::SetShipmentPalletsCountRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetShipmentPalletsCountRequest::~SetShipmentPalletsCountRequest()
{

}

void
SetShipmentPalletsCountRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *placesCountKey = "placesCount";

    if(object.has_key(placesCountKey))
    {
        bourne::json value = object[placesCountKey];



        jsonToValue(&placesCount, value, "int");


    }


}

bourne::json
SetShipmentPalletsCountRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["placesCount"] = getPlacesCount();



    return object;

}

int
SetShipmentPalletsCountRequest::getPlacesCount()
{
	return placesCount;
}

void
SetShipmentPalletsCountRequest::setPlacesCount(int  placesCount)
{
	this->placesCount = placesCount;
}



