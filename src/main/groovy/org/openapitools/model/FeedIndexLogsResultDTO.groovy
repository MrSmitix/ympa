package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FeedIndexLogsFeedDTO;
import org.openapitools.model.FeedIndexLogsRecordDTO;

@Canonical
class FeedIndexLogsResultDTO {
    
    FeedIndexLogsFeedDTO feed
    /* Список отчетов по индексации прайс-листа. */
    List<FeedIndexLogsRecordDTO> indexLogRecords = new ArrayList<>()
    /* Количество отчетов на всех страницах выходных данных. */
    Long total
}
