

#include "CampaignSettingsLocalRegionDTO.h"

using namespace Tiny;

CampaignSettingsLocalRegionDTO::CampaignSettingsLocalRegionDTO()
{
	id = long(0);
	name = std::string();
	type = RegionType();
	deliveryOptionsSource = CampaignSettingsScheduleSourceType();
	delivery = CampaignSettingsDeliveryDTO();
}

CampaignSettingsLocalRegionDTO::CampaignSettingsLocalRegionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignSettingsLocalRegionDTO::~CampaignSettingsLocalRegionDTO()
{

}

void
CampaignSettingsLocalRegionDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        RegionType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *deliveryOptionsSourceKey = "deliveryOptionsSource";

    if(object.has_key(deliveryOptionsSourceKey))
    {
        bourne::json value = object[deliveryOptionsSourceKey];




        CampaignSettingsScheduleSourceType* obj = &deliveryOptionsSource;
		obj->fromJson(value.dump());

    }

    const char *deliveryKey = "delivery";

    if(object.has_key(deliveryKey))
    {
        bourne::json value = object[deliveryKey];




        CampaignSettingsDeliveryDTO* obj = &delivery;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignSettingsLocalRegionDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["type"] = getType().toJson();






	object["deliveryOptionsSource"] = getDeliveryOptionsSource().toJson();






	object["delivery"] = getDelivery().toJson();


    return object;

}

long
CampaignSettingsLocalRegionDTO::getId()
{
	return id;
}

void
CampaignSettingsLocalRegionDTO::setId(long  id)
{
	this->id = id;
}

std::string
CampaignSettingsLocalRegionDTO::getName()
{
	return name;
}

void
CampaignSettingsLocalRegionDTO::setName(std::string  name)
{
	this->name = name;
}

RegionType
CampaignSettingsLocalRegionDTO::getType()
{
	return type;
}

void
CampaignSettingsLocalRegionDTO::setType(RegionType  type)
{
	this->type = type;
}

CampaignSettingsScheduleSourceType
CampaignSettingsLocalRegionDTO::getDeliveryOptionsSource()
{
	return deliveryOptionsSource;
}

void
CampaignSettingsLocalRegionDTO::setDeliveryOptionsSource(CampaignSettingsScheduleSourceType  deliveryOptionsSource)
{
	this->deliveryOptionsSource = deliveryOptionsSource;
}

CampaignSettingsDeliveryDTO
CampaignSettingsLocalRegionDTO::getDelivery()
{
	return delivery;
}

void
CampaignSettingsLocalRegionDTO::setDelivery(CampaignSettingsDeliveryDTO  delivery)
{
	this->delivery = delivery;
}



