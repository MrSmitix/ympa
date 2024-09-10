

#include "UnitDTO.h"

using namespace Tiny;

UnitDTO::UnitDTO()
{
	id = long(0);
	name = std::string();
	fullName = std::string();
}

UnitDTO::UnitDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UnitDTO::~UnitDTO()
{

}

void
UnitDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *fullNameKey = "fullName";

    if(object.has_key(fullNameKey))
    {
        bourne::json value = object[fullNameKey];



        jsonToValue(&fullName, value, "std::string");


    }


}

bourne::json
UnitDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["fullName"] = getFullName();



    return object;

}

long
UnitDTO::getId()
{
	return id;
}

void
UnitDTO::setId(long  id)
{
	this->id = id;
}

std::string
UnitDTO::getName()
{
	return name;
}

void
UnitDTO::setName(std::string  name)
{
	this->name = name;
}

std::string
UnitDTO::getFullName()
{
	return fullName;
}

void
UnitDTO::setFullName(std::string  fullName)
{
	this->fullName = fullName;
}



