#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateOfferContentRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateOfferContentRequest::UpdateOfferContentRequest()
{
	//__init();
}

UpdateOfferContentRequest::~UpdateOfferContentRequest()
{
	//__cleanup();
}

void
UpdateOfferContentRequest::__init()
{
	//new std::list()std::list> offersContent;
}

void
UpdateOfferContentRequest::__cleanup()
{
	//if(offersContent != NULL) {
	//offersContent.RemoveAll(true);
	//delete offersContent;
	//offersContent = NULL;
	//}
	//
}

void
UpdateOfferContentRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offersContentKey = "offersContent";
	node = json_object_get_member(pJsonObject, offersContentKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferContentDTO> new_list;
			OfferContentDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferContentDTO")) {
					jsonToValue(&inst, temp_json, "OfferContentDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			offersContent = new_list;
		}
		
	}
}

UpdateOfferContentRequest::UpdateOfferContentRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateOfferContentRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OfferContentDTO")) {
		list<OfferContentDTO> new_list = static_cast<list <OfferContentDTO> > (getOffersContent());
		node = converttoJson(&new_list, "OfferContentDTO", "array");
	} else {
		node = json_node_alloc();
		list<OfferContentDTO> new_list = static_cast<list <OfferContentDTO> > (getOffersContent());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferContentDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferContentDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *offersContentKey = "offersContent";
	json_object_set_member(pJsonObject, offersContentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OfferContentDTO>
UpdateOfferContentRequest::getOffersContent()
{
	return offersContent;
}

void
UpdateOfferContentRequest::setOffersContent(std::list <OfferContentDTO> offersContent)
{
	this->offersContent = offersContent;
}


