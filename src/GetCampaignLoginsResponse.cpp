#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCampaignLoginsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCampaignLoginsResponse::GetCampaignLoginsResponse()
{
	//__init();
}

GetCampaignLoginsResponse::~GetCampaignLoginsResponse()
{
	//__cleanup();
}

void
GetCampaignLoginsResponse::__init()
{
	//new std::list()std::list> logins;
}

void
GetCampaignLoginsResponse::__cleanup()
{
	//if(logins != NULL) {
	//logins.RemoveAll(true);
	//delete logins;
	//logins = NULL;
	//}
	//
}

void
GetCampaignLoginsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *loginsKey = "logins";
	node = json_object_get_member(pJsonObject, loginsKey);
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
			logins = new_list;
		}
		
	}
}

GetCampaignLoginsResponse::GetCampaignLoginsResponse(char* json)
{
	this->fromJson(json);
}

char*
GetCampaignLoginsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getLogins());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getLogins());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *loginsKey = "logins";
	json_object_set_member(pJsonObject, loginsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
GetCampaignLoginsResponse::getLogins()
{
	return logins;
}

void
GetCampaignLoginsResponse::setLogins(std::list <std::string> logins)
{
	this->logins = logins;
}


