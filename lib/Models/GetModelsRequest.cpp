

#include "GetModelsRequest.h"

using namespace Tiny;

GetModelsRequest::GetModelsRequest()
{
	models = std::list<long>();
}

GetModelsRequest::GetModelsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetModelsRequest::~GetModelsRequest()
{

}

void
GetModelsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelsKey = "models";

    if(object.has_key(modelsKey))
    {
        bourne::json value = object[modelsKey];


        std::list<long> models_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            models_list.push_back(element);
        }
        models = models_list;


    }


}

bourne::json
GetModelsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> models_list = getModels();
    bourne::json models_arr = bourne::json::array();

    for(auto& var : models_list)
    {
        models_arr.append(var);
    }
    object["models"] = models_arr;






    return object;

}

std::list<long>
GetModelsRequest::getModels()
{
	return models;
}

void
GetModelsRequest::setModels(std::list <long> models)
{
	this->models = models;
}



