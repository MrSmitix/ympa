

#include "ApiClientDataErrorResponse.h"

using namespace Tiny;

ApiClientDataErrorResponse::ApiClientDataErrorResponse()
{
	status = ApiResponseStatusType();
	errors = std::list<ApiErrorDTO>();
}

ApiClientDataErrorResponse::ApiClientDataErrorResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ApiClientDataErrorResponse::~ApiClientDataErrorResponse()
{

}

void
ApiClientDataErrorResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ApiResponseStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<ApiErrorDTO> errors_list;
        ApiErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }


}

bourne::json
ApiClientDataErrorResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();




    std::list<ApiErrorDTO> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        ApiErrorDTO obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;




    return object;

}

ApiResponseStatusType
ApiClientDataErrorResponse::getStatus()
{
	return status;
}

void
ApiClientDataErrorResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

std::list<ApiErrorDTO>
ApiClientDataErrorResponse::getErrors()
{
	return errors;
}

void
ApiClientDataErrorResponse::setErrors(std::list <ApiErrorDTO> errors)
{
	this->errors = errors;
}



