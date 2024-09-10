package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum FeedIndexLogsErrorType {
  DOWNLOAD_ERROR,
  DOWNLOAD_HTTP_ERROR,
  PARSE_ERROR,
  PARSE_XML_ERROR,
  TOO_MANY_REJECTED_OFFERS,
  NOT_INDEXED;
}
