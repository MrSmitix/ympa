#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ModelPriceDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ModelPriceDTO::ModelPriceDTO()
{
	//__init();
}

ModelPriceDTO::~ModelPriceDTO()
{
	//__cleanup();
}

void
ModelPriceDTO::__init()
{
	//avg = double(0);
	//max = double(0);
	//min = double(0);
}

void
ModelPriceDTO::__cleanup()
{
	//if(avg != NULL) {
	//
	//delete avg;
	//avg = NULL;
	//}
	//if(max != NULL) {
	//
	//delete max;
	//max = NULL;
	//}
	//if(min != NULL) {
	//
	//delete min;
	//min = NULL;
	//}
	//
}

void
ModelPriceDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *avgKey = "avg";
	node = json_object_get_member(pJsonObject, avgKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&avg, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&avg);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxKey = "max";
	node = json_object_get_member(pJsonObject, maxKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&max, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&max);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minKey = "min";
	node = json_object_get_member(pJsonObject, minKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&min, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&min);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ModelPriceDTO::ModelPriceDTO(char* json)
{
	this->fromJson(json);
}

char*
ModelPriceDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getAvg();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAvg());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *avgKey = "avg";
	json_object_set_member(pJsonObject, avgKey, node);
	if (isprimitive("long long")) {
		long long obj = getMax();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMax());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxKey = "max";
	json_object_set_member(pJsonObject, maxKey, node);
	if (isprimitive("long long")) {
		long long obj = getMin();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minKey = "min";
	json_object_set_member(pJsonObject, minKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
ModelPriceDTO::getAvg()
{
	return avg;
}

void
ModelPriceDTO::setAvg(long long  avg)
{
	this->avg = avg;
}

long long
ModelPriceDTO::getMax()
{
	return max;
}

void
ModelPriceDTO::setMax(long long  max)
{
	this->max = max;
}

long long
ModelPriceDTO::getMin()
{
	return min;
}

void
ModelPriceDTO::setMin(long long  min)
{
	this->min = min;
}


