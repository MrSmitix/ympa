

#include "GoodsStatsGoodsDTO.h"

using namespace Tiny;

GoodsStatsGoodsDTO::GoodsStatsGoodsDTO()
{
	shopSku = std::string();
	marketSku = long(0);
	name = std::string();
	price = float(0);
	categoryId = long(0);
	categoryName = std::string();
	weightDimensions = GoodsStatsWeightDimensionsDTO();
	warehouses = std::list<GoodsStatsWarehouseDTO>();
	tariffs = std::list<TariffDTO>();
	pictures = std::list<std::string>();
}

GoodsStatsGoodsDTO::GoodsStatsGoodsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsStatsGoodsDTO::~GoodsStatsGoodsDTO()
{

}

void
GoodsStatsGoodsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *shopSkuKey = "shopSku";

    if(object.has_key(shopSkuKey))
    {
        bourne::json value = object[shopSkuKey];



        jsonToValue(&shopSku, value, "std::string");


    }

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *priceKey = "price";

    if(object.has_key(priceKey))
    {
        bourne::json value = object[priceKey];



        jsonToValue(&price, value, "long");


    }

    const char *categoryIdKey = "categoryId";

    if(object.has_key(categoryIdKey))
    {
        bourne::json value = object[categoryIdKey];



        jsonToValue(&categoryId, value, "long");


    }

    const char *categoryNameKey = "categoryName";

    if(object.has_key(categoryNameKey))
    {
        bourne::json value = object[categoryNameKey];



        jsonToValue(&categoryName, value, "std::string");


    }

    const char *weightDimensionsKey = "weightDimensions";

    if(object.has_key(weightDimensionsKey))
    {
        bourne::json value = object[weightDimensionsKey];




        GoodsStatsWeightDimensionsDTO* obj = &weightDimensions;
		obj->fromJson(value.dump());

    }

    const char *warehousesKey = "warehouses";

    if(object.has_key(warehousesKey))
    {
        bourne::json value = object[warehousesKey];


        std::list<GoodsStatsWarehouseDTO> warehouses_list;
        GoodsStatsWarehouseDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warehouses_list.push_back(element);
        }
        warehouses = warehouses_list;


    }

    const char *tariffsKey = "tariffs";

    if(object.has_key(tariffsKey))
    {
        bourne::json value = object[tariffsKey];


        std::list<TariffDTO> tariffs_list;
        TariffDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tariffs_list.push_back(element);
        }
        tariffs = tariffs_list;


    }

    const char *picturesKey = "pictures";

    if(object.has_key(picturesKey))
    {
        bourne::json value = object[picturesKey];


        std::list<std::string> pictures_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            pictures_list.push_back(element);
        }
        pictures = pictures_list;


    }


}

bourne::json
GoodsStatsGoodsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["shopSku"] = getShopSku();






    object["marketSku"] = getMarketSku();






    object["name"] = getName();






    object["price"] = getPrice();






    object["categoryId"] = getCategoryId();






    object["categoryName"] = getCategoryName();







	object["weightDimensions"] = getWeightDimensions().toJson();




    std::list<GoodsStatsWarehouseDTO> warehouses_list = getWarehouses();
    bourne::json warehouses_arr = bourne::json::array();

    for(auto& var : warehouses_list)
    {
        GoodsStatsWarehouseDTO obj = var;
        warehouses_arr.append(obj.toJson());
    }
    object["warehouses"] = warehouses_arr;






    std::list<TariffDTO> tariffs_list = getTariffs();
    bourne::json tariffs_arr = bourne::json::array();

    for(auto& var : tariffs_list)
    {
        TariffDTO obj = var;
        tariffs_arr.append(obj.toJson());
    }
    object["tariffs"] = tariffs_arr;






    std::list<std::string> pictures_list = getPictures();
    bourne::json pictures_arr = bourne::json::array();

    for(auto& var : pictures_list)
    {
        pictures_arr.append(var);
    }
    object["pictures"] = pictures_arr;






    return object;

}

std::string
GoodsStatsGoodsDTO::getShopSku()
{
	return shopSku;
}

void
GoodsStatsGoodsDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

long
GoodsStatsGoodsDTO::getMarketSku()
{
	return marketSku;
}

void
GoodsStatsGoodsDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
GoodsStatsGoodsDTO::getName()
{
	return name;
}

void
GoodsStatsGoodsDTO::setName(std::string  name)
{
	this->name = name;
}

long
GoodsStatsGoodsDTO::getPrice()
{
	return price;
}

void
GoodsStatsGoodsDTO::setPrice(long  price)
{
	this->price = price;
}

long
GoodsStatsGoodsDTO::getCategoryId()
{
	return categoryId;
}

void
GoodsStatsGoodsDTO::setCategoryId(long  categoryId)
{
	this->categoryId = categoryId;
}

std::string
GoodsStatsGoodsDTO::getCategoryName()
{
	return categoryName;
}

void
GoodsStatsGoodsDTO::setCategoryName(std::string  categoryName)
{
	this->categoryName = categoryName;
}

GoodsStatsWeightDimensionsDTO
GoodsStatsGoodsDTO::getWeightDimensions()
{
	return weightDimensions;
}

void
GoodsStatsGoodsDTO::setWeightDimensions(GoodsStatsWeightDimensionsDTO  weightDimensions)
{
	this->weightDimensions = weightDimensions;
}

std::list<GoodsStatsWarehouseDTO>
GoodsStatsGoodsDTO::getWarehouses()
{
	return warehouses;
}

void
GoodsStatsGoodsDTO::setWarehouses(std::list <GoodsStatsWarehouseDTO> warehouses)
{
	this->warehouses = warehouses;
}

std::list<TariffDTO>
GoodsStatsGoodsDTO::getTariffs()
{
	return tariffs;
}

void
GoodsStatsGoodsDTO::setTariffs(std::list <TariffDTO> tariffs)
{
	this->tariffs = tariffs;
}

std::list<std::string>
GoodsStatsGoodsDTO::getPictures()
{
	return pictures;
}

void
GoodsStatsGoodsDTO::setPictures(std::list <std::string> pictures)
{
	this->pictures = pictures;
}



