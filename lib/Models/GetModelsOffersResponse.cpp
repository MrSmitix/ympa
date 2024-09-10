

#include "GetModelsOffersResponse.h"

using namespace Tiny;

GetModelsOffersResponse::GetModelsOffersResponse()
{
	models = std::list<EnrichedModelDTO>();
	currency = CurrencyType();
	regionId = long(0);
}

GetModelsOffersResponse::GetModelsOffersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetModelsOffersResponse::~GetModelsOffersResponse()
{

}

void
GetModelsOffersResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelsKey = "models";

    if(object.has_key(modelsKey))
    {
        bourne::json value = object[modelsKey];


        std::list<EnrichedModelDTO> models_list;
        EnrichedModelDTO element;
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
GetModelsOffersResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<EnrichedModelDTO> models_list = getModels();
    bourne::json models_arr = bourne::json::array();

    for(auto& var : models_list)
    {
        EnrichedModelDTO obj = var;
        models_arr.append(obj.toJson());
    }
    object["models"] = models_arr;








	object["currency"] = getCurrency().toJson();





    object["regionId"] = getRegionId();



    return object;

}

std::list<EnrichedModelDTO>
GetModelsOffersResponse::getModels()
{
	return models;
}

void
GetModelsOffersResponse::setModels(std::list <EnrichedModelDTO> models)
{
	this->models = models;
}

CurrencyType
GetModelsOffersResponse::getCurrency()
{
	return currency;
}

void
GetModelsOffersResponse::setCurrency(CurrencyType  currency)
{
	this->currency = currency;
}

long
GetModelsOffersResponse::getRegionId()
{
	return regionId;
}

void
GetModelsOffersResponse::setRegionId(long  regionId)
{
	this->regionId = regionId;
}



