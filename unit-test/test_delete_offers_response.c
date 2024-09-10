#ifndef delete_offers_response_TEST
#define delete_offers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_offers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_offers_response.h"
delete_offers_response_t* instantiate_delete_offers_response(int include_optional);

#include "test_delete_offers_dto.c"


delete_offers_response_t* instantiate_delete_offers_response(int include_optional) {
  delete_offers_response_t* delete_offers_response = NULL;
  if (include_optional) {
    delete_offers_response = delete_offers_response_create(
      _api__delete_offers_response__OK,
       // false, not to have infinite recursion
      instantiate_delete_offers_dto(0)
    );
  } else {
    delete_offers_response = delete_offers_response_create(
      _api__delete_offers_response__OK,
      NULL
    );
  }

  return delete_offers_response;
}


#ifdef delete_offers_response_MAIN

void test_delete_offers_response(int include_optional) {
    delete_offers_response_t* delete_offers_response_1 = instantiate_delete_offers_response(include_optional);

	cJSON* jsondelete_offers_response_1 = delete_offers_response_convertToJSON(delete_offers_response_1);
	printf("delete_offers_response :\n%s\n", cJSON_Print(jsondelete_offers_response_1));
	delete_offers_response_t* delete_offers_response_2 = delete_offers_response_parseFromJSON(jsondelete_offers_response_1);
	cJSON* jsondelete_offers_response_2 = delete_offers_response_convertToJSON(delete_offers_response_2);
	printf("repeating delete_offers_response:\n%s\n", cJSON_Print(jsondelete_offers_response_2));
}

int main() {
  test_delete_offers_response(1);
  test_delete_offers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_offers_response_MAIN
#endif // delete_offers_response_TEST
