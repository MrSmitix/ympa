

#include "GetSuggestedOfferMappingsResultDTO.h"

using namespace Tiny;

GetSuggestedOfferMappingsResultDTO::GetSuggestedOfferMappingsResultDTO()
{
	offers = std::list<SuggestedOfferMappingDTO>();
}

GetSuggestedOfferMappingsResultDTO::GetSuggestedOfferMappingsResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetSuggestedOfferMappingsResultDTO::~GetSuggestedOfferMappingsResultDTO()
{

}

void
GetSuggestedOfferMappingsResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<SuggestedOfferMappingDTO> offers_list;
        SuggestedOfferMappingDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
GetSuggestedOfferMappingsResultDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SuggestedOfferMappingDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        SuggestedOfferMappingDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<SuggestedOfferMappingDTO>
GetSuggestedOfferMappingsResultDTO::getOffers()
{
	return offers;
}

void
GetSuggestedOfferMappingsResultDTO::setOffers(std::list <SuggestedOfferMappingDTO> offers)
{
	this->offers = offers;
}



