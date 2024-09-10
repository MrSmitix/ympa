#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CategoryParameterUnitDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CategoryParameterUnitDTO::CategoryParameterUnitDTO()
{
	//__init();
}

CategoryParameterUnitDTO::~CategoryParameterUnitDTO()
{
	//__cleanup();
}

void
CategoryParameterUnitDTO::__init()
{
	//defaultUnitId = long(0);
	//new std::list()std::list> units;
}

void
CategoryParameterUnitDTO::__cleanup()
{
	//if(defaultUnitId != NULL) {
	//
	//delete defaultUnitId;
	//defaultUnitId = NULL;
	//}
	//if(units != NULL) {
	//units.RemoveAll(true);
	//delete units;
	//units = NULL;
	//}
	//
}

void
CategoryParameterUnitDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *defaultUnitIdKey = "defaultUnitId";
	node = json_object_get_member(pJsonObject, defaultUnitIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&defaultUnitId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *unitsKey = "units";
	node = json_object_get_member(pJsonObject, unitsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UnitDTO> new_list;
			UnitDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UnitDTO")) {
					jsonToValue(&inst, temp_json, "UnitDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			units = new_list;
		}
		
	}
}

CategoryParameterUnitDTO::CategoryParameterUnitDTO(char* json)
{
	this->fromJson(json);
}

char*
CategoryParameterUnitDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getDefaultUnitId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *defaultUnitIdKey = "defaultUnitId";
	json_object_set_member(pJsonObject, defaultUnitIdKey, node);
	if (isprimitive("UnitDTO")) {
		list<UnitDTO> new_list = static_cast<list <UnitDTO> > (getUnits());
		node = converttoJson(&new_list, "UnitDTO", "array");
	} else {
		node = json_node_alloc();
		list<UnitDTO> new_list = static_cast<list <UnitDTO> > (getUnits());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UnitDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UnitDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *unitsKey = "units";
	json_object_set_member(pJsonObject, unitsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CategoryParameterUnitDTO::getDefaultUnitId()
{
	return defaultUnitId;
}

void
CategoryParameterUnitDTO::setDefaultUnitId(long long  defaultUnitId)
{
	this->defaultUnitId = defaultUnitId;
}

std::list<UnitDTO>
CategoryParameterUnitDTO::getUnits()
{
	return units;
}

void
CategoryParameterUnitDTO::setUnits(std::list <UnitDTO> units)
{
	this->units = units;
}


