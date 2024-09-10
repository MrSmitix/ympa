#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoConstraintsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoConstraintsDTO::GetPromoConstraintsDTO()
{
	//__init();
}

GetPromoConstraintsDTO::~GetPromoConstraintsDTO()
{
	//__cleanup();
}

void
GetPromoConstraintsDTO::__init()
{
	//new std::list()std::list> warehouseIds;
}

void
GetPromoConstraintsDTO::__cleanup()
{
	//if(warehouseIds != NULL) {
	//warehouseIds.RemoveAll(true);
	//delete warehouseIds;
	//warehouseIds = NULL;
	//}
	//
}

void
GetPromoConstraintsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *warehouseIdsKey = "warehouseIds";
	node = json_object_get_member(pJsonObject, warehouseIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			warehouseIds = new_list;
		}
		
	}
}

GetPromoConstraintsDTO::GetPromoConstraintsDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromoConstraintsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getWarehouseIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getWarehouseIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *warehouseIdsKey = "warehouseIds";
	json_object_set_member(pJsonObject, warehouseIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<long long>
GetPromoConstraintsDTO::getWarehouseIds()
{
	return warehouseIds;
}

void
GetPromoConstraintsDTO::setWarehouseIds(std::list <long long> warehouseIds)
{
	this->warehouseIds = warehouseIds;
}


