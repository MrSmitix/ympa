

#include "UpdateOfferMappingDTO.h"

using namespace Tiny;

UpdateOfferMappingDTO::UpdateOfferMappingDTO()
{
	offer = UpdateOfferDTO();
	mapping = UpdateMappingDTO();
}

UpdateOfferMappingDTO::UpdateOfferMappingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferMappingDTO::~UpdateOfferMappingDTO()
{

}

void
UpdateOfferMappingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerKey = "offer";

    if(object.has_key(offerKey))
    {
        bourne::json value = object[offerKey];




        UpdateOfferDTO* obj = &offer;
		obj->fromJson(value.dump());

    }

    const char *mappingKey = "mapping";

    if(object.has_key(mappingKey))
    {
        bourne::json value = object[mappingKey];




        UpdateMappingDTO* obj = &mapping;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateOfferMappingDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["offer"] = getOffer().toJson();






	object["mapping"] = getMapping().toJson();


    return object;

}

UpdateOfferDTO
UpdateOfferMappingDTO::getOffer()
{
	return offer;
}

void
UpdateOfferMappingDTO::setOffer(UpdateOfferDTO  offer)
{
	this->offer = offer;
}

UpdateMappingDTO
UpdateOfferMappingDTO::getMapping()
{
	return mapping;
}

void
UpdateOfferMappingDTO::setMapping(UpdateMappingDTO  mapping)
{
	this->mapping = mapping;
}



