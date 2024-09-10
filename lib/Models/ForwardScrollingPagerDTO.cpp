

#include "ForwardScrollingPagerDTO.h"

using namespace Tiny;

ForwardScrollingPagerDTO::ForwardScrollingPagerDTO()
{
	nextPageToken = std::string();
}

ForwardScrollingPagerDTO::ForwardScrollingPagerDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ForwardScrollingPagerDTO::~ForwardScrollingPagerDTO()
{

}

void
ForwardScrollingPagerDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nextPageTokenKey = "nextPageToken";

    if(object.has_key(nextPageTokenKey))
    {
        bourne::json value = object[nextPageTokenKey];



        jsonToValue(&nextPageToken, value, "std::string");


    }


}

bourne::json
ForwardScrollingPagerDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["nextPageToken"] = getNextPageToken();



    return object;

}

std::string
ForwardScrollingPagerDTO::getNextPageToken()
{
	return nextPageToken;
}

void
ForwardScrollingPagerDTO::setNextPageToken(std::string  nextPageToken)
{
	this->nextPageToken = nextPageToken;
}



