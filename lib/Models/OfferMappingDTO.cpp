

#include "OfferMappingDTO.h"

using namespace Tiny;

OfferMappingDTO::OfferMappingDTO()
{
	marketSku = long(0);
	modelId = long(0);
	categoryId = long(0);
}

OfferMappingDTO::OfferMappingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferMappingDTO::~OfferMappingDTO()
{

}

void
OfferMappingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }

    const char *modelIdKey = "modelId";

    if(object.has_key(modelIdKey))
    {
        bourne::json value = object[modelIdKey];



        jsonToValue(&modelId, value, "long");


    }

    const char *categoryIdKey = "categoryId";

    if(object.has_key(categoryIdKey))
    {
        bourne::json value = object[categoryIdKey];



        jsonToValue(&categoryId, value, "long");


    }


}

bourne::json
OfferMappingDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["marketSku"] = getMarketSku();






    object["modelId"] = getModelId();






    object["categoryId"] = getCategoryId();



    return object;

}

long
OfferMappingDTO::getMarketSku()
{
	return marketSku;
}

void
OfferMappingDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}

long
OfferMappingDTO::getModelId()
{
	return modelId;
}

void
OfferMappingDTO::setModelId(long  modelId)
{
	this->modelId = modelId;
}

long
OfferMappingDTO::getCategoryId()
{
	return categoryId;
}

void
OfferMappingDTO::setCategoryId(long  categoryId)
{
	this->categoryId = categoryId;
}



