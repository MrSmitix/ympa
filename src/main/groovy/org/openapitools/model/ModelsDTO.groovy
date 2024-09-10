package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ModelDTO;

@Canonical
class ModelsDTO {
    /* Список моделей товаров. */
    List<ModelDTO> models = new ArrayList<>()
}
