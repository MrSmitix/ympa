#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CategoryContentParametersDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CategoryContentParametersDTO::CategoryContentParametersDTO()
{
	//__init();
}

CategoryContentParametersDTO::~CategoryContentParametersDTO()
{
	//__cleanup();
}

void
CategoryContentParametersDTO::__init()
{
	//categoryId = int(0);
	//new std::list()std::list> parameters;
}

void
CategoryContentParametersDTO::__cleanup()
{
	//if(categoryId != NULL) {
	//
	//delete categoryId;
	//categoryId = NULL;
	//}
	//if(parameters != NULL) {
	//parameters.RemoveAll(true);
	//delete parameters;
	//parameters = NULL;
	//}
	//
}

void
CategoryContentParametersDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *categoryIdKey = "categoryId";
	node = json_object_get_member(pJsonObject, categoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&categoryId, node, "int", "");
		} else {
			
		}
	}
	const gchar *parametersKey = "parameters";
	node = json_object_get_member(pJsonObject, parametersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CategoryParameterDTO> new_list;
			CategoryParameterDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CategoryParameterDTO")) {
					jsonToValue(&inst, temp_json, "CategoryParameterDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			parameters = new_list;
		}
		
	}
}

CategoryContentParametersDTO::CategoryContentParametersDTO(char* json)
{
	this->fromJson(json);
}

char*
CategoryContentParametersDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCategoryId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *categoryIdKey = "categoryId";
	json_object_set_member(pJsonObject, categoryIdKey, node);
	if (isprimitive("CategoryParameterDTO")) {
		list<CategoryParameterDTO> new_list = static_cast<list <CategoryParameterDTO> > (getParameters());
		node = converttoJson(&new_list, "CategoryParameterDTO", "array");
	} else {
		node = json_node_alloc();
		list<CategoryParameterDTO> new_list = static_cast<list <CategoryParameterDTO> > (getParameters());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CategoryParameterDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CategoryParameterDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *parametersKey = "parameters";
	json_object_set_member(pJsonObject, parametersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CategoryContentParametersDTO::getCategoryId()
{
	return categoryId;
}

void
CategoryContentParametersDTO::setCategoryId(int  categoryId)
{
	this->categoryId = categoryId;
}

std::list<CategoryParameterDTO>
CategoryContentParametersDTO::getParameters()
{
	return parameters;
}

void
CategoryContentParametersDTO::setParameters(std::list <CategoryParameterDTO> parameters)
{
	this->parameters = parameters;
}


