#ifndef add_offers_to_archive_dto_TEST
#define add_offers_to_archive_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define add_offers_to_archive_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/add_offers_to_archive_dto.h"
add_offers_to_archive_dto_t* instantiate_add_offers_to_archive_dto(int include_optional);



add_offers_to_archive_dto_t* instantiate_add_offers_to_archive_dto(int include_optional) {
  add_offers_to_archive_dto_t* add_offers_to_archive_dto = NULL;
  if (include_optional) {
    add_offers_to_archive_dto = add_offers_to_archive_dto_create(
      list_createList()
    );
  } else {
    add_offers_to_archive_dto = add_offers_to_archive_dto_create(
      list_createList()
    );
  }

  return add_offers_to_archive_dto;
}


#ifdef add_offers_to_archive_dto_MAIN

void test_add_offers_to_archive_dto(int include_optional) {
    add_offers_to_archive_dto_t* add_offers_to_archive_dto_1 = instantiate_add_offers_to_archive_dto(include_optional);

	cJSON* jsonadd_offers_to_archive_dto_1 = add_offers_to_archive_dto_convertToJSON(add_offers_to_archive_dto_1);
	printf("add_offers_to_archive_dto :\n%s\n", cJSON_Print(jsonadd_offers_to_archive_dto_1));
	add_offers_to_archive_dto_t* add_offers_to_archive_dto_2 = add_offers_to_archive_dto_parseFromJSON(jsonadd_offers_to_archive_dto_1);
	cJSON* jsonadd_offers_to_archive_dto_2 = add_offers_to_archive_dto_convertToJSON(add_offers_to_archive_dto_2);
	printf("repeating add_offers_to_archive_dto:\n%s\n", cJSON_Print(jsonadd_offers_to_archive_dto_2));
}

int main() {
  test_add_offers_to_archive_dto(1);
  test_add_offers_to_archive_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // add_offers_to_archive_dto_MAIN
#endif // add_offers_to_archive_dto_TEST
