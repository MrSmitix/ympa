#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FlippingPagerDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FlippingPagerDTO::FlippingPagerDTO()
{
	//__init();
}

FlippingPagerDTO::~FlippingPagerDTO()
{
	//__cleanup();
}

void
FlippingPagerDTO::__init()
{
	//total = int(0);
	//from = int(0);
	//to = int(0);
	//currentPage = int(0);
	//pagesCount = int(0);
	//pageSize = int(0);
}

void
FlippingPagerDTO::__cleanup()
{
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//if(from != NULL) {
	//
	//delete from;
	//from = NULL;
	//}
	//if(to != NULL) {
	//
	//delete to;
	//to = NULL;
	//}
	//if(currentPage != NULL) {
	//
	//delete currentPage;
	//currentPage = NULL;
	//}
	//if(pagesCount != NULL) {
	//
	//delete pagesCount;
	//pagesCount = NULL;
	//}
	//if(pageSize != NULL) {
	//
	//delete pageSize;
	//pageSize = NULL;
	//}
	//
}

void
FlippingPagerDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total, node, "int", "");
		} else {
			
		}
	}
	const gchar *fromKey = "from";
	node = json_object_get_member(pJsonObject, fromKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&from, node, "int", "");
		} else {
			
		}
	}
	const gchar *toKey = "to";
	node = json_object_get_member(pJsonObject, toKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&to, node, "int", "");
		} else {
			
		}
	}
	const gchar *currentPageKey = "currentPage";
	node = json_object_get_member(pJsonObject, currentPageKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&currentPage, node, "int", "");
		} else {
			
		}
	}
	const gchar *pagesCountKey = "pagesCount";
	node = json_object_get_member(pJsonObject, pagesCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pagesCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *pageSizeKey = "pageSize";
	node = json_object_get_member(pJsonObject, pageSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pageSize, node, "int", "");
		} else {
			
		}
	}
}

FlippingPagerDTO::FlippingPagerDTO(char* json)
{
	this->fromJson(json);
}

char*
FlippingPagerDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getTotal();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	if (isprimitive("int")) {
		int obj = getFrom();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fromKey = "from";
	json_object_set_member(pJsonObject, fromKey, node);
	if (isprimitive("int")) {
		int obj = getTo();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *toKey = "to";
	json_object_set_member(pJsonObject, toKey, node);
	if (isprimitive("int")) {
		int obj = getCurrentPage();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *currentPageKey = "currentPage";
	json_object_set_member(pJsonObject, currentPageKey, node);
	if (isprimitive("int")) {
		int obj = getPagesCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pagesCountKey = "pagesCount";
	json_object_set_member(pJsonObject, pagesCountKey, node);
	if (isprimitive("int")) {
		int obj = getPageSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pageSizeKey = "pageSize";
	json_object_set_member(pJsonObject, pageSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
FlippingPagerDTO::getTotal()
{
	return total;
}

void
FlippingPagerDTO::setTotal(int  total)
{
	this->total = total;
}

int
FlippingPagerDTO::getFrom()
{
	return from;
}

void
FlippingPagerDTO::setFrom(int  from)
{
	this->from = from;
}

int
FlippingPagerDTO::getTo()
{
	return to;
}

void
FlippingPagerDTO::setTo(int  to)
{
	this->to = to;
}

int
FlippingPagerDTO::getCurrentPage()
{
	return currentPage;
}

void
FlippingPagerDTO::setCurrentPage(int  currentPage)
{
	this->currentPage = currentPage;
}

int
FlippingPagerDTO::getPagesCount()
{
	return pagesCount;
}

void
FlippingPagerDTO::setPagesCount(int  pagesCount)
{
	this->pagesCount = pagesCount;
}

int
FlippingPagerDTO::getPageSize()
{
	return pageSize;
}

void
FlippingPagerDTO::setPageSize(int  pageSize)
{
	this->pageSize = pageSize;
}


