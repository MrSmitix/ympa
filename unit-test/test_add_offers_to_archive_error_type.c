#ifndef add_offers_to_archive_error_type_TEST
#define add_offers_to_archive_error_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define add_offers_to_archive_error_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/add_offers_to_archive_error_type.h"
add_offers_to_archive_error_type_t* instantiate_add_offers_to_archive_error_type(int include_optional);



add_offers_to_archive_error_type_t* instantiate_add_offers_to_archive_error_type(int include_optional) {
  add_offers_to_archive_error_type_t* add_offers_to_archive_error_type = NULL;
  if (include_optional) {
    add_offers_to_archive_error_type = add_offers_to_archive_error_type_create(
    );
  } else {
    add_offers_to_archive_error_type = add_offers_to_archive_error_type_create(
    );
  }

  return add_offers_to_archive_error_type;
}


#ifdef add_offers_to_archive_error_type_MAIN

void test_add_offers_to_archive_error_type(int include_optional) {
    add_offers_to_archive_error_type_t* add_offers_to_archive_error_type_1 = instantiate_add_offers_to_archive_error_type(include_optional);

	cJSON* jsonadd_offers_to_archive_error_type_1 = add_offers_to_archive_error_type_convertToJSON(add_offers_to_archive_error_type_1);
	printf("add_offers_to_archive_error_type :\n%s\n", cJSON_Print(jsonadd_offers_to_archive_error_type_1));
	add_offers_to_archive_error_type_t* add_offers_to_archive_error_type_2 = add_offers_to_archive_error_type_parseFromJSON(jsonadd_offers_to_archive_error_type_1);
	cJSON* jsonadd_offers_to_archive_error_type_2 = add_offers_to_archive_error_type_convertToJSON(add_offers_to_archive_error_type_2);
	printf("repeating add_offers_to_archive_error_type:\n%s\n", cJSON_Print(jsonadd_offers_to_archive_error_type_2));
}

int main() {
  test_add_offers_to_archive_error_type(1);
  test_add_offers_to_archive_error_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // add_offers_to_archive_error_type_MAIN
#endif // add_offers_to_archive_error_type_TEST
