

#include "ScrollingPagerDTO.h"

using namespace Tiny;

ScrollingPagerDTO::ScrollingPagerDTO()
{
	nextPageToken = std::string();
	prevPageToken = std::string();
}

ScrollingPagerDTO::ScrollingPagerDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScrollingPagerDTO::~ScrollingPagerDTO()
{

}

void
ScrollingPagerDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nextPageTokenKey = "nextPageToken";

    if(object.has_key(nextPageTokenKey))
    {
        bourne::json value = object[nextPageTokenKey];



        jsonToValue(&nextPageToken, value, "std::string");


    }

    const char *prevPageTokenKey = "prevPageToken";

    if(object.has_key(prevPageTokenKey))
    {
        bourne::json value = object[prevPageTokenKey];



        jsonToValue(&prevPageToken, value, "std::string");


    }


}

bourne::json
ScrollingPagerDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["nextPageToken"] = getNextPageToken();






    object["prevPageToken"] = getPrevPageToken();



    return object;

}

std::string
ScrollingPagerDTO::getNextPageToken()
{
	return nextPageToken;
}

void
ScrollingPagerDTO::setNextPageToken(std::string  nextPageToken)
{
	this->nextPageToken = nextPageToken;
}

std::string
ScrollingPagerDTO::getPrevPageToken()
{
	return prevPageToken;
}

void
ScrollingPagerDTO::setPrevPageToken(std::string  prevPageToken)
{
	this->prevPageToken = prevPageToken;
}



