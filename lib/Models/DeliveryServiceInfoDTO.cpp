

#include "DeliveryServiceInfoDTO.h"

using namespace Tiny;

DeliveryServiceInfoDTO::DeliveryServiceInfoDTO()
{
	id = long(0);
	name = std::string();
}

DeliveryServiceInfoDTO::DeliveryServiceInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeliveryServiceInfoDTO::~DeliveryServiceInfoDTO()
{

}

void
DeliveryServiceInfoDTO::fromJson(std::string jsonObj)
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
DeliveryServiceInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

long
DeliveryServiceInfoDTO::getId()
{
	return id;
}

void
DeliveryServiceInfoDTO::setId(long  id)
{
	this->id = id;
}

std::string
DeliveryServiceInfoDTO::getName()
{
	return name;
}

void
DeliveryServiceInfoDTO::setName(std::string  name)
{
	this->name = name;
}



