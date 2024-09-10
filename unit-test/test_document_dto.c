#ifndef document_dto_TEST
#define document_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define document_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/document_dto.h"
document_dto_t* instantiate_document_dto(int include_optional);



document_dto_t* instantiate_document_dto(int include_optional) {
  document_dto_t* document_dto = NULL;
  if (include_optional) {
    document_dto = document_dto_create(
      _api__document_dto__READY,
      "0",
      "2013-10-20"
    );
  } else {
    document_dto = document_dto_create(
      _api__document_dto__READY,
      "0",
      "2013-10-20"
    );
  }

  return document_dto;
}


#ifdef document_dto_MAIN

void test_document_dto(int include_optional) {
    document_dto_t* document_dto_1 = instantiate_document_dto(include_optional);

	cJSON* jsondocument_dto_1 = document_dto_convertToJSON(document_dto_1);
	printf("document_dto :\n%s\n", cJSON_Print(jsondocument_dto_1));
	document_dto_t* document_dto_2 = document_dto_parseFromJSON(jsondocument_dto_1);
	cJSON* jsondocument_dto_2 = document_dto_convertToJSON(document_dto_2);
	printf("repeating document_dto:\n%s\n", cJSON_Print(jsondocument_dto_2));
}

int main() {
  test_document_dto(1);
  test_document_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // document_dto_MAIN
#endif // document_dto_TEST
