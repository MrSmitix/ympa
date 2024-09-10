#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OptionValuesLimitedDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OptionValuesLimitedDTO::OptionValuesLimitedDTO()
{
	//__init();
}

OptionValuesLimitedDTO::~OptionValuesLimitedDTO()
{
	//__cleanup();
}

void
OptionValuesLimitedDTO::__init()
{
	//limitingOptionValueId = long(0);
	//new std::list()std::list> optionValueIds;
}

void
OptionValuesLimitedDTO::__cleanup()
{
	//if(limitingOptionValueId != NULL) {
	//
	//delete limitingOptionValueId;
	//limitingOptionValueId = NULL;
	//}
	//if(optionValueIds != NULL) {
	//optionValueIds.RemoveAll(true);
	//delete optionValueIds;
	//optionValueIds = NULL;
	//}
	//
}

void
OptionValuesLimitedDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *limitingOptionValueIdKey = "limitingOptionValueId";
	node = json_object_get_member(pJsonObject, limitingOptionValueIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&limitingOptionValueId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *optionValueIdsKey = "optionValueIds";
	node = json_object_get_member(pJsonObject, optionValueIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			optionValueIds = new_list;
		}
		
	}
}

OptionValuesLimitedDTO::OptionValuesLimitedDTO(char* json)
{
	this->fromJson(json);
}

char*
OptionValuesLimitedDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getLimitingOptionValueId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *limitingOptionValueIdKey = "limitingOptionValueId";
	json_object_set_member(pJsonObject, limitingOptionValueIdKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getOptionValueIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getOptionValueIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *optionValueIdsKey = "optionValueIds";
	json_object_set_member(pJsonObject, optionValueIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
OptionValuesLimitedDTO::getLimitingOptionValueId()
{
	return limitingOptionValueId;
}

void
OptionValuesLimitedDTO::setLimitingOptionValueId(long long  limitingOptionValueId)
{
	this->limitingOptionValueId = limitingOptionValueId;
}

std::list<long long>
OptionValuesLimitedDTO::getOptionValueIds()
{
	return optionValueIds;
}

void
OptionValuesLimitedDTO::setOptionValueIds(std::list <long long> optionValueIds)
{
	this->optionValueIds = optionValueIds;
}


