#ifndef parcel_dto_TEST
#define parcel_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define parcel_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/parcel_dto.h"
parcel_dto_t* instantiate_parcel_dto(int include_optional);



parcel_dto_t* instantiate_parcel_dto(int include_optional) {
  parcel_dto_t* parcel_dto = NULL;
  if (include_optional) {
    parcel_dto = parcel_dto_create(
      list_createList()
    );
  } else {
    parcel_dto = parcel_dto_create(
      list_createList()
    );
  }

  return parcel_dto;
}


#ifdef parcel_dto_MAIN

void test_parcel_dto(int include_optional) {
    parcel_dto_t* parcel_dto_1 = instantiate_parcel_dto(include_optional);

	cJSON* jsonparcel_dto_1 = parcel_dto_convertToJSON(parcel_dto_1);
	printf("parcel_dto :\n%s\n", cJSON_Print(jsonparcel_dto_1));
	parcel_dto_t* parcel_dto_2 = parcel_dto_parseFromJSON(jsonparcel_dto_1);
	cJSON* jsonparcel_dto_2 = parcel_dto_convertToJSON(parcel_dto_2);
	printf("repeating parcel_dto:\n%s\n", cJSON_Print(jsonparcel_dto_2));
}

int main() {
  test_parcel_dto(1);
  test_parcel_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // parcel_dto_MAIN
#endif // parcel_dto_TEST
