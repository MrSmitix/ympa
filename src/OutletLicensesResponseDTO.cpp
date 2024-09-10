#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OutletLicensesResponseDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OutletLicensesResponseDTO::OutletLicensesResponseDTO()
{
	//__init();
}

OutletLicensesResponseDTO::~OutletLicensesResponseDTO()
{
	//__cleanup();
}

void
OutletLicensesResponseDTO::__init()
{
	//new std::list()std::list> licenses;
}

void
OutletLicensesResponseDTO::__cleanup()
{
	//if(licenses != NULL) {
	//licenses.RemoveAll(true);
	//delete licenses;
	//licenses = NULL;
	//}
	//
}

void
OutletLicensesResponseDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *licensesKey = "licenses";
	node = json_object_get_member(pJsonObject, licensesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FullOutletLicenseDTO> new_list;
			FullOutletLicenseDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FullOutletLicenseDTO")) {
					jsonToValue(&inst, temp_json, "FullOutletLicenseDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			licenses = new_list;
		}
		
	}
}

OutletLicensesResponseDTO::OutletLicensesResponseDTO(char* json)
{
	this->fromJson(json);
}

char*
OutletLicensesResponseDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FullOutletLicenseDTO")) {
		list<FullOutletLicenseDTO> new_list = static_cast<list <FullOutletLicenseDTO> > (getLicenses());
		node = converttoJson(&new_list, "FullOutletLicenseDTO", "array");
	} else {
		node = json_node_alloc();
		list<FullOutletLicenseDTO> new_list = static_cast<list <FullOutletLicenseDTO> > (getLicenses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FullOutletLicenseDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FullOutletLicenseDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *licensesKey = "licenses";
	json_object_set_member(pJsonObject, licensesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<FullOutletLicenseDTO>
OutletLicensesResponseDTO::getLicenses()
{
	return licenses;
}

void
OutletLicensesResponseDTO::setLicenses(std::list <FullOutletLicenseDTO> licenses)
{
	this->licenses = licenses;
}


