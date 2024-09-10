

#include "OfferMappingSuggestionsListDTO.h"

using namespace Tiny;

OfferMappingSuggestionsListDTO::OfferMappingSuggestionsListDTO()
{
	offers = std::list<EnrichedMappingsOfferDTO>();
}

OfferMappingSuggestionsListDTO::OfferMappingSuggestionsListDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferMappingSuggestionsListDTO::~OfferMappingSuggestionsListDTO()
{

}

void
OfferMappingSuggestionsListDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<EnrichedMappingsOfferDTO> offers_list;
        EnrichedMappingsOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
OfferMappingSuggestionsListDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<EnrichedMappingsOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        EnrichedMappingsOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<EnrichedMappingsOfferDTO>
OfferMappingSuggestionsListDTO::getOffers()
{
	return offers;
}

void
OfferMappingSuggestionsListDTO::setOffers(std::list <EnrichedMappingsOfferDTO> offers)
{
	this->offers = offers;
}



