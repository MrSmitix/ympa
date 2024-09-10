#ifndef add_offers_to_archive_request_TEST
#define add_offers_to_archive_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define add_offers_to_archive_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/add_offers_to_archive_request.h"
add_offers_to_archive_request_t* instantiate_add_offers_to_archive_request(int include_optional);



add_offers_to_archive_request_t* instantiate_add_offers_to_archive_request(int include_optional) {
  add_offers_to_archive_request_t* add_offers_to_archive_request = NULL;
  if (include_optional) {
    add_offers_to_archive_request = add_offers_to_archive_request_create(
      list_createList()
    );
  } else {
    add_offers_to_archive_request = add_offers_to_archive_request_create(
      list_createList()
    );
  }

  return add_offers_to_archive_request;
}


#ifdef add_offers_to_archive_request_MAIN

void test_add_offers_to_archive_request(int include_optional) {
    add_offers_to_archive_request_t* add_offers_to_archive_request_1 = instantiate_add_offers_to_archive_request(include_optional);

	cJSON* jsonadd_offers_to_archive_request_1 = add_offers_to_archive_request_convertToJSON(add_offers_to_archive_request_1);
	printf("add_offers_to_archive_request :\n%s\n", cJSON_Print(jsonadd_offers_to_archive_request_1));
	add_offers_to_archive_request_t* add_offers_to_archive_request_2 = add_offers_to_archive_request_parseFromJSON(jsonadd_offers_to_archive_request_1);
	cJSON* jsonadd_offers_to_archive_request_2 = add_offers_to_archive_request_convertToJSON(add_offers_to_archive_request_2);
	printf("repeating add_offers_to_archive_request:\n%s\n", cJSON_Print(jsonadd_offers_to_archive_request_2));
}

int main() {
  test_add_offers_to_archive_request(1);
  test_add_offers_to_archive_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // add_offers_to_archive_request_MAIN
#endif // add_offers_to_archive_request_TEST
