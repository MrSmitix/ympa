#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderBusinessDocumentsDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderBusinessDocumentsDTO::OrderBusinessDocumentsDTO()
{
	//__init();
}

OrderBusinessDocumentsDTO::~OrderBusinessDocumentsDTO()
{
	//__cleanup();
}

void
OrderBusinessDocumentsDTO::__init()
{
	//upd = new DocumentDTO();
	//ukd = new DocumentDTO();
	//torgTwelve = new DocumentDTO();
	//sf = new DocumentDTO();
	//ksf = new DocumentDTO();
}

void
OrderBusinessDocumentsDTO::__cleanup()
{
	//if(upd != NULL) {
	//
	//delete upd;
	//upd = NULL;
	//}
	//if(ukd != NULL) {
	//
	//delete ukd;
	//ukd = NULL;
	//}
	//if(torgTwelve != NULL) {
	//
	//delete torgTwelve;
	//torgTwelve = NULL;
	//}
	//if(sf != NULL) {
	//
	//delete sf;
	//sf = NULL;
	//}
	//if(ksf != NULL) {
	//
	//delete ksf;
	//ksf = NULL;
	//}
	//
}

void
OrderBusinessDocumentsDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *updKey = "upd";
	node = json_object_get_member(pJsonObject, updKey);
	if (node !=NULL) {
	

		if (isprimitive("DocumentDTO")) {
			jsonToValue(&upd, node, "DocumentDTO", "DocumentDTO");
		} else {
			
			DocumentDTO* obj = static_cast<DocumentDTO*> (&upd);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ukdKey = "ukd";
	node = json_object_get_member(pJsonObject, ukdKey);
	if (node !=NULL) {
	

		if (isprimitive("DocumentDTO")) {
			jsonToValue(&ukd, node, "DocumentDTO", "DocumentDTO");
		} else {
			
			DocumentDTO* obj = static_cast<DocumentDTO*> (&ukd);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *torgTwelveKey = "torgTwelve";
	node = json_object_get_member(pJsonObject, torgTwelveKey);
	if (node !=NULL) {
	

		if (isprimitive("DocumentDTO")) {
			jsonToValue(&torgTwelve, node, "DocumentDTO", "DocumentDTO");
		} else {
			
			DocumentDTO* obj = static_cast<DocumentDTO*> (&torgTwelve);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sfKey = "sf";
	node = json_object_get_member(pJsonObject, sfKey);
	if (node !=NULL) {
	

		if (isprimitive("DocumentDTO")) {
			jsonToValue(&sf, node, "DocumentDTO", "DocumentDTO");
		} else {
			
			DocumentDTO* obj = static_cast<DocumentDTO*> (&sf);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ksfKey = "ksf";
	node = json_object_get_member(pJsonObject, ksfKey);
	if (node !=NULL) {
	

		if (isprimitive("DocumentDTO")) {
			jsonToValue(&ksf, node, "DocumentDTO", "DocumentDTO");
		} else {
			
			DocumentDTO* obj = static_cast<DocumentDTO*> (&ksf);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderBusinessDocumentsDTO::OrderBusinessDocumentsDTO(char* json)
{
	this->fromJson(json);
}

char*
OrderBusinessDocumentsDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DocumentDTO")) {
		DocumentDTO obj = getUpd();
		node = converttoJson(&obj, "DocumentDTO", "");
	}
	else {
		
		DocumentDTO obj = static_cast<DocumentDTO> (getUpd());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *updKey = "upd";
	json_object_set_member(pJsonObject, updKey, node);
	if (isprimitive("DocumentDTO")) {
		DocumentDTO obj = getUkd();
		node = converttoJson(&obj, "DocumentDTO", "");
	}
	else {
		
		DocumentDTO obj = static_cast<DocumentDTO> (getUkd());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ukdKey = "ukd";
	json_object_set_member(pJsonObject, ukdKey, node);
	if (isprimitive("DocumentDTO")) {
		DocumentDTO obj = getTorgTwelve();
		node = converttoJson(&obj, "DocumentDTO", "");
	}
	else {
		
		DocumentDTO obj = static_cast<DocumentDTO> (getTorgTwelve());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *torgTwelveKey = "torgTwelve";
	json_object_set_member(pJsonObject, torgTwelveKey, node);
	if (isprimitive("DocumentDTO")) {
		DocumentDTO obj = getSf();
		node = converttoJson(&obj, "DocumentDTO", "");
	}
	else {
		
		DocumentDTO obj = static_cast<DocumentDTO> (getSf());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sfKey = "sf";
	json_object_set_member(pJsonObject, sfKey, node);
	if (isprimitive("DocumentDTO")) {
		DocumentDTO obj = getKsf();
		node = converttoJson(&obj, "DocumentDTO", "");
	}
	else {
		
		DocumentDTO obj = static_cast<DocumentDTO> (getKsf());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ksfKey = "ksf";
	json_object_set_member(pJsonObject, ksfKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

DocumentDTO
OrderBusinessDocumentsDTO::getUpd()
{
	return upd;
}

void
OrderBusinessDocumentsDTO::setUpd(DocumentDTO  upd)
{
	this->upd = upd;
}

DocumentDTO
OrderBusinessDocumentsDTO::getUkd()
{
	return ukd;
}

void
OrderBusinessDocumentsDTO::setUkd(DocumentDTO  ukd)
{
	this->ukd = ukd;
}

DocumentDTO
OrderBusinessDocumentsDTO::getTorgTwelve()
{
	return torgTwelve;
}

void
OrderBusinessDocumentsDTO::setTorgTwelve(DocumentDTO  torgTwelve)
{
	this->torgTwelve = torgTwelve;
}

DocumentDTO
OrderBusinessDocumentsDTO::getSf()
{
	return sf;
}

void
OrderBusinessDocumentsDTO::setSf(DocumentDTO  sf)
{
	this->sf = sf;
}

DocumentDTO
OrderBusinessDocumentsDTO::getKsf()
{
	return ksf;
}

void
OrderBusinessDocumentsDTO::setKsf(DocumentDTO  ksf)
{
	this->ksf = ksf;
}


