#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferConditionDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferConditionDTO::OfferConditionDTO()
{
	//__init();
}

OfferConditionDTO::~OfferConditionDTO()
{
	//__cleanup();
}

void
OfferConditionDTO::__init()
{
	//type = new OfferConditionType();
	//quality = new OfferConditionQualityType();
	//reason = std::string();
}

void
OfferConditionDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(quality != NULL) {
	//
	//delete quality;
	//quality = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
OfferConditionDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferConditionType")) {
			jsonToValue(&type, node, "OfferConditionType", "OfferConditionType");
		} else {
			
			OfferConditionType* obj = static_cast<OfferConditionType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *qualityKey = "quality";
	node = json_object_get_member(pJsonObject, qualityKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferConditionQualityType")) {
			jsonToValue(&quality, node, "OfferConditionQualityType", "OfferConditionQualityType");
		} else {
			
			OfferConditionQualityType* obj = static_cast<OfferConditionQualityType*> (&quality);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reason, node, "std::string", "");
		} else {
			
		}
	}
}

OfferConditionDTO::OfferConditionDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferConditionDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferConditionType")) {
		OfferConditionType obj = getType();
		node = converttoJson(&obj, "OfferConditionType", "");
	}
	else {
		
		OfferConditionType obj = static_cast<OfferConditionType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("OfferConditionQualityType")) {
		OfferConditionQualityType obj = getQuality();
		node = converttoJson(&obj, "OfferConditionQualityType", "");
	}
	else {
		
		OfferConditionQualityType obj = static_cast<OfferConditionQualityType> (getQuality());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *qualityKey = "quality";
	json_object_set_member(pJsonObject, qualityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


