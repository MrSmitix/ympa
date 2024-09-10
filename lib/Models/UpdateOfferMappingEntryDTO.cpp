

#include "UpdateOfferMappingEntryDTO.h"

using namespace Tiny;

UpdateOfferMappingEntryDTO::UpdateOfferMappingEntryDTO()
{
	mapping = OfferMappingDTO();
	awaitingModerationMapping = OfferMappingDTO();
	rejectedMapping = OfferMappingDTO();
	offer = UpdateMappingsOfferDTO();
}

UpdateOfferMappingEntryDTO::UpdateOfferMappingEntryDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateOfferMappingEntryDTO::~UpdateOfferMappingEntryDTO()
{

}

void
UpdateOfferMappingEntryDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mappingKey = "mapping";

    if(object.has_key(mappingKey))
    {
        bourne::json value = object[mappingKey];




        OfferMappingDTO* obj = &mapping;
		obj->fromJson(value.dump());

    }

    const char *awaitingModerationMappingKey = "awaitingModerationMapping";

    if(object.has_key(awaitingModerationMappingKey))
    {
        bourne::json value = object[awaitingModerationMappingKey];




        OfferMappingDTO* obj = &awaitingModerationMapping;
		obj->fromJson(value.dump());

    }

    const char *rejectedMappingKey = "rejectedMapping";

    if(object.has_key(rejectedMappingKey))
    {
        bourne::json value = object[rejectedMappingKey];




        OfferMappingDTO* obj = &rejectedMapping;
		obj->fromJson(value.dump());

    }

    const char *offerKey = "offer";

    if(object.has_key(offerKey))
    {
        bourne::json value = object[offerKey];




        UpdateMappingsOfferDTO* obj = &offer;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateOfferMappingEntryDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["mapping"] = getMapping().toJson();






	object["awaitingModerationMapping"] = getAwaitingModerationMapping().toJson();






	object["rejectedMapping"] = getRejectedMapping().toJson();






	object["offer"] = getOffer().toJson();


    return object;

}

OfferMappingDTO
UpdateOfferMappingEntryDTO::getMapping()
{
	return mapping;
}

void
UpdateOfferMappingEntryDTO::setMapping(OfferMappingDTO  mapping)
{
	this->mapping = mapping;
}

OfferMappingDTO
UpdateOfferMappingEntryDTO::getAwaitingModerationMapping()
{
	return awaitingModerationMapping;
}

void
UpdateOfferMappingEntryDTO::setAwaitingModerationMapping(OfferMappingDTO  awaitingModerationMapping)
{
	this->awaitingModerationMapping = awaitingModerationMapping;
}

OfferMappingDTO
UpdateOfferMappingEntryDTO::getRejectedMapping()
{
	return rejectedMapping;
}

void
UpdateOfferMappingEntryDTO::setRejectedMapping(OfferMappingDTO  rejectedMapping)
{
	this->rejectedMapping = rejectedMapping;
}

UpdateMappingsOfferDTO
UpdateOfferMappingEntryDTO::getOffer()
{
	return offer;
}

void
UpdateOfferMappingEntryDTO::setOffer(UpdateMappingsOfferDTO  offer)
{
	this->offer = offer;
}



