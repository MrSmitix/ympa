#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AddOffersToArchiveDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AddOffersToArchiveDTO::AddOffersToArchiveDTO()
{
	//__init();
}

AddOffersToArchiveDTO::~AddOffersToArchiveDTO()
{
	//__cleanup();
}

void
AddOffersToArchiveDTO::__init()
{
	//new std::list()std::list> notArchivedOffers;
}

void
AddOffersToArchiveDTO::__cleanup()
{
	//if(notArchivedOffers != NULL) {
	//notArchivedOffers.RemoveAll(true);
	//delete notArchivedOffers;
	//notArchivedOffers = NULL;
	//}
	//
}

void
AddOffersToArchiveDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *notArchivedOffersKey = "notArchivedOffers";
	node = json_object_get_member(pJsonObject, notArchivedOffersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AddOffersToArchiveErrorDTO> new_list;
			AddOffersToArchiveErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AddOffersToArchiveErrorDTO")) {
					jsonToValue(&inst, temp_json, "AddOffersToArchiveErrorDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			notArchivedOffers = new_list;
		}
		
	}
}

AddOffersToArchiveDTO::AddOffersToArchiveDTO(char* json)
{
	this->fromJson(json);
}

char*
AddOffersToArchiveDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AddOffersToArchiveErrorDTO")) {
		list<AddOffersToArchiveErrorDTO> new_list = static_cast<list <AddOffersToArchiveErrorDTO> > (getNotArchivedOffers());
		node = converttoJson(&new_list, "AddOffersToArchiveErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<AddOffersToArchiveErrorDTO> new_list = static_cast<list <AddOffersToArchiveErrorDTO> > (getNotArchivedOffers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AddOffersToArchiveErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AddOffersToArchiveErrorDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *notArchivedOffersKey = "notArchivedOffers";
	json_object_set_member(pJsonObject, notArchivedOffersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AddOffersToArchiveErrorDTO>
AddOffersToArchiveDTO::getNotArchivedOffers()
{
	return notArchivedOffers;
}

void
AddOffersToArchiveDTO::setNotArchivedOffers(std::list <AddOffersToArchiveErrorDTO> notArchivedOffers)
{
	this->notArchivedOffers = notArchivedOffers;
}


