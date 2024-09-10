

#include "GpsDTO.h"

using namespace Tiny;

GpsDTO::GpsDTO()
{
	latitude = float(0);
	longitude = float(0);
}

GpsDTO::GpsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GpsDTO::~GpsDTO()
{

}

void
GpsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *latitudeKey = "latitude";

    if(object.has_key(latitudeKey))
    {
        bourne::json value = object[latitudeKey];



        jsonToValue(&latitude, value, "long");


    }

    const char *longitudeKey = "longitude";

    if(object.has_key(longitudeKey))
    {
        bourne::json value = object[longitudeKey];



        jsonToValue(&longitude, value, "long");


    }


}

bourne::json
GpsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["latitude"] = getLatitude();






    object["longitude"] = getLongitude();



    return object;

}

long
GpsDTO::getLatitude()
{
	return latitude;
}

void
GpsDTO::setLatitude(long  latitude)
{
	this->latitude = latitude;
}

long
GpsDTO::getLongitude()
{
	return longitude;
}

void
GpsDTO::setLongitude(long  longitude)
{
	this->longitude = longitude;
}



