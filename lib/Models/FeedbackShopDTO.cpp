

#include "FeedbackShopDTO.h"

using namespace Tiny;

FeedbackShopDTO::FeedbackShopDTO()
{
	name = std::string();
}

FeedbackShopDTO::FeedbackShopDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackShopDTO::~FeedbackShopDTO()
{

}

void
FeedbackShopDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
FeedbackShopDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
FeedbackShopDTO::getName()
{
	return name;
}

void
FeedbackShopDTO::setName(std::string  name)
{
	this->name = name;
}



