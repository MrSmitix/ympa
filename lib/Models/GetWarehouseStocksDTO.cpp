

#include "GetWarehouseStocksDTO.h"

using namespace Tiny;

GetWarehouseStocksDTO::GetWarehouseStocksDTO()
{
	paging = ScrollingPagerDTO();
	warehouses = std::list<WarehouseOffersDTO>();
}

GetWarehouseStocksDTO::GetWarehouseStocksDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetWarehouseStocksDTO::~GetWarehouseStocksDTO()
{

}

void
GetWarehouseStocksDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pagingKey = "paging";

    if(object.has_key(pagingKey))
    {
        bourne::json value = object[pagingKey];




        ScrollingPagerDTO* obj = &paging;
		obj->fromJson(value.dump());

    }

    const char *warehousesKey = "warehouses";

    if(object.has_key(warehousesKey))
    {
        bourne::json value = object[warehousesKey];


        std::list<WarehouseOffersDTO> warehouses_list;
        WarehouseOffersDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warehouses_list.push_back(element);
        }
        warehouses = warehouses_list;


    }


}

bourne::json
GetWarehouseStocksDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["paging"] = getPaging().toJson();




    std::list<WarehouseOffersDTO> warehouses_list = getWarehouses();
    bourne::json warehouses_arr = bourne::json::array();

    for(auto& var : warehouses_list)
    {
        WarehouseOffersDTO obj = var;
        warehouses_arr.append(obj.toJson());
    }
    object["warehouses"] = warehouses_arr;




    return object;

}

ScrollingPagerDTO
GetWarehouseStocksDTO::getPaging()
{
	return paging;
}

void
GetWarehouseStocksDTO::setPaging(ScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<WarehouseOffersDTO>
GetWarehouseStocksDTO::getWarehouses()
{
	return warehouses;
}

void
GetWarehouseStocksDTO::setWarehouses(std::list <WarehouseOffersDTO> warehouses)
{
	this->warehouses = warehouses;
}



