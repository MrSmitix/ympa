

#include "ModelDTO.h"

using namespace Tiny;

ModelDTO::ModelDTO()
{
	id = long(0);
	name = std::string();
	prices = ModelPriceDTO();
}

ModelDTO::ModelDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModelDTO::~ModelDTO()
{

}

void
ModelDTO::fromJson(std::string jsonObj)
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

    const char *pricesKey = "prices";

    if(object.has_key(pricesKey))
    {
        bourne::json value = object[pricesKey];




        ModelPriceDTO* obj = &prices;
		obj->fromJson(value.dump());

    }


}

bourne::json
ModelDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["prices"] = getPrices().toJson();


    return object;

}

long
ModelDTO::getId()
{
	return id;
}

void
ModelDTO::setId(long  id)
{
	this->id = id;
}

std::string
ModelDTO::getName()
{
	return name;
}

void
ModelDTO::setName(std::string  name)
{
	this->name = name;
}

ModelPriceDTO
ModelDTO::getPrices()
{
	return prices;
}

void
ModelDTO::setPrices(ModelPriceDTO  prices)
{
	this->prices = prices;
}



