

#include "UpdateOfferMappingsResponse.h"

using namespace Tiny;

UpdateOfferMappingsResponse::UpdateOfferMappingsResponse()
{
	status = ApiResponseStatusType();
	results = std::list<UpdateOfferMappingResultDTO>();
}

UpdateOfferMappingsResponse::UpdateOfferMappingsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferMappingsResponse::~UpdateOfferMappingsResponse()
{

}

void
UpdateOfferMappingsResponse::fromJson(std::string jsonObj)
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


        std::list<UpdateOfferMappingResultDTO> results_list;
        UpdateOfferMappingResultDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
UpdateOfferMappingsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();




    std::list<UpdateOfferMappingResultDTO> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        UpdateOfferMappingResultDTO obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

ApiResponseStatusType
UpdateOfferMappingsResponse::getStatus()
{
	return status;
}

void
UpdateOfferMappingsResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

std::list<UpdateOfferMappingResultDTO>
UpdateOfferMappingsResponse::getResults()
{
	return results;
}

void
UpdateOfferMappingsResponse::setResults(std::list <UpdateOfferMappingResultDTO> results)
{
	this->results = results;
}



