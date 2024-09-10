#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QualityRatingAffectedOrderDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QualityRatingAffectedOrderDTO::QualityRatingAffectedOrderDTO()
{
	//__init();
}

QualityRatingAffectedOrderDTO::~QualityRatingAffectedOrderDTO()
{
	//__cleanup();
}

void
QualityRatingAffectedOrderDTO::__init()
{
	//orderId = long(0);
	//description = std::string();
	//componentType = new AffectedOrderQualityRatingComponentType();
}

void
QualityRatingAffectedOrderDTO::__cleanup()
{
	//if(orderId != NULL) {
	//
	//delete orderId;
	//orderId = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(componentType != NULL) {
	//
	//delete componentType;
	//componentType = NULL;
	//}
	//
}

void
QualityRatingAffectedOrderDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orderIdKey = "orderId";
	node = json_object_get_member(pJsonObject, orderIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&orderId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *componentTypeKey = "componentType";
	node = json_object_get_member(pJsonObject, componentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("AffectedOrderQualityRatingComponentType")) {
			jsonToValue(&componentType, node, "AffectedOrderQualityRatingComponentType", "AffectedOrderQualityRatingComponentType");
		} else {
			
			AffectedOrderQualityRatingComponentType* obj = static_cast<AffectedOrderQualityRatingComponentType*> (&componentType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

QualityRatingAffectedOrderDTO::QualityRatingAffectedOrderDTO(char* json)
{
	this->fromJson(json);
}

char*
QualityRatingAffectedOrderDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getOrderId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *orderIdKey = "orderId";
	json_object_set_member(pJsonObject, orderIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("AffectedOrderQualityRatingComponentType")) {
		AffectedOrderQualityRatingComponentType obj = getComponentType();
		node = converttoJson(&obj, "AffectedOrderQualityRatingComponentType", "");
	}
	else {
		
		AffectedOrderQualityRatingComponentType obj = static_cast<AffectedOrderQualityRatingComponentType> (getComponentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *componentTypeKey = "componentType";
	json_object_set_member(pJsonObject, componentTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
QualityRatingAffectedOrderDTO::getOrderId()
{
	return orderId;
}

void
QualityRatingAffectedOrderDTO::setOrderId(long long  orderId)
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


