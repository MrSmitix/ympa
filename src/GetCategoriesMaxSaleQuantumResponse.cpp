#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCategoriesMaxSaleQuantumResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCategoriesMaxSaleQuantumResponse::GetCategoriesMaxSaleQuantumResponse()
{
	//__init();
}

GetCategoriesMaxSaleQuantumResponse::~GetCategoriesMaxSaleQuantumResponse()
{
	//__cleanup();
}

void
GetCategoriesMaxSaleQuantumResponse::__init()
{
	//status = new ApiResponseStatusType();
	//new std::list()std::list> results;
	//new std::list()std::list> errors;
}

void
GetCategoriesMaxSaleQuantumResponse::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
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
GetCategoriesMaxSaleQuantumResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ApiResponseStatusType")) {
			jsonToValue(&status, node, "ApiResponseStatusType", "ApiResponseStatusType");
		} else {
			
			ApiResponseStatusType* obj = static_cast<ApiResponseStatusType*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

GetCategoriesMaxSaleQuantumResponse::GetCategoriesMaxSaleQuantumResponse(char* json)
{
	this->fromJson(json);
}

char*
GetCategoriesMaxSaleQuantumResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ApiResponseStatusType")) {
		ApiResponseStatusType obj = getStatus();
		node = converttoJson(&obj, "ApiResponseStatusType", "");
	}
	else {
		
		ApiResponseStatusType obj = static_cast<ApiResponseStatusType> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
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

ApiResponseStatusType
GetCategoriesMaxSaleQuantumResponse::getStatus()
{
	return status;
}

void
GetCategoriesMaxSaleQuantumResponse::setStatus(ApiResponseStatusType  status)
{
	this->status = status;
}

std::list<MaxSaleQuantumDTO>
GetCategoriesMaxSaleQuantumResponse::getResults()
{
	return results;
}

void
GetCategoriesMaxSaleQuantumResponse::setResults(std::list <MaxSaleQuantumDTO> results)
{
	this->results = results;
}

std::list<CategoryErrorDTO>
GetCategoriesMaxSaleQuantumResponse::getErrors()
{
	return errors;
}

void
GetCategoriesMaxSaleQuantumResponse::setErrors(std::list <CategoryErrorDTO> errors)
{
	this->errors = errors;
}


