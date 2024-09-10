

#include "ParcelBoxDTO.h"

using namespace Tiny;

ParcelBoxDTO::ParcelBoxDTO()
{
	id = long(0);
	fulfilmentId = std::string();
}

ParcelBoxDTO::ParcelBoxDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ParcelBoxDTO::~ParcelBoxDTO()
{

}

void
ParcelBoxDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *fulfilmentIdKey = "fulfilmentId";

    if(object.has_key(fulfilmentIdKey))
    {
        bourne::json value = object[fulfilmentIdKey];



        jsonToValue(&fulfilmentId, value, "std::string");


    }


}

bourne::json
ParcelBoxDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["fulfilmentId"] = getFulfilmentId();



    return object;

}

long
ParcelBoxDTO::getId()
{
	return id;
}

void
ParcelBoxDTO::setId(long  id)
{
	this->id = id;
}

std::string
ParcelBoxDTO::getFulfilmentId()
{
	return fulfilmentId;
}

void
ParcelBoxDTO::setFulfilmentId(std::string  fulfilmentId)
{
	this->fulfilmentId = fulfilmentId;
}



