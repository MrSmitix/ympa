#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignSettingsLocalRegionDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignSettingsLocalRegionDTO::CampaignSettingsLocalRegionDTO()
{
	//__init();
}

CampaignSettingsLocalRegionDTO::~CampaignSettingsLocalRegionDTO()
{
	//__cleanup();
}

void
CampaignSettingsLocalRegionDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//type = new RegionType();
	//deliveryOptionsSource = new CampaignSettingsScheduleSourceType();
	//delivery = new CampaignSettingsDeliveryDTO();
}

void
CampaignSettingsLocalRegionDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(deliveryOptionsSource != NULL) {
	//
	//delete deliveryOptionsSource;
	//deliveryOptionsSource = NULL;
	//}
	//if(delivery != NULL) {
	//
	//delete delivery;
	//delivery = NULL;
	//}
	//
}

void
CampaignSettingsLocalRegionDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionType")) {
			jsonToValue(&type, node, "RegionType", "RegionType");
		} else {
			
			RegionType* obj = static_cast<RegionType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deliveryOptionsSourceKey = "deliveryOptionsSource";
	node = json_object_get_member(pJsonObject, deliveryOptionsSourceKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignSettingsScheduleSourceType")) {
			jsonToValue(&deliveryOptionsSource, node, "CampaignSettingsScheduleSourceType", "CampaignSettingsScheduleSourceType");
		} else {
			
			CampaignSettingsScheduleSourceType* obj = static_cast<CampaignSettingsScheduleSourceType*> (&deliveryOptionsSource);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deliveryKey = "delivery";
	node = json_object_get_member(pJsonObject, deliveryKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignSettingsDeliveryDTO")) {
			jsonToValue(&delivery, node, "CampaignSettingsDeliveryDTO", "CampaignSettingsDeliveryDTO");
		} else {
			
			CampaignSettingsDeliveryDTO* obj = static_cast<CampaignSettingsDeliveryDTO*> (&delivery);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignSettingsLocalRegionDTO::CampaignSettingsLocalRegionDTO(char* json)
{
	this->fromJson(json);
}

char*
CampaignSettingsLocalRegionDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("RegionType")) {
		RegionType obj = getType();
		node = converttoJson(&obj, "RegionType", "");
	}
	else {
		
		RegionType obj = static_cast<RegionType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("CampaignSettingsScheduleSourceType")) {
		CampaignSettingsScheduleSourceType obj = getDeliveryOptionsSource();
		node = converttoJson(&obj, "CampaignSettingsScheduleSourceType", "");
	}
	else {
		
		CampaignSettingsScheduleSourceType obj = static_cast<CampaignSettingsScheduleSourceType> (getDeliveryOptionsSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryOptionsSourceKey = "deliveryOptionsSource";
	json_object_set_member(pJsonObject, deliveryOptionsSourceKey, node);
	if (isprimitive("CampaignSettingsDeliveryDTO")) {
		CampaignSettingsDeliveryDTO obj = getDelivery();
		node = converttoJson(&obj, "CampaignSettingsDeliveryDTO", "");
	}
	else {
		
		CampaignSettingsDeliveryDTO obj = static_cast<CampaignSettingsDeliveryDTO> (getDelivery());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deliveryKey = "delivery";
	json_object_set_member(pJsonObject, deliveryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CampaignSettingsLocalRegionDTO::getId()
{
	return id;
}

void
CampaignSettingsLocalRegionDTO::setId(long long  id)
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


