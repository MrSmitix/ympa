#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetCategoriesRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetCategoriesRequest::GetCategoriesRequest()
{
	//__init();
}

GetCategoriesRequest::~GetCategoriesRequest()
{
	//__cleanup();
}

void
GetCategoriesRequest::__init()
{
	//language = new LanguageType();
}

void
GetCategoriesRequest::__cleanup()
{
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
GetCategoriesRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *languageKey = "language";
	node = json_object_get_member(pJsonObject, languageKey);
	if (node !=NULL) {
	

		if (isprimitive("LanguageType")) {
			jsonToValue(&language, node, "LanguageType", "LanguageType");
		} else {
			
			LanguageType* obj = static_cast<LanguageType*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GetCategoriesRequest::GetCategoriesRequest(char* json)
{
	this->fromJson(json);
}

char*
GetCategoriesRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LanguageType")) {
		LanguageType obj = getLanguage();
		node = converttoJson(&obj, "LanguageType", "");
	}
	else {
		
		LanguageType obj = static_cast<LanguageType> (getLanguage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

LanguageType
GetCategoriesRequest::getLanguage()
{
	return language;
}

void
GetCategoriesRequest::setLanguage(LanguageType  language)
{
	this->language = language;
}


