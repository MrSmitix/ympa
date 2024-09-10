

#include "FeedContentErrorDTO.h"

using namespace Tiny;

FeedContentErrorDTO::FeedContentErrorDTO()
{
	type = FeedContentErrorType();
}

FeedContentErrorDTO::FeedContentErrorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedContentErrorDTO::~FeedContentErrorDTO()
{

}

void
FeedContentErrorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        FeedContentErrorType* obj = &type;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedContentErrorDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();


    return object;

}

FeedContentErrorType
FeedContentErrorDTO::getType()
{
	return type;
}

void
FeedContentErrorDTO::setType(FeedContentErrorType  type)
{
	this->type = type;
}



