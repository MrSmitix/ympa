

#include "GetSuggestedOfferMappingEntriesRequest.h"

using namespace Tiny;

GetSuggestedOfferMappingEntriesRequest::GetSuggestedOfferMappingEntriesRequest()
{
	offers = std::list<MappingsOfferDTO>();
}

GetSuggestedOfferMappingEntriesRequest::GetSuggestedOfferMappingEntriesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetSuggestedOfferMappingEntriesRequest::~GetSuggestedOfferMappingEntriesRequest()
{

}

void
GetSuggestedOfferMappingEntriesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<MappingsOfferDTO> offers_list;
        MappingsOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
GetSuggestedOfferMappingEntriesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<MappingsOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        MappingsOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<MappingsOfferDTO>
GetSuggestedOfferMappingEntriesRequest::getOffers()
{
	return offers;
}

void
GetSuggestedOfferMappingEntriesRequest::setOffers(std::list <MappingsOfferDTO> offers)
{
	this->offers = offers;
}



