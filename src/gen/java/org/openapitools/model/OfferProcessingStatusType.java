package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OfferProcessingStatusType {
    UNKNOWN, READY, IN_WORK, NEED_INFO, NEED_MAPPING, NEED_CONTENT, CONTENT_PROCESSING, SUSPENDED, REJECTED, REVIEW, CREATE_ERROR, UPDATE_ERROR
}
