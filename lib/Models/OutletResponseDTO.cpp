

#include "OutletResponseDTO.h"

using namespace Tiny;

OutletResponseDTO::OutletResponseDTO()
{
	id = long(0);
}

OutletResponseDTO::OutletResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OutletResponseDTO::~OutletResponseDTO()
{

}

void
OutletResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }


}

bourne::json
OutletResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

long
OutletResponseDTO::getId()
{
	return id;
}

void
OutletResponseDTO::setId(long  id)
{
	this->id = id;
}



