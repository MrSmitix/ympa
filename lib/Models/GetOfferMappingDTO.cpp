

#include "GetOfferMappingDTO.h"

using namespace Tiny;

GetOfferMappingDTO::GetOfferMappingDTO()
{
	offer = GetOfferDTO();
	mapping = GetMappingDTO();
}

GetOfferMappingDTO::GetOfferMappingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetOfferMappingDTO::~GetOfferMappingDTO()
{

}

void
GetOfferMappingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerKey = "offer";

    if(object.has_key(offerKey))
    {
        bourne::json value = object[offerKey];




        GetOfferDTO* obj = &offer;
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
GetOfferMappingDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["offer"] = getOffer().toJson();






	object["mapping"] = getMapping().toJson();


    return object;

}

GetOfferDTO
GetOfferMappingDTO::getOffer()
{
	return offer;
}

void
GetOfferMappingDTO::setOffer(GetOfferDTO  offer)
{
	this->offer = offer;
}

GetMappingDTO
GetOfferMappingDTO::getMapping()
{
	return mapping;
}

void
GetOfferMappingDTO::setMapping(GetMappingDTO  mapping)
{
	this->mapping = mapping;
}



