#ifndef suggest_prices_request_TEST
#define suggest_prices_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define suggest_prices_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/suggest_prices_request.h"
suggest_prices_request_t* instantiate_suggest_prices_request(int include_optional);



suggest_prices_request_t* instantiate_suggest_prices_request(int include_optional) {
  suggest_prices_request_t* suggest_prices_request = NULL;
  if (include_optional) {
    suggest_prices_request = suggest_prices_request_create(
      list_createList()
    );
  } else {
    suggest_prices_request = suggest_prices_request_create(
      list_createList()
    );
  }

  return suggest_prices_request;
}


#ifdef suggest_prices_request_MAIN

void test_suggest_prices_request(int include_optional) {
    suggest_prices_request_t* suggest_prices_request_1 = instantiate_suggest_prices_request(include_optional);

	cJSON* jsonsuggest_prices_request_1 = suggest_prices_request_convertToJSON(suggest_prices_request_1);
	printf("suggest_prices_request :\n%s\n", cJSON_Print(jsonsuggest_prices_request_1));
	suggest_prices_request_t* suggest_prices_request_2 = suggest_prices_request_parseFromJSON(jsonsuggest_prices_request_1);
	cJSON* jsonsuggest_prices_request_2 = suggest_prices_request_convertToJSON(suggest_prices_request_2);
	printf("repeating suggest_prices_request:\n%s\n", cJSON_Print(jsonsuggest_prices_request_2));
}

int main() {
  test_suggest_prices_request(1);
  test_suggest_prices_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // suggest_prices_request_MAIN
#endif // suggest_prices_request_TEST
