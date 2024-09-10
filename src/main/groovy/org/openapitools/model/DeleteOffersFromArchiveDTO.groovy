package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class DeleteOffersFromArchiveDTO {
    /* Список товаров, которые не удалось восстановить из архива. */
    List<String> notUnarchivedOfferIds
}
