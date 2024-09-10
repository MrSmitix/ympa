#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferProcessingStateDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferProcessingStateDTO::OfferProcessingStateDTO()
{
	//__init();
}

OfferProcessingStateDTO::~OfferProcessingStateDTO()
{
	//__cleanup();
}

void
OfferProcessingStateDTO::__init()
{
	//status = new OfferProcessingStatusType();
	//new std::list()std::list> notes;
}

void
OfferProcessingStateDTO::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(notes != NULL) {
	//notes.RemoveAll(true);
	//delete notes;
	//notes = NULL;
	//}
	//
}

void
OfferProcessingStateDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OfferProcessingStatusType")) {
			jsonToValue(&status, node, "OfferProcessingStatusType", "OfferProcessingStatusType");
		} else {
			
			OfferProcessingStatusType* obj = static_cast<OfferProcessingStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *notesKey = "notes";
	node = json_object_get_member(pJsonObject, notesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferProcessingNoteDTO> new_list;
			OfferProcessingNoteDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferProcessingNoteDTO")) {
					jsonToValue(&inst, temp_json, "OfferProcessingNoteDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			notes = new_list;
		}
		
	}
}

OfferProcessingStateDTO::OfferProcessingStateDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferProcessingStateDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferProcessingStatusType")) {
		OfferProcessingStatusType obj = getStatus();
		node = converttoJson(&obj, "OfferProcessingStatusType", "");
	}
	else {
		
		OfferProcessingStatusType obj = static_cast<OfferProcessingStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("OfferProcessingNoteDTO")) {
		list<OfferProcessingNoteDTO> new_list = static_cast<list <OfferProcessingNoteDTO> > (getNotes());
		node = converttoJson(&new_list, "OfferProcessingNoteDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferProcessingNoteDTO> new_list = static_cast<list <OfferProcessingNoteDTO> > (getNotes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferProcessingNoteDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferProcessingNoteDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *notesKey = "notes";
	json_object_set_member(pJsonObject, notesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OfferProcessingStatusType
OfferProcessingStateDTO::getStatus()
{
	return status;
}

void
OfferProcessingStateDTO::setStatus(OfferProcessingStatusType  status)
{
	this->status = status;
}

std::list<OfferProcessingNoteDTO>
OfferProcessingStateDTO::getNotes()
{
	return notes;
}

void
OfferProcessingStateDTO::setNotes(std::list <OfferProcessingNoteDTO> notes)
{
	this->notes = notes;
}


