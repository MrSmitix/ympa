

#include "CategoryContentParametersDTO.h"

using namespace Tiny;

CategoryContentParametersDTO::CategoryContentParametersDTO()
{
	categoryId = int(0);
	parameters = std::list<CategoryParameterDTO>();
}

CategoryContentParametersDTO::CategoryContentParametersDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CategoryContentParametersDTO::~CategoryContentParametersDTO()
{

}

void
CategoryContentParametersDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *categoryIdKey = "categoryId";

    if(object.has_key(categoryIdKey))
    {
        bourne::json value = object[categoryIdKey];



        jsonToValue(&categoryId, value, "int");


    }

    const char *parametersKey = "parameters";

    if(object.has_key(parametersKey))
    {
        bourne::json value = object[parametersKey];


        std::list<CategoryParameterDTO> parameters_list;
        CategoryParameterDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            parameters_list.push_back(element);
        }
        parameters = parameters_list;


    }


}

bourne::json
CategoryContentParametersDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["categoryId"] = getCategoryId();





    std::list<CategoryParameterDTO> parameters_list = getParameters();
    bourne::json parameters_arr = bourne::json::array();

    for(auto& var : parameters_list)
    {
        CategoryParameterDTO obj = var;
        parameters_arr.append(obj.toJson());
    }
    object["parameters"] = parameters_arr;




    return object;

}

int
CategoryContentParametersDTO::getCategoryId()
{
	return categoryId;
}

void
CategoryContentParametersDTO::setCategoryId(int  categoryId)
{
	this->categoryId = categoryId;
}

std::list<CategoryParameterDTO>
CategoryContentParametersDTO::getParameters()
{
	return parameters;
}

void
CategoryContentParametersDTO::setParameters(std::list <CategoryParameterDTO> parameters)
{
	this->parameters = parameters;
}



