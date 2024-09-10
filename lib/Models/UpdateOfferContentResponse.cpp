

#include "UpdateOfferContentResponse.h"

using namespace Tiny;

UpdateOfferContentResponse::UpdateOfferContentResponse()
{
	status = ApiResponseStatusType();
	results = std::list<UpdateOfferContentResultDTO>();
}

UpdateOfferContentResponse::UpdateOfferContentResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferContentResponse::~UpdateOfferContentResponse()
{

}

void
UpdateOfferContentResponse::fromJson(std::string jsonObj)
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


        std::list<UpdateOfferContentResultDTO> results_list;
        UpdateOfferContentResultDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
UpdateOfferContentResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();




    std::list<UpdateOfferContentResultDTO> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        UpdateOfferContentResultDTO obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

ApiResponseStatusType
UpdateOfferContentResponse::getStatus()
{
	return status;
}

void
UpdateOfferContentResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

std::list<UpdateOfferContentResultDTO>
UpdateOfferContentResponse::getResults()
{
	return results;
}

void
UpdateOfferContentResponse::setResults(std::list <UpdateOfferContentResultDTO> results)
{
	this->results = results;
}



