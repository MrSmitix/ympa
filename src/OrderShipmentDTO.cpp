#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderShipmentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderShipmentDTO::OrderShipmentDTO()
{
	//__init();
}

OrderShipmentDTO::~OrderShipmentDTO()
{
	//__cleanup();
}

void
OrderShipmentDTO::__init()
{
	//id = long(0);
	//shipmentDate = std::string();
	//shipmentTime = std::string();
	//new std::list()std::list> tracks;
	//new std::list()std::list> boxes;
}

void
OrderShipmentDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(shipmentDate != NULL) {
	//
	//delete shipmentDate;
	//shipmentDate = NULL;
	//}
	//if(shipmentTime != NULL) {
	//
	//delete shipmentTime;
	//shipmentTime = NULL;
	//}
	//if(tracks != NULL) {
	//tracks.RemoveAll(true);
	//delete tracks;
	//tracks = NULL;
	//}
	//if(boxes != NULL) {
	//boxes.RemoveAll(true);
	//delete boxes;
	//boxes = NULL;
	//}
	//
}

void
OrderShipmentDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *shipmentDateKey = "shipmentDate";
	node = json_object_get_member(pJsonObject, shipmentDateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shipmentDate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shipmentTimeKey = "shipmentTime";
	node = json_object_get_member(pJsonObject, shipmentTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&shipmentTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tracksKey = "tracks";
	node = json_object_get_member(pJsonObject, tracksKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderTrackDTO> new_list;
			OrderTrackDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderTrackDTO")) {
					jsonToValue(&inst, temp_json, "OrderTrackDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tracks = new_list;
		}
		
	}
	const gchar *boxesKey = "boxes";
	node = json_object_get_member(pJsonObject, boxesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderParcelBoxDTO> new_list;
			OrderParcelBoxDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderParcelBoxDTO")) {
					jsonToValue(&inst, temp_json, "OrderParcelBoxDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			boxes = new_list;
		}
		
	}
}

OrderShipmentDTO::OrderShipmentDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderShipmentDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShipmentDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shipmentDateKey = "shipmentDate";
	json_object_set_member(pJsonObject, shipmentDateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getShipmentTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *shipmentTimeKey = "shipmentTime";
	json_object_set_member(pJsonObject, shipmentTimeKey, node);
	if (isprimitive("OrderTrackDTO")) {
		list<OrderTrackDTO> new_list = static_cast<list <OrderTrackDTO> > (getTracks());
		node = converttoJson(&new_list, "OrderTrackDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderTrackDTO> new_list = static_cast<list <OrderTrackDTO> > (getTracks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderTrackDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderTrackDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tracksKey = "tracks";
	json_object_set_member(pJsonObject, tracksKey, node);
	if (isprimitive("OrderParcelBoxDTO")) {
		list<OrderParcelBoxDTO> new_list = static_cast<list <OrderParcelBoxDTO> > (getBoxes());
		node = converttoJson(&new_list, "OrderParcelBoxDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderParcelBoxDTO> new_list = static_cast<list <OrderParcelBoxDTO> > (getBoxes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderParcelBoxDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderParcelBoxDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *boxesKey = "boxes";
	json_object_set_member(pJsonObject, boxesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OrderShipmentDTO::getId()
{
	return id;
}

void
OrderShipmentDTO::setId(long long  id)
{
	this->id = id;
}

std::string
OrderShipmentDTO::getShipmentDate()
{
	return shipmentDate;
}

void
OrderShipmentDTO::setShipmentDate(std::string  shipmentDate)
{
	this->shipmentDate = shipmentDate;
}

std::string
OrderShipmentDTO::getShipmentTime()
{
	return shipmentTime;
}

void
OrderShipmentDTO::setShipmentTime(std::string  shipmentTime)
{
	this->shipmentTime = shipmentTime;
}

std::list<OrderTrackDTO>
OrderShipmentDTO::getTracks()
{
	return tracks;
}

void
OrderShipmentDTO::setTracks(std::list <OrderTrackDTO> tracks)
{
	this->tracks = tracks;
}

std::list<OrderParcelBoxDTO>
OrderShipmentDTO::getBoxes()
{
	return boxes;
}

void
OrderShipmentDTO::setBoxes(std::list <OrderParcelBoxDTO> boxes)
{
	this->boxes = boxes;
}


