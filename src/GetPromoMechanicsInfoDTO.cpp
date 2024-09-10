#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetPromoMechanicsInfoDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetPromoMechanicsInfoDTO::GetPromoMechanicsInfoDTO()
{
	//__init();
}

GetPromoMechanicsInfoDTO::~GetPromoMechanicsInfoDTO()
{
	//__cleanup();
}

void
GetPromoMechanicsInfoDTO::__init()
{
	//type = new MechanicsType();
	//promocodeInfo = new GetPromoPromocodeInfoDTO();
}

void
GetPromoMechanicsInfoDTO::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(promocodeInfo != NULL) {
	//
	//delete promocodeInfo;
	//promocodeInfo = NULL;
	//}
	//
}

void
GetPromoMechanicsInfoDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("MechanicsType")) {
			jsonToValue(&type, node, "MechanicsType", "MechanicsType");
		} else {
			
			MechanicsType* obj = static_cast<MechanicsType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *promocodeInfoKey = "promocodeInfo";
	node = json_object_get_member(pJsonObject, promocodeInfoKey);
	if (node !=NULL) {
	

		if (isprimitive("GetPromoPromocodeInfoDTO")) {
			jsonToValue(&promocodeInfo, node, "GetPromoPromocodeInfoDTO", "GetPromoPromocodeInfoDTO");
		} else {
			
			GetPromoPromocodeInfoDTO* obj = static_cast<GetPromoPromocodeInfoDTO*> (&promocodeInfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetPromoMechanicsInfoDTO::GetPromoMechanicsInfoDTO(char* json)
{
	this->fromJson(json);
}

char*
GetPromoMechanicsInfoDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MechanicsType")) {
		MechanicsType obj = getType();
		node = converttoJson(&obj, "MechanicsType", "");
	}
	else {
		
		MechanicsType obj = static_cast<MechanicsType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("GetPromoPromocodeInfoDTO")) {
		GetPromoPromocodeInfoDTO obj = getPromocodeInfo();
		node = converttoJson(&obj, "GetPromoPromocodeInfoDTO", "");
	}
	else {
		
		GetPromoPromocodeInfoDTO obj = static_cast<GetPromoPromocodeInfoDTO> (getPromocodeInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *promocodeInfoKey = "promocodeInfo";
	json_object_set_member(pJsonObject, promocodeInfoKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MechanicsType
GetPromoMechanicsInfoDTO::getType()
{
	return type;
}

void
GetPromoMechanicsInfoDTO::setType(MechanicsType  type)
{
	this->type = type;
}

GetPromoPromocodeInfoDTO
GetPromoMechanicsInfoDTO::getPromocodeInfo()
{
	return promocodeInfo;
}

void
GetPromoMechanicsInfoDTO::setPromocodeInfo(GetPromoPromocodeInfoDTO  promocodeInfo)
{
	this->promocodeInfo = promocodeInfo;
}


