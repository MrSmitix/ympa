#ifndef return_shipment_status_type_TEST
#define return_shipment_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define return_shipment_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/return_shipment_status_type.h"
return_shipment_status_type_t* instantiate_return_shipment_status_type(int include_optional);



return_shipment_status_type_t* instantiate_return_shipment_status_type(int include_optional) {
  return_shipment_status_type_t* return_shipment_status_type = NULL;
  if (include_optional) {
    return_shipment_status_type = return_shipment_status_type_create(
    );
  } else {
    return_shipment_status_type = return_shipment_status_type_create(
    );
  }

  return return_shipment_status_type;
}


#ifdef return_shipment_status_type_MAIN

void test_return_shipment_status_type(int include_optional) {
    return_shipment_status_type_t* return_shipment_status_type_1 = instantiate_return_shipment_status_type(include_optional);

	cJSON* jsonreturn_shipment_status_type_1 = return_shipment_status_type_convertToJSON(return_shipment_status_type_1);
	printf("return_shipment_status_type :\n%s\n", cJSON_Print(jsonreturn_shipment_status_type_1));
	return_shipment_status_type_t* return_shipment_status_type_2 = return_shipment_status_type_parseFromJSON(jsonreturn_shipment_status_type_1);
	cJSON* jsonreturn_shipment_status_type_2 = return_shipment_status_type_convertToJSON(return_shipment_status_type_2);
	printf("repeating return_shipment_status_type:\n%s\n", cJSON_Print(jsonreturn_shipment_status_type_2));
}

int main() {
  test_return_shipment_status_type(1);
  test_return_shipment_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // return_shipment_status_type_MAIN
#endif // return_shipment_status_type_TEST
