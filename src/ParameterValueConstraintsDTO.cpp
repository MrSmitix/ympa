#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ParameterValueConstraintsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ParameterValueConstraintsDTO::ParameterValueConstraintsDTO()
{
	//__init();
}

ParameterValueConstraintsDTO::~ParameterValueConstraintsDTO()
{
	//__cleanup();
}

void
ParameterValueConstraintsDTO::__init()
{
	//minValue = double(0);
	//maxValue = double(0);
	//maxLength = int(0);
}

void
ParameterValueConstraintsDTO::__cleanup()
{
	//if(minValue != NULL) {
	//
	//delete minValue;
	//minValue = NULL;
	//}
	//if(maxValue != NULL) {
	//
	//delete maxValue;
	//maxValue = NULL;
	//}
	//if(maxLength != NULL) {
	//
	//delete maxLength;
	//maxLength = NULL;
	//}
	//
}

void
ParameterValueConstraintsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *minValueKey = "minValue";
	node = json_object_get_member(pJsonObject, minValueKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&minValue, node, "double", "");
		} else {
			
		}
	}
	const gchar *maxValueKey = "maxValue";
	node = json_object_get_member(pJsonObject, maxValueKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&maxValue, node, "double", "");
		} else {
			
		}
	}
	const gchar *maxLengthKey = "maxLength";
	node = json_object_get_member(pJsonObject, maxLengthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&maxLength, node, "int", "");
		} else {
			
		}
	}
}

ParameterValueConstraintsDTO::ParameterValueConstraintsDTO(char* json)
{
	this->fromJson(json);
}

char*
ParameterValueConstraintsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getMinValue();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *minValueKey = "minValue";
	json_object_set_member(pJsonObject, minValueKey, node);
	if (isprimitive("double")) {
		double obj = getMaxValue();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *maxValueKey = "maxValue";
	json_object_set_member(pJsonObject, maxValueKey, node);
	if (isprimitive("int")) {
		int obj = getMaxLength();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *maxLengthKey = "maxLength";
	json_object_set_member(pJsonObject, maxLengthKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

double
ParameterValueConstraintsDTO::getMinValue()
{
	return minValue;
}

void
ParameterValueConstraintsDTO::setMinValue(double  minValue)
{
	this->minValue = minValue;
}

double
ParameterValueConstraintsDTO::getMaxValue()
{
	return maxValue;
}

void
ParameterValueConstraintsDTO::setMaxValue(double  maxValue)
{
	this->maxValue = maxValue;
}

int
ParameterValueConstraintsDTO::getMaxLength()
{
	return maxLength;
}

void
ParameterValueConstraintsDTO::setMaxLength(int  maxLength)
{
	this->maxLength = maxLength;
}


