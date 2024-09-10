

#include "GoodsStatsWarehouseDTO.h"

using namespace Tiny;

GoodsStatsWarehouseDTO::GoodsStatsWarehouseDTO()
{
	id = long(0);
	name = std::string();
	stocks = std::list<WarehouseStockDTO>();
}

GoodsStatsWarehouseDTO::GoodsStatsWarehouseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsStatsWarehouseDTO::~GoodsStatsWarehouseDTO()
{

}

void
GoodsStatsWarehouseDTO::fromJson(std::string jsonObj)
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

    const char *stocksKey = "stocks";

    if(object.has_key(stocksKey))
    {
        bourne::json value = object[stocksKey];


        std::list<WarehouseStockDTO> stocks_list;
        WarehouseStockDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            stocks_list.push_back(element);
        }
        stocks = stocks_list;


    }


}

bourne::json
GoodsStatsWarehouseDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<WarehouseStockDTO> stocks_list = getStocks();
    bourne::json stocks_arr = bourne::json::array();

    for(auto& var : stocks_list)
    {
        WarehouseStockDTO obj = var;
        stocks_arr.append(obj.toJson());
    }
    object["stocks"] = stocks_arr;




    return object;

}

long
GoodsStatsWarehouseDTO::getId()
{
	return id;
}

void
GoodsStatsWarehouseDTO::setId(long  id)
{
	this->id = id;
}

std::string
GoodsStatsWarehouseDTO::getName()
{
	return name;
}

void
GoodsStatsWarehouseDTO::setName(std::string  name)
{
	this->name = name;
}

std::list<WarehouseStockDTO>
GoodsStatsWarehouseDTO::getStocks()
{
	return stocks;
}

void
GoodsStatsWarehouseDTO::setStocks(std::list <WarehouseStockDTO> stocks)
{
	this->stocks = stocks;
}



