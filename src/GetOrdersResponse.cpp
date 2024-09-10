#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOrdersResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOrdersResponse::GetOrdersResponse()
{
	//__init();
}

GetOrdersResponse::~GetOrdersResponse()
{
	//__cleanup();
}

void
GetOrdersResponse::__init()
{
	//pager = new FlippingPagerDTO();
	//new std::list()std::list> orders;
	//paging = new ForwardScrollingPagerDTO();
}

void
GetOrdersResponse::__cleanup()
{
	//if(pager != NULL) {
	//
	//delete pager;
	//pager = NULL;
	//}
	//if(orders != NULL) {
	//orders.RemoveAll(true);
	//delete orders;
	//orders = NULL;
	//}
	//if(paging != NULL) {
	//
	//delete paging;
	//paging = NULL;
	//}
	//
}

void
GetOrdersResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pagerKey = "pager";
	node = json_object_get_member(pJsonObject, pagerKey);
	if (node !=NULL) {
	

		if (isprimitive("FlippingPagerDTO")) {
			jsonToValue(&pager, node, "FlippingPagerDTO", "FlippingPagerDTO");
		} else {
			
			FlippingPagerDTO* obj = static_cast<FlippingPagerDTO*> (&pager);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ordersKey = "orders";
	node = json_object_get_member(pJsonObject, ordersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderDTO> new_list;
			OrderDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderDTO")) {
					jsonToValue(&inst, temp_json, "OrderDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			orders = new_list;
		}
		
	}
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
}

GetOrdersResponse::GetOrdersResponse(char* json)
{
	this->fromJson(json);
}

char*
GetOrdersResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FlippingPagerDTO")) {
		FlippingPagerDTO obj = getPager();
		node = converttoJson(&obj, "FlippingPagerDTO", "");
	}
	else {
		
		FlippingPagerDTO obj = static_cast<FlippingPagerDTO> (getPager());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagerKey = "pager";
	json_object_set_member(pJsonObject, pagerKey, node);
	if (isprimitive("OrderDTO")) {
		list<OrderDTO> new_list = static_cast<list <OrderDTO> > (getOrders());
		node = converttoJson(&new_list, "OrderDTO", "array");
	} else {
		node = json_node_alloc();
		list<OrderDTO> new_list = static_cast<list <OrderDTO> > (getOrders());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ordersKey = "orders";
	json_object_set_member(pJsonObject, ordersKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FlippingPagerDTO
GetOrdersResponse::getPager()
{
	return pager;
}

void
GetOrdersResponse::setPager(FlippingPagerDTO  pager)
{
	this->pager = pager;
}

std::list<OrderDTO>
GetOrdersResponse::getOrders()
{
	return orders;
}

void
GetOrdersResponse::setOrders(std::list <OrderDTO> orders)
{
	this->orders = orders;
}

ForwardScrollingPagerDTO
GetOrdersResponse::getPaging()
{
	return paging;
}

void
GetOrdersResponse::setPaging(ForwardScrollingPagerDTO  paging)
{
	this->paging = paging;
}


