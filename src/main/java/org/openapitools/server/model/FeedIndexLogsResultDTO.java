package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FeedIndexLogsFeedDTO;
import org.openapitools.server.model.FeedIndexLogsRecordDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */
public class FeedIndexLogsResultDTO   {

    private FeedIndexLogsFeedDTO feed;
    private List<@Valid FeedIndexLogsRecordDTO> indexLogRecords = new ArrayList<>();
    private Long total;

    /**
     * Default constructor.
     */
    public FeedIndexLogsResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedIndexLogsResultDTO.
     *
     * @param feed feed
     * @param indexLogRecords Список отчетов по индексации прайс-листа.
     * @param total Количество отчетов на всех страницах выходных данных.
     */
    public FeedIndexLogsResultDTO(
        FeedIndexLogsFeedDTO feed, 
        List<@Valid FeedIndexLogsRecordDTO> indexLogRecords, 
        Long total
    ) {
        this.feed = feed;
        this.indexLogRecords = indexLogRecords;
        this.total = total;
    }



    /**
     * Get feed
     * @return feed
     */
    public FeedIndexLogsFeedDTO getFeed() {
        return feed;
    }

    public void setFeed(FeedIndexLogsFeedDTO feed) {
        this.feed = feed;
    }

    /**
     * Список отчетов по индексации прайс-листа.
     * @return indexLogRecords
     */
    public List<@Valid FeedIndexLogsRecordDTO> getIndexLogRecords() {
        return indexLogRecords;
    }

    public void setIndexLogRecords(List<@Valid FeedIndexLogsRecordDTO> indexLogRecords) {
        this.indexLogRecords = indexLogRecords;
    }

    /**
     * Количество отчетов на всех страницах выходных данных.
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedIndexLogsResultDTO {\n");
        
        sb.append("    feed: ").append(toIndentedString(feed)).append("\n");
        sb.append("    indexLogRecords: ").append(toIndentedString(indexLogRecords)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

