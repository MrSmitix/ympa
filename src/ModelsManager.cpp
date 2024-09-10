#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ModelsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ModelsManager::ModelsManager()
{

}

ModelsManager::~ModelsManager()
{

}

static gboolean __ModelsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ModelsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ModelsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getModelProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetModelsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetModelsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetModelsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetModelsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetModelsResponse", "GetModelsResponse");
			json_node_free(pJson);

			if ("GetModelsResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getModelHelper(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/models/{modelId}");
	int pos;

	string s_modelId("{");
	s_modelId.append("modelId");
	s_modelId.append("}");
	pos = url.find(s_modelId);
	url.erase(pos, s_modelId.length());
	url.insert(pos, stringify(&modelId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getModelProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getModelProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ModelsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ModelsManager::getModelAsync(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData)
{
	return getModelHelper(accessToken,
	modelId, regionId, currency, 
	handler, userData, true);
}

bool ModelsManager::getModelSync(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData)
{
	return getModelHelper(accessToken,
	modelId, regionId, currency, 
	handler, userData, false);
}

static bool getModelOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetModelsOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetModelsOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetModelsOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetModelsOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetModelsOffersResponse", "GetModelsOffersResponse");
			json_node_free(pJson);

			if ("GetModelsOffersResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getModelOffersHelper(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, SortOrderType orderByPrice, int count, int page, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}


	itemAtq = stringify(&orderByPrice, "SortOrderType");
	queryParams.insert(pair<string, string>("orderByPrice", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("orderByPrice");
	}


	itemAtq = stringify(&count, "int");
	queryParams.insert(pair<string, string>("count", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("count");
	}


	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/models/{modelId}/offers");
	int pos;

	string s_modelId("{");
	s_modelId.append("modelId");
	s_modelId.append("}");
	pos = url.find(s_modelId);
	url.erase(pos, s_modelId.length());
	url.insert(pos, stringify(&modelId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getModelOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getModelOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ModelsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ModelsManager::getModelOffersAsync(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, SortOrderType orderByPrice, int count, int page, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData)
{
	return getModelOffersHelper(accessToken,
	modelId, regionId, currency, orderByPrice, count, page, 
	handler, userData, true);
}

bool ModelsManager::getModelOffersSync(char * accessToken,
	long long modelId, long long regionId, CurrencyType currency, SortOrderType orderByPrice, int count, int page, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData)
{
	return getModelOffersHelper(accessToken,
	modelId, regionId, currency, orderByPrice, count, page, 
	handler, userData, false);
}

static bool getModelsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetModelsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetModelsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetModelsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetModelsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetModelsResponse", "GetModelsResponse");
			json_node_free(pJson);

			if ("GetModelsResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getModelsHelper(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GetModelsRequest")) {
		node = converttoJson(&getModelsRequest, "GetModelsRequest", "");
	}
	
	char *jsonStr =  getModelsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/models");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getModelsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getModelsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ModelsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ModelsManager::getModelsAsync(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData)
{
	return getModelsHelper(accessToken,
	regionId, getModelsRequest, currency, 
	handler, userData, true);
}

bool ModelsManager::getModelsSync(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, 
	void(* handler)(GetModelsResponse, Error, void* )
	, void* userData)
{
	return getModelsHelper(accessToken,
	regionId, getModelsRequest, currency, 
	handler, userData, false);
}

static bool getModelsOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetModelsOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetModelsOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetModelsOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetModelsOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetModelsOffersResponse", "GetModelsOffersResponse");
			json_node_free(pJson);

			if ("GetModelsOffersResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getModelsOffersHelper(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}


	itemAtq = stringify(&orderByPrice, "SortOrderType");
	queryParams.insert(pair<string, string>("orderByPrice", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("orderByPrice");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GetModelsRequest")) {
		node = converttoJson(&getModelsRequest, "GetModelsRequest", "");
	}
	
	char *jsonStr =  getModelsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/models/offers");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getModelsOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getModelsOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ModelsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ModelsManager::getModelsOffersAsync(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData)
{
	return getModelsOffersHelper(accessToken,
	regionId, getModelsRequest, currency, orderByPrice, 
	handler, userData, true);
}

bool ModelsManager::getModelsOffersSync(char * accessToken,
	long long regionId, std::shared_ptr<GetModelsRequest> getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, 
	void(* handler)(GetModelsOffersResponse, Error, void* )
	, void* userData)
{
	return getModelsOffersHelper(accessToken,
	regionId, getModelsRequest, currency, orderByPrice, 
	handler, userData, false);
}

static bool searchModelsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SearchModelsResponse, Error, void* )
	= reinterpret_cast<void(*)(SearchModelsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SearchModelsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SearchModelsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SearchModelsResponse", "SearchModelsResponse");
			json_node_free(pJson);

			if ("SearchModelsResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool searchModelsHelper(char * accessToken,
	std::string query, long long regionId, CurrencyType currency, int page, int pageSize, 
	void(* handler)(SearchModelsResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&query, "std::string");
	queryParams.insert(pair<string, string>("query", itemAtq));


	itemAtq = stringify(&regionId, "long long");
	queryParams.insert(pair<string, string>("regionId", itemAtq));


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}


	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/models");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = searchModelsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ModelsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), searchModelsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ModelsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ModelsManager::searchModelsAsync(char * accessToken,
	std::string query, long long regionId, CurrencyType currency, int page, int pageSize, 
	void(* handler)(SearchModelsResponse, Error, void* )
	, void* userData)
{
	return searchModelsHelper(accessToken,
	query, regionId, currency, page, pageSize, 
	handler, userData, true);
}

bool ModelsManager::searchModelsSync(char * accessToken,
	std::string query, long long regionId, CurrencyType currency, int page, int pageSize, 
	void(* handler)(SearchModelsResponse, Error, void* )
	, void* userData)
{
	return searchModelsHelper(accessToken,
	query, regionId, currency, page, pageSize, 
	handler, userData, false);
}

