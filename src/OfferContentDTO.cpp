#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OfferContentDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OfferContentDTO::OfferContentDTO()
{
	//__init();
}

OfferContentDTO::~OfferContentDTO()
{
	//__cleanup();
}

void
OfferContentDTO::__init()
{
	//offerId = std::string();
	//categoryId = int(0);
	//new std::list()std::list> parameterValues;
}

void
OfferContentDTO::__cleanup()
{
	//if(offerId != NULL) {
	//
	//delete offerId;
	//offerId = NULL;
	//}
	//if(categoryId != NULL) {
	//
	//delete categoryId;
	//categoryId = NULL;
	//}
	//if(parameterValues != NULL) {
	//parameterValues.RemoveAll(true);
	//delete parameterValues;
	//parameterValues = NULL;
	//}
	//
}

void
OfferContentDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerIdKey = "offerId";
	node = json_object_get_member(pJsonObject, offerIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *categoryIdKey = "categoryId";
	node = json_object_get_member(pJsonObject, categoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&categoryId, node, "int", "");
		} else {
			
		}
	}
	const gchar *parameterValuesKey = "parameterValues";
	node = json_object_get_member(pJsonObject, parameterValuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ParameterValueDTO> new_list;
			ParameterValueDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ParameterValueDTO")) {
					jsonToValue(&inst, temp_json, "ParameterValueDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			parameterValues = new_list;
		}
		
	}
}

OfferContentDTO::OfferContentDTO(char* json)
{
	this->fromJson(json);
}

char*
OfferContentDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOfferId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerIdKey = "offerId";
	json_object_set_member(pJsonObject, offerIdKey, node);
	if (isprimitive("int")) {
		int obj = getCategoryId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *categoryIdKey = "categoryId";
	json_object_set_member(pJsonObject, categoryIdKey, node);
	if (isprimitive("ParameterValueDTO")) {
		list<ParameterValueDTO> new_list = static_cast<list <ParameterValueDTO> > (getParameterValues());
		node = converttoJson(&new_list, "ParameterValueDTO", "array");
	} else {
		node = json_node_alloc();
		list<ParameterValueDTO> new_list = static_cast<list <ParameterValueDTO> > (getParameterValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ParameterValueDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ParameterValueDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *parameterValuesKey = "parameterValues";
	json_object_set_member(pJsonObject, parameterValuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OfferContentDTO::getOfferId()
{
	return offerId;
}

void
OfferContentDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

int
OfferContentDTO::getCategoryId()
{
	return categoryId;
}

void
OfferContentDTO::setCategoryId(int  categoryId)
{
	this->categoryId = categoryId;
}

std::list<ParameterValueDTO>
OfferContentDTO::getParameterValues()
{
	return parameterValues;
}

void
OfferContentDTO::setParameterValues(std::list <ParameterValueDTO> parameterValues)
{
	this->parameterValues = parameterValues;
}


