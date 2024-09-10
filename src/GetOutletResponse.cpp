#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetOutletResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetOutletResponse::GetOutletResponse()
{
	//__init();
}

GetOutletResponse::~GetOutletResponse()
{
	//__cleanup();
}

void
GetOutletResponse::__init()
{
	//outlet = new FullOutletDTO();
}

void
GetOutletResponse::__cleanup()
{
	//if(outlet != NULL) {
	//
	//delete outlet;
	//outlet = NULL;
	//}
	//
}

void
GetOutletResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *outletKey = "outlet";
	node = json_object_get_member(pJsonObject, outletKey);
	if (node !=NULL) {
	

		if (isprimitive("FullOutletDTO")) {
			jsonToValue(&outlet, node, "FullOutletDTO", "FullOutletDTO");
		} else {
			
			FullOutletDTO* obj = static_cast<FullOutletDTO*> (&outlet);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetOutletResponse::GetOutletResponse(char* json)
{
	this->fromJson(json);
}

char*
GetOutletResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FullOutletDTO")) {
		FullOutletDTO obj = getOutlet();
		node = converttoJson(&obj, "FullOutletDTO", "");
	}
	else {
		
		FullOutletDTO obj = static_cast<FullOutletDTO> (getOutlet());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *outletKey = "outlet";
	json_object_set_member(pJsonObject, outletKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

FullOutletDTO
GetOutletResponse::getOutlet()
{
	return outlet;
}

void
GetOutletResponse::setOutlet(FullOutletDTO  outlet)
{
	this->outlet = outlet;
}


