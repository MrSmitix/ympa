

#include "OfferMappingEntryDTO.h"

using namespace Tiny;

OfferMappingEntryDTO::OfferMappingEntryDTO()
{
	mapping = OfferMappingDTO();
	awaitingModerationMapping = OfferMappingDTO();
	rejectedMapping = OfferMappingDTO();
	offer = MappingsOfferDTO();
}

OfferMappingEntryDTO::OfferMappingEntryDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferMappingEntryDTO::~OfferMappingEntryDTO()
{

}

void
OfferMappingEntryDTO::fromJson(std::string jsonObj)
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




        MappingsOfferDTO* obj = &offer;
		obj->fromJson(value.dump());

    }


}

bourne::json
OfferMappingEntryDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["mapping"] = getMapping().toJson();






	object["awaitingModerationMapping"] = getAwaitingModerationMapping().toJson();






	object["rejectedMapping"] = getRejectedMapping().toJson();






	object["offer"] = getOffer().toJson();


    return object;

}

OfferMappingDTO
OfferMappingEntryDTO::getMapping()
{
	return mapping;
}

void
OfferMappingEntryDTO::setMapping(OfferMappingDTO  mapping)
{
	this->mapping = mapping;
}

OfferMappingDTO
OfferMappingEntryDTO::getAwaitingModerationMapping()
{
	return awaitingModerationMapping;
}

void
OfferMappingEntryDTO::setAwaitingModerationMapping(OfferMappingDTO  awaitingModerationMapping)
{
	this->awaitingModerationMapping = awaitingModerationMapping;
}

OfferMappingDTO
OfferMappingEntryDTO::getRejectedMapping()
{
	return rejectedMapping;
}

void
OfferMappingEntryDTO::setRejectedMapping(OfferMappingDTO  rejectedMapping)
{
	this->rejectedMapping = rejectedMapping;
}

MappingsOfferDTO
OfferMappingEntryDTO::getOffer()
{
	return offer;
}

void
OfferMappingEntryDTO::setOffer(MappingsOfferDTO  offer)
{
	this->offer = offer;
}



