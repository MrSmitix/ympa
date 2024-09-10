#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ExtensionShipmentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ExtensionShipmentDTO::ExtensionShipmentDTO()
{
	//__init();
}

ExtensionShipmentDTO::~ExtensionShipmentDTO()
{
	//__cleanup();
}

void
ExtensionShipmentDTO::__init()
{
	//currentStatus = new ShipmentStatusChangeDTO();
	//new std::list()Set> availableActions;
}

void
ExtensionShipmentDTO::__cleanup()
{
	//if(currentStatus != NULL) {
	//
	//delete currentStatus;
	//currentStatus = NULL;
	//}
	//if(availableActions != NULL) {
	//availableActions.RemoveAll(true);
	//delete availableActions;
	//availableActions = NULL;
	//}
	//
}

void
ExtensionShipmentDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *currentStatusKey = "currentStatus";
	node = json_object_get_member(pJsonObject, currentStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("ShipmentStatusChangeDTO")) {
			jsonToValue(&currentStatus, node, "ShipmentStatusChangeDTO", "ShipmentStatusChangeDTO");
		} else {
			
			ShipmentStatusChangeDTO* obj = static_cast<ShipmentStatusChangeDTO*> (&currentStatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *availableActionsKey = "availableActions";
	node = json_object_get_member(pJsonObject, availableActionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ShipmentActionType> new_list;
			ShipmentActionType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ShipmentActionType")) {
					jsonToValue(&inst, temp_json, "ShipmentActionType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			availableActions = new_list;
		}
		
	}
}

ExtensionShipmentDTO::ExtensionShipmentDTO(char* json)
{
	this->fromJson(json);
}

char*
ExtensionShipmentDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ShipmentStatusChangeDTO")) {
		ShipmentStatusChangeDTO obj = getCurrentStatus();
		node = converttoJson(&obj, "ShipmentStatusChangeDTO", "");
	}
	else {
		
		ShipmentStatusChangeDTO obj = static_cast<ShipmentStatusChangeDTO> (getCurrentStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currentStatusKey = "currentStatus";
	json_object_set_member(pJsonObject, currentStatusKey, node);
	if (isprimitive("ShipmentActionType")) {
		list<ShipmentActionType> new_list = static_cast<list <ShipmentActionType> > (getAvailableActions());
		node = converttoJson(&new_list, "ShipmentActionType", "set");
	} else {
		node = json_node_alloc();
		list<ShipmentActionType> new_list = static_cast<list <ShipmentActionType> > (getAvailableActions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ShipmentActionType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ShipmentActionType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *availableActionsKey = "availableActions";
	json_object_set_member(pJsonObject, availableActionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ShipmentStatusChangeDTO
ExtensionShipmentDTO::getCurrentStatus()
{
	return currentStatus;
}

void
ExtensionShipmentDTO::setCurrentStatus(ShipmentStatusChangeDTO  currentStatus)
{
	this->currentStatus = currentStatus;
}

Set<ShipmentActionType>
ExtensionShipmentDTO::getAvailableActions()
{
	return availableActions;
}

void
ExtensionShipmentDTO::setAvailableActions(Set <ShipmentActionType> availableActions)
{
	this->availableActions = availableActions;
}


