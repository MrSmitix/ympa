

#include "GetMappingDTO.h"

using namespace Tiny;

GetMappingDTO::GetMappingDTO()
{
	marketSku = long(0);
	marketSkuName = std::string();
	marketModelId = long(0);
	marketModelName = std::string();
	marketCategoryId = long(0);
	marketCategoryName = std::string();
}

GetMappingDTO::GetMappingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetMappingDTO::~GetMappingDTO()
{

}

void
GetMappingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }

    const char *marketSkuNameKey = "marketSkuName";

    if(object.has_key(marketSkuNameKey))
    {
        bourne::json value = object[marketSkuNameKey];



        jsonToValue(&marketSkuName, value, "std::string");


    }

    const char *marketModelIdKey = "marketModelId";

    if(object.has_key(marketModelIdKey))
    {
        bourne::json value = object[marketModelIdKey];



        jsonToValue(&marketModelId, value, "long");


    }

    const char *marketModelNameKey = "marketModelName";

    if(object.has_key(marketModelNameKey))
    {
        bourne::json value = object[marketModelNameKey];



        jsonToValue(&marketModelName, value, "std::string");


    }

    const char *marketCategoryIdKey = "marketCategoryId";

    if(object.has_key(marketCategoryIdKey))
    {
        bourne::json value = object[marketCategoryIdKey];



        jsonToValue(&marketCategoryId, value, "long");


    }

    const char *marketCategoryNameKey = "marketCategoryName";

    if(object.has_key(marketCategoryNameKey))
    {
        bourne::json value = object[marketCategoryNameKey];



        jsonToValue(&marketCategoryName, value, "std::string");


    }


}

bourne::json
GetMappingDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["marketSku"] = getMarketSku();






    object["marketSkuName"] = getMarketSkuName();






    object["marketModelId"] = getMarketModelId();






    object["marketModelName"] = getMarketModelName();






    object["marketCategoryId"] = getMarketCategoryId();






    object["marketCategoryName"] = getMarketCategoryName();



    return object;

}

long
GetMappingDTO::getMarketSku()
{
	return marketSku;
}

void
GetMappingDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
GetMappingDTO::getMarketSkuName()
{
	return marketSkuName;
}

void
GetMappingDTO::setMarketSkuName(std::string  marketSkuName)
{
	this->marketSkuName = marketSkuName;
}

long
GetMappingDTO::getMarketModelId()
{
	return marketModelId;
}

void
GetMappingDTO::setMarketModelId(long  marketModelId)
{
	this->marketModelId = marketModelId;
}

std::string
GetMappingDTO::getMarketModelName()
{
	return marketModelName;
}

void
GetMappingDTO::setMarketModelName(std::string  marketModelName)
{
	this->marketModelName = marketModelName;
}

long
GetMappingDTO::getMarketCategoryId()
{
	return marketCategoryId;
}

void
GetMappingDTO::setMarketCategoryId(long  marketCategoryId)
{
	this->marketCategoryId = marketCategoryId;
}

std::string
GetMappingDTO::getMarketCategoryName()
{
	return marketCategoryName;
}

void
GetMappingDTO::setMarketCategoryName(std::string  marketCategoryName)
{
	this->marketCategoryName = marketCategoryName;
}



