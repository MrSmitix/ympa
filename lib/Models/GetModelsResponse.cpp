

#include "GetModelsResponse.h"

using namespace Tiny;

GetModelsResponse::GetModelsResponse()
{
	models = std::list<ModelDTO>();
	currency = CurrencyType();
	regionId = long(0);
}

GetModelsResponse::GetModelsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetModelsResponse::~GetModelsResponse()
{

}

void
GetModelsResponse::fromJson(std::string jsonObj)
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


}

bourne::json
GetModelsResponse::toJson()
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



    return object;

}

std::list<ModelDTO>
GetModelsResponse::getModels()
{
	return models;
}

void
GetModelsResponse::setModels(std::list <ModelDTO> models)
{
	this->models = models;
}

CurrencyType
GetModelsResponse::getCurrency()
{
	return currency;
}

void
GetModelsResponse::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long
GetModelsResponse::getRegionId()
{
	return regionId;
}

void
GetModelsResponse::setRegionId(long  regionId)
{
	this->regionId = regionId;
}



