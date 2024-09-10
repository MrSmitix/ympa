

#include "OfferMappingInfoDTO.h"

using namespace Tiny;

OfferMappingInfoDTO::OfferMappingInfoDTO()
{
	mapping = OfferMappingDTO();
	awaitingModerationMapping = OfferMappingDTO();
	rejectedMapping = OfferMappingDTO();
}

OfferMappingInfoDTO::OfferMappingInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferMappingInfoDTO::~OfferMappingInfoDTO()
{

}

void
OfferMappingInfoDTO::fromJson(std::string jsonObj)
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


}

bourne::json
OfferMappingInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["mapping"] = getMapping().toJson();






	object["awaitingModerationMapping"] = getAwaitingModerationMapping().toJson();






	object["rejectedMapping"] = getRejectedMapping().toJson();


    return object;

}

OfferMappingDTO
OfferMappingInfoDTO::getMapping()
{
	return mapping;
}

void
OfferMappingInfoDTO::setMapping(OfferMappingDTO  mapping)
{
	this->mapping = mapping;
}

OfferMappingDTO
OfferMappingInfoDTO::getAwaitingModerationMapping()
{
	return awaitingModerationMapping;
}

void
OfferMappingInfoDTO::setAwaitingModerationMapping(OfferMappingDTO  awaitingModerationMapping)
{
	this->awaitingModerationMapping = awaitingModerationMapping;
}

OfferMappingDTO
OfferMappingInfoDTO::getRejectedMapping()
{
	return rejectedMapping;
}

void
OfferMappingInfoDTO::setRejectedMapping(OfferMappingDTO  rejectedMapping)
{
	this->rejectedMapping = rejectedMapping;
}



