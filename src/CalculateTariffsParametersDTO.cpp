#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CalculateTariffsParametersDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CalculateTariffsParametersDTO::CalculateTariffsParametersDTO()
{
	//__init();
}

CalculateTariffsParametersDTO::~CalculateTariffsParametersDTO()
{
	//__cleanup();
}

void
CalculateTariffsParametersDTO::__init()
{
	//campaignId = long(0);
	//sellingProgram = new SellingProgramType();
	//frequency = new PaymentFrequencyType();
}

void
CalculateTariffsParametersDTO::__cleanup()
{
	//if(campaignId != NULL) {
	//
	//delete campaignId;
	//campaignId = NULL;
	//}
	//if(sellingProgram != NULL) {
	//
	//delete sellingProgram;
	//sellingProgram = NULL;
	//}
	//if(frequency != NULL) {
	//
	//delete frequency;
	//frequency = NULL;
	//}
	//
}

void
CalculateTariffsParametersDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaignIdKey = "campaignId";
	node = json_object_get_member(pJsonObject, campaignIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&campaignId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *sellingProgramKey = "sellingProgram";
	node = json_object_get_member(pJsonObject, sellingProgramKey);
	if (node !=NULL) {
	

		if (isprimitive("SellingProgramType")) {
			jsonToValue(&sellingProgram, node, "SellingProgramType", "SellingProgramType");
		} else {
			
			SellingProgramType* obj = static_cast<SellingProgramType*> (&sellingProgram);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *frequencyKey = "frequency";
	node = json_object_get_member(pJsonObject, frequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("PaymentFrequencyType")) {
			jsonToValue(&frequency, node, "PaymentFrequencyType", "PaymentFrequencyType");
		} else {
			
			PaymentFrequencyType* obj = static_cast<PaymentFrequencyType*> (&frequency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CalculateTariffsParametersDTO::CalculateTariffsParametersDTO(char* json)
{
	this->fromJson(json);
}

char*
CalculateTariffsParametersDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCampaignId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *campaignIdKey = "campaignId";
	json_object_set_member(pJsonObject, campaignIdKey, node);
	if (isprimitive("SellingProgramType")) {
		SellingProgramType obj = getSellingProgram();
		node = converttoJson(&obj, "SellingProgramType", "");
	}
	else {
		
		SellingProgramType obj = static_cast<SellingProgramType> (getSellingProgram());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sellingProgramKey = "sellingProgram";
	json_object_set_member(pJsonObject, sellingProgramKey, node);
	if (isprimitive("PaymentFrequencyType")) {
		PaymentFrequencyType obj = getFrequency();
		node = converttoJson(&obj, "PaymentFrequencyType", "");
	}
	else {
		
		PaymentFrequencyType obj = static_cast<PaymentFrequencyType> (getFrequency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *frequencyKey = "frequency";
	json_object_set_member(pJsonObject, frequencyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CalculateTariffsParametersDTO::getCampaignId()
{
	return campaignId;
}

void
CalculateTariffsParametersDTO::setCampaignId(long long  campaignId)
{
	this->campaignId = campaignId;
}

SellingProgramType
CalculateTariffsParametersDTO::getSellingProgram()
{
	return sellingProgram;
}

void
CalculateTariffsParametersDTO::setSellingProgram(SellingProgramType  sellingProgram)
{
	this->sellingProgram = sellingProgram;
}

PaymentFrequencyType
CalculateTariffsParametersDTO::getFrequency()
{
	return frequency;
}

void
CalculateTariffsParametersDTO::setFrequency(PaymentFrequencyType  frequency)
{
	this->frequency = frequency;
}


