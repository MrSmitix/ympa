#ifndef delete_offers_from_archive_request_TEST
#define delete_offers_from_archive_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_offers_from_archive_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_offers_from_archive_request.h"
delete_offers_from_archive_request_t* instantiate_delete_offers_from_archive_request(int include_optional);



delete_offers_from_archive_request_t* instantiate_delete_offers_from_archive_request(int include_optional) {
  delete_offers_from_archive_request_t* delete_offers_from_archive_request = NULL;
  if (include_optional) {
    delete_offers_from_archive_request = delete_offers_from_archive_request_create(
      list_createList()
    );
  } else {
    delete_offers_from_archive_request = delete_offers_from_archive_request_create(
      list_createList()
    );
  }

  return delete_offers_from_archive_request;
}


#ifdef delete_offers_from_archive_request_MAIN

void test_delete_offers_from_archive_request(int include_optional) {
    delete_offers_from_archive_request_t* delete_offers_from_archive_request_1 = instantiate_delete_offers_from_archive_request(include_optional);

	cJSON* jsondelete_offers_from_archive_request_1 = delete_offers_from_archive_request_convertToJSON(delete_offers_from_archive_request_1);
	printf("delete_offers_from_archive_request :\n%s\n", cJSON_Print(jsondelete_offers_from_archive_request_1));
	delete_offers_from_archive_request_t* delete_offers_from_archive_request_2 = delete_offers_from_archive_request_parseFromJSON(jsondelete_offers_from_archive_request_1);
	cJSON* jsondelete_offers_from_archive_request_2 = delete_offers_from_archive_request_convertToJSON(delete_offers_from_archive_request_2);
	printf("repeating delete_offers_from_archive_request:\n%s\n", cJSON_Print(jsondelete_offers_from_archive_request_2));
}

int main() {
  test_delete_offers_from_archive_request(1);
  test_delete_offers_from_archive_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_offers_from_archive_request_MAIN
#endif // delete_offers_from_archive_request_TEST
