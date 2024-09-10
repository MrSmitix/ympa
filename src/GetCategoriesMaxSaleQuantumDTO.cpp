#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCategoriesMaxSaleQuantumDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCategoriesMaxSaleQuantumDTO::GetCategoriesMaxSaleQuantumDTO()
{
	//__init();
}

GetCategoriesMaxSaleQuantumDTO::~GetCategoriesMaxSaleQuantumDTO()
{
	//__cleanup();
}

void
GetCategoriesMaxSaleQuantumDTO::__init()
{
	//new std::list()std::list> results;
	//new std::list()std::list> errors;
}

void
GetCategoriesMaxSaleQuantumDTO::__cleanup()
{
	//if(results != NULL) {
	//results.RemoveAll(true);
	//delete results;
	//results = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//
}

void
GetCategoriesMaxSaleQuantumDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *resultsKey = "results";
	node = json_object_get_member(pJsonObject, resultsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MaxSaleQuantumDTO> new_list;
			MaxSaleQuantumDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MaxSaleQuantumDTO")) {
					jsonToValue(&inst, temp_json, "MaxSaleQuantumDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			results = new_list;
		}
		
	}
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CategoryErrorDTO> new_list;
			CategoryErrorDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CategoryErrorDTO")) {
					jsonToValue(&inst, temp_json, "CategoryErrorDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
}

GetCategoriesMaxSaleQuantumDTO::GetCategoriesMaxSaleQuantumDTO(char* json)
{
	this->fromJson(json);
}

char*
GetCategoriesMaxSaleQuantumDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MaxSaleQuantumDTO")) {
		list<MaxSaleQuantumDTO> new_list = static_cast<list <MaxSaleQuantumDTO> > (getResults());
		node = converttoJson(&new_list, "MaxSaleQuantumDTO", "array");
	} else {
		node = json_node_alloc();
		list<MaxSaleQuantumDTO> new_list = static_cast<list <MaxSaleQuantumDTO> > (getResults());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MaxSaleQuantumDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MaxSaleQuantumDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *resultsKey = "results";
	json_object_set_member(pJsonObject, resultsKey, node);
	if (isprimitive("CategoryErrorDTO")) {
		list<CategoryErrorDTO> new_list = static_cast<list <CategoryErrorDTO> > (getErrors());
		node = converttoJson(&new_list, "CategoryErrorDTO", "array");
	} else {
		node = json_node_alloc();
		list<CategoryErrorDTO> new_list = static_cast<list <CategoryErrorDTO> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CategoryErrorDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CategoryErrorDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<MaxSaleQuantumDTO>
GetCategoriesMaxSaleQuantumDTO::getResults()
{
	return results;
}

void
GetCategoriesMaxSaleQuantumDTO::setResults(std::list <MaxSaleQuantumDTO> results)
{
	this->results = results;
}

std::list<CategoryErrorDTO>
GetCategoriesMaxSaleQuantumDTO::getErrors()
{
	return errors;
}

void
GetCategoriesMaxSaleQuantumDTO::setErrors(std::list <CategoryErrorDTO> errors)
{
	this->errors = errors;
}


