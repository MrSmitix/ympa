

#include "GetSuggestedOfferMappingsRequest.h"

using namespace Tiny;

GetSuggestedOfferMappingsRequest::GetSuggestedOfferMappingsRequest()
{
	offers = std::list<SuggestedOfferDTO>();
}

GetSuggestedOfferMappingsRequest::GetSuggestedOfferMappingsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetSuggestedOfferMappingsRequest::~GetSuggestedOfferMappingsRequest()
{

}

void
GetSuggestedOfferMappingsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<SuggestedOfferDTO> offers_list;
        SuggestedOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
GetSuggestedOfferMappingsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SuggestedOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        SuggestedOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<SuggestedOfferDTO>
GetSuggestedOfferMappingsRequest::getOffers()
{
	return offers;
}

void
GetSuggestedOfferMappingsRequest::setOffers(std::list <SuggestedOfferDTO> offers)
{
	this->offers = offers;
}



