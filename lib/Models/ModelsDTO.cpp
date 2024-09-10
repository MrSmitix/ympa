

#include "ModelsDTO.h"

using namespace Tiny;

ModelsDTO::ModelsDTO()
{
	models = std::list<ModelDTO>();
}

ModelsDTO::ModelsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModelsDTO::~ModelsDTO()
{

}

void
ModelsDTO::fromJson(std::string jsonObj)
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


}

bourne::json
ModelsDTO::toJson()
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




    return object;

}

std::list<ModelDTO>
ModelsDTO::getModels()
{
	return models;
}

void
ModelsDTO::setModels(std::list <ModelDTO> models)
{
	this->models = models;
}



