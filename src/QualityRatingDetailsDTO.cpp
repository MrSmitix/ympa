#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QualityRatingDetailsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QualityRatingDetailsDTO::QualityRatingDetailsDTO()
{
	//__init();
}

QualityRatingDetailsDTO::~QualityRatingDetailsDTO()
{
	//__cleanup();
}

void
QualityRatingDetailsDTO::__init()
{
	//new std::list()std::list> affectedOrders;
}

void
QualityRatingDetailsDTO::__cleanup()
{
	//if(affectedOrders != NULL) {
	//affectedOrders.RemoveAll(true);
	//delete affectedOrders;
	//affectedOrders = NULL;
	//}
	//
}

void
QualityRatingDetailsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *affectedOrdersKey = "affectedOrders";
	node = json_object_get_member(pJsonObject, affectedOrdersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<QualityRatingAffectedOrderDTO> new_list;
			QualityRatingAffectedOrderDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("QualityRatingAffectedOrderDTO")) {
					jsonToValue(&inst, temp_json, "QualityRatingAffectedOrderDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			affectedOrders = new_list;
		}
		
	}
}

QualityRatingDetailsDTO::QualityRatingDetailsDTO(char* json)
{
	this->fromJson(json);
}

char*
QualityRatingDetailsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("QualityRatingAffectedOrderDTO")) {
		list<QualityRatingAffectedOrderDTO> new_list = static_cast<list <QualityRatingAffectedOrderDTO> > (getAffectedOrders());
		node = converttoJson(&new_list, "QualityRatingAffectedOrderDTO", "array");
	} else {
		node = json_node_alloc();
		list<QualityRatingAffectedOrderDTO> new_list = static_cast<list <QualityRatingAffectedOrderDTO> > (getAffectedOrders());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<QualityRatingAffectedOrderDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			QualityRatingAffectedOrderDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *affectedOrdersKey = "affectedOrders";
	json_object_set_member(pJsonObject, affectedOrdersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<QualityRatingAffectedOrderDTO>
QualityRatingDetailsDTO::getAffectedOrders()
{
	return affectedOrders;
}

void
QualityRatingDetailsDTO::setAffectedOrders(std::list <QualityRatingAffectedOrderDTO> affectedOrders)
{
	this->affectedOrders = affectedOrders;
}


