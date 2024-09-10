#ifndef parcel_box_label_dto_TEST
#define parcel_box_label_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define parcel_box_label_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/parcel_box_label_dto.h"
parcel_box_label_dto_t* instantiate_parcel_box_label_dto(int include_optional);



parcel_box_label_dto_t* instantiate_parcel_box_label_dto(int include_optional) {
  parcel_box_label_dto_t* parcel_box_label_dto = NULL;
  if (include_optional) {
    parcel_box_label_dto = parcel_box_label_dto_create(
      "0",
      "0",
      "0",
      56,
      "0",
      "0",
      56,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    parcel_box_label_dto = parcel_box_label_dto_create(
      "0",
      "0",
      "0",
      56,
      "0",
      "0",
      56,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  }

  return parcel_box_label_dto;
}


#ifdef parcel_box_label_dto_MAIN

void test_parcel_box_label_dto(int include_optional) {
    parcel_box_label_dto_t* parcel_box_label_dto_1 = instantiate_parcel_box_label_dto(include_optional);

	cJSON* jsonparcel_box_label_dto_1 = parcel_box_label_dto_convertToJSON(parcel_box_label_dto_1);
	printf("parcel_box_label_dto :\n%s\n", cJSON_Print(jsonparcel_box_label_dto_1));
	parcel_box_label_dto_t* parcel_box_label_dto_2 = parcel_box_label_dto_parseFromJSON(jsonparcel_box_label_dto_1);
	cJSON* jsonparcel_box_label_dto_2 = parcel_box_label_dto_convertToJSON(parcel_box_label_dto_2);
	printf("repeating parcel_box_label_dto:\n%s\n", cJSON_Print(jsonparcel_box_label_dto_2));
}

int main() {
  test_parcel_box_label_dto(1);
  test_parcel_box_label_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // parcel_box_label_dto_MAIN
#endif // parcel_box_label_dto_TEST
