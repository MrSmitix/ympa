#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PagedReturnsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PagedReturnsDTO::PagedReturnsDTO()
{
	//__init();
}

PagedReturnsDTO::~PagedReturnsDTO()
{
	//__cleanup();
}

void
PagedReturnsDTO::__init()
{
	//paging = new ForwardScrollingPagerDTO();
	//new std::list()std::list> returns;
}

void
PagedReturnsDTO::__cleanup()
{
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//if(returns != NULL) {
	//returns.RemoveAll(true);
	//delete returns;
	//returns = NULL;
	//}
	//
}

void
PagedReturnsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pagingKey = "paging";
	node = json_object_get_member(pJsonObject, pagingKey);
	if (node !=NULL) {
	

		if (isprimitive("ForwardScrollingPagerDTO")) {
			jsonToValue(&paging, node, "ForwardScrollingPagerDTO", "ForwardScrollingPagerDTO");
		} else {
			
			ForwardScrollingPagerDTO* obj = static_cast<ForwardScrollingPagerDTO*> (&paging);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *returnsKey = "returns";
	node = json_object_get_member(pJsonObject, returnsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ReturnDTO> new_list;
			ReturnDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ReturnDTO")) {
					jsonToValue(&inst, temp_json, "ReturnDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			returns = new_list;
		}
		
	}
}

PagedReturnsDTO::PagedReturnsDTO(char* json)
{
	this->fromJson(json);
}

char*
PagedReturnsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ForwardScrollingPagerDTO")) {
		ForwardScrollingPagerDTO obj = getPaging();
		node = converttoJson(&obj, "ForwardScrollingPagerDTO", "");
	}
	else {
		
		ForwardScrollingPagerDTO obj = static_cast<ForwardScrollingPagerDTO> (getPaging());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagingKey = "paging";
	json_object_set_member(pJsonObject, pagingKey, node);
	if (isprimitive("ReturnDTO")) {
		list<ReturnDTO> new_list = static_cast<list <ReturnDTO> > (getReturns());
		node = converttoJson(&new_list, "ReturnDTO", "array");
	} else {
		node = json_node_alloc();
		list<ReturnDTO> new_list = static_cast<list <ReturnDTO> > (getReturns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ReturnDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ReturnDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *returnsKey = "returns";
	json_object_set_member(pJsonObject, returnsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ForwardScrollingPagerDTO
PagedReturnsDTO::getPaging()
{
	return paging;
}

void
PagedReturnsDTO::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}

std::list<ReturnDTO>
PagedReturnsDTO::getReturns()
{
	return returns;
}

void
PagedReturnsDTO::setReturns(std::list <ReturnDTO> returns)
{
	this->returns = returns;
}


