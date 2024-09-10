

#include "SearchModelsResponse.h"

using namespace Tiny;

SearchModelsResponse::SearchModelsResponse()
{
	models = std::list<ModelDTO>();
	currency = CurrencyType();
	regionId = long(0);
	pager = FlippingPagerDTO();
}

SearchModelsResponse::SearchModelsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SearchModelsResponse::~SearchModelsResponse()
{

}

void
SearchModelsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelsKey = "models";

    if(object.has_key(modelsKey))
    {
        bourne::json value = object[modelsKey];


        std::list<ModelDTO> models_list;
        ModelDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            models_list.push_back(element);
        }
        models = models_list;


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        CurrencyType* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *regionIdKey = "regionId";

    if(object.has_key(regionIdKey))
    {
        bourne::json value = object[regionIdKey];



        jsonToValue(&regionId, value, "long");


    }

    const char *pagerKey = "pager";

    if(object.has_key(pagerKey))
    {
        bourne::json value = object[pagerKey];




        FlippingPagerDTO* obj = &pager;
		obj->fromJson(value.dump());

    }


}

bourne::json
SearchModelsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ModelDTO> models_list = getModels();
    bourne::json models_arr = bourne::json::array();

    for(auto& var : models_list)
    {
        ModelDTO obj = var;
        models_arr.append(obj.toJson());
    }
    object["models"] = models_arr;








	object["currency"] = getCurrency().toJson();





    object["regionId"] = getRegionId();







	object["pager"] = getPager().toJson();


    return object;

}

std::list<ModelDTO>
SearchModelsResponse::getModels()
{
	return models;
}

void
SearchModelsResponse::setModels(std::list <ModelDTO> models)
{
	this->models = models;
}

CurrencyType
SearchModelsResponse::getCurrency()
{
	return currency;
}

void
SearchModelsResponse::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long
SearchModelsResponse::getRegionId()
{
	return regionId;
}

void
SearchModelsResponse::setRegionId(long  regionId)
{
	this->regionId = regionId;
}

FlippingPagerDTO
SearchModelsResponse::getPager()
{
	return pager;
}

void
SearchModelsResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}



