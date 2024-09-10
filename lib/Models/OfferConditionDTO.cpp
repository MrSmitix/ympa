

#include "OfferConditionDTO.h"

using namespace Tiny;

OfferConditionDTO::OfferConditionDTO()
{
	type = OfferConditionType();
	quality = OfferConditionQualityType();
	reason = std::string();
}

OfferConditionDTO::OfferConditionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferConditionDTO::~OfferConditionDTO()
{

}

void
OfferConditionDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OfferConditionType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *qualityKey = "quality";

    if(object.has_key(qualityKey))
    {
        bourne::json value = object[qualityKey];




        OfferConditionQualityType* obj = &quality;
		obj->fromJson(value.dump());

    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];



        jsonToValue(&reason, value, "std::string");


    }


}

bourne::json
OfferConditionDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();






	object["quality"] = getQuality().toJson();





    object["reason"] = getReason();



    return object;

}

OfferConditionType
OfferConditionDTO::getType()
{
	return type;
}

void
OfferConditionDTO::setType(OfferConditionType  type)
{
	this->type = type;
}

OfferConditionQualityType
OfferConditionDTO::getQuality()
{
	return quality;
}

void
OfferConditionDTO::setQuality(OfferConditionQualityType  quality)
{
	this->quality = quality;
}

std::string
OfferConditionDTO::getReason()
{
	return reason;
}

void
OfferConditionDTO::setReason(std::string  reason)
{
	this->reason = reason;
}



