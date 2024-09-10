#ifndef order_business_documents_dto_TEST
#define order_business_documents_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_business_documents_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_business_documents_dto.h"
order_business_documents_dto_t* instantiate_order_business_documents_dto(int include_optional);

#include "test_document_dto.c"
#include "test_document_dto.c"
#include "test_document_dto.c"
#include "test_document_dto.c"
#include "test_document_dto.c"


order_business_documents_dto_t* instantiate_order_business_documents_dto(int include_optional) {
  order_business_documents_dto_t* order_business_documents_dto = NULL;
  if (include_optional) {
    order_business_documents_dto = order_business_documents_dto_create(
       // false, not to have infinite recursion
      instantiate_document_dto(0),
       // false, not to have infinite recursion
      instantiate_document_dto(0),
       // false, not to have infinite recursion
      instantiate_document_dto(0),
       // false, not to have infinite recursion
      instantiate_document_dto(0),
       // false, not to have infinite recursion
      instantiate_document_dto(0)
    );
  } else {
    order_business_documents_dto = order_business_documents_dto_create(
      NULL,
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return order_business_documents_dto;
}


#ifdef order_business_documents_dto_MAIN

void test_order_business_documents_dto(int include_optional) {
    order_business_documents_dto_t* order_business_documents_dto_1 = instantiate_order_business_documents_dto(include_optional);

	cJSON* jsonorder_business_documents_dto_1 = order_business_documents_dto_convertToJSON(order_business_documents_dto_1);
	printf("order_business_documents_dto :\n%s\n", cJSON_Print(jsonorder_business_documents_dto_1));
	order_business_documents_dto_t* order_business_documents_dto_2 = order_business_documents_dto_parseFromJSON(jsonorder_business_documents_dto_1);
	cJSON* jsonorder_business_documents_dto_2 = order_business_documents_dto_convertToJSON(order_business_documents_dto_2);
	printf("repeating order_business_documents_dto:\n%s\n", cJSON_Print(jsonorder_business_documents_dto_2));
}

int main() {
  test_order_business_documents_dto(1);
  test_order_business_documents_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_business_documents_dto_MAIN
#endif // order_business_documents_dto_TEST
