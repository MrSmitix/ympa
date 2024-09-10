

#include "MaxSaleQuantumDTO.h"

using namespace Tiny;

MaxSaleQuantumDTO::MaxSaleQuantumDTO()
{
	id = long(0);
	name = std::string();
	maxSaleQuantum = int(0);
}

MaxSaleQuantumDTO::MaxSaleQuantumDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

MaxSaleQuantumDTO::~MaxSaleQuantumDTO()
{

}

void
MaxSaleQuantumDTO::fromJson(std::string jsonObj)
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

    const char *maxSaleQuantumKey = "maxSaleQuantum";

    if(object.has_key(maxSaleQuantumKey))
    {
        bourne::json value = object[maxSaleQuantumKey];



        jsonToValue(&maxSaleQuantum, value, "int");


    }


}

bourne::json
MaxSaleQuantumDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["maxSaleQuantum"] = getMaxSaleQuantum();



    return object;

}

long
MaxSaleQuantumDTO::getId()
{
	return id;
}

void
MaxSaleQuantumDTO::setId(long  id)
{
	this->id = id;
}

std::string
MaxSaleQuantumDTO::getName()
{
	return name;
}

void
MaxSaleQuantumDTO::setName(std::string  name)
{
	this->name = name;
}

int
MaxSaleQuantumDTO::getMaxSaleQuantum()
{
	return maxSaleQuantum;
}

void
MaxSaleQuantumDTO::setMaxSaleQuantum(int  maxSaleQuantum)
{
	this->maxSaleQuantum = maxSaleQuantum;
}



