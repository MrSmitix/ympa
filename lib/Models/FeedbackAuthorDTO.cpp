

#include "FeedbackAuthorDTO.h"

using namespace Tiny;

FeedbackAuthorDTO::FeedbackAuthorDTO()
{
	name = std::string();
	region = RegionDTO();
}

FeedbackAuthorDTO::FeedbackAuthorDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackAuthorDTO::~FeedbackAuthorDTO()
{

}

void
FeedbackAuthorDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];




        RegionDTO* obj = &region;
		obj->fromJson(value.dump());

    }


}

bourne::json
FeedbackAuthorDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["region"] = getRegion().toJson();


    return object;

}

std::string
FeedbackAuthorDTO::getName()
{
	return name;
}

void
FeedbackAuthorDTO::setName(std::string  name)
{
	this->name = name;
}

RegionDTO
FeedbackAuthorDTO::getRegion()
{
	return region;
}

void
FeedbackAuthorDTO::setRegion(RegionDTO  region)
{
	this->region = region;
}



