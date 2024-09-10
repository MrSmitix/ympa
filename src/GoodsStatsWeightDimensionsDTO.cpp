#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoodsStatsWeightDimensionsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoodsStatsWeightDimensionsDTO::GoodsStatsWeightDimensionsDTO()
{
	//__init();
}

GoodsStatsWeightDimensionsDTO::~GoodsStatsWeightDimensionsDTO()
{
	//__cleanup();
}

void
GoodsStatsWeightDimensionsDTO::__init()
{
	//length = double(0);
	//width = double(0);
	//height = double(0);
	//weight = double(0);
}

void
GoodsStatsWeightDimensionsDTO::__cleanup()
{
	//if(length != NULL) {
	//
	//delete length;
	//length = NULL;
	//}
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//if(height != NULL) {
	//
	//delete height;
	//height = NULL;
	//}
	//if(weight != NULL) {
	//
	//delete weight;
	//weight = NULL;
	//}
	//
}

void
GoodsStatsWeightDimensionsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *lengthKey = "length";
	node = json_object_get_member(pJsonObject, lengthKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&length, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&length);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *widthKey = "width";
	node = json_object_get_member(pJsonObject, widthKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&width, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&width);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *heightKey = "height";
	node = json_object_get_member(pJsonObject, heightKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&height, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&height);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *weightKey = "weight";
	node = json_object_get_member(pJsonObject, weightKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&weight, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&weight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoodsStatsWeightDimensionsDTO::GoodsStatsWeightDimensionsDTO(char* json)
{
	this->fromJson(json);
}

char*
GoodsStatsWeightDimensionsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getLength();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lengthKey = "length";
	json_object_set_member(pJsonObject, lengthKey, node);
	if (isprimitive("long long")) {
		long long obj = getWidth();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getWidth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *widthKey = "width";
	json_object_set_member(pJsonObject, widthKey, node);
	if (isprimitive("long long")) {
		long long obj = getHeight();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getHeight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *heightKey = "height";
	json_object_set_member(pJsonObject, heightKey, node);
	if (isprimitive("long long")) {
		long long obj = getWeight();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getWeight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *weightKey = "weight";
	json_object_set_member(pJsonObject, weightKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GoodsStatsWeightDimensionsDTO::getLength()
{
	return length;
}

void
GoodsStatsWeightDimensionsDTO::setLength(long long  length)
{
	this->length = length;
}

long long
GoodsStatsWeightDimensionsDTO::getWidth()
{
	return width;
}

void
GoodsStatsWeightDimensionsDTO::setWidth(long long  width)
{
	this->width = width;
}

long long
GoodsStatsWeightDimensionsDTO::getHeight()
{
	return height;
}

void
GoodsStatsWeightDimensionsDTO::setHeight(long long  height)
{
	this->height = height;
}

long long
GoodsStatsWeightDimensionsDTO::getWeight()
{
	return weight;
}

void
GoodsStatsWeightDimensionsDTO::setWeight(long long  weight)
{
	this->weight = weight;
}


