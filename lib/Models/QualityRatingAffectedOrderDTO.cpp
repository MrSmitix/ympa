

#include "QualityRatingAffectedOrderDTO.h"

using namespace Tiny;

QualityRatingAffectedOrderDTO::QualityRatingAffectedOrderDTO()
{
	orderId = long(0);
	description = std::string();
	componentType = AffectedOrderQualityRatingComponentType();
}

QualityRatingAffectedOrderDTO::QualityRatingAffectedOrderDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

QualityRatingAffectedOrderDTO::~QualityRatingAffectedOrderDTO()
{

}

void
QualityRatingAffectedOrderDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderIdKey = "orderId";

    if(object.has_key(orderIdKey))
    {
        bourne::json value = object[orderIdKey];



        jsonToValue(&orderId, value, "long");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *componentTypeKey = "componentType";

    if(object.has_key(componentTypeKey))
    {
        bourne::json value = object[componentTypeKey];




        AffectedOrderQualityRatingComponentType* obj = &componentType;
		obj->fromJson(value.dump());

    }


}

bourne::json
QualityRatingAffectedOrderDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["orderId"] = getOrderId();






    object["description"] = getDescription();







	object["componentType"] = getComponentType().toJson();


    return object;

}

long
QualityRatingAffectedOrderDTO::getOrderId()
{
	return orderId;
}

void
QualityRatingAffectedOrderDTO::setOrderId(long  orderId)
{
	this->orderId = orderId;
}

std::string
QualityRatingAffectedOrderDTO::getDescription()
{
	return description;
}

void
QualityRatingAffectedOrderDTO::setDescription(std::string  description)
{
	this->description = description;
}

AffectedOrderQualityRatingComponentType
QualityRatingAffectedOrderDTO::getComponentType()
{
	return componentType;
}

void
QualityRatingAffectedOrderDTO::setComponentType(AffectedOrderQualityRatingComponentType  componentType)
{
	this->componentType = componentType;
}



