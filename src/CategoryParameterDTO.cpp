#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CategoryParameterDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CategoryParameterDTO::CategoryParameterDTO()
{
	//__init();
}

CategoryParameterDTO::~CategoryParameterDTO()
{
	//__cleanup();
}

void
CategoryParameterDTO::__init()
{
	//id = long(0);
	//name = std::string();
	//type = new ParameterType();
	//unit = new CategoryParameterUnitDTO();
	//description = std::string();
	//new std::list()std::list> recommendationTypes;
	//required = bool(false);
	//filtering = bool(false);
	//distinctive = bool(false);
	//multivalue = bool(false);
	//allowCustomValues = bool(false);
	//new std::list()std::list> values;
	//constraints = new ParameterValueConstraintsDTO();
	//new std::list()std::list> valueRestrictions;
}

void
CategoryParameterDTO::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(unit != NULL) {
	//
	//delete unit;
	//unit = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(recommendationTypes != NULL) {
	//recommendationTypes.RemoveAll(true);
	//delete recommendationTypes;
	//recommendationTypes = NULL;
	//}
	//if(required != NULL) {
	//
	//delete required;
	//required = NULL;
	//}
	//if(filtering != NULL) {
	//
	//delete filtering;
	//filtering = NULL;
	//}
	//if(distinctive != NULL) {
	//
	//delete distinctive;
	//distinctive = NULL;
	//}
	//if(multivalue != NULL) {
	//
	//delete multivalue;
	//multivalue = NULL;
	//}
	//if(allowCustomValues != NULL) {
	//
	//delete allowCustomValues;
	//allowCustomValues = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//if(constraints != NULL) {
	//
	//delete constraints;
	//constraints = NULL;
	//}
	//if(valueRestrictions != NULL) {
	//valueRestrictions.RemoveAll(true);
	//delete valueRestrictions;
	//valueRestrictions = NULL;
	//}
	//
}

void
CategoryParameterDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ParameterType")) {
			jsonToValue(&type, node, "ParameterType", "ParameterType");
		} else {
			
			ParameterType* obj = static_cast<ParameterType*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *unitKey = "unit";
	node = json_object_get_member(pJsonObject, unitKey);
	if (node !=NULL) {
	

		if (isprimitive("CategoryParameterUnitDTO")) {
			jsonToValue(&unit, node, "CategoryParameterUnitDTO", "CategoryParameterUnitDTO");
		} else {
			
			CategoryParameterUnitDTO* obj = static_cast<CategoryParameterUnitDTO*> (&unit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *recommendationTypesKey = "recommendationTypes";
	node = json_object_get_member(pJsonObject, recommendationTypesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OfferCardRecommendationType> new_list;
			OfferCardRecommendationType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OfferCardRecommendationType")) {
					jsonToValue(&inst, temp_json, "OfferCardRecommendationType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			recommendationTypes = new_list;
		}
		
	}
	const gchar *requiredKey = "required";
	node = json_object_get_member(pJsonObject, requiredKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&required, node, "bool", "");
		} else {
			
		}
	}
	const gchar *filteringKey = "filtering";
	node = json_object_get_member(pJsonObject, filteringKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&filtering, node, "bool", "");
		} else {
			
		}
	}
	const gchar *distinctiveKey = "distinctive";
	node = json_object_get_member(pJsonObject, distinctiveKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&distinctive, node, "bool", "");
		} else {
			
		}
	}
	const gchar *multivalueKey = "multivalue";
	node = json_object_get_member(pJsonObject, multivalueKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&multivalue, node, "bool", "");
		} else {
			
		}
	}
	const gchar *allowCustomValuesKey = "allowCustomValues";
	node = json_object_get_member(pJsonObject, allowCustomValuesKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&allowCustomValues, node, "bool", "");
		} else {
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ParameterValueOptionDTO> new_list;
			ParameterValueOptionDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ParameterValueOptionDTO")) {
					jsonToValue(&inst, temp_json, "ParameterValueOptionDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
	const gchar *constraintsKey = "constraints";
	node = json_object_get_member(pJsonObject, constraintsKey);
	if (node !=NULL) {
	

		if (isprimitive("ParameterValueConstraintsDTO")) {
			jsonToValue(&constraints, node, "ParameterValueConstraintsDTO", "ParameterValueConstraintsDTO");
		} else {
			
			ParameterValueConstraintsDTO* obj = static_cast<ParameterValueConstraintsDTO*> (&constraints);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valueRestrictionsKey = "valueRestrictions";
	node = json_object_get_member(pJsonObject, valueRestrictionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ValueRestrictionDTO> new_list;
			ValueRestrictionDTO inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ValueRestrictionDTO")) {
					jsonToValue(&inst, temp_json, "ValueRestrictionDTO", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			valueRestrictions = new_list;
		}
		
	}
}

CategoryParameterDTO::CategoryParameterDTO(char* json)
{
	this->fromJson(json);
}

char*
CategoryParameterDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ParameterType")) {
		ParameterType obj = getType();
		node = converttoJson(&obj, "ParameterType", "");
	}
	else {
		
		ParameterType obj = static_cast<ParameterType> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("CategoryParameterUnitDTO")) {
		CategoryParameterUnitDTO obj = getUnit();
		node = converttoJson(&obj, "CategoryParameterUnitDTO", "");
	}
	else {
		
		CategoryParameterUnitDTO obj = static_cast<CategoryParameterUnitDTO> (getUnit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *unitKey = "unit";
	json_object_set_member(pJsonObject, unitKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("OfferCardRecommendationType")) {
		list<OfferCardRecommendationType> new_list = static_cast<list <OfferCardRecommendationType> > (getRecommendationTypes());
		node = converttoJson(&new_list, "OfferCardRecommendationType", "array");
	} else {
		node = json_node_alloc();
		list<OfferCardRecommendationType> new_list = static_cast<list <OfferCardRecommendationType> > (getRecommendationTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OfferCardRecommendationType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OfferCardRecommendationType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *recommendationTypesKey = "recommendationTypes";
	json_object_set_member(pJsonObject, recommendationTypesKey, node);
	if (isprimitive("bool")) {
		bool obj = getRequired();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *requiredKey = "required";
	json_object_set_member(pJsonObject, requiredKey, node);
	if (isprimitive("bool")) {
		bool obj = getFiltering();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *filteringKey = "filtering";
	json_object_set_member(pJsonObject, filteringKey, node);
	if (isprimitive("bool")) {
		bool obj = getDistinctive();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *distinctiveKey = "distinctive";
	json_object_set_member(pJsonObject, distinctiveKey, node);
	if (isprimitive("bool")) {
		bool obj = getMultivalue();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *multivalueKey = "multivalue";
	json_object_set_member(pJsonObject, multivalueKey, node);
	if (isprimitive("bool")) {
		bool obj = getAllowCustomValues();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *allowCustomValuesKey = "allowCustomValues";
	json_object_set_member(pJsonObject, allowCustomValuesKey, node);
	if (isprimitive("ParameterValueOptionDTO")) {
		list<ParameterValueOptionDTO> new_list = static_cast<list <ParameterValueOptionDTO> > (getValues());
		node = converttoJson(&new_list, "ParameterValueOptionDTO", "array");
	} else {
		node = json_node_alloc();
		list<ParameterValueOptionDTO> new_list = static_cast<list <ParameterValueOptionDTO> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ParameterValueOptionDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ParameterValueOptionDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	if (isprimitive("ParameterValueConstraintsDTO")) {
		ParameterValueConstraintsDTO obj = getConstraints();
		node = converttoJson(&obj, "ParameterValueConstraintsDTO", "");
	}
	else {
		
		ParameterValueConstraintsDTO obj = static_cast<ParameterValueConstraintsDTO> (getConstraints());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *constraintsKey = "constraints";
	json_object_set_member(pJsonObject, constraintsKey, node);
	if (isprimitive("ValueRestrictionDTO")) {
		list<ValueRestrictionDTO> new_list = static_cast<list <ValueRestrictionDTO> > (getValueRestrictions());
		node = converttoJson(&new_list, "ValueRestrictionDTO", "array");
	} else {
		node = json_node_alloc();
		list<ValueRestrictionDTO> new_list = static_cast<list <ValueRestrictionDTO> > (getValueRestrictions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ValueRestrictionDTO>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ValueRestrictionDTO obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valueRestrictionsKey = "valueRestrictions";
	json_object_set_member(pJsonObject, valueRestrictionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CategoryParameterDTO::getId()
{
	return id;
}

void
CategoryParameterDTO::setId(long long  id)
{
	this->id = id;
}

std::string
CategoryParameterDTO::getName()
{
	return name;
}

void
CategoryParameterDTO::setName(std::string  name)
{
	this->name = name;
}

ParameterType
CategoryParameterDTO::getType()
{
	return type;
}

void
CategoryParameterDTO::setType(ParameterType  type)
{
	this->type = type;
}

CategoryParameterUnitDTO
CategoryParameterDTO::getUnit()
{
	return unit;
}

void
CategoryParameterDTO::setUnit(CategoryParameterUnitDTO  unit)
{
	this->unit = unit;
}

std::string
CategoryParameterDTO::getDescription()
{
	return description;
}

void
CategoryParameterDTO::setDescription(std::string  description)
{
	this->description = description;
}

std::list<OfferCardRecommendationType>
CategoryParameterDTO::getRecommendationTypes()
{
	return recommendationTypes;
}

void
CategoryParameterDTO::setRecommendationTypes(std::list <OfferCardRecommendationType> recommendationTypes)
{
	this->recommendationTypes = recommendationTypes;
}

bool
CategoryParameterDTO::getRequired()
{
	return required;
}

void
CategoryParameterDTO::setRequired(bool  required)
{
	this->required = required;
}

bool
CategoryParameterDTO::getFiltering()
{
	return filtering;
}

void
CategoryParameterDTO::setFiltering(bool  filtering)
{
	this->filtering = filtering;
}

bool
CategoryParameterDTO::getDistinctive()
{
	return distinctive;
}

void
CategoryParameterDTO::setDistinctive(bool  distinctive)
{
	this->distinctive = distinctive;
}

bool
CategoryParameterDTO::getMultivalue()
{
	return multivalue;
}

void
CategoryParameterDTO::setMultivalue(bool  multivalue)
{
	this->multivalue = multivalue;
}

bool
CategoryParameterDTO::getAllowCustomValues()
{
	return allowCustomValues;
}

void
CategoryParameterDTO::setAllowCustomValues(bool  allowCustomValues)
{
	this->allowCustomValues = allowCustomValues;
}

std::list<ParameterValueOptionDTO>
CategoryParameterDTO::getValues()
{
	return values;
}

void
CategoryParameterDTO::setValues(std::list <ParameterValueOptionDTO> values)
{
	this->values = values;
}

ParameterValueConstraintsDTO
CategoryParameterDTO::getConstraints()
{
	return constraints;
}

void
CategoryParameterDTO::setConstraints(ParameterValueConstraintsDTO  constraints)
{
	this->constraints = constraints;
}

std::list<ValueRestrictionDTO>
CategoryParameterDTO::getValueRestrictions()
{
	return valueRestrictions;
}

void
CategoryParameterDTO::setValueRestrictions(std::list <ValueRestrictionDTO> valueRestrictions)
{
	this->valueRestrictions = valueRestrictions;
}


