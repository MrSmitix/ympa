

#include "WarehouseStockDTO.h"

using namespace Tiny;

WarehouseStockDTO::WarehouseStockDTO()
{
	type = WarehouseStockType();
	count = long(0);
}

WarehouseStockDTO::WarehouseStockDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarehouseStockDTO::~WarehouseStockDTO()
{

}

void
WarehouseStockDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        WarehouseStockType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "long");


    }


}

bourne::json
WarehouseStockDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["count"] = getCount();



    return object;

}

WarehouseStockType
WarehouseStockDTO::getType()
{
	return type;
}

void
WarehouseStockDTO::setType(WarehouseStockType  type)
{
	this->type = type;
}

long
WarehouseStockDTO::getCount()
{
	return count;
}

void
WarehouseStockDTO::setCount(long  count)
{
	this->count = count;
}



