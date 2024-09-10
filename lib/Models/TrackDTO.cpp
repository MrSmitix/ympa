

#include "TrackDTO.h"

using namespace Tiny;

TrackDTO::TrackDTO()
{
	trackCode = std::string();
}

TrackDTO::TrackDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrackDTO::~TrackDTO()
{

}

void
TrackDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *trackCodeKey = "trackCode";

    if(object.has_key(trackCodeKey))
    {
        bourne::json value = object[trackCodeKey];



        jsonToValue(&trackCode, value, "std::string");


    }


}

bourne::json
TrackDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["trackCode"] = getTrackCode();



    return object;

}

std::string
TrackDTO::getTrackCode()
{
	return trackCode;
}

void
TrackDTO::setTrackCode(std::string  trackCode)
{
	this->trackCode = trackCode;
}



