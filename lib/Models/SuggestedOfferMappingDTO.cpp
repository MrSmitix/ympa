

#include "SuggestedOfferMappingDTO.h"

using namespace Tiny;

SuggestedOfferMappingDTO::SuggestedOfferMappingDTO()
{
	offer = SuggestedOfferDTO();
	mapping = GetMappingDTO();
}

SuggestedOfferMappingDTO::SuggestedOfferMappingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuggestedOfferMappingDTO::~SuggestedOfferMappingDTO()
{

}

void
SuggestedOfferMappingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerKey = "offer";

    if(object.has_key(offerKey))
    {
        bourne::json value = object[offerKey];




        SuggestedOfferDTO* obj = &offer;
		obj->fromJson(value.dump());

    }

    const char *mappingKey = "mapping";

    if(object.has_key(mappingKey))
    {
        bourne::json value = object[mappingKey];




        GetMappingDTO* obj = &mapping;
		obj->fromJson(value.dump());

    }


}

bourne::json
SuggestedOfferMappingDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["offer"] = getOffer().toJson();






	object["mapping"] = getMapping().toJson();


    return object;

}

SuggestedOfferDTO
SuggestedOfferMappingDTO::getOffer()
{
	return offer;
}

void
SuggestedOfferMappingDTO::setOffer(SuggestedOfferDTO  offer)
{
	this->offer = offer;
}

GetMappingDTO
SuggestedOfferMappingDTO::getMapping()
{
	return mapping;
}

void
SuggestedOfferMappingDTO::setMapping(GetMappingDTO  mapping)
{
	this->mapping = mapping;
}



