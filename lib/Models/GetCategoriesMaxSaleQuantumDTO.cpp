

#include "GetCategoriesMaxSaleQuantumDTO.h"

using namespace Tiny;

GetCategoriesMaxSaleQuantumDTO::GetCategoriesMaxSaleQuantumDTO()
{
	results = std::list<MaxSaleQuantumDTO>();
	errors = std::list<CategoryErrorDTO>();
}

GetCategoriesMaxSaleQuantumDTO::GetCategoriesMaxSaleQuantumDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCategoriesMaxSaleQuantumDTO::~GetCategoriesMaxSaleQuantumDTO()
{

}

void
GetCategoriesMaxSaleQuantumDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<MaxSaleQuantumDTO> results_list;
        MaxSaleQuantumDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<CategoryErrorDTO> errors_list;
        CategoryErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }


}

bourne::json
GetCategoriesMaxSaleQuantumDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<MaxSaleQuantumDTO> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MaxSaleQuantumDTO obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;






    std::list<CategoryErrorDTO> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        CategoryErrorDTO obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;




    return object;

}

std::list<MaxSaleQuantumDTO>
GetCategoriesMaxSaleQuantumDTO::getResults()
{
	return results;
}

void
GetCategoriesMaxSaleQuantumDTO::setResults(std::list <MaxSaleQuantumDTO> results)
{
	this->results = results;
}

std::list<CategoryErrorDTO>
GetCategoriesMaxSaleQuantumDTO::getErrors()
{
	return errors;
}

void
GetCategoriesMaxSaleQuantumDTO::setErrors(std::list <CategoryErrorDTO> errors)
{
	this->errors = errors;
}



