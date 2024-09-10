

#include "GetCategoriesMaxSaleQuantumResponse.h"

using namespace Tiny;

GetCategoriesMaxSaleQuantumResponse::GetCategoriesMaxSaleQuantumResponse()
{
	status = ApiResponseStatusType();
	results = std::list<MaxSaleQuantumDTO>();
	errors = std::list<CategoryErrorDTO>();
}

GetCategoriesMaxSaleQuantumResponse::GetCategoriesMaxSaleQuantumResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetCategoriesMaxSaleQuantumResponse::~GetCategoriesMaxSaleQuantumResponse()
{

}

void
GetCategoriesMaxSaleQuantumResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ApiResponseStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

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
GetCategoriesMaxSaleQuantumResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();




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

ApiResponseStatusType
GetCategoriesMaxSaleQuantumResponse::getStatus()
{
	return status;
}

void
GetCategoriesMaxSaleQuantumResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

std::list<MaxSaleQuantumDTO>
GetCategoriesMaxSaleQuantumResponse::getResults()
{
	return results;
}

void
GetCategoriesMaxSaleQuantumResponse::setResults(std::list <MaxSaleQuantumDTO> results)
{
	this->results = results;
}

std::list<CategoryErrorDTO>
GetCategoriesMaxSaleQuantumResponse::getErrors()
{
	return errors;
}

void
GetCategoriesMaxSaleQuantumResponse::setErrors(std::list <CategoryErrorDTO> errors)
{
	this->errors = errors;
}



