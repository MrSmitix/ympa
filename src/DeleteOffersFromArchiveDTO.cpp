#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteOffersFromArchiveDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteOffersFromArchiveDTO::DeleteOffersFromArchiveDTO()
{
	//__init();
}

DeleteOffersFromArchiveDTO::~DeleteOffersFromArchiveDTO()
{
	//__cleanup();
}

void
DeleteOffersFromArchiveDTO::__init()
{
	//new std::list()std::list> notUnarchivedOfferIds;
}

void
DeleteOffersFromArchiveDTO::__cleanup()
{
	//if(notUnarchivedOfferIds != NULL) {
	//notUnarchivedOfferIds.RemoveAll(true);
	//delete notUnarchivedOfferIds;
	//notUnarchivedOfferIds = NULL;
	//}
	//
}

void
DeleteOffersFromArchiveDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *notUnarchivedOfferIdsKey = "notUnarchivedOfferIds";
	node = json_object_get_member(pJsonObject, notUnarchivedOfferIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			notUnarchivedOfferIds = new_list;
		}
		
	}
}

DeleteOffersFromArchiveDTO::DeleteOffersFromArchiveDTO(char* json)
{
	this->fromJson(json);
}

char*
DeleteOffersFromArchiveDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getNotUnarchivedOfferIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getNotUnarchivedOfferIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *notUnarchivedOfferIdsKey = "notUnarchivedOfferIds";
	json_object_set_member(pJsonObject, notUnarchivedOfferIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
DeleteOffersFromArchiveDTO::getNotUnarchivedOfferIds()
{
	return notUnarchivedOfferIds;
}

void
DeleteOffersFromArchiveDTO::setNotUnarchivedOfferIds(std::list <std::string> notUnarchivedOfferIds)
{
	this->notUnarchivedOfferIds = notUnarchivedOfferIds;
}


