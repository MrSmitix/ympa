

#include "EnrichedModelsDTO.h"

using namespace Tiny;

EnrichedModelsDTO::EnrichedModelsDTO()
{
	models = std::list<EnrichedModelDTO>();
}

EnrichedModelsDTO::EnrichedModelsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

EnrichedModelsDTO::~EnrichedModelsDTO()
{

}

void
EnrichedModelsDTO::fromJson(std::string jsonObj)
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


}

bourne::json
EnrichedModelsDTO::toJson()
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




    return object;

}

std::list<EnrichedModelDTO>
EnrichedModelsDTO::getModels()
{
	return models;
}

void
EnrichedModelsDTO::setModels(std::list <EnrichedModelDTO> models)
{
	this->models = models;
}



