

#include "BusinessDTO.h"

using namespace Tiny;

BusinessDTO::BusinessDTO()
{
	id = long(0);
	name = std::string();
}

BusinessDTO::BusinessDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessDTO::~BusinessDTO()
{

}

void
BusinessDTO::fromJson(std::string jsonObj)
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


}

bourne::json
BusinessDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

long
BusinessDTO::getId()
{
	return id;
}

void
BusinessDTO::setId(long  id)
{
	this->id = id;
}

std::string
BusinessDTO::getName()
{
	return name;
}

void
BusinessDTO::setName(std::string  name)
{
	this->name = name;
}



