

#include "DeliveryServiceDTO.h"

using namespace Tiny;

DeliveryServiceDTO::DeliveryServiceDTO()
{
	id = long(0);
	name = std::string();
}

DeliveryServiceDTO::DeliveryServiceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeliveryServiceDTO::~DeliveryServiceDTO()
{

}

void
DeliveryServiceDTO::fromJson(std::string jsonObj)
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
DeliveryServiceDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

long
DeliveryServiceDTO::getId()
{
	return id;
}

void
DeliveryServiceDTO::setId(long  id)
{
	this->id = id;
}

std::string
DeliveryServiceDTO::getName()
{
	return name;
}

void
DeliveryServiceDTO::setName(std::string  name)
{
	this->name = name;
}



