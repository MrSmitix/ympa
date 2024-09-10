#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromosResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromosResultDTO::GetPromosResultDTO()
{
	//__init();
}

GetPromosResultDTO::~GetPromosResultDTO()
{
	//__cleanup();
}

void
GetPromosResultDTO::__init()
{
	//new std::list()std::list> promos;
}

void
GetPromosResultDTO::__cleanup()
{
	//if(promos != NULL) {
	//promos.RemoveAll(true);
	//delete promos;
	//promos = NULL;
	//}
	//
}

void
GetPromosResultDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *promosKey = "promos";
	node = json_object_get_member(pJsonObject, promosKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GetPromoDTO> new_list;
			GetPromoDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GetPromoDTO")) {
					jsonToValue(&inst, temp_json, "GetPromoDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			promos = new_list;
		}
		
	}
}

GetPromosResultDTO::GetPromosResultDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromosResultDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GetPromoDTO")) {
		list<GetPromoDTO> new_list = static_cast<list <GetPromoDTO> > (getPromos());
		node = converttoJson(&new_list, "GetPromoDTO", "array");
	} else {
		node = json_node_alloc();
		list<GetPromoDTO> new_list = static_cast<list <GetPromoDTO> > (getPromos());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GetPromoDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GetPromoDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *promosKey = "promos";
	json_object_set_member(pJsonObject, promosKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<GetPromoDTO>
GetPromosResultDTO::getPromos()
{
	return promos;
}

void
GetPromosResultDTO::setPromos(std::list <GetPromoDTO> promos)
{
	this->promos = promos;
}


