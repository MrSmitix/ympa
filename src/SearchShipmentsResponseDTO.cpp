#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SearchShipmentsResponseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SearchShipmentsResponseDTO::SearchShipmentsResponseDTO()
{
	//__init();
}

SearchShipmentsResponseDTO::~SearchShipmentsResponseDTO()
{
	//__cleanup();
}

void
SearchShipmentsResponseDTO::__init()
{
	//new std::list()std::list> shipments;
	//paging = new ForwardScrollingPagerDTO();
}

void
SearchShipmentsResponseDTO::__cleanup()
{
	//if(shipments != NULL) {
	//shipments.RemoveAll(true);
	//delete shipments;
	//shipments = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
SearchShipmentsResponseDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *shipmentsKey = "shipments";
	node = json_object_get_member(pJsonObject, shipmentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ShipmentInfoDTO> new_list;
			ShipmentInfoDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ShipmentInfoDTO")) {
					jsonToValue(&inst, temp_json, "ShipmentInfoDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			shipments = new_list;
		}
		
	}
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ForwardScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ForwardScrollingPagerDTO", "ForwardScrollingPagerDTO");
		} else {
			
			ForwardScrollingPagerDTO* obj = static_cast<ForwardScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

SearchShipmentsResponseDTO::SearchShipmentsResponseDTO(char* json)
{
	this->fromJson(json);
}

char*
SearchShipmentsResponseDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ShipmentInfoDTO")) {
		list<ShipmentInfoDTO> new_list = static_cast<list <ShipmentInfoDTO> > (getShipments());
		node = converttoJson(&new_list, "ShipmentInfoDTO", "array");
	} else {
		node = json_node_alloc();
		list<ShipmentInfoDTO> new_list = static_cast<list <ShipmentInfoDTO> > (getShipments());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ShipmentInfoDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ShipmentInfoDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *shipmentsKey = "shipments";
	json_object_set_member(pJsonObject, shipmentsKey, node);
	if (isprimitive("ForwardScrollingPagerDTO")) {
		ForwardScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ForwardScrollingPagerDTO", "");
	}
	else {
		
		ForwardScrollingPagerDTO obj = static_cast<ForwardScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ShipmentInfoDTO>
SearchShipmentsResponseDTO::getShipments()
{
	return shipments;
}

void
SearchShipmentsResponseDTO::setShipments(std::list <ShipmentInfoDTO> shipments)
{
	this->shipments = shipments;
}

ForwardScrollingPagerDTO
SearchShipmentsResponseDTO::getPaging()
{
	return paging;
}

void
SearchShipmentsResponseDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


