

#include "OrderParcelBoxDTO.h"

using namespace Tiny;

OrderParcelBoxDTO::OrderParcelBoxDTO()
{
	id = long(0);
	fulfilmentId = std::string();
}

OrderParcelBoxDTO::OrderParcelBoxDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderParcelBoxDTO::~OrderParcelBoxDTO()
{

}

void
OrderParcelBoxDTO::fromJson(std::string jsonObj)
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
OrderParcelBoxDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["fulfilmentId"] = getFulfilmentId();



    return object;

}

long
OrderParcelBoxDTO::getId()
{
	return id;
}

void
OrderParcelBoxDTO::setId(long  id)
{
	this->id = id;
}

std::string
OrderParcelBoxDTO::getFulfilmentId()
{
	return fulfilmentId;
}

void
OrderParcelBoxDTO::setFulfilmentId(std::string  fulfilmentId)
{
	this->fulfilmentId = fulfilmentId;
}



