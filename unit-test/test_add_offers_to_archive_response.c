#ifndef add_offers_to_archive_response_TEST
#define add_offers_to_archive_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define add_offers_to_archive_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/add_offers_to_archive_response.h"
add_offers_to_archive_response_t* instantiate_add_offers_to_archive_response(int include_optional);

#include "test_add_offers_to_archive_dto.c"


add_offers_to_archive_response_t* instantiate_add_offers_to_archive_response(int include_optional) {
  add_offers_to_archive_response_t* add_offers_to_archive_response = NULL;
  if (include_optional) {
    add_offers_to_archive_response = add_offers_to_archive_response_create(
      _api__add_offers_to_archive_response__OK,
       // false, not to have infinite recursion
      instantiate_add_offers_to_archive_dto(0)
    );
  } else {
    add_offers_to_archive_response = add_offers_to_archive_response_create(
      _api__add_offers_to_archive_response__OK,
      NULL
    );
  }

  return add_offers_to_archive_response;
}


#ifdef add_offers_to_archive_response_MAIN

void test_add_offers_to_archive_response(int include_optional) {
    add_offers_to_archive_response_t* add_offers_to_archive_response_1 = instantiate_add_offers_to_archive_response(include_optional);

	cJSON* jsonadd_offers_to_archive_response_1 = add_offers_to_archive_response_convertToJSON(add_offers_to_archive_response_1);
	printf("add_offers_to_archive_response :\n%s\n", cJSON_Print(jsonadd_offers_to_archive_response_1));
	add_offers_to_archive_response_t* add_offers_to_archive_response_2 = add_offers_to_archive_response_parseFromJSON(jsonadd_offers_to_archive_response_1);
	cJSON* jsonadd_offers_to_archive_response_2 = add_offers_to_archive_response_convertToJSON(add_offers_to_archive_response_2);
	printf("repeating add_offers_to_archive_response:\n%s\n", cJSON_Print(jsonadd_offers_to_archive_response_2));
}

int main() {
  test_add_offers_to_archive_response(1);
  test_add_offers_to_archive_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // add_offers_to_archive_response_MAIN
#endif // add_offers_to_archive_response_TEST
