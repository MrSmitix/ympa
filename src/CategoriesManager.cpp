#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CategoriesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CategoriesManager::CategoriesManager()
{

}

CategoriesManager::~CategoriesManager()
{

}

static gboolean __CategoriesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CategoriesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CategoriesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getCategoriesMaxSaleQuantumProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCategoriesMaxSaleQuantumResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCategoriesMaxSaleQuantumResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCategoriesMaxSaleQuantumResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCategoriesMaxSaleQuantumResponse", "GetCategoriesMaxSaleQuantumResponse");
			json_node_free(pJson);

			if ("GetCategoriesMaxSaleQuantumResponse" == "std::string") {
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

static bool getCategoriesMaxSaleQuantumHelper(char * accessToken,
	std::shared_ptr<GetCategoriesMaxSaleQuantumRequest> getCategoriesMaxSaleQuantumRequest, 
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
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
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GetCategoriesMaxSaleQuantumRequest")) {
		node = converttoJson(&getCategoriesMaxSaleQuantumRequest, "GetCategoriesMaxSaleQuantumRequest", "");
	}
	
	char *jsonStr =  getCategoriesMaxSaleQuantumRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/categories/max-sale-quantum");
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
		NetClient::easycurl(CategoriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCategoriesMaxSaleQuantumProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CategoriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCategoriesMaxSaleQuantumProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CategoriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CategoriesManager::getCategoriesMaxSaleQuantumAsync(char * accessToken,
	std::shared_ptr<GetCategoriesMaxSaleQuantumRequest> getCategoriesMaxSaleQuantumRequest, 
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
	, void* userData)
{
	return getCategoriesMaxSaleQuantumHelper(accessToken,
	getCategoriesMaxSaleQuantumRequest, 
	handler, userData, true);
}

bool CategoriesManager::getCategoriesMaxSaleQuantumSync(char * accessToken,
	std::shared_ptr<GetCategoriesMaxSaleQuantumRequest> getCategoriesMaxSaleQuantumRequest, 
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
	, void* userData)
{
	return getCategoriesMaxSaleQuantumHelper(accessToken,
	getCategoriesMaxSaleQuantumRequest, 
	handler, userData, false);
}

static bool getCategoriesTreeProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCategoriesResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCategoriesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCategoriesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCategoriesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCategoriesResponse", "GetCategoriesResponse");
			json_node_free(pJson);

			if ("GetCategoriesResponse" == "std::string") {
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

static bool getCategoriesTreeHelper(char * accessToken,
	std::shared_ptr<GetCategoriesRequest> getCategoriesRequest, 
	void(* handler)(GetCategoriesResponse, Error, void* )
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
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GetCategoriesRequest")) {
		node = converttoJson(&getCategoriesRequest, "GetCategoriesRequest", "");
	}
	
	char *jsonStr =  getCategoriesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/categories/tree");
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
		NetClient::easycurl(CategoriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCategoriesTreeProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CategoriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCategoriesTreeProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CategoriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CategoriesManager::getCategoriesTreeAsync(char * accessToken,
	std::shared_ptr<GetCategoriesRequest> getCategoriesRequest, 
	void(* handler)(GetCategoriesResponse, Error, void* )
	, void* userData)
{
	return getCategoriesTreeHelper(accessToken,
	getCategoriesRequest, 
	handler, userData, true);
}

bool CategoriesManager::getCategoriesTreeSync(char * accessToken,
	std::shared_ptr<GetCategoriesRequest> getCategoriesRequest, 
	void(* handler)(GetCategoriesResponse, Error, void* )
	, void* userData)
{
	return getCategoriesTreeHelper(accessToken,
	getCategoriesRequest, 
	handler, userData, false);
}

