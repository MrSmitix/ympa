

#include "WarehouseStockType.h"

using namespace Tiny;

WarehouseStockType::WarehouseStockType()
{
}

WarehouseStockType::WarehouseStockType(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarehouseStockType::~WarehouseStockType()
{

}

void
WarehouseStockType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
WarehouseStockType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



