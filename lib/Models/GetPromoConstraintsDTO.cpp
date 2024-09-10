

#include "GetPromoConstraintsDTO.h"

using namespace Tiny;

GetPromoConstraintsDTO::GetPromoConstraintsDTO()
{
	warehouseIds = std::list<long>();
}

GetPromoConstraintsDTO::GetPromoConstraintsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetPromoConstraintsDTO::~GetPromoConstraintsDTO()
{

}

void
GetPromoConstraintsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *warehouseIdsKey = "warehouseIds";

    if(object.has_key(warehouseIdsKey))
    {
        bourne::json value = object[warehouseIdsKey];


        std::list<long> warehouseIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            warehouseIds_list.push_back(element);
        }
        warehouseIds = warehouseIds_list;


    }


}

bourne::json
GetPromoConstraintsDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> warehouseIds_list = getWarehouseIds();
    bourne::json warehouseIds_arr = bourne::json::array();

    for(auto& var : warehouseIds_list)
    {
        warehouseIds_arr.append(var);
    }
    object["warehouseIds"] = warehouseIds_arr;






    return object;

}

std::list<long>
GetPromoConstraintsDTO::getWarehouseIds()
{
	return warehouseIds;
}

void
GetPromoConstraintsDTO::setWarehouseIds(std::list <long> warehouseIds)
{
	this->warehouseIds = warehouseIds;
}



