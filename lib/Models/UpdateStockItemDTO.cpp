

#include "UpdateStockItemDTO.h"

using namespace Tiny;

UpdateStockItemDTO::UpdateStockItemDTO()
{
	count = long(0);
	updatedAt = std::string();
}

UpdateStockItemDTO::UpdateStockItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateStockItemDTO::~UpdateStockItemDTO()
{

}

void
UpdateStockItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "long");


    }

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
UpdateStockItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["updatedAt"] = getUpdatedAt();



    return object;

}

long
UpdateStockItemDTO::getCount()
{
	return count;
}

void
UpdateStockItemDTO::setCount(long  count)
{
	this->count = count;
}

std::string
UpdateStockItemDTO::getUpdatedAt()
{
	return updatedAt;
}

void
UpdateStockItemDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



