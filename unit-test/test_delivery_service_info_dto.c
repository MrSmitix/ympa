#ifndef delivery_service_info_dto_TEST
#define delivery_service_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delivery_service_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delivery_service_info_dto.h"
delivery_service_info_dto_t* instantiate_delivery_service_info_dto(int include_optional);



delivery_service_info_dto_t* instantiate_delivery_service_info_dto(int include_optional) {
  delivery_service_info_dto_t* delivery_service_info_dto = NULL;
  if (include_optional) {
    delivery_service_info_dto = delivery_service_info_dto_create(
      56,
      "0"
    );
  } else {
    delivery_service_info_dto = delivery_service_info_dto_create(
      56,
      "0"
    );
  }

  return delivery_service_info_dto;
}


#ifdef delivery_service_info_dto_MAIN

void test_delivery_service_info_dto(int include_optional) {
    delivery_service_info_dto_t* delivery_service_info_dto_1 = instantiate_delivery_service_info_dto(include_optional);

	cJSON* jsondelivery_service_info_dto_1 = delivery_service_info_dto_convertToJSON(delivery_service_info_dto_1);
	printf("delivery_service_info_dto :\n%s\n", cJSON_Print(jsondelivery_service_info_dto_1));
	delivery_service_info_dto_t* delivery_service_info_dto_2 = delivery_service_info_dto_parseFromJSON(jsondelivery_service_info_dto_1);
	cJSON* jsondelivery_service_info_dto_2 = delivery_service_info_dto_convertToJSON(delivery_service_info_dto_2);
	printf("repeating delivery_service_info_dto:\n%s\n", cJSON_Print(jsondelivery_service_info_dto_2));
}

int main() {
  test_delivery_service_info_dto(1);
  test_delivery_service_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // delivery_service_info_dto_MAIN
#endif // delivery_service_info_dto_TEST
