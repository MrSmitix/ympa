#ifndef delivery_services_dto_TEST
#define delivery_services_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delivery_services_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delivery_services_dto.h"
delivery_services_dto_t* instantiate_delivery_services_dto(int include_optional);



delivery_services_dto_t* instantiate_delivery_services_dto(int include_optional) {
  delivery_services_dto_t* delivery_services_dto = NULL;
  if (include_optional) {
    delivery_services_dto = delivery_services_dto_create(
      list_createList()
    );
  } else {
    delivery_services_dto = delivery_services_dto_create(
      list_createList()
    );
  }

  return delivery_services_dto;
}


#ifdef delivery_services_dto_MAIN

void test_delivery_services_dto(int include_optional) {
    delivery_services_dto_t* delivery_services_dto_1 = instantiate_delivery_services_dto(include_optional);

	cJSON* jsondelivery_services_dto_1 = delivery_services_dto_convertToJSON(delivery_services_dto_1);
	printf("delivery_services_dto :\n%s\n", cJSON_Print(jsondelivery_services_dto_1));
	delivery_services_dto_t* delivery_services_dto_2 = delivery_services_dto_parseFromJSON(jsondelivery_services_dto_1);
	cJSON* jsondelivery_services_dto_2 = delivery_services_dto_convertToJSON(delivery_services_dto_2);
	printf("repeating delivery_services_dto:\n%s\n", cJSON_Print(jsondelivery_services_dto_2));
}

int main() {
  test_delivery_services_dto(1);
  test_delivery_services_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // delivery_services_dto_MAIN
#endif // delivery_services_dto_TEST
