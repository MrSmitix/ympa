#ifndef add_hidden_offers_request_TEST
#define add_hidden_offers_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define add_hidden_offers_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/add_hidden_offers_request.h"
add_hidden_offers_request_t* instantiate_add_hidden_offers_request(int include_optional);



add_hidden_offers_request_t* instantiate_add_hidden_offers_request(int include_optional) {
  add_hidden_offers_request_t* add_hidden_offers_request = NULL;
  if (include_optional) {
    add_hidden_offers_request = add_hidden_offers_request_create(
      list_createList()
    );
  } else {
    add_hidden_offers_request = add_hidden_offers_request_create(
      list_createList()
    );
  }

  return add_hidden_offers_request;
}


#ifdef add_hidden_offers_request_MAIN

void test_add_hidden_offers_request(int include_optional) {
    add_hidden_offers_request_t* add_hidden_offers_request_1 = instantiate_add_hidden_offers_request(include_optional);

	cJSON* jsonadd_hidden_offers_request_1 = add_hidden_offers_request_convertToJSON(add_hidden_offers_request_1);
	printf("add_hidden_offers_request :\n%s\n", cJSON_Print(jsonadd_hidden_offers_request_1));
	add_hidden_offers_request_t* add_hidden_offers_request_2 = add_hidden_offers_request_parseFromJSON(jsonadd_hidden_offers_request_1);
	cJSON* jsonadd_hidden_offers_request_2 = add_hidden_offers_request_convertToJSON(add_hidden_offers_request_2);
	printf("repeating add_hidden_offers_request:\n%s\n", cJSON_Print(jsonadd_hidden_offers_request_2));
}

int main() {
  test_add_hidden_offers_request(1);
  test_add_hidden_offers_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // add_hidden_offers_request_MAIN
#endif // add_hidden_offers_request_TEST
