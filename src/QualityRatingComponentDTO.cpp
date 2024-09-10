#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QualityRatingComponentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QualityRatingComponentDTO::QualityRatingComponentDTO()
{
	//__init();
}

QualityRatingComponentDTO::~QualityRatingComponentDTO()
{
	//__cleanup();
}

void
QualityRatingComponentDTO::__init()
{
	//value = double(0);
	//componentType = new QualityRatingComponentType();
}

void
QualityRatingComponentDTO::__cleanup()
{
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(componentType != NULL) {
	//
	//delete componentType;
	//componentType = NULL;
	//}
	//
}

void
QualityRatingComponentDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&value, node, "double", "");
		} else {
			
		}
	}
	const gchar *componentTypeKey = "componentType";
	node = json_object_get_member(pJsonObject, componentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("QualityRatingComponentType")) {
			jsonToValue(&componentType, node, "QualityRatingComponentType", "QualityRatingComponentType");
		} else {
			
			QualityRatingComponentType* obj = static_cast<QualityRatingComponentType*> (&componentType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

QualityRatingComponentDTO::QualityRatingComponentDTO(char* json)
{
	this->fromJson(json);
}

char*
QualityRatingComponentDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getValue();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("QualityRatingComponentType")) {
		QualityRatingComponentType obj = getComponentType();
		node = converttoJson(&obj, "QualityRatingComponentType", "");
	}
	else {
		
		QualityRatingComponentType obj = static_cast<QualityRatingComponentType> (getComponentType());
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

double
QualityRatingComponentDTO::getValue()
{
	return value;
}

void
QualityRatingComponentDTO::setValue(double  value)
{
	this->value = value;
}

QualityRatingComponentType
QualityRatingComponentDTO::getComponentType()
{
	return componentType;
}

void
QualityRatingComponentDTO::setComponentType(QualityRatingComponentType  componentType)
{
	this->componentType = componentType;
}


