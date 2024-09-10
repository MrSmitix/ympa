

#include "FeedIndexLogsFeedDTO.h"

using namespace Tiny;

FeedIndexLogsFeedDTO::FeedIndexLogsFeedDTO()
{
	id = long(0);
}

FeedIndexLogsFeedDTO::FeedIndexLogsFeedDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedIndexLogsFeedDTO::~FeedIndexLogsFeedDTO()
{

}

void
FeedIndexLogsFeedDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }


}

bourne::json
FeedIndexLogsFeedDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

long
FeedIndexLogsFeedDTO::getId()
{
	return id;
}

void
FeedIndexLogsFeedDTO::setId(long  id)
{
	this->id = id;
}



