#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EacVerificationResultDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EacVerificationResultDTO::EacVerificationResultDTO()
{
	//__init();
}

EacVerificationResultDTO::~EacVerificationResultDTO()
{
	//__cleanup();
}

void
EacVerificationResultDTO::__init()
{
	//verificationResult = new EacVerificationStatusType();
	//attemptsLeft = int(0);
}

void
EacVerificationResultDTO::__cleanup()
{
	//if(verificationResult != NULL) {
	//
	//delete verificationResult;
	//verificationResult = NULL;
	//}
	//if(attemptsLeft != NULL) {
	//
	//delete attemptsLeft;
	//attemptsLeft = NULL;
	//}
	//
}

void
EacVerificationResultDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *verificationResultKey = "verificationResult";
	node = json_object_get_member(pJsonObject, verificationResultKey);
	if (node !=NULL) {
	

		if (isprimitive("EacVerificationStatusType")) {
			jsonToValue(&verificationResult, node, "EacVerificationStatusType", "EacVerificationStatusType");
		} else {
			
			EacVerificationStatusType* obj = static_cast<EacVerificationStatusType*> (&verificationResult);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *attemptsLeftKey = "attemptsLeft";
	node = json_object_get_member(pJsonObject, attemptsLeftKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&attemptsLeft, node, "int", "");
		} else {
			
		}
	}
}

EacVerificationResultDTO::EacVerificationResultDTO(char* json)
{
	this->fromJson(json);
}

char*
EacVerificationResultDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EacVerificationStatusType")) {
		EacVerificationStatusType obj = getVerificationResult();
		node = converttoJson(&obj, "EacVerificationStatusType", "");
	}
	else {
		
		EacVerificationStatusType obj = static_cast<EacVerificationStatusType> (getVerificationResult());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *verificationResultKey = "verificationResult";
	json_object_set_member(pJsonObject, verificationResultKey, node);
	if (isprimitive("int")) {
		int obj = getAttemptsLeft();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *attemptsLeftKey = "attemptsLeft";
	json_object_set_member(pJsonObject, attemptsLeftKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

EacVerificationStatusType
EacVerificationResultDTO::getVerificationResult()
{
	return verificationResult;
}

void
EacVerificationResultDTO::setVerificationResult(EacVerificationStatusType  verificationResult)
{
	this->verificationResult = verificationResult;
}

int
EacVerificationResultDTO::getAttemptsLeft()
{
	return attemptsLeft;
}

void
EacVerificationResultDTO::setAttemptsLeft(int  attemptsLeft)
{
	this->attemptsLeft = attemptsLeft;
}


