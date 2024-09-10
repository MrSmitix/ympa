

#include "UpdateTimeDTO.h"

using namespace Tiny;

UpdateTimeDTO::UpdateTimeDTO()
{
	updatedAt = std::string();
}

UpdateTimeDTO::UpdateTimeDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateTimeDTO::~UpdateTimeDTO()
{

}

void
UpdateTimeDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
UpdateTimeDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["updatedAt"] = getUpdatedAt();



    return object;

}

std::string
UpdateTimeDTO::getUpdatedAt()
{
	return updatedAt;
}

void
UpdateTimeDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



